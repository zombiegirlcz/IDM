package rnd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rnb.c f255630w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(rnb.c cVar, Continuation continuation) {
        super(continuation);
        this.f255630w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f255630w.emit(null, this);
    }
}
