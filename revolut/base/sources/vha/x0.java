package vha;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vgf.n0 f289453w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(vgf.n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f289453w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f289453w.emit(null, this);
    }
}
