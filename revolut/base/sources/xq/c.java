package xq;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.v0;
import ulm.w0;
import ulm.x0;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements Interceptor {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx0.a f308023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mq.a f308024b;

    public c(jx0.a jwtDecoder, mq.a visionConfiguration) {
        Intrinsics.checkNotNullParameter(jwtDecoder, "jwtDecoder");
        Intrinsics.checkNotNullParameter(visionConfiguration, "visionConfiguration");
        this.f308023a = jwtDecoder;
        this.f308024b = visionConfiguration;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        String str;
        String string;
        x0 x0VarD;
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        String strA = j1Var.a("X-Verification-Token");
        x0 x0Var = j1Var.f281095a;
        if (strA == null || d0.W(strA)) {
            return hVar.b(j1Var);
        }
        w0 w0Var = x0.Companion;
        String hostUrl = this.f308024b.getHostUrl();
        w0Var.getClass();
        x0 x0VarD2 = w0.d(hostUrl);
        if (x0VarD2 == null || !Intrinsics.f(x0Var.f281163a, x0VarD2.f281163a) || !Intrinsics.f(x0Var.d, x0VarD2.d)) {
            return hVar.b(j1Var);
        }
        rr.a aVarJ = this.f308023a.j(strA);
        if (aVarJ != null && (str = aVarJ.f256600a.f256607c) != null) {
            if (d0.W(str)) {
                str = null;
            }
            if (str != null && (string = d0.F0(str).toString()) != null && (x0VarD = w0.d(string)) != null) {
                if (x0VarD.equals(x0VarD2)) {
                    return hVar.b(j1Var);
                }
                v0 v0VarG = x0Var.g();
                v0VarG.h(x0VarD.f281163a);
                v0VarG.c(x0VarD.d);
                x0 url2 = v0VarG.b();
                i1 i1VarB = j1Var.b();
                Intrinsics.checkNotNullParameter(url2, "url");
                i1VarB.f281089a = url2;
                return hVar.b(new j1(i1VarB));
            }
        }
        return hVar.b(j1Var);
    }
}
