package iuf;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreenContract$InputData;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a f168588w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f168588w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(0, this.f168588w, continuation);
            case 1:
                return new z(1, this.f168588w, continuation);
            default:
                return new z(2, this.f168588w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar2 = this.f168588w;
                kuf.d dVar = aVar2.f92490r;
                ManualTransferData manualTransferDataI2 = aVar2.I2();
                MoneyRequest moneyRequest = ((l) ((j2) aVar2.f92495y.f22677a).getValue()).f168568b;
                this.v = 1;
                Serializable serializableZ2 = dVar.Z2(manualTransferDataI2, moneyRequest, this);
                return serializableZ2 == aVar ? aVar : serializableZ2;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar4 = this.f168588w;
                z zVar = new z(0, aVar4, null);
                this.v = 1;
                Object objB0 = u0.b0(aVar4.X(), "MONEY_REQUEST_REVIEW_PROCEED_CTA_BUTTON_TAG", zVar, this);
                return objB0 == aVar3 ? aVar3 : objB0;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar6 = this.f168588w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d dVar2 = aVar6.f92488p;
                    this.v = 1;
                    ManualTransferReviewScreenContract$InputData manualTransferReviewScreenContract$InputData = dVar2.f168561a;
                    ManualTransferData manualTransferData = manualTransferReviewScreenContract$InputData.f92485b;
                    obj2 = manualTransferData == null ? ((guf.m) dVar2.f168562b).c(new TransferRequestApprovalData.MoneyRequestApproval(manualTransferReviewScreenContract$InputData.f92484a), this) : manualTransferData;
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar6.H2(aVar6.f92495y, new is2.t((ManualTransferData) obj2, 15));
                return Unit.f186387a;
        }
    }
}
