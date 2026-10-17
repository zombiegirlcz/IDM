package bxg;

import ble.e1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f19699w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f19699w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f19699w.emit(null, this);
    }
}
