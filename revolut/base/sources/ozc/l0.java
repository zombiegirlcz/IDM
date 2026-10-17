package ozc;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f231293a;

    public l0(d presentationModel) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f231293a = presentationModel;
    }

    public final rfm.z a(Function0 fallBackStep) {
        Intrinsics.checkNotNullParameter(fallBackStep, "fallBackStep");
        t tVar = (t) this.f231293a;
        efm.r rVarZ3 = tVar.z3();
        od0.i.Companion.getClass();
        efm.d0 d0VarFirst = rVarZ3.first(od0.i.f224256b);
        p pVar = new p(20, new n(16));
        d0VarFirst.getClass();
        pfm.a aVar = new pfm.a(new rfm.j(d0VarFirst, pVar, 0), new p(21, new h0(this, 2)), 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        s0 s0Var = (s0) tVar.f231329b;
        efm.d0 d0VarC = te0.w.C(s0Var.f231324s.getValue(s0Var, s0.z[17]));
        p pVar2 = new p(22, new n(17));
        d0VarC.getClass();
        rfm.m mVar = new rfm.m(new rfm.j(d0VarC, pVar2, 0), new p(24, new h0(this, 3)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        rfm.z zVarM = new rfm.m(new rfm.e(mVar, aVar, 0), new p(23, new h0(this, 0)), 0).m(new rfm.d(new m1i.t(this, fallBackStep), 1));
        Intrinsics.checkNotNullExpressionValue(zVarM, "switchIfEmpty(...)");
        return zVarM;
    }

    public final rfm.z b(Function0 fallBackStep) {
        Intrinsics.checkNotNullParameter(fallBackStep, "fallBackStep");
        t tVar = (t) this.f231293a;
        efm.r rVarZ3 = tVar.z3();
        od0.i.Companion.getClass();
        efm.d0 d0VarFirst = rVarZ3.first(od0.i.f224256b);
        p pVar = new p(25, new n(18));
        d0VarFirst.getClass();
        pfm.a aVar = new pfm.a(new rfm.j(d0VarFirst, pVar, 0), new p(26, new h0(this, 4)), 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        efm.d0 d0VarC = te0.w.C(((s0) tVar.f231329b).y0());
        p pVar2 = new p(18, new n(19));
        d0VarC.getClass();
        rfm.m mVar = new rfm.m(new rfm.j(d0VarC, pVar2, 0), new p(19, new h0(this, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        rfm.z zVarM = new rfm.m(new rfm.e(mVar, aVar, 0), new p(29, new h0(this, 5)), 0).m(new rfm.d(new m1i.t(this, fallBackStep, 24), 1));
        Intrinsics.checkNotNullExpressionValue(zVarM, "switchIfEmpty(...)");
        return zVarM;
    }
}
