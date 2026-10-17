package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290019w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, Continuation continuation) {
        super(continuation);
        this.v = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f290019w |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
