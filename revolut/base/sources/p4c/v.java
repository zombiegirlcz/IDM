package p4c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f232898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f232899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f232900y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Continuation continuation, x xVar) {
        super(3, continuation);
        this.u = i;
        this.f232900y = xVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                v vVar = new v(0, continuation, this.f232900y);
                vVar.f232898w = flowCollector;
                vVar.f232899x = obj3;
                return vVar.invokeSuspend(Unit.f186387a);
            case 1:
                v vVar2 = new v(1, continuation, this.f232900y);
                vVar2.f232898w = flowCollector;
                vVar2.f232899x = obj3;
                return vVar2.invokeSuspend(Unit.f186387a);
            case 2:
                v vVar3 = new v(2, continuation, this.f232900y);
                vVar3.f232898w = flowCollector;
                vVar3.f232899x = obj3;
                return vVar3.invokeSuspend(Unit.f186387a);
            default:
                v vVar4 = new v(3, continuation, this.f232900y);
                vVar4.f232898w = flowCollector;
                vVar4.f232899x = obj3;
                return vVar4.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f232898w;
                    akg.n nVarB = this.f232900y.f232902p.b(Intrinsics.f((w4l.k) this.f232899x, w4l.i.f294643c));
                    this.f232898w = null;
                    this.f232899x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f232898w;
                    w4l.k loadingStrategy = (w4l.k) this.f232899x;
                    kpj.f fVar = this.f232900y.f232903q;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    akg.n nVarV = nim.a.v(((zjh.c) fVar.f188258b).k(loadingStrategy), new kpj.a(3));
                    this.f232898w = null;
                    this.f232899x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f232898w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f232899x;
                    x xVar = this.f232900y;
                    e3c.a aVar4 = xVar.f232904r;
                    IppProductType ippProductType = xVar.o.f84245a;
                    k3c.p pVar = (k3c.p) aVar4;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(ippProductType, "ippProductType");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB = pVar.d.b(ippProductType.getF84197a(), loadingStrategy2);
                    this.f232898w = null;
                    this.f232899x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f232898w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f232899x;
                    this.f232900y.f232906t.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    go.g gVarI = zi0.c.i(kpj.e.f188254c);
                    this.f232898w = null;
                    this.f232899x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, gVarI, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
