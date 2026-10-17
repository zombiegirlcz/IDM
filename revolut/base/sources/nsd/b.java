package nsd;

import frd.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import osd.e;
import vsd.c;
import xsd.i;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218790a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218791b;

    public b(c linkedDebitCardProvider, c linkedCreditCardProvider) {
        Intrinsics.checkNotNullParameter(linkedDebitCardProvider, "linkedDebitCardProvider");
        Intrinsics.checkNotNullParameter(linkedCreditCardProvider, "linkedCreditCardProvider");
        this.f218791b = v.k(linkedDebitCardProvider, linkedCreditCardProvider);
    }

    @Override // frd.k
    public final Flow b() {
        switch (this.f218790a) {
            case 0:
                List list = this.f218791b;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((k) it8.next()).b());
                }
                return nim.a.v(cj9.c.d(arrayList), new nrb.c(9));
            default:
                List list2 = this.f218791b;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((k) it9.next()).b());
                }
                return nim.a.v(cj9.c.d(arrayList2), new wp5.w(28));
        }
    }

    public b(e creditCardNetWorthGroupProvider, i loanNetWorthGroupProvider, gsd.c payLaterNetWorthGroupProvider) {
        Intrinsics.checkNotNullParameter(creditCardNetWorthGroupProvider, "creditCardNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(loanNetWorthGroupProvider, "loanNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(payLaterNetWorthGroupProvider, "payLaterNetWorthGroupProvider");
        this.f218791b = v.k(creditCardNetWorthGroupProvider, loanNetWorthGroupProvider, payLaterNetWorthGroupProvider);
    }
}
