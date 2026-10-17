package gcm;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public interface f0 extends Closeable {
    i0 E5(SocketAddress socketAddress, e0 e0Var, f2 f2Var);

    ScheduledExecutorService getScheduledExecutorService();
}
