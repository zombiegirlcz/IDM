package u99;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public wi0.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c f278422w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f278422w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f278422w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.I2(r6, r1, r8) == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c r6 = r8.f278422w
            r7 = 0
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            yhm.o.b(r9)
            goto Laa
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            wi0.b r1 = r8.u
            yhm.o.b(r9)
            goto L82
        L26:
            yhm.o.b(r9)
            goto L3c
        L2a:
            yhm.o.b(r9)
            ang.f r9 = r6.f78277r
            efm.d0 r9 = r9.f(r2)
            r8.v = r5
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L3c
            goto L92
        L3c:
            do3.n r9 = (do3.n) r9
            com.revolut.feature.address.models.Address r1 = r9.k
            if (r1 == 0) goto L47
            wi0.b r1 = nz8.d.g(r1)
            goto L48
        L47:
            r1 = r7
        L48:
            s99.j r5 = r6.f78280w
            r5.getClass()
            java.util.Set r5 = s99.j.f261148a
            java.util.Collection r5 = (java.util.Collection) r5
            wi0.b[] r2 = new wi0.b[r2]
            java.lang.Object[] r2 = r5.toArray(r2)
            wi0.b[] r2 = (wi0.b[]) r2
            int r5 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            wi0.b[] r2 = (wi0.b[]) r2
            boolean r9 = te0.w.T(r9, r2)
            if (r9 != 0) goto L6e
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput$FeatureAvailable r9 = com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput.FeatureAvailable.f78171a
            r6.K2(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L6e:
            cu8.r0 r9 = r6.v
            ks8.b r2 = ks8.c.Companion
            r2.getClass()
            ks8.c r2 = ks8.c.f
            r8.u = r1
            r8.v = r4
            java.lang.Object r9 = r9.f(r2, r8)
            if (r9 != r0) goto L82
            goto L92
        L82:
            ks8.j r9 = (ks8.j) r9
            boolean r2 = r9 instanceof ks8.j.a
            if (r2 == 0) goto L93
            r8.u = r7
            r8.v = r3
            java.lang.Object r9 = com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.I2(r6, r1, r8)
            if (r9 != r0) goto Laa
        L92:
            return r0
        L93:
            boolean r0 = r9 instanceof ks8.i
            if (r0 == 0) goto Lad
            ks8.i r9 = (ks8.i) r9
            com.revolut.retail.core.navigation.FeatureCommand r9 = r9.f189312a
            u99.e r0 = com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.Companion
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r9)
            r6.C1(r0)
            yki.i r9 = r6.z
            oki.h.D2(r9)
        Laa:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lad:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u99.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
