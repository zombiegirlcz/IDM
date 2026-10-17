package ge5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nw5.j;
import wsg.n;
import zhm.a0;
import zsc.p;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f143228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td0.b f143229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f143230c;
    public final n d;

    public g(fk3.a configurationInteractor, td0.b currencySetsProvider, j cryptoStatsInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f143228a = configurationInteractor;
        this.f143229b = currencySetsProvider;
        this.f143230c = cryptoStatsInteractor;
        this.d = walletInteractor;
    }

    public static final ArrayList a(g gVar, String str, List list, List list2) {
        gVar.getClass();
        List listM0 = d0.m0(d0.F0(str).toString(), new char[]{p.SPACE_CHAR}, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            xi0.b bVar = (xi0.b) it8.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                xi0.b bVar2 = (xi0.b) it9.next();
                Pair pair = (Intrinsics.f(bVar.f306286a, bVar2.f306286a) || !(b(listM0, bVar) || b(listM0, bVar2))) ? null : new Pair(bVar, bVar2);
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            a0.x(arrayList2, arrayList);
        }
        return arrayList;
    }

    public static boolean b(List list, xi0.b bVar) {
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            String strC = c(bVar);
            String str2 = bVar.f306286a;
            if (d0.J(str2, str, true) || d0.J(strC, str, true) || d0.J(str, str2, true) || d0.J(str, strC, true)) {
                return true;
            }
        }
        return false;
    }

    public static String c(xi0.b bVar) {
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
