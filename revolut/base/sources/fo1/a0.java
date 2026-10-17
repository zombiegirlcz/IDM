package fo1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, Continuation continuation) {
        super(1, continuation);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r13 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r13 == r0) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.u
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            fo1.e0 r3 = r12.v
            r2 = 1
            r4 = 2
            if (r1 == 0) goto L20
            if (r1 == r2) goto L1c
            if (r1 != r4) goto L14
            yhm.o.b(r13)
            goto L66
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            yhm.o.b(r13)
            goto L3e
        L20:
            yhm.o.b(r13)
            com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreenContract$InputData r13 = r3.o
            qua.p r13 = r13.f61220c
            if (r13 == 0) goto L42
            wsg.n r1 = r3.f136744r
            java.lang.String r13 = r13.W
            if (r13 != 0) goto L31
            java.lang.String r13 = ""
        L31:
            efm.d0 r13 = r1.z(r5, r13)
            r12.u = r2
            java.lang.Object r13 = nim.a.b(r13, r12)
            if (r13 != r0) goto L3e
            goto L65
        L3e:
            io3.d r13 = (io3.d) r13
        L40:
            r4 = r13
            goto L69
        L42:
            opf.b r13 = r3.f136743q
            xi0.a r1 = xi0.b.Companion
            r1.getClass()
            xi0.b r1 = xi0.b.f306276m
            java.lang.String r2 = r1.f306286a
            java.util.Set r2 = zhm.y0.b(r2)
            java.lang.String r1 = r1.f306286a
            java.util.List r1 = zhm.v.l(r1)
            io3.l r6 = io3.l.CURRENT
            ufm.i r13 = r13.b(r2, r1, r6, r5)
            r12.u = r4
            java.lang.Object r13 = nim.a.b(r13, r12)
            if (r13 != r0) goto L66
        L65:
            return r0
        L66:
            io3.d r13 = (io3.d) r13
            goto L40
        L69:
            kotlin.jvm.internal.Intrinsics.h(r4)
            vo9.a r13 = r3.f136749y
            r0 = 4
            kotlinx.coroutines.flow.Flow r13 = vo9.a.a(r13, r4, r5, r0)
            a9h.a r2 = new a9h.a
            r6 = 0
            r7 = 8
            r2.<init>(r3, r4, r5, r6, r7)
            r11 = 3
            r8 = 0
            r9 = 0
            r7 = r13
            r10 = r2
            r6 = r3
            yji.l.a1(r6, r7, r8, r9, r10, r11)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: fo1.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
