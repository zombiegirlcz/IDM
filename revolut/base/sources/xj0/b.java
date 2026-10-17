package xj0;

import java.nio.charset.Charset;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import okhttp3.Interceptor;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.b1;
import ulm.j1;
import ulm.u0;
import ulm.x0;
import ulm.y0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Interceptor {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f306436c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f306437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lmm.d f306438b;

    public static final class a {
        private a() {
        }
    }

    public b() {
        this(null, 7);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        String str;
        Charset charsetA;
        u0 u0Var;
        b bVar = this;
        lmm.d dVar = bVar.f306438b;
        Intrinsics.checkNotNullParameter(chain, "chain");
        zlm.h hVar = (zlm.h) chain;
        j1 j1Var = hVar.e;
        try {
            String str2 = j1Var.f281096b;
            x0 x0Var = j1Var.f281095a;
            String str3 = "curl -X " + str2;
            u0 u0Var2 = j1Var.f281097c;
            int size = u0Var2.size();
            int i = 0;
            boolean z = false;
            boolean z3 = false;
            while (i < size) {
                String strL = ue8.c.l(u0Var2, i);
                String strQ = ue8.c.q(u0Var2, i);
                if (strQ.length() == 0) {
                    u0Var = u0Var2;
                } else {
                    if (bVar.f306437a.contains(strL)) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int length = strQ.length() - 1;
                    u0Var = u0Var2;
                    if (strQ.charAt(0) == '\"' && strQ.charAt(length) == '\"') {
                        String strSubstring = strQ.substring(1, length);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        strQ = "\\\"" + strSubstring + "\\\"";
                    }
                    if ("Accept-Encoding".equalsIgnoreCase(strL) && "gzip".equalsIgnoreCase(strQ)) {
                        z3 = true;
                    }
                    if ("Content-Type".equalsIgnoreCase(strL) && a0.H(strQ, "multipart/form-data", true)) {
                        z = true;
                    }
                    str3 = ((Object) str3) + " -H \"" + strL + ": " + strQ + "\"";
                }
                i++;
                bVar = this;
                u0Var2 = u0Var;
            }
            RequestBody requestBody = j1Var.d;
            if (requestBody != null) {
                if (z) {
                    str = " --data 'Content-Length: " + requestBody.contentLength() + " Multipart request body omitted'";
                } else {
                    mmm.h hVar2 = new mmm.h();
                    requestBody.writeTo(hVar2);
                    b1 b1VarContentType = requestBody.contentType();
                    Charset charset = f306436c;
                    if (b1VarContentType != null && (charsetA = b1VarContentType.a(charset)) != null) {
                        charset = charsetA;
                    }
                    Intrinsics.h(charset);
                    str = " --data $'" + a0.D(hVar2.m4(charset), "\n", "\\n", false) + "'";
                }
                str3 = ((Object) str3) + str;
            }
            String str4 = ((Object) str3) + (z3 ? " --compressed " : " ") + "\"" + x0Var + "\"";
            dVar.log("╭--- cURL (" + x0Var + ")");
            dVar.log(str4);
            dVar.log("╰--- (copy and paste the above line to a terminal)");
        } catch (Exception unused) {
        }
        return hVar.b(j1Var);
    }

    public b(a0.b bVar, int i) {
        h0 protectedHeaders = h0.f322473a;
        lmm.d logger = bVar;
        logger = (i & 4) != 0 ? lmm.d.w1 : logger;
        Intrinsics.checkNotNullParameter(protectedHeaders, "protectedHeaders");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f306437a = protectedHeaders;
        this.f306438b = logger;
        protectedHeaders.isEmpty();
    }
}
