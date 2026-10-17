package d7j;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class u0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v0 f112059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f112060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f112061y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, Continuation continuation) {
        super(continuation);
        this.f112059w = v0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f112059w.emit(null, this);
    }
}
