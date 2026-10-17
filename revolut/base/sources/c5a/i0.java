package c5a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gei.a f21493w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, gei.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f21493w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.v, this.f21493w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        if (r12 == r2) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5a.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
