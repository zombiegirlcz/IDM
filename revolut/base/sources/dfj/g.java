package dfj;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahe.f0 f113971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f113972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f113973y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ahe.f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f113971w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f113971w.emit(null, this);
    }
}
