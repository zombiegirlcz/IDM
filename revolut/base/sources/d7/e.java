package d7;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements d0 {
    @Override // d7.d0
    public final void onResult(Object obj2) {
        Throwable th10 = (Throwable) obj2;
        int i = LottieAnimationView.f25583r;
        Matrix matrix = r7.l.f251966a;
        if (!(th10 instanceof SocketException) && !(th10 instanceof ClosedChannelException) && !(th10 instanceof InterruptedIOException) && !(th10 instanceof ProtocolException) && !(th10 instanceof SSLException) && !(th10 instanceof UnknownHostException) && !(th10 instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th10);
        }
        r7.c.c("Unable to load composition.", th10);
    }
}
