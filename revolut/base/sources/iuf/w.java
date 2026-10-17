package iuf;

import com.revolut.domain.models.beneficiary.BankInformationCopFlow;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f168582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f168583x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a f168584y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f168584y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                w wVar = new w(0, this.f168584y, continuation);
                wVar.f168582w = flowCollector;
                wVar.f168583x = obj3;
                return wVar.invokeSuspend(Unit.f186387a);
            default:
                w wVar2 = new w(1, this.f168584y, continuation);
                wVar2.f168582w = flowCollector;
                wVar2.f168583x = obj3;
                return wVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        Flow dVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f168582w;
                    String value = (String) this.f168583x;
                    tga.k kVar = this.f168584y.f92493w;
                    if (value != null) {
                        Intrinsics.checkNotNullParameter(value, "value");
                    } else {
                        value = null;
                    }
                    Flow flowD = kVar.d(new mga.b0(value, null));
                    this.f168582w = null;
                    this.f168583x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowD, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f168582w;
                    ManualTransferRecipient recipient = (ManualTransferRecipient) this.f168583x;
                    d dVar2 = this.f168584y.f92488p;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(recipient, "recipient");
                    if ((recipient instanceof ManualTransferRecipient.Apm) || (recipient instanceof ManualTransferRecipient.Internal)) {
                        gVar = new go.g(null, 2);
                    } else {
                        if (!(recipient instanceof ManualTransferRecipient.BankBeneficiary)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f5j.a aVar3 = ((ManualTransferRecipient.BankBeneficiary) recipient).f92459a;
                        String str = aVar3.o;
                        if (str == null) {
                            dVar = new go.g(null, 2);
                        } else {
                            d3j.b bVar = dVar2.f168563c;
                            String str2 = aVar3.f132337n;
                            Map mapG = aVar3.u;
                            if (mapG == null) {
                                mapG = r0.g();
                            }
                            dVar = new iqh.d(rd0.e.b(bVar.i(BankInformationCopFlow.TRANSFER, str, str2, mapG)), 8);
                        }
                        gVar = new g4b.a0(dVar, 29);
                    }
                    this.f168582w = null;
                    this.f168583x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
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
