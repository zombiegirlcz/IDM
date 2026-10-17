package pke;

import com.revolut.feature.tab.invest.impl.data.service.TradingBannersService;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import pij.d1;
import pjg.i;
import vke.e;
import w4l.f;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingBannersService f237011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f237012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f237013c;
    public final f d;

    public d(TradingBannersService tradingBannersService, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(tradingBannersService, "tradingBannersService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f237011a = tradingBannersService;
        this.f237012b = memoryCache;
        this.f237013c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: pke.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f237007b;

            {
                this.f237007b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String str;
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        vke.d bannerType = (vke.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
                        TradingBannersService tradingBannersService2 = this.f237007b.f237011a;
                        Intrinsics.checkNotNullParameter(bannerType, "<this>");
                        int i2 = nke.a.f216800a[bannerType.ordinal()];
                        if (i2 == 1) {
                            str = "news";
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "promo";
                        }
                        d0<List<oke.b>> banners = tradingBannersService2.getBanners(str);
                        int i3 = 3;
                        i iVar = new i(new d1(bannerType, i3), i3);
                        banners.getClass();
                        ufm.i iVar2 = new ufm.i(banners, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        vke.d bannerType2 = (vke.d) obj2;
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bannerType2, "bannerType");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        this.f237007b.f237012b.f(d.a(bannerType2), banners2);
                        return Unit.f186387a;
                    default:
                        vke.d bannerType3 = (vke.d) obj2;
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bannerType3, "bannerType");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar = this.f237007b.f237013c;
                        String strA = d.a(bannerType3);
                        List<vke.c> list = banners3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (vke.c cVar2 : list) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            String str2 = cVar2.f289918a;
                            String str3 = cVar2.f289921g;
                            String str4 = cVar2.f289920c;
                            String str5 = cVar2.e;
                            vke.a aVar = cVar2.f;
                            oke.a eVar = null;
                            if (aVar instanceof vke.b) {
                                vke.b bVar = (vke.b) aVar;
                                String str6 = bVar.f289916a;
                                a80.d dVar = bVar.f289917b;
                                eVar = new oke.c(str6, dVar != null ? new oke.d(dVar.f1985a, dVar.f1986b) : null);
                            } else if (aVar instanceof e) {
                                e eVar2 = (e) aVar;
                                eVar = new oke.e(eVar2.f289922a, eVar2.f289923b);
                            } else if (aVar != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            arrayList.add(new oke.b(str2, str3, str4, str5, eVar, cVar2.f289919b));
                        }
                        cVar.G(arrayList, strA, kii.e.o(oke.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: pke.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f237009b;

            {
                this.f237009b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                vke.d bannerType = (vke.d) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
                        return (List) this.f237009b.f237012b.get(d.a(bannerType));
                    default:
                        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
                        Iterable iterable = (List) p.a.j(oke.b.class, KTypeProjection.INSTANCE, List.class, this.f237009b.f237013c, d.a(bannerType));
                        if (iterable == null) {
                            iterable = f0.f322471a;
                        }
                        Iterable iterable2 = iterable;
                        ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
                        Iterator it8 = iterable2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oi0.d.O((oke.b) it8.next(), bannerType));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: pke.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f237007b;

            {
                this.f237007b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String str;
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        vke.d bannerType = (vke.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
                        TradingBannersService tradingBannersService2 = this.f237007b.f237011a;
                        Intrinsics.checkNotNullParameter(bannerType, "<this>");
                        int i22 = nke.a.f216800a[bannerType.ordinal()];
                        if (i22 == 1) {
                            str = "news";
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "promo";
                        }
                        d0<List<oke.b>> banners = tradingBannersService2.getBanners(str);
                        int i3 = 3;
                        i iVar = new i(new d1(bannerType, i3), i3);
                        banners.getClass();
                        ufm.i iVar2 = new ufm.i(banners, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        vke.d bannerType2 = (vke.d) obj2;
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bannerType2, "bannerType");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        this.f237007b.f237012b.f(d.a(bannerType2), banners2);
                        return Unit.f186387a;
                    default:
                        vke.d bannerType3 = (vke.d) obj2;
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bannerType3, "bannerType");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar = this.f237007b.f237013c;
                        String strA = d.a(bannerType3);
                        List<vke.c> list = banners3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (vke.c cVar2 : list) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            String str2 = cVar2.f289918a;
                            String str3 = cVar2.f289921g;
                            String str4 = cVar2.f289920c;
                            String str5 = cVar2.e;
                            vke.a aVar = cVar2.f;
                            oke.a eVar = null;
                            if (aVar instanceof vke.b) {
                                vke.b bVar = (vke.b) aVar;
                                String str6 = bVar.f289916a;
                                a80.d dVar = bVar.f289917b;
                                eVar = new oke.c(str6, dVar != null ? new oke.d(dVar.f1985a, dVar.f1986b) : null);
                            } else if (aVar instanceof e) {
                                e eVar2 = (e) aVar;
                                eVar = new oke.e(eVar2.f289922a, eVar2.f289923b);
                            } else if (aVar != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            arrayList.add(new oke.b(str2, str3, str4, str5, eVar, cVar2.f289919b));
                        }
                        cVar.G(arrayList, strA, kii.e.o(oke.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: pke.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f237009b;

            {
                this.f237009b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                vke.d bannerType = (vke.d) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
                        return (List) this.f237009b.f237012b.get(d.a(bannerType));
                    default:
                        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
                        Iterable iterable = (List) p.a.j(oke.b.class, KTypeProjection.INSTANCE, List.class, this.f237009b.f237013c, d.a(bannerType));
                        if (iterable == null) {
                            iterable = f0.f322471a;
                        }
                        Iterable iterable2 = iterable;
                        ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
                        Iterator it8 = iterable2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oi0.d.O((oke.b) it8.next(), bannerType));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new f(function2, function1, function22, function12, new Function2(this) { // from class: pke.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f237007b;

            {
                this.f237007b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String str;
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        vke.d bannerType = (vke.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
                        TradingBannersService tradingBannersService2 = this.f237007b.f237011a;
                        Intrinsics.checkNotNullParameter(bannerType, "<this>");
                        int i22 = nke.a.f216800a[bannerType.ordinal()];
                        if (i22 == 1) {
                            str = "news";
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "promo";
                        }
                        d0<List<oke.b>> banners = tradingBannersService2.getBanners(str);
                        int i32 = 3;
                        i iVar = new i(new d1(bannerType, i32), i32);
                        banners.getClass();
                        ufm.i iVar2 = new ufm.i(banners, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        vke.d bannerType2 = (vke.d) obj2;
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bannerType2, "bannerType");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        this.f237007b.f237012b.f(d.a(bannerType2), banners2);
                        return Unit.f186387a;
                    default:
                        vke.d bannerType3 = (vke.d) obj2;
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bannerType3, "bannerType");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar = this.f237007b.f237013c;
                        String strA = d.a(bannerType3);
                        List<vke.c> list = banners3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (vke.c cVar2 : list) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            String str2 = cVar2.f289918a;
                            String str3 = cVar2.f289921g;
                            String str4 = cVar2.f289920c;
                            String str5 = cVar2.e;
                            vke.a aVar = cVar2.f;
                            oke.a eVar = null;
                            if (aVar instanceof vke.b) {
                                vke.b bVar = (vke.b) aVar;
                                String str6 = bVar.f289916a;
                                a80.d dVar = bVar.f289917b;
                                eVar = new oke.c(str6, dVar != null ? new oke.d(dVar.f1985a, dVar.f1986b) : null);
                            } else if (aVar instanceof e) {
                                e eVar2 = (e) aVar;
                                eVar = new oke.e(eVar2.f289922a, eVar2.f289923b);
                            } else if (aVar != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            arrayList.add(new oke.b(str2, str3, str4, str5, eVar, cVar2.f289919b));
                        }
                        cVar.G(arrayList, strA, kii.e.o(oke.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(vke.d dVar) {
        int i = c.f237010a[dVar.ordinal()];
        if (i == 1) {
            return "NEWS_BANNERS";
        }
        if (i == 2) {
            return "PROMO_BANNERS";
        }
        throw new NoWhenBranchMatchedException();
    }
}
