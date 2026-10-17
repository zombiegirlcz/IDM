package vha;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vgf.n0 f289412w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vgf.n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f289412w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f289412w.emit(null, this);
    }
}
