package gxh;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import zlm.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements gxh.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        i1 i1VarB = hVar.e.b();
        i1VarB.a("Accept", "application/json");
        return hVar.b(new j1(i1VarB));
    }
}
