package bn2;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ard.b0 f17029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f17030x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17031y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ard.b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f17029w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17029w.emit(null, this);
    }
}
