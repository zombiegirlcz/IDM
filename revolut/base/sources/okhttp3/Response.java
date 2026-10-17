package okhttp3;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import mmm.l0;
import ulm.b1;
import ulm.h1;
import ulm.j1;
import ulm.m;
import ulm.n;
import ulm.r0;
import ulm.r1;
import ulm.s0;
import ulm.s1;
import ulm.u0;
import ulm.x1;
import vlm.f;
import ylm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class Response implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f226087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f226088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f226089c;
    public final int d;
    public final r0 e;
    public final u0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ResponseBody f226090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mmm.r0 f226091h;
    public final Response i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Response f226092j;
    public final Response k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f226093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f226094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f226095n;
    public final x1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n f226096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f226097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f226098r;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j1 f226099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h1 f226100b;
        public String d;
        public r0 e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public mmm.r0 f226103h;
        public Response i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Response f226104j;
        public Response k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f226105l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f226106m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public j f226107n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f226101c = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ResponseBody f226102g = ResponseBody.EMPTY;
        public x1 o = x1.I1;
        public s0 f = new s0();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.i != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (response.f226092j != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (response.k != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final Response a() {
            int i = this.f226101c;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.f226101c).toString());
            }
            j1 j1Var = this.f226099a;
            if (j1Var == null) {
                throw new IllegalStateException("request == null");
            }
            h1 h1Var = this.f226100b;
            if (h1Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.d;
            if (str == null) {
                throw new IllegalStateException("message == null");
            }
            r0 r0Var = this.e;
            s0 s0Var = this.f;
            s0Var.getClass();
            return new Response(j1Var, h1Var, str, i, r0Var, ue8.c.e(s0Var), this.f226102g, this.f226103h, this.i, this.f226104j, this.k, this.f226105l, this.f226106m, this.f226107n, this.o);
        }

        public final void c(u0 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            headers.getClass();
            this.f = ue8.c.m(headers);
        }

        public final void d(h1 protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f226100b = protocol;
        }
    }

    public Response(j1 request, h1 protocol, String message, int i, r0 r0Var, u0 headers, ResponseBody body, mmm.r0 r0Var2, Response response, Response response2, Response response3, long j2, long j3, j jVar, x1 trailersSource) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(trailersSource, "trailersSource");
        this.f226087a = request;
        this.f226088b = protocol;
        this.f226089c = message;
        this.d = i;
        this.e = r0Var;
        this.f = headers;
        this.f226090g = body;
        this.f226091h = r0Var2;
        this.i = response;
        this.f226092j = response2;
        this.k = response3;
        this.f226093l = j2;
        this.f226094m = j3;
        this.f226095n = jVar;
        this.o = trailersSource;
        boolean z = true;
        this.f226097q = 200 <= i && i < 300;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    z = false;
                    break;
            }
        }
        this.f226098r = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f226090g.close();
    }

    public final n d() {
        n nVar = this.f226096p;
        if (nVar != null) {
            return nVar;
        }
        m mVar = n.Companion;
        mVar.getClass();
        u0 headers = this.f;
        Intrinsics.checkNotNullParameter(headers, "headers");
        n nVarD = f.d(mVar, headers);
        this.f226096p = nVarD;
        return nVarD;
    }

    public final String f(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = this.f.a(name);
        return strA == null ? str : strA;
    }

    public final a g() {
        Intrinsics.checkNotNullParameter(this, "response");
        a aVar = new a();
        aVar.f226101c = -1;
        aVar.f226102g = ResponseBody.EMPTY;
        aVar.o = x1.I1;
        aVar.f226099a = this.f226087a;
        aVar.f226100b = this.f226088b;
        aVar.f226101c = this.d;
        aVar.d = this.f226089c;
        aVar.e = this.e;
        aVar.f = ue8.c.m(this.f);
        aVar.f226102g = this.f226090g;
        aVar.f226103h = this.f226091h;
        aVar.i = this.i;
        aVar.f226104j = this.f226092j;
        aVar.k = this.k;
        aVar.f226105l = this.f226093l;
        aVar.f226106m = this.f226094m;
        aVar.f226107n = this.f226095n;
        aVar.o = this.o;
        return aVar;
    }

    public final r1 h(long j2) throws EOFException {
        ResponseBody responseBody = this.f226090g;
        l0 source = responseBody.source().peek();
        h hVar = new h();
        source.a(j2);
        long jMin = Math.min(j2, source.f207283b.f207266b);
        Intrinsics.checkNotNullParameter(source, "source");
        while (jMin > 0) {
            long j3 = source.read(hVar, jMin);
            if (j3 == -1) {
                throw new EOFException();
            }
            jMin -= j3;
        }
        s1 s1Var = ResponseBody.Companion;
        b1 b1VarContentType = responseBody.contentType();
        long j5 = hVar.f207266b;
        s1Var.getClass();
        return s1.b(hVar, b1VarContentType, j5);
    }

    public final String toString() {
        return "Response{protocol=" + this.f226088b + ", code=" + this.d + ", message=" + this.f226089c + ", url=" + this.f226087a.f281095a + CoreConstants.CURLY_RIGHT;
    }
}
