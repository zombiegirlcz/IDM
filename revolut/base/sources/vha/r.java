package vha;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vgf.n0 f289426w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(vgf.n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f289426w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f289426w.emit(null, this);
    }
}
