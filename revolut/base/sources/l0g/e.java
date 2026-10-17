package l0g;

import androidx.room.util.DBUtil;
import com.revolut.feature.travel.experiences.impl.network.experience.TravelExperiencesService;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import krc.h;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import skm.e0;
import skm.p0;
import ufm.i;
import w4l.f;
import wp5.y;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f191248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f191249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencesService f191250c;
    public final t0g.e d;
    public final i90.b e;
    public final f f;

    public e(ue0.c storage, j memoryCache, TravelExperiencesService service, t0g.e travelExperiencesDropOffDao, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(travelExperiencesDropOffDao, "travelExperiencesDropOffDao");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f191248a = storage;
        this.f191249b = memoryCache;
        this.f191250c = service;
        this.d = travelExperiencesDropOffDao;
        this.e = uuidUtils;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: l0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191245b;

            {
                this.f191245b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<ozf.d> recentlyViewed = this.f191245b.f191250c.getRecentlyViewed();
                        kxj.e eVar = new kxj.e(new a(0), 14);
                        recentlyViewed.getClass();
                        i iVar = new i(recentlyViewed, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List recentlyViewed2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "recentlyViewed");
                        this.f191245b.f191249b.f("CACHE_KEY_RECENTLY_VIEWED_EXPERIENCES", recentlyViewed2);
                        break;
                    default:
                        List recentlyViewed3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recentlyViewed3, "recentlyViewed");
                        t0g.e eVar2 = this.f191245b.d;
                        List<nyf.c> list = recentlyViewed3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (nyf.c cVar : list) {
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            String str = cVar.f220866a;
                            String str2 = cVar.f220867b;
                            String str3 = cVar.f220868c;
                            String str4 = cVar.d;
                            nyf.a aVar = cVar.e;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new pzf.b(str, str2, str3, str4, new pzf.a(String.valueOf(aVar.f220862a), String.valueOf(aVar.f220863b))));
                        }
                        DBUtil.performBlocking(eVar2.f267030a, false, true, new t0g.d(eVar2, arrayList, 0));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: l0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191247b;

            {
                this.f191247b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "<unused var>");
                        return (List) this.f191247b.f191249b.get("CACHE_KEY_RECENTLY_VIEWED_EXPERIENCES");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t0g.e eVar = this.f191247b.d;
                        List<pzf.b> list = (List) DBUtil.performBlocking(eVar.f267030a, true, false, new sx8.a(eVar, 11));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (pzf.b bVar : list) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f241004a;
                            String str2 = bVar.f241005b;
                            String str3 = bVar.f241006c;
                            String str4 = bVar.d;
                            pzf.a aVar = bVar.e;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String startDate = aVar.getStartDate();
                            LocalDate localDate = null;
                            LocalDate localDate2 = startDate != null ? LocalDate.parse(startDate) : null;
                            String endDate = aVar.getEndDate();
                            if (endDate != null) {
                                localDate = LocalDate.parse(endDate);
                            }
                            arrayList.add(new nyf.c(str, str2, str3, str4, new nyf.a(localDate2, localDate)));
                        }
                        return c6d.b.N(arrayList);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: l0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191245b;

            {
                this.f191245b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<ozf.d> recentlyViewed = this.f191245b.f191250c.getRecentlyViewed();
                        kxj.e eVar = new kxj.e(new a(0), 14);
                        recentlyViewed.getClass();
                        i iVar = new i(recentlyViewed, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List recentlyViewed2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "recentlyViewed");
                        this.f191245b.f191249b.f("CACHE_KEY_RECENTLY_VIEWED_EXPERIENCES", recentlyViewed2);
                        break;
                    default:
                        List recentlyViewed3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recentlyViewed3, "recentlyViewed");
                        t0g.e eVar2 = this.f191245b.d;
                        List<nyf.c> list = recentlyViewed3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (nyf.c cVar : list) {
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            String str = cVar.f220866a;
                            String str2 = cVar.f220867b;
                            String str3 = cVar.f220868c;
                            String str4 = cVar.d;
                            nyf.a aVar = cVar.e;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new pzf.b(str, str2, str3, str4, new pzf.a(String.valueOf(aVar.f220862a), String.valueOf(aVar.f220863b))));
                        }
                        DBUtil.performBlocking(eVar2.f267030a, false, true, new t0g.d(eVar2, arrayList, 0));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: l0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191247b;

            {
                this.f191247b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "<unused var>");
                        return (List) this.f191247b.f191249b.get("CACHE_KEY_RECENTLY_VIEWED_EXPERIENCES");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t0g.e eVar = this.f191247b.d;
                        List<pzf.b> list = (List) DBUtil.performBlocking(eVar.f267030a, true, false, new sx8.a(eVar, 11));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (pzf.b bVar : list) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f241004a;
                            String str2 = bVar.f241005b;
                            String str3 = bVar.f241006c;
                            String str4 = bVar.d;
                            pzf.a aVar = bVar.e;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String startDate = aVar.getStartDate();
                            LocalDate localDate = null;
                            LocalDate localDate2 = startDate != null ? LocalDate.parse(startDate) : null;
                            String endDate = aVar.getEndDate();
                            if (endDate != null) {
                                localDate = LocalDate.parse(endDate);
                            }
                            arrayList.add(new nyf.c(str, str2, str3, str4, new nyf.a(localDate2, localDate)));
                        }
                        return c6d.b.N(arrayList);
                }
            }
        };
        final int i3 = 2;
        this.f = new f(function2, function1, function22, function12, new Function2(this) { // from class: l0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191245b;

            {
                this.f191245b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<ozf.d> recentlyViewed = this.f191245b.f191250c.getRecentlyViewed();
                        kxj.e eVar = new kxj.e(new a(0), 14);
                        recentlyViewed.getClass();
                        i iVar = new i(recentlyViewed, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List recentlyViewed2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "recentlyViewed");
                        this.f191245b.f191249b.f("CACHE_KEY_RECENTLY_VIEWED_EXPERIENCES", recentlyViewed2);
                        break;
                    default:
                        List recentlyViewed3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recentlyViewed3, "recentlyViewed");
                        t0g.e eVar2 = this.f191245b.d;
                        List<nyf.c> list = recentlyViewed3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (nyf.c cVar : list) {
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            String str = cVar.f220866a;
                            String str2 = cVar.f220867b;
                            String str3 = cVar.f220868c;
                            String str4 = cVar.d;
                            nyf.a aVar = cVar.e;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new pzf.b(str, str2, str3, str4, new pzf.a(String.valueOf(aVar.f220862a), String.valueOf(aVar.f220863b))));
                        }
                        DBUtil.performBlocking(eVar2.f267030a, false, true, new t0g.d(eVar2, arrayList, 0));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final Object a(gim.i iVar) {
        String strU = y.u(this.e, "toString(...)");
        this.f191249b.f("SEARCH_SESSION_ID", strU);
        h hVar = new h(this, strU, null, 27);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, hVar, iVar);
    }
}
