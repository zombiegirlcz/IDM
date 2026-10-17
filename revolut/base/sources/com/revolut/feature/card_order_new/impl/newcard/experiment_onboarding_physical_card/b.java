package com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card;

import c93.e;
import com.revolut.feature.card_design.api.CardDesignCarouselDestination;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderContext;
import com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles;
import com.revolut.feature.card_order_new.api.GetCardFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.api.navigation.OrderNewCardDestination;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardContract$Configuration;
import com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.CardOrderExperimentFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import ffk.t;
import h93.j0;
import h93.l0;
import hha.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n33.j;
import n33.z;
import oki.h;
import q33.f;
import q33.g;
import yki.i;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements q33.a {
    public final CardOrderExperimentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f65222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f65223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q33.h f65224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f65225s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f65226t;
    public g u;
    public final i v;

    public b(CardOrderExperimentFlowContract$InputData inputData, t pricingPlanInteractor, f promptsProvider, q33.h variantsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(promptsProvider, "promptsProvider");
        Intrinsics.checkNotNullParameter(variantsInteractor, "variantsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f65222p = pricingPlanInteractor;
        this.f65223q = promptsProvider;
        this.f65224r = variantsInteractor;
        this.f65225s = featureToggleInteractor;
        this.u = g.BASELINE;
        this.v = d8l.d.a(this, new pu4.d(this, 22));
    }

    public final void I2() {
        NaviCommand naviCommandA;
        boolean zC = ((jte.d) this.f65225s).c(CardOrderFeatureApi$Toggles.OrderNewCardKompotMigration.f64948c);
        CardOrderExperimentFlowContract$InputData cardOrderExperimentFlowContract$InputData = this.o;
        if (zC) {
            SelectedTab selectedTab = SelectedTab.DEBIT;
            GetCardFeatureConfig getCardFeatureConfig = cardOrderExperimentFlowContract$InputData.f65217a;
            GetCardFeatureConfig getCardFeatureConfig2 = cardOrderExperimentFlowContract$InputData.f65217a;
            naviCommandA = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new OrderNewCardDestination(selectedTab, new CardOrderAccountWrapper.Regular(getCardFeatureConfig.d), true, null, null, null, getCardFeatureConfig2.e, getCardFeatureConfig2.f64966b, null, null, null, false, null, getCardFeatureConfig2.f64967c, getCardFeatureConfig2.f, 7992), false, (Integer) null, getCardFeatureConfig2.f64965a ? 335577088 : 0, 45));
        } else {
            z.Companion.getClass();
            ExplicitActivityDestination explicitActivityDestination = j.f211740b;
            SelectedTab selectedTab2 = SelectedTab.DEBIT;
            GetCardFeatureConfig getCardFeatureConfig3 = cardOrderExperimentFlowContract$InputData.f65217a;
            GetCardFeatureConfig getCardFeatureConfig4 = cardOrderExperimentFlowContract$InputData.f65217a;
            ActivityNavigateCommand activityNavigateCommand = new ActivityNavigateCommand(explicitActivityDestination, new OrderNewCardContract$Configuration(selectedTab2, true, (CardOrderAccountWrapper) new CardOrderAccountWrapper.Regular(getCardFeatureConfig3.d), (NaviCommand) null, (NaviCommand) null, (NaviCommand) null, getCardFeatureConfig4.f64966b, getCardFeatureConfig4.f64967c, getCardFeatureConfig4.e, (CardOrderContext) null, (j0) null, (l0) null, (String) null, getCardFeatureConfig4.f, 15928), null, null, 0, null, null, null, null, false, 1020);
            naviCommandA = getCardFeatureConfig4.f64965a ? com.revolut.retail.core.navigation.a.a(activityNavigateCommand) : activityNavigateCommand;
        }
        C1(new BridgeDestination(r6.b.g(null, null, null, 7, naviCommandA)));
    }

    public final void J2() {
        int i = q33.d.f241788a[this.u.ordinal()];
        if (i == 1) {
            K2(CardOrderExperimentFlowContract$Step.PhysicalCatalogue.f65219a, true);
            return;
        }
        if (i == 2) {
            GetCardFeatureConfig getCardFeatureConfig = this.o.f65217a;
            pi3.h hVar = getCardFeatureConfig.f64967c;
            e eVar = e.PHYSICAL;
            j0 j0Var = j0.RETAIL;
            l0 l0Var = l0.DEBIT;
            d dVar = this.f65226t;
            C1(u0.b(u0.f(new CardDesignCarouselDestination(hVar, eVar, j0Var, l0Var, null, null, dVar != null ? dVar.f152287a : null, getCardFeatureConfig.d, null, null, null, false, null, getCardFeatureConfig.f, null, null, null, null, null, true, false, null, 15712000))));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                r6.b.D("navigateToPhysical called in VIRTUAL_CARD_ONLY state");
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                r6.b.D("navigateToPhysical called in BASELINE state");
            }
        }
    }

    public final void K2(CardOrderExperimentFlowContract$Step cardOrderExperimentFlowContract$Step, boolean z) {
        CardOrderExperimentFlowContract$Step.PushbackSheet pushbackSheet = CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a;
        boolean zEquals = cardOrderExperimentFlowContract$Step.equals(pushbackSheet);
        i iVar = this.v;
        if (zEquals) {
            h.w2(iVar, pushbackSheet, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            h.t2(this, iVar, cardOrderExperimentFlowContract$Step, z, null, false, 12);
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (this.v.d() != null) {
            return false;
        }
        I2();
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
