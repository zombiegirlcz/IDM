package o0g;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.travel.experiences.impl.network.reviews.TravelExperiencesReviewsService;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ne0.j;
import nyb.h0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import t0g.g;
import ufm.i;
import w4l.f;
import x3g.e;
import x3g.h;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesReviewsService f221210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f221211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f221212c;
    public final f d;

    public d(TravelExperiencesReviewsService reviewsService, g reviewDao, j memoryCache) {
        Intrinsics.checkNotNullParameter(reviewsService, "reviewsService");
        Intrinsics.checkNotNullParameter(reviewDao, "reviewDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f221210a = reviewsService;
        this.f221211b = reviewDao;
        this.f221212c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: o0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221207b;

            {
                this.f221207b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        x3g.g request = (x3g.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<b0g.d> reviews = this.f221207b.f221210a.getReviews(request.f302746a, 30, request.f302747b);
                        h0 h0Var = new h0(21, new i3g.b(request, 1));
                        reviews.getClass();
                        i iVar = new i(reviews, h0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        x3g.g request2 = (x3g.g) obj2;
                        h recentlyViewed = (h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(recentlyViewed, "recentlyViewed");
                        j jVar = this.f221207b.f221212c;
                        d.Companion.getClass();
                        jVar.f(c.a(request2), recentlyViewed);
                        break;
                    default:
                        x3g.g request3 = (x3g.g) obj2;
                        h recentlyViewed2 = (h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "recentlyViewed");
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "<this>");
                        List list = recentlyViewed2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
                            x3g.c cVar = (x3g.c) it8.next();
                            String experienceId = recentlyViewed2.f302748a;
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                            String string = cVar.f302739a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String str = cVar.f302740b;
                            Integer num = cVar.f302741c;
                            String str2 = cVar.d;
                            String str3 = cVar.e;
                            e eVar = cVar.f;
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String strName = eVar.f302744a.name();
                            x3g.d dVar = eVar.f302745b;
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            arrayList.add(new u0g.b(0L, experienceId, string, str, num, str2, str3, new u0g.d(strName, new u0g.c(dVar.f302742a, dVar.f302743b))));
                        }
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "<this>");
                        String str4 = recentlyViewed2.f302748a;
                        u0g.e eVar2 = new u0g.e(recentlyViewed2.f302750c, recentlyViewed2.f302749b, str4);
                        g gVar = this.f221207b.f221211b;
                        gVar.getClass();
                        RoomDatabase roomDatabase = gVar.f267034a;
                        DBUtil.performBlocking(roomDatabase, false, true, new sx2.h(gVar, eVar2, 13));
                        if (request3.f302747b == null) {
                            DBUtil.performBlocking(roomDatabase, false, true, new s06.e(gVar, 22, request3.f302746a, arrayList));
                        } else {
                            DBUtil.performBlocking(roomDatabase, false, true, new sx2.h(gVar, arrayList, 12));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: o0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221209b;

            {
                this.f221209b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                h hVar;
                Iterator it8;
                boolean z;
                x3g.f fVar;
                switch (i) {
                    case 0:
                        x3g.g request = (x3g.g) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        j jVar = this.f221209b.f221212c;
                        d.Companion.getClass();
                        return (h) jVar.get(c.a(request));
                    default:
                        g gVar = this.f221209b.f221211b;
                        x3g.g request2 = (x3g.g) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        String str = request2.f302747b;
                        String str2 = request2.f302746a;
                        if (str == null) {
                            u0g.e eVar = (u0g.e) DBUtil.performBlocking(gVar.f267034a, true, false, new sef.j(str2, 18));
                            if (eVar != null) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                hVar = new h(eVar.f276191a, eVar.f276192b, eVar.f276193c, f0.f322471a, null);
                            } else {
                                hVar = null;
                            }
                            List list = (List) DBUtil.performBlocking(gVar.f267034a, true, false, new sef.j(str2, 17));
                            Intrinsics.checkNotNullParameter(list, "<this>");
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                u0g.b bVar = (u0g.b) it9.next();
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                DateTime dateTime = DateTime.parse(bVar.f276184c);
                                Intrinsics.checkNotNullExpressionValue(dateTime, "parse(...)");
                                String str3 = bVar.d;
                                Integer num = bVar.e;
                                String str4 = bVar.f;
                                String str5 = bVar.f276185g;
                                u0g.d dVar = bVar.f276186h;
                                Intrinsics.checkNotNullParameter(dVar, "<this>");
                                String str6 = dVar.f276189a;
                                x3g.f[] fVarArrValues = x3g.f.values();
                                int length = fVarArrValues.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        fVar = fVarArrValues[i2];
                                        it8 = it9;
                                        x3g.f[] fVarArr = fVarArrValues;
                                        z = true;
                                        if (!a0.z(fVar.name(), str6, true)) {
                                            i2++;
                                            it9 = it8;
                                            fVarArrValues = fVarArr;
                                        }
                                    } else {
                                        it8 = it9;
                                        z = true;
                                        fVar = null;
                                    }
                                }
                                if (fVar == null) {
                                    fVar = x3g.f.UNKNOWN;
                                }
                                u0g.c cVar = dVar.f276190b;
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                arrayList.add(new x3g.c(dateTime, str3, num, str4, str5, new e(fVar, new x3g.d(cVar.f276187a, cVar.f276188b))));
                                it9 = it8;
                            }
                            List reviews = c6d.b.N(arrayList);
                            if (hVar != null && reviews != null) {
                                String experienceId = hVar.f302748a;
                                int i3 = hVar.f302749b;
                                double d = hVar.f302750c;
                                String str7 = hVar.e;
                                Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                                Intrinsics.checkNotNullParameter(reviews, "reviews");
                                return new h(experienceId, i3, d, reviews, str7);
                            }
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: o0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221207b;

            {
                this.f221207b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        x3g.g request = (x3g.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<b0g.d> reviews = this.f221207b.f221210a.getReviews(request.f302746a, 30, request.f302747b);
                        h0 h0Var = new h0(21, new i3g.b(request, 1));
                        reviews.getClass();
                        i iVar = new i(reviews, h0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        x3g.g request2 = (x3g.g) obj2;
                        h recentlyViewed = (h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(recentlyViewed, "recentlyViewed");
                        j jVar = this.f221207b.f221212c;
                        d.Companion.getClass();
                        jVar.f(c.a(request2), recentlyViewed);
                        break;
                    default:
                        x3g.g request3 = (x3g.g) obj2;
                        h recentlyViewed2 = (h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "recentlyViewed");
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "<this>");
                        List list = recentlyViewed2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
                            x3g.c cVar = (x3g.c) it8.next();
                            String experienceId = recentlyViewed2.f302748a;
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                            String string = cVar.f302739a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String str = cVar.f302740b;
                            Integer num = cVar.f302741c;
                            String str2 = cVar.d;
                            String str3 = cVar.e;
                            e eVar = cVar.f;
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String strName = eVar.f302744a.name();
                            x3g.d dVar = eVar.f302745b;
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            arrayList.add(new u0g.b(0L, experienceId, string, str, num, str2, str3, new u0g.d(strName, new u0g.c(dVar.f302742a, dVar.f302743b))));
                        }
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "<this>");
                        String str4 = recentlyViewed2.f302748a;
                        u0g.e eVar2 = new u0g.e(recentlyViewed2.f302750c, recentlyViewed2.f302749b, str4);
                        g gVar = this.f221207b.f221211b;
                        gVar.getClass();
                        RoomDatabase roomDatabase = gVar.f267034a;
                        DBUtil.performBlocking(roomDatabase, false, true, new sx2.h(gVar, eVar2, 13));
                        if (request3.f302747b == null) {
                            DBUtil.performBlocking(roomDatabase, false, true, new s06.e(gVar, 22, request3.f302746a, arrayList));
                        } else {
                            DBUtil.performBlocking(roomDatabase, false, true, new sx2.h(gVar, arrayList, 12));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: o0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221209b;

            {
                this.f221209b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                h hVar;
                Iterator it8;
                boolean z;
                x3g.f fVar;
                switch (i2) {
                    case 0:
                        x3g.g request = (x3g.g) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        j jVar = this.f221209b.f221212c;
                        d.Companion.getClass();
                        return (h) jVar.get(c.a(request));
                    default:
                        g gVar = this.f221209b.f221211b;
                        x3g.g request2 = (x3g.g) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        String str = request2.f302747b;
                        String str2 = request2.f302746a;
                        if (str == null) {
                            u0g.e eVar = (u0g.e) DBUtil.performBlocking(gVar.f267034a, true, false, new sef.j(str2, 18));
                            if (eVar != null) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                hVar = new h(eVar.f276191a, eVar.f276192b, eVar.f276193c, f0.f322471a, null);
                            } else {
                                hVar = null;
                            }
                            List list = (List) DBUtil.performBlocking(gVar.f267034a, true, false, new sef.j(str2, 17));
                            Intrinsics.checkNotNullParameter(list, "<this>");
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                u0g.b bVar = (u0g.b) it9.next();
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                DateTime dateTime = DateTime.parse(bVar.f276184c);
                                Intrinsics.checkNotNullExpressionValue(dateTime, "parse(...)");
                                String str3 = bVar.d;
                                Integer num = bVar.e;
                                String str4 = bVar.f;
                                String str5 = bVar.f276185g;
                                u0g.d dVar = bVar.f276186h;
                                Intrinsics.checkNotNullParameter(dVar, "<this>");
                                String str6 = dVar.f276189a;
                                x3g.f[] fVarArrValues = x3g.f.values();
                                int length = fVarArrValues.length;
                                int i22 = 0;
                                while (true) {
                                    if (i22 < length) {
                                        fVar = fVarArrValues[i22];
                                        it8 = it9;
                                        x3g.f[] fVarArr = fVarArrValues;
                                        z = true;
                                        if (!a0.z(fVar.name(), str6, true)) {
                                            i22++;
                                            it9 = it8;
                                            fVarArrValues = fVarArr;
                                        }
                                    } else {
                                        it8 = it9;
                                        z = true;
                                        fVar = null;
                                    }
                                }
                                if (fVar == null) {
                                    fVar = x3g.f.UNKNOWN;
                                }
                                u0g.c cVar = dVar.f276190b;
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                arrayList.add(new x3g.c(dateTime, str3, num, str4, str5, new e(fVar, new x3g.d(cVar.f276187a, cVar.f276188b))));
                                it9 = it8;
                            }
                            List reviews = c6d.b.N(arrayList);
                            if (hVar != null && reviews != null) {
                                String experienceId = hVar.f302748a;
                                int i3 = hVar.f302749b;
                                double d = hVar.f302750c;
                                String str7 = hVar.e;
                                Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                                Intrinsics.checkNotNullParameter(reviews, "reviews");
                                return new h(experienceId, i3, d, reviews, str7);
                            }
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        this.d = new f(function2, function1, function22, function12, new Function2(this) { // from class: o0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f221207b;

            {
                this.f221207b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        x3g.g request = (x3g.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<b0g.d> reviews = this.f221207b.f221210a.getReviews(request.f302746a, 30, request.f302747b);
                        h0 h0Var = new h0(21, new i3g.b(request, 1));
                        reviews.getClass();
                        i iVar = new i(reviews, h0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        x3g.g request2 = (x3g.g) obj2;
                        h recentlyViewed = (h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(recentlyViewed, "recentlyViewed");
                        j jVar = this.f221207b.f221212c;
                        d.Companion.getClass();
                        jVar.f(c.a(request2), recentlyViewed);
                        break;
                    default:
                        x3g.g request3 = (x3g.g) obj2;
                        h recentlyViewed2 = (h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "recentlyViewed");
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "<this>");
                        List list = recentlyViewed2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
                            x3g.c cVar = (x3g.c) it8.next();
                            String experienceId = recentlyViewed2.f302748a;
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                            String string = cVar.f302739a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String str = cVar.f302740b;
                            Integer num = cVar.f302741c;
                            String str2 = cVar.d;
                            String str3 = cVar.e;
                            e eVar = cVar.f;
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String strName = eVar.f302744a.name();
                            x3g.d dVar = eVar.f302745b;
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            arrayList.add(new u0g.b(0L, experienceId, string, str, num, str2, str3, new u0g.d(strName, new u0g.c(dVar.f302742a, dVar.f302743b))));
                        }
                        Intrinsics.checkNotNullParameter(recentlyViewed2, "<this>");
                        String str4 = recentlyViewed2.f302748a;
                        u0g.e eVar2 = new u0g.e(recentlyViewed2.f302750c, recentlyViewed2.f302749b, str4);
                        g gVar = this.f221207b.f221211b;
                        gVar.getClass();
                        RoomDatabase roomDatabase = gVar.f267034a;
                        DBUtil.performBlocking(roomDatabase, false, true, new sx2.h(gVar, eVar2, 13));
                        if (request3.f302747b == null) {
                            DBUtil.performBlocking(roomDatabase, false, true, new s06.e(gVar, 22, request3.f302746a, arrayList));
                        } else {
                            DBUtil.performBlocking(roomDatabase, false, true, new sx2.h(gVar, arrayList, 12));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
