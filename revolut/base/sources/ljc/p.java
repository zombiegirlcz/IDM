package ljc;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import sgm.e3;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f195638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f195639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f195640y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Continuation continuation, r rVar) {
        super(3, continuation);
        this.u = i;
        this.f195640y = rVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(0, continuation, this.f195640y);
                pVar.f195638w = flowCollector;
                pVar.f195639x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            case 1:
                p pVar2 = new p(1, continuation, this.f195640y);
                pVar2.f195638w = flowCollector;
                pVar2.f195639x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
            default:
                p pVar3 = new p(2, continuation, this.f195640y);
                pVar3.f195638w = flowCollector;
                pVar3.f195639x = obj3;
                return pVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f195638w;
                    w4l.k kVar = (w4l.k) this.f195639x;
                    r rVar = this.f195640y;
                    e3 e3Var = rVar.f195644r;
                    RentAndBillsConfigurations.Configuration configuration = rVar.o.f84984b;
                    Intrinsics.checkNotNullParameter(configuration, "<this>");
                    xi0.b defaultCurrency = configuration.f84780b.f115083b;
                    boolean zF = Intrinsics.f(kVar, w4l.i.f294643c);
                    e3Var.getClass();
                    Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
                    Flow flowE = boh.f.e(vkm.q.q(nim.a.v(rd0.e.b(xua.a.a((xua.a) e3Var.f262807c, null, 3)), new vgc.b(0, defaultCurrency))), new t9f.n(e3Var, zF, 10));
                    this.f195638w = null;
                    this.f195639x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowE, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f195638w;
                    vkm.d dVarB = ((vgc.e) this.f195640y.f195643q).b((w4l.k) this.f195639x);
                    this.f195638w = null;
                    this.f195639x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f195638w;
                    vkm.d dVarB2 = rd0.e.b(xua.a.a(this.f195640y.f195642p, null, 3));
                    this.f195638w = null;
                    this.f195639x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
