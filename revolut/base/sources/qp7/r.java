package qp7;

import kl7.d2;
import kl7.f1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements jki.p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aim.o b(d2 d2Var) {
        aim.o oVar = new aim.o();
        oVar.add("CONDITION_GENERAL");
        if (d2Var.d) {
            oVar.add("CONDITION_SMART_DRIVING");
        }
        if (d2Var.e.f75272a != f1.ANNUAL) {
            oVar.add("CONDITION_MONTHLY_PAYMENT");
        }
        return y0.a(oVar);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f248304a, new qnd.c(27), new qjj.g(19), new qbg.j(this, domainState, 11));
    }
}
