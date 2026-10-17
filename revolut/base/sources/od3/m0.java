package od3;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.cashback.impl.R$string;
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
public final class m0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.v = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s0 s0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            efm.r rVarB = s0Var.f224301s.b(s0Var.f224298p.f65720a);
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
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_box_transactions_title, null, null, 14);
        Intrinsics.h(i7Var);
        return s0Var.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) textLocalisedClause, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(i7Var, null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65518)));
    }
}
