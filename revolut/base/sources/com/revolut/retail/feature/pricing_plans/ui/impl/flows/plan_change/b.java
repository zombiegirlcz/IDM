package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change;

import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.PlanChangeFlowContract$Step;
import cp5.d;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qd8.e;
import r6f.i;
import rhk.c;
import utk.f;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements rhk.b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f103132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zfk.c f103133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sh3.a f103134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f103135s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f103136t;
    public final cha.a u;
    public final ajk.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ajk.b f103137w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ma3.a f103138x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CheckoutOrder f103139y;
    public final yki.a z;

    public b(c inputData, x deeplinkHandler, zfk.c planSubscriberControllerModelExtension, sh3.a checkoutInteractor, t pricingPlanInteractor, f pricingPlanCardsInteractor, cha.a creditPlansInteractor, ajk.f pricingPlanNavigationCommandsProvider, ajk.b outOfAppNavigationProvider, ma3.a orderNewCardNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanCardsInteractor, "pricingPlanCardsInteractor");
        Intrinsics.checkNotNullParameter(creditPlansInteractor, "creditPlansInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(orderNewCardNavigationCommandFactory, "orderNewCardNavigationCommandFactory");
        this.o = inputData;
        this.f103132p = deeplinkHandler;
        this.f103133q = planSubscriberControllerModelExtension;
        this.f103134r = checkoutInteractor;
        this.f103135s = pricingPlanInteractor;
        this.f103136t = pricingPlanCardsInteractor;
        this.u = creditPlansInteractor;
        this.v = pricingPlanNavigationCommandsProvider;
        this.f103137w = outOfAppNavigationProvider;
        this.f103138x = orderNewCardNavigationCommandFactory;
        i iVar = new i(this, 23);
        this.z = d.a(this, PlanChangeFlowContract$Step.SelectPlan.f103128a, f0.f322471a, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b r6, com.revolut.feature.checkout.models.CheckoutOrder r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof rhk.h
            if (r0 == 0) goto L13
            r0 = r8
            rhk.h r0 = (rhk.h) r0
            int r1 = r0.f254518w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254518w = r1
            goto L18
        L13:
            rhk.h r0 = new rhk.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254518w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto L90
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r8)
            pi3.e r7 = r7.e
            if (r7 != 0) goto L38
            goto L99
        L38:
            boolean r8 = r7.i
            if (r8 == 0) goto L99
            cha.a r6 = r6.u
            java.lang.String r8 = r7.f236399a
            java.lang.String r7 = r7.f236401c
            ffk.a r6 = (ffk.a) r6
            r6.getClass()
            java.lang.String r2 = "planId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            dha.a r6 = r6.f134815a
            pfk.e r6 = (pfk.e) r6
            r6.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "loadingStrategy"
            w4l.h r5 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            x4l.c r6 = r6.d
            pfk.b r2 = new pfk.b
            r2.<init>(r8, r7)
            vkm.d r6 = r6.b(r2, r5)
            zfd.e r6 = zi0.c.w(r6)
            rg3.d r7 = new rg3.d
            r8 = 22
            r7.<init>(r8)
            akg.n r6 = nim.a.v(r6, r7)
            rg3.d r7 = new rg3.d
            r8 = 23
            r7.<init>(r8)
            cxe.u r6 = n14.k.p(r6, r7)
            r7 = 3
            jhi.b r6 = mo3.a.g(r6, r4, r4, r7)
            r0.f254518w = r3
            java.lang.Object r8 = vkm.q.z(r6, r0)
            if (r8 != r1) goto L90
            return r1
        L90:
            od0.i r8 = (od0.i) r8
            if (r8 == 0) goto L99
            java.lang.Object r6 = r8.f224257a
            kha.d r6 = (kha.d) r6
            return r6
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b.I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b, com.revolut.feature.checkout.models.CheckoutOrder, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r13 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b r10, hha.d r11, hha.d r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b.J2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b, hha.d, hha.d, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new r0e.c(this, null, 25), new yi5.b(26));
    }

    public final void K2(hha.d dVar, hha.i iVar, PricingPlanOffer pricingPlanOffer) {
        l2(new e(this, new pi3.h(dVar, iVar, pricingPlanOffer, true, 48), (Continuation) null, 29), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}
