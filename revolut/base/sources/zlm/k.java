package zlm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import ulm.j1;
import ylm.a0;
import ylm.q;
import ylm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements Interceptor {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f323314a;

    public k(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f323314a = client;
    }

    public static int c(Response response, int i) {
        String strF = response.f("Retry-After", null);
        if (strF == null) {
            return i;
        }
        if (!ch.qos.logback.core.util.a.x("\\d+", strF)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strF);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ulm.j1 a(okhttp3.Response r13, ylm.j r14) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zlm.k.a(okhttp3.Response, ylm.j):ulm.j1");
    }

    public final boolean b(IOException iOException, q qVar, j1 j1Var) {
        RequestBody requestBody;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!this.f323314a.e) {
            return false;
        }
        if ((!z && (((requestBody = j1Var.d) != null && requestBody.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        ylm.j jVar = qVar.f314791s;
        if (jVar == null || !jVar.f) {
            return false;
        }
        ylm.k kVar = qVar.i;
        Intrinsics.h(kVar);
        a0 a0VarB = kVar.b();
        ylm.j jVar2 = qVar.f314791s;
        return ((v) a0VarB).b(jVar2 != null ? jVar2.c() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010e, code lost:
    
        if (r3 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
    
        if (r3.e == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        if (r15.k != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
    
        r15.k = true;
        r15.f.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012f, code lost:
    
        r15.e.followUpDecision(r15, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
    
        r15.e(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0139, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013b, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d0, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [ulm.t] */
    /* JADX WARN: Type inference failed for: r29v2 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(ulm.y0 r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zlm.k.intercept(ulm.y0):okhttp3.Response");
    }
}
