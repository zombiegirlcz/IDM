package com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer;

import kotlin.jvm.internal.Intrinsics;
import pf4.v;
import tx3.d;
import ukm.f;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx3.b f68162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OverdraftOfferFlowContract$InputData f68163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f68164c;
    public dv3.a d;
    public final z1 e;

    public a(tx3.b overdraftOfferInteractor, OverdraftOfferFlowContract$InputData inputData, d prefetchedOverdraftOfferProvider) {
        Intrinsics.checkNotNullParameter(overdraftOfferInteractor, "overdraftOfferInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(prefetchedOverdraftOfferProvider, "prefetchedOverdraftOfferProvider");
        this.f68162a = overdraftOfferInteractor;
        this.f68163b = inputData;
        this.f68164c = prefetchedOverdraftOfferProvider;
        this.e = q.b(0, 2, f.DROP_OLDEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ag4.c
            if (r0 == 0) goto L13
            r0 = r11
            ag4.c r0 = (ag4.c) r0
            int r1 = r0.f4778y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4778y = r1
            goto L18
        L13:
            ag4.c r0 = new ag4.c
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f4776w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f4778y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r11)
            return r11
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            ft3.h1 r2 = r0.v
            tx3.b r4 = r0.u
            yhm.o.b(r11)
        L39:
            r6 = r2
            goto L57
        L3b:
            yhm.o.b(r11)
            com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$InputData r11 = r10.f68163b
            ft3.h1 r2 = r11.a9()
            tx3.b r11 = r10.f68162a
            r0.u = r11
            r0.v = r2
            r0.f4778y = r4
            java.lang.Object r4 = r10.b(r0)
            if (r4 != r1) goto L53
            goto L77
        L53:
            r6 = r4
            r4 = r11
            r11 = r6
            goto L39
        L57:
            dv3.a r11 = (dv3.a) r11
            cv3.u r7 = r11.f118023a
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f4778y = r3
            x34.b r5 = r4.f275322a
            r5.getClass()
            x34.a r4 = new x34.a
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L78
        L77:
            return r1
        L78:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ag4.d
            if (r0 == 0) goto L13
            r0 = r9
            ag4.d r0 = (ag4.d) r0
            int r1 = r0.f4779w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4779w = r1
            goto L18
        L13:
            ag4.d r0 = new ag4.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f4779w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L91
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            dv3.a r9 = r8.d
            if (r9 != 0) goto L97
            com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$InputData r9 = r8.f68163b
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r2 = r9.f68159a
            java.lang.String r2 = r2.f66892b
            tx3.d r4 = r8.f68164c
            r4.getClass()
            java.lang.String r5 = "applicationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            xx4.d r4 = r4.f275327b
            tx3.a r5 = new tx3.a
            r5.<init>(r2)
            java.lang.Object r2 = r4.a(r5)
            dv3.a r2 = (dv3.a) r2
            r5 = 0
            if (r2 == 0) goto L6a
            cv3.u r6 = r2.f118023a
            cv3.s r2 = r2.f118024b
            java.lang.String r7 = "offerParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.lang.String r7 = "offerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            dv3.a r7 = new dv3.a
            r7.<init>(r6, r2)
            goto L6b
        L6a:
            r7 = r5
        L6b:
            ne0.j r2 = r4.f309396a
            r2.clear()
            if (r7 != 0) goto L96
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r9 = r9.f68159a
            java.lang.String r9 = r9.f66892b
            r0.f4779w = r3
            tx3.b r2 = r8.f68162a
            x34.b r2 = r2.f275322a
            r2.getClass()
            wtj.f r3 = new wtj.f
            r4 = 17
            r3.<init>(r2, r9, r5, r4)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r3, r0)
            if (r9 != r1) goto L91
            return r1
        L91:
            dv3.a r9 = (dv3.a) r9
            r8.d = r9
            return r9
        L96:
            return r7
        L97:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a.b(gim.c):java.lang.Object");
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
            boolean r4 = r5 instanceof ag4.e
            if (r4 == 0) goto L13
            r4 = r5
            ag4.e r4 = (ag4.e) r4
            int r0 = r4.f4780w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f4780w = r0
            goto L18
        L13:
            ag4.e r4 = new ag4.e
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f4780w
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
            r4.f4780w = r2
            java.lang.Object r5 = r3.b(r4)
            if (r5 != r0) goto L3b
            return r0
        L3b:
            dv3.a r5 = (dv3.a) r5
            cv3.s r4 = r5.f118024b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a.f(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pf4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.lang.String r10, cv3.u r11, gim.c r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r10 = r12 instanceof ag4.f
            if (r10 == 0) goto L13
            r10 = r12
            ag4.f r10 = (ag4.f) r10
            int r0 = r10.f4781w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r10.f4781w = r0
            goto L18
        L13:
            ag4.f r10 = new ag4.f
            r10.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r10.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.f4781w
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            yhm.o.b(r12)
            goto L54
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r12)
            com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$InputData r12 = r9.f68163b
            ft3.h1 r5 = r12.a9()
            r10.f4781w = r2
            tx3.b r12 = r9.f68162a
            x34.b r4 = r12.f275322a
            r4.getClass()
            x34.a r3 = new x34.a
            r8 = 1
            r7 = 0
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r11, r3, r10)
            if (r12 != r0) goto L54
            return r0
        L54:
            dv3.a r12 = (dv3.a) r12
            r9.d = r12
            cv3.s r10 = r12.f118024b
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a.g(java.lang.String, cv3.u, gim.c):java.io.Serializable");
    }
}
