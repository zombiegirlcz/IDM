package emm;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import fmm.k;
import fmm.n;
import fmm.p;
import fmm.q;
import fmm.s;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends h implements f {

    @NotNull
    public static final c Companion = new c();
    public static final boolean e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f127696c;
    public final ArrayList d;

    static {
        h.Companion.getClass();
        e = Build.VERSION.SDK_INT < 29;
    }

    public e() {
        s sVar;
        s.Companion.getClass();
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        try {
            Class<?> sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> sslSocketFactoryClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            sVar = new s(sslSocketClass);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = fmm.e.f136486a;
            String name = OkHttpClient.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            fmm.e.a(5, name, "unable to load android socket classes", e2);
            sVar = null;
        }
        fmm.h.Companion.getClass();
        p pVar = new p(fmm.h.e);
        n.Companion.getClass();
        p pVar2 = new p(n.f136494a);
        k.Companion.getClass();
        q[] elements = {sVar, pVar, pVar2, new p(k.f136492a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            if (((q) obj2).isSupported()) {
                arrayList.add(obj2);
            }
        }
        this.d = arrayList;
    }

    @Override // emm.f
    public final Context a() {
        return this.f127696c;
    }

    @Override // emm.f
    public final void b(Context context) {
        this.f127696c = context;
    }

    @Override // emm.h
    public final imm.e c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        fmm.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        fmm.d dVar = x509TrustManagerExtensions != null ? new fmm.d(trustManager, x509TrustManagerExtensions) : null;
        return dVar != null ? dVar : super.c(trustManager);
    }

    @Override // emm.h
    public final imm.g d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new d(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // emm.h
    public final void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it8 = this.d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((q) next).a(sslSocket)) {
                    break;
                }
            }
        }
        q qVar = (q) next;
        if (qVar != null) {
            qVar.c(sslSocket, str, protocols);
        }
    }

    @Override // emm.h
    public final void f(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    @Override // emm.h
    public final String g(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it8 = this.d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((q) next).a(sslSocket)) {
                break;
            }
        }
        q qVar = (q) next;
        if (qVar != null) {
            return qVar.b(sslSocket);
        }
        return null;
    }

    @Override // emm.h
    public final boolean i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // emm.h
    public final void j(int i, String message, Throwable th10) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i == 5) {
        }
    }

    @Override // emm.h
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
