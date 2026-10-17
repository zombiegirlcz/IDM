package ymk;

import kotlin.coroutines.Continuation;
import ybh.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f315042w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t0 t0Var, Continuation continuation) {
        super(continuation);
        this.f315042w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f315042w.emit(null, this);
    }
}
