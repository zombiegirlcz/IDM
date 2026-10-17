package k23;

import a9j.m;
import dqd.w;
import e93.o;
import h93.j0;
import h93.l0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.y;
import wkm.l;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy2.f f180310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f180311b;

    public b(hy2.f cardDesignInteractor, f sharedDataSource) {
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(sharedDataSource, "sharedDataSource");
        this.f180310a = cardDesignInteractor;
        this.f180311b = sharedDataSource;
    }

    public static final t38.e a(b bVar, String str, j0 j0Var, l0 l0Var, String str2, String str3, boolean z) {
        int i;
        boolean z3;
        hy2.f fVar = bVar.f180310a;
        o entryPoint = o.DEFAULT;
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        l0 l0Var2 = l0.CREDIT;
        boolean z4 = l0Var == l0Var2;
        j0 j0Var2 = j0.PRO;
        vkm.d dVarB = rd0.e.b(hy2.f.k(fVar, str, z4, j0Var == j0Var2, j0Var, l0Var, null, null, null, str2, str3, null, true, false, entryPoint, null, 96));
        Continuation continuation = null;
        y yVar = new y(new g2d.c(2, 21, continuation), new y(mo3.a.g(dVarB, null, null, 3), new i23.c(3, 10, continuation)));
        boolean z6 = l0Var == l0Var2;
        if (j0Var == j0Var2) {
            i = 3;
            z3 = true;
        } else {
            i = 3;
            z3 = false;
        }
        Continuation continuation2 = null;
        return new t38.e(yVar, 24, new y(new g2d.c(2, 22, continuation2), new y(mo3.a.g(rd0.e.b(hy2.f.m(fVar, str, z6, z3, l0Var == l0.INSTALMENT, l0Var == l0.CRYPTO, j0Var, l0Var, null, null, z, true, str3, null, null, 384)), null, null, i), new i23.c(i, 11, continuation2))), new w(i, 2, continuation2));
    }

    public final l b(a params, String str, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        return q.Q((Flow) this.f180311b.f.getValue(), new g9d.f((Continuation) null, this, params, str, z));
    }

    public final l c(Flow paramsFlow, String str, boolean z) {
        Intrinsics.checkNotNullParameter(paramsFlow, "paramsFlow");
        Continuation continuation = null;
        return q.Q(new t38.e((Flow) this.f180311b.f.getValue(), 24, paramsFlow, new hwi.b(3, 17, continuation)), new m(continuation, this, str, z, 3));
    }
}
