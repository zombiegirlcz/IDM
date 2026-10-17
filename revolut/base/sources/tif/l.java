package tif;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import efm.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nif.f3;
import nif.h2;
import nif.k2;
import nif.n2;
import tfm.z0;
import tof.hb;
import tof.i7;
import zhm.q0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f271512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i7 f271513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransactionsSort f271514c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TransactionContext e;
    public final /* synthetic */ BreadcrumbException f;

    public /* synthetic */ l(q qVar, i7 i7Var, TransactionsSort transactionsSort, int i, TransactionContext transactionContext, BreadcrumbException breadcrumbException) {
        this.f271512a = qVar;
        this.f271513b = i7Var;
        this.f271514c = transactionsSort;
        this.d = i;
        this.e = transactionContext;
        this.f = breadcrumbException;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q qVar = this.f271512a;
        final mif.o oVar = qVar.f271519c;
        final TransactionContext.DataSet dataset = this.e.f60266b;
        oVar.getClass();
        final TransactionsSort sort = this.f271514c;
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(dataset, "dataset");
        final i7 i7Var = this.f271513b;
        final int i = this.d;
        efm.r rVarCreate = efm.r.create(new u() { // from class: mif.n
            @Override // efm.u
            public final void a(z0 emitter) {
                o oVar2 = oVar;
                i7 i7Var2 = i7Var;
                TransactionsSort transactionsSort = sort;
                int i2 = i;
                TransactionContext.DataSet dataSet = dataset;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                try {
                    Object objI = oVar2.i(((d0) oVar2.e()).e(i7Var2, transactionsSort, i2, dataSet));
                    emitter.c(objI);
                    if (!emitter.isDisposed() && !((Collection) objI).isEmpty() && sif.a.a(dataSet, TransactionContext.TransactionData.RELATED_TRANSACTIONS)) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : (Iterable) objI) {
                            if (((n2) obj2).f215950a.R != null) {
                                arrayList.add(obj2);
                            }
                        }
                        int iB = q0.b(zhm.w.t(arrayList, 10));
                        int i3 = 16;
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            f3 f3Var = ((n2) it8.next()).f215950a;
                            linkedHashMap.put(f3Var.f215800b, f3Var.R);
                        }
                        List list = (Iterable) objI;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((n2) it9.next()).f215950a.f215800b);
                        }
                        Set setI1 = zhm.d0.i1(arrayList2);
                        t tVarE = oVar2.e();
                        hb filter = new hb(setI1);
                        d0 d0Var = (d0) tVarE;
                        d0Var.getClass();
                        Intrinsics.checkNotNullParameter(filter, "filter");
                        List listG = oVar2.g(new SimpleSQLiteQuery(p.a.p("\n            SELECT\n            related_transaction_id AS related_transaction_identifier,\n            GROUP_CONCAT(group_id, ',') AS related_transaction_own_group_id,\n            GROUP_CONCAT(type, ',') AS related_transaction_type,\n            GROUP_CONCAT(amount, ',') AS related_transaction_amount,\n            GROUP_CONCAT(amount_with_fee, ',') AS related_transaction_amount_with_fee,\n            GROUP_CONCAT(IFNULL(amount_with_charges, ''), ',') AS related_transaction_amount_with_charges,\n            GROUP_CONCAT(currency, ',') AS related_transaction_currency,\n            GROUP_CONCAT(pocket_id, ',') AS related_transaction_pocket_id,\n            GROUP_CONCAT(vault_id, ',') AS related_transaction_vault_id,\n            GROUP_CONCAT(cashback_pocket_id, ',') AS related_transaction_cashback_pocket_id,\n            GROUP_CONCAT(auto_invest_target_pocket_id, ',') AS related_transaction_autoinvest_target_pocket_id,\n            GROUP_CONCAT(auto_invest_target_type, ',') AS related_transaction_autoinvest_target_type,\n            GROUP_CONCAT(auto_invest_strategy, ',') AS related_transaction_autoinvest_strategy,\n            GROUP_CONCAT(calculated_balance, ',') AS related_transaction_calculated_balance\n            \n            FROM transactions\n             ", j6.a.q("WHERE ", d0Var.i(filter)), " GROUP BY related_transaction_id")));
                        int iB2 = q0.b(zhm.w.t(listG, 10));
                        if (iB2 >= 16) {
                            i3 = iB2;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                        for (Object obj3 : listG) {
                            linkedHashMap2.put(((h2) obj3).f215842a, obj3);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
                        for (Object obj4 : linkedHashMap2.entrySet()) {
                            linkedHashMap3.put(((Map.Entry) obj4).getKey(), new k2(o.v((h2) ((Map.Entry) obj4).getValue())));
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            if (!Intrinsics.f(entry.getValue(), linkedHashMap.get(entry.getKey()))) {
                                linkedHashMap4.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (!linkedHashMap4.isEmpty()) {
                            List<n2> list2 = (Iterable) objI;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                            for (n2 n2VarA : list2) {
                                String str = n2VarA.f215950a.f215800b;
                                if (((k2) linkedHashMap4.get(str)) != null) {
                                    n2VarA = n2.a(n2VarA, (h2) linkedHashMap2.get(str));
                                }
                                arrayList3.add(n2VarA);
                            }
                            emitter.c(arrayList3);
                            List list3 = (Iterable) objI;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it10 = list3.iterator();
                            while (it10.hasNext()) {
                                arrayList4.add(((n2) it10.next()).f215950a);
                            }
                            ArrayList<f3> arrayList5 = new ArrayList();
                            for (Object obj5 : arrayList4) {
                                if (linkedHashMap4.containsKey(((f3) obj5).f215800b)) {
                                    arrayList5.add(obj5);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                            for (f3 f3Var2 : arrayList5) {
                                arrayList6.add(f3.a(f3Var2, (k2) linkedHashMap4.get(f3Var2.f215800b), null, -2049));
                            }
                            oVar2.s(arrayList6);
                        }
                    }
                    emitter.a();
                } catch (Exception e) {
                    emitter.b(e);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
        efm.r rVarDefer = efm.r.defer(new e(qVar, 0, rVarCreate, this.f));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        return rVarDefer;
    }
}
