package w38;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkm.s0 f294244w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(vkm.s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f294244w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f294244w.emit(null, this);
    }
}
