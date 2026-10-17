package q5g;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmParams;
import com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmation;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreview;
import com.revolut.feature.travel.flights.models.domain.payment.PointsRedeemOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 extends gim.i implements Function1 {
    public final /* synthetic */ PaymentMethod.Pocket A;
    public BookingConfirmParams u;
    public BookingConfirmation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f242375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BookingPreview f242376x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PointsRedeemOption f242377y;
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.checkout.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(PaymentMethod.Pocket pocket, com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar, BookingPreview bookingPreview, PointsRedeemOption pointsRedeemOption, Continuation continuation) {
        super(1, continuation);
        this.f242376x = bookingPreview;
        this.f242377y = pointsRedeemOption;
        this.z = bVar;
        this.A = pocket;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h0(this.A, this.z, this.f242376x, this.f242377y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r9 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0141, code lost:
    
        if (vkm.q.x(r4, r25) != r3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[PHI: r4 r6
      0x00b9: PHI (r4v6 com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmation) = 
      (r4v3 com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmation)
      (r4v11 com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmation)
     binds: [B:38:0x00b5, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r6v5 java.lang.Object) = (r6v3 java.lang.Object), (r6v11 java.lang.Object) binds: [B:38:0x00b5, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q5g.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
