package rg3;

import kotlin.coroutines.Continuation;
import r74.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f254009w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f254009w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f254009w.emit(null, this);
    }
}
