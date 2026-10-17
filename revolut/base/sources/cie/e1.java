package cie;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f24469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f24470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24471y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i, com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f24471y = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e1 e1Var = new e1(0, this.f24471y, continuation);
                e1Var.f24469w = flowCollector;
                e1Var.f24470x = obj3;
                return e1Var.invokeSuspend(Unit.f186387a);
            default:
                e1 e1Var2 = new e1(1, this.f24471y, continuation);
                e1Var2.f24469w = flowCollector;
                e1Var2.f24470x = obj3;
                return e1Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f24469w;
                    a6e.b bVarV = this.f24471y.C.v((ProductAccountDescriptor$Value) this.f24470x);
                    this.f24469w = null;
                    this.f24470x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, bVarV, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f24469w;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) this.f24470x;
                    com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.f24471y;
                    t38.e eVarM = zh9.u0.m(dVar.M2(), ((vge.x) dVar.f89711t).f(new qfe.k(productAccountDescriptor$Value.getF89728b().f89729a)));
                    this.f24469w = null;
                    this.f24470x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, eVarM, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
