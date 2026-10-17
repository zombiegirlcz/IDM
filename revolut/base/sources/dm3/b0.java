package dm3;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.contacts.impl.R$string;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tof.i7;
import tof.q6;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.contacts.impl.ui.contact.screen.details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            hm3.d dVar = aVar2.f66011t;
            zm3.a aVar3 = aVar2.o.f66002a;
            dVar.getClass();
            efm.r rVarB = hm3.d.b(aVar3);
            this.u = 1;
            objC = nim.a.c(rVarB, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objC = obj2;
        }
        i7 i7Var = (i7) objC;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recipient_profile_section_title_transactions, null, null, 14);
        rhf.g gVar = rhf.g.OTHER;
        Intrinsics.h(i7Var);
        return aVar2.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) textLocalisedClause, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(i7Var, null, null, 6), (String) null, (AccountId) null, (rhf.h) null, gVar, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65262)));
    }
}
