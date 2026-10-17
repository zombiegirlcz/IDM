package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class z2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ard.b0 f185046w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(ard.b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f185046w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185046w.emit(null, this);
    }
}
