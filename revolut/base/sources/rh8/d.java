package rh8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r74.a0 f254329w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r74.a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f254329w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f254329w.emit(null, this);
    }
}
