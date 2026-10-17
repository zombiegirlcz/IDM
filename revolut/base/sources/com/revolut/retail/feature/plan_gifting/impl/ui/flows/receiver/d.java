package com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver;

import ajk.f;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.PlanGiftingReceiverFlowContract$Step;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.a;
import ffk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tbk.e;
import wp5.y;
import yji.l;
import zbk.g;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends h implements zbk.b {
    public final PlanGiftingReceiverFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ick.b f102473p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f102474q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f102475r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yik.h f102476s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zfk.c f102477t;
    public final f u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f102478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yki.a f102479x;

    public d(PlanGiftingReceiverFlowContract$InputData inputData, ick.b dialogMapper, e planGiftingLifecycleInteractor, t pricingPlanInteractor, yik.h pricingPlanStringMapper, zfk.c planSubscriberControllerExtension, f pricingPlanNavigationCommandsProvider, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(planGiftingLifecycleInteractor, "planGiftingLifecycleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(planSubscriberControllerExtension, "planSubscriberControllerExtension");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.o = inputData;
        this.f102473p = dialogMapper;
        this.f102474q = planGiftingLifecycleInteractor;
        this.f102475r = pricingPlanInteractor;
        this.f102476s = pricingPlanStringMapper;
        this.f102477t = planSubscriberControllerExtension;
        this.u = pricingPlanNavigationCommandsProvider;
        this.v = y.u(uuidUtils, "toString(...)");
        this.f102478w = y.u(uuidUtils, "toString(...)");
        this.f102479x = cp5.d.a(this, new PlanGiftingReceiverFlowContract$Step.Intro(inputData.f102457a, inputData.f102458b, inputData.f102459c), f0.f322471a, new zba.a(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof zbk.i
            if (r0 == 0) goto L13
            r0 = r6
            zbk.i r0 = (zbk.i) r0
            int r1 = r0.f320962w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320962w = r1
            goto L18
        L13:
            zbk.i r0 = new zbk.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320962w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            if (r5 == 0) goto L52
            ffk.t r6 = r4.f102475r
            efm.d0 r5 = r6.f(r5)
            r0.f320962w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            od0.i r6 = (od0.i) r6
            java.lang.Object r5 = r6.f224257a
            hha.d r5 = (hha.d) r5
            if (r5 == 0) goto L52
            yik.h r4 = r4.f102476s
            com.revolut.core.ui_kit.models.Clause r4 = fgk.b.a(r4, r5)
            return r4
        L52:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d.I2(com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d, java.lang.String, gim.c):java.lang.Object");
    }

    public static final void J2(d dVar, a aVar) {
        if (Intrinsics.f(aVar, a.C0627a.f102470a)) {
            dVar.C1(u0.b(dVar.u.d()));
            return;
        }
        if (!(aVar instanceof zbk.d)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = zbk.e.f320958a[((zbk.d) aVar).f320956a.f182623b.ordinal()];
        if (i == 1) {
            dVar.B2();
            dVar.C1(u0.c(new CardDesignFeatureConfig(b93.e.PHYSICAL, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870910)));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(dVar.f102479x);
        }
    }

    public final void K2(String str) {
        l.a1(this, new y5j.e(this.f102477t.d3(this.o.f102457a, str, this.v), 28), new g(this, null, 0), null, new b(this, null), 2);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102479x;
    }
}
