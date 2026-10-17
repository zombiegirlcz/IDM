package c2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f20700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td0.b f20701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f20702c;
    public final wsg.n d;

    public h(fk3.a configurationInteractor, td0.b currencySetsProvider, ppk.f ratesInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f20700a = configurationInteractor;
        this.f20701b = currencySetsProvider;
        this.f20702c = ratesInteractor;
        this.d = walletInteractor;
    }

    public static final ArrayList d(h hVar, Set set, xi0.b bVar, Map map, List list, Comparator comparator) {
        Object next;
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            xi0.b bVar2 = (xi0.b) it8.next();
            io3.d dVar = (io3.d) map.get(bVar2);
            dj0.d dVarL = null;
            dj0.d dVar2 = dVar != null ? new dj0.d(dVar.i, bVar2) : null;
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((qta.c) next).f249046a.f306286a, bVar2.f306286a)) {
                    break;
                }
            }
            qta.c cVar = (qta.c) next;
            if (dVar2 != null && dVar2.f115082a != 0 && cVar != null) {
                dVarL = pyd.c.L(dVar2, cVar.f249048c, cVar.f249047b);
            }
            if (!Intrinsics.f(bVar2.f306286a, bVar.f306286a)) {
                dVar2 = dVarL;
            }
            arrayList.add(new Pair(bVar2, dVar2));
        }
        List listP0 = zhm.d0.P0(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listP0, 10));
        Iterator it10 = listP0.iterator();
        while (it10.hasNext()) {
            arrayList2.add((xi0.b) ((Pair) it10.next()).f186385a);
        }
        return arrayList2;
    }

    public static ogd.e e(FavouritesAssetTypeKey assetType, xi0.b base, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(base, "base");
        String str = base.f306286a;
        String strK = cp5.d.K(base);
        String strE = cp5.d.e(base);
        if (strE.length() == 0) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            strE = cp5.d.q(locale, base);
            if (strE == null) {
                strE = base.f306286a;
            }
        }
        return new ogd.e(new FavouritesAssetDetails(str, strK, strE, assetType, false), bVar != null ? bVar.f306286a : null, null, null);
    }

    public final Flow f(Function1 allCurrenciesFilter, Comparator sort) {
        Intrinsics.checkNotNullParameter(allCurrenciesFilter, "allCurrenciesFilter");
        Intrinsics.checkNotNullParameter(sort, "sort");
        return xam.a.h(new a9h.a(this, allCurrenciesFilter, sort, (Continuation) null, 3), g());
    }

    public abstract Flow g();
}
