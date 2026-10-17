package oo2;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreen;
import ip0.qd0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import om4.l0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingPaymentsReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingPaymentsReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f53304a;
        qd0 selectedState = model.f53306c;
        p pVar = (p) mVarE3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        y yVar = pVar.f227004p;
        qo2.k kVar = (qo2.k) ((i) ((j2) yVar.f22677a).getValue()).d.getContent();
        String strE0 = d0.e0(listId, "ID_SUPPORTED_PAYMENT_");
        if (!Intrinsics.f(strE0, listId) && kVar != null) {
            boolean z = selectedState == qd0.SELECTED;
            qo2.i iVar = (qo2.i) kVar.f247998b.get(strE0);
            if (iVar != null) {
                qo2.b payment = iVar.f247992a;
                Intrinsics.checkNotNullParameter(payment, "payment");
                pVar.H2(yVar, new l0(kVar, 6, strE0, new qo2.i(payment, !z)));
            }
        }
        return Unit.f186387a;
    }
}
