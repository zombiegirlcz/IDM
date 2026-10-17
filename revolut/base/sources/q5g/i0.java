package q5g;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreview;
import com.revolut.feature.travel.flights.models.domain.payment.PointsRedeemOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.checkout.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BookingPreview f242380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PointsRedeemOption f242381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod.Pocket f242382y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(PaymentMethod.Pocket pocket, com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar, BookingPreview bookingPreview, PointsRedeemOption pointsRedeemOption, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f242380w = bookingPreview;
        this.f242381x = pointsRedeemOption;
        this.f242382y = pocket;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i0(this.f242382y, this.v, this.f242380w, this.f242381x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            PaymentMethod.Pocket pocket = this.f242382y;
            com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = this.v;
            h0 h0Var = new h0(pocket, bVar, this.f242380w, this.f242381x, null);
            this.u = 1;
            if (u0.b0(bVar.X(), "BUTTON_TAG_BOOK", h0Var, this) == aVar) {
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
