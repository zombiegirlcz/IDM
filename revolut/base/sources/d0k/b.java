package d0k;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import h0k.c;
import h0k.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import rzj.g;
import zhm.r0;
import zhm.w;
import zzj.e;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f110447a = r0.k(new Pair("stocks", g.STOCKS), new Pair("crypto", g.CRYPTO), new Pair("commodities", g.COMMODITIES), new Pair("unknown", g.UNKNOWN));

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public static final WealthNewsArticle a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f148419a;
        String str2 = cVar.f148420b;
        String str3 = cVar.f148421c;
        String str4 = cVar.d;
        DateTime dateTime = DateTime.parse(cVar.e);
        Intrinsics.checkNotNullExpressionValue(dateTime, "parse(...)");
        return new WealthNewsArticle(str, str2, str3, str4, dateTime, cVar.f, cVar.f148422g, (g) u1.t(cVar.f148423h, g.UNKNOWN, f110447a), cVar.i, cVar.f148424j);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public static final WealthNewsArticle b(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new WealthNewsArticle(eVar.f326763a, eVar.f326765c, eVar.d, eVar.e, eVar.f, eVar.f326766g, eVar.f326767h, (g) u1.t(eVar.f326764b, g.UNKNOWN, f110447a), eVar.f326768j, eVar.k);
    }

    public static final rzj.e c(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        List list = fVar.f148427a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((c) it8.next()));
        }
        return new rzj.e(fVar.f148428b, arrayList);
    }

    public static final String d(WealthNewsCategory wealthNewsCategory) {
        Intrinsics.checkNotNullParameter(wealthNewsCategory, "<this>");
        if (Intrinsics.f(wealthNewsCategory, WealthNewsCategory.Stocks.f101808b)) {
            return "stocks";
        }
        if (Intrinsics.f(wealthNewsCategory, WealthNewsCategory.Crypto.f101805b)) {
            return "crypto";
        }
        if (Intrinsics.f(wealthNewsCategory, WealthNewsCategory.Commodities.f101804b)) {
            return "commodities";
        }
        if (Intrinsics.f(wealthNewsCategory, WealthNewsCategory.MacroEconomics.f101806b)) {
            return "macroeconomic";
        }
        if (wealthNewsCategory instanceof WealthNewsCategory.Markets) {
            return "markets";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String e(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return u1.g(gVar, f110447a);
    }

    public static final e f(WealthNewsArticle wealthNewsArticle, boolean z, List list, List list2) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(wealthNewsArticle, "<this>");
        String str = wealthNewsArticle.f101797a;
        String str2 = wealthNewsArticle.f101798b;
        String str3 = wealthNewsArticle.f101799c;
        String str4 = wealthNewsArticle.d;
        DateTime dateTime = wealthNewsArticle.e;
        String str5 = wealthNewsArticle.f;
        Integer num = wealthNewsArticle.f101800g;
        String strE = e(wealthNewsArticle.f101801h);
        List list3 = wealthNewsArticle.i;
        List list4 = wealthNewsArticle.f101802j;
        if (list2 != null) {
            List list5 = list2;
            arrayList = new ArrayList(w.t(list5, 10));
            Iterator it8 = list5.iterator();
            while (it8.hasNext()) {
                arrayList.add(((tdh.a) it8.next()).name());
            }
        } else {
            arrayList = null;
        }
        return new e(str, strE, str2, str3, str4, dateTime, str5, num, z, list3, list4, list, arrayList);
    }

    public static ArrayList g(ArrayList arrayList, boolean z, List list, int i) {
        if ((i & 4) != 0) {
            list = null;
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(f((WealthNewsArticle) it8.next(), z, null, list));
        }
        return arrayList2;
    }
}
