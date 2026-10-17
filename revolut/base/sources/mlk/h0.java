package mlk;

import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$CancelReason;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends oki.h implements x {
    public final a A;
    public final j60.a B;
    public final i4b.f C;
    public final c D;
    public final cli.y E;
    public final PlanCancelFeaturesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ffk.t f207009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final skk.a f207010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final egk.d f207011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bgc.e f207012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jgk.c f207013t;
    public final ang.f u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dnk.d f207014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l93.f f207015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final xua.a f207016y;
    public final cha.b z;

    public h0(cli.n stateMapper, PlanCancelFeaturesScreenContract$InputData inputData, ffk.t pricingPlanInteractor, skk.a partnerOfferNavigationCommandProvider, egk.d planBenefitsInteractor, bgc.e rewardsInteractor, jgk.c planFeatureListProvider, ang.f userInteractor, gte.a featureToggleInteractor, dnk.d benefitIdsMapper, l93.f cardsInteractor, xua.a recurringPaymentInteractor, cha.b familyPlansInteractor, a bottomDialogProvider, j60.a bottomDialogExtension, i4b.f descriptionClickHandler, c planCancelFeaturesChangeConditionsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(partnerOfferNavigationCommandProvider, "partnerOfferNavigationCommandProvider");
        Intrinsics.checkNotNullParameter(planBenefitsInteractor, "planBenefitsInteractor");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(planFeatureListProvider, "planFeatureListProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(benefitIdsMapper, "benefitIdsMapper");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogProvider, "bottomDialogProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(descriptionClickHandler, "descriptionClickHandler");
        Intrinsics.checkNotNullParameter(planCancelFeaturesChangeConditionsProvider, "planCancelFeaturesChangeConditionsProvider");
        this.o = inputData;
        this.f207009p = pricingPlanInteractor;
        this.f207010q = partnerOfferNavigationCommandProvider;
        this.f207011r = planBenefitsInteractor;
        this.f207012s = rewardsInteractor;
        this.f207013t = planFeatureListProvider;
        this.u = userInteractor;
        this.v = featureToggleInteractor;
        this.f207014w = benefitIdsMapper;
        this.f207015x = cardsInteractor;
        this.f207016y = recurringPaymentInteractor;
        this.z = familyPlansInteractor;
        this.A = bottomDialogProvider;
        this.B = bottomDialogExtension;
        this.C = descriptionClickHandler;
        this.D = planCancelFeaturesChangeConditionsProvider;
        this.E = mra.d.b(this, new v(inputData.f103509a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), ((jte.d) ((wik.n) planBenefitsInteractor).f297925a).c(PricingPlansUiApi$Toggles.BenefitsToLoseRedesignedBenefits.f102627c)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String str;
        String str2;
        boolean z = ((v) ((j2) this.E.f22677a).getValue()).f207030g;
        w4l.h hVar = w4l.h.f294642c;
        ffk.t tVar = this.f207009p;
        c cVar = this.D;
        PlanCancelFeatures$CancelReason.StandardPlan standardPlan = PlanCancelFeatures$CancelReason.StandardPlan.f102912a;
        PlanCancelFeatures$CancelReason.CloseAccount closeAccount = PlanCancelFeatures$CancelReason.CloseAccount.f102909a;
        PlanCancelFeaturesScreenContract$InputData planCancelFeaturesScreenContract$InputData = this.o;
        egk.d dVar = this.f207011r;
        Continuation continuation = null;
        if (z) {
            PlanCancelFeatures$CancelReason planCancelFeatures$CancelReason = planCancelFeaturesScreenContract$InputData.f103509a;
            if (Intrinsics.f(planCancelFeatures$CancelReason, closeAccount) || Intrinsics.f(planCancelFeatures$CancelReason, standardPlan)) {
                str2 = null;
            } else {
                if (!(planCancelFeatures$CancelReason instanceof PlanCancelFeatures$CancelReason.LowerPaidPlan)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = ((PlanCancelFeatures$CancelReason.LowerPaidPlan) planCancelFeatures$CancelReason).f102910a;
            }
            efm.r rVarH = kli.a.h(egk.d.a(dVar, str2), cVar.a(planCancelFeatures$CancelReason));
            final int i = 0;
            yji.l.a1(this, vkm.q.q(rd0.e.b(pd.b.r(rVarH, new Function1(this) { // from class: mlk.c0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h0 f207001b;

                {
                    this.f207001b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            Pair pair = (Pair) obj2;
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            ggk.y yVar = (ggk.y) pair.f186385a;
                            w wVar = (w) pair.f186386b;
                            return nim.a.w(this.f207001b.I2(yVar.f143799b), new mk5.s(yVar, wVar, 7));
                        default:
                            yhm.r rVar = (yhm.r) obj2;
                            Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                            PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) rVar.f314201a;
                            iha.g gVar = (iha.g) rVar.f314202b;
                            w wVar2 = (w) rVar.f314203c;
                            List list = gVar.f161322b;
                            h0 h0Var = this.f207001b;
                            efm.r rVarI2 = h0Var.I2(list);
                            efm.r rVarW = nim.a.w(bgc.e.c(h0Var.f207012s, null, 3), new a0(2));
                            PlanCancelFeatures$CancelReason planCancelFeatures$CancelReason2 = h0Var.o.f103509a;
                            if (!Intrinsics.f(planCancelFeatures$CancelReason2, PlanCancelFeatures$CancelReason.CloseAccount.f102909a) && !Intrinsics.f(planCancelFeatures$CancelReason2, PlanCancelFeatures$CancelReason.StandardPlan.f102912a)) {
                                if (!(planCancelFeatures$CancelReason2 instanceof PlanCancelFeatures$CancelReason.LowerPaidPlan)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                rVarW = nim.a.w(rVarW, new lsl.d(gVar.f161323c, 9));
                            }
                            jgk.c cVar2 = h0Var.f207013t;
                            hha.d selectedPlan = pricingPlanSubscription.f81129a;
                            ArrayList features = gVar.f161321a;
                            xlk.j jVar = (xlk.j) cVar2;
                            jVar.getClass();
                            Intrinsics.checkNotNullParameter(features, "features");
                            Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
                            return nim.a.w(kli.a.i(rVarI2, rVarW, pd.b.r(jVar.f307041a.k(false), new wtl.f(features, 21, jVar, selectedPlan))), new b(wVar2, 1));
                    }
                }
            }))), null, null, new d0(this, null, 3), 3);
        } else {
            efm.r rVarV = tVar.v(hVar);
            PlanCancelFeatures$CancelReason planCancelFeatures$CancelReason2 = planCancelFeaturesScreenContract$InputData.f103509a;
            if (Intrinsics.f(planCancelFeatures$CancelReason2, closeAccount) || Intrinsics.f(planCancelFeatures$CancelReason2, standardPlan)) {
                str = null;
            } else {
                if (!(planCancelFeatures$CancelReason2 instanceof PlanCancelFeatures$CancelReason.LowerPaidPlan)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((PlanCancelFeatures$CancelReason.LowerPaidPlan) planCancelFeatures$CancelReason2).f102910a;
            }
            w4l.f fVar = ((wik.n) dVar).f297926b.d;
            od0.i.Companion.getClass();
            efm.r rVarI = kli.a.i(rVarV, fVar.f(od0.h.a(str), false), cVar.a(planCancelFeatures$CancelReason2));
            final int i2 = 1;
            yji.l.a1(this, vkm.q.q(rd0.e.b(pd.b.r(rVarI, new Function1(this) { // from class: mlk.c0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h0 f207001b;

                {
                    this.f207001b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            Pair pair = (Pair) obj2;
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            ggk.y yVar = (ggk.y) pair.f186385a;
                            w wVar = (w) pair.f186386b;
                            return nim.a.w(this.f207001b.I2(yVar.f143799b), new mk5.s(yVar, wVar, 7));
                        default:
                            yhm.r rVar = (yhm.r) obj2;
                            Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                            PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) rVar.f314201a;
                            iha.g gVar = (iha.g) rVar.f314202b;
                            w wVar2 = (w) rVar.f314203c;
                            List list = gVar.f161322b;
                            h0 h0Var = this.f207001b;
                            efm.r rVarI2 = h0Var.I2(list);
                            efm.r rVarW = nim.a.w(bgc.e.c(h0Var.f207012s, null, 3), new a0(2));
                            PlanCancelFeatures$CancelReason planCancelFeatures$CancelReason22 = h0Var.o.f103509a;
                            if (!Intrinsics.f(planCancelFeatures$CancelReason22, PlanCancelFeatures$CancelReason.CloseAccount.f102909a) && !Intrinsics.f(planCancelFeatures$CancelReason22, PlanCancelFeatures$CancelReason.StandardPlan.f102912a)) {
                                if (!(planCancelFeatures$CancelReason22 instanceof PlanCancelFeatures$CancelReason.LowerPaidPlan)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                rVarW = nim.a.w(rVarW, new lsl.d(gVar.f161323c, 9));
                            }
                            jgk.c cVar2 = h0Var.f207013t;
                            hha.d selectedPlan = pricingPlanSubscription.f81129a;
                            ArrayList features = gVar.f161321a;
                            xlk.j jVar = (xlk.j) cVar2;
                            jVar.getClass();
                            Intrinsics.checkNotNullParameter(features, "features");
                            Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
                            return nim.a.w(kli.a.i(rVarI2, rVarW, pd.b.r(jVar.f307041a.k(false), new wtl.f(features, 21, jVar, selectedPlan))), new b(wVar2, 1));
                    }
                }
            }))), null, null, new d0(this, null, 2), 3);
        }
        l2(new mci.e(this, continuation, 9), new yi5.b(26));
        yji.l.a1(this, c8g.a.D(rd0.e.b(tVar.v(hVar))), null, null, new d0(this, null, 0), 3);
        l2(new e0(this, null), new yi5.b(26));
        yji.l.a1(this, nim.a.y(rd0.e.n(nim.a.v(((ffk.h) this.z).f(w4l.h.f294642c), new mk3.c(29)), zhm.h0.f322473a), new a0(3)), null, null, new d0(this, null, 1), 3);
    }

    public final efm.r I2(List list) {
        if (list.isEmpty()) {
            efm.r rVarJust = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            return rVarJust;
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (String str : list2) {
            ufm.i iVar = new ufm.i(((ha3.x) this.f207015x).n(str), new b0(new mk5.s(this, str, 6), 2), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            ufm.i iVar2 = new ufm.i(iVar, new b0(new a0(4), 4), 1);
            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
            od0.i.Companion.getClass();
            arrayList.add(ue0.e.F(iVar2, od0.i.f224256b));
        }
        efm.r rVarX = new ufm.i(new ufm.i(efm.d0.E(arrayList, new b0(new a0(5), 5)), new b0(new a0(0), 0), 1), new b0(new a0(1), 1), 1).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r rVarStartWith = ue0.e.E(rVarX, new Data(zhm.f0.f322471a, null, false, 6, null)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J2(java.lang.Object r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            cli.y r1 = r4.E
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            mlk.v r1 = (mlk.v) r1
            com.revolut.data.model.Data r1 = r1.d
            java.lang.Object r1 = r1.getContent()
            mlk.t r1 = (mlk.t) r1
            if (r1 == 0) goto L82
            boolean r2 = r1 instanceof mlk.s
            if (r2 == 0) goto L82
            boolean r2 = r5 instanceof mlk.y
            r3 = 0
            if (r2 == 0) goto L27
            mlk.y r5 = (mlk.y) r5
            goto L28
        L27:
            r5 = r3
        L28:
            mlk.s r1 = (mlk.s) r1
            ggk.z r1 = r1.d
            if (r1 == 0) goto L4a
            if (r5 != 0) goto L31
            goto L32
        L31:
            r1 = r3
        L32:
            if (r1 == 0) goto L4a
            dnk.d r2 = r4.f207014w
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "layout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r0 = r1.f143805b
            ggk.d1 r1 = r1.f143806c
            com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet r0 = dnk.d.c(r6, r0, r1)
            goto L4b
        L4a:
            r0 = r3
        L4b:
            if (r5 == 0) goto L50
            com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet r0 = r5.f207033a
            goto L64
        L50:
            if (r0 != 0) goto L64
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "unable to find bottom sheet on item click, id = "
            java.lang.String r6 = j6.a.q(r1, r6)
            java.lang.String r1 = "PlanCancelFeaturesScreen"
            rd0.d.a(r0, r1, r6, r3, r5)
            return
        L64:
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetScreen r6 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetScreen
            if (r5 == 0) goto L6b
            com.revolut.core.ui_kit.models.badge.CircleBadgeModel r5 = r5.f207034b
            goto L6c
        L6b:
            r5 = r3
        L6c:
            gte.a r1 = r4.v
            com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles$RevampedPlanBackgrounds r2 = com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c
            boolean r1 = r1.a(r2)
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData r2 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData
            r2.<init>(r0, r1, r5)
            r6.<init>(r2)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r5 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r0 = 2
            yji.l.j2(r4, r6, r5, r3, r0)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mlk.h0.J2(java.lang.Object, java.lang.String):void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
