package ek0;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Interceptor {

    @NotNull
    private static final C0733a Companion = new C0733a();

    /* JADX INFO: renamed from: ek0.a$a, reason: collision with other inner class name */
    public static final class C0733a {
        private C0733a() {
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        j21.c cVar = (j21.c) j1Var.c(j21.c.class);
        RequestBody requestBody = j1Var.d;
        if (cVar == null || requestBody == null || !Intrinsics.f(j1Var.f281096b, "POST")) {
            return hVar.b(j1Var);
        }
        i1 i1VarB = j1Var.b();
        c body = new c(requestBody, cVar);
        Intrinsics.checkNotNullParameter(body, "body");
        i1VarB.c("POST", body);
        return hVar.b(new j1(i1VarB));
    }
}
