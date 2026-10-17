package bmm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.q0;
import mmm.r0;
import mmm.s0;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import ulm.h1;
import ulm.j1;
import ulm.u0;
import ulm.x0;

/* JADX INFO: loaded from: classes13.dex */
public final class w implements zlm.f {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f16978g = vlm.j.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f16979h = vlm.j.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ylm.s f16980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zlm.h f16981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f16982c;
    public volatile e0 d;
    public final h1 e;
    public volatile boolean f;

    public w(OkHttpClient client, ylm.s carrier, zlm.h chain, u http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f16980a = carrier;
        this.f16981b = chain;
        this.f16982c = http2Connection;
        List list = client.f226065s;
        h1 h1Var = h1.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(h1Var) ? h1Var : h1.HTTP_2;
    }

    @Override // zlm.f
    public final void a() {
        this.f16982c.f16976x.flush();
    }

    @Override // zlm.f
    public final void b() {
        e0 e0Var = this.d;
        Intrinsics.h(e0Var);
        e0Var.i.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // zlm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response.a c(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bmm.w.c(boolean):okhttp3.Response$a");
    }

    @Override // zlm.f
    public final void cancel() {
        this.f = true;
        e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.e(b.CANCEL);
        }
    }

    @Override // zlm.f
    public final s0 d(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        e0 e0Var = this.d;
        Intrinsics.h(e0Var);
        return e0Var.f16908h;
    }

    @Override // zlm.f
    public final q0 e(j1 request, long j2) {
        Intrinsics.checkNotNullParameter(request, "request");
        e0 e0Var = this.d;
        Intrinsics.h(e0Var);
        return e0Var.i;
    }

    @Override // zlm.f
    public final r0 f() {
        e0 e0Var = this.d;
        Intrinsics.h(e0Var);
        return e0Var;
    }

    @Override // zlm.f
    public final long g(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (zlm.g.a(response)) {
            return vlm.j.h(response);
        }
        return 0L;
    }

    @Override // zlm.f
    public final void h(j1 request) throws IOException {
        int i;
        e0 e0Var;
        boolean z;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.d != null) {
            return;
        }
        boolean z3 = request.d != null;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        u0 u0Var = request.f281097c;
        ArrayList requestHeaders = new ArrayList(u0Var.size() + 4);
        requestHeaders.add(new e(e.f, request.f281096b));
        mmm.m mVar = e.f16899g;
        x0 url2 = request.f281095a;
        Intrinsics.checkNotNullParameter(url2, "url");
        String strB = url2.b();
        String strD = url2.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        requestHeaders.add(new e(mVar, strB));
        String strA = request.a("Host");
        if (strA != null) {
            requestHeaders.add(new e(e.i, strA));
        }
        requestHeaders.add(new e(e.f16900h, url2.f281163a));
        int size = u0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strL = ue8.c.l(u0Var, i2);
            Locale locale = Locale.US;
            String strR = p.a.r(locale, "US", strL, locale, "toLowerCase(...)");
            if (!f16978g.contains(strR) || (Intrinsics.f(strR, "te") && ue8.c.q(u0Var, i2).equals("trailers"))) {
                requestHeaders.add(new e(strR, ue8.c.q(u0Var, i2)));
            }
        }
        u uVar = this.f16982c;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z4 = !z3;
        synchronized (uVar.f16976x) {
            synchronized (uVar) {
                try {
                    if (uVar.e > 1073741823) {
                        uVar.h(b.REFUSED_STREAM);
                    }
                    if (uVar.f) {
                        throw new ConnectionShutdownException();
                    }
                    i = uVar.e;
                    uVar.e = i + 2;
                    e0Var = new e0(i, uVar, z4, false, null);
                    z = !z3 || uVar.u >= uVar.v || e0Var.d >= e0Var.e;
                    if (e0Var.i()) {
                        uVar.f16962b.put(Integer.valueOf(i), e0Var);
                    }
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            uVar.f16976x.h(requestHeaders, i, z4);
        }
        if (z) {
            uVar.f16976x.flush();
        }
        this.d = e0Var;
        if (this.f) {
            e0 e0Var2 = this.d;
            Intrinsics.h(e0Var2);
            e0Var2.e(b.CANCEL);
            throw new IOException("Canceled");
        }
        e0 e0Var3 = this.d;
        Intrinsics.h(e0Var3);
        d0 d0Var = e0Var3.f16909j;
        long j2 = this.f16981b.f323311g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d0Var.g(j2, timeUnit);
        e0 e0Var4 = this.d;
        Intrinsics.h(e0Var4);
        e0Var4.k.g(this.f16981b.f323312h, timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // zlm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            r5 = this;
            bmm.e0 r0 = r5.d
            r1 = 0
            if (r0 == 0) goto L21
            monitor-enter(r0)
            bmm.c0 r2 = r0.f16908h     // Catch: java.lang.Throwable -> L17
            boolean r3 = r2.f16896b     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 == 0) goto L19
            mmm.h r2 = r2.d     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.J()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2 = r4
            goto L1a
        L17:
            r1 = move-exception
            goto L1f
        L19:
            r2 = r1
        L1a:
            monitor-exit(r0)
            if (r2 != r4) goto L1e
            return r4
        L1e:
            return r1
        L1f:
            monitor-exit(r0)
            throw r1
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bmm.w.i():boolean");
    }

    @Override // zlm.f
    public final zlm.d j() {
        return this.f16980a;
    }
}
