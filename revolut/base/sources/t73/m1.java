package t73;

import com.revolut.feature.card_screen.api.navigation.descriptors.NamelessCardDialogDescriptor$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.auto_renewal_dialog.AutoRenewalDialogContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.auto_renewal_dialog.AutoRenewalDialogScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.ReissuedPhysicalCardDialogContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.ReissuedPhysicalCardDialogScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.RenewedDialogContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.RenewedDialogScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreenContract$ModalStep;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268493b;

    public /* synthetic */ m1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, int i) {
        this.f268492a = i;
        this.f268493b = gVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f268492a) {
            case 0:
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268493b;
                cli.y yVar = gVar.f65434h0;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CardsCarouselScreenContract$ModalStep step = (CardsCarouselScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CardsCarouselScreenContract$ModalStep.ShowAutoRenewalDialog) {
                    AutoRenewalDialogScreen autoRenewalDialogScreen = new AutoRenewalDialogScreen(new AutoRenewalDialogContract$InputData(((h93.f0) ((q0) ((vkm.j2) yVar.f22677a).getValue()).d.c()).f150110a, ((CardsCarouselScreenContract$ModalStep.ShowAutoRenewalDialog) step).f65411a));
                    gVar.a(autoRenewalDialogScreen, new m1(gVar, 1));
                    return autoRenewalDialogScreen;
                }
                if (step instanceof CardsCarouselScreenContract$ModalStep.ShowRenewedDialog) {
                    h93.f0 f0Var = (h93.f0) ((q0) ((vkm.j2) yVar.f22677a).getValue()).d.c();
                    RenewedDialogScreen renewedDialogScreen = new RenewedDialogScreen(new RenewedDialogContract$InputData(((CardsCarouselScreenContract$ModalStep.ShowRenewedDialog) step).f65415a, f0Var.L && ((Boolean) gVar.j0.getValue()).booleanValue()));
                    gVar.a(renewedDialogScreen, new qce.b(gVar, f0Var, 25));
                    return renewedDialogScreen;
                }
                if (step instanceof CardsCarouselScreenContract$ModalStep.ShowReissuedPhysicalCardDialog) {
                    CardsCarouselScreenContract$ModalStep.ShowReissuedPhysicalCardDialog showReissuedPhysicalCardDialog = (CardsCarouselScreenContract$ModalStep.ShowReissuedPhysicalCardDialog) step;
                    return new ReissuedPhysicalCardDialogScreen(new ReissuedPhysicalCardDialogContract$InputData(showReissuedPhysicalCardDialog.f65412a, showReissuedPhysicalCardDialog.f65413b, showReissuedPhysicalCardDialog.f65414c));
                }
                if (!(step instanceof CardsCarouselScreenContract$ModalStep.ShowAddToGoogleDialog)) {
                    if (step instanceof CardsCarouselScreenContract$ModalStep.NamelessCardDialog) {
                        return gVar.e1(new o63.f(new NamelessCardDialogDescriptor$InputData(o63.e.REDIRECTION)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = gVar.e1(new kg1.b(((CardsCarouselScreenContract$ModalStep.ShowAddToGoogleDialog) step).f65410a));
                k1 block = new k1(gVar, 2);
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                return viewControllerE1;
            default:
                oki.g onResult = (oki.g) obj2;
                m73.a result = (m73.a) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                onResult.pop();
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = this.f268493b;
                gVar2.n2(new sx2.r(gVar2, result, null, 17), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
