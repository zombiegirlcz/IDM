package hy1;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0c.o f156675w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g0c.o oVar, Continuation continuation) {
        super(continuation);
        this.f156675w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f156675w.emit(null, this);
    }
}
