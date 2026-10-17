package u56;

import com.revolut.data.model.Data;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import dj0.d;
import go.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k18.c;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import u4e.i;
import w4l.j;
import zh9.u0;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements i1j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk5.a f277385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeFiBalance f277387c;
    public final g26.b d;
    public final c e;

    public b(wk5.a chain, String accountId, DeFiBalance selectedBalance, g26.b assetDetailsInteractor, c deFiAccountsInteractor) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(selectedBalance, "selectedBalance");
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        Intrinsics.checkNotNullParameter(deFiAccountsInteractor, "deFiAccountsInteractor");
        this.f277385a = chain;
        this.f277386b = accountId;
        this.f277387c = selectedBalance;
        this.d = assetDetailsInteractor;
        this.e = deFiAccountsInteractor;
    }

    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        DeFiBalance deFiBalance = this.f277387c;
        boolean zE = ta6.a.E(deFiBalance);
        j jVar = j.f294644c;
        g26.b bVar = this.d;
        if (zE) {
            final int i = 1;
            return nim.a.A(nim.a.v(u0.m(bVar.a(deFiBalance.f71635a, jVar), this.e.x(this.f277386b, jVar)), new Function1(this) { // from class: u56.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f277384b;

                {
                    this.f277384b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            DeFiAssetDetails details = (DeFiAssetDetails) obj2;
                            Intrinsics.checkNotNullParameter(details, "details");
                            return Boolean.valueOf(details.f71667c.contains(this.f277384b.f277385a));
                        default:
                            Pair pair = (Pair) obj2;
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) pair.f186385a;
                            e16.b bVar2 = (e16.b) pair.f186386b;
                            k1j.c cVar = k1j.c.DEFI;
                            DeFiBalance deFiBalance2 = this.f277384b.f277387c;
                            String str = deFiBalance2.f71638g;
                            DefiCurrency defiCurrency = deFiAssetDetails.f71665a;
                            return u.c(new k1j.b(cVar, null, u.c(new BalanceWrapper.DeFiBalanceWrapper(str, defiCurrency.f71672b, defiCurrency.f71673c, defiCurrency.f, deFiBalance2.a(), (d) deFiBalance2.f71641l.getValue(), null, bVar2.f121887b)), 6));
                    }
                }
            }), new i(9));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : balanceGroupList) {
            if (((k1j.b) obj2).f180282a == k1j.c.DEFI) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            List list = ((k1j.b) it8.next()).f180284c;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof BalanceWrapper.DeFiBalanceWrapper) {
                    arrayList3.add(obj3);
                }
            }
            a0.x(arrayList3, arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            final int i2 = 0;
            arrayList4.add(nim.a.A(nim.a.v(bVar.a(((BalanceWrapper.DeFiBalanceWrapper) it9.next()).f99406c.f306286a, jVar), new Function1(this) { // from class: u56.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f277384b;

                {
                    this.f277384b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    switch (i2) {
                        case 0:
                            DeFiAssetDetails details = (DeFiAssetDetails) obj22;
                            Intrinsics.checkNotNullParameter(details, "details");
                            return Boolean.valueOf(details.f71667c.contains(this.f277384b.f277385a));
                        default:
                            Pair pair = (Pair) obj22;
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) pair.f186385a;
                            e16.b bVar2 = (e16.b) pair.f186386b;
                            k1j.c cVar = k1j.c.DEFI;
                            DeFiBalance deFiBalance2 = this.f277384b.f277387c;
                            String str = deFiBalance2.f71638g;
                            DefiCurrency defiCurrency = deFiAssetDetails.f71665a;
                            return u.c(new k1j.b(cVar, null, u.c(new BalanceWrapper.DeFiBalanceWrapper(str, defiCurrency.f71672b, defiCurrency.f71673c, defiCurrency.f, deFiBalance2.a(), (d) deFiBalance2.f71641l.getValue(), null, bVar2.f121887b)), 6));
                    }
                }
            }), new i(8)));
        }
        return nim.a.v(u0.k(arrayList4), new twg.a(arrayList2, arrayList, 27));
    }
}
