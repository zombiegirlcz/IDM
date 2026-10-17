package nw5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f219780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv5.c f219781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final td0.b f219782c;
    public final j d;

    public i(fk3.a configurationInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, td0.b currencySetsProvider, j cryptoStatsInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        this.f219780a = configurationInteractor;
        this.f219781b = cryptoCommodityBaseCurrencyInteractor;
        this.f219782c = currencySetsProvider;
        this.d = cryptoStatsInteractor;
    }

    public static final ArrayList a(i iVar, ArrayList arrayList, List list) {
        iVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            xi0.b bVar = (xi0.b) it8.next();
            ArrayList arrayList3 = new ArrayList();
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                xi0.b bVar2 = (xi0.b) it9.next();
                Pair pair = !Intrinsics.f(bVar.f306286a, bVar2.f306286a) ? new Pair(bVar, bVar2) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            a0.x(arrayList3, arrayList2);
        }
        return arrayList2;
    }

    public static String b(xi0.b bVar) {
        String strE = cp5.d.e(bVar);
        if (strE.length() == 0) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            strE = cp5.d.q(locale, bVar);
            if (strE == null) {
                return bVar.f306286a;
            }
        }
        return strE;
    }
}
