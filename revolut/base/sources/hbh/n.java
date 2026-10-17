package hbh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InvestTransactionsFilter f150749b;

    public /* synthetic */ n(InvestTransactionsFilter investTransactionsFilter, int i) {
        this.f150748a = i;
        this.f150749b = investTransactionsFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150748a) {
            case 0:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : accounts) {
                    if (((InvestTransactionsFilter.InvestTransactionsFilterImpl) this.f150749b).f105341a.contains(((WealthAccount) obj3).T0())) {
                        arrayList.add(obj3);
                    }
                }
                boolean z = false;
                if (!arrayList.isEmpty()) {
                    Iterator it8 = arrayList.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (((WealthAccount) it8.next()).Q2()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                e0h.a transactionsPage = (e0h.a) obj2;
                Intrinsics.checkNotNullParameter(transactionsPage, "transactionsPage");
                return new h1h.g(this.f150749b, transactionsPage);
        }
    }
}
