package g84;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw3.d f141264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardOfferFlowContract$InputData f141265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vw3.f f141266c;
    public nu3.c d;
    public final z1 e;

    public m(vw3.d creditCardOfferInteractor, CreditCardOfferFlowContract$InputData inputData, vw3.f prefetchedCreditCardOfferProvider) {
        Intrinsics.checkNotNullParameter(creditCardOfferInteractor, "creditCardOfferInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(prefetchedCreditCardOfferProvider, "prefetchedCreditCardOfferProvider");
        this.f141264a = creditCardOfferInteractor;
        this.f141265b = inputData;
        this.f141266c = prefetchedCreditCardOfferProvider;
        this.e = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, gim.c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof g84.g
            if (r0 == 0) goto L13
            r0 = r10
            g84.g r0 = (g84.g) r0
            int r1 = r0.f141255x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141255x = r1
            goto L18
        L13:
            g84.g r0 = new g84.g
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141255x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            long r8 = r0.u
            yhm.o.b(r10)
            goto L46
        L38:
            yhm.o.b(r10)
            r0.u = r8
            r0.f141255x = r4
            java.lang.Object r10 = r7.h(r0)
            if (r10 != r1) goto L46
            goto L66
        L46:
            nu3.c r10 = (nu3.c) r10
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData r2 = r7.f141265b
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r2 = r2.f67362b
            java.lang.String r2 = r2.f66892b
            java.lang.String r4 = r10.f219194a
            nu3.e r5 = new nu3.e
            nu3.f r10 = r10.f219195b
            java.lang.Integer r10 = r10.f219204c
            r6 = 0
            r5.<init>(r8, r10, r6)
            r0.u = r8
            r0.f141255x = r3
            vw3.d r8 = r7.f141264a
            java.lang.Object r8 = r8.a(r2, r4, r5, r0)
            if (r8 != r1) goto L67
        L66:
            return r1
        L67:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.m.a(long, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof g84.f
            if (r0 == 0) goto L13
            r0 = r7
            g84.f r0 = (g84.f) r0
            int r1 = r0.f141253w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141253w = r1
            goto L18
        L13:
            g84.f r0 = new g84.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141253w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L42
        L36:
            yhm.o.b(r7)
            r0.f141253w = r4
            java.lang.Object r7 = r6.h(r0)
            if (r7 != r1) goto L42
            goto L50
        L42:
            nu3.c r7 = (nu3.c) r7
            nu3.f r7 = r7.f219195b
            long r4 = r7.f219203b
            r0.f141253w = r3
            java.lang.Object r7 = r6.a(r4, r0)
            if (r7 != r1) goto L51
        L50:
            return r1
        L51:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.m.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r12, gim.c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof g84.j
            if (r0 == 0) goto L13
            r0 = r13
            g84.j r0 = (g84.j) r0
            int r1 = r0.f141260x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141260x = r1
            goto L18
        L13:
            g84.j r0 = new g84.j
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141260x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            return r13
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            int r12 = r0.u
            yhm.o.b(r13)
            goto L46
        L38:
            yhm.o.b(r13)
            r0.u = r12
            r0.f141260x = r4
            java.lang.Object r13 = r11.h(r0)
            if (r13 != r1) goto L46
            goto L7b
        L46:
            nu3.c r13 = (nu3.c) r13
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData r2 = r11.f141265b
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r2 = r2.f67362b
            java.lang.String r6 = r2.f66892b
            java.lang.String r7 = r13.f219194a
            nu3.e r8 = new nu3.e
            nu3.f r13 = r13.f219195b
            long r4 = r13.f219203b
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            r2 = 0
            r8.<init>(r4, r13, r2)
            r0.u = r12
            r0.f141260x = r3
            vw3.d r12 = r11.f141264a
            a34.c r5 = r12.f292618b
            r5.getClass()
            a34.a r4 = new a34.a
            r9 = 0
            r10 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.m.c(int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r12, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof g84.i
            if (r0 == 0) goto L13
            r0 = r14
            g84.i r0 = (g84.i) r0
            int r1 = r0.f141258x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141258x = r1
            goto L18
        L13:
            g84.i r0 = new g84.i
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141258x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            long r12 = r0.u
            yhm.o.b(r14)
            goto L46
        L38:
            yhm.o.b(r14)
            r0.u = r12
            r0.f141258x = r4
            java.lang.Object r14 = r11.h(r0)
            if (r14 != r1) goto L46
            goto L76
        L46:
            nu3.c r14 = (nu3.c) r14
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData r2 = r11.f141265b
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r2 = r2.f67362b
            java.lang.String r6 = r2.f66892b
            java.lang.String r7 = r14.f219194a
            nu3.e r8 = new nu3.e
            nu3.f r14 = r14.f219195b
            java.lang.Integer r14 = r14.f219204c
            r2 = 0
            r8.<init>(r12, r14, r2)
            r0.u = r12
            r0.f141258x = r3
            vw3.d r12 = r11.f141264a
            a34.c r5 = r12.f292618b
            r5.getClass()
            a34.a r4 = new a34.a
            r9 = 0
            r10 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L77
        L76:
            return r1
        L77:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.m.d(long, gim.c):java.lang.Object");
    }

    @Override // pf4.v
    public final z1 e() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pf4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(java.lang.String r4, gim.c r5) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r5 instanceof g84.k
            if (r4 == 0) goto L13
            r4 = r5
            g84.k r4 = (g84.k) r4
            int r0 = r4.f141261w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f141261w = r0
            goto L18
        L13:
            g84.k r4 = new g84.k
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f141261w
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r4.f141261w = r2
            java.lang.Object r5 = r3.h(r4)
            if (r5 != r0) goto L3b
            return r0
        L3b:
            nu3.c r5 = (nu3.c) r5
            cv3.s r4 = r5.f219196c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.m.f(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r14 == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pf4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.lang.String r12, cv3.u r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r12 = r14 instanceof g84.l
            if (r12 == 0) goto L13
            r12 = r14
            g84.l r12 = (g84.l) r12
            int r0 = r12.f141263x
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r12.f141263x = r0
            goto L18
        L13:
            g84.l r12 = new g84.l
            r12.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r12.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.f141263x
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            yhm.o.b(r14)
            goto Lb6
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            cv3.u r13 = r12.u
            yhm.o.b(r14)
            goto L48
        L39:
            yhm.o.b(r14)
            r12.u = r13
            r12.f141263x = r3
            java.lang.Object r14 = r11.h(r12)
            if (r14 != r0) goto L48
            goto Lb5
        L48:
            nu3.c r14 = (nu3.c) r14
            nu3.f r1 = r14.f219195b
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData r3 = r11.f141265b
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r3 = r3.f67362b
            java.lang.String r6 = r3.f66892b
            java.lang.String r7 = r14.f219194a
            nu3.e r8 = new nu3.e
            java.util.Map r13 = r13.f109270a
            java.lang.String r14 = "amountRequested"
            r3 = 0
            java.lang.Object r14 = r13.getOrDefault(r14, r3)
            boolean r4 = r14 instanceof java.lang.Long
            if (r4 != 0) goto L64
            r14 = r3
        L64:
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 != 0) goto L69
            r14 = r3
        L69:
            if (r14 == 0) goto L70
            long r4 = r14.longValue()
            goto L72
        L70:
            long r4 = r1.f219203b
        L72:
            java.lang.String r14 = "statementDueDay"
            java.lang.Object r14 = r13.getOrDefault(r14, r3)
            boolean r9 = r14 instanceof java.lang.Integer
            if (r9 != 0) goto L7d
            r14 = r3
        L7d:
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 != 0) goto L82
            r14 = r3
        L82:
            if (r14 != 0) goto L86
            java.lang.Integer r14 = r1.f219204c
        L86:
            java.lang.String r1 = "intendedPlan"
            java.lang.Object r13 = r13.getOrDefault(r1, r3)
            boolean r1 = r13 instanceof com.revolut.feature.credit.application.api.models.IntendedPricingPlan
            if (r1 != 0) goto L91
            r13 = r3
        L91:
            com.revolut.feature.credit.application.api.models.IntendedPricingPlan r13 = (com.revolut.feature.credit.application.api.models.IntendedPricingPlan) r13
            if (r13 != 0) goto L96
            r13 = r3
        L96:
            r8.<init>(r4, r14, r13)
            r12.u = r3
            r12.f141263x = r2
            vw3.d r13 = r11.f141264a
            a34.c r5 = r13.f292618b
            r5.getClass()
            a34.a r4 = new a34.a
            r9 = 0
            r10 = 2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r13, r4, r12)
            if (r14 != r0) goto Lb6
        Lb5:
            return r0
        Lb6:
            nu3.c r14 = (nu3.c) r14
            r11.d = r14
            cv3.s r12 = r14.f219196c
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.m.g(java.lang.String, cv3.u, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof g84.h
            if (r0 == 0) goto L13
            r0 = r13
            g84.h r0 = (g84.h) r0
            int r1 = r0.f141256w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141256w = r1
            goto L18
        L13:
            g84.h r0 = new g84.h
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141256w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            goto La1
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L30:
            yhm.o.b(r13)
            nu3.c r13 = r12.d
            if (r13 != 0) goto La7
            com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData r13 = r12.f141265b
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r2 = r13.f67362b
            java.lang.String r2 = r2.f66892b
            vw3.f r4 = r12.f141266c
            r4.getClass()
            java.lang.String r5 = "applicationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            xx4.d r4 = r4.f292623b
            vw3.a r5 = new vw3.a
            r5.<init>(r2)
            java.lang.Object r2 = r4.a(r5)
            nu3.c r2 = (nu3.c) r2
            r5 = 0
            if (r2 == 0) goto L7b
            java.lang.String r7 = r2.f219194a
            nu3.f r8 = r2.f219195b
            cv3.s r9 = r2.f219196c
            nu3.d r10 = r2.d
            nu3.g r11 = r2.e
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r2 = "parameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "offerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.lang.String r2 = "benefitsContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            nu3.c r6 = new nu3.c
            r6.<init>(r7, r8, r9, r10, r11)
            goto L7c
        L7b:
            r6 = r5
        L7c:
            ne0.j r2 = r4.f309396a
            r2.clear()
            if (r6 != 0) goto La6
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r13 = r13.f67362b
            java.lang.String r13 = r13.f66892b
            r0.f141256w = r3
            vw3.d r2 = r12.f141264a
            a34.c r2 = r2.f292618b
            r2.getClass()
            a34.b r3 = new a34.b
            r4 = 0
            r3.<init>(r2, r13, r5, r4)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r3, r0)
            if (r13 != r1) goto La1
            return r1
        La1:
            nu3.c r13 = (nu3.c) r13
            r12.d = r13
            return r13
        La6:
            return r6
        La7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.m.h(gim.c):java.lang.Object");
    }
}
