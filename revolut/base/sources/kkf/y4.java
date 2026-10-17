package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class y4 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k7i.c f185028w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(k7i.c cVar, Continuation continuation) {
        super(continuation);
        this.f185028w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185028w.emit(null, this);
    }
}
