package aqd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class j1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahe.f0 f8355w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ahe.f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f8355w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f8355w.emit(null, this);
    }
}
