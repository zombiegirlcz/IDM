package cie;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class h1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ble.e1 f24486w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(ble.e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f24486w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f24486w.emit(null, this);
    }
}
