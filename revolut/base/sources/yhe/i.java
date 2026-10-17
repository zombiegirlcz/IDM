package yhe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r8 != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            yhe.l r0 = r7.v
            com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L27
            if (r3 == r6) goto L23
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            yhm.o.b(r8)
            goto L5f
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            yhm.o.b(r8)
            goto L49
        L23:
            yhm.o.b(r8)
            goto L3c
        L27:
            yhm.o.b(r8)
            vge.z2 r8 = r0.f313923r
            tge.d$c r3 = tge.d.c.f271168a
            vge.t3 r8 = (vge.t3) r8
            r8.w(r3)
            r7.u = r6
            java.lang.Object r8 = yhe.l.I2(r0, r7)
            if (r8 != r2) goto L3c
            goto L5e
        L3c:
            pfe.b r8 = r0.f313922q
            com.revolut.feature.tab.accounts.models.ProductAccountId r3 = r1.f89568b
            r7.u = r5
            java.lang.Object r8 = r8.h(r3, r7)
            if (r8 != r2) goto L49
            goto L5e
        L49:
            wa7.m r8 = r0.f313925t
            com.revolut.feature.tab.accounts.models.ProductAccountId r0 = r1.f89568b
            java.lang.String r0 = r0.f89729a
            r7.u = r4
            java.lang.String r1 = "HIDDEN_ACCOUNTS"
            java.lang.Object r8 = r8.l(r0, r1, r7)
            if (r8 != r2) goto L5a
            goto L5c
        L5a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L5c:
            if (r8 != r2) goto L5f
        L5e:
            return r2
        L5f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yhe.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
