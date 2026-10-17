package qsf;

import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.transfer_reasons.impl.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferReasonsValues f248831w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.transfer_reasons.impl.flow.a aVar, TransferReasonsValues transferReasonsValues, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f248831w = transferReasonsValues;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f248831w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.transfer_reasons.impl.flow.a aVar2 = this.v;
            csf.b bVar = aVar2.f92349s;
            String str = ((TransferReasonsFlowInputData.CreateForPendingTransaction) aVar2.f92347q).d.f92424a;
            this.u = 1;
            if (((tsf.e) bVar).a(str, this.f248831w, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
