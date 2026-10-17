package ble;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahe.f0 f16603w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ahe.f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f16603w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f16603w.emit(null, this);
    }
}
