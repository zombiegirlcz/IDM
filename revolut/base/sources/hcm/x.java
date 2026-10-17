package hcm;

import com.google.common.base.Preconditions;
import gcm.p1;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f151334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f151335c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.grpc.okhttp.internal.l f151336a;

    static {
        x xVar;
        Logger logger = Logger.getLogger(x.class.getName());
        f151334b = logger;
        io.grpc.okhttp.internal.l lVar = io.grpc.okhttp.internal.l.d;
        ClassLoader classLoader = x.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                xVar = new x(lVar);
            }
        }
        xVar = new w(lVar);
        f151335c = xVar;
    }

    public x(io.grpc.okhttp.internal.l lVar) {
        this.f151336a = (io.grpc.okhttp.internal.l) Preconditions.checkNotNull(lVar, "platform");
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            Preconditions.checkArgument(p1.a(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f151336a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f151336a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        io.grpc.okhttp.internal.l lVar = this.f151336a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strB = b(sSLSocket);
            if (strB != null) {
                return strB;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            lVar.a(sSLSocket);
        }
    }
}
