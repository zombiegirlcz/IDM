package lh9;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FormReviewScreen formReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = formReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        ApmQuote apmQuote;
        ApmQuoteRate apmQuoteRate;
        ApmQuote apmQuote2;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        String listId = model.f51781a;
        r rVar = (r) nVarE3;
        x02.d dVar = rVar.f195191q;
        y yVar = rVar.f195193s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "BREAKDOWN_PREFIX_PAYMENT_BREAKDOWN_FEES_ITEM")) {
            j jVar2 = ((i) ((j2) yVar.f22677a).getValue()).f195182c;
            if (jVar2 != null && (apmQuote2 = jVar2.f195183a) != null) {
                rVar.C1(((q12.l) dVar).c(apmQuote2));
            }
        } else if (Intrinsics.f(listId, "BREAKDOWN_PREFIX_PAYMENT_BREAKDOWN_EXCHANGE_RATE_ITEM") && (jVar = ((i) ((j2) yVar.f22677a).getValue()).f195182c) != null && (apmQuote = jVar.f195183a) != null && (apmQuoteRate = apmQuote.f62209a) != null) {
            rVar.C1(((q12.l) dVar).f(apmQuoteRate));
        }
        return Unit.f186387a;
    }
}
