package amm;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import mmm.k0;
import mmm.l0;
import mmm.q0;
import mmm.r0;
import mmm.v0;
import mmm.w;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.j1;
import ulm.s0;
import ulm.t0;
import ulm.u0;
import ulm.x0;
import zlm.l;
import zlm.m;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public final class j implements zlm.f {

    @NotNull
    public static final f Companion = new f();
    public static final u0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f6499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zlm.d f6500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v60.g f6501c;
    public int d;
    public final b e;

    static {
        u0.Companion.getClass();
        f = t0.a("OkHttp-Response-Body", "Truncated");
    }

    public j(OkHttpClient okHttpClient, zlm.d carrier, v60.g socket) {
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f6499a = okHttpClient;
        this.f6500b = carrier;
        this.f6501c = socket;
        this.e = new b((l0) socket.f286252c);
    }

    public static final void k(j jVar, w wVar) {
        v0 v0Var = wVar.e;
        mmm.t0 delegate = v0.d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        wVar.e = delegate;
        v0Var.a();
        v0Var.b();
    }

    @Override // zlm.f
    public final void a() {
        ((k0) this.f6501c.d).flush();
    }

    @Override // zlm.f
    public final void b() {
        ((k0) this.f6501c.d).flush();
    }

    @Override // zlm.f
    public final Response.a c(boolean z) throws IOException {
        b bVar = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        try {
            l lVar = m.Companion;
            String strE = bVar.f6487a.e(bVar.f6488b);
            bVar.f6488b -= (long) strE.length();
            lVar.getClass();
            m mVarA = l.a(strE);
            int i2 = mVarA.f323316b;
            Response.a aVar = new Response.a();
            aVar.d(mVarA.f323315a);
            aVar.f226101c = i2;
            String message = mVarA.f323317c;
            Intrinsics.checkNotNullParameter(message, "message");
            aVar.d = message;
            s0 s0Var = new s0();
            while (true) {
                String strE2 = bVar.f6487a.e(bVar.f6488b);
                bVar.f6488b -= (long) strE2.length();
                if (strE2.length() == 0) {
                    break;
                }
                s0Var.b(strE2);
            }
            aVar.c(ue8.c.e(s0Var));
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return aVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return aVar;
            }
            this.d = 3;
            return aVar;
        } catch (EOFException e) {
            throw new IOException(j6.a.q("unexpected end of stream on ", this.f6500b.e().f281138a.f281058h.i()), e);
        }
    }

    @Override // zlm.f
    public final void cancel() {
        this.f6500b.cancel();
    }

    @Override // zlm.f
    public final mmm.s0 d(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        boolean zA = zlm.g.a(response);
        j1 j1Var = response.f226087a;
        if (!zA) {
            return l(j1Var.f281095a, 0L);
        }
        if ("chunked".equalsIgnoreCase(response.f("Transfer-Encoding", null))) {
            x0 x0Var = j1Var.f281095a;
            if (this.d == 4) {
                this.d = 5;
                return new e(this, x0Var);
            }
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        long jH = vlm.j.h(response);
        if (jH != -1) {
            return l(j1Var.f281095a, jH);
        }
        x0 url2 = j1Var.f281095a;
        if (this.d != 4) {
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        this.d = 5;
        this.f6500b.b();
        Intrinsics.checkNotNullParameter(url2, "url");
        return new i(this, url2);
    }

    @Override // zlm.f
    public final q0 e(j1 request, long j2) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestBody requestBody = request.d;
        if (requestBody != null && requestBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new d(this);
            }
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.d == 1) {
            this.d = 2;
            return new h(this);
        }
        throw new IllegalStateException(("state: " + this.d).toString());
    }

    @Override // zlm.f
    public final r0 f() {
        return this.f6501c;
    }

    @Override // zlm.f
    public final long g(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!zlm.g.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(response.f("Transfer-Encoding", null))) {
            return -1L;
        }
        return vlm.j.h(response);
    }

    @Override // zlm.f
    public final void h(j1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f6500b.e().f281139b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "type(...)");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(request.f281096b);
        sb6.append(p.SPACE_CHAR);
        x0 url2 = request.f281095a;
        if (url2.f() || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url2, "url");
            String strB = url2.b();
            String strD = url2.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb6.append(strB);
        } else {
            sb6.append(url2);
        }
        sb6.append(" HTTP/1.1");
        m(request.f281097c, sb6.toString());
    }

    @Override // zlm.f
    public final boolean i() {
        return this.d == 6;
    }

    @Override // zlm.f
    public final zlm.d j() {
        return this.f6500b;
    }

    public final g l(x0 x0Var, long j2) {
        if (this.d == 4) {
            this.d = 5;
            return new g(this, x0Var, j2);
        }
        throw new IllegalStateException(("state: " + this.d).toString());
    }

    public final void m(u0 headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.d != 0) {
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        v60.g gVar = this.f6501c;
        k0 k0Var = (k0) gVar.d;
        k0 k0Var2 = (k0) gVar.d;
        k0Var.p0(requestLine);
        k0Var.p0("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            k0Var2.p0(ue8.c.l(headers, i));
            k0Var2.p0(": ");
            k0Var2.p0(ue8.c.q(headers, i));
            k0Var2.p0("\r\n");
        }
        k0Var2.p0("\r\n");
        this.d = 1;
    }
}
