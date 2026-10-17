package com.revolut.retail.feature.pricing_plans.ui.impl.flow.action;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.PricingPlanActionModalStep;
import ffk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rgk.d;
import rgk.e;
import rgk.g;
import rgk.j;
import rgk.o;
import rgk.p;
import wli.x;
import yji.n;
import zfk.c;
import zfk.k;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f102967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ajk.b f102968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f102969n;
    public final ma3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f102970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ylk.a f102971q;

    public b(x deeplinkHandler, ajk.b outOfAppNavigationProvider, c planSubscriberControllerModelExtension, ma3.a orderNewCardNavigationCommandFactory, t pricingPlanInteractor, ylk.a statusDialogConfigProvider) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(orderNewCardNavigationCommandFactory, "orderNewCardNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(statusDialogConfigProvider, "statusDialogConfigProvider");
        this.f102967l = deeplinkHandler;
        this.f102968m = outOfAppNavigationProvider;
        this.f102969n = planSubscriberControllerModelExtension;
        this.o = orderNewCardNavigationCommandFactory;
        this.f102970p = pricingPlanInteractor;
        this.f102971q = statusDialogConfigProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b r8, zfk.c.b r9, rgk.p r10, rgk.c r11, gim.c r12) {
        /*
            r8.getClass()
            boolean r0 = r12 instanceof rgk.f
            if (r0 == 0) goto L17
            r0 = r12
            rgk.f r0 = (rgk.f) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.z = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            rgk.f r0 = new rgk.f
            r0.<init>(r8, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.f254208x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.z
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b r8 = r6.f254207w
            rgk.c r11 = r6.v
            rgk.p r10 = r6.u
            yhm.o.b(r12)
            goto L67
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            yhm.o.b(r12)
            boolean r12 = r9 instanceof zfk.i
            if (r12 == 0) goto L77
            rgk.b r9 = r10.f254223c
            int[] r12 = rgk.e.f254206b
            int r9 = r9.ordinal()
            r9 = r12[r9]
            if (r9 == r2) goto L7b
            r12 = 2
            if (r9 != r12) goto L71
            ma3.a r1 = r8.o
            r6.u = r10
            r6.v = r11
            r6.f254207w = r8
            r6.z = r2
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 255(0xff, float:3.57E-43)
            java.lang.Object r12 = ma3.a.a(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L67
            return r0
        L67:
            com.revolut.retail.core.navigation.NaviCommand r12 = (com.revolut.retail.core.navigation.NaviCommand) r12
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = zh9.u0.b(r12)
            r8.A2(r9)
            goto L7b
        L71:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L77:
            boolean r8 = r9 instanceof zfk.g
            if (r8 == 0) goto L8e
        L7b:
            kotlin.jvm.functions.Function0 r8 = r11.d
            r8.invoke()
            rgk.a r8 = r10.d
            rgk.a r9 = rgk.a.CloseAfterResult
            if (r8 != r9) goto L8b
            kotlin.jvm.functions.Function0 r8 = r11.f254203b
            r8.invoke()
        L8b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L8e:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b.Z2(com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b, zfk.c$b, rgk.p, rgk.c, gim.c):java.lang.Object");
    }

    public final void b3(PricingPlanAction.ApplyDiscount action, Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        T2(new j(this, action, onSuccess, null), new yi5.b(27));
    }

    public final void c3(PricingPlanAction.Common action, p policy, rgk.c callbacks) {
        k kVar;
        Function0 function0 = callbacks.f254203b;
        Function2 function2 = callbacks.f254202a;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if ((action instanceof PricingPlanAction.Dismiss) || (action instanceof PricingPlanAction.Decline)) {
            function0.invoke();
            return;
        }
        if (action instanceof PricingPlanAction.OpenUrl) {
            T2(new rgk.n(this, (PricingPlanAction.OpenUrl) action, null), new yi5.b(27));
            return;
        }
        boolean z = action instanceof PricingPlanAction.OpenBillingPicker;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            PricingPlanAction.OpenBillingPicker openBillingPicker = (PricingPlanAction.OpenBillingPicker) action;
            function2.invoke(new PricingPlanActionModalStep.BillingPicker(openBillingPicker.f102803b, openBillingPicker.f102802a, openBillingPicker.f102804c, openBillingPicker.d), bottom_dialog);
            return;
        }
        if (action instanceof PricingPlanAction.SeeAllBenefits) {
            function2.invoke(new PricingPlanActionModalStep.PlanBenefits(((PricingPlanAction.SeeAllBenefits) action).f102806a), ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (action instanceof PricingPlanAction.SeeAllDocuments) {
            function2.invoke(new PricingPlanActionModalStep.PlanDocuments(((PricingPlanAction.SeeAllDocuments) action).f102807a), bottom_dialog);
            return;
        }
        if (!(action instanceof PricingPlanAction.Upgrade)) {
            if (!(action instanceof PricingPlanAction.ApplyDiscount)) {
                throw new NoWhenBranchMatchedException();
            }
            b3((PricingPlanAction.ApplyDiscount) action, function0);
            return;
        }
        PricingPlanAction.Upgrade upgrade = (PricingPlanAction.Upgrade) action;
        int i = e.f254205a[policy.d.ordinal()];
        if (i == 1) {
            kVar = new k(null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = new k(callbacks.f254204c);
        }
        n.j2(this, this.f102969n.b3(upgrade.f102809a, upgrade.f102810b, upgrade.f102811c, kVar), null, new o(this, policy, callbacks, null), 3);
    }

    public final void d3(PricingPlanAction.Upgrade action, Function1 onResult) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        n.j2(this, this.f102969n.b3(action.f102809a, action.f102810b, action.f102811c, new k(null)), null, new g(onResult, null), 3);
    }
}
