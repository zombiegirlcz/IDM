package ch1;

import cli.y;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$ModalStep;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.cards.model.SharedRevolutCard;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GooglePayOtpLocationMismatchController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = googlePayOtpLocationMismatchController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SharedRevolutCard sharedRevolutCard;
        int i = this.u;
        GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b) ((h) googlePayOtpLocationMismatchController.O.getValue());
                bVar.getClass();
                bVar.n2(new bv4.h(bVar, null, 20), new d(bVar, 0));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar2 = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b) ((h) googlePayOtpLocationMismatchController.O.getValue());
                y yVar = bVar2.f60908q;
                SharedRevolutCardWrapper sharedRevolutCardWrapper = (SharedRevolutCardWrapper) ((i) ((j2) yVar.f22677a).getValue()).f24106a.getContent();
                if (sharedRevolutCardWrapper != null && (sharedRevolutCard = ((RetailCardWrapper) sharedRevolutCardWrapper).f64443a) != null) {
                    bVar2.C2(new j(sharedRevolutCard, ((i) ((j2) yVar.f22677a).getValue()).f24107b));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar3 = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b) ((h) googlePayOtpLocationMismatchController.O.getValue());
                y yVar2 = bVar3.f60908q;
                SharedRevolutCardWrapper sharedRevolutCardWrapper2 = (SharedRevolutCardWrapper) ((i) ((j2) yVar2.f22677a).getValue()).f24106a.getContent();
                if (sharedRevolutCardWrapper2 != null) {
                    oki.h.v2(bVar3.f60909r, new GooglePayOtpLocationMismatchScreenContract$ModalStep.CardSecurityPrompt(sharedRevolutCardWrapper2, ((i) ((j2) yVar2.f22677a).getValue()).d), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
