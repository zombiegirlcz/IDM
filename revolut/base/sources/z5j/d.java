package z5j;

import cu8.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj3.a f319635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f319636b;

    public d(tj3.a commodityFeatureEnabledInteractor, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(commodityFeatureEnabledInteractor, "commodityFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.f319635a = commodityFeatureEnabledInteractor;
        this.f319636b = kycRequiredActionTransformer;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(wd6.e r11, xi0.b r12, com.revolut.retail.core.navigation.FeatureCommand r13, gim.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof z5j.b
            if (r0 == 0) goto L13
            r0 = r14
            z5j.b r0 = (z5j.b) r0
            int r1 = r0.f319632w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319632w = r1
            goto L18
        L13:
            z5j.b r0 = new z5j.b
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319632w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r14)
            goto Lae
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r14)
            int[] r14 = z5j.a.f319631a
            int r11 = r11.ordinal()
            r11 = r14[r11]
            if (r11 == r3) goto L65
            r14 = 2
            if (r11 != r14) goto L5f
            com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowDestination r11 = new com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowDestination
            com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig r4 = new com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig
            m6j.a r5 = m6j.a.SELL
            m6j.b r6 = m6j.b.MARKET
            com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$FullPocketDescriptor r7 = new com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$FullPocketDescriptor
            l6j.c r14 = l6j.c.RETAIL_POCKET
            r7.<init>(r12, r14)
            com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$PocketTypeDescriptor r8 = new com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$PocketTypeDescriptor
            r8.<init>(r14)
            java.util.Set r9 = zhm.y0.b(r14)
            r4.<init>(r5, r6, r7, r8, r9)
            r11.<init>(r4, r13)
            goto L7f
        L5f:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L65:
            com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowDestination r11 = new com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowDestination
            com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig r4 = new com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig
            m6j.a r5 = m6j.a.BUY
            m6j.b r6 = m6j.b.MARKET
            com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$FullPocketDescriptor r7 = new com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$FullPocketDescriptor
            l6j.c r14 = l6j.c.RETAIL_POCKET
            r7.<init>(r12, r14)
            r8 = 0
            java.util.Set r9 = zhm.y0.b(r14)
            r4.<init>(r5, r6, r7, r8, r9)
            r11.<init>(r4, r13)
        L7f:
            tj3.a r12 = r10.f319635a
            zj3.a r12 = (zj3.a) r12
            java.lang.String r13 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            efm.d0 r12 = r12.a()
            zhf.f r13 = new zhf.f
            r14 = 4
            r13.<init>(r11, r14)
            zii.e r11 = new zii.e
            r14 = 1
            r11.<init>(r13, r14)
            r12.getClass()
            ufm.i r13 = new ufm.i
            r13.<init>(r12, r11, r14)
            java.lang.String r11 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            r0.f319632w = r3
            java.lang.Object r14 = nim.a.b(r13, r0)
            if (r14 != r1) goto Lae
            return r1
        Lae:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z5j.d.a(wd6.e, xi0.b, com.revolut.retail.core.navigation.FeatureCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r12 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xi0.b r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof z5j.c
            if (r0 == 0) goto L13
            r0 = r12
            z5j.c r0 = (z5j.c) r0
            int r1 = r0.f319634x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319634x = r1
            goto L18
        L13:
            z5j.c r0 = new z5j.c
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319634x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            goto L9e
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            xi0.b r11 = r0.u
            yhm.o.b(r12)
            goto L48
        L38:
            yhm.o.b(r12)
            r0.u = r11
            r0.f319634x = r4
            cu8.r0 r12 = r10.f319636b
            java.lang.Object r12 = ks8.m.b(r12, r0)
            if (r12 != r1) goto L48
            goto L9d
        L48:
            ks8.j r12 = (ks8.j) r12
            ks8.j$a r2 = ks8.j.a.f189313a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r12, r2)
            if (r2 == 0) goto La6
            com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowDestination r12 = new com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowDestination
            com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig r4 = new com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig
            m6j.a r5 = m6j.a.BUY
            m6j.b r6 = m6j.b.RECURRING
            com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$FullPocketDescriptor r7 = new com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$FullPocketDescriptor
            l6j.c r2 = l6j.c.RETAIL_POCKET
            r7.<init>(r11, r2)
            r8 = 0
            java.util.Set r9 = zhm.y0.b(r2)
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 0
            r12.<init>(r4, r11)
            tj3.a r2 = r10.f319635a
            zj3.a r2 = (zj3.a) r2
            java.lang.String r4 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            efm.d0 r2 = r2.a()
            zhf.f r4 = new zhf.f
            r5 = 4
            r4.<init>(r12, r5)
            zii.e r12 = new zii.e
            r5 = 1
            r12.<init>(r4, r5)
            r2.getClass()
            ufm.i r4 = new ufm.i
            r4.<init>(r2, r12, r5)
            java.lang.String r12 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r12)
            r0.u = r11
            r0.f319634x = r3
            java.lang.Object r12 = nim.a.b(r4, r0)
            if (r12 != r1) goto L9e
        L9d:
            return r1
        L9e:
            com.revolut.kompot.bridge.navigation.KompotDestination r12 = (com.revolut.kompot.bridge.navigation.KompotDestination) r12
            java.lang.String r11 = "let(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            return r12
        La6:
            boolean r11 = r12 instanceof ks8.i
            if (r11 == 0) goto Lb3
            ks8.i r12 = (ks8.i) r12
            com.revolut.retail.core.navigation.FeatureCommand r11 = r12.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = zh9.u0.b(r11)
            return r11
        Lb3:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z5j.d.b(xi0.b, gim.c):java.lang.Object");
    }
}
