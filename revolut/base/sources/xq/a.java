package xq;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements Interceptor {

    @NotNull
    private static final C1706a Companion = new C1706a();

    /* JADX INFO: renamed from: xq.a$a, reason: collision with other inner class name */
    public static final class C1706a {
        private C1706a() {
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        String strA = j1Var.a("X-Verification-Token");
        if (strA == null || d0.W(strA)) {
            return hVar.b(j1Var);
        }
        i1 i1VarB = j1Var.b();
        i1VarB.b("Authorization", "Bearer ".concat(strA));
        return hVar.b(new j1(i1VarB));
    }
}
