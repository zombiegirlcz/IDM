package d2e;

import com.revolut.feature.store.api.model.StoreDealsOfferContext;
import com.revolut.feature.store.api.model.StoreDealsTile;
import com.revolut.feature.store.api.model.StoreDeeplinkOffer;
import com.revolut.feature.store.api.model.StoreGenericBadge;
import com.revolut.feature.store.api.model.StoreLogoBadge;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.model.StoreRichText;
import f2e.g2;
import f2e.h3;
import f2e.r1;
import f2e.t4;
import f2e.v0;
import f2e.w4;
import f2e.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t1e.e0;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f {
    public static final y0 a(StoreDealsOfferContext storeDealsOfferContext) {
        StoreDeeplinkOffer storeDeeplinkOffer;
        StoreDealsOfferContext.Deeplink deeplink = storeDealsOfferContext instanceof StoreDealsOfferContext.Deeplink ? (StoreDealsOfferContext.Deeplink) storeDealsOfferContext : null;
        if (deeplink == null || (storeDeeplinkOffer = deeplink.f88486a) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(storeDeeplinkOffer, "<this>");
        return new y0(storeDeeplinkOffer.f88503a, storeDeeplinkOffer.f88504b);
    }

    public static final StoreDealsOfferContext b(y0 y0Var, h3 h3Var) {
        if (y0Var != null) {
            Intrinsics.checkNotNullParameter(y0Var, "<this>");
            return new StoreDealsOfferContext.Deeplink(new StoreDeeplinkOffer(y0Var.f131771a, y0Var.f131772b));
        }
        if (h3Var != null) {
            return new StoreDealsOfferContext.Mega(j.a(h3Var));
        }
        return null;
    }

    public static final h3 c(StoreDealsOfferContext storeDealsOfferContext) {
        StoreMegaOffer storeMegaOffer;
        StoreDealsOfferContext.Mega mega = storeDealsOfferContext instanceof StoreDealsOfferContext.Mega ? (StoreDealsOfferContext.Mega) storeDealsOfferContext : null;
        if (mega == null || (storeMegaOffer = mega.f88487a) == null) {
            return null;
        }
        return j.b(storeMegaOffer);
    }

    public static final StoreDealsTile d(v0 v0Var) {
        Object objA;
        StoreRichText storeRichText;
        Object objA2;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        String str = v0Var.f131730b;
        g2 g2Var = v0Var.f131733h;
        String str2 = v0Var.f131732g;
        String str3 = v0Var.f131731c;
        Iterable iterable = v0Var.i;
        String str4 = v0Var.f;
        h3 h3Var = v0Var.k;
        y0 y0Var = v0Var.f131734j;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = g.valueOf(str);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        g gVar = (g) objA;
        int i = gVar == null ? -1 : e.f110798a[gVar.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            String str5 = v0Var.f131729a;
            String str6 = v0Var.f131731c;
            String str7 = v0Var.d;
            if (str4 == null) {
                str4 = "";
            }
            if (iterable == null) {
                iterable = f0.f322471a;
            }
            Iterable iterable2 = iterable;
            ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
            Iterator it8 = iterable2.iterator();
            while (it8.hasNext()) {
                arrayList.add(foh.i.z((r1) it8.next()));
            }
            return new StoreDealsTile.Hero(str5, str6, str7, str4, arrayList, b(y0Var, h3Var));
        }
        if (i == 2) {
            String str8 = v0Var.f131729a;
            if (str3 == null) {
                str3 = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return new StoreDealsTile.Logo(str8, str3, str2, g2Var != null ? g4i.a.B(g2Var) : new StoreLogoBadge(null, null), b(y0Var, h3Var));
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            String str9 = v0Var.f131729a;
            String str10 = str3 == null ? "" : str3;
            String str11 = v0Var.d;
            String str12 = str4 == null ? "" : str4;
            String str13 = str2 == null ? "" : str2;
            StoreLogoBadge storeLogoBadgeB = g2Var != null ? g4i.a.B(g2Var) : new StoreLogoBadge(null, null);
            if (iterable == null) {
                iterable = f0.f322471a;
            }
            Iterable iterable3 = iterable;
            ArrayList arrayList2 = new ArrayList(w.t(iterable3, 10));
            Iterator it9 = iterable3.iterator();
            while (it9.hasNext()) {
                arrayList2.add(foh.i.z((r1) it9.next()));
            }
            return new StoreDealsTile.DiscoverMore(str9, str10, str11, str12, str13, storeLogoBadgeB, arrayList2, b(y0Var, h3Var));
        }
        String str14 = v0Var.f131729a;
        String str15 = v0Var.f131731c;
        String str16 = v0Var.d;
        t4 t4Var = v0Var.e;
        if (t4Var != null) {
            Intrinsics.checkNotNullParameter(t4Var, "<this>");
            String str17 = t4Var.f131719a;
            Map mapG = t4Var.f131720b;
            if (mapG == null) {
                mapG = r0.g();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapG.size()));
            for (Map.Entry entry : mapG.entrySet()) {
                Object key = entry.getKey();
                w4 w4Var = (w4) entry.getValue();
                String str18 = w4Var.f131742a;
                try {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    objA2 = e0.valueOf(str18);
                } catch (Throwable th11) {
                    m.Companion companion4 = yhm.m.INSTANCE;
                    objA2 = o.a(th11);
                }
                if (objA2 instanceof n) {
                    objA2 = null;
                }
                e0 e0Var = (e0) objA2;
                if (e0Var == null) {
                    e0Var = e0.UNKNOWN;
                }
                linkedHashMap.put(key, new StoreRichText.Placeholder(e0Var, w4Var.f131743b, w4Var.f131744c));
            }
            storeRichText = new StoreRichText(linkedHashMap, str17);
        } else {
            storeRichText = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable4 = iterable;
        String str19 = str4;
        ArrayList arrayList3 = new ArrayList(w.t(iterable4, 10));
        Iterator it10 = iterable4.iterator();
        while (it10.hasNext()) {
            arrayList3.add(foh.i.z((r1) it10.next()));
        }
        return new StoreDealsTile.Regular(str14, str15, str16, storeRichText, str19, arrayList3, b(y0Var, h3Var));
    }

    public static final v0 e(StoreDealsTile storeDealsTile) {
        t4 t4Var;
        Intrinsics.checkNotNullParameter(storeDealsTile, "<this>");
        if (storeDealsTile instanceof StoreDealsTile.Hero) {
            StoreDealsTile.Hero hero = (StoreDealsTile.Hero) storeDealsTile;
            StoreDealsOfferContext storeDealsOfferContext = hero.f;
            String str = hero.f88493a;
            String str2 = hero.f88494b;
            String str3 = hero.f88495c;
            String str4 = hero.d;
            ArrayList arrayList = hero.e;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(foh.i.C((StoreGenericBadge) it8.next()));
            }
            return new v0(str, "HERO", str2, str3, (t4) null, str4, (String) null, (g2) null, arrayList2, a(storeDealsOfferContext), c(storeDealsOfferContext), 208);
        }
        if (storeDealsTile instanceof StoreDealsTile.Logo) {
            StoreDealsTile.Logo logo = (StoreDealsTile.Logo) storeDealsTile;
            StoreDealsOfferContext storeDealsOfferContext2 = logo.e;
            return new v0(logo.f88496a, "LOGO", logo.f88497b, (String) null, (t4) null, (String) null, logo.f88498c, g4i.a.G(logo.d), (ArrayList) null, a(storeDealsOfferContext2), c(storeDealsOfferContext2), 312);
        }
        if (!(storeDealsTile instanceof StoreDealsTile.Regular)) {
            if (!(storeDealsTile instanceof StoreDealsTile.DiscoverMore)) {
                throw new NoWhenBranchMatchedException();
            }
            StoreDealsTile.DiscoverMore discoverMore = (StoreDealsTile.DiscoverMore) storeDealsTile;
            StoreDealsOfferContext storeDealsOfferContext3 = discoverMore.f88492h;
            String str5 = discoverMore.f88488a;
            String str6 = discoverMore.f88489b;
            String str7 = discoverMore.f88490c;
            String str8 = discoverMore.d;
            String str9 = discoverMore.e;
            g2 g2VarG = g4i.a.G(discoverMore.f);
            ArrayList arrayList3 = discoverMore.f88491g;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                arrayList4.add(foh.i.C((StoreGenericBadge) it9.next()));
            }
            return new v0(str5, "DISCOVER_MORE", str6, str7, (t4) null, str8, str9, g2VarG, arrayList4, a(storeDealsOfferContext3), c(storeDealsOfferContext3), 16);
        }
        StoreDealsTile.Regular regular = (StoreDealsTile.Regular) storeDealsTile;
        StoreDealsOfferContext storeDealsOfferContext4 = regular.f88502g;
        String str10 = regular.f88499a;
        String str11 = regular.f88500b;
        String str12 = regular.f88501c;
        StoreRichText storeRichText = regular.d;
        LinkedHashMap linkedHashMap = null;
        if (storeRichText != null) {
            Intrinsics.checkNotNullParameter(storeRichText, "<this>");
            String str13 = storeRichText.f88592a;
            LinkedHashMap linkedHashMap2 = storeRichText.f88593b;
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap2 = null;
            }
            if (linkedHashMap2 != null) {
                linkedHashMap = new LinkedHashMap(q0.b(linkedHashMap2.size()));
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    Object key = entry.getKey();
                    StoreRichText.Placeholder placeholder = (StoreRichText.Placeholder) entry.getValue();
                    linkedHashMap.put(key, new w4(placeholder.f88594a.name(), placeholder.f88595b, placeholder.f88596c));
                }
            }
            t4Var = new t4(linkedHashMap, str13);
        } else {
            t4Var = null;
        }
        String str14 = regular.e;
        ArrayList arrayList5 = regular.f;
        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
        Iterator it10 = arrayList5.iterator();
        while (it10.hasNext()) {
            arrayList6.add(foh.i.C((StoreGenericBadge) it10.next()));
        }
        return new v0(str10, "REGULAR", str11, str12, t4Var, str14, (String) null, (g2) null, arrayList6, a(storeDealsOfferContext4), c(storeDealsOfferContext4), 192);
    }
}
