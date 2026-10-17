package w38;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.marketplace.api.R$string;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.hc;
import tof.q6;
import tof.ua;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProductAccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f294199w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ProductAccountId productAccountId, p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = productAccountId;
        this.f294199w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, this.f294199w, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((v38.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        v38.c cVar = (v38.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!(cVar instanceof v38.a)) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        n38.a aVar2 = ((v38.a) cVar).f285854a;
        ProductAccountId productAccountId = this.v;
        ua uaVar = new ua(productAccountId.f89729a);
        String str = aVar2.f211924b;
        String str2 = aVar2.f211923a;
        List listC = zhm.u.c(new hc(str, productAccountId.f89729a));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.dashboard_widgets_transactions_title, null, null, 14);
        ProductId productId = ProductId.BEREAVEMENT;
        return zi0.c.i(new ssi.n(uaVar, null, null, listC, new TransactionListDestination(new TransactionListDestination.InputData((Clause) textLocalisedClause, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(productAccountId, productId), (TransactionContext) null), (String) null, (AccountId) l38.a.c(aVar2), (rhf.h) null, rhf.g.BEREAVEMENT_HOME, (TransactionDestination) null, (q6) new hc(str, null), (Set) null, (RecurringPaymentAccount) new RecurringPaymentAccount.Joint(str2, str), (RecurringPaymentFilter) null, false, 60078)), l38.a.c(aVar2), new RecurringPaymentAccount.Joint(str2, str), new ProductAccountDescriptor$Value.Main(productAccountId, productId), null, 774));
    }
}
