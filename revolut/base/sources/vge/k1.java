package vge;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i1 f288934w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(i1 i1Var, Continuation continuation) {
        super(continuation);
        this.f288934w = i1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f288934w.emit(null, this);
    }
}
