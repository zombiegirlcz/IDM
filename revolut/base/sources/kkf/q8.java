package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class q8 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8 f184912w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(i8 i8Var, Continuation continuation) {
        super(continuation);
        this.f184912w = i8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184912w.emit(null, this);
    }
}
