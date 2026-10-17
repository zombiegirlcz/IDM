package pa3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ma3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f234332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l61.a f234333b;

    public c(gte.a featureToggleInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f234332a = featureToggleInteractor;
        this.f234333b = userCompanyInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xfa.b r31, com.revolut.core.model.account.AccountId r32, com.revolut.retail.core.navigation.NaviCommand r33, pi3.h r34, com.revolut.analytics.tracking.v3.AnalyticsProduct r35, gim.c r36) {
        /*
            r30 = this;
            r0 = r30
            r1 = r36
            boolean r2 = r1 instanceof pa3.a
            if (r2 == 0) goto L17
            r2 = r1
            pa3.a r2 = (pa3.a) r2
            int r3 = r2.B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.B = r3
            goto L1c
        L17:
            pa3.a r2 = new pa3.a
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.z
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.B
            r5 = 1
            if (r4 == 0) goto L47
            if (r4 != r5) goto L3f
            com.revolut.analytics.tracking.v3.AnalyticsProduct r3 = r2.f234330y
            com.revolut.analytics.tracking.v3.AnalyticsProduct r3 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r3
            pi3.h r4 = r2.f234329x
            com.revolut.retail.core.navigation.NaviCommand r5 = r2.f234328w
            com.revolut.core.model.account.AccountId r6 = r2.v
            xfa.b r2 = r2.u
            yhm.o.b(r1)
            r15 = r2
            r20 = r3
            r16 = r4
            r17 = r5
            r4 = r6
            goto L71
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L47:
            yhm.o.b(r1)
            r1 = r31
            r2.u = r1
            r4 = r32
            r2.v = r4
            r6 = r33
            r2.f234328w = r6
            r7 = r34
            r2.f234329x = r7
            r8 = r35
            com.revolut.analytics.tracking.v3.AnalyticsProduct r8 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r8
            r2.f234330y = r8
            r2.B = r5
            java.lang.Object r2 = r0.c(r2)
            if (r2 != r3) goto L69
            return r3
        L69:
            r20 = r35
            r15 = r1
            r1 = r2
            r17 = r6
            r16 = r7
        L71:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r11 = 0
            if (r1 == 0) goto L8e
            com.revolut.feature.card_order_new.api.navigation.CardSubtypePickerDestination r1 = new com.revolut.feature.card_order_new.api.navigation.CardSubtypePickerDestination
            e13.a r2 = e13.a.PHYSICAL
            r3 = 0
            r6 = r11
            r7 = r16
            r5 = r17
            r8 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.revolut.retail.core.navigation.FeatureCommand r1 = zh9.u0.f(r1)
            return r1
        L8e:
            b93.e r5 = b93.e.PHYSICAL
            e93.l0 r21 = e93.l0.DEFAULT
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            r6 = r4
            com.revolut.feature.card_design.api.CardDesignFeatureConfig r4 = new com.revolut.feature.card_design.api.CardDesignFeatureConfig
            r28 = 0
            r29 = 522529082(0x1f25293a, float:3.497421E-20)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 1
            r14 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.<init>(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pa3.c.b(xfa.b, com.revolut.core.model.account.AccountId, com.revolut.retail.core.navigation.NaviCommand, pi3.h, com.revolut.analytics.tracking.v3.AnalyticsProduct, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof pa3.b
            if (r0 == 0) goto L13
            r0 = r5
            pa3.b r0 = (pa3.b) r0
            int r1 = r0.f234331w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f234331w = r1
            goto L18
        L13:
            pa3.b r0 = new pa3.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f234331w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.cards_core.api.CardsCoreApi$Toggles$LocalComboCardsImprovements r5 = com.revolut.feature.cards_core.api.CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c
            gte.a r2 = r4.f234332a
            jte.d r2 = (jte.d) r2
            boolean r5 = r2.c(r5)
            if (r5 != 0) goto L41
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L41:
            l61.a r5 = r4.f234333b
            ang.b r5 = (ang.b) r5
            efm.d0 r5 = r5.a()
            r0.f234331w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            l71.d r5 = (l71.d) r5
            kotlin.jvm.internal.Intrinsics.h(r5)
            boolean r5 = l71.f.a(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pa3.c.c(gim.c):java.lang.Object");
    }
}
