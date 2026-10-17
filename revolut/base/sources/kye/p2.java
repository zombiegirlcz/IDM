package kye;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class p2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kx4.b0 f190813w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(kx4.b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f190813w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f190813w.emit(null, this);
    }
}
