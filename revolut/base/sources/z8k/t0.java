package z8k;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f320215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f320216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f320217y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Continuation continuation) {
        super(continuation);
        this.f320215w = u0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f320215w.emit(null, this);
    }
}
