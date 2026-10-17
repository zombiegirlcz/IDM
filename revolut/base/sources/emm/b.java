package emm;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import fmm.k;
import fmm.n;
import fmm.p;
import fmm.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends h implements f {

    @NotNull
    public static final a Companion = new a();
    public static final boolean e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f127693c;
    public final ArrayList d;

    static {
        h.Companion.getClass();
        e = Build.VERSION.SDK_INT >= 29;
    }

    public b() {
        fmm.b.Companion.getClass();
        h.Companion.getClass();
        fmm.b bVar = Build.VERSION.SDK_INT >= 29 ? new fmm.b() : null;
        fmm.h.Companion.getClass();
        p pVar = new p(fmm.h.e);
        n.Companion.getClass();
        p pVar2 = new p(n.f136494a);
        k.Companion.getClass();
        q[] elements = {bVar, pVar, pVar2, new p(k.f136492a)};
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
        return this.f127693c;
    }

    @Override // emm.f
    public final void b(Context context) {
        this.f127693c = context;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(trustManager);
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
    public final Object h() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuardI = com.google.android.material.color.a.i();
        closeGuardI.open("response.body().close()");
        return closeGuardI;
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
            e.Companion.getClass();
            c.a();
        } else {
            e.Companion.getClass();
            c.a();
        }
    }

    @Override // emm.h
    public final void k(Object obj2, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj2, message);
        } else {
            Intrinsics.i(obj2, "null cannot be cast to non-null type android.util.CloseGuard");
            com.google.android.material.color.a.j(obj2).warnIfOpen();
        }
    }

    @Override // emm.h
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
