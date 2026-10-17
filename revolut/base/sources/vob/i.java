package vob;

import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData;
import ffk.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ncd.m;
import wsg.n;
import yji.l;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends oki.h implements g {
    public final SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ijb.a f290939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f290940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f290941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f290942s;

    public i(cli.n stateMapper, SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData inputData, ijb.a savingsProductInteractor, t pricingPlanInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = inputData;
        this.f290939p = savingsProductInteractor;
        this.f290940q = pricingPlanInteractor;
        this.f290941r = walletInteractor;
        this.f290942s = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        List listC = u.c(m.ACTIVE);
        List listC2 = u.c(this.o.f83170a);
        olb.d dVar = (olb.d) this.f290939p;
        w4l.h hVar = w4l.h.f294642c;
        l.a1(this, nim.a.v(u0.i(dVar.i(listC2, listC, hVar), rd0.e.b(this.f290940q.q()), rd0.e.b(this.f290941r.J(AccountId.Personal.f51414a, hVar))), new vn8.a(12)), null, null, new vfg.m(this, null, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f290942s;
    }
}
