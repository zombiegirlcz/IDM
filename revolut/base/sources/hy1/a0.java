package hy1;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0c.o f156631w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g0c.o oVar, Continuation continuation) {
        super(continuation);
        this.f156631w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f156631w.emit(null, this);
    }
}
