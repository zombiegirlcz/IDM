package y20;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class v0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f310555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f310556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f310557y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, Continuation continuation) {
        super(continuation);
        this.f310555w = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f310555w.emit(null, this);
    }
}
