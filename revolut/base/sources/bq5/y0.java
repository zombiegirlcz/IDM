package bq5;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z0 f17768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f17769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f17770y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, Continuation continuation) {
        super(continuation);
        this.f17768w = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17768w.emit(null, this);
    }
}
