package d7j;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v0 f111977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f111978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f111979y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(v0 v0Var, Continuation continuation) {
        super(continuation);
        this.f111977w = v0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f111977w.emit(null, this);
    }
}
