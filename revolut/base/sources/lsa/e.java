package lsa;

import kotlin.jvm.internal.Intrinsics;
import osa.f;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements n5k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vsa.a f199658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f199659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f199660c;

    public e(vsa.a transferDataObservable, f flowInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(transferDataObservable, "transferDataObservable");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f199658a = transferDataObservable;
        this.f199659b = flowInteractor;
        this.f199660c = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lsa.c
            if (r0 == 0) goto L13
            r0 = r5
            lsa.c r0 = (lsa.c) r0
            int r1 = r0.f199656w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199656w = r1
            goto L18
        L13:
            lsa.c r0 = new lsa.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199656w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            vsa.a r5 = r4.f199658a
            ihm.j r5 = r5.f255130a
            r0.f199656w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r5 = (com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData) r5
            xi0.b r5 = r5.d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lsa.e.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lsa.d
            if (r0 == 0) goto L13
            r0 = r5
            lsa.d r0 = (lsa.d) r0
            int r1 = r0.f199657w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199657w = r1
            goto L18
        L13:
            lsa.d r0 = new lsa.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199657w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            vsa.a r5 = r4.f199658a
            ihm.j r5 = r5.f255130a
            r0.f199657w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r5 = (com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData) r5
            xi0.b r5 = r5.f81529c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lsa.e.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof lsa.b
            if (r2 == 0) goto L17
            r2 = r1
            lsa.b r2 = (lsa.b) r2
            int r3 = r2.f199655x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f199655x = r3
            goto L1c
        L17:
            lsa.b r2 = new lsa.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f199655x
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3c
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r2 = r2.u
            yhm.o.b(r1)
            goto L67
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            yhm.o.b(r1)
            goto L4c
        L3c:
            yhm.o.b(r1)
            vsa.a r1 = r0.f199658a
            ihm.j r1 = r1.f255130a
            r2.f199655x = r6
            java.lang.Object r1 = nim.a.c(r1, r2)
            if (r1 != r3) goto L4c
            goto L61
        L4c:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r1 = (com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData) r1
            kotlin.jvm.internal.Intrinsics.h(r1)
            osa.f r4 = r0.f199659b
            vkm.v1 r4 = r4.c(r1)
            r2.u = r1
            r2.f199655x = r5
            java.lang.Object r2 = vkm.q.x(r4, r2)
            if (r2 != r3) goto L62
        L61:
            return r3
        L62:
            r17 = r2
            r2 = r1
            r1 = r17
        L67:
            kqa.a r1 = (kqa.a) r1
            dj0.d r7 = r1.a()
            dj0.d r6 = r1.f188350a
            n9l.a r5 = new n9l.a
            xi0.b r9 = r6.f115083b
            dj0.d r3 = r1.f188351b
            xi0.b r10 = r3.f115083b
            double r11 = r1.e
            r14 = 0
            r15 = 0
            r13 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r13, r14, r15)
            dj0.d r4 = r2.f81532j
            java.lang.String r3 = r1.f188358n
            if (r3 == 0) goto L8c
            java.lang.String r8 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r8)
            goto L8d
        L8c:
            r3 = 0
        L8d:
            mga.f r15 = new mga.f
            r15.<init>(r3)
            com.revolut.feature.transfer.models.quotes.CreditCardInterest r3 = r1.k
            boolean r9 = cp5.d.c(r3)
            com.revolut.feature.transfer.core.models.FundingSource r11 = r2.e
            nrf.e r12 = r1.i
            l5k.e r3 = new l5k.e
            r14 = 0
            r16 = 9600(0x2580, float:1.3452E-41)
            r8 = 0
            r10 = 0
            r13 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lsa.e.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof lsa.a
            if (r2 == 0) goto L17
            r2 = r1
            lsa.a r2 = (lsa.a) r2
            int r3 = r2.f199653x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f199653x = r3
            goto L1e
        L17:
            lsa.a r2 = new lsa.a
            gim.c r1 = (gim.c) r1
            r2.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f199653x
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3e
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r2 = r2.u
            yhm.o.b(r1)
            goto L69
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            yhm.o.b(r1)
            goto L4e
        L3e:
            yhm.o.b(r1)
            vsa.a r1 = r0.f199658a
            ihm.j r1 = r1.f255130a
            r2.f199653x = r6
            java.lang.Object r1 = nim.a.c(r1, r2)
            if (r1 != r3) goto L4e
            goto L63
        L4e:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r1 = (com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData) r1
            kotlin.jvm.internal.Intrinsics.h(r1)
            osa.f r4 = r0.f199659b
            vkm.v1 r4 = r4.c(r1)
            r2.u = r1
            r2.f199653x = r5
            java.lang.Object r2 = vkm.q.x(r4, r2)
            if (r2 != r3) goto L64
        L63:
            return r3
        L64:
            r20 = r2
            r2 = r1
            r1 = r20
        L69:
            kqa.a r1 = (kqa.a) r1
            nrf.e r3 = r1.i
            dj0.d r4 = r1.f188352c
            dj0.d r7 = r1.d
            r5 = 0
            if (r3 == 0) goto L7c
            nrf.a r6 = nrf.a.TransferFtt
            dj0.d r3 = x5d.b.i(r3, r6)
            r12 = r3
            goto L7d
        L7c:
            r12 = r5
        L7d:
            java.lang.String r3 = r1.f188358n
            if (r3 == 0) goto L87
            java.lang.String r6 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            goto L88
        L87:
            r3 = r5
        L88:
            com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles$RevampedPremiumContextualBanners r6 = com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBanners.f80974c
            gte.a r8 = r0.f199660c
            jte.d r8 = (jte.d) r8
            boolean r6 = r8.c(r6)
            if (r6 == 0) goto L9c
            mga.f r5 = new mga.f
            r5.<init>(r3)
        L99:
            r18 = r5
            goto La1
        L9c:
            mga.d0 r5 = q5k.a.b(r7, r4, r5, r5, r3)
            goto L99
        La1:
            l5k.b r6 = new l5k.b
            l5k.a r3 = l5k.a.PLAIN_FEES
            r6.<init>(r4, r3)
            dj0.d r13 = r1.a()
            com.revolut.feature.transfer.core.models.FundingSource r1 = r2.e
            l5k.d r5 = new l5k.d
            r17 = 0
            r19 = 26624(0x6800, float:3.7308E-41)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            l5k.h r14 = l5k.h.f192332a
            r15 = 0
            r16 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lsa.e.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
