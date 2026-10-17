package le3;

import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import d7j.k1;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import tof.a3;
import tof.e9;
import tof.hc;
import tof.i3;
import tof.i7;
import tof.kb;
import tof.p7;
import tof.z6;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 implements ge3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f194452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f194453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k7i.i f194454c;
    public final g31.h d;

    public b0(com.revolut.domain.interactors.transactions.a transactionsInteractor, wsg.n walletInteractor, k7i.i categorisationRepository, g31.h transactionCategorisationRepository) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(categorisationRepository, "categorisationRepository");
        Intrinsics.checkNotNullParameter(transactionCategorisationRepository, "transactionCategorisationRepository");
        this.f194452a = transactionsInteractor;
        this.f194453b = walletInteractor;
        this.f194454c = categorisationRepository;
        this.d = transactionCategorisationRepository;
    }

    public final ufm.i b(String str) {
        d0 d0VarE = str == null ? this.f194453b.E(AccountId.Personal.f51414a) : d0.m(str);
        z function = z.f194507a;
        Intrinsics.checkNotNullParameter(function, "function");
        ufm.i iVar = new ufm.i(d0VarE, new he2.b(25), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.r c(AnalyticsAccountsSelection accountsSelection) {
        Parcelable f99182a;
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        Set<AnalyticsAccount> f99208a = accountsSelection.getF99208a();
        ArrayList arrayList = new ArrayList(zhm.w.t(f99208a, 10));
        for (AnalyticsAccount analyticsAccount : f99208a) {
            if (analyticsAccount instanceof AnalyticsAccount.Joint) {
                f99182a = ((AnalyticsAccount.Joint) analyticsAccount).getF99182a();
            } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) {
                f99182a = ((AnalyticsAccount.Savings.JointIndividual) analyticsAccount).f99199a;
            } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) {
                f99182a = ((AnalyticsAccount.Savings.JointAll) analyticsAccount).f99198a;
            } else {
                if (!(analyticsAccount instanceof AnalyticsAccount.Pro) && !(analyticsAccount instanceof AnalyticsAccount.Junior) && !(analyticsAccount instanceof AnalyticsAccount.Linked) && !(analyticsAccount instanceof AnalyticsAccount.Savings) && !(analyticsAccount instanceof AnalyticsAccount.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                f99182a = AccountId.Personal.f51414a;
            }
            arrayList.add(f99182a);
        }
        Set setI1 = zhm.d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(setI1, 10));
        Iterator it8 = setI1.iterator();
        while (it8.hasNext()) {
            arrayList2.add(d((AccountId) it8.next(), false));
        }
        efm.r map = te0.w.w(arrayList2).map(new lak.i(new b(22), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final sfm.b d(AccountId accountId, boolean z) {
        String id10;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (accountId instanceof AccountId.Joint) {
            id10 = ((AccountId.Joint) accountId).f51413b;
            Intrinsics.checkNotNullParameter(id10, "id");
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            id10 = null;
        }
        sfm.b bVar = new sfm.b(b(id10), new lak.i(new k1(this, z, 2), 24), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final efm.r e(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.r rVarDistinctUntilChanged = new sfm.b(b(str), new lak.i(new a0(this, 1), 29), 2).map(new y(new l3d.a(id10, 11), 0)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final pfm.a f(a3 transaction, i3 transactionCategory) {
        List listC;
        i7 p7Var;
        i7 e9Var;
        String str;
        efm.b aVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionCategory, "transactionCategory");
        String id10 = transaction.f272584c;
        if (id10 != null) {
            Intrinsics.checkNotNullParameter(id10, "id");
        } else {
            id10 = null;
        }
        if (id10 == null || (listC = zhm.u.c(new hc(id10, null))) == null) {
            listC = f0.f322471a;
        }
        List list = listC;
        if (transaction.k.f115082a < 0) {
            p7Var = new p7(transaction.R);
        } else {
            z6 z6Var = transaction.H;
            if (z6Var == null || (str = z6Var.f273196a) == null) {
                String str2 = transaction.f272609r;
                if (str2 != null) {
                    e9Var = new e9(str2);
                } else {
                    p7Var = null;
                }
            } else {
                e9Var = new kb(str);
            }
            p7Var = e9Var;
        }
        if (p7Var != null) {
            aVar = new pfm.a(com.revolut.domain.interactors.transactions.a.b(this.f194452a, p7Var, list, null, null, null, 28), new y(new khg.s(this, 27, transactionCategory, transaction), 2), 4);
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "TransactionCategorisationInteractor", "No filter found for transaction, cant update category", null, h0Var);
            aVar = pfm.m.f235744a;
        }
        efm.b bVar = aVar;
        String groupId = transaction.f272581b;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(transactionCategory, "transactionCategory");
        pfm.a aVarE = bVar.e(pd.b.n(p0.f264003c, new a9h.a(transactionCategory, this.f194454c, groupId, id10, null, 21)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
