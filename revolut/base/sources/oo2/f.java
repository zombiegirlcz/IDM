package oo2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.l3;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingPaymentsReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingPaymentsReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f53228a;
        p pVar = (p) mVarE3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_MIGRATE_BENEFICIARIES_TOGGLE")) {
            pVar.H2(pVar.f227004p, new l3(26));
        }
        return Unit.f186387a;
    }
}
