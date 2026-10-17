package j54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends yji.n implements v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mri.w f171584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xq3.j f171585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hy3.j f171586n;
    public final vie.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f171587p;

    public y(mri.w revolutJobInteractor, xq3.j creditAcknowledgementInteractor, hy3.j otherCreditProductsAvailabilityInteractor, vie.i tabCreditPreferencesInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(creditAcknowledgementInteractor, "creditAcknowledgementInteractor");
        Intrinsics.checkNotNullParameter(otherCreditProductsAvailabilityInteractor, "otherCreditProductsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tabCreditPreferencesInteractor, "tabCreditPreferencesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f171584l = revolutJobInteractor;
        this.f171585m = creditAcknowledgementInteractor;
        this.f171586n = otherCreditProductsAvailabilityInteractor;
        this.o = tabCreditPreferencesInteractor;
        this.f171587p = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r7, com.revolut.retail.core.navigation.NaviCommand r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof j54.w
            if (r0 == 0) goto L13
            r0 = r9
            j54.w r0 = (j54.w) r0
            int r1 = r0.f171576x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171576x = r1
            goto L18
        L13:
            j54.w r0 = new j54.w
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171576x
            mri.w r3 = r6.f171584l
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r5) goto L2e
            com.revolut.retail.core.navigation.NaviCommand r7 = r0.u
            yhm.o.b(r9)
            goto L5b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.revolut.retail.core.navigation.NaviCommand r8 = r0.u
            yhm.o.b(r9)
            goto L4f
        L3c:
            yhm.o.b(r9)
            mri.w.r0(r3, r7)
            r0.u = r8
            r0.f171576x = r4
            xq3.j r9 = r6.f171585m
            java.lang.Object r7 = r9.a(r7, r0)
            if (r7 != r1) goto L4f
            goto L59
        L4f:
            r0.u = r8
            r0.f171576x = r5
            java.lang.Object r7 = r6.b3(r0)
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            r7 = r8
        L5b:
            pw5.a.x(r3)
            aii.o r8 = r6.r2()
            j54.t$c r9 = new j54.t$c
            r9.<init>(r7)
            r8.M0(r9)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.y.Z2(java.lang.String, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r6 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j54.x
            if (r0 == 0) goto L13
            r0 = r6
            j54.x r0 = (j54.x) r0
            int r1 = r0.f171580w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171580w = r1
            goto L18
        L13:
            j54.x r0 = new j54.x
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171580w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L78
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L53
        L36:
            yhm.o.b(r6)
            com.revolut.feature.tab.credit.api.TabCreditApi$Toggles$CreditTab r6 = com.revolut.feature.tab.credit.api.TabCreditApi$Toggles$CreditTab.f89768c
            gte.a r2 = r5.f171587p
            jte.d r2 = (jte.d) r2
            boolean r6 = r2.c(r6)
            if (r6 != 0) goto L48
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L48:
            r0.f171580w = r4
            hy3.j r6 = r5.f171586n
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L53
            goto L77
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5e
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L5e:
            r0.f171580w = r3
            vie.i r6 = r5.o
            boolean r2 = r6.a()
            if (r2 == 0) goto L73
            r2 = 0
            java.lang.Object r6 = r6.c(r2, r0)
            if (r6 != r1) goto L70
            goto L75
        L70:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            goto L75
        L73:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L75:
            if (r6 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.y.b3(gim.c):java.lang.Object");
    }
}
