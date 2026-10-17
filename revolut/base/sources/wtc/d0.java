package wtc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkm.s0 f299862w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(vkm.s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f299862w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f299862w.emit(null, this);
    }
}
