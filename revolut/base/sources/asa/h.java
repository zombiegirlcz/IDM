package asa;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;
import yhm.r;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f8896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f8898y;
    public final /* synthetic */ PushToCardTransferData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Continuation continuation, m mVar, PushToCardTransferData pushToCardTransferData, int i) {
        super(3, continuation);
        this.u = i;
        this.f8898y = mVar;
        this.z = pushToCardTransferData;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(continuation, this.f8898y, this.z, 0);
                hVar.f8896w = flowCollector;
                hVar.f8897x = obj3;
                return hVar.invokeSuspend(Unit.f186387a);
            default:
                h hVar2 = new h(continuation, this.f8898y, this.z, 1);
                hVar2.f8896w = flowCollector;
                hVar2.f8897x = obj3;
                return hVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f8896w;
                    r rVar = (r) this.f8897x;
                    kqa.a aVar2 = (kqa.a) rVar.f314201a;
                    PaymentPocketInfo paymentPocketInfo = (PaymentPocketInfo) rVar.f314202b;
                    g gVar = (g) rVar.f314203c;
                    PushToCardTransferData pushToCardTransferData = this.z;
                    FundingSource fundingSource = pushToCardTransferData.e;
                    m mVar = this.f8898y;
                    ag1.k kVarB = m.b(mVar, pushToCardTransferData, aVar2, m.a(mVar, fundingSource), gVar);
                    this.f8896w = null;
                    this.f8897x = null;
                    this.v = 1;
                    q.w(flowCollector);
                    Object objCollect = kVarB.collect(new acb.h(flowCollector, this.f8898y, aVar2, pushToCardTransferData, paymentPocketInfo, 1), this);
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
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f8896w;
                    Pair pair = (Pair) this.f8897x;
                    kqa.a aVar4 = (kqa.a) pair.f186385a;
                    g gVar2 = (g) pair.f186386b;
                    PushToCardTransferData pushToCardTransferData2 = this.z;
                    FundingSource fundingSource2 = pushToCardTransferData2.e;
                    m mVar2 = this.f8898y;
                    ag1.k kVarB2 = m.b(mVar2, pushToCardTransferData2, aVar4, m.a(mVar2, fundingSource2), gVar2);
                    this.f8896w = null;
                    this.f8897x = null;
                    this.v = 1;
                    q.w(flowCollector2);
                    Object objCollect2 = kVarB2.collect(new a3i.h(flowCollector2, mVar2, 21), this);
                    if (objCollect2 != aVar3) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar3) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
