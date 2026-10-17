package vy5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f293191w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w wVar, k kVar, Continuation continuation) {
        super(1, continuation);
        this.v = wVar;
        this.f293191w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f293191w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r14 == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.u
            vy5.w r2 = r13.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r14)
            goto L4f
        L12:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1a:
            yhm.o.b(r14)
            goto L2c
        L1e:
            yhm.o.b(r14)
            cu8.r0 r14 = r2.f293235r
            r13.u = r4
            java.lang.Object r14 = ks8.m.b(r14, r13)
            if (r14 != r0) goto L2c
            goto L4e
        L2c:
            ks8.j r14 = (ks8.j) r14
            boolean r1 = r14 instanceof ks8.i
            if (r1 == 0) goto L3c
            ks8.i r14 = (ks8.i) r14
            com.revolut.retail.core.navigation.FeatureCommand r14 = r14.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r14 = zh9.u0.b(r14)
            goto Lb0
        L3c:
            ks8.j$a r1 = ks8.j.a.f189313a
            boolean r14 = kotlin.jvm.internal.Intrinsics.f(r14, r1)
            if (r14 == 0) goto Lb6
            r13.u = r3
            vy5.k r14 = r13.f293191w
            java.lang.Object r14 = r14.invoke(r13)
            if (r14 != r0) goto L4f
        L4e:
            return r0
        L4f:
            io3.d r14 = (io3.d) r14
            if (r14 != 0) goto L56
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        L56:
            xi0.a r0 = xi0.b.Companion
            java.lang.String r1 = r14.f163147c
            r0.getClass()
            xi0.b r4 = xi0.a.a(r1)
            long r0 = r14.i
            r5 = 0
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 > 0) goto L7a
            com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig$Buy r3 = new com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig$Buy
            s0i.a r11 = s0i.a.HOME
            r12 = 1789(0x6fd, float:2.507E-42)
            r5 = r4
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L89
        L7a:
            r5 = r4
            com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig$Sell r3 = new com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig$Sell
            s0i.a r10 = s0i.a.HOME
            r11 = 1534(0x5fe, float:2.15E-42)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L89:
            com.revolut.retail.core.navigation.FeatureCommand r14 = gc0.c.f(r3)
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination r3 = new com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination
            grl.k9 r4 = frl.a.f137500l
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r5 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r5 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r4 = com.google.android.gms.internal.mlkit_vision_face.a.h(r4, r5, r4)
            r5 = 0
            r3.<init>(r14, r4, r5)
            yhi.b r14 = yhi.b.SOLID
            r4 = 0
            r5 = 12
            r1.<init>(r3, r14, r4, r5)
            r0.<init>(r1)
            com.revolut.kompot.bridge.navigation.BridgeDestination r14 = zh9.u0.b(r0)
        Lb0:
            r2.A2(r14)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        Lb6:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
