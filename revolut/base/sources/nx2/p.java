package nx2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.d f220115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f220116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f220117y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z, com.revolut.feature.card_design.impl.card_design.d dVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f220115w = dVar;
        this.f220116x = str;
        this.f220117y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, this.f220115w, this.f220116x, this.f220117y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r6.p2(r16, r5) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r2 == r1) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            r3 = 2
            r4 = 1
            com.revolut.feature.card_design.impl.card_design.d r6 = r0.f220115w
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            yhm.o.b(r17)
            r2 = r17
            goto L56
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            yhm.o.b(r17)
            goto L3e
        L22:
            yhm.o.b(r17)
            boolean r2 = r0.v
            r9 = 0
            java.lang.String r8 = r0.f220117y
            java.lang.String r7 = r0.f220116x
            if (r2 == 0) goto L46
            mh1.d r5 = new mh1.d
            r10 = 19
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r4
            java.lang.Object r2 = r6.p2(r0, r5)
            if (r2 != r1) goto L3e
            goto L55
        L3e:
            yki.a r1 = r6.E
            oki.h.D2(r1)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L46:
            jld.h r5 = new jld.h
            r10 = 17
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r3
            java.lang.Object r2 = r6.p2(r0, r5)
            if (r2 != r1) goto L56
        L55:
            return r1
        L56:
            h93.f0 r2 = (h93.f0) r2
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r7 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination r8 = new com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination
            com.revolut.feature.card_screen.api.models.CardScreenAction$VirtualCardDesignChanged r13 = new com.revolut.feature.card_screen.api.models.CardScreenAction$VirtualCardDesignChanged
            kotlin.jvm.internal.Intrinsics.h(r2)
            r13.<init>(r2)
            r14 = 0
            r15 = 47
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r12 = 0
            r13 = 61
            r9 = r8
            r8 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.<init>(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = zh9.u0.b(r1)
            aii.n r1 = r6.C1(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nx2.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
