package b4d;

import com.revolut.feature.separate_favourites.item_data.impl.alerts.universal.network.UniversalAlertsService;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import efm.d0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UniversalAlertsService f12305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f12306c;
    public final ue0.c d;
    public final j e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12307g;

    public i(b dao, UniversalAlertsService universalAlertsService, ne0.j memoryCache, ue0.c storage, j previewAlertItemsProvider) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(universalAlertsService, "universalAlertsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(previewAlertItemsProvider, "previewAlertItemsProvider");
        this.f12304a = dao;
        this.f12305b = universalAlertsService;
        this.f12306c = memoryCache;
        this.d = storage;
        this.e = previewAlertItemsProvider;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: b4d.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f12300b;

            {
                this.f12300b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                c4d.a aVar;
                switch (i) {
                    case 0:
                        mgd.g params = (mgd.g) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        b bVar = this.f12300b.f12304a;
                        Integer num = params.e;
                        Integer num2 = params.f;
                        if (params.d == null && ((num == null && num2 == null) || (num != null && num2 == null && num.intValue() > data.size()))) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it8 = data.iterator();
                            while (it8.hasNext()) {
                                linkedHashSet.add(((AlertItem) it8.next()).getF86876a());
                            }
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(params, "params");
                            ArrayList arrayListB = bVar.b(params);
                            ArrayList arrayList = new ArrayList(w.t(arrayListB, 10));
                            Iterator it9 = arrayListB.iterator();
                            while (it9.hasNext()) {
                                arrayList.add(((c4d.a) it9.next()).f21132a);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                if (!linkedHashSet.contains((String) obj4)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                bVar.e(arrayList2);
                            }
                        }
                        List<AlertItem> list = data;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        for (AlertItem alertItem : list) {
                            Intrinsics.checkNotNullParameter(alertItem, "<this>");
                            if (alertItem instanceof AlertItem.TargetPrice) {
                                AlertItem.TargetPrice targetPrice = (AlertItem.TargetPrice) alertItem;
                                String str = targetPrice.f86870a;
                                FavouritesAssetDetails favouritesAssetDetails = targetPrice.f86871b;
                                aVar = new c4d.a(str, favouritesAssetDetails.f86863a, favouritesAssetDetails.f86865c, favouritesAssetDetails.d.f86866a, targetPrice.f86872c, targetPrice.d, targetPrice.e, targetPrice.f86874h, "TARGET_PRICE", targetPrice.f86873g, targetPrice.i.name(), null, null, 6144);
                            } else {
                                if (!(alertItem instanceof AlertItem.Volatility)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                AlertItem.Volatility volatility = (AlertItem.Volatility) alertItem;
                                String str2 = volatility.f86876a;
                                FavouritesAssetDetails favouritesAssetDetails2 = volatility.f86877b;
                                String str3 = favouritesAssetDetails2.f86863a;
                                String str4 = favouritesAssetDetails2.f86865c;
                                String str5 = favouritesAssetDetails2.d.f86866a;
                                String str6 = volatility.f86878c;
                                BigDecimal ZERO = BigDecimal.ZERO;
                                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                                aVar = new c4d.a(str2, str3, str4, str5, str6, ZERO, volatility.e, null, "PRICE_CHANGE", volatility.f, null, volatility.d, volatility.f86879g.name(), 1024);
                            }
                            arrayList3.add(aVar);
                        }
                        bVar.c(arrayList3);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        mgd.g params2 = (mgd.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f205262a.isEmpty()) {
                            ufm.b bVarM = d0.m(f0.f322471a);
                            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                            return bVarM;
                        }
                        UniversalAlertsService universalAlertsService2 = this.f12300b.f12305b;
                        List list2 = params2.f205263b;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(u1.g((mgd.d) it10.next(), f4d.b.a()));
                        }
                        List list3 = params2.f205262a;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            e4d.a aVarF = xam.a.F((FavouritesAssetTypeKey) it11.next());
                            if (aVarF != null) {
                                arrayList5.add(aVarF);
                            }
                        }
                        List<String> list4 = params2.f205264c;
                        List<String> list5 = params2.d;
                        Integer num3 = params2.e;
                        List listK = params2.f205266h;
                        if (listK == null) {
                            listK = v.k(mgd.f.TARGET_PRICE, mgd.f.PRICE_CHANGE);
                        }
                        List list6 = listK;
                        ArrayList arrayList6 = new ArrayList(w.t(list6, 10));
                        Iterator it12 = list6.iterator();
                        while (it12.hasNext()) {
                            arrayList6.add(((mgd.f) it12.next()).name());
                        }
                        d0<g4d.f> alerts = universalAlertsService2.getAlerts(arrayList4, arrayList5, list4, list5, num3, arrayList6);
                        b0a.h hVar = new b0a.h(9, new b0a.j(24));
                        alerts.getClass();
                        ufm.i iVar = new ufm.i(alerts, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        mgd.g params3 = (mgd.g) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f12300b.f12306c.f(g.a(i.Companion, params3), data2);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: b4d.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f12302b;

            {
                this.f12302b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                mgd.g params = (mgd.g) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f12302b.f12306c.get(g.a(i.Companion, params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ArrayList arrayListB = this.f12302b.f12304a.b(params);
                        ArrayList arrayList = new ArrayList(w.t(arrayListB, 10));
                        Iterator it8 = arrayListB.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(d4d.b.a((c4d.a) it8.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        Function2 function22 = new Function2(this) { // from class: b4d.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f12300b;

            {
                this.f12300b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                c4d.a aVar;
                switch (i3) {
                    case 0:
                        mgd.g params = (mgd.g) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        b bVar = this.f12300b.f12304a;
                        Integer num = params.e;
                        Integer num2 = params.f;
                        if (params.d == null && ((num == null && num2 == null) || (num != null && num2 == null && num.intValue() > data.size()))) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it8 = data.iterator();
                            while (it8.hasNext()) {
                                linkedHashSet.add(((AlertItem) it8.next()).getF86876a());
                            }
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(params, "params");
                            ArrayList arrayListB = bVar.b(params);
                            ArrayList arrayList = new ArrayList(w.t(arrayListB, 10));
                            Iterator it9 = arrayListB.iterator();
                            while (it9.hasNext()) {
                                arrayList.add(((c4d.a) it9.next()).f21132a);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                if (!linkedHashSet.contains((String) obj4)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                bVar.e(arrayList2);
                            }
                        }
                        List<AlertItem> list = data;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        for (AlertItem alertItem : list) {
                            Intrinsics.checkNotNullParameter(alertItem, "<this>");
                            if (alertItem instanceof AlertItem.TargetPrice) {
                                AlertItem.TargetPrice targetPrice = (AlertItem.TargetPrice) alertItem;
                                String str = targetPrice.f86870a;
                                FavouritesAssetDetails favouritesAssetDetails = targetPrice.f86871b;
                                aVar = new c4d.a(str, favouritesAssetDetails.f86863a, favouritesAssetDetails.f86865c, favouritesAssetDetails.d.f86866a, targetPrice.f86872c, targetPrice.d, targetPrice.e, targetPrice.f86874h, "TARGET_PRICE", targetPrice.f86873g, targetPrice.i.name(), null, null, 6144);
                            } else {
                                if (!(alertItem instanceof AlertItem.Volatility)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                AlertItem.Volatility volatility = (AlertItem.Volatility) alertItem;
                                String str2 = volatility.f86876a;
                                FavouritesAssetDetails favouritesAssetDetails2 = volatility.f86877b;
                                String str3 = favouritesAssetDetails2.f86863a;
                                String str4 = favouritesAssetDetails2.f86865c;
                                String str5 = favouritesAssetDetails2.d.f86866a;
                                String str6 = volatility.f86878c;
                                BigDecimal ZERO = BigDecimal.ZERO;
                                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                                aVar = new c4d.a(str2, str3, str4, str5, str6, ZERO, volatility.e, null, "PRICE_CHANGE", volatility.f, null, volatility.d, volatility.f86879g.name(), 1024);
                            }
                            arrayList3.add(aVar);
                        }
                        bVar.c(arrayList3);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        mgd.g params2 = (mgd.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f205262a.isEmpty()) {
                            ufm.b bVarM = d0.m(f0.f322471a);
                            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                            return bVarM;
                        }
                        UniversalAlertsService universalAlertsService2 = this.f12300b.f12305b;
                        List list2 = params2.f205263b;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(u1.g((mgd.d) it10.next(), f4d.b.a()));
                        }
                        List list3 = params2.f205262a;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            e4d.a aVarF = xam.a.F((FavouritesAssetTypeKey) it11.next());
                            if (aVarF != null) {
                                arrayList5.add(aVarF);
                            }
                        }
                        List<String> list4 = params2.f205264c;
                        List<String> list5 = params2.d;
                        Integer num3 = params2.e;
                        List listK = params2.f205266h;
                        if (listK == null) {
                            listK = v.k(mgd.f.TARGET_PRICE, mgd.f.PRICE_CHANGE);
                        }
                        List list6 = listK;
                        ArrayList arrayList6 = new ArrayList(w.t(list6, 10));
                        Iterator it12 = list6.iterator();
                        while (it12.hasNext()) {
                            arrayList6.add(((mgd.f) it12.next()).name());
                        }
                        d0<g4d.f> alerts = universalAlertsService2.getAlerts(arrayList4, arrayList5, list4, list5, num3, arrayList6);
                        b0a.h hVar = new b0a.h(9, new b0a.j(24));
                        alerts.getClass();
                        ufm.i iVar = new ufm.i(alerts, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        mgd.g params3 = (mgd.g) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f12300b.f12306c.f(g.a(i.Companion, params3), data2);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 1;
        Function1 function12 = new Function1(this) { // from class: b4d.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f12302b;

            {
                this.f12302b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                mgd.g params = (mgd.g) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f12302b.f12306c.get(g.a(i.Companion, params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ArrayList arrayListB = this.f12302b.f12304a.b(params);
                        ArrayList arrayList = new ArrayList(w.t(arrayListB, 10));
                        Iterator it8 = arrayListB.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(d4d.b.a((c4d.a) it8.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        };
        final int i6 = 0;
        this.f = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: b4d.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f12300b;

            {
                this.f12300b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                c4d.a aVar;
                switch (i6) {
                    case 0:
                        mgd.g params = (mgd.g) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        b bVar = this.f12300b.f12304a;
                        Integer num = params.e;
                        Integer num2 = params.f;
                        if (params.d == null && ((num == null && num2 == null) || (num != null && num2 == null && num.intValue() > data.size()))) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it8 = data.iterator();
                            while (it8.hasNext()) {
                                linkedHashSet.add(((AlertItem) it8.next()).getF86876a());
                            }
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(params, "params");
                            ArrayList arrayListB = bVar.b(params);
                            ArrayList arrayList = new ArrayList(w.t(arrayListB, 10));
                            Iterator it9 = arrayListB.iterator();
                            while (it9.hasNext()) {
                                arrayList.add(((c4d.a) it9.next()).f21132a);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                if (!linkedHashSet.contains((String) obj4)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                bVar.e(arrayList2);
                            }
                        }
                        List<AlertItem> list = data;
                        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                        for (AlertItem alertItem : list) {
                            Intrinsics.checkNotNullParameter(alertItem, "<this>");
                            if (alertItem instanceof AlertItem.TargetPrice) {
                                AlertItem.TargetPrice targetPrice = (AlertItem.TargetPrice) alertItem;
                                String str = targetPrice.f86870a;
                                FavouritesAssetDetails favouritesAssetDetails = targetPrice.f86871b;
                                aVar = new c4d.a(str, favouritesAssetDetails.f86863a, favouritesAssetDetails.f86865c, favouritesAssetDetails.d.f86866a, targetPrice.f86872c, targetPrice.d, targetPrice.e, targetPrice.f86874h, "TARGET_PRICE", targetPrice.f86873g, targetPrice.i.name(), null, null, 6144);
                            } else {
                                if (!(alertItem instanceof AlertItem.Volatility)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                AlertItem.Volatility volatility = (AlertItem.Volatility) alertItem;
                                String str2 = volatility.f86876a;
                                FavouritesAssetDetails favouritesAssetDetails2 = volatility.f86877b;
                                String str3 = favouritesAssetDetails2.f86863a;
                                String str4 = favouritesAssetDetails2.f86865c;
                                String str5 = favouritesAssetDetails2.d.f86866a;
                                String str6 = volatility.f86878c;
                                BigDecimal ZERO = BigDecimal.ZERO;
                                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                                aVar = new c4d.a(str2, str3, str4, str5, str6, ZERO, volatility.e, null, "PRICE_CHANGE", volatility.f, null, volatility.d, volatility.f86879g.name(), 1024);
                            }
                            arrayList3.add(aVar);
                        }
                        bVar.c(arrayList3);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        mgd.g params2 = (mgd.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f205262a.isEmpty()) {
                            ufm.b bVarM = d0.m(f0.f322471a);
                            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                            return bVarM;
                        }
                        UniversalAlertsService universalAlertsService2 = this.f12300b.f12305b;
                        List list2 = params2.f205263b;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(u1.g((mgd.d) it10.next(), f4d.b.a()));
                        }
                        List list3 = params2.f205262a;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it11 = list3.iterator();
                        while (it11.hasNext()) {
                            e4d.a aVarF = xam.a.F((FavouritesAssetTypeKey) it11.next());
                            if (aVarF != null) {
                                arrayList5.add(aVarF);
                            }
                        }
                        List<String> list4 = params2.f205264c;
                        List<String> list5 = params2.d;
                        Integer num3 = params2.e;
                        List listK = params2.f205266h;
                        if (listK == null) {
                            listK = v.k(mgd.f.TARGET_PRICE, mgd.f.PRICE_CHANGE);
                        }
                        List list6 = listK;
                        ArrayList arrayList6 = new ArrayList(w.t(list6, 10));
                        Iterator it12 = list6.iterator();
                        while (it12.hasNext()) {
                            arrayList6.add(((mgd.f) it12.next()).name());
                        }
                        d0<g4d.f> alerts = universalAlertsService2.getAlerts(arrayList4, arrayList5, list4, list5, num3, arrayList6);
                        b0a.h hVar = new b0a.h(9, new b0a.j(24));
                        alerts.getClass();
                        ufm.i iVar = new ufm.i(alerts, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        mgd.g params3 = (mgd.g) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f12300b.f12306c.f(g.a(i.Companion, params3), data2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        this.f12307g = r0.k(new Pair("SECURITY", 0), new Pair("FIAT", 0), new Pair("CRYPTO", 1), new Pair("COMMODITY", 2));
    }

    public final void a(FavouritesAssetTypeKey assetTypeKey) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        this.f.c(null, (1 & 2) == 0, new as9.a(assetTypeKey, this, 27));
    }
}
