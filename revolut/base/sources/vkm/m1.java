package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class m1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ eg.n0 f290074w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(eg.n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f290074w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290074w.emit(null, this);
    }
}
