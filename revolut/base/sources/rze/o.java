package rze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.J2(r7, r9) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.I2(r7, r9) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.K2(r7, r9) == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a r7 = r9.v
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L17
            if (r1 == r3) goto L17
            if (r1 != r2) goto L1c
        L17:
            yhm.o.b(r10)
            goto Laf
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            yhm.o.b(r10)
            goto L7c
        L28:
            yhm.o.b(r10)
            goto L3b
        L2c:
            yhm.o.b(r10)
            cu8.r0 r10 = r7.v
            r9.u = r6
            java.lang.Object r10 = ks8.m.b(r10, r9)
            if (r10 != r0) goto L3b
            goto Lae
        L3b:
            ks8.j r10 = (ks8.j) r10
            boolean r1 = r10 instanceof ks8.i
            if (r1 == 0) goto L57
            rze.f r0 = new rze.f
            ks8.i r10 = (ks8.i) r10
            com.revolut.retail.core.navigation.FeatureCommand r10 = r10.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = zh9.u0.b(r10)
            r0.<init>(r10)
            r7.C2(r0)
            yki.i r10 = r7.f91030w
            oki.h.D2(r10)
            goto Laf
        L57:
            boolean r10 = r10 instanceof ks8.j.a
            if (r10 == 0) goto Lb2
            fk3.a r10 = r7.f91026q
            w4l.j r1 = w4l.j.f294644c
            ik3.c r10 = (ik3.c) r10
            e7l.g$b r8 = e7l.g.b.f123407a
            efm.r r10 = r10.l(r8, r1)
            ryd.l r1 = new ryd.l
            r8 = 15
            r1.<init>(r8)
            r8 = 0
            efm.r r10 = m70.a.g(r10, r8, r1, r6)
            r9.u = r5
            java.lang.Object r10 = nim.a.c(r10, r9)
            if (r10 != r0) goto L7c
            goto Lae
        L7c:
            e7l.f r10 = (e7l.f) r10
            e7l.a r10 = r10.C0
            int[] r1 = rze.n.f258605a
            int r10 = r10.ordinal()
            r10 = r1[r10]
            if (r10 == r6) goto La6
            if (r10 == r5) goto L9d
            if (r10 != r4) goto L97
            r9.u = r2
            java.lang.Object r10 = com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.J2(r7, r9)
            if (r10 != r0) goto Laf
            goto Lae
        L97:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L9d:
            r9.u = r3
            java.lang.Object r10 = com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.I2(r7, r9)
            if (r10 != r0) goto Laf
            goto Lae
        La6:
            r9.u = r4
            java.lang.Object r10 = com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.K2(r7, r9)
            if (r10 != r0) goto Laf
        Lae:
            return r0
        Laf:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lb2:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rze.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
