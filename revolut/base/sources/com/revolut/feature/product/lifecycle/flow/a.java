package com.revolut.feature.product.lifecycle.flow;

import hx7.e;
import k7c.l0;
import ke7.v;
import kj4.c;
import kja.b;
import kja.f;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements f {
    public final ProductLifecycleFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ija.a f81209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f81210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f81211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f81212s;

    public a(ProductLifecycleFlowContract$InputData inputData, ija.a productLifecycleInteractor, b errorHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productLifecycleInteractor, "productLifecycleInteractor");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        this.o = inputData;
        this.f81209p = productLifecycleInteractor;
        this.f81210q = errorHandlerExtension;
        this.f81211r = e.b(this, new ProductLifecycleFlowContract$State(0));
        this.f81212s = d8l.d.a(this, new c(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r9 == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r9 == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.product.lifecycle.flow.a r8, gim.c r9) throws java.lang.Throwable {
        /*
            qki.d r0 = r8.f81211r
            boolean r1 = r9 instanceof kja.h
            if (r1 == 0) goto L15
            r1 = r9
            kja.h r1 = (kja.h) r1
            int r2 = r1.f184353w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f184353w = r2
            goto L1a
        L15:
            kja.h r1 = new kja.h
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f184353w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r9)
            goto L71
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            goto L52
        L38:
            yhm.o.b(r9)
            java.lang.Object r9 = r0.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$State r9 = (com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$State) r9
            java.lang.String r9 = r9.f81205a
            if (r9 != 0) goto L54
            r1.f184353w = r5
            java.lang.Object r9 = r8.J2(r1)
            if (r9 != r2) goto L52
            goto L70
        L52:
            java.lang.String r9 = (java.lang.String) r9
        L54:
            java.lang.Object r3 = r0.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$State r3 = (com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$State) r3
            java.util.List r3 = r3.f81206b
            java.lang.Object r3 = zhm.d0.d0(r3)
            com.revolut.feature.product.lifecycle.domain.models.Interaction r3 = (com.revolut.feature.product.lifecycle.domain.models.Interaction) r3
            if (r3 != 0) goto L7a
            r1.f184353w = r4
            java.lang.Object r9 = r8.K2(r9, r1)
            if (r9 != r2) goto L71
        L70:
            return r2
        L71:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = zhm.d0.d0(r9)
            r3 = r9
            com.revolut.feature.product.lifecycle.domain.models.Interaction r3 = (com.revolut.feature.product.lifecycle.domain.models.Interaction) r3
        L7a:
            if (r3 == 0) goto La9
            kh4.b r9 = new kh4.b
            r1 = 23
            r9.<init>(r1)
            r8.H2(r0, r9)
            com.revolut.feature.product.lifecycle.domain.models.InteractionParams r9 = r3.f81198c
            boolean r0 = r9 instanceof com.revolut.feature.product.lifecycle.domain.models.InteractionParams.Workflow
            if (r0 == 0) goto La3
            java.lang.String r0 = r3.f81196a
            com.revolut.feature.product.lifecycle.domain.models.InteractionParams$Workflow r9 = (com.revolut.feature.product.lifecycle.domain.models.InteractionParams.Workflow) r9
            java.lang.String r9 = r9.f81201a
            yki.i r2 = r8.f81212s
            com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$Step$Workflow r3 = new com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$Step$Workflow
            r3.<init>(r0, r9)
            r6 = 0
            r7 = 12
            r4 = 0
            r5 = 0
            r1 = r8
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
            goto Laf
        La3:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        La9:
            r1 = r8
            kja.q r8 = kja.q.f184363a
            r1.C2(r8)
        Laf:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.product.lifecycle.flow.a.I2(com.revolut.feature.product.lifecycle.flow.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof kja.i
            if (r0 == 0) goto L13
            r0 = r12
            kja.i r0 = (kja.i) r0
            int r1 = r0.f184354w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184354w = r1
            goto L18
        L13:
            kja.i r0 = new kja.i
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184354w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L59
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2f:
            yhm.o.b(r12)
            com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$InputData r12 = r11.o
            java.lang.String r7 = r12.f81202a
            java.lang.String r8 = r12.f81203b
            java.lang.String r9 = r12.f81204c
            r0.f184354w = r3
            ija.a r12 = r11.f81209p
            dja.c r12 = r12.f161753a
            r6 = r12
            dja.f r6 = (dja.f) r6
            r6.getClass()
            c5a.m0 r4 = new c5a.m0
            r10 = 0
            r5 = 28
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L59
            return r1
        L59:
            java.lang.String r12 = (java.lang.String) r12
            k7c.n r0 = new k7c.n
            r1 = 9
            r0.<init>(r12, r1)
            qki.d r1 = r11.f81211r
            r11.H2(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.product.lifecycle.flow.a.J2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(java.lang.String r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kja.j
            if (r0 == 0) goto L13
            r0 = r6
            kja.j r0 = (kja.j) r0
            int r1 = r0.f184355w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184355w = r1
            goto L18
        L13:
            kja.j r0 = new kja.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184355w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f184355w = r3
            ija.a r6 = r4.f81209p
            dja.c r6 = r6.f161753a
            dja.f r6 = (dja.f) r6
            r6.getClass()
            dja.e r2 = new dja.e
            r3 = 0
            r2.<init>(r6, r5, r3)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r5, r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            jja.b r6 = (jja.b) r6
            java.util.ArrayList r5 = r6.f174806a
            jeg.i r6 = new jeg.i
            r0 = 5
            r6.<init>(r0, r5)
            qki.d r0 = r4.f81211r
            r4.H2(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.product.lifecycle.flow.a.K2(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new l0(this, null, 16), new v(this, 11));
    }

    @Override // qki.e
    public final d getState() {
        return this.f81211r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f81212s;
    }
}
