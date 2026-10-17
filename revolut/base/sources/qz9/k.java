package qz9;

import com.revolut.domain.interactors.transactions.TransactionsSort;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.o7;
import tof.qb;
import tof.v6;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f250429b;

    public /* synthetic */ k(n nVar, int i) {
        this.f250428a = i;
        this.f250429b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f250428a;
        n nVar = this.f250429b;
        switch (i) {
            case 0:
                m data = (m) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                i7.c cVar = i7.Companion;
                i7 i7Var = data.f250433a;
                v6[] v6VarArr = {v6.COMPLETED};
                cVar.getClass();
                return nim.a.w(com.revolut.domain.interactors.transactions.a.d(nVar.f250435a, i7.c.a(i7Var, i7.c.c(v6VarArr)), data.f250434b, 1, TransactionsSort.NO_SORT, null, 16), new b(10));
            case 1:
                m data2 = (m) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                i7.c cVar2 = i7.Companion;
                i7[] i7VarArr = {data2.f250433a, new qb(zhm.v.k(v6.COMPLETED, v6.PENDING)), new o7()};
                cVar2.getClass();
                return com.revolut.domain.interactors.transactions.a.d(nVar.f250435a, i7.c.a(i7VarArr), data2.f250434b, 1, TransactionsSort.STARTED_DATE_DESC, null, 16);
            default:
                Boolean juniorEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(juniorEnabled, "juniorEnabled");
                if (juniorEnabled.booleanValue()) {
                    return nim.a.w(nVar.f250436b.P(), new b(6));
                }
                od0.i.Companion.getClass();
                return zi0.c.j(od0.i.f224256b);
        }
    }
}
