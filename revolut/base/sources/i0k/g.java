package i0k;

import com.revolut.feature.global_markets.domain.Market;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.feature.marketnews.impl.data.network.wealth.WealthNewsService;
import efm.d0;
import hy2.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import te0.w;
import ufm.i;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p0k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsService f157420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f157421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzj.f f157422c;
    public final DateTimeFormatter d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f157423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f157424h;

    public g(WealthNewsService service, ne0.d memoryCache, zzj.f wealthNewsDao, DateTimeFormatter dateTimeFormatter, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(wealthNewsDao, "wealthNewsDao");
        Intrinsics.checkNotNullParameter(dateTimeFormatter, "dateTimeFormatter");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f157420a = service;
        this.f157421b = memoryCache;
        this.f157422c = wealthNewsDao;
        this.d = dateTimeFormatter;
        final int i = 0;
        uj0.b bVarK0 = w.k0(networkStateRepository, new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i2 = d0k.a.f110446a[market.ordinal()];
                            if (i2 == 1) {
                                str = "US";
                            } else if (i2 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i3 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i3) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str4 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar3 = gVar2;
                                        if (str4 != null) {
                                            return gVar3.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar3.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar4 = gVar2;
                                        if (str5 != null) {
                                            return gVar4.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list2 = list;
                                        if (list2 == null || list2.isEmpty()) {
                                            return gVar4.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list;
                                        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar4.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList.add(listE);
                                        }
                                        Iterator it8 = arrayList.iterator();
                                        if (it8.hasNext()) {
                                            Object next = it8.next();
                                            while (it8.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it8.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i5 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i5) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        });
        final int i2 = 7;
        Function1 function1 = new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i2) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i22 = d0k.a.f110446a[market.ordinal()];
                            if (i22 == 1) {
                                str = "US";
                            } else if (i22 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i22 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i3 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i3) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i5 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i5) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        };
        final int i3 = 4;
        Function2 function2 = new Function2(this) { // from class: i0k.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157418b;

            {
                this.f157418b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        o0k.b params = (o0k.b) obj2;
                        rzj.e news = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(news, "news");
                        this.f157418b.f157421b.f(g.d(params, false), news);
                        break;
                    case 1:
                        rzj.e news2 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter((o0k.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(news2, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news2.f258693a, false, null, 6));
                        break;
                    case 2:
                        o0k.b params2 = (o0k.b) obj2;
                        rzj.e news3 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(news3, "news");
                        this.f157418b.f157421b.f(g.d(params2, true), news3);
                        break;
                    case 3:
                        o0k.b params3 = (o0k.b) obj2;
                        rzj.e news4 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(news4, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news4.f258693a, true, params3.f221252b, 2));
                        break;
                    case 4:
                        o0k.a params4 = (o0k.a) obj2;
                        WealthNewsArticle article = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(article, "article");
                        this.f157418b.f157421b.f(params4.f221249a, article);
                        break;
                    case 5:
                        o0k.a params5 = (o0k.a) obj2;
                        WealthNewsArticle article2 = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(article2, "article");
                        this.f157418b.f157422c.i(d0k.b.f(article2, params5.f221250b, null, null));
                        break;
                    case 6:
                        o0k.c params6 = (o0k.c) obj2;
                        rzj.e news5 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(news5, "news");
                        ne0.d dVar = this.f157418b.f157421b;
                        g.e(params6);
                        dVar.f("null|null|null", news5);
                        break;
                    default:
                        o0k.c params7 = (o0k.c) obj2;
                        rzj.e news6 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(news6, "news");
                        zzj.f fVar = this.f157418b.f157422c;
                        ArrayList arrayList = news6.f258693a;
                        params7.getClass();
                        fVar.a(d0k.b.g(arrayList, false, null, 4));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 8;
        Function1 function12 = new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i5) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i22 = d0k.a.f110446a[market.ordinal()];
                            if (i22 == 1) {
                                str = "US";
                            } else if (i22 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i22 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i32 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i32) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i59 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i59) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        };
        final int i6 = 5;
        this.e = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: i0k.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157418b;

            {
                this.f157418b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        o0k.b params = (o0k.b) obj2;
                        rzj.e news = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(news, "news");
                        this.f157418b.f157421b.f(g.d(params, false), news);
                        break;
                    case 1:
                        rzj.e news2 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter((o0k.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(news2, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news2.f258693a, false, null, 6));
                        break;
                    case 2:
                        o0k.b params2 = (o0k.b) obj2;
                        rzj.e news3 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(news3, "news");
                        this.f157418b.f157421b.f(g.d(params2, true), news3);
                        break;
                    case 3:
                        o0k.b params3 = (o0k.b) obj2;
                        rzj.e news4 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(news4, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news4.f258693a, true, params3.f221252b, 2));
                        break;
                    case 4:
                        o0k.a params4 = (o0k.a) obj2;
                        WealthNewsArticle article = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(article, "article");
                        this.f157418b.f157421b.f(params4.f221249a, article);
                        break;
                    case 5:
                        o0k.a params5 = (o0k.a) obj2;
                        WealthNewsArticle article2 = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(article2, "article");
                        this.f157418b.f157422c.i(d0k.b.f(article2, params5.f221250b, null, null));
                        break;
                    case 6:
                        o0k.c params6 = (o0k.c) obj2;
                        rzj.e news5 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(news5, "news");
                        ne0.d dVar = this.f157418b.f157421b;
                        g.e(params6);
                        dVar.f("null|null|null", news5);
                        break;
                    default:
                        o0k.c params7 = (o0k.c) obj2;
                        rzj.e news6 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(news6, "news");
                        zzj.f fVar = this.f157418b.f157422c;
                        ArrayList arrayList = news6.f258693a;
                        params7.getClass();
                        fVar.a(d0k.b.g(arrayList, false, null, 4));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 9;
        uj0.b bVarK02 = w.k0(networkStateRepository, new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i21) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i22 = d0k.a.f110446a[market.ordinal()];
                            if (i22 == 1) {
                                str = "US";
                            } else if (i22 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i22 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i32 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i32) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i59 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i59) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        });
        final int i22 = 10;
        Function1 function13 = new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i22) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i222 = d0k.a.f110446a[market.ordinal()];
                            if (i222 == 1) {
                                str = "US";
                            } else if (i222 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i222 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i32 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i32) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i59 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i59) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        };
        final int i32 = 6;
        Function2 function22 = new Function2(this) { // from class: i0k.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157418b;

            {
                this.f157418b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        o0k.b params = (o0k.b) obj2;
                        rzj.e news = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(news, "news");
                        this.f157418b.f157421b.f(g.d(params, false), news);
                        break;
                    case 1:
                        rzj.e news2 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter((o0k.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(news2, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news2.f258693a, false, null, 6));
                        break;
                    case 2:
                        o0k.b params2 = (o0k.b) obj2;
                        rzj.e news3 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(news3, "news");
                        this.f157418b.f157421b.f(g.d(params2, true), news3);
                        break;
                    case 3:
                        o0k.b params3 = (o0k.b) obj2;
                        rzj.e news4 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(news4, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news4.f258693a, true, params3.f221252b, 2));
                        break;
                    case 4:
                        o0k.a params4 = (o0k.a) obj2;
                        WealthNewsArticle article = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(article, "article");
                        this.f157418b.f157421b.f(params4.f221249a, article);
                        break;
                    case 5:
                        o0k.a params5 = (o0k.a) obj2;
                        WealthNewsArticle article2 = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(article2, "article");
                        this.f157418b.f157422c.i(d0k.b.f(article2, params5.f221250b, null, null));
                        break;
                    case 6:
                        o0k.c params6 = (o0k.c) obj2;
                        rzj.e news5 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(news5, "news");
                        ne0.d dVar = this.f157418b.f157421b;
                        g.e(params6);
                        dVar.f("null|null|null", news5);
                        break;
                    default:
                        o0k.c params7 = (o0k.c) obj2;
                        rzj.e news6 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(news6, "news");
                        zzj.f fVar = this.f157418b.f157422c;
                        ArrayList arrayList = news6.f258693a;
                        params7.getClass();
                        fVar.a(d0k.b.g(arrayList, false, null, 4));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i33 = 11;
        Function1 function14 = new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i33) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i222 = d0k.a.f110446a[market.ordinal()];
                            if (i222 == 1) {
                                str = "US";
                            } else if (i222 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i222 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i322 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i322) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i59 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i59) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        };
        final int i43 = 7;
        this.f = new w4l.f(bVarK02, function13, function22, function14, new Function2(this) { // from class: i0k.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157418b;

            {
                this.f157418b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        o0k.b params = (o0k.b) obj2;
                        rzj.e news = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(news, "news");
                        this.f157418b.f157421b.f(g.d(params, false), news);
                        break;
                    case 1:
                        rzj.e news2 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter((o0k.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(news2, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news2.f258693a, false, null, 6));
                        break;
                    case 2:
                        o0k.b params2 = (o0k.b) obj2;
                        rzj.e news3 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(news3, "news");
                        this.f157418b.f157421b.f(g.d(params2, true), news3);
                        break;
                    case 3:
                        o0k.b params3 = (o0k.b) obj2;
                        rzj.e news4 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(news4, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news4.f258693a, true, params3.f221252b, 2));
                        break;
                    case 4:
                        o0k.a params4 = (o0k.a) obj2;
                        WealthNewsArticle article = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(article, "article");
                        this.f157418b.f157421b.f(params4.f221249a, article);
                        break;
                    case 5:
                        o0k.a params5 = (o0k.a) obj2;
                        WealthNewsArticle article2 = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(article2, "article");
                        this.f157418b.f157422c.i(d0k.b.f(article2, params5.f221250b, null, null));
                        break;
                    case 6:
                        o0k.c params6 = (o0k.c) obj2;
                        rzj.e news5 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(news5, "news");
                        ne0.d dVar = this.f157418b.f157421b;
                        g.e(params6);
                        dVar.f("null|null|null", news5);
                        break;
                    default:
                        o0k.c params7 = (o0k.c) obj2;
                        rzj.e news6 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(news6, "news");
                        zzj.f fVar = this.f157418b.f157422c;
                        ArrayList arrayList = news6.f258693a;
                        params7.getClass();
                        fVar.a(d0k.b.g(arrayList, false, null, 4));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i59 = 1;
        uj0.b bVarK03 = w.k0(networkStateRepository, new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i59) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i222 = d0k.a.f110446a[market.ordinal()];
                            if (i222 == 1) {
                                str = "US";
                            } else if (i222 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i222 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i322 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i322) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i592 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i592) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        });
        final int i66 = 2;
        Function1 function15 = new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i66) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i222 = d0k.a.f110446a[market.ordinal()];
                            if (i222 == 1) {
                                str = "US";
                            } else if (i222 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i222 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i322 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i322) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i592 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i592) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        };
        final int i74 = 0;
        Function2 function23 = new Function2(this) { // from class: i0k.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157418b;

            {
                this.f157418b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        o0k.b params = (o0k.b) obj2;
                        rzj.e news = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(news, "news");
                        this.f157418b.f157421b.f(g.d(params, false), news);
                        break;
                    case 1:
                        rzj.e news2 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter((o0k.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(news2, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news2.f258693a, false, null, 6));
                        break;
                    case 2:
                        o0k.b params2 = (o0k.b) obj2;
                        rzj.e news3 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(news3, "news");
                        this.f157418b.f157421b.f(g.d(params2, true), news3);
                        break;
                    case 3:
                        o0k.b params3 = (o0k.b) obj2;
                        rzj.e news4 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(news4, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news4.f258693a, true, params3.f221252b, 2));
                        break;
                    case 4:
                        o0k.a params4 = (o0k.a) obj2;
                        WealthNewsArticle article = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(article, "article");
                        this.f157418b.f157421b.f(params4.f221249a, article);
                        break;
                    case 5:
                        o0k.a params5 = (o0k.a) obj2;
                        WealthNewsArticle article2 = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(article2, "article");
                        this.f157418b.f157422c.i(d0k.b.f(article2, params5.f221250b, null, null));
                        break;
                    case 6:
                        o0k.c params6 = (o0k.c) obj2;
                        rzj.e news5 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(news5, "news");
                        ne0.d dVar = this.f157418b.f157421b;
                        g.e(params6);
                        dVar.f("null|null|null", news5);
                        break;
                    default:
                        o0k.c params7 = (o0k.c) obj2;
                        rzj.e news6 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(news6, "news");
                        zzj.f fVar = this.f157418b.f157422c;
                        ArrayList arrayList = news6.f258693a;
                        params7.getClass();
                        fVar.a(d0k.b.g(arrayList, false, null, 4));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i92 = 3;
        Function1 function16 = new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i92) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i222 = d0k.a.f110446a[market.ordinal()];
                            if (i222 == 1) {
                                str = "US";
                            } else if (i222 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i222 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i322 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i322) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i592 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i592) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        };
        final int i96 = 1;
        this.f157423g = new w4l.f(bVarK03, function15, function23, function16, new Function2(this) { // from class: i0k.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157418b;

            {
                this.f157418b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i96) {
                    case 0:
                        o0k.b params = (o0k.b) obj2;
                        rzj.e news = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(news, "news");
                        this.f157418b.f157421b.f(g.d(params, false), news);
                        break;
                    case 1:
                        rzj.e news2 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter((o0k.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(news2, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news2.f258693a, false, null, 6));
                        break;
                    case 2:
                        o0k.b params2 = (o0k.b) obj2;
                        rzj.e news3 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(news3, "news");
                        this.f157418b.f157421b.f(g.d(params2, true), news3);
                        break;
                    case 3:
                        o0k.b params3 = (o0k.b) obj2;
                        rzj.e news4 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(news4, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news4.f258693a, true, params3.f221252b, 2));
                        break;
                    case 4:
                        o0k.a params4 = (o0k.a) obj2;
                        WealthNewsArticle article = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(article, "article");
                        this.f157418b.f157421b.f(params4.f221249a, article);
                        break;
                    case 5:
                        o0k.a params5 = (o0k.a) obj2;
                        WealthNewsArticle article2 = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(article2, "article");
                        this.f157418b.f157422c.i(d0k.b.f(article2, params5.f221250b, null, null));
                        break;
                    case 6:
                        o0k.c params6 = (o0k.c) obj2;
                        rzj.e news5 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(news5, "news");
                        ne0.d dVar = this.f157418b.f157421b;
                        g.e(params6);
                        dVar.f("null|null|null", news5);
                        break;
                    default:
                        o0k.c params7 = (o0k.c) obj2;
                        rzj.e news6 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(news6, "news");
                        zzj.f fVar = this.f157418b.f157422c;
                        ArrayList arrayList = news6.f258693a;
                        params7.getClass();
                        fVar.a(d0k.b.g(arrayList, false, null, 4));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i99 = 4;
        uj0.b bVarK04 = w.k0(networkStateRepository, new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i99) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i222 = d0k.a.f110446a[market.ordinal()];
                            if (i222 == 1) {
                                str = "US";
                            } else if (i222 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i222 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i322 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i322) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i592 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i592) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        });
        final int i100 = 5;
        Function1 function17 = new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i100) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i222 = d0k.a.f110446a[market.ordinal()];
                            if (i222 == 1) {
                                str = "US";
                            } else if (i222 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i222 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i322 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i322) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i592 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i592) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        };
        final int i101 = 2;
        Function2 function24 = new Function2(this) { // from class: i0k.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157418b;

            {
                this.f157418b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i101) {
                    case 0:
                        o0k.b params = (o0k.b) obj2;
                        rzj.e news = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(news, "news");
                        this.f157418b.f157421b.f(g.d(params, false), news);
                        break;
                    case 1:
                        rzj.e news2 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter((o0k.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(news2, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news2.f258693a, false, null, 6));
                        break;
                    case 2:
                        o0k.b params2 = (o0k.b) obj2;
                        rzj.e news3 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(news3, "news");
                        this.f157418b.f157421b.f(g.d(params2, true), news3);
                        break;
                    case 3:
                        o0k.b params3 = (o0k.b) obj2;
                        rzj.e news4 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(news4, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news4.f258693a, true, params3.f221252b, 2));
                        break;
                    case 4:
                        o0k.a params4 = (o0k.a) obj2;
                        WealthNewsArticle article = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(article, "article");
                        this.f157418b.f157421b.f(params4.f221249a, article);
                        break;
                    case 5:
                        o0k.a params5 = (o0k.a) obj2;
                        WealthNewsArticle article2 = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(article2, "article");
                        this.f157418b.f157422c.i(d0k.b.f(article2, params5.f221250b, null, null));
                        break;
                    case 6:
                        o0k.c params6 = (o0k.c) obj2;
                        rzj.e news5 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(news5, "news");
                        ne0.d dVar = this.f157418b.f157421b;
                        g.e(params6);
                        dVar.f("null|null|null", news5);
                        break;
                    default:
                        o0k.c params7 = (o0k.c) obj2;
                        rzj.e news6 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(news6, "news");
                        zzj.f fVar = this.f157418b.f157422c;
                        ArrayList arrayList = news6.f258693a;
                        params7.getClass();
                        fVar.a(d0k.b.g(arrayList, false, null, 4));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i102 = 6;
        Function1 function18 = new Function1(this) { // from class: i0k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157416b;

            {
                this.f157416b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market;
                String str;
                switch (i102) {
                    case 0:
                        o0k.a params = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<h0k.c> newsArticle = this.f157416b.f157420a.getNewsArticle(params.f221249a);
                        l lVar = new l(new f(3), 27);
                        newsArticle.getClass();
                        i iVar = new i(newsArticle, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o0k.b params2 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar = this.f157416b;
                        WealthNewsService wealthNewsService = gVar.f157420a;
                        String strD = d0k.b.d(params2.f221251a);
                        String str2 = params2.e;
                        WealthNewsCategory wealthNewsCategory = params2.f221251a;
                        boolean z = wealthNewsCategory instanceof WealthNewsCategory.Markets;
                        String str3 = null;
                        if (z) {
                            str2 = null;
                        }
                        WealthNewsCategory.Markets markets = z ? (WealthNewsCategory.Markets) wealthNewsCategory : null;
                        if (markets != null && (market = markets.f101807b) != null) {
                            Intrinsics.checkNotNullParameter(market, "<this>");
                            int i222 = d0k.a.f110446a[market.ordinal()];
                            if (i222 == 1) {
                                str = "US";
                            } else if (i222 == 2) {
                                str = "EUROPE";
                            } else {
                                if (i222 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "APAC";
                            }
                            str3 = str;
                        }
                        d0<h0k.f> wealthNews = wealthNewsService.getWealthNews(strD, str2, str3, gVar.a(params2.f221253c), gVar.a(params2.d), params2.f);
                        l lVar2 = new l(new f(1), 25);
                        wealthNews.getClass();
                        i iVar2 = new i(wealthNews, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o0k.b params3 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return this.f157416b.b(g.d(params3, false));
                    case 3:
                        final o0k.b params4 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        final int i322 = 0;
                        final g gVar2 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i322) {
                                    case 0:
                                        o0k.b bVar = params4;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar2;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params4;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar2;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 4:
                        o0k.b params5 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        g gVar3 = this.f157416b;
                        WealthNewsService wealthNewsService2 = gVar3.f157420a;
                        String strD2 = d0k.b.d(params5.f221251a);
                        String str4 = params5.e;
                        List list = params5.f221252b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(oc.c.A((tdh.a) it8.next()));
                        }
                        d0<h0k.f> personalisedWealthNews = wealthNewsService2.getPersonalisedWealthNews(strD2, str4, arrayList, gVar3.a(params5.f221253c), gVar3.a(params5.d), params5.f);
                        l lVar3 = new l(new f(2), 26);
                        personalisedWealthNews.getClass();
                        i iVar3 = new i(personalisedWealthNews, lVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o0k.b params6 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        return this.f157416b.b(g.d(params6, true));
                    case 6:
                        final o0k.b params7 = (o0k.b) obj2;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        final int i592 = 1;
                        final g gVar4 = this.f157416b;
                        return g.c(new Function0() { // from class: i0k.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj3;
                                switch (i592) {
                                    case 0:
                                        o0k.b bVar = params7;
                                        String str42 = bVar.e;
                                        Integer num = bVar.f;
                                        DateTime dateTime = bVar.d;
                                        DateTime dateTime2 = bVar.f221253c;
                                        WealthNewsCategory wealthNewsCategory2 = bVar.f221251a;
                                        g gVar32 = gVar4;
                                        if (str42 != null) {
                                            return gVar32.f157422c.g(num != null ? num.intValue() : Integer.MAX_VALUE, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, d0k.b.e(wealthNewsCategory2.f101803a), bVar.e);
                                        }
                                        return gVar32.f157422c.d(d0k.b.e(wealthNewsCategory2.f101803a), false, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE, dateTime != null ? dateTime.getMillis() : 0L, num != null ? num.intValue() : Integer.MAX_VALUE);
                                    default:
                                        o0k.b bVar2 = params7;
                                        String str5 = bVar2.e;
                                        List list2 = bVar2.f221252b;
                                        Integer num2 = bVar2.f;
                                        DateTime dateTime3 = bVar2.d;
                                        DateTime dateTime4 = bVar2.f221253c;
                                        WealthNewsCategory wealthNewsCategory3 = bVar2.f221251a;
                                        g gVar42 = gVar4;
                                        if (str5 != null) {
                                            return gVar42.f157422c.g(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, d0k.b.e(wealthNewsCategory3.f101803a), bVar2.e);
                                        }
                                        List list22 = list2;
                                        if (list22 == null || list22.isEmpty()) {
                                            return gVar42.f157422c.d(d0k.b.e(wealthNewsCategory3.f101803a), true, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                                        }
                                        List<tdh.a> list3 = list2;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                                        for (tdh.a aVar : list3) {
                                            zzj.f fVar = gVar42.f157422c;
                                            String strE = d0k.b.e(wealthNewsCategory3.f101803a);
                                            List listE = fVar.e(num2 != null ? num2.intValue() : Integer.MAX_VALUE, dateTime4 != null ? dateTime4.getMillis() : Long.MAX_VALUE, dateTime3 != null ? dateTime3.getMillis() : 0L, strE, aVar.name());
                                            if (listE == null) {
                                                listE = f0.f322471a;
                                            }
                                            arrayList2.add(listE);
                                        }
                                        Iterator it82 = arrayList2.iterator();
                                        if (it82.hasNext()) {
                                            Object next = it82.next();
                                            while (it82.hasNext()) {
                                                next = zhm.d0.d1(zhm.d0.h0((List) next, zhm.d0.i1((List) it82.next())));
                                            }
                                            obj3 = next;
                                        } else {
                                            obj3 = null;
                                        }
                                        return (List) obj3;
                                }
                            }
                        });
                    case 7:
                        o0k.a params8 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) this.f157416b.f157421b.get(params8.f221249a);
                        if (wealthNewsArticle == null || wealthNewsArticle.d == null) {
                            return null;
                        }
                        return wealthNewsArticle;
                    case 8:
                        o0k.a params9 = (o0k.a) obj2;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        zzj.e eVarC = this.f157416b.f157422c.c(params9.f221249a, params9.f221250b);
                        if (eVarC != null) {
                            WealthNewsArticle wealthNewsArticleB = d0k.b.b(eVarC);
                            if (wealthNewsArticleB.d != null) {
                                return wealthNewsArticleB;
                            }
                        }
                        return null;
                    case 9:
                        o0k.c params10 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params10, "params");
                        WealthNewsService wealthNewsService3 = this.f157416b.f157420a;
                        params10.getClass();
                        d0<h0k.f> wealthNews2 = wealthNewsService3.getWealthNews(f0.f322471a, null);
                        l lVar4 = new l(new f(0), 24);
                        wealthNews2.getClass();
                        i iVar4 = new i(wealthNews2, lVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o0k.c params11 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        g.e(params11);
                        return this.f157416b.b("null|null|null");
                    default:
                        o0k.c params12 = (o0k.c) obj2;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        return g.c(new hl6.b(this.f157416b, params12, 29));
                }
            }
        };
        final int i103 = 3;
        this.f157424h = new w4l.f(bVarK04, function17, function24, function18, new Function2(this) { // from class: i0k.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f157418b;

            {
                this.f157418b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i103) {
                    case 0:
                        o0k.b params = (o0k.b) obj2;
                        rzj.e news = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(news, "news");
                        this.f157418b.f157421b.f(g.d(params, false), news);
                        break;
                    case 1:
                        rzj.e news2 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter((o0k.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(news2, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news2.f258693a, false, null, 6));
                        break;
                    case 2:
                        o0k.b params2 = (o0k.b) obj2;
                        rzj.e news3 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(news3, "news");
                        this.f157418b.f157421b.f(g.d(params2, true), news3);
                        break;
                    case 3:
                        o0k.b params3 = (o0k.b) obj2;
                        rzj.e news4 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(news4, "news");
                        this.f157418b.f157422c.a(d0k.b.g(news4.f258693a, true, params3.f221252b, 2));
                        break;
                    case 4:
                        o0k.a params4 = (o0k.a) obj2;
                        WealthNewsArticle article = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(article, "article");
                        this.f157418b.f157421b.f(params4.f221249a, article);
                        break;
                    case 5:
                        o0k.a params5 = (o0k.a) obj2;
                        WealthNewsArticle article2 = (WealthNewsArticle) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(article2, "article");
                        this.f157418b.f157422c.i(d0k.b.f(article2, params5.f221250b, null, null));
                        break;
                    case 6:
                        o0k.c params6 = (o0k.c) obj2;
                        rzj.e news5 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(news5, "news");
                        ne0.d dVar = this.f157418b.f157421b;
                        g.e(params6);
                        dVar.f("null|null|null", news5);
                        break;
                    default:
                        o0k.c params7 = (o0k.c) obj2;
                        rzj.e news6 = (rzj.e) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(news6, "news");
                        zzj.f fVar = this.f157418b.f157422c;
                        ArrayList arrayList = news6.f258693a;
                        params7.getClass();
                        fVar.a(d0k.b.g(arrayList, false, null, 4));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static rzj.e c(Function0 function0) {
        List list = (List) function0.invoke();
        if (list != null) {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                int size = list.size();
                Object obj2 = d0k.b.f110447a;
                Intrinsics.checkNotNullParameter(list2, "<this>");
                List list3 = list2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList.add(d0k.b.b((zzj.e) it8.next()));
                }
                return new rzj.e(size, arrayList);
            }
        }
        return null;
    }

    public static String d(o0k.b bVar, boolean z) {
        List listO0;
        String strD = d0k.b.d(bVar.f221251a);
        String str = bVar.e;
        List list = bVar.f221252b;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((tdh.a) it8.next()).name());
            }
            listO0 = zhm.d0.O0(arrayList);
        } else {
            listO0 = null;
        }
        DateTime dateTime = bVar.f221253c;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        DateTime dateTime2 = bVar.d;
        return strD + "|" + str + "|" + listO0 + "|" + lValueOf + "|" + (dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null) + "|" + bVar.f + "|" + z;
    }

    public static String e(o0k.c cVar) {
        cVar.getClass();
        return "null|null|null";
    }

    public final String a(DateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return this.d.print(dateTime.withZone(DateTimeZone.UTC));
    }

    public final rzj.e b(String str) {
        Object obj2 = this.f157421b.get(str);
        if (((rzj.e) obj2) == null || !(!r0.f258693a.isEmpty())) {
            obj2 = null;
        }
        return (rzj.e) obj2;
    }
}
