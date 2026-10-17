package uw2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationController;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GooglePayMultipleOtpVerificationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController, Continuation continuation) {
        super(2, continuation);
        this.v = googlePayMultipleOtpVerificationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVar = (i) this.v.O.getValue();
        Intrinsics.h(model);
        g gVar = (g) iVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract.CardOtpData");
        h hVar = (h) obj3;
        RevolutCardOtp revolutCardOtp = hVar.f283533b;
        LocationMismatch locationMismatch = revolutCardOtp.d;
        if (hVar.f283534c || locationMismatch == null) {
            gVar.J2(revolutCardOtp.f65546c);
        } else {
            if (locationMismatch == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            yji.l.j2(gVar, new GooglePayOtpLocationMismatchController(new GooglePayOtpLocationMismatchScreenContract$InputData(revolutCardOtp, locationMismatch, false)), null, new d(gVar, 0), 1);
        }
        return Unit.f186387a;
    }
}
