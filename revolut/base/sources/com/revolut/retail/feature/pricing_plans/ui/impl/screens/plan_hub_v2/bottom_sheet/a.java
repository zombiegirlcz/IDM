package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import eub.i;
import f9d.c;
import fmk.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import m1c.f1;
import mt8.d;
import nyb.j;
import nyb.p0;
import oki.h;
import vkm.q;
import wsg.n;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements g {
    public final PlanRevPointsCardsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f103534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f103535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f103536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.feature.rev_points.api.navigation.a f103537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ajk.f f103538t;
    public final fmk.a u;
    public final i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f103539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f103540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f103541y;
    public final y z;

    public a(cli.n stateMapper, PlanRevPointsCardsScreenContract$InputData inputData, f revolutCardsInteractor, p0 revPointsUpgradeBannerInfoInteractor, d kycInteractor, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory, ajk.f pricingPlanNavigationCommandsProvider, fmk.a planRevPointsCardsFilter, i revPointsOptInInteractor, n walletInteractor, j revPointsEarningRatesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(revPointsUpgradeBannerInfoInteractor, "revPointsUpgradeBannerInfoInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(planRevPointsCardsFilter, "planRevPointsCardsFilter");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        this.o = inputData;
        this.f103534p = revolutCardsInteractor;
        this.f103535q = revPointsUpgradeBannerInfoInteractor;
        this.f103536r = kycInteractor;
        this.f103537s = revPointsNavigationFactory;
        this.f103538t = pricingPlanNavigationCommandsProvider;
        this.u = planRevPointsCardsFilter;
        this.v = revPointsOptInInteractor;
        this.f103539w = walletInteractor;
        this.f103540x = revPointsEarningRatesInteractor;
        this.f103541y = new vii.b();
        this.z = mra.d.b(this, new fmk.f(inputData.f103531a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f103541y, new f5h.b(continuation, this, 8)), null, null, new c(this, continuation, 29), 3);
    }

    public final f1 I2() {
        PlanRevPointsCardsScreenContract$RevPointsCardType planRevPointsCardsScreenContract$RevPointsCardType = this.o.f103531a;
        if (Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Credit.f103532a)) {
            return f1.CREDIT_CARD;
        }
        if (Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Debit.f103533a)) {
            return f1.REVOLUT_CARD;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
