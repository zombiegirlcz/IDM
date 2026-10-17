package kkl;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import yhm.j;
import zlm.h;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f185135a = j.b(new af0.a(27));

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        od0.a aVar = od0.a.f224253a;
        if (!od0.a.e()) {
            return hVar.b(j1Var);
        }
        i1 i1VarB = j1Var.b();
        i1VarB.a("X-Forwarded-For", (String) this.f185135a.getValue());
        return hVar.b(new j1(i1VarB));
    }
}
