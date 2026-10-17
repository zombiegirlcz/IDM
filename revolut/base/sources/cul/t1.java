package cul;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class t1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ble.e1 f109170w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(ble.e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f109170w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f109170w.emit(null, this);
    }
}
