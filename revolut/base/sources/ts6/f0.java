package ts6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.v = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r7 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r7 == r0) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            ts6.s0 r2 = r6.v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            yhm.o.b(r7)
            goto L5e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            yhm.o.b(r7)
            goto L47
        L21:
            yhm.o.b(r7)
            goto L35
        L25:
            yhm.o.b(r7)
            gr6.j r7 = r2.f274027h
            r6.u = r5
            et6.k1 r7 = (et6.k1) r7
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r0) goto L35
            goto L5d
        L35:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L4f
            r6.u = r4
            r7 = 0
            java.lang.Object r7 = r2.d(r7, r7, r6)
            if (r7 != r0) goto L47
            goto L5d
        L47:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r7)
            return r0
        L4f:
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$ReferralInfoDestination r7 = com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig.ReferralInfoDestination.f73241a
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r7 = zh9.u0.d(r7)
            r6.u = r3
            java.lang.Object r7 = r2.c(r7, r6)
            if (r7 != r0) goto L5e
        L5d:
            return r0
        L5e:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ts6.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
