package nmm;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends mmm.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Socket f217411n;

    public k(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f217411n = socket;
    }

    @Override // mmm.f
    public final void l() {
        Socket socket = this.f217411n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!n.a(e)) {
                throw e;
            }
            n.f217428a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            n.f217428a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException m(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
