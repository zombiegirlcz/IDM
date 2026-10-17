package zb6;

import cli.y;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$ModalStep;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ OneTimeDonationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OneTimeDonationScreen oneTimeDonationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = oneTimeDonationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar2 = (com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) this.u.d();
        y yVar = aVar2.z;
        ba6.l lVar = (ba6.l) ((h) ((j2) yVar.f22677a).getValue()).f320805a.getContent();
        xi0.b bVar = lVar != null ? lVar.f13942h.f115083b : null;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.A;
        od0.i iVar = (od0.i) ((h) ((j2) yVar.f22677a).getValue()).f320807c.getContent();
        oki.h.v2(aVar3, new OneTimeDonationScreenContract$ModalStep.PocketPicker(bVar, iVar != null ? (PaymentMethod.Pocket) iVar.f224257a : null), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        return Unit.f186387a;
    }
}
