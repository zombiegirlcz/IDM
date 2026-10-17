package ymk;

import kotlin.coroutines.Continuation;
import ybh.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f315047w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t0 t0Var, Continuation continuation) {
        super(continuation);
        this.f315047w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f315047w.emit(null, this);
    }
}
