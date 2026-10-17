package sci;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountController;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ExpectedAmountController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ExpectedAmountController expectedAmountController, Continuation continuation) {
        super(2, continuation);
        this.v = expectedAmountController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.a aVar2 = (com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "FREQUENCY_VALUE_ID")) {
            oki.h.v2(aVar2.f97769r, ExpectedAmountControllerContract$ModalStep.TransactionFrequency.f97766a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
