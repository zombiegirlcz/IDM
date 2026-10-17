package kye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class c2 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190719w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190719w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c2 c2Var = new c2(this.f190719w, continuation);
        c2Var.v = obj2;
        return c2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c2) create((SelectedMethod.StoredMethod.Card) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r8 == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r0.O2(r2, r7) == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        return r3;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kye.k3 r0 = r7.f190719w
            cli.y r1 = r0.f190763d0
            java.lang.Object r2 = r7.v
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod$StoredMethod$Card r2 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r7.u
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L24
            if (r4 == r6) goto L20
            if (r4 != r5) goto L18
            yhm.o.b(r8)
            goto L4c
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            yhm.o.b(r8)
            goto L7d
        L24:
            yhm.o.b(r8)
            com.revolut.domain.models.externalcards.CardholderVerificationStatus r8 = r2.k
            java.lang.String r2 = r2.f90903a
            if (r8 != 0) goto L2f
            r8 = -1
            goto L37
        L2f:
            int[] r4 = kye.b2.f190711a
            int r8 = r8.ordinal()
            r8 = r4[r8]
        L37:
            r4 = 0
            switch(r8) {
                case -1: goto L72;
                case 0: goto L3b;
                case 1: goto L59;
                case 2: goto L59;
                case 3: goto L59;
                case 4: goto L72;
                case 5: goto L72;
                case 6: goto L41;
                default: goto L3b;
            }
        L3b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L41:
            r7.v = r4
            r7.u = r5
            java.lang.Object r8 = kye.k3.I2(r0, r2, r7)
            if (r8 != r3) goto L4c
            goto L7c
        L4c:
            com.revolut.domain.models.externalcards.CardholderVerificationStatus r8 = (com.revolut.domain.models.externalcards.CardholderVerificationStatus) r8
            kv7.g r2 = new kv7.g
            r3 = 20
            r2.<init>(r8, r3)
            r0.H2(r1, r2)
            goto L7d
        L59:
            java.lang.Object r8 = r1.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            kye.m r8 = (kye.m) r8
            java.util.List r8 = r8.E
            if (r8 == 0) goto L7d
            kye.m0 r8 = new kye.m0
            r2 = 13
            r8.<init>(r2)
            r0.H2(r1, r8)
            goto L7d
        L72:
            r7.v = r4
            r7.u = r6
            java.lang.Object r8 = r0.O2(r2, r7)
            if (r8 != r3) goto L7d
        L7c:
            return r3
        L7d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
