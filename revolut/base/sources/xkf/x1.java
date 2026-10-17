package xkf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class x1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v1 f306796w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f306797x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f306798y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(v1 v1Var, Continuation continuation) {
        super(continuation);
        this.f306796w = v1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f306796w.emit(null, this);
    }
}
