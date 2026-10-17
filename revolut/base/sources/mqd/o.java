package mqd;

import au.c0;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import ffk.t;
import g48.r0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mkk.q;
import ml3.y;
import s6e.z;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijb.a f207987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final toh.d f207988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f207989c;
    public final g6e.d d;
    public final wsg.n e;
    public final com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f207990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f207991h;

    public o(ijb.a savingsProductInteractor, toh.d savingsAvailabilityInteractor, r0 jointAccountsInteractor, g6e.d subaccountInteractor, wsg.n walletInteractor, com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.a investAccountAvailabilityProvider, gte.a featureToggleInteractor, t planInteractor) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsAvailabilityInteractor, "savingsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(investAccountAvailabilityProvider, "investAccountAvailabilityProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(planInteractor, "planInteractor");
        this.f207987a = savingsProductInteractor;
        this.f207988b = savingsAvailabilityInteractor;
        this.f207989c = jointAccountsInteractor;
        this.d = subaccountInteractor;
        this.e = walletInteractor;
        this.f = investAccountAvailabilityProvider;
        this.f207990g = featureToggleInteractor;
        this.f207991h = planInteractor;
    }

    public final jhi.k a() {
        Flow flowI;
        toh.d dVar = this.f207988b;
        lcd.n nVar = lcd.n.f193865a;
        Continuation continuation = null;
        Flow flowH = xam.a.h(new c0(this, nVar, continuation, 16), toh.d.g(dVar, nVar, 2));
        AnalyticsFeatureApi$Toggles.AnalyticsIncomeSorterJointSavingsAndPockets analyticsIncomeSorterJointSavingsAndPockets = AnalyticsFeatureApi$Toggles.AnalyticsIncomeSorterJointSavingsAndPockets.f87385c;
        jte.d dVar2 = (jte.d) this.f207990g;
        if (dVar2.c(analyticsIncomeSorterJointSavingsAndPockets) && dVar2.c(SavingsApi$Toggles.JointAccountsSavings.f83075c)) {
            lcd.m mVar = lcd.m.f193864a;
            flowI = xam.a.h(new c0(this, mVar, continuation, 16), toh.d.g(dVar, mVar, 2));
        } else {
            od0.i.Companion.getClass();
            flowI = zi0.c.i(od0.i.f224256b);
        }
        v1 v1VarG = ((z) this.d).g();
        Flow flowH2 = xam.a.h(new jkh.g(this, continuation, 11), new v1(new mll.c0(this, continuation, 7)));
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.a aVar = this.f;
        return nim.a.u(new q(null, this), u0.m(u0.i(flowH, flowI, v1VarG), u0.m(flowH2, nim.a.v(u0.m(ybl.k.k(aVar.f87830a, w4l.h.f294642c, null, null, 6), ybl.l.d(aVar.f87831b)), new y(aVar, 27)))));
    }
}
