package b6i;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahe.f0 f12795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f12796x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public z5i.a f12797y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ahe.f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f12795w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f12795w.emit(null, this);
    }
}
