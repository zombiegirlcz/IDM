package rrj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rnb.c f256877w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(rnb.c cVar, Continuation continuation) {
        super(continuation);
        this.f256877w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f256877w.emit(null, this);
    }
}
