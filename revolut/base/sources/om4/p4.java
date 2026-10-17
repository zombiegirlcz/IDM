package om4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class p4 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ oce.c f226664w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(oce.c cVar, Continuation continuation) {
        super(continuation);
        this.f226664w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f226664w.emit(null, this);
    }
}
