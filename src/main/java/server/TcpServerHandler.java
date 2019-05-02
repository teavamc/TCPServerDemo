package server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName TcpServerHandler
 * @date 2019/5/2 13:21
 **/
public class TcpServerHandler extends SimpleChannelInboundHandler<Object> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("SERVER接收到消息:" + msg);
        ctx.channel().writeAndFlush("server accepted msg:" + msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("exceptionCaught!cause:" + cause.toString());
        ctx.close();
    }


}
