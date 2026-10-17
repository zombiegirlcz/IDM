package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$CreditOfferConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import g23.q;
import g84.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends t implements g84.c {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditCardOfferFlowContract$InputData f67383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g84.e f67384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final egk.e f67385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ffk.t f67386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yik.b f67387t;
    public final cj4.a u;
    public final x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final hw3.c f67388w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rx3.a f67389x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sg4.a f67390y;
    public final yki.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CreditCardOfferFlowContract$InputData inputData, g84.e creditCardOfferFlowInteractor, egk.e pricingPlansUiInteractor, ffk.t pricingPlanInteractor, yik.b planAnimatedBackgroundTypeMapper, cj4.a creditPlanUpgradeControllerModelExtension, x deeplinkHandler, hw3.c actionPathInteractor, rx3.a creditAnimatedIntroInteractor, sg4.a creditPricingPlanAnalyticsMetadataFactory, e84.e pluginControllerResolver) {
        FlowStep loading;
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardOfferFlowInteractor, "creditCardOfferFlowInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planAnimatedBackgroundTypeMapper, "planAnimatedBackgroundTypeMapper");
        Intrinsics.checkNotNullParameter(creditPlanUpgradeControllerModelExtension, "creditPlanUpgradeControllerModelExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(actionPathInteractor, "actionPathInteractor");
        Intrinsics.checkNotNullParameter(creditAnimatedIntroInteractor, "creditAnimatedIntroInteractor");
        Intrinsics.checkNotNullParameter(creditPricingPlanAnalyticsMetadataFactory, "creditPricingPlanAnalyticsMetadataFactory");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67383p = inputData;
        this.f67384q = creditCardOfferFlowInteractor;
        this.f67385r = pricingPlansUiInteractor;
        this.f67386s = pricingPlanInteractor;
        this.f67387t = planAnimatedBackgroundTypeMapper;
        this.u = creditPlanUpgradeControllerModelExtension;
        this.v = deeplinkHandler;
        this.f67388w = actionPathInteractor;
        this.f67389x = creditAnimatedIntroInteractor;
        this.f67390y = creditPricingPlanAnalyticsMetadataFactory;
        CreditCardOfferFlowContract$CreditOfferConfig creditCardOfferFlowContract$CreditOfferConfig = inputData.f67361a;
        if (creditCardOfferFlowContract$CreditOfferConfig instanceof CreditCardOfferFlowContract$CreditOfferConfig.PromoOffer) {
            loading = new CreditCardOfferFlowContract$Step.PromoOffer((CreditCardOfferFlowContract$CreditOfferConfig.PromoOffer) creditCardOfferFlowContract$CreditOfferConfig);
        } else {
            if (!(creditCardOfferFlowContract$CreditOfferConfig instanceof CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer)) {
                throw new NoWhenBranchMatchedException();
            }
            loading = new CreditCardOfferFlowContract$Step.Loading((CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer) creditCardOfferFlowContract$CreditOfferConfig);
        }
        this.z = cp5.d.a(this, loading, f0.f322471a, new g75.i(this, 3));
    }

    public static void P2(i iVar) {
        iVar.l2(new q(iVar, new a27.d(1, 4, null), (Long) null, (Continuation) null), new yi5.b(26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (lg0.b.x1(r9.v, r2, null, null, r5, 6) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r1.c(r10, r5) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
    
        if (c84.t.N2(r9, (it3.d) r11, r5, 2) != r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(com.revolut.feature.credit.application.plugins.api.models.action_button.Action r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i.Q2(com.revolut.feature.credit.application.plugins.api.models.action_button.Action, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        CreditCardOfferFlowContract$Step creditCardOfferFlowContract$Step = (CreditCardOfferFlowContract$Step) this.z.d();
        if (creditCardOfferFlowContract$Step instanceof CreditCardOfferFlowContract$Step.Loading) {
            n2(new g1k.i(this, (CreditCardOfferFlowContract$Step.Loading) creditCardOfferFlowContract$Step, null, 17), new whi.b(6));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}
