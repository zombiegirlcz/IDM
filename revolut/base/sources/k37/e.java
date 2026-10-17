package k37;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.TaxHubPaymentAssessmentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubPaymentAssessmentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TaxHubPaymentAssessmentScreen taxHubPaymentAssessmentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubPaymentAssessmentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        String listId = model.f52373a;
        com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b bVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) lVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            bVar.f74310t.a();
        }
        return Unit.f186387a;
    }
}
