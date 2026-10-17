package g48;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g23.e0 f140393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f140394x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n38.y f140395y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(g23.e0 e0Var, Continuation continuation) {
        super(continuation);
        this.f140393w = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f140393w.emit(null, this);
    }
}
