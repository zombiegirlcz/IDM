package ybh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n4d.o0 f312370w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(n4d.o0 o0Var, Continuation continuation) {
        super(continuation);
        this.f312370w = o0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f312370w.emit(null, this);
    }
}
