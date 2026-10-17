package an;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import nr6.c0;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f6510b;

    public /* synthetic */ l(int i, Set set) {
        this.f6509a = i;
        this.f6510b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        boolean z3;
        switch (this.f6509a) {
            case 0:
                Set set = this.f6510b;
                ArrayList arrayList = new ArrayList(w.t(set, 10));
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new afa.q((k) it8.next(), 28));
                }
                return arrayList;
            case 1:
                Set<AnalyticsAccount> set2 = this.f6510b;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    z = false;
                } else {
                    for (AnalyticsAccount analyticsAccount : set2) {
                        if ((analyticsAccount instanceof AnalyticsAccount.Personal) && !(analyticsAccount instanceof AnalyticsAccount.Personal.All)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                Set<AnalyticsAccount> set3 = this.f6510b;
                if ((set3 instanceof Collection) && set3.isEmpty()) {
                    z3 = false;
                } else {
                    for (AnalyticsAccount analyticsAccount2 : set3) {
                        if ((analyticsAccount2 instanceof AnalyticsAccount.Joint) && !(analyticsAccount2 instanceof AnalyticsAccount.Joint.All)) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 3:
                return new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_header_title, u.c(Integer.valueOf(this.f6510b.size())), null, 12);
            case 4:
                return new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_header_title, u.c(Integer.valueOf(this.f6510b.size())), null, 12);
            case 5:
                t17.l lVarD = t17.a.d((c0) d0.a0(this.f6510b));
                if (lVarD != null) {
                    return lVarD.f267205a;
                }
                return null;
            case 6:
                return new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_header_title, u.c(Integer.valueOf(this.f6510b.size())), null, 12);
            case 7:
                return new TextLocalisedClause(R$string.freelancer_sales_filters_currencies_header_title, u.c(Integer.valueOf(this.f6510b.size())), null, 12);
            default:
                Set set4 = this.f6510b;
                ArrayList arrayList2 = new ArrayList(w.t(set4, 10));
                Iterator it9 = set4.iterator();
                while (it9.hasNext()) {
                    if (it9.next() != null) {
                        throw new ClassCastException();
                    }
                    arrayList2.add(new wl3.d(15));
                }
                return arrayList2;
        }
    }

    public /* synthetic */ l(u17.e eVar, Set set) {
        this.f6509a = 5;
        this.f6510b = set;
    }
}
