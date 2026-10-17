package fag;

import androidx.room.util.DBUtil;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import org.joda.time.format.ISOPeriodFormat;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsService f133313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z8g.g f133314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f133315c;
    public final w4l.f d;

    public d0(TravelHotelsService service, z8g.g experiencesDao, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(experiencesDao, "experiencesDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f133313a = service;
        this.f133314b = experiencesDao;
        this.f133315c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: fag.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f133304b;

            {
                this.f133304b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a9g.f0 f0Var;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        z params = (z) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<v9g.i> suggestedExperiences = this.f133304b.f133313a.getSuggestedExperiences(params.f133404a, params.f133405b.f306286a);
                        f9g.h hVar = new f9g.h(new f0m.c(params, 22), 17);
                        suggestedExperiences.getClass();
                        ufm.i iVar = new ufm.i(suggestedExperiences, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List experiences = (List) obj3;
                        Intrinsics.checkNotNullParameter((z) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(experiences, "experiences");
                        this.f133304b.f133315c.f("CACHE_KEY_EXPERIENCES", experiences);
                        break;
                    default:
                        List experiences2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((z) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(experiences2, "experiences");
                        z8g.g gVar = this.f133304b.f133314b;
                        List list = experiences2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            cfi.a aVar = (cfi.a) it8.next();
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String str = aVar.f23692a;
                            String str2 = aVar.f23693b;
                            String str3 = aVar.f23694c;
                            List list2 = aVar.d;
                            cfi.i iVar2 = aVar.e;
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            dj0.d dVar = iVar2.f23712a;
                            dj0.d dVar2 = iVar2.f23713b;
                            jo3.b bVarA = hx7.a.A(dVar);
                            jo3.b bVarA2 = hx7.a.A(dVar2);
                            Iterator it9 = it8;
                            cfi.f fVar = iVar2.f23714c;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            a9g.c0 c0Var = new a9g.c0(fVar.f23706b, hx7.a.A(fVar.f23705a));
                            cfi.h hVar2 = iVar2.d;
                            if (hVar2 != null) {
                                Intrinsics.checkNotNullParameter(hVar2, "<this>");
                                String strW = hVar2.f23709a.W();
                                jo3.b bVarA3 = hx7.a.A(hVar2.f23710b);
                                String str4 = hVar2.f23711c;
                                RevPoints revPoints = hVar2.d;
                                f0Var = new a9g.f0(strW, str4, revPoints != null ? revPoints.W() : null, bVarA3);
                            } else {
                                f0Var = null;
                            }
                            a9g.h0 h0Var = new a9g.h0(bVarA, bVarA2, c0Var, f0Var);
                            String str5 = aVar.f;
                            cfi.d dVar3 = aVar.f23695g;
                            Intrinsics.checkNotNullParameter(dVar3, "<this>");
                            boolean z = dVar3.f23699a;
                            boolean z3 = dVar3.f23700b;
                            ArrayList arrayList2 = dVar3.f23701c;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            for (Iterator it10 = arrayList2.iterator(); it10.hasNext(); it10 = it10) {
                                cfi.c cVar = (cfi.c) it10.next();
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                arrayList3.add(new a9g.y(cVar.f23697a.name(), cVar.f23698b));
                            }
                            ArrayList arrayList4 = dVar3.d;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                            Iterator it11 = arrayList4.iterator();
                            while (it11.hasNext()) {
                                cfi.e eVar = (cfi.e) it11.next();
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                Iterator it12 = it11;
                                List list3 = list2;
                                String string = eVar.f23702a.toString(ISOPeriodFormat.standard());
                                String string2 = eVar.f23703b.toString(ISOPeriodFormat.standard());
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                arrayList5.add(new a9g.b0(string, string2, eVar.f23704c));
                                it11 = it12;
                                list2 = list3;
                                h0Var = h0Var;
                            }
                            a9g.a0 a0Var = new a9g.a0(z, z3, arrayList3, arrayList5);
                            cfi.g gVar2 = aVar.f23696h;
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList.add(new a9g.e0(str, str2, str3, list2, h0Var, str5, a0Var, new a9g.d0(gVar2.f23707a, gVar2.f23708b), dVar2.f115083b.f306286a));
                            it8 = it9;
                        }
                        gVar.getClass();
                        DBUtil.performBlocking(gVar.f320097a, false, true, new z1.c(gVar, arrayList, 28));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: fag.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f133309b;

            {
                this.f133309b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Iterator it8;
                cfi.h hVar;
                cfi.b bVar;
                RevPoints revPoints;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter((z) obj2, "<unused var>");
                        return (List) this.f133309b.f133315c.get("CACHE_KEY_EXPERIENCES");
                    default:
                        z params = (z) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        z8g.g gVar = this.f133309b.f133314b;
                        List list = (List) DBUtil.performBlocking(gVar.f320097a, true, false, new yrk.e(gVar, 11, params.f133404a, params.f133405b.f306286a));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            a9g.e0 e0Var = (a9g.e0) it9.next();
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            String str = e0Var.f2475a;
                            String str2 = e0Var.f2476b;
                            String str3 = e0Var.f2477c;
                            List list2 = e0Var.d;
                            a9g.h0 h0Var = e0Var.e;
                            Intrinsics.checkNotNullParameter(h0Var, "<this>");
                            dj0.d dVarV = hx7.a.v(h0Var.getOverallPrice());
                            dj0.d dVarV2 = hx7.a.v(h0Var.getPriceInRequestedCurrency());
                            a9g.c0 cashback = h0Var.getCashback();
                            Intrinsics.checkNotNullParameter(cashback, "<this>");
                            cfi.f fVar = new cfi.f(cashback.getPercentage(), hx7.a.v(cashback.getValue()));
                            a9g.f0 pointsOption = h0Var.getPointsOption();
                            if (pointsOption != null) {
                                Intrinsics.checkNotNullParameter(pointsOption, "<this>");
                                RevPoints revPointsD = qvb.a.d(pointsOption.getPoints());
                                dj0.d dVarV3 = hx7.a.v(pointsOption.getDiscount());
                                String token = pointsOption.getToken();
                                String pointsReward = pointsOption.getPointsReward();
                                if (pointsReward != null) {
                                    RevPoints revPointsD2 = qvb.a.d(pointsReward);
                                    it8 = it9;
                                    revPoints = revPointsD2;
                                } else {
                                    it8 = it9;
                                    revPoints = null;
                                }
                                hVar = new cfi.h(revPointsD, dVarV3, token, revPoints);
                            } else {
                                it8 = it9;
                                hVar = null;
                            }
                            cfi.i iVar = new cfi.i(dVarV, dVarV2, fVar, hVar);
                            String str4 = e0Var.f;
                            a9g.a0 a0Var = e0Var.f2478g;
                            Intrinsics.checkNotNullParameter(a0Var, "<this>");
                            boolean refundable = a0Var.getRefundable();
                            boolean freeCancellation = a0Var.getFreeCancellation();
                            List cancellationConditions = a0Var.getCancellationConditions();
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(cancellationConditions, 10));
                            Iterator it10 = cancellationConditions.iterator();
                            while (it10.hasNext()) {
                                a9g.y yVar = (a9g.y) it10.next();
                                Intrinsics.checkNotNullParameter(yVar, "<this>");
                                String type = yVar.getType();
                                a9g.a0 a0Var2 = a0Var;
                                cfi.b[] bVarArrValues = cfi.b.values();
                                Iterator it11 = it10;
                                int length = bVarArrValues.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        bVar = bVarArrValues[i2];
                                        int i3 = i2;
                                        int i5 = length;
                                        if (!kotlin.text.a0.z(bVar.name(), type, true)) {
                                            i2 = i3 + 1;
                                            length = i5;
                                        }
                                    } else {
                                        bVar = null;
                                    }
                                }
                                if (bVar == null) {
                                    bVar = cfi.b.UNKNOWN;
                                }
                                arrayList2.add(new cfi.c(bVar, yVar.getDescription()));
                                a0Var = a0Var2;
                                it10 = it11;
                            }
                            List cancellationWindows = a0Var.getCancellationWindows();
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(cancellationWindows, 10));
                            Iterator it12 = cancellationWindows.iterator();
                            while (it12.hasNext()) {
                                a9g.b0 b0Var = (a9g.b0) it12.next();
                                Intrinsics.checkNotNullParameter(b0Var, "<this>");
                                arrayList3.add(new cfi.e(new Period(b0Var.getFromTimeBefore()), new Period(b0Var.getToTimeBefore()), b0Var.getPercentageRefundable()));
                                it12 = it12;
                                str2 = str2;
                            }
                            cfi.d dVar = new cfi.d(refundable, freeCancellation, arrayList2, arrayList3);
                            a9g.d0 d0Var = e0Var.f2479h;
                            Intrinsics.checkNotNullParameter(d0Var, "<this>");
                            arrayList.add(new cfi.a(str, str2, str3, list2, iVar, str4, dVar, new cfi.g(d0Var.f2462a, d0Var.f2463b)));
                            it9 = it8;
                        }
                        return c6d.b.N(arrayList);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: fag.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f133304b;

            {
                this.f133304b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a9g.f0 f0Var;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        z params = (z) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<v9g.i> suggestedExperiences = this.f133304b.f133313a.getSuggestedExperiences(params.f133404a, params.f133405b.f306286a);
                        f9g.h hVar = new f9g.h(new f0m.c(params, 22), 17);
                        suggestedExperiences.getClass();
                        ufm.i iVar = new ufm.i(suggestedExperiences, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List experiences = (List) obj3;
                        Intrinsics.checkNotNullParameter((z) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(experiences, "experiences");
                        this.f133304b.f133315c.f("CACHE_KEY_EXPERIENCES", experiences);
                        break;
                    default:
                        List experiences2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((z) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(experiences2, "experiences");
                        z8g.g gVar = this.f133304b.f133314b;
                        List list = experiences2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            cfi.a aVar = (cfi.a) it8.next();
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String str = aVar.f23692a;
                            String str2 = aVar.f23693b;
                            String str3 = aVar.f23694c;
                            List list2 = aVar.d;
                            cfi.i iVar2 = aVar.e;
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            dj0.d dVar = iVar2.f23712a;
                            dj0.d dVar2 = iVar2.f23713b;
                            jo3.b bVarA = hx7.a.A(dVar);
                            jo3.b bVarA2 = hx7.a.A(dVar2);
                            Iterator it9 = it8;
                            cfi.f fVar = iVar2.f23714c;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            a9g.c0 c0Var = new a9g.c0(fVar.f23706b, hx7.a.A(fVar.f23705a));
                            cfi.h hVar2 = iVar2.d;
                            if (hVar2 != null) {
                                Intrinsics.checkNotNullParameter(hVar2, "<this>");
                                String strW = hVar2.f23709a.W();
                                jo3.b bVarA3 = hx7.a.A(hVar2.f23710b);
                                String str4 = hVar2.f23711c;
                                RevPoints revPoints = hVar2.d;
                                f0Var = new a9g.f0(strW, str4, revPoints != null ? revPoints.W() : null, bVarA3);
                            } else {
                                f0Var = null;
                            }
                            a9g.h0 h0Var = new a9g.h0(bVarA, bVarA2, c0Var, f0Var);
                            String str5 = aVar.f;
                            cfi.d dVar3 = aVar.f23695g;
                            Intrinsics.checkNotNullParameter(dVar3, "<this>");
                            boolean z = dVar3.f23699a;
                            boolean z3 = dVar3.f23700b;
                            ArrayList arrayList2 = dVar3.f23701c;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            for (Iterator it10 = arrayList2.iterator(); it10.hasNext(); it10 = it10) {
                                cfi.c cVar = (cfi.c) it10.next();
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                arrayList3.add(new a9g.y(cVar.f23697a.name(), cVar.f23698b));
                            }
                            ArrayList arrayList4 = dVar3.d;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                            Iterator it11 = arrayList4.iterator();
                            while (it11.hasNext()) {
                                cfi.e eVar = (cfi.e) it11.next();
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                Iterator it12 = it11;
                                List list3 = list2;
                                String string = eVar.f23702a.toString(ISOPeriodFormat.standard());
                                String string2 = eVar.f23703b.toString(ISOPeriodFormat.standard());
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                arrayList5.add(new a9g.b0(string, string2, eVar.f23704c));
                                it11 = it12;
                                list2 = list3;
                                h0Var = h0Var;
                            }
                            a9g.a0 a0Var = new a9g.a0(z, z3, arrayList3, arrayList5);
                            cfi.g gVar2 = aVar.f23696h;
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList.add(new a9g.e0(str, str2, str3, list2, h0Var, str5, a0Var, new a9g.d0(gVar2.f23707a, gVar2.f23708b), dVar2.f115083b.f306286a));
                            it8 = it9;
                        }
                        gVar.getClass();
                        DBUtil.performBlocking(gVar.f320097a, false, true, new z1.c(gVar, arrayList, 28));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: fag.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f133309b;

            {
                this.f133309b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Iterator it8;
                cfi.h hVar;
                cfi.b bVar;
                RevPoints revPoints;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter((z) obj2, "<unused var>");
                        return (List) this.f133309b.f133315c.get("CACHE_KEY_EXPERIENCES");
                    default:
                        z params = (z) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        z8g.g gVar = this.f133309b.f133314b;
                        List list = (List) DBUtil.performBlocking(gVar.f320097a, true, false, new yrk.e(gVar, 11, params.f133404a, params.f133405b.f306286a));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            a9g.e0 e0Var = (a9g.e0) it9.next();
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            String str = e0Var.f2475a;
                            String str2 = e0Var.f2476b;
                            String str3 = e0Var.f2477c;
                            List list2 = e0Var.d;
                            a9g.h0 h0Var = e0Var.e;
                            Intrinsics.checkNotNullParameter(h0Var, "<this>");
                            dj0.d dVarV = hx7.a.v(h0Var.getOverallPrice());
                            dj0.d dVarV2 = hx7.a.v(h0Var.getPriceInRequestedCurrency());
                            a9g.c0 cashback = h0Var.getCashback();
                            Intrinsics.checkNotNullParameter(cashback, "<this>");
                            cfi.f fVar = new cfi.f(cashback.getPercentage(), hx7.a.v(cashback.getValue()));
                            a9g.f0 pointsOption = h0Var.getPointsOption();
                            if (pointsOption != null) {
                                Intrinsics.checkNotNullParameter(pointsOption, "<this>");
                                RevPoints revPointsD = qvb.a.d(pointsOption.getPoints());
                                dj0.d dVarV3 = hx7.a.v(pointsOption.getDiscount());
                                String token = pointsOption.getToken();
                                String pointsReward = pointsOption.getPointsReward();
                                if (pointsReward != null) {
                                    RevPoints revPointsD2 = qvb.a.d(pointsReward);
                                    it8 = it9;
                                    revPoints = revPointsD2;
                                } else {
                                    it8 = it9;
                                    revPoints = null;
                                }
                                hVar = new cfi.h(revPointsD, dVarV3, token, revPoints);
                            } else {
                                it8 = it9;
                                hVar = null;
                            }
                            cfi.i iVar = new cfi.i(dVarV, dVarV2, fVar, hVar);
                            String str4 = e0Var.f;
                            a9g.a0 a0Var = e0Var.f2478g;
                            Intrinsics.checkNotNullParameter(a0Var, "<this>");
                            boolean refundable = a0Var.getRefundable();
                            boolean freeCancellation = a0Var.getFreeCancellation();
                            List cancellationConditions = a0Var.getCancellationConditions();
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(cancellationConditions, 10));
                            Iterator it10 = cancellationConditions.iterator();
                            while (it10.hasNext()) {
                                a9g.y yVar = (a9g.y) it10.next();
                                Intrinsics.checkNotNullParameter(yVar, "<this>");
                                String type = yVar.getType();
                                a9g.a0 a0Var2 = a0Var;
                                cfi.b[] bVarArrValues = cfi.b.values();
                                Iterator it11 = it10;
                                int length = bVarArrValues.length;
                                int i22 = 0;
                                while (true) {
                                    if (i22 < length) {
                                        bVar = bVarArrValues[i22];
                                        int i3 = i22;
                                        int i5 = length;
                                        if (!kotlin.text.a0.z(bVar.name(), type, true)) {
                                            i22 = i3 + 1;
                                            length = i5;
                                        }
                                    } else {
                                        bVar = null;
                                    }
                                }
                                if (bVar == null) {
                                    bVar = cfi.b.UNKNOWN;
                                }
                                arrayList2.add(new cfi.c(bVar, yVar.getDescription()));
                                a0Var = a0Var2;
                                it10 = it11;
                            }
                            List cancellationWindows = a0Var.getCancellationWindows();
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(cancellationWindows, 10));
                            Iterator it12 = cancellationWindows.iterator();
                            while (it12.hasNext()) {
                                a9g.b0 b0Var = (a9g.b0) it12.next();
                                Intrinsics.checkNotNullParameter(b0Var, "<this>");
                                arrayList3.add(new cfi.e(new Period(b0Var.getFromTimeBefore()), new Period(b0Var.getToTimeBefore()), b0Var.getPercentageRefundable()));
                                it12 = it12;
                                str2 = str2;
                            }
                            cfi.d dVar = new cfi.d(refundable, freeCancellation, arrayList2, arrayList3);
                            a9g.d0 d0Var = e0Var.f2479h;
                            Intrinsics.checkNotNullParameter(d0Var, "<this>");
                            arrayList.add(new cfi.a(str, str2, str3, list2, iVar, str4, dVar, new cfi.g(d0Var.f2462a, d0Var.f2463b)));
                            it9 = it8;
                        }
                        return c6d.b.N(arrayList);
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: fag.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f133304b;

            {
                this.f133304b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a9g.f0 f0Var;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        z params = (z) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<v9g.i> suggestedExperiences = this.f133304b.f133313a.getSuggestedExperiences(params.f133404a, params.f133405b.f306286a);
                        f9g.h hVar = new f9g.h(new f0m.c(params, 22), 17);
                        suggestedExperiences.getClass();
                        ufm.i iVar = new ufm.i(suggestedExperiences, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List experiences = (List) obj3;
                        Intrinsics.checkNotNullParameter((z) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(experiences, "experiences");
                        this.f133304b.f133315c.f("CACHE_KEY_EXPERIENCES", experiences);
                        break;
                    default:
                        List experiences2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((z) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(experiences2, "experiences");
                        z8g.g gVar = this.f133304b.f133314b;
                        List list = experiences2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            cfi.a aVar = (cfi.a) it8.next();
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String str = aVar.f23692a;
                            String str2 = aVar.f23693b;
                            String str3 = aVar.f23694c;
                            List list2 = aVar.d;
                            cfi.i iVar2 = aVar.e;
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            dj0.d dVar = iVar2.f23712a;
                            dj0.d dVar2 = iVar2.f23713b;
                            jo3.b bVarA = hx7.a.A(dVar);
                            jo3.b bVarA2 = hx7.a.A(dVar2);
                            Iterator it9 = it8;
                            cfi.f fVar = iVar2.f23714c;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            a9g.c0 c0Var = new a9g.c0(fVar.f23706b, hx7.a.A(fVar.f23705a));
                            cfi.h hVar2 = iVar2.d;
                            if (hVar2 != null) {
                                Intrinsics.checkNotNullParameter(hVar2, "<this>");
                                String strW = hVar2.f23709a.W();
                                jo3.b bVarA3 = hx7.a.A(hVar2.f23710b);
                                String str4 = hVar2.f23711c;
                                RevPoints revPoints = hVar2.d;
                                f0Var = new a9g.f0(strW, str4, revPoints != null ? revPoints.W() : null, bVarA3);
                            } else {
                                f0Var = null;
                            }
                            a9g.h0 h0Var = new a9g.h0(bVarA, bVarA2, c0Var, f0Var);
                            String str5 = aVar.f;
                            cfi.d dVar3 = aVar.f23695g;
                            Intrinsics.checkNotNullParameter(dVar3, "<this>");
                            boolean z = dVar3.f23699a;
                            boolean z3 = dVar3.f23700b;
                            ArrayList arrayList2 = dVar3.f23701c;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            for (Iterator it10 = arrayList2.iterator(); it10.hasNext(); it10 = it10) {
                                cfi.c cVar = (cfi.c) it10.next();
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                arrayList3.add(new a9g.y(cVar.f23697a.name(), cVar.f23698b));
                            }
                            ArrayList arrayList4 = dVar3.d;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                            Iterator it11 = arrayList4.iterator();
                            while (it11.hasNext()) {
                                cfi.e eVar = (cfi.e) it11.next();
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                Iterator it12 = it11;
                                List list3 = list2;
                                String string = eVar.f23702a.toString(ISOPeriodFormat.standard());
                                String string2 = eVar.f23703b.toString(ISOPeriodFormat.standard());
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                arrayList5.add(new a9g.b0(string, string2, eVar.f23704c));
                                it11 = it12;
                                list2 = list3;
                                h0Var = h0Var;
                            }
                            a9g.a0 a0Var = new a9g.a0(z, z3, arrayList3, arrayList5);
                            cfi.g gVar2 = aVar.f23696h;
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList.add(new a9g.e0(str, str2, str3, list2, h0Var, str5, a0Var, new a9g.d0(gVar2.f23707a, gVar2.f23708b), dVar2.f115083b.f306286a));
                            it8 = it9;
                        }
                        gVar.getClass();
                        DBUtil.performBlocking(gVar.f320097a, false, true, new z1.c(gVar, arrayList, 28));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
