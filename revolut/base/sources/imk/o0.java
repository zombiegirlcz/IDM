package imk;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends gim.c {
    public int A;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ard.b0 f162536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f162537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c f162538y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ard.b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f162536w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f162536w.emit(null, this);
    }
}
