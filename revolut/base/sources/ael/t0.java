package ael;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 implements ybl.l {

    @NotNull
    public static final s0 Companion = new s0();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdl.h1 f3659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4f.s f3660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.c f3661c;

    static {
        ybl.p[] elements = {ybl.p.TRADING, ybl.p.ROBO};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public t0(vdl.h1 tradingConfigRepository, d4f.s wealthFeaturesInteractor, zjh.c userIdentityInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigRepository, "tradingConfigRepository");
        Intrinsics.checkNotNullParameter(wealthFeaturesInteractor, "wealthFeaturesInteractor");
        Intrinsics.checkNotNullParameter(userIdentityInteractor, "userIdentityInteractor");
        this.f3659a = tradingConfigRepository;
        this.f3660b = wealthFeaturesInteractor;
        this.f3661c = userIdentityInteractor;
    }

    public final ufm.i e() {
        vdl.h1 h1Var = this.f3659a;
        efm.d0 d0VarFirstOrError = m70.a.g(h1Var.e.f(Unit.f186387a, (h1Var.b() || h1Var.b()) ? false : true), null, new v78.d(27), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        efm.d0 d0VarFirstOrError2 = m70.a.g(rd0.e.c(nim.a.v(((ang.f) this.f3661c.f322830b).j(w4l.h.f294642c), new d27.d0(22)), kotlin.coroutines.g.f186406a), null, new a9d.p(19), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "getCurrentRegisteredIdentityIdFlow(...)");
        ufm.i iVar = new ufm.i(te0.w.H0(d0VarFirstOrError, d0VarFirstOrError2), new aed.f(new aed.a(25), 8), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i f() {
        ufm.i iVar = new ufm.i(e(), new aed.f(new aed.a(29), 9), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i g() {
        ufm.i iVar = new ufm.i(e(), new aed.f(new aed.a(28), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.r h(String str, boolean z) {
        efm.r rVarC;
        vdl.h1 h1Var = this.f3659a;
        efm.r rVarF = h1Var.e.f(Unit.f186387a, z && !h1Var.b());
        if (str == null || (rVarC = zi0.c.j(str)) == null) {
            rVarC = rd0.e.c(nim.a.v(((ang.f) this.f3661c.f322830b).j(w4l.h.f294642c), new d27.d0(22)), kotlin.coroutines.g.f186406a);
        }
        return nim.a.w(kli.a.h(rVarF, rVarC), new r0(2));
    }
}
