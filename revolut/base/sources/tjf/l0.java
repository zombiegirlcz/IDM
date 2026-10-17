package tjf;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.fc;
import tof.hc;
import tof.i1;
import tof.i7;
import tof.l9;
import tof.q6;
import tof.q7;
import tof.t0;
import tof.v6;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 implements shf.a {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TransactionContext f271675h;
    public static final q7 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f271676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mhf.f f271677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f271678c;
    public final mhf.j d;
    public final nhf.a e;
    public final thf.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f271679g;

    static {
        Priority.HIGH high = new Priority.HIGH("Global search");
        TransactionContext.TransactionData[] elements = {TransactionContext.TransactionData.ACQUIRING_CASHBACK, TransactionContext.TransactionData.EXCLUDED_FROM_SPENDING_ANALYTICS, TransactionContext.TransactionData.HIDDEN, TransactionContext.TransactionData.RELATED_TRANSACTIONS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f271675h = new TransactionContext(high, new TransactionContext.DataSet.Excluded(kotlin.collections.d.y0(elements)));
        i7.c cVar = i7.Companion;
        v6[] v6VarArr = {v6.PENDING, v6.COMPLETED, v6.REVERTED, v6.DECLINED, v6.CANCELLED, v6.FAILED};
        cVar.getClass();
        i = i7.c.a(i7.c.c(v6VarArr), fc.b(new l9(t0.SUSPICIOUS)));
    }

    public l0(wsg.n walletInteractor, mhf.f transactionPagingInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, mhf.j transactionsSearchIndexInteractor, nhf.a unitedWalletInteractor, thf.l transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionPagingInteractor, "transactionPagingInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f271676a = walletInteractor;
        this.f271677b = transactionPagingInteractor;
        this.f271678c = transactionsInteractor;
        this.d = transactionsSearchIndexInteractor;
        this.e = unitedWalletInteractor;
        this.f = transactionsItemMapper;
    }

    public final Data b(int i2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new Data(zhm.v.k(new o97.f0(new TextLocalisedClause(i2, null, null, 14), listId), o97.h0.f223107a), null, false, 6, null);
    }

    public final Data c(int i2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new Data(zhm.v.k(new o97.f0(new TextLocalisedClause(i2, null, null, 14), listId), o97.i0.f223111a), null, false, 6, null);
    }

    public final FeatureCommand d(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(transaction), null, null, null, 126));
    }

    public final FeatureCommand e(i7 filter, String query, AccountId accountId) {
        q6 hcVar;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactions_list_title, null, null, 14);
        TransactionsListFilterType.ByTransactionsFilter byTransactionsFilter = new TransactionsListFilterType.ByTransactionsFilter(filter, null, null, 6);
        rhf.g gVar = rhf.g.OTHER;
        if (accountId instanceof AccountId.Personal) {
            hcVar = i1.f272794a;
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            hcVar = new hc(((AccountId.Joint) accountId).f51413b, null);
        }
        q6 q6Var = hcVar;
        Set set = this.f271679g;
        if (set == null) {
            set = zhm.h0.f322473a;
        }
        return u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) textLocalisedClause, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) byTransactionsFilter, query, accountId, (rhf.h) null, gVar, (TransactionDestination) null, q6Var, set, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 62086)));
    }

    public final List f(List transactionList, k71.q extraData, int i2, String listId, o97.m0 sourceIdentifier) {
        Intrinsics.checkNotNullParameter(transactionList, "transactionList");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        thf.k kVar = new thf.k(1022, false, false, false, false, false);
        o97.f0 f0Var = new o97.f0(new TextLocalisedClause(i2, null, null, 14), listId);
        List<a3> listV0 = zhm.d0.V0(transactionList, 3);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        for (a3 a3Var : listV0) {
            arrayList.add(RowDelegate.Model.x((RowDelegate.Model) ((anf.o) this.f).p(a3Var, extraData, kVar, null, null).f54925b, null, null, null, null, null, 0, null, false, null, new o97.y(sourceIdentifier, a3Var, null, 60), 0, 0, 0, 0, null, -4194305, 15));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return zhm.v.k(f0Var, new o97.e0(arrayList));
    }

    public final efm.r g(boolean z, io3.l lVar, io3.i iVar) {
        io3.j ownershipType = io3.j.PERSONAL;
        Set states = zhm.d0.i1(io3.k.a());
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(ownershipType, "ownershipType");
        Intrinsics.checkNotNullParameter(states, "states");
        wsg.n nVar = this.f271676a;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        efm.r map = te0.w.l(m70.a.g(nVar.S(loadingStrategy, states, lVar, iVar, personal), null, new wsg.e(10), 1), m70.a.g(nVar.W(personal), null, new wsg.e(11), 1)).map(new wp5.x(new t9f.n(z, ownershipType, 13), 29));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = map.map(new tid.a(new tif.g(12), 27));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    public final ufm.b h(Object obj2) {
        ufm.b bVarM = efm.d0.m(obj2 instanceof a3 ? new o97.l(d((a3) obj2)) : o97.e.f223096a);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
