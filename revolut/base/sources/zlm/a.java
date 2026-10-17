package zlm;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.x;
import okhttp3.Interceptor;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ulm.b1;
import ulm.c0;
import ulm.e0;
import ulm.i1;
import ulm.j1;
import ulm.s0;
import ulm.u0;
import ulm.x0;
import ulm.y0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f323302a;

    public a(e0 cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f323302a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) throws IOException {
        boolean z;
        ResponseBody responseBody;
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        i1 i1VarB = j1Var.b();
        x0 x0Var = j1Var.f281095a;
        RequestBody requestBody = j1Var.d;
        if (requestBody != null) {
            b1 b1VarContentType = requestBody.contentType();
            if (b1VarContentType != null) {
                i1VarB.b("Content-Type", b1VarContentType.f281065a);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                i1VarB.b("Content-Length", String.valueOf(jContentLength));
                i1VarB.d("Transfer-Encoding");
            } else {
                i1VarB.b("Transfer-Encoding", "chunked");
                i1VarB.d("Content-Length");
            }
        }
        if (j1Var.a("Host") == null) {
            i1VarB.b("Host", vlm.j.o(x0Var, false));
        }
        if (j1Var.a("Connection") == null) {
            i1VarB.b("Connection", "Keep-Alive");
        }
        int i = 0;
        if (j1Var.a("Accept-Encoding") == null && j1Var.a("Range") == null) {
            i1VarB.b("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        e0 e0Var = this.f323302a;
        List listF = e0Var.f(x0Var);
        if (!listF.isEmpty()) {
            StringBuilder sb6 = new StringBuilder();
            for (Object obj2 : listF) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                c0 c0Var = (c0) obj2;
                if (i > 0) {
                    sb6.append("; ");
                }
                sb6.append(c0Var.a());
                sb6.append('=');
                sb6.append(c0Var.b());
                i = i2;
            }
            i1VarB.b("Cookie", sb6.toString());
        }
        if (j1Var.a("User-Agent") == null) {
            i1VarB.b("User-Agent", "okhttp/5.3.2");
        }
        j1 request = new j1(i1VarB);
        Response responseB = hVar.b(request);
        u0 u0Var = responseB.f;
        g.b(e0Var, request.f281095a, u0Var);
        Response.a aVarG = responseB.g();
        Intrinsics.checkNotNullParameter(request, "request");
        aVarG.f226099a = request;
        if (z && "gzip".equalsIgnoreCase(responseB.f("Content-Encoding", null)) && g.a(responseB) && (responseBody = responseB.f226090g) != null) {
            x xVar = new x(responseBody.source());
            s0 s0VarM = ue8.c.m(u0Var);
            Intrinsics.checkNotNullParameter("Content-Encoding", "name");
            ue8.c.n(s0VarM, "Content-Encoding");
            Intrinsics.checkNotNullParameter("Content-Length", "name");
            ue8.c.n(s0VarM, "Content-Length");
            aVarG.c(ue8.c.e(s0VarM));
            i body = new i(responseB.f("Content-Type", null), -1L, u1.c(xVar));
            Intrinsics.checkNotNullParameter(body, "body");
            aVarG.f226102g = body;
        }
        return aVarG.a();
    }
}
