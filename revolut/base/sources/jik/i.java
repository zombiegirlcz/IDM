package jik;

import com.revolut.retail.feature.plan_referrals.api.PlanReferralsApi$Toggles;
import ffk.t;
import ix6.l0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends yfk.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f174602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final egk.a f174603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f174604n;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f174605p;

    public i(t pricingPlanInteractor, egk.a familyPlansUiInteractor, gte.a featureToggleInteractor, d benefitProvider, j promptBuilder) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(familyPlansUiInteractor, "familyPlansUiInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(benefitProvider, "benefitProvider");
        Intrinsics.checkNotNullParameter(promptBuilder, "promptBuilder");
        this.f174602l = pricingPlanInteractor;
        this.f174603m = familyPlansUiInteractor;
        this.f174604n = featureToggleInteractor;
        this.o = benefitProvider;
        this.f174605p = promptBuilder;
    }

    @Override // yfk.a
    public final void Z2(vd1.a onConfirmed) {
        Intrinsics.checkNotNullParameter(onConfirmed, "onConfirmed");
        if (!((jte.d) this.f174604n).c(PlanReferralsApi$Toggles.PremiumPlanReferral.f102518c)) {
            onConfirmed.invoke();
            return;
        }
        T2(new l0(this, onConfirmed, k.f174606a, (Continuation) null, 19), new yi5.b(27));
    }

    @Override // yfk.a
    public final void b3(String giftedPlanId, Function0 onConfirmed) {
        Intrinsics.checkNotNullParameter(giftedPlanId, "giftedPlanId");
        Intrinsics.checkNotNullParameter(onConfirmed, "onConfirmed");
        l lVar = new l(giftedPlanId);
        if (!((jte.d) this.f174604n).c(PlanReferralsApi$Toggles.PremiumPlanReferral.f102518c)) {
            onConfirmed.invoke();
        } else {
            T2(new l0(this, onConfirmed, lVar, (Continuation) null, 19), new yi5.b(27));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r15) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jik.i.c3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(java.lang.String r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jik.i.d3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jik.g
            if (r0 == 0) goto L13
            r0 = r6
            jik.g r0 = (jik.g) r0
            int r1 = r0.f174600w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174600w = r1
            goto L18
        L13:
            jik.g r0 = new jik.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174600w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ffk.t r6 = r4.f174602l
            efm.d0 r5 = r6.f(r5)
            r0.f174600w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            od0.i r6 = (od0.i) r6
            java.lang.Object r5 = r6.f224257a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jik.i.e3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof jik.h
            if (r0 == 0) goto L13
            r0 = r6
            jik.h r0 = (jik.h) r0
            int r1 = r0.f174601w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174601w = r1
            goto L18
        L13:
            jik.h r0 = new jik.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174601w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            ffk.t r6 = r5.f174602l
            w4l.h r2 = w4l.h.f294642c
            efm.r r6 = r6.v(r2)
            jfb.v0 r2 = new jfb.v0
            r4 = 15
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            r0.f174601w = r3
            java.lang.Object r6 = nim.a.c(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jik.i.f3(gim.c):java.lang.Object");
    }
}
