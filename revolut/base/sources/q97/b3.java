package q97;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class b3 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pkf.d1 f243656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f243657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f243658y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(pkf.d1 d1Var, Continuation continuation) {
        super(continuation);
        this.f243656w = d1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243656w.emit(null, this);
    }
}
