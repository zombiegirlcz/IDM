package yed;

import kotlin.coroutines.Continuation;
import ybh.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f312852w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t0 t0Var, Continuation continuation) {
        super(continuation);
        this.f312852w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f312852w.emit(null, this);
    }
}
