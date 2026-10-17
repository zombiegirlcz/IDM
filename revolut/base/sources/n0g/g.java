package n0g;

import ao.h;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLanguage;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesAvailabilityTimes;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOption;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import com.revolut.feature.travel.experiences.impl.network.options.TravelExperiencesOptionsService;
import com.revolut.feature.travel.experiences.models.TravelExperiencesCashback;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import efm.d0;
import java.lang.reflect.Type;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import n0c.o;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesOptionsService f211038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f211039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f211040c;
    public final w4l.f d;
    public final h e;
    public final h f;

    public g(TravelExperiencesOptionsService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f211038a = service;
        this.f211039b = memoryCache;
        this.f211040c = storage;
        final int i = 2;
        Function2 function2 = new Function2(this) { // from class: n0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f211031b;

            {
                this.f211031b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        pyf.b params = (pyf.b) obj2;
                        List paymentsOptionList = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(paymentsOptionList, "paymentsOptionList");
                        this.f211031b.f211039b.f("CACHE_KEY_PAYMENT_OPTIONS-" + params.hashCode(), paymentsOptionList);
                        return Unit.f186387a;
                    case 1:
                        pyf.b params2 = (pyf.b) obj2;
                        List paymentOptionList = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(paymentOptionList, "paymentOptionList");
                        ue0.c cVar = this.f211031b.f211040c;
                        String strN = a0.d.n("CACHE_KEY_PAYMENT_OPTIONS-", params2.hashCode());
                        List list = paymentOptionList;
                        int i2 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            TravelExperiencesOption travelExperiencesOption = (TravelExperiencesOption) it8.next();
                            String str = "<this>";
                            Intrinsics.checkNotNullParameter(travelExperiencesOption, "<this>");
                            String str2 = travelExperiencesOption.f92859a;
                            String str3 = travelExperiencesOption.f92860b;
                            String str4 = travelExperiencesOption.f92861c;
                            a0g.b bVarL = ebm.a.L(travelExperiencesOption.d);
                            a0g.b bVarL2 = ebm.a.L(travelExperiencesOption.e);
                            ArrayList arrayList2 = travelExperiencesOption.f;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i2));
                            Iterator it9 = arrayList2.iterator();
                            while (true) {
                                Object objW = null;
                                if (it9.hasNext()) {
                                    TravelExperiencesAvailabilityTimes travelExperiencesAvailabilityTimes = (TravelExperiencesAvailabilityTimes) it9.next();
                                    Intrinsics.checkNotNullParameter(travelExperiencesAvailabilityTimes, str);
                                    Iterator it10 = it8;
                                    String string = travelExperiencesAvailabilityTimes.f92856a.toString();
                                    String str5 = str;
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    boolean z = travelExperiencesAvailabilityTimes.f92857b;
                                    Iterator it11 = it9;
                                    TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown = travelExperiencesAvailabilityTimes.f92858c;
                                    a0g.b bVarL3 = travelExperiencesPricingBreakdown != null ? ebm.a.L(travelExperiencesPricingBreakdown) : null;
                                    TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown2 = travelExperiencesAvailabilityTimes.d;
                                    if (travelExperiencesPricingBreakdown2 != null) {
                                        objW = ebm.a.L(travelExperiencesPricingBreakdown2);
                                    }
                                    arrayList3.add(new uzf.a(string, z, bVarL3, objW));
                                    it8 = it10;
                                    str = str5;
                                    it9 = it11;
                                } else {
                                    Iterator it12 = it8;
                                    lzf.a aVarE0 = ue8.c.e0(travelExperiencesOption.f92862g);
                                    ArrayList arrayList4 = travelExperiencesOption.f92863h;
                                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                                    Iterator it13 = arrayList4.iterator();
                                    while (it13.hasNext()) {
                                        arrayList5.add(zyf.d.c((TravelExperienceLanguage) it13.next()));
                                    }
                                    TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesOption.i;
                                    wzf.a aVarZ = travelExperiencesPointsOption != null ? cp5.d.Z(travelExperiencesPointsOption) : null;
                                    RevPoints revPoints = travelExperiencesOption.f92864j;
                                    if (revPoints != null) {
                                        objW = revPoints.W();
                                    }
                                    arrayList.add(new uzf.b(str2, str3, str4, bVarL, bVarL2, arrayList3, aVarE0, arrayList5, aVarZ, objW));
                                    it8 = it12;
                                    i2 = 10;
                                }
                            }
                        }
                        cVar.G(arrayList, strN, kii.e.o(uzf.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        pyf.b params3 = (pyf.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        TravelExperiencesOptionsService travelExperiencesOptionsService = this.f211031b.f211038a;
                        String str6 = params3.f240821a;
                        String str7 = params3.f240822b;
                        String str8 = params3.f240823c;
                        Map map = params3.d;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(((myf.b) entry.getKey()).toString(), entry.getValue());
                        }
                        d0<List<tzf.c>> experienceOptions = travelExperiencesOptionsService.getExperienceOptions(str6, str7, str8, linkedHashMap);
                        mzj.j jVar = new mzj.j(new o(3), 17);
                        experienceOptions.getClass();
                        i iVar = new i(experienceOptions, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        };
        final int i2 = 3;
        Function1 function1 = new Function1(this) { // from class: n0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f211033b;

            {
                this.f211033b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                g gVar = this.f211033b;
                switch (i3) {
                    case 0:
                        pyf.b params = (pyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ue0.c cVar = gVar.f211040c;
                        String strN = a0.d.n("CACHE_KEY_PAYMENT_OPTIONS-", params.hashCode());
                        Type type = TypeToken.getParameterized(List.class, uzf.b.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        List list = (List) cVar.T2(strN, type);
                        if (list == null) {
                            return null;
                        }
                        List<uzf.b> list2 = list;
                        int i5 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (uzf.b bVar : list2) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String strC = bVar.c();
                            String strE = bVar.e();
                            String strB = bVar.b();
                            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF = ebm.a.F(bVar.h());
                            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF2 = ebm.a.F(bVar.i());
                            List<uzf.a> listJ = bVar.j();
                            ArrayList arrayList2 = new ArrayList(w.t(listJ, i5));
                            for (uzf.a aVar : listJ) {
                                Intrinsics.checkNotNullParameter(aVar, "<this>");
                                LocalTime localTime = LocalTime.parse(aVar.c());
                                Intrinsics.checkNotNullExpressionValue(localTime, "parse(...)");
                                boolean zD = aVar.d();
                                a0g.b bVarA = aVar.a();
                                TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF3 = bVarA != null ? ebm.a.F(bVarA) : null;
                                a0g.b bVarB = aVar.b();
                                arrayList2.add(new TravelExperiencesAvailabilityTimes(localTime, zD, travelExperiencesPricingBreakdownF3, bVarB != null ? ebm.a.F(bVarB) : null));
                            }
                            TravelExperiencesCashback travelExperiencesCashbackS = ue8.c.S(bVar.a());
                            List listD = bVar.d();
                            ArrayList arrayList3 = new ArrayList(w.t(listD, 10));
                            Iterator it8 = listD.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(zyf.d.b((rzf.o) it8.next()));
                            }
                            wzf.a aVarF = bVar.f();
                            TravelExperiencesPointsOption travelExperiencesPointsOptionN = aVarF != null ? cp5.d.N(aVarF) : null;
                            String strG = bVar.g();
                            arrayList.add(new TravelExperiencesOption(strC, strE, strB, travelExperiencesPricingBreakdownF, travelExperiencesPricingBreakdownF2, arrayList2, travelExperiencesCashbackS, arrayList3, travelExperiencesPointsOptionN, strG != null ? qvb.a.d(strG) : null));
                            i5 = 10;
                        }
                        return arrayList;
                    case 1:
                        pyf.a params2 = (pyf.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesOptionsService travelExperiencesOptionsService = gVar.f211038a;
                        String str = params2.f240818a;
                        String str2 = params2.f240819b;
                        String str3 = params2.f240820c;
                        String str4 = params2.d;
                        String str5 = params2.e;
                        Map map = params2.f;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(((myf.b) entry.getKey()).toString(), entry.getValue());
                        }
                        d0<tzf.b> experienceOptionAvailability = travelExperiencesOptionsService.getExperienceOptionAvailability(str, str2, str3, str4, str5, linkedHashMap);
                        mzj.j jVar = new mzj.j(new o(2), 16);
                        experienceOptionAvailability.getClass();
                        i iVar = new i(experienceOptionAvailability, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        d dVar = (d) obj2;
                        Intrinsics.checkNotNullParameter(dVar, "<destruct>");
                        d0<List<qzf.j>> questions = gVar.f211038a.getQuestions(dVar.f211034a, dVar.f211035b);
                        mzj.j jVar2 = new mzj.j(new o(4), 18);
                        questions.getClass();
                        i iVar2 = new i(questions, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        pyf.b params3 = (pyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) gVar.f211039b.get("CACHE_KEY_PAYMENT_OPTIONS-" + params3.hashCode());
                }
            }
        };
        final int i3 = 0;
        Function2 function22 = new Function2(this) { // from class: n0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f211031b;

            {
                this.f211031b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        pyf.b params = (pyf.b) obj2;
                        List paymentsOptionList = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(paymentsOptionList, "paymentsOptionList");
                        this.f211031b.f211039b.f("CACHE_KEY_PAYMENT_OPTIONS-" + params.hashCode(), paymentsOptionList);
                        return Unit.f186387a;
                    case 1:
                        pyf.b params2 = (pyf.b) obj2;
                        List paymentOptionList = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(paymentOptionList, "paymentOptionList");
                        ue0.c cVar = this.f211031b.f211040c;
                        String strN = a0.d.n("CACHE_KEY_PAYMENT_OPTIONS-", params2.hashCode());
                        List list = paymentOptionList;
                        int i22 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            TravelExperiencesOption travelExperiencesOption = (TravelExperiencesOption) it8.next();
                            String str = "<this>";
                            Intrinsics.checkNotNullParameter(travelExperiencesOption, "<this>");
                            String str2 = travelExperiencesOption.f92859a;
                            String str3 = travelExperiencesOption.f92860b;
                            String str4 = travelExperiencesOption.f92861c;
                            a0g.b bVarL = ebm.a.L(travelExperiencesOption.d);
                            a0g.b bVarL2 = ebm.a.L(travelExperiencesOption.e);
                            ArrayList arrayList2 = travelExperiencesOption.f;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i22));
                            Iterator it9 = arrayList2.iterator();
                            while (true) {
                                Object objW = null;
                                if (it9.hasNext()) {
                                    TravelExperiencesAvailabilityTimes travelExperiencesAvailabilityTimes = (TravelExperiencesAvailabilityTimes) it9.next();
                                    Intrinsics.checkNotNullParameter(travelExperiencesAvailabilityTimes, str);
                                    Iterator it10 = it8;
                                    String string = travelExperiencesAvailabilityTimes.f92856a.toString();
                                    String str5 = str;
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    boolean z = travelExperiencesAvailabilityTimes.f92857b;
                                    Iterator it11 = it9;
                                    TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown = travelExperiencesAvailabilityTimes.f92858c;
                                    a0g.b bVarL3 = travelExperiencesPricingBreakdown != null ? ebm.a.L(travelExperiencesPricingBreakdown) : null;
                                    TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown2 = travelExperiencesAvailabilityTimes.d;
                                    if (travelExperiencesPricingBreakdown2 != null) {
                                        objW = ebm.a.L(travelExperiencesPricingBreakdown2);
                                    }
                                    arrayList3.add(new uzf.a(string, z, bVarL3, objW));
                                    it8 = it10;
                                    str = str5;
                                    it9 = it11;
                                } else {
                                    Iterator it12 = it8;
                                    lzf.a aVarE0 = ue8.c.e0(travelExperiencesOption.f92862g);
                                    ArrayList arrayList4 = travelExperiencesOption.f92863h;
                                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                                    Iterator it13 = arrayList4.iterator();
                                    while (it13.hasNext()) {
                                        arrayList5.add(zyf.d.c((TravelExperienceLanguage) it13.next()));
                                    }
                                    TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesOption.i;
                                    wzf.a aVarZ = travelExperiencesPointsOption != null ? cp5.d.Z(travelExperiencesPointsOption) : null;
                                    RevPoints revPoints = travelExperiencesOption.f92864j;
                                    if (revPoints != null) {
                                        objW = revPoints.W();
                                    }
                                    arrayList.add(new uzf.b(str2, str3, str4, bVarL, bVarL2, arrayList3, aVarE0, arrayList5, aVarZ, objW));
                                    it8 = it12;
                                    i22 = 10;
                                }
                            }
                        }
                        cVar.G(arrayList, strN, kii.e.o(uzf.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        pyf.b params3 = (pyf.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        TravelExperiencesOptionsService travelExperiencesOptionsService = this.f211031b.f211038a;
                        String str6 = params3.f240821a;
                        String str7 = params3.f240822b;
                        String str8 = params3.f240823c;
                        Map map = params3.d;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(((myf.b) entry.getKey()).toString(), entry.getValue());
                        }
                        d0<List<tzf.c>> experienceOptions = travelExperiencesOptionsService.getExperienceOptions(str6, str7, str8, linkedHashMap);
                        mzj.j jVar = new mzj.j(new o(3), 17);
                        experienceOptions.getClass();
                        i iVar = new i(experienceOptions, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: n0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f211033b;

            {
                this.f211033b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i32 = i3;
                g gVar = this.f211033b;
                switch (i32) {
                    case 0:
                        pyf.b params = (pyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ue0.c cVar = gVar.f211040c;
                        String strN = a0.d.n("CACHE_KEY_PAYMENT_OPTIONS-", params.hashCode());
                        Type type = TypeToken.getParameterized(List.class, uzf.b.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        List list = (List) cVar.T2(strN, type);
                        if (list == null) {
                            return null;
                        }
                        List<uzf.b> list2 = list;
                        int i5 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (uzf.b bVar : list2) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String strC = bVar.c();
                            String strE = bVar.e();
                            String strB = bVar.b();
                            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF = ebm.a.F(bVar.h());
                            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF2 = ebm.a.F(bVar.i());
                            List<uzf.a> listJ = bVar.j();
                            ArrayList arrayList2 = new ArrayList(w.t(listJ, i5));
                            for (uzf.a aVar : listJ) {
                                Intrinsics.checkNotNullParameter(aVar, "<this>");
                                LocalTime localTime = LocalTime.parse(aVar.c());
                                Intrinsics.checkNotNullExpressionValue(localTime, "parse(...)");
                                boolean zD = aVar.d();
                                a0g.b bVarA = aVar.a();
                                TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF3 = bVarA != null ? ebm.a.F(bVarA) : null;
                                a0g.b bVarB = aVar.b();
                                arrayList2.add(new TravelExperiencesAvailabilityTimes(localTime, zD, travelExperiencesPricingBreakdownF3, bVarB != null ? ebm.a.F(bVarB) : null));
                            }
                            TravelExperiencesCashback travelExperiencesCashbackS = ue8.c.S(bVar.a());
                            List listD = bVar.d();
                            ArrayList arrayList3 = new ArrayList(w.t(listD, 10));
                            Iterator it8 = listD.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(zyf.d.b((rzf.o) it8.next()));
                            }
                            wzf.a aVarF = bVar.f();
                            TravelExperiencesPointsOption travelExperiencesPointsOptionN = aVarF != null ? cp5.d.N(aVarF) : null;
                            String strG = bVar.g();
                            arrayList.add(new TravelExperiencesOption(strC, strE, strB, travelExperiencesPricingBreakdownF, travelExperiencesPricingBreakdownF2, arrayList2, travelExperiencesCashbackS, arrayList3, travelExperiencesPointsOptionN, strG != null ? qvb.a.d(strG) : null));
                            i5 = 10;
                        }
                        return arrayList;
                    case 1:
                        pyf.a params2 = (pyf.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesOptionsService travelExperiencesOptionsService = gVar.f211038a;
                        String str = params2.f240818a;
                        String str2 = params2.f240819b;
                        String str3 = params2.f240820c;
                        String str4 = params2.d;
                        String str5 = params2.e;
                        Map map = params2.f;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(((myf.b) entry.getKey()).toString(), entry.getValue());
                        }
                        d0<tzf.b> experienceOptionAvailability = travelExperiencesOptionsService.getExperienceOptionAvailability(str, str2, str3, str4, str5, linkedHashMap);
                        mzj.j jVar = new mzj.j(new o(2), 16);
                        experienceOptionAvailability.getClass();
                        i iVar = new i(experienceOptionAvailability, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        d dVar = (d) obj2;
                        Intrinsics.checkNotNullParameter(dVar, "<destruct>");
                        d0<List<qzf.j>> questions = gVar.f211038a.getQuestions(dVar.f211034a, dVar.f211035b);
                        mzj.j jVar2 = new mzj.j(new o(4), 18);
                        questions.getClass();
                        i iVar2 = new i(questions, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        pyf.b params3 = (pyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) gVar.f211039b.get("CACHE_KEY_PAYMENT_OPTIONS-" + params3.hashCode());
                }
            }
        };
        final int i5 = 1;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: n0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f211031b;

            {
                this.f211031b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        pyf.b params = (pyf.b) obj2;
                        List paymentsOptionList = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(paymentsOptionList, "paymentsOptionList");
                        this.f211031b.f211039b.f("CACHE_KEY_PAYMENT_OPTIONS-" + params.hashCode(), paymentsOptionList);
                        return Unit.f186387a;
                    case 1:
                        pyf.b params2 = (pyf.b) obj2;
                        List paymentOptionList = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(paymentOptionList, "paymentOptionList");
                        ue0.c cVar = this.f211031b.f211040c;
                        String strN = a0.d.n("CACHE_KEY_PAYMENT_OPTIONS-", params2.hashCode());
                        List list = paymentOptionList;
                        int i22 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            TravelExperiencesOption travelExperiencesOption = (TravelExperiencesOption) it8.next();
                            String str = "<this>";
                            Intrinsics.checkNotNullParameter(travelExperiencesOption, "<this>");
                            String str2 = travelExperiencesOption.f92859a;
                            String str3 = travelExperiencesOption.f92860b;
                            String str4 = travelExperiencesOption.f92861c;
                            a0g.b bVarL = ebm.a.L(travelExperiencesOption.d);
                            a0g.b bVarL2 = ebm.a.L(travelExperiencesOption.e);
                            ArrayList arrayList2 = travelExperiencesOption.f;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i22));
                            Iterator it9 = arrayList2.iterator();
                            while (true) {
                                Object objW = null;
                                if (it9.hasNext()) {
                                    TravelExperiencesAvailabilityTimes travelExperiencesAvailabilityTimes = (TravelExperiencesAvailabilityTimes) it9.next();
                                    Intrinsics.checkNotNullParameter(travelExperiencesAvailabilityTimes, str);
                                    Iterator it10 = it8;
                                    String string = travelExperiencesAvailabilityTimes.f92856a.toString();
                                    String str5 = str;
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    boolean z = travelExperiencesAvailabilityTimes.f92857b;
                                    Iterator it11 = it9;
                                    TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown = travelExperiencesAvailabilityTimes.f92858c;
                                    a0g.b bVarL3 = travelExperiencesPricingBreakdown != null ? ebm.a.L(travelExperiencesPricingBreakdown) : null;
                                    TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown2 = travelExperiencesAvailabilityTimes.d;
                                    if (travelExperiencesPricingBreakdown2 != null) {
                                        objW = ebm.a.L(travelExperiencesPricingBreakdown2);
                                    }
                                    arrayList3.add(new uzf.a(string, z, bVarL3, objW));
                                    it8 = it10;
                                    str = str5;
                                    it9 = it11;
                                } else {
                                    Iterator it12 = it8;
                                    lzf.a aVarE0 = ue8.c.e0(travelExperiencesOption.f92862g);
                                    ArrayList arrayList4 = travelExperiencesOption.f92863h;
                                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                                    Iterator it13 = arrayList4.iterator();
                                    while (it13.hasNext()) {
                                        arrayList5.add(zyf.d.c((TravelExperienceLanguage) it13.next()));
                                    }
                                    TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesOption.i;
                                    wzf.a aVarZ = travelExperiencesPointsOption != null ? cp5.d.Z(travelExperiencesPointsOption) : null;
                                    RevPoints revPoints = travelExperiencesOption.f92864j;
                                    if (revPoints != null) {
                                        objW = revPoints.W();
                                    }
                                    arrayList.add(new uzf.b(str2, str3, str4, bVarL, bVarL2, arrayList3, aVarE0, arrayList5, aVarZ, objW));
                                    it8 = it12;
                                    i22 = 10;
                                }
                            }
                        }
                        cVar.G(arrayList, strN, kii.e.o(uzf.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        pyf.b params3 = (pyf.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        TravelExperiencesOptionsService travelExperiencesOptionsService = this.f211031b.f211038a;
                        String str6 = params3.f240821a;
                        String str7 = params3.f240822b;
                        String str8 = params3.f240823c;
                        Map map = params3.d;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(((myf.b) entry.getKey()).toString(), entry.getValue());
                        }
                        d0<List<tzf.c>> experienceOptions = travelExperiencesOptionsService.getExperienceOptions(str6, str7, str8, linkedHashMap);
                        mzj.j jVar = new mzj.j(new o(3), 17);
                        experienceOptions.getClass();
                        i iVar = new i(experienceOptions, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i6 = 1;
        this.e = new h(20, new Function1(this) { // from class: n0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f211033b;

            {
                this.f211033b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i32 = i6;
                g gVar = this.f211033b;
                switch (i32) {
                    case 0:
                        pyf.b params = (pyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ue0.c cVar = gVar.f211040c;
                        String strN = a0.d.n("CACHE_KEY_PAYMENT_OPTIONS-", params.hashCode());
                        Type type = TypeToken.getParameterized(List.class, uzf.b.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        List list = (List) cVar.T2(strN, type);
                        if (list == null) {
                            return null;
                        }
                        List<uzf.b> list2 = list;
                        int i59 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (uzf.b bVar : list2) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String strC = bVar.c();
                            String strE = bVar.e();
                            String strB = bVar.b();
                            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF = ebm.a.F(bVar.h());
                            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF2 = ebm.a.F(bVar.i());
                            List<uzf.a> listJ = bVar.j();
                            ArrayList arrayList2 = new ArrayList(w.t(listJ, i59));
                            for (uzf.a aVar : listJ) {
                                Intrinsics.checkNotNullParameter(aVar, "<this>");
                                LocalTime localTime = LocalTime.parse(aVar.c());
                                Intrinsics.checkNotNullExpressionValue(localTime, "parse(...)");
                                boolean zD = aVar.d();
                                a0g.b bVarA = aVar.a();
                                TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF3 = bVarA != null ? ebm.a.F(bVarA) : null;
                                a0g.b bVarB = aVar.b();
                                arrayList2.add(new TravelExperiencesAvailabilityTimes(localTime, zD, travelExperiencesPricingBreakdownF3, bVarB != null ? ebm.a.F(bVarB) : null));
                            }
                            TravelExperiencesCashback travelExperiencesCashbackS = ue8.c.S(bVar.a());
                            List listD = bVar.d();
                            ArrayList arrayList3 = new ArrayList(w.t(listD, 10));
                            Iterator it8 = listD.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(zyf.d.b((rzf.o) it8.next()));
                            }
                            wzf.a aVarF = bVar.f();
                            TravelExperiencesPointsOption travelExperiencesPointsOptionN = aVarF != null ? cp5.d.N(aVarF) : null;
                            String strG = bVar.g();
                            arrayList.add(new TravelExperiencesOption(strC, strE, strB, travelExperiencesPricingBreakdownF, travelExperiencesPricingBreakdownF2, arrayList2, travelExperiencesCashbackS, arrayList3, travelExperiencesPointsOptionN, strG != null ? qvb.a.d(strG) : null));
                            i59 = 10;
                        }
                        return arrayList;
                    case 1:
                        pyf.a params2 = (pyf.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesOptionsService travelExperiencesOptionsService = gVar.f211038a;
                        String str = params2.f240818a;
                        String str2 = params2.f240819b;
                        String str3 = params2.f240820c;
                        String str4 = params2.d;
                        String str5 = params2.e;
                        Map map = params2.f;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(((myf.b) entry.getKey()).toString(), entry.getValue());
                        }
                        d0<tzf.b> experienceOptionAvailability = travelExperiencesOptionsService.getExperienceOptionAvailability(str, str2, str3, str4, str5, linkedHashMap);
                        mzj.j jVar = new mzj.j(new o(2), 16);
                        experienceOptionAvailability.getClass();
                        i iVar = new i(experienceOptionAvailability, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        d dVar = (d) obj2;
                        Intrinsics.checkNotNullParameter(dVar, "<destruct>");
                        d0<List<qzf.j>> questions = gVar.f211038a.getQuestions(dVar.f211034a, dVar.f211035b);
                        mzj.j jVar2 = new mzj.j(new o(4), 18);
                        questions.getClass();
                        i iVar2 = new i(questions, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        pyf.b params3 = (pyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) gVar.f211039b.get("CACHE_KEY_PAYMENT_OPTIONS-" + params3.hashCode());
                }
            }
        });
        final int i21 = 2;
        this.f = new h(20, new Function1(this) { // from class: n0g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f211033b;

            {
                this.f211033b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i32 = i21;
                g gVar = this.f211033b;
                switch (i32) {
                    case 0:
                        pyf.b params = (pyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ue0.c cVar = gVar.f211040c;
                        String strN = a0.d.n("CACHE_KEY_PAYMENT_OPTIONS-", params.hashCode());
                        Type type = TypeToken.getParameterized(List.class, uzf.b.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        List list = (List) cVar.T2(strN, type);
                        if (list == null) {
                            return null;
                        }
                        List<uzf.b> list2 = list;
                        int i59 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (uzf.b bVar : list2) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String strC = bVar.c();
                            String strE = bVar.e();
                            String strB = bVar.b();
                            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF = ebm.a.F(bVar.h());
                            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF2 = ebm.a.F(bVar.i());
                            List<uzf.a> listJ = bVar.j();
                            ArrayList arrayList2 = new ArrayList(w.t(listJ, i59));
                            for (uzf.a aVar : listJ) {
                                Intrinsics.checkNotNullParameter(aVar, "<this>");
                                LocalTime localTime = LocalTime.parse(aVar.c());
                                Intrinsics.checkNotNullExpressionValue(localTime, "parse(...)");
                                boolean zD = aVar.d();
                                a0g.b bVarA = aVar.a();
                                TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownF3 = bVarA != null ? ebm.a.F(bVarA) : null;
                                a0g.b bVarB = aVar.b();
                                arrayList2.add(new TravelExperiencesAvailabilityTimes(localTime, zD, travelExperiencesPricingBreakdownF3, bVarB != null ? ebm.a.F(bVarB) : null));
                            }
                            TravelExperiencesCashback travelExperiencesCashbackS = ue8.c.S(bVar.a());
                            List listD = bVar.d();
                            ArrayList arrayList3 = new ArrayList(w.t(listD, 10));
                            Iterator it8 = listD.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(zyf.d.b((rzf.o) it8.next()));
                            }
                            wzf.a aVarF = bVar.f();
                            TravelExperiencesPointsOption travelExperiencesPointsOptionN = aVarF != null ? cp5.d.N(aVarF) : null;
                            String strG = bVar.g();
                            arrayList.add(new TravelExperiencesOption(strC, strE, strB, travelExperiencesPricingBreakdownF, travelExperiencesPricingBreakdownF2, arrayList2, travelExperiencesCashbackS, arrayList3, travelExperiencesPointsOptionN, strG != null ? qvb.a.d(strG) : null));
                            i59 = 10;
                        }
                        return arrayList;
                    case 1:
                        pyf.a params2 = (pyf.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TravelExperiencesOptionsService travelExperiencesOptionsService = gVar.f211038a;
                        String str = params2.f240818a;
                        String str2 = params2.f240819b;
                        String str3 = params2.f240820c;
                        String str4 = params2.d;
                        String str5 = params2.e;
                        Map map = params2.f;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(((myf.b) entry.getKey()).toString(), entry.getValue());
                        }
                        d0<tzf.b> experienceOptionAvailability = travelExperiencesOptionsService.getExperienceOptionAvailability(str, str2, str3, str4, str5, linkedHashMap);
                        mzj.j jVar = new mzj.j(new o(2), 16);
                        experienceOptionAvailability.getClass();
                        i iVar = new i(experienceOptionAvailability, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        d dVar = (d) obj2;
                        Intrinsics.checkNotNullParameter(dVar, "<destruct>");
                        d0<List<qzf.j>> questions = gVar.f211038a.getQuestions(dVar.f211034a, dVar.f211035b);
                        mzj.j jVar2 = new mzj.j(new o(4), 18);
                        questions.getClass();
                        i iVar2 = new i(questions, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        pyf.b params3 = (pyf.b) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (List) gVar.f211039b.get("CACHE_KEY_PAYMENT_OPTIONS-" + params3.hashCode());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(pyf.a r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n0g.e
            if (r0 == 0) goto L13
            r0 = r6
            n0g.e r0 = (n0g.e) r0
            int r1 = r0.f211036w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211036w = r1
            goto L18
        L13:
            n0g.e r0 = new n0g.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211036w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ao.h r6 = r4.e
            efm.d0 r5 = r6.k(r5)
            r0.f211036w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n0g.g.a(pyf.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof n0g.f
            if (r0 == 0) goto L13
            r0 = r7
            n0g.f r0 = (n0g.f) r0
            int r1 = r0.f211037w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211037w = r1
            goto L18
        L13:
            n0g.f r0 = new n0g.f
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211037w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            n0g.d r7 = new n0g.d
            r7.<init>(r5, r6)
            ao.h r5 = r4.f
            efm.d0 r5 = r5.k(r7)
            r0.f211037w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n0g.g.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
