package ulm;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes13.dex */
public class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f281089a;
    public RequestBody d;
    public uc0.b e = vlm.a.f290502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f281090b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0 f281091c = new s0();

    public final void a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f281091c.a(name, value);
    }

    public final void b(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        s0 s0Var = this.f281091c;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ue8.c.o(s0Var, name, value);
    }

    public final void c(String method, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (requestBody == null) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT")) {
                throw new IllegalArgumentException(p.a.p("method ", method, " must have a request body.").toString());
            }
        } else if (!nim.a.B(method)) {
            throw new IllegalArgumentException(p.a.p("method ", method, " must not have a request body.").toString());
        }
        this.f281090b = method;
        this.d = requestBody;
    }

    public final void d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        s0 s0Var = this.f281091c;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        ue8.c.n(s0Var, name);
    }

    public final void e(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        w0 w0Var = x0.Companion;
        if (kotlin.text.a0.H(url2, "ws:", true)) {
            StringBuilder sb6 = new StringBuilder("http:");
            String strSubstring = url2.substring(3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb6.append(strSubstring);
            url2 = sb6.toString();
        } else if (kotlin.text.a0.H(url2, "wss:", true)) {
            StringBuilder sb9 = new StringBuilder("https:");
            String strSubstring2 = url2.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb9.append(strSubstring2);
            url2 = sb9.toString();
        }
        w0Var.getClass();
        x0 url3 = w0.c(url2);
        Intrinsics.checkNotNullParameter(url3, "url");
        this.f281089a = url3;
    }
}
