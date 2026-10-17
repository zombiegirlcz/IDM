package js4;

import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardEditPostPurchaseInstalmentTermScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CreditCardEditPostPurchaseInstalmentTermScreen creditCardEditPostPurchaseInstalmentTermScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardEditPostPurchaseInstalmentTermScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
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
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardEditPostPurchaseInstalmentTermScreen creditCardEditPostPurchaseInstalmentTermScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a) ((f) creditCardEditPostPurchaseInstalmentTermScreen.O.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar3 = (com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a) ((f) creditCardEditPostPurchaseInstalmentTermScreen.O.getValue());
                dj0.d dVar = aVar3.I2().f178122b.e;
                oki.h.v2(aVar3.v, new CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.Confirm(dVar, aVar3.I2().f178121a.f68791a.f68793a, aVar3.I2().f178121a.f68791a.f68794b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
