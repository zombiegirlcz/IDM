package n8i;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class x0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y0 f213487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f213488x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213489y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, Continuation continuation) {
        super(continuation);
        this.f213487w = y0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f213487w.emit(null, this);
    }
}
