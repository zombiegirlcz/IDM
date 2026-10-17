package r4k;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BankTransferReviewScreen bankTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a aVar2 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a) rVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (zhm.v.k("ID_CONTINUE_BUTTON", "INTEREST_DIALOG_BUTTON_ID").contains(model.f52613a)) {
            j60.a.v(aVar2.u, false, null, 3);
        }
        return Unit.f186387a;
    }
}
