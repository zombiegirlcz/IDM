package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class u0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ eg.n0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290127w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(eg.n0 n0Var, Continuation continuation) {
        super(continuation);
        this.v = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f290127w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
