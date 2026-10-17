package cul;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cq6.i f109157w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cq6.i iVar, Continuation continuation) {
        super(continuation);
        this.f109157w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f109157w.emit(null, this);
    }
}
