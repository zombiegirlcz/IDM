package n54;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        if (r12 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e3, code lost:
    
        if (r12 == r3) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n54.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
