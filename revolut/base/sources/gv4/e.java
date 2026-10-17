package gv4;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$AccruedInterest;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditCardAccruedInterestsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditCardAccruedInterestsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.R.getValue();
        Object obj3 = model.o;
        com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.a aVar2 = (com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.a) hVar;
        aVar2.getClass();
        CreditCardInAppStatement$AccruedInterest creditCardInAppStatement$AccruedInterest = obj3 instanceof CreditCardInAppStatement$AccruedInterest ? (CreditCardInAppStatement$AccruedInterest) obj3 : null;
        if (creditCardInAppStatement$AccruedInterest != null) {
            oki.h.v2(aVar2.f69671q, new CreditCardAccruedInterestsScreenContract$ModalStep.InterestDetail(creditCardInAppStatement$AccruedInterest), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
