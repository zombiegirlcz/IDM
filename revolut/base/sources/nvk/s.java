package nvk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsControllerContract$InputData;
import klf.w1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import le.u1;
import n8i.b1;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f219732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f219733x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a f219734y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f219734y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f219734y, continuation);
                sVar.f219732w = flowCollector;
                sVar.f219733x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            default:
                s sVar2 = new s(1, this.f219734y, continuation);
                sVar2.f219732w = flowCollector;
                sVar2.f219733x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f219732w;
                    uqk.e eVar = (uqk.e) this.f219733x;
                    com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar2 = this.f219734y;
                    Continuation continuation = null;
                    wkm.l lVarQ = vkm.q.Q(new vkm.y(new w1(2, 11, continuation), aVar2.f103972s), new k25.o(continuation, aVar2, eVar, 22));
                    this.f219732w = null;
                    this.f219733x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarQ, this) == aVar) {
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
                com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar3 = this.f219734y;
                StockFinancialsStatementsControllerContract$InputData stockFinancialsStatementsControllerContract$InputData = aVar3.o;
                qrk.b bVar = aVar3.f103969p;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f219732w;
                    uqk.e eVar2 = (uqk.e) this.f219733x;
                    vkm.d dVarB = rd0.e.b(nim.a.w(u1.d(bVar.b(stockFinancialsStatementsControllerContract$InputData.f103962a, stockFinancialsStatementsControllerContract$InputData.f103963b, eVar2), nim.a.w(bVar.a(stockFinancialsStatementsControllerContract$InputData.f103962a, eVar2), new b1(aVar3, 4))), new a26.s(aVar3, eVar2, 29)));
                    this.f219732w = null;
                    this.f219733x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = dVarB.collect(new v(flowCollector2, eVar2, 0), this);
                    if (objCollect != aVar4) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar4) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar4) {
                        return aVar4;
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
