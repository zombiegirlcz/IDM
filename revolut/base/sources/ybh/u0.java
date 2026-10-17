package ybh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class u0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f312355w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(t0 t0Var, Continuation continuation) {
        super(continuation);
        this.f312355w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f312355w.emit(null, this);
    }
}
