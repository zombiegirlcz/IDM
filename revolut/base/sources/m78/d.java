package m78;

import atg.v;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import efm.r;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.va;
import w4l.k;
import wsg.n;
import zhm.d0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f203337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f203338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mce.a f203339c;
    public final a d;
    public final gte.a e;

    public d(n walletsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, mce.a recurringPaymentFilterProvider, a juniorTransactionsCache, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentFilterProvider, "recurringPaymentFilterProvider");
        Intrinsics.checkNotNullParameter(juniorTransactionsCache, "juniorTransactionsCache");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f203337a = walletsInteractor;
        this.f203338b = transactionsInteractor;
        this.f203339c = recurringPaymentFilterProvider;
        this.d = juniorTransactionsCache;
        this.e = featureToggleInteractor;
    }

    public final Set a(List list, fo3.c cVar) {
        boolean zC = ((jte.d) this.e).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            io3.d dVar = (io3.d) obj2;
            if (dVar.e == l.CURRENT && (zC || z92.f.l(dVar).equals(cVar.d))) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((io3.d) it8.next()).f163145a);
        }
        return d0.i1(arrayList2);
    }

    public final r b(String walletId, String str, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        sfm.b bVarG = new pfm.h(new ly2.d(loadingStrategy, 3, this, walletId), 2).g(c(walletId, str));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        return pd.b.r(bVarG, new b(this, walletId, 0));
    }

    public final r c(String walletId, String str) {
        r rVarJust;
        if (str != null && (rVarJust = r.just(new Data(new va(y0.b(str)), null, false, 6, null))) != null) {
            return rVarJust;
        }
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        v vVar = (v) this.f203337a.f299736b;
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        atg.h hVar = (atg.h) vVar.e;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarDistinctUntilChanged = nim.a.w(hVar.f9053g.e(walletId, loadingStrategy), new m11.h(this, 24)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
