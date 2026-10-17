package g4k;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import et6.u1;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ List A;
    public final /* synthetic */ f5j.a B;
    public final /* synthetic */ Set C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f140549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f140550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f140551y;
    public final /* synthetic */ BankTransferData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Continuation continuation, p pVar, BankTransferData bankTransferData, List list, f5j.a aVar, Set set, int i) {
        super(3, continuation);
        this.u = i;
        this.f140551y = pVar;
        this.z = bankTransferData;
        this.A = list;
        this.B = aVar;
        this.C = set;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g gVar = new g(continuation, this.f140551y, this.z, this.A, this.B, this.C, 0);
                gVar.f140549w = flowCollector;
                gVar.f140550x = obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            default:
                g gVar2 = new g(continuation, this.f140551y, this.z, this.A, this.B, this.C, 1);
                gVar2.f140549w = flowCollector;
                gVar2.f140550x = obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f140549w;
                    f fVar = (f) this.f140550x;
                    Data data = fVar.f140545a;
                    kq2.f fVar2 = fVar.f140546b;
                    long j2 = fVar.f140547c;
                    PaymentPocketInfo paymentPocketInfo = fVar.d;
                    r rVar = fVar.e;
                    f2k.h hVar = fVar.f;
                    p pVar = this.f140551y;
                    pVar.f140570a.getClass();
                    Integer numC = p4k.g.c(this.B);
                    Set set = this.C;
                    BankTransferData bankTransferData = this.z;
                    u1 u1VarC = pVar.c(bankTransferData, data, fVar2, j2, this.A, numC, rVar, set);
                    this.f140549w = null;
                    this.f140550x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = u1VarC.collect(new k(flowCollector, rVar, pVar, bankTransferData, data, fVar2, j2, paymentPocketInfo, hVar), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
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
                    FlowCollector flowCollector2 = this.f140549w;
                    vf0.h hVar2 = (vf0.h) this.f140550x;
                    r rVar2 = (r) hVar2.f288433a;
                    Data data2 = (Data) hVar2.f288434b;
                    kq2.f fVar3 = (kq2.f) hVar2.f288435c;
                    long jLongValue = ((Number) hVar2.d).longValue();
                    p pVar2 = this.f140551y;
                    pVar2.f140570a.getClass();
                    u1 u1VarC2 = pVar2.c(this.z, data2, fVar3, jLongValue, this.A, p4k.g.c(this.B), rVar2, this.C);
                    this.f140549w = null;
                    this.f140550x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, u1VarC2, this) == aVar2) {
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
