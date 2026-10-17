package rs;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rnb.c f256888w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rnb.c cVar, Continuation continuation) {
        super(continuation);
        this.f256888w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f256888w.emit(null, this);
    }
}
