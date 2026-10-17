package e9d;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.shared.help_centre.api.faq.model.TransactionTroubleshooterFilter;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.fc;
import tof.i7;
import tof.oa;
import tof.q6;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f123970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f123971x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f123971x = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f123971x, continuation, 0);
            default:
                return new y(this.f123971x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        oa oaVarA;
        Object transactionListDestination;
        z zVar;
        Object objG;
        z zVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f123970w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    z zVar3 = this.f123971x;
                    mde.e eVar = zVar3.f123974r;
                    TransactionTroubleshooterFilter transactionTroubleshooterFilter = zVar3.f123972p.f86351c;
                    if (transactionTroubleshooterFilter instanceof TransactionTroubleshooterFilter.None) {
                        list = null;
                    } else {
                        if (!(transactionTroubleshooterFilter instanceof TransactionTroubleshooterFilter.Cards)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        list = ((TransactionTroubleshooterFilter.Cards) transactionTroubleshooterFilter).f86142a;
                    }
                    this.v = zVar3;
                    this.f123970w = 1;
                    if (list != null) {
                        fde.a aVar2 = eVar.f204563b;
                        oaVarA = fde.a.a(list);
                    } else {
                        eVar.getClass();
                        oaVarA = null;
                    }
                    transactionListDestination = new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.support_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, true, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(fc.a(cde.a.a(i7.Companion), oaVarA), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) TransactionDestination.Troubleshooting.f91986a, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 64998));
                    if (transactionListDestination == aVar) {
                        return aVar;
                    }
                    zVar = zVar3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = this.v;
                    yhm.o.b(obj2);
                    transactionListDestination = obj2;
                }
                return zVar.C1((aii.u) transactionListDestination);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f123970w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z zVar4 = this.f123971x;
                    mde.e eVar2 = zVar4.f123974r;
                    this.v = zVar4;
                    this.f123970w = 1;
                    objG = eVar2.g(this);
                    if (objG == aVar3) {
                        return aVar3;
                    }
                    zVar2 = zVar4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar2 = this.v;
                    yhm.o.b(obj2);
                    objG = obj2;
                }
                return zVar2.C1((aii.u) objG);
        }
    }
}
