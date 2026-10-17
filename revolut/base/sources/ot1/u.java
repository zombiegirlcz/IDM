package ot1;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewScreen;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BizumTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(BizumTransferReviewScreen bizumTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bizumTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ApmQuote apmQuote;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarI3 = this.v.T2();
        String listId = model.f51781a;
        b0VarI3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "BREAKDOWN_PREFIX_PAYMENT_BREAKDOWN_FEES_ITEM") && (apmQuote = b0VarI3.y2().f229395a) != null) {
            b0VarI3.C1(((q12.l) b0VarI3.f229388q).c(apmQuote));
        }
        return Unit.f186387a;
    }
}
