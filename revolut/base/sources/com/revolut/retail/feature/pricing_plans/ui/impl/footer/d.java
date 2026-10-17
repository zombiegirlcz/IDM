package com.revolut.retail.feature.pricing_plans.ui.impl.footer;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.footer.PricingPlanFooterInternalContract$TermsClauseClickParcel;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$TitleConfig;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends dgk.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f103305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ajk.b f103306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ajk.c f103307n;

    public d(x deeplinkHandler, ajk.b outOfAppNavigationProvider, ajk.c bottomSheetNavigationResolver) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationResolver, "bottomSheetNavigationResolver");
        this.f103305l = deeplinkHandler;
        this.f103306m = outOfAppNavigationProvider;
        this.f103307n = bottomSheetNavigationResolver;
    }

    @Override // dgk.a
    public final Object Z2(ty0.a aVar, i iVar) {
        Object obj2 = aVar.d;
        PricingPlanFooterInternalContract$TermsClauseClickParcel pricingPlanFooterInternalContract$TermsClauseClickParcel = obj2 instanceof PricingPlanFooterInternalContract$TermsClauseClickParcel ? (PricingPlanFooterInternalContract$TermsClauseClickParcel) obj2 : null;
        if (pricingPlanFooterInternalContract$TermsClauseClickParcel == null) {
            return Boolean.FALSE;
        }
        if (pricingPlanFooterInternalContract$TermsClauseClickParcel instanceof PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation) {
            return b3((PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation) pricingPlanFooterInternalContract$TermsClauseClickParcel, iVar);
        }
        if (!(pricingPlanFooterInternalContract$TermsClauseClickParcel instanceof PricingPlanFooterInternalContract$TermsClauseClickParcel.BottomSheetNavigation)) {
            throw new NoWhenBranchMatchedException();
        }
        PricingPlanFooterInternalContract$TermsClauseClickParcel.BottomSheetNavigation bottomSheetNavigation = (PricingPlanFooterInternalContract$TermsClauseClickParcel.BottomSheetNavigation) pricingPlanFooterInternalContract$TermsClauseClickParcel;
        n.P2(this, new PlanDocumentsBottomSheetScreen(new PlanDocumentsBottomSheetScreenContract$InputData(new PlanDocumentsBottomSheetScreenContract$TitleConfig.Default(bottomSheetNavigation.f103299a), bottomSheetNavigation.f103300b)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.retail.feature.pricing_plans.ui.impl.footer.PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.revolut.retail.feature.pricing_plans.ui.impl.footer.a
            if (r0 == 0) goto L13
            r0 = r7
            com.revolut.retail.feature.pricing_plans.ui.impl.footer.a r0 = (com.revolut.retail.feature.pricing_plans.ui.impl.footer.a) r0
            int r1 = r0.f103302w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103302w = r1
            goto L18
        L13:
            com.revolut.retail.feature.pricing_plans.ui.impl.footer.a r0 = new com.revolut.retail.feature.pricing_plans.ui.impl.footer.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f103302w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.String r7 = r6.f103301a
            ajk.c r2 = r5.f103307n
            r4 = 0
            com.revolut.kompot.navigable.vc.ViewController r7 = r2.a(r7, r4)
            if (r7 != 0) goto L5d
            java.lang.String r7 = r6.f103301a
            vd1.a r2 = new vd1.a
            r4 = 13
            r2.<init>(r5, r6, r4)
            r0.f103302w = r3
            aii.o r6 = r5.r2()
            ajk.b r3 = r5.f103306m
            java.lang.Object r6 = igk.k.a(r6, r3, r7, r2, r0)
            if (r6 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L57:
            if (r6 != r1) goto L5a
            return r1
        L5a:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L5d:
            r6 = 0
            r0 = 2
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            yji.n.P2(r5, r7, r1, r6, r0)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.footer.d.b3(com.revolut.retail.feature.pricing_plans.ui.impl.footer.PricingPlanFooterInternalContract$TermsClauseClickParcel$UrlNavigation, gim.c):java.lang.Object");
    }
}
