package cul;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class i1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ble.e1 f109118w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ble.e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f109118w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f109118w.emit(null, this);
    }
}
