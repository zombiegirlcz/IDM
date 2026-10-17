package fag;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsService f133327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f133328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8g.n f133329c;

    public h0(TravelHotelsService service, ne0.j memoryCache, z8g.n promotionsDao) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(promotionsDao, "promotionsDao");
        this.f133327a = service;
        this.f133328b = memoryCache;
        this.f133329c = promotionsDao;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: fag.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f133319b;

            {
                this.f133319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                HotelsLocation hotelsLocation;
                String str;
                a9g.p0 p0Var;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<w9g.a> staysPromotions = this.f133319b.f133327a.getStaysPromotions();
                        f9g.h hVar = new f9g.h(new f7l.c(14), 18);
                        staysPromotions.getClass();
                        ufm.i iVar = new ufm.i(staysPromotions, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        tfi.b promotions = (tfi.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(promotions, "promotions");
                        this.f133319b.f133328b.f("CACHE_KEY_PROMOTIONS", promotions);
                        break;
                    default:
                        tfi.b promotionsConfig = (tfi.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(promotionsConfig, "promotionsConfig");
                        z8g.n nVar = this.f133319b.f133329c;
                        String str2 = "<this>";
                        Intrinsics.checkNotNullParameter(promotionsConfig, "<this>");
                        ArrayList<TravelHotelsPromotion> arrayList = promotionsConfig.f270319a;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (TravelHotelsPromotion travelHotelsPromotion : arrayList) {
                            boolean z = promotionsConfig.f270320b;
                            Intrinsics.checkNotNullParameter(travelHotelsPromotion, str2);
                            String str3 = travelHotelsPromotion.f97960a;
                            String strName = travelHotelsPromotion.f97961b.name();
                            String string = travelHotelsPromotion.f97962c.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsPromotion.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            double d = travelHotelsPromotion.e;
                            HotelsLocation hotelsLocation2 = travelHotelsPromotion.f97963g;
                            tfi.b bVar = promotionsConfig;
                            String str4 = hotelsLocation2.f97953a;
                            TravelHotelsPromotion.Requirements requirements = travelHotelsPromotion.f;
                            if (requirements != null) {
                                Intrinsics.checkNotNullParameter(requirements, str2);
                                hotelsLocation = hotelsLocation2;
                                str = str2;
                                String string3 = requirements.f97964a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                String string4 = requirements.f97965b.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                p0Var = new a9g.p0(string3, string4);
                            } else {
                                hotelsLocation = hotelsLocation2;
                                str = str2;
                                p0Var = null;
                            }
                            arrayList2.add(new a9g.q0(new a9g.o0(str3, strName, string, string2, d, str4, z, p0Var), ta6.a.T(hotelsLocation, false)));
                            promotionsConfig = bVar;
                            str2 = str;
                        }
                        DBUtil.performBlocking(nVar.f320113a, false, true, new z8g.m(nVar, arrayList2, 0));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: fag.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f133323b;

            {
                this.f133323b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                tfi.a aVar;
                TravelHotelsPromotion.Requirements requirements;
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (tfi.b) this.f133323b.f133328b.get("CACHE_KEY_PROMOTIONS");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        z8g.n nVar = this.f133323b.f133329c;
                        RoomDatabase roomDatabase = nVar.f320113a;
                        z2.a aVar2 = new z2.a(nVar, 22);
                        boolean z = true;
                        List list = (List) DBUtil.performBlocking(roomDatabase, true, true, aVar2);
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        List<a9g.q0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a9g.q0 q0Var : list2) {
                            a9g.o0 o0Var = q0Var.f2564a;
                            String str = o0Var.f2550a;
                            String str2 = o0Var.f2551b;
                            tfi.a[] aVarArrValues = tfi.a.values();
                            int length = aVarArrValues.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    aVar = aVarArrValues[i2];
                                    if (!kotlin.text.a0.z(aVar.name(), str2, z)) {
                                        i2++;
                                    }
                                } else {
                                    aVar = null;
                                }
                            }
                            if (aVar == null) {
                                aVar = tfi.a.UNKNOWN;
                            }
                            tfi.a aVar3 = aVar;
                            DateTime dateTime = DateTime.parse(o0Var.f2552c);
                            Intrinsics.checkNotNullExpressionValue(dateTime, "parse(...)");
                            DateTime dateTime2 = DateTime.parse(o0Var.d);
                            Intrinsics.checkNotNullExpressionValue(dateTime2, "parse(...)");
                            double d = o0Var.e;
                            a9g.p0 p0Var = o0Var.f2554h;
                            if (p0Var != null) {
                                Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                DateTime dateTime3 = DateTime.parse(p0Var.f2557a);
                                Intrinsics.checkNotNullExpressionValue(dateTime3, "parse(...)");
                                DateTime dateTime4 = DateTime.parse(p0Var.f2558b);
                                Intrinsics.checkNotNullExpressionValue(dateTime4, "parse(...)");
                                requirements = new TravelHotelsPromotion.Requirements(dateTime3, dateTime4);
                            } else {
                                requirements = null;
                            }
                            arrayList.add(new TravelHotelsPromotion(str, aVar3, dateTime, dateTime2, d, requirements, ta6.a.P(q0Var.f2565b)));
                            z = true;
                        }
                        return new tfi.b(arrayList, ((a9g.q0) zhm.d0.b0(list)).f2564a.f2553g);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: fag.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f133319b;

            {
                this.f133319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                HotelsLocation hotelsLocation;
                String str;
                a9g.p0 p0Var;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<w9g.a> staysPromotions = this.f133319b.f133327a.getStaysPromotions();
                        f9g.h hVar = new f9g.h(new f7l.c(14), 18);
                        staysPromotions.getClass();
                        ufm.i iVar = new ufm.i(staysPromotions, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        tfi.b promotions = (tfi.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(promotions, "promotions");
                        this.f133319b.f133328b.f("CACHE_KEY_PROMOTIONS", promotions);
                        break;
                    default:
                        tfi.b promotionsConfig = (tfi.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(promotionsConfig, "promotionsConfig");
                        z8g.n nVar = this.f133319b.f133329c;
                        String str2 = "<this>";
                        Intrinsics.checkNotNullParameter(promotionsConfig, "<this>");
                        ArrayList<TravelHotelsPromotion> arrayList = promotionsConfig.f270319a;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (TravelHotelsPromotion travelHotelsPromotion : arrayList) {
                            boolean z = promotionsConfig.f270320b;
                            Intrinsics.checkNotNullParameter(travelHotelsPromotion, str2);
                            String str3 = travelHotelsPromotion.f97960a;
                            String strName = travelHotelsPromotion.f97961b.name();
                            String string = travelHotelsPromotion.f97962c.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsPromotion.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            double d = travelHotelsPromotion.e;
                            HotelsLocation hotelsLocation2 = travelHotelsPromotion.f97963g;
                            tfi.b bVar = promotionsConfig;
                            String str4 = hotelsLocation2.f97953a;
                            TravelHotelsPromotion.Requirements requirements = travelHotelsPromotion.f;
                            if (requirements != null) {
                                Intrinsics.checkNotNullParameter(requirements, str2);
                                hotelsLocation = hotelsLocation2;
                                str = str2;
                                String string3 = requirements.f97964a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                String string4 = requirements.f97965b.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                p0Var = new a9g.p0(string3, string4);
                            } else {
                                hotelsLocation = hotelsLocation2;
                                str = str2;
                                p0Var = null;
                            }
                            arrayList2.add(new a9g.q0(new a9g.o0(str3, strName, string, string2, d, str4, z, p0Var), ta6.a.T(hotelsLocation, false)));
                            promotionsConfig = bVar;
                            str2 = str;
                        }
                        DBUtil.performBlocking(nVar.f320113a, false, true, new z8g.m(nVar, arrayList2, 0));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: fag.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f133323b;

            {
                this.f133323b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                tfi.a aVar;
                TravelHotelsPromotion.Requirements requirements;
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (tfi.b) this.f133323b.f133328b.get("CACHE_KEY_PROMOTIONS");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        z8g.n nVar = this.f133323b.f133329c;
                        RoomDatabase roomDatabase = nVar.f320113a;
                        z2.a aVar2 = new z2.a(nVar, 22);
                        boolean z = true;
                        List list = (List) DBUtil.performBlocking(roomDatabase, true, true, aVar2);
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        List<a9g.q0> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a9g.q0 q0Var : list2) {
                            a9g.o0 o0Var = q0Var.f2564a;
                            String str = o0Var.f2550a;
                            String str2 = o0Var.f2551b;
                            tfi.a[] aVarArrValues = tfi.a.values();
                            int length = aVarArrValues.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    aVar = aVarArrValues[i22];
                                    if (!kotlin.text.a0.z(aVar.name(), str2, z)) {
                                        i22++;
                                    }
                                } else {
                                    aVar = null;
                                }
                            }
                            if (aVar == null) {
                                aVar = tfi.a.UNKNOWN;
                            }
                            tfi.a aVar3 = aVar;
                            DateTime dateTime = DateTime.parse(o0Var.f2552c);
                            Intrinsics.checkNotNullExpressionValue(dateTime, "parse(...)");
                            DateTime dateTime2 = DateTime.parse(o0Var.d);
                            Intrinsics.checkNotNullExpressionValue(dateTime2, "parse(...)");
                            double d = o0Var.e;
                            a9g.p0 p0Var = o0Var.f2554h;
                            if (p0Var != null) {
                                Intrinsics.checkNotNullParameter(p0Var, "<this>");
                                DateTime dateTime3 = DateTime.parse(p0Var.f2557a);
                                Intrinsics.checkNotNullExpressionValue(dateTime3, "parse(...)");
                                DateTime dateTime4 = DateTime.parse(p0Var.f2558b);
                                Intrinsics.checkNotNullExpressionValue(dateTime4, "parse(...)");
                                requirements = new TravelHotelsPromotion.Requirements(dateTime3, dateTime4);
                            } else {
                                requirements = null;
                            }
                            arrayList.add(new TravelHotelsPromotion(str, aVar3, dateTime, dateTime2, d, requirements, ta6.a.P(q0Var.f2565b)));
                            z = true;
                        }
                        return new tfi.b(arrayList, ((a9g.q0) zhm.d0.b0(list)).f2564a.f2553g);
                }
            }
        };
        final int i3 = 2;
        new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: fag.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f133319b;

            {
                this.f133319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                HotelsLocation hotelsLocation;
                String str;
                a9g.p0 p0Var;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<w9g.a> staysPromotions = this.f133319b.f133327a.getStaysPromotions();
                        f9g.h hVar = new f9g.h(new f7l.c(14), 18);
                        staysPromotions.getClass();
                        ufm.i iVar = new ufm.i(staysPromotions, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        tfi.b promotions = (tfi.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(promotions, "promotions");
                        this.f133319b.f133328b.f("CACHE_KEY_PROMOTIONS", promotions);
                        break;
                    default:
                        tfi.b promotionsConfig = (tfi.b) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(promotionsConfig, "promotionsConfig");
                        z8g.n nVar = this.f133319b.f133329c;
                        String str2 = "<this>";
                        Intrinsics.checkNotNullParameter(promotionsConfig, "<this>");
                        ArrayList<TravelHotelsPromotion> arrayList = promotionsConfig.f270319a;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (TravelHotelsPromotion travelHotelsPromotion : arrayList) {
                            boolean z = promotionsConfig.f270320b;
                            Intrinsics.checkNotNullParameter(travelHotelsPromotion, str2);
                            String str3 = travelHotelsPromotion.f97960a;
                            String strName = travelHotelsPromotion.f97961b.name();
                            String string = travelHotelsPromotion.f97962c.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = travelHotelsPromotion.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            double d = travelHotelsPromotion.e;
                            HotelsLocation hotelsLocation2 = travelHotelsPromotion.f97963g;
                            tfi.b bVar = promotionsConfig;
                            String str4 = hotelsLocation2.f97953a;
                            TravelHotelsPromotion.Requirements requirements = travelHotelsPromotion.f;
                            if (requirements != null) {
                                Intrinsics.checkNotNullParameter(requirements, str2);
                                hotelsLocation = hotelsLocation2;
                                str = str2;
                                String string3 = requirements.f97964a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                String string4 = requirements.f97965b.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                p0Var = new a9g.p0(string3, string4);
                            } else {
                                hotelsLocation = hotelsLocation2;
                                str = str2;
                                p0Var = null;
                            }
                            arrayList2.add(new a9g.q0(new a9g.o0(str3, strName, string, string2, d, str4, z, p0Var), ta6.a.T(hotelsLocation, false)));
                            promotionsConfig = bVar;
                            str2 = str;
                        }
                        DBUtil.performBlocking(nVar.f320113a, false, true, new z8g.m(nVar, arrayList2, 0));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
