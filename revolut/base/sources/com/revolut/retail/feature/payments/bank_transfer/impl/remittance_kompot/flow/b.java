package com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow;

import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlowContract$Step;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import gim.i;
import jq9.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f102044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, y yVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f102044w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f102044w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            y3k.b bVar = cVar.E;
            zm3.a aVar2 = this.f102044w.f177526a;
            RemittanceTransferData remittanceTransferDataT2 = cVar.T2();
            this.u = 1;
            obj2 = bVar.a(aVar2, remittanceTransferDataT2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.E2(new RemittanceFlowContract$Step.ReviewInternal((PeerToPeerReviewScreenInputData) obj2), false, null, false);
        return Unit.f186387a;
    }
}
