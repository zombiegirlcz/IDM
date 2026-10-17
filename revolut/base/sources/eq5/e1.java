package eq5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r8 == r2) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j r0 = r7.v
            cli.y r1 = r0.F
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            yhm.o.b(r8)
            goto L61
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto L3d
        L20:
            yhm.o.b(r8)
            ep2.l r8 = new ep2.l
            r3 = 23
            r8.<init>(r3)
            kotlinx.coroutines.flow.Flow r8 = r1.B(r8)
            vkm.t0 r3 = new vkm.t0
            r6 = 1
            r3.<init>(r8, r6)
            r7.u = r5
            java.lang.Object r8 = vkm.q.x(r3, r7)
            if (r8 != r2) goto L3d
            goto L60
        L3d:
            xi0.b r8 = (xi0.b) r8
            eq5.x0 r3 = r0.f71278q
            com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData r5 = r0.o
            com.revolut.feature.crypto.withdraw.api.models.CryptoAddress r5 = r5.getF71153a()
            wk5.a r5 = r5.f71063h
            wk5.k r5 = wk5.m.a(r5)
            r7.u = r4
            go5.e r4 = r3.i
            boolean r4 = r4.f145087b
            if (r4 == 0) goto L5a
            java.io.Serializable r8 = r3.l(r8, r7)
            goto L5e
        L5a:
            java.io.Serializable r8 = r3.m(r8, r5, r7)
        L5e:
            if (r8 != r2) goto L61
        L60:
            return r2
        L61:
            io3.d r8 = (io3.d) r8
            xi0.a r2 = xi0.b.Companion
            java.lang.String r3 = r8.f163147c
            boolean r2 = r6.b.B(r2, r3)
            if (r2 == 0) goto L70
            k1j.a r2 = k1j.a.CRYPTO
            goto L72
        L70:
            k1j.a r2 = k1j.a.POCKETS
        L72:
            eq4.c r3 = new eq4.c
            r4 = 8
            r3.<init>(r2, r8, r4)
            r0.H2(r1, r3)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
