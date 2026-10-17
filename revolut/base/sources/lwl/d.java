package lwl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (((bn2.r) r0).a(com.revolut.feature.backgroundpicker.models.RetailBackgroundKey.HelpCentre.f63828a, r6) != r1) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            lwl.e r0 = r6.v
            cm2.f r0 = r0.f200485b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            yhm.o.b(r7)
            goto L53
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            yhm.o.b(r7)
            goto L46
        L23:
            yhm.o.b(r7)
            goto L38
        L27:
            yhm.o.b(r7)
            com.revolut.feature.backgroundpicker.models.RetailBackgroundKey$InvestHome r7 = com.revolut.feature.backgroundpicker.models.RetailBackgroundKey.InvestHome.f63830b
            r6.u = r5
            r2 = r0
            bn2.r r2 = (bn2.r) r2
            java.lang.Object r7 = r2.a(r7, r6)
            if (r7 != r1) goto L38
            goto L52
        L38:
            com.revolut.feature.backgroundpicker.models.RetailBackgroundKey$CryptoHome r7 = com.revolut.feature.backgroundpicker.models.RetailBackgroundKey.CryptoHome.f63825b
            r6.u = r4
            r2 = r0
            bn2.r r2 = (bn2.r) r2
            java.lang.Object r7 = r2.a(r7, r6)
            if (r7 != r1) goto L46
            goto L52
        L46:
            r6.u = r3
            bn2.r r0 = (bn2.r) r0
            com.revolut.feature.backgroundpicker.models.RetailBackgroundKey$HelpCentre r7 = com.revolut.feature.backgroundpicker.models.RetailBackgroundKey.HelpCentre.f63828a
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lwl.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
