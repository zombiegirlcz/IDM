package i0g;

import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.impl.network.search.TravelExperiencesSearchService;
import com.revolut.feature.travel.experiences.models.TravelExperiencesCashback;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPricing;
import efm.d0;
import hy2.k;
import hy2.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lyf.g;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ufm.i;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesSearchService f157403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f157404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f157405c;
    public final w4l.f d;

    public f(TravelExperiencesSearchService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f157403a = service;
        this.f157404b = memoryCache;
        this.f157405c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: i0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f157400b;

            {
                this.f157400b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                vzf.a aVar;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a parameters = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        e eVar = f.Companion;
                        TravelExperienceDatesSelection travelExperienceDatesSelection = parameters.f157398c;
                        eVar.getClass();
                        Pair pairB = e.b(travelExperienceDatesSelection);
                        DateTime dateTime = (DateTime) pairB.f186385a;
                        DateTime dateTime2 = (DateTime) pairB.f186386b;
                        d0<nzf.c> destinationDiscovery = this.f157400b.f157403a.getDestinationDiscovery(parameters.f157396a, parameters.f157397b.f306286a, dateTime != null ? boh.f.L(dateTime) : null, dateTime2 != null ? boh.f.L(dateTime2) : null);
                        l lVar = new l(new k(28), 22);
                        destinationDiscovery.getClass();
                        i iVar = new i(destinationDiscovery, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "let(...)");
                        break;
                    case 1:
                        a parameters2 = (a) obj2;
                        lyf.e destinationDiscovery2 = (lyf.e) obj3;
                        Intrinsics.checkNotNullParameter(parameters2, "parameters");
                        Intrinsics.checkNotNullParameter(destinationDiscovery2, "destinationDiscovery");
                        j jVar = this.f157400b.f157404b;
                        f.Companion.getClass();
                        jVar.f(e.a(parameters2), destinationDiscovery2);
                        break;
                    default:
                        a parameters3 = (a) obj2;
                        lyf.e destinationDiscovery3 = (lyf.e) obj3;
                        Intrinsics.checkNotNullParameter(parameters3, "parameters");
                        Intrinsics.checkNotNullParameter(destinationDiscovery3, "destinationDiscovery");
                        ue0.c cVar = this.f157400b.f157405c;
                        f.Companion.getClass();
                        String strA = e.a(parameters3);
                        Intrinsics.checkNotNullParameter(destinationDiscovery3, "<this>");
                        String str = destinationDiscovery3.f200818a;
                        String strName = destinationDiscovery3.f200819b.name();
                        String str2 = destinationDiscovery3.f200820c;
                        String str3 = destinationDiscovery3.d;
                        g gVar = destinationDiscovery3.e;
                        Intrinsics.checkNotNullParameter(gVar, "<this>");
                        nzf.e eVar2 = new nzf.e(gVar.f200826a, gVar.f200827b.name());
                        ArrayList<lyf.f> arrayList = destinationDiscovery3.f;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (lyf.f fVar : arrayList) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList2.add(new nzf.d(fVar.f200823a, fVar.f200824b, fVar.f200825c));
                        }
                        ArrayList arrayList3 = destinationDiscovery3.f200821g;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it8 = arrayList3.iterator();
                        while (it8.hasNext()) {
                            lyf.b bVar = (lyf.b) it8.next();
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str4 = bVar.f200815a;
                            String str5 = bVar.f200816b;
                            ArrayList arrayList5 = bVar.f200817c;
                            Iterator it9 = it8;
                            String str6 = str;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                            Iterator it10 = arrayList5.iterator();
                            while (it10.hasNext()) {
                                lyf.a aVar2 = (lyf.a) it10.next();
                                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                Iterator it11 = it10;
                                String str7 = aVar2.f200812a;
                                String str8 = strName;
                                String str9 = aVar2.f200813b;
                                String str10 = str2;
                                String str11 = aVar2.f200814c;
                                TravelExperiencesPricing travelExperiencesPricing = aVar2.d;
                                Intrinsics.checkNotNullParameter(travelExperiencesPricing, "<this>");
                                String str12 = str3;
                                jo3.a aVarP = mo3.a.p(travelExperiencesPricing.f93198a);
                                jo3.a aVarP2 = mo3.a.p(travelExperiencesPricing.f93199b);
                                TravelExperiencesCashback travelExperiencesCashback = travelExperiencesPricing.f93200c;
                                Intrinsics.checkNotNullParameter(travelExperiencesCashback, "<this>");
                                nzf.e eVar3 = eVar2;
                                ArrayList arrayList7 = arrayList2;
                                String str13 = strA;
                                kzf.a aVar3 = new kzf.a(travelExperiencesCashback.f93194b, mo3.a.p(travelExperiencesCashback.f93193a));
                                TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesPricing.d;
                                String strW = null;
                                if (travelExperiencesPointsOption != null) {
                                    Intrinsics.checkNotNullParameter(travelExperiencesPointsOption, "<this>");
                                    String strW2 = travelExperiencesPointsOption.f93195a.W();
                                    jo3.a aVarP3 = mo3.a.p(travelExperiencesPointsOption.f93196b);
                                    String str14 = travelExperiencesPointsOption.f93197c;
                                    RevPoints revPoints = travelExperiencesPointsOption.d;
                                    aVar = new vzf.a(strW2, str14, revPoints != null ? revPoints.W() : null, travelExperiencesPointsOption.e, aVarP3);
                                } else {
                                    aVar = null;
                                }
                                RevPoints revPoints2 = travelExperiencesPricing.e;
                                if (revPoints2 != null) {
                                    strW = revPoints2.W();
                                }
                                arrayList6.add(new nzf.a(str7, str9, str11, new xzf.a(aVarP, aVarP2, aVar3, aVar, strW)));
                                it10 = it11;
                                strName = str8;
                                str2 = str10;
                                str3 = str12;
                                eVar2 = eVar3;
                                arrayList2 = arrayList7;
                                strA = str13;
                            }
                            arrayList4.add(new nzf.b(str4, str5, arrayList6));
                            str = str6;
                            it8 = it9;
                        }
                        cVar.G(new nzf.c(str, strName, str2, str3, eVar2, arrayList2, arrayList4), strA, z.d(o0.b(nzf.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: i0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f157402b;

            {
                this.f157402b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                a parameters = (a) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        j jVar = this.f157402b.f157404b;
                        f.Companion.getClass();
                        return (lyf.e) jVar.get(e.a(parameters));
                    default:
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        ue0.c cVar = this.f157402b.f157405c;
                        f.Companion.getClass();
                        nzf.c cVar2 = (nzf.c) j6.a.k(nzf.c.class, cVar, e.a(parameters));
                        if (cVar2 != null) {
                            return yyf.a.a(cVar2);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: i0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f157400b;

            {
                this.f157400b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                vzf.a aVar;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a parameters = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        e eVar = f.Companion;
                        TravelExperienceDatesSelection travelExperienceDatesSelection = parameters.f157398c;
                        eVar.getClass();
                        Pair pairB = e.b(travelExperienceDatesSelection);
                        DateTime dateTime = (DateTime) pairB.f186385a;
                        DateTime dateTime2 = (DateTime) pairB.f186386b;
                        d0<nzf.c> destinationDiscovery = this.f157400b.f157403a.getDestinationDiscovery(parameters.f157396a, parameters.f157397b.f306286a, dateTime != null ? boh.f.L(dateTime) : null, dateTime2 != null ? boh.f.L(dateTime2) : null);
                        l lVar = new l(new k(28), 22);
                        destinationDiscovery.getClass();
                        i iVar = new i(destinationDiscovery, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "let(...)");
                        break;
                    case 1:
                        a parameters2 = (a) obj2;
                        lyf.e destinationDiscovery2 = (lyf.e) obj3;
                        Intrinsics.checkNotNullParameter(parameters2, "parameters");
                        Intrinsics.checkNotNullParameter(destinationDiscovery2, "destinationDiscovery");
                        j jVar = this.f157400b.f157404b;
                        f.Companion.getClass();
                        jVar.f(e.a(parameters2), destinationDiscovery2);
                        break;
                    default:
                        a parameters3 = (a) obj2;
                        lyf.e destinationDiscovery3 = (lyf.e) obj3;
                        Intrinsics.checkNotNullParameter(parameters3, "parameters");
                        Intrinsics.checkNotNullParameter(destinationDiscovery3, "destinationDiscovery");
                        ue0.c cVar = this.f157400b.f157405c;
                        f.Companion.getClass();
                        String strA = e.a(parameters3);
                        Intrinsics.checkNotNullParameter(destinationDiscovery3, "<this>");
                        String str = destinationDiscovery3.f200818a;
                        String strName = destinationDiscovery3.f200819b.name();
                        String str2 = destinationDiscovery3.f200820c;
                        String str3 = destinationDiscovery3.d;
                        g gVar = destinationDiscovery3.e;
                        Intrinsics.checkNotNullParameter(gVar, "<this>");
                        nzf.e eVar2 = new nzf.e(gVar.f200826a, gVar.f200827b.name());
                        ArrayList<lyf.f> arrayList = destinationDiscovery3.f;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (lyf.f fVar : arrayList) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList2.add(new nzf.d(fVar.f200823a, fVar.f200824b, fVar.f200825c));
                        }
                        ArrayList arrayList3 = destinationDiscovery3.f200821g;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it8 = arrayList3.iterator();
                        while (it8.hasNext()) {
                            lyf.b bVar = (lyf.b) it8.next();
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str4 = bVar.f200815a;
                            String str5 = bVar.f200816b;
                            ArrayList arrayList5 = bVar.f200817c;
                            Iterator it9 = it8;
                            String str6 = str;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                            Iterator it10 = arrayList5.iterator();
                            while (it10.hasNext()) {
                                lyf.a aVar2 = (lyf.a) it10.next();
                                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                Iterator it11 = it10;
                                String str7 = aVar2.f200812a;
                                String str8 = strName;
                                String str9 = aVar2.f200813b;
                                String str10 = str2;
                                String str11 = aVar2.f200814c;
                                TravelExperiencesPricing travelExperiencesPricing = aVar2.d;
                                Intrinsics.checkNotNullParameter(travelExperiencesPricing, "<this>");
                                String str12 = str3;
                                jo3.a aVarP = mo3.a.p(travelExperiencesPricing.f93198a);
                                jo3.a aVarP2 = mo3.a.p(travelExperiencesPricing.f93199b);
                                TravelExperiencesCashback travelExperiencesCashback = travelExperiencesPricing.f93200c;
                                Intrinsics.checkNotNullParameter(travelExperiencesCashback, "<this>");
                                nzf.e eVar3 = eVar2;
                                ArrayList arrayList7 = arrayList2;
                                String str13 = strA;
                                kzf.a aVar3 = new kzf.a(travelExperiencesCashback.f93194b, mo3.a.p(travelExperiencesCashback.f93193a));
                                TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesPricing.d;
                                String strW = null;
                                if (travelExperiencesPointsOption != null) {
                                    Intrinsics.checkNotNullParameter(travelExperiencesPointsOption, "<this>");
                                    String strW2 = travelExperiencesPointsOption.f93195a.W();
                                    jo3.a aVarP3 = mo3.a.p(travelExperiencesPointsOption.f93196b);
                                    String str14 = travelExperiencesPointsOption.f93197c;
                                    RevPoints revPoints = travelExperiencesPointsOption.d;
                                    aVar = new vzf.a(strW2, str14, revPoints != null ? revPoints.W() : null, travelExperiencesPointsOption.e, aVarP3);
                                } else {
                                    aVar = null;
                                }
                                RevPoints revPoints2 = travelExperiencesPricing.e;
                                if (revPoints2 != null) {
                                    strW = revPoints2.W();
                                }
                                arrayList6.add(new nzf.a(str7, str9, str11, new xzf.a(aVarP, aVarP2, aVar3, aVar, strW)));
                                it10 = it11;
                                strName = str8;
                                str2 = str10;
                                str3 = str12;
                                eVar2 = eVar3;
                                arrayList2 = arrayList7;
                                strA = str13;
                            }
                            arrayList4.add(new nzf.b(str4, str5, arrayList6));
                            str = str6;
                            it8 = it9;
                        }
                        cVar.G(new nzf.c(str, strName, str2, str3, eVar2, arrayList2, arrayList4), strA, z.d(o0.b(nzf.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: i0g.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f157402b;

            {
                this.f157402b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                a parameters = (a) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        j jVar = this.f157402b.f157404b;
                        f.Companion.getClass();
                        return (lyf.e) jVar.get(e.a(parameters));
                    default:
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        ue0.c cVar = this.f157402b.f157405c;
                        f.Companion.getClass();
                        nzf.c cVar2 = (nzf.c) j6.a.k(nzf.c.class, cVar, e.a(parameters));
                        if (cVar2 != null) {
                            return yyf.a.a(cVar2);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: i0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f157400b;

            {
                this.f157400b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                vzf.a aVar;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a parameters = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        e eVar = f.Companion;
                        TravelExperienceDatesSelection travelExperienceDatesSelection = parameters.f157398c;
                        eVar.getClass();
                        Pair pairB = e.b(travelExperienceDatesSelection);
                        DateTime dateTime = (DateTime) pairB.f186385a;
                        DateTime dateTime2 = (DateTime) pairB.f186386b;
                        d0<nzf.c> destinationDiscovery = this.f157400b.f157403a.getDestinationDiscovery(parameters.f157396a, parameters.f157397b.f306286a, dateTime != null ? boh.f.L(dateTime) : null, dateTime2 != null ? boh.f.L(dateTime2) : null);
                        l lVar = new l(new k(28), 22);
                        destinationDiscovery.getClass();
                        i iVar = new i(destinationDiscovery, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "let(...)");
                        break;
                    case 1:
                        a parameters2 = (a) obj2;
                        lyf.e destinationDiscovery2 = (lyf.e) obj3;
                        Intrinsics.checkNotNullParameter(parameters2, "parameters");
                        Intrinsics.checkNotNullParameter(destinationDiscovery2, "destinationDiscovery");
                        j jVar = this.f157400b.f157404b;
                        f.Companion.getClass();
                        jVar.f(e.a(parameters2), destinationDiscovery2);
                        break;
                    default:
                        a parameters3 = (a) obj2;
                        lyf.e destinationDiscovery3 = (lyf.e) obj3;
                        Intrinsics.checkNotNullParameter(parameters3, "parameters");
                        Intrinsics.checkNotNullParameter(destinationDiscovery3, "destinationDiscovery");
                        ue0.c cVar = this.f157400b.f157405c;
                        f.Companion.getClass();
                        String strA = e.a(parameters3);
                        Intrinsics.checkNotNullParameter(destinationDiscovery3, "<this>");
                        String str = destinationDiscovery3.f200818a;
                        String strName = destinationDiscovery3.f200819b.name();
                        String str2 = destinationDiscovery3.f200820c;
                        String str3 = destinationDiscovery3.d;
                        g gVar = destinationDiscovery3.e;
                        Intrinsics.checkNotNullParameter(gVar, "<this>");
                        nzf.e eVar2 = new nzf.e(gVar.f200826a, gVar.f200827b.name());
                        ArrayList<lyf.f> arrayList = destinationDiscovery3.f;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (lyf.f fVar : arrayList) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList2.add(new nzf.d(fVar.f200823a, fVar.f200824b, fVar.f200825c));
                        }
                        ArrayList arrayList3 = destinationDiscovery3.f200821g;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it8 = arrayList3.iterator();
                        while (it8.hasNext()) {
                            lyf.b bVar = (lyf.b) it8.next();
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str4 = bVar.f200815a;
                            String str5 = bVar.f200816b;
                            ArrayList arrayList5 = bVar.f200817c;
                            Iterator it9 = it8;
                            String str6 = str;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                            Iterator it10 = arrayList5.iterator();
                            while (it10.hasNext()) {
                                lyf.a aVar2 = (lyf.a) it10.next();
                                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                Iterator it11 = it10;
                                String str7 = aVar2.f200812a;
                                String str8 = strName;
                                String str9 = aVar2.f200813b;
                                String str10 = str2;
                                String str11 = aVar2.f200814c;
                                TravelExperiencesPricing travelExperiencesPricing = aVar2.d;
                                Intrinsics.checkNotNullParameter(travelExperiencesPricing, "<this>");
                                String str12 = str3;
                                jo3.a aVarP = mo3.a.p(travelExperiencesPricing.f93198a);
                                jo3.a aVarP2 = mo3.a.p(travelExperiencesPricing.f93199b);
                                TravelExperiencesCashback travelExperiencesCashback = travelExperiencesPricing.f93200c;
                                Intrinsics.checkNotNullParameter(travelExperiencesCashback, "<this>");
                                nzf.e eVar3 = eVar2;
                                ArrayList arrayList7 = arrayList2;
                                String str13 = strA;
                                kzf.a aVar3 = new kzf.a(travelExperiencesCashback.f93194b, mo3.a.p(travelExperiencesCashback.f93193a));
                                TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesPricing.d;
                                String strW = null;
                                if (travelExperiencesPointsOption != null) {
                                    Intrinsics.checkNotNullParameter(travelExperiencesPointsOption, "<this>");
                                    String strW2 = travelExperiencesPointsOption.f93195a.W();
                                    jo3.a aVarP3 = mo3.a.p(travelExperiencesPointsOption.f93196b);
                                    String str14 = travelExperiencesPointsOption.f93197c;
                                    RevPoints revPoints = travelExperiencesPointsOption.d;
                                    aVar = new vzf.a(strW2, str14, revPoints != null ? revPoints.W() : null, travelExperiencesPointsOption.e, aVarP3);
                                } else {
                                    aVar = null;
                                }
                                RevPoints revPoints2 = travelExperiencesPricing.e;
                                if (revPoints2 != null) {
                                    strW = revPoints2.W();
                                }
                                arrayList6.add(new nzf.a(str7, str9, str11, new xzf.a(aVarP, aVarP2, aVar3, aVar, strW)));
                                it10 = it11;
                                strName = str8;
                                str2 = str10;
                                str3 = str12;
                                eVar2 = eVar3;
                                arrayList2 = arrayList7;
                                strA = str13;
                            }
                            arrayList4.add(new nzf.b(str4, str5, arrayList6));
                            str = str6;
                            it8 = it9;
                        }
                        cVar.G(new nzf.c(str, strName, str2, str3, eVar2, arrayList2, arrayList4), strA, z.d(o0.b(nzf.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
