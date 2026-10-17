package rxb;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import efm.d0;
import hxb.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.s1;
import mic.a0;
import pfm.m;
import qfm.j1;
import qfm.p2;
import qfm.x;
import ru6.r;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f258111b;

    public /* synthetic */ a(l lVar, int i) {
        this.f258110a = i;
        this.f258111b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f258110a) {
            case 0:
                l lVar = this.f258111b;
                od0.i date = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(date, "date");
                d0<List<f0>> lastRevPointsTransactions = lVar.f258128a.getLastRevPointsTransactions(null, date.d() ? Long.valueOf(((Number) date.c()).longValue() + 1) : null, 30);
                rw9.d dVar = new rw9.d(new a(lVar, 2), 12);
                lastRevPointsTransactions.getClass();
                return new ufm.i(lastRevPointsTransactions, dVar, 1);
            case 1:
                l lVar2 = this.f258111b;
                Boolean isHistoryFetched = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isHistoryFetched, "isHistoryFetched");
                if (!isHistoryFetched.booleanValue()) {
                    return lVar2.e();
                }
                lVar2.e.set(true);
                return m.f235744a;
            case 2:
                l lVar3 = this.f258111b;
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                if (!transactions.isEmpty()) {
                    List list = transactions;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(gxb.d.o(gxb.d.c((f0) it8.next())));
                    }
                    lVar3.f258129b.g().f(arrayList);
                }
                List list2 = transactions;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(gxb.d.c((f0) it9.next()));
                }
                return arrayList2;
            case 3:
                l lVar4 = this.f258111b;
                synchronized (lVar4.f) {
                    lVar4.f258131g = null;
                }
                return Unit.f186387a;
            case 4:
                l lVar5 = this.f258111b;
                efm.i errors = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(errors, "errors");
                a0 a0Var = new a0(8, k.f258127a);
                dfm.c cVar = mfm.f.d;
                en.a aVar = mfm.f.f205043c;
                errors.getClass();
                p2 p2VarQ = new x(errors, a0Var, cVar, aVar, aVar).b(10000L, TimeUnit.MILLISECONDS).q(5L);
                efm.i flowable = lVar5.f258130c.c(false).filter(new rw9.d(new r(29), 13)).toFlowable(efm.a.DROP);
                rw9.d dVar2 = new rw9.d(new b(0), 14);
                flowable.getClass();
                return p2VarQ.j(new j1(flowable, dVar2, 0));
            case 5:
                l lVar6 = this.f258111b;
                f0 it10 = (f0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                RevPointsTransaction revPointsTransactionC = gxb.d.c(it10);
                lVar6.getClass();
                if (revPointsTransactionC.f84057g != s1.PENDING) {
                    lVar6.f258129b.g().e(gxb.d.o(revPointsTransactionC));
                }
                return revPointsTransactionC;
            case 6:
                l lVar7 = this.f258111b;
                od0.i date2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(date2, "date");
                d0<List<f0>> lastRevPointsTransactions2 = lVar7.f258128a.getLastRevPointsTransactions(date2.d() ? (Long) date2.c() : null, null, 100);
                f fVar = new f(2, new a(lVar7, 9));
                lastRevPointsTransactions2.getClass();
                return new ufm.i(lastRevPointsTransactions2, fVar, 1);
            case 7:
                l lVar8 = this.f258111b;
                efm.i errors2 = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(errors2, "errors");
                a0 a0Var2 = new a0(9, j.f258126a);
                dfm.c cVar2 = mfm.f.d;
                en.a aVar2 = mfm.f.f205043c;
                errors2.getClass();
                p2 p2VarQ2 = new x(errors2, a0Var2, cVar2, aVar2, aVar2).b(10000L, TimeUnit.MILLISECONDS).q(5L);
                efm.i flowable2 = lVar8.f258130c.c(false).filter(new f(3, new b(10))).toFlowable(efm.a.DROP);
                f fVar2 = new f(4, new b(11));
                flowable2.getClass();
                return p2VarQ2.j(new j1(flowable2, fVar2, 0));
            case 8:
                ihm.b bVar = this.f258111b.f258132h;
                Unit unit = Unit.f186387a;
                bVar.onNext(unit);
                return unit;
            case 9:
                l lVar9 = this.f258111b;
                List transactions2 = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions2, "transactions");
                if (!transactions2.isEmpty()) {
                    List list3 = transactions2;
                    ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                    Iterator it11 = list3.iterator();
                    while (it11.hasNext()) {
                        arrayList3.add(gxb.d.o(gxb.d.c((f0) it11.next())));
                    }
                    lVar9.f258129b.g().f(arrayList3);
                }
                List list4 = transactions2;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                Iterator it12 = list4.iterator();
                while (it12.hasNext()) {
                    arrayList4.add(gxb.d.c((f0) it12.next()));
                }
                return arrayList4;
            case 10:
                l lVar10 = this.f258111b;
                RevPointsTransaction transaction = (RevPointsTransaction) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                lVar10.f258129b.g().e(gxb.d.o(transaction));
                return efm.k.g(transaction);
            default:
                l lVar11 = this.f258111b;
                List pendingTransactionsIds = (List) obj2;
                Intrinsics.checkNotNullParameter(pendingTransactionsIds, "pendingTransactionsIds");
                List list5 = pendingTransactionsIds;
                ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
                Iterator it13 = list5.iterator();
                while (it13.hasNext()) {
                    arrayList5.add(lVar11.f258128a.getRevPointsTransactionById((String) it13.next()).n().map(new rw9.d(new a(lVar11, 5), 23)));
                }
                return efm.r.zip(arrayList5, new rw9.d(new b(3), 19));
        }
    }
}
