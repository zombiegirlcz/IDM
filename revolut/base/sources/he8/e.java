package he8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a.J2(r4, r5) == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a r4 = r5.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r6)
            goto L54
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L2c
        L1e:
            yhm.o.b(r6)
            cu8.r0 r6 = r4.f76879r
            r5.u = r3
            java.lang.Object r6 = ks8.m.b(r6, r5)
            if (r6 != r0) goto L2c
            goto L53
        L2c:
            ks8.j r6 = (ks8.j) r6
            boolean r1 = r6 instanceof ks8.i
            if (r1 == 0) goto L43
            ks8.i r6 = (ks8.i) r6
            com.revolut.retail.core.navigation.FeatureCommand r6 = r6.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r4.C1(r6)
            yki.a r6 = r4.f76881t
            oki.h.D2(r6)
            goto L54
        L43:
            ks8.j$a r1 = ks8.j.a.f189313a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r6 == 0) goto L57
            r5.u = r2
            java.lang.Object r6 = com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a.J2(r4, r5)
            if (r6 != r0) goto L54
        L53:
            return r0
        L54:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L57:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: he8.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
