package ybh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class x0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vch.u0 f312366w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(vch.u0 u0Var, Continuation continuation) {
        super(continuation);
        this.f312366w = u0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f312366w.emit(null, this);
    }
}
