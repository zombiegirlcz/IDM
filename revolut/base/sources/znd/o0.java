package znd;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import xkf.b2;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b2 f323783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f323784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f323785y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(b2 b2Var, Continuation continuation) {
        super(continuation);
        this.f323783w = b2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f323783w.emit(null, this);
    }
}
