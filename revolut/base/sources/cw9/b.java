package cw9;

import ble.e1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f109569w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f109569w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f109569w.emit(null, this);
    }
}
