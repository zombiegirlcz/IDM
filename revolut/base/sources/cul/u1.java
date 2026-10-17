package cul;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class u1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cq6.i f109174w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(cq6.i iVar, Continuation continuation) {
        super(continuation);
        this.f109174w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f109174w.emit(null, this);
    }
}
