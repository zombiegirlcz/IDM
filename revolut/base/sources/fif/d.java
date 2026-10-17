package fif;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import do2.o;
import fg8.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tif.q;
import tof.ca;
import tof.i7;
import tof.q7;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135393a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i7 f135394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransactionContext f135395c;
    public final /* synthetic */ BreadcrumbException d;
    public final /* synthetic */ m e;

    public /* synthetic */ d(m mVar, i7 i7Var, TransactionContext transactionContext, BreadcrumbException breadcrumbException) {
        this.e = mVar;
        this.f135394b = i7Var;
        this.f135395c = transactionContext;
        this.d = breadcrumbException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f135393a;
        int i2 = 22;
        m mVar = this.e;
        switch (i) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                q qVar = (q) mVar.f135410a;
                qVar.getClass();
                i7 filter = this.f135394b;
                Intrinsics.checkNotNullParameter(filter, "filter");
                TransactionContext context = this.f135395c;
                Intrinsics.checkNotNullParameter(context, "context");
                rfm.m mVar2 = new rfm.m(qVar.e.e(context.f60265a, new r5.c(qVar, filter, context, this.d, 3)), new e0(17, new fg8.g(i2)), 1);
                od0.i.Companion.getClass();
                return mVar2.p(od0.i.f224256b);
            default:
                List results = (List) obj2;
                Intrinsics.checkNotNullParameter(results, "results");
                List list = results;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((h) it9.next()).f135403b);
                }
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {new ca(d0.i1(arrayList)), this.f135394b};
                cVar.getClass();
                q7 q7VarA = i7.c.a(i7VarArr);
                TransactionsSort sort = TransactionsSort.DEFAULT;
                Intrinsics.checkNotNullParameter(sort, "sort");
                TransactionContext context2 = this.f135395c;
                Intrinsics.checkNotNullParameter(context2, "context");
                return mVar.a(((q) mVar.f135410a).c(q7VarA, sort, -1, context2, this.d)).take(1L).map(new e0(i2, new o(results, 25)));
        }
    }

    public /* synthetic */ d(i7 i7Var, TransactionContext transactionContext, BreadcrumbException breadcrumbException, m mVar) {
        this.f135394b = i7Var;
        this.f135395c = transactionContext;
        this.d = breadcrumbException;
        this.e = mVar;
    }
}
