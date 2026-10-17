package yh4;

import kotlin.coroutines.Continuation;
import ybh.t0;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f313767w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t0 t0Var, Continuation continuation) {
        super(continuation);
        this.f313767w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f313767w.emit(null, this);
    }
}
