package bn2;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahe.f0 f17022w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f17023x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17024y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ahe.f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f17022w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17022w.emit(null, this);
    }
}
