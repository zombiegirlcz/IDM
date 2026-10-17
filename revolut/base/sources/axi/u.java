package axi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((fha.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u
            fha.a r0 = (fha.a) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            hha.d r5 = r0.f135190a
            hha.t r1 = hha.u.Companion
            r1.getClass()
            hha.u r2 = hha.u.f152365y
            boolean r5 = hha.s.h(r5, r2)
            com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c r3 = r4.v
            if (r5 != 0) goto L2b
            hha.d r5 = r0.f135191b
            r1.getClass()
            boolean r5 = hha.s.h(r5, r2)
            if (r5 == 0) goto L2b
            axi.m$b r5 = axi.m.b.f10959a
            r3.C2(r5)
            goto L30
        L2b:
            vii.b r5 = r3.C
            r5.a()
        L30:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: axi.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
