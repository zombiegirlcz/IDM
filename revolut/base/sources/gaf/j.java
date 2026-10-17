package gaf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferCreateRequest;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.isa_transfer_review_submit.IsaTransferReviewSubmitScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar = this.v;
        IsaTransferReviewSubmitScreenContract$InputData isaTransferReviewSubmitScreenContract$InputData = kVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            o9f.c cVar = kVar.f142166p;
            TransferCreateRequest transferCreateRequest = new TransferCreateRequest(u8f.d.IN, isaTransferReviewSubmitScreenContract$InputData.f91599a, isaTransferReviewSubmitScreenContract$InputData.f91600b, f0.f322471a);
            String string = isaTransferReviewSubmitScreenContract$InputData.f91601c.getF105262a().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.u = 1;
            if (cVar.a(transferCreateRequest, string, this) == aVar) {
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
