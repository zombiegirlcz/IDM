package ard;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f8673w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(k0 k0Var, Continuation continuation) {
        super(continuation);
        this.f8673w = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f8673w.emit(null, this);
    }
}
