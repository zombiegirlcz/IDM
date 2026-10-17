package uv6;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.api.ui.controller.contract.FreelancerCashbackUpsellContract$InputData;
import et6.y0;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements f {
    public final gr6.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FreelancerCashbackUpsellContract$InputData f283336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f283337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f283338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f283339s;

    public l(gr6.h freelancerCashbackInteractor, FreelancerCashbackUpsellContract$InputData inputData, t pricingPlanInteractor, ang.f userInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerCashbackInteractor;
        this.f283336p = inputData;
        this.f283337q = pricingPlanInteractor;
        this.f283338r = userInteractor;
        this.f283339s = mra.d.b(this, new g(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        t tVar = this.f283337q;
        vkm.d dVarB = rd0.e.b(tVar.q());
        y0 y0Var = (y0) this.o;
        akg.n nVarE = y0Var.e(w4l.j.f294644c);
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, nim.a.v(u0.i(dVarB, nVarE, y0Var.g(hVar)), new uu9.b(this, 5)), null, null, new j(this, null, 1), 3);
        yji.l.a1(this, nim.a.v(u0.m(rd0.e.b(tVar.o()), y0Var.g(hVar)), new uv1.c(4)), null, null, new j(this, null, 0), 3);
        yji.l.a1(this, rd0.e.b(this.f283338r.k(false)), null, null, new j(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f283339s;
    }
}
