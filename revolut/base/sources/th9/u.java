package th9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewContract$InputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f271350w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f271350w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f271350w, continuation, 0);
            case 1:
                return new u(this.f271350w, continuation, 1);
            default:
                return new u(this.f271350w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
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
                this.v = 1;
                v vVar = this.f271350w;
                Object objB = pu7.a.B(vVar.k, "TRANSFER_TASK_ID", new u(vVar, null, 2), this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                v vVar2 = this.f271350w;
                nh9.d dVar = vVar2.f271353r;
                PaymentReviewContract$InputData paymentReviewContract$InputData = vVar2.o;
                PaymentData paymentData = paymentReviewContract$InputData.f78797b;
                TransferScheduleData transferScheduleData = paymentReviewContract$InputData.f;
                this.v = 1;
                Object objZ2 = dVar.Z2(paymentData, transferScheduleData, this);
                return objZ2 == aVar2 ? aVar2 : objZ2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                v vVar3 = this.f271350w;
                u uVar = new u(vVar3, null, 1);
                this.v = 1;
                Object objB0 = u0.b0(vVar3.X(), "APM_TRANSFER_REVIEW_CTA_BUTTON_TAG", uVar, this);
                return objB0 == aVar3 ? aVar3 : objB0;
        }
    }
}
