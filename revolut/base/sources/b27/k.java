package b27;

import com.revolut.data.model.Data;
import et6.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import r10.v;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f11917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.a f11918y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11918y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f11918y, continuation, 0);
                kVar.f11917x = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f11918y, continuation, 1);
                kVar2.f11917x = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f11917x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f11916w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    v vVar = this.f11918y.f74165q;
                    cs6.a aVar2 = cs6.a.E_COMMERCE;
                    this.f11917x = null;
                    this.v = flowCollector;
                    this.f11916w = 1;
                    obj2 = vVar.u(aVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector = this.v;
                    yhm.o.b(obj2);
                }
                Data dataP = zi0.c.P(obj2, false, null, 3);
                this.f11917x = null;
                this.v = null;
                this.f11916w = 2;
                if (flowCollector.emit(dataP, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f11917x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f11916w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    gr6.e eVar = this.f11918y.f74164p;
                    this.f11917x = null;
                    this.v = flowCollector2;
                    this.f11916w = 1;
                    obj2 = ((l0) eVar).d(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector2 = this.v;
                    yhm.o.b(obj2);
                }
                Data dataP2 = zi0.c.P(obj2, false, null, 3);
                this.f11917x = null;
                this.v = null;
                this.f11916w = 2;
                if (flowCollector2.emit(dataP2, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
