package cia;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jhe.x;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import rhf.g;
import rhf.h;
import ssi.n;
import tof.i1;
import tof.i7;
import tof.q6;
import vf0.y;
import vy5.i0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f24432b;

    public /* synthetic */ b(ProductAccountId productAccountId, int i) {
        this.f24431a = i;
        this.f24432b = productAccountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ProductAccountId productAccountId;
        Object next;
        ProductAccountId productAccountId2;
        Object next2;
        n nVar;
        ProductAccountId productAccountId3;
        Object next3;
        ProductAccountId productAccountId4;
        Object next4;
        ProductAccount.ValueItem valueItem;
        ProductAccountId productAccountId5;
        Object next5;
        Object next6;
        io3.d dVar;
        ProductAccountId productAccountId6;
        Object next7;
        switch (this.f24431a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                i7 i7Var = (i7) pair.f186385a;
                bia.c cVar = (bia.c) pair.f186386b;
                nce.a aVar = cVar.f15459a;
                List listC = u.c(i1.f272794a);
                RecurringPaymentAccount.Pro pro = cVar.f15460b;
                TransactionsListFilterType.ByTransactionsFilter byTransactionsFilter = new TransactionsListFilterType.ByTransactionsFilter(i7Var, null, null, 6);
                g gVar = g.PRO;
                nce.a aVar2 = cVar.f15459a;
                nce.b bVar = aVar2 instanceof nce.b ? (nce.b) aVar2 : null;
                return new n(i7Var, aVar, null, listC, new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) byTransactionsFilter, (String) null, (AccountId) null, (h) null, gVar, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) pro, (RecurringPaymentFilter) (bVar != null ? bVar.f214180a : null), false, 52975)), AccountId.Personal.f51414a, pro, new ProductAccountDescriptor$Value.Main(this.f24432b, ProductId.PRO), null, 772);
            case 1:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : accounts) {
                    if (obj3 instanceof ProductAccount.ValueItem) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it8 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    productAccountId = this.f24432b;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((ProductAccount.ValueItem) next).getF89504c().f89729a, productAccountId.f89729a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                ProductAccount.ValueItem valueItem2 = (ProductAccount.ValueItem) next;
                if (valueItem2 != null) {
                    return valueItem2;
                }
                throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId.f89729a, " cannot be found in the junior product accounts"));
            case 2:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return x.a(this.f24432b, (dj0.d) pair2.f186385a, (ProductAccountListAction) ((i) pair2.f186386b).f224257a);
            case 3:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                i7 i7Var2 = (i7) pair3.f186385a;
                bia.c cVar2 = (bia.c) pair3.f186386b;
                nce.a aVar3 = cVar2.f15459a;
                List listC2 = u.c(i1.f272794a);
                RecurringPaymentAccount.Pro pro2 = cVar2.f15460b;
                ProductId productId = ProductId.PRO;
                ProductAccountId productAccountId7 = this.f24432b;
                ProductAccountDescriptor$Value.Main main = new ProductAccountDescriptor$Value.Main(productAccountId7, productId);
                TransactionsListFilterType.ByAccounts byAccounts = new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(productAccountId7, productId), (TransactionContext) null);
                g gVar2 = g.PRO;
                nce.a aVar4 = cVar2.f15459a;
                nce.b bVar2 = aVar4 instanceof nce.b ? (nce.b) aVar4 : null;
                return new n(i7Var2, aVar3, null, listC2, new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) byAccounts, (String) null, (AccountId) null, (h) null, gVar2, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) pro2, (RecurringPaymentFilter) (bVar2 != null ? bVar2.f214180a : null), false, 52975)), AccountId.Personal.f51414a, pro2, main, null, 772);
            case 4:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it9 = pockets.iterator();
                while (true) {
                    boolean zHasNext2 = it9.hasNext();
                    productAccountId2 = this.f24432b;
                    if (zHasNext2) {
                        next2 = it9.next();
                        if (Intrinsics.f(((io3.d) next2).f163145a, productAccountId2.f89729a)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                io3.d dVar2 = (io3.d) next2;
                if (dVar2 != null) {
                    return dVar2;
                }
                throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId2.f89729a, " cannot be found in the Pro available pocket!"));
            case 5:
                ProductAccountId accountId = this.f24432b;
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                Data data = (Data) pair4.f186385a;
                nce.a aVar5 = (nce.a) pair4.f186386b;
                try {
                    Object content = data.getContent();
                    if (content != null) {
                        TransactionContext transactionContext = i0.f293161m;
                        List listC3 = u.c(i1.f272794a);
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(transactionContext, "transactionContext");
                        ProductId productId2 = ProductId.CURRENCY;
                        nVar = new n((i7) content, aVar5, transactionContext, listC3, new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(accountId, productId2), transactionContext), (String) null, (AccountId) null, (h) null, g.HOME, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65263)), null, null, new ProductAccountDescriptor$Value.Main(accountId, productId2), null, 864);
                    } else {
                        nVar = null;
                    }
                    return new Data(nVar, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 6:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                Iterator it10 = pockets2.iterator();
                while (true) {
                    boolean zHasNext3 = it10.hasNext();
                    productAccountId3 = this.f24432b;
                    if (zHasNext3) {
                        next3 = it10.next();
                        if (Intrinsics.f(((io3.d) next3).f163145a, productAccountId3.f89729a)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                io3.d dVar3 = (io3.d) next3;
                if (dVar3 != null) {
                    return dVar3;
                }
                throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId3.f89729a, " cannot be found in the Currency available pocket!"));
            case 7:
                Iterator it11 = ((List) obj2).iterator();
                while (true) {
                    boolean zHasNext4 = it11.hasNext();
                    productAccountId4 = this.f24432b;
                    if (zHasNext4) {
                        next4 = it11.next();
                        if (Intrinsics.f(((io3.d) next4).f163145a, productAccountId4.f89729a)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                io3.d dVar4 = (io3.d) next4;
                if (dVar4 == null || (valueItem = (ProductAccount.ValueItem) d0.d0(u38.d.a(u.c(dVar4)))) == null) {
                    throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId4.f89729a, " cannot be found in the Bereavement product!"));
                }
                return valueItem;
            case 8:
                List pockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets3, "pockets");
                Iterator it12 = pockets3.iterator();
                while (true) {
                    boolean zHasNext5 = it12.hasNext();
                    productAccountId5 = this.f24432b;
                    if (zHasNext5) {
                        next5 = it12.next();
                        if (Intrinsics.f(((io3.d) next5).f163145a, productAccountId5.f89729a)) {
                        }
                    } else {
                        next5 = null;
                    }
                }
                io3.d dVar5 = (io3.d) next5;
                if (dVar5 != null) {
                    return dVar5;
                }
                throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId5.f89729a, " cannot be found in the Currency available pocket!"));
            case 9:
                y yVar = (y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                List list = (List) yVar.f288491a;
                xi0.b bVar3 = (xi0.b) yVar.f288492b;
                List list2 = (List) yVar.f288493c;
                do3.n nVar2 = (do3.n) yVar.d;
                Set set = (Set) yVar.e;
                g48.a aVar6 = (g48.a) yVar.f;
                String str = this.f24432b.f89729a;
                if (Intrinsics.f(str, "just_created_joint_account_id")) {
                    dVar = (io3.d) d0.d0(list);
                } else {
                    Iterator it13 = list.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            next6 = it13.next();
                            if (Intrinsics.f(((io3.d) next6).f163145a, str)) {
                            }
                        } else {
                            next6 = null;
                        }
                    }
                    dVar = (io3.d) next6;
                }
                io3.d dVar6 = dVar;
                if (dVar6 != null) {
                    return new y(dVar6, bVar3, list2, nVar2, set, aVar6);
                }
                throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", str, " cannot be found in the Currency product!"));
            default:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Iterator it15 = it14.iterator();
                while (true) {
                    boolean zHasNext6 = it15.hasNext();
                    productAccountId6 = this.f24432b;
                    if (zHasNext6) {
                        next7 = it15.next();
                        if (Intrinsics.f(((ProductAccount.ValueItem) next7).getF89504c().f89729a, productAccountId6.f89729a)) {
                        }
                    } else {
                        next7 = null;
                    }
                }
                ProductAccount.ValueItem valueItem3 = (ProductAccount.ValueItem) next7;
                if (valueItem3 != null) {
                    return valueItem3;
                }
                throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId6.f89729a, " cannot be found in Linked accounts"));
        }
    }

    public /* synthetic */ b(ProductAccountId productAccountId, pfe.b bVar, int i) {
        this.f24431a = i;
        this.f24432b = productAccountId;
    }

    public /* synthetic */ b(pfe.b bVar, ProductAccountId productAccountId, int i) {
        this.f24431a = i;
        this.f24432b = productAccountId;
    }
}
