package mmk;

import cli.j;
import cli.n;
import cli.o;
import ip0.nb0;
import ip0.pb0;
import ip0.qv;
import ip0.rv;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements n {
    public static aim.e a() {
        aim.e eVarB = u.b();
        eVarB.addAll(u.c(new rv("plan_header", qv.GREY, 60)));
        nb0 nb0Var = pb0.Companion;
        eVarB.addAll(v.k(nb0.a(nb0Var, "highlighted_benefit_0", false, 6), nb0.a(nb0Var, "highlighted_benefit_1", false, 6), nb0.a(nb0Var, "highlighted_benefit_2", false, 6), nb0.a(nb0Var, "highlighted_benefit_3", false, 6)));
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c(a());
    }
}
