package xkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkm.s0 f306803w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(vkm.s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f306803w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f306803w.emit(null, this);
    }
}
