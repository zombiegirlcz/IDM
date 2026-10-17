package q97;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class t2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u2 f243793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f243794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f243795y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(u2 u2Var, Continuation continuation) {
        super(continuation);
        this.f243793w = u2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243793w.emit(null, this);
    }
}
