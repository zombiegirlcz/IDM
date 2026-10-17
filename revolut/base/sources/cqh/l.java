package cqh;

import ble.e1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f108116w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f108116w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f108116w.emit(null, this);
    }
}
