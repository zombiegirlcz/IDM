package ymf;

import kotlin.coroutines.Continuation;
import ybh.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f314980w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t0 t0Var, Continuation continuation) {
        super(continuation);
        this.f314980w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f314980w.emit(null, this);
    }
}
