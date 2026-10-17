package un8;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_settings.impl.services.JuniorSettingsService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import th6.p;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements c {

    @NotNull
    public static final f Companion = new f();
    public static final Type i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f281365j;
    public static final Type k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorSettingsService f281366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f281367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f281368c;
    public final w4l.f d;
    public final w4l.f e;
    public final hlm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f281369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ao.h f281370h;

    static {
        Type type = new TypeToken<List<? extends sn8.b>>() { // from class: com.revolut.feature.junior_settings.impl.repositories.JuniorSettingsRepositoryImpl$Companion$JUNIOR_PLAN_PRODUCTS_LIST_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        i = type;
        Type type2 = new TypeToken<sn8.c>() { // from class: com.revolut.feature.junior_settings.impl.repositories.JuniorSettingsRepositoryImpl$Companion$JUNIOR_REFERRAL_SETTINGS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f281365j = type2;
        Type type3 = new TypeToken<sn8.a>() { // from class: com.revolut.feature.junior_settings.impl.repositories.JuniorSettingsRepositoryImpl$Companion$JUNIOR_PAYMENTS_SETTINGS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        k = type3;
    }

    public h(JuniorSettingsService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f281366a = service;
        this.f281367b = memoryCache;
        this.f281368c = storage;
        final int i2 = 0;
        Function2 function2 = new Function2(this) { // from class: un8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281359b;

            {
                this.f281359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i2;
                h hVar = this.f281359b;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<rn8.e>> currentProducts = hVar.f281366a.getCurrentProducts(juniorId);
                        uhl.b bVar = new uhl.b(new umc.c(6), 27);
                        currentProducts.getClass();
                        ufm.i iVar = new ufm.i(currentProducts, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        in8.c value = (in8.c) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        hVar.f281367b.f(h.a(juniorId2), value);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        hVar.f281367b.f(h.b(juniorId3), value2);
                        break;
                    case 3:
                        String juniorId4 = (String) obj2;
                        List planProducts = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        Intrinsics.checkNotNullParameter(planProducts, "planProducts");
                        ue0.c cVar = hVar.f281368c;
                        String strB = h.b(juniorId4);
                        Object obj4 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(planProducts, "<this>");
                        List<in8.e> list = planProducts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (in8.e eVar : list) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String str = eVar.f162688a;
                            String str2 = eVar.f162689b;
                            Long l2 = eVar.f162690c;
                            Long l3 = eVar.d;
                            Double d = eVar.e;
                            Boolean bool = eVar.f;
                            Long l4 = eVar.f162691g;
                            Long l5 = eVar.f162692h;
                            in8.f fVar = eVar.i;
                            arrayList.add(new sn8.b(str, str2, l2, l3, d, bool, l4, l5, fVar != null ? u1.h(fVar, qn8.a.f247876a) : null));
                        }
                        cVar.G(arrayList, strB, kii.e.o(sn8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String juniorId5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        d0<rn8.f> juniorReferralSetting = hVar.f281366a.getJuniorReferralSetting(juniorId5);
                        uhl.b bVar2 = new uhl.b(new umc.c(3), 24);
                        juniorReferralSetting.getClass();
                        ufm.i iVar2 = new ufm.i(juniorReferralSetting, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 5:
                        String juniorId6 = (String) obj2;
                        in8.g value3 = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId6, "juniorId");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        hVar.f281367b.f(h.c(juniorId6), value3);
                        break;
                    default:
                        String juniorId7 = (String) obj2;
                        in8.g referralSetting = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId7, "juniorId");
                        Intrinsics.checkNotNullParameter(referralSetting, "referralSetting");
                        ue0.c cVar2 = hVar.f281368c;
                        String strC = h.c(juniorId7);
                        Intrinsics.checkNotNullParameter(referralSetting, "<this>");
                        cVar2.G(new sn8.c(referralSetting.f162693a), strC, z.d(o0.b(sn8.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        Function1 function1 = new Function1(this) { // from class: un8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281361b;

            {
                this.f281361b = this;
            }

            /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i5 = i3;
                h hVar = this.f281361b;
                switch (i5) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (in8.c) hVar.f281367b.get(h.a(juniorId));
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<rn8.f> d0VarUpdateJuniorReferralSetting = hVar.f281366a.updateJuniorReferralSetting((String) pair.f186385a, (rn8.f) pair.f186386b);
                        uhl.b bVar = new uhl.b(new umc.c(4), 25);
                        d0VarUpdateJuniorReferralSetting.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(d0VarUpdateJuniorReferralSetting, bVar, 1), new uhl.b(new umc.c(5), 26), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        return (List) hVar.f281367b.get(h.b(juniorId2));
                    case 3:
                        String juniorId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        List list = (List) hVar.f281368c.T2(h.b(juniorId3), h.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<sn8.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (sn8.b bVar2 : list2) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            String type = bVar2.getType();
                            String currency = bVar2.getCurrency();
                            Long price = bVar2.getPrice();
                            Long limit = bVar2.getLimit();
                            Double feePc = bVar2.getFeePc();
                            Boolean free = bVar2.getFree();
                            Long usage = bVar2.getUsage();
                            Long endDate = bVar2.getEndDate();
                            String limitUnit = bVar2.getLimitUnit();
                            arrayList.add(new in8.e(type, currency, price, limit, feePc, free, usage, endDate, limitUnit != null ? (in8.f) u1.v(limitUnit, qn8.a.f247876a) : null));
                        }
                        return arrayList;
                    case 4:
                        String juniorId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        return (in8.g) hVar.f281367b.get(h.c(juniorId4));
                    default:
                        String juniorId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        sn8.c cVar = (sn8.c) hVar.f281368c.T2(h.c(juniorId5), h.f281365j);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        return new in8.g(cVar.getReferralsEnabled());
                }
            }
        };
        Function2 function22 = new Function2(this) { // from class: un8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281359b;

            {
                this.f281359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i3;
                h hVar = this.f281359b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<rn8.e>> currentProducts = hVar.f281366a.getCurrentProducts(juniorId);
                        uhl.b bVar = new uhl.b(new umc.c(6), 27);
                        currentProducts.getClass();
                        ufm.i iVar = new ufm.i(currentProducts, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        in8.c value = (in8.c) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        hVar.f281367b.f(h.a(juniorId2), value);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        hVar.f281367b.f(h.b(juniorId3), value2);
                        break;
                    case 3:
                        String juniorId4 = (String) obj2;
                        List planProducts = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        Intrinsics.checkNotNullParameter(planProducts, "planProducts");
                        ue0.c cVar = hVar.f281368c;
                        String strB = h.b(juniorId4);
                        Object obj4 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(planProducts, "<this>");
                        List<in8.e> list = planProducts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (in8.e eVar : list) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String str = eVar.f162688a;
                            String str2 = eVar.f162689b;
                            Long l2 = eVar.f162690c;
                            Long l3 = eVar.d;
                            Double d = eVar.e;
                            Boolean bool = eVar.f;
                            Long l4 = eVar.f162691g;
                            Long l5 = eVar.f162692h;
                            in8.f fVar = eVar.i;
                            arrayList.add(new sn8.b(str, str2, l2, l3, d, bool, l4, l5, fVar != null ? u1.h(fVar, qn8.a.f247876a) : null));
                        }
                        cVar.G(arrayList, strB, kii.e.o(sn8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String juniorId5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        d0<rn8.f> juniorReferralSetting = hVar.f281366a.getJuniorReferralSetting(juniorId5);
                        uhl.b bVar2 = new uhl.b(new umc.c(3), 24);
                        juniorReferralSetting.getClass();
                        ufm.i iVar2 = new ufm.i(juniorReferralSetting, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 5:
                        String juniorId6 = (String) obj2;
                        in8.g value3 = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId6, "juniorId");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        hVar.f281367b.f(h.c(juniorId6), value3);
                        break;
                    default:
                        String juniorId7 = (String) obj2;
                        in8.g referralSetting = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId7, "juniorId");
                        Intrinsics.checkNotNullParameter(referralSetting, "referralSetting");
                        ue0.c cVar2 = hVar.f281368c;
                        String strC = h.c(juniorId7);
                        Intrinsics.checkNotNullParameter(referralSetting, "<this>");
                        cVar2.G(new sn8.c(referralSetting.f162693a), strC, z.d(o0.b(sn8.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 3;
        this.d = new w4l.f(function2, function1, function22, new Function1(this) { // from class: un8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281361b;

            {
                this.f281361b = this;
            }

            /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i59 = i5;
                h hVar = this.f281361b;
                switch (i59) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (in8.c) hVar.f281367b.get(h.a(juniorId));
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<rn8.f> d0VarUpdateJuniorReferralSetting = hVar.f281366a.updateJuniorReferralSetting((String) pair.f186385a, (rn8.f) pair.f186386b);
                        uhl.b bVar = new uhl.b(new umc.c(4), 25);
                        d0VarUpdateJuniorReferralSetting.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(d0VarUpdateJuniorReferralSetting, bVar, 1), new uhl.b(new umc.c(5), 26), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        return (List) hVar.f281367b.get(h.b(juniorId2));
                    case 3:
                        String juniorId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        List list = (List) hVar.f281368c.T2(h.b(juniorId3), h.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<sn8.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (sn8.b bVar2 : list2) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            String type = bVar2.getType();
                            String currency = bVar2.getCurrency();
                            Long price = bVar2.getPrice();
                            Long limit = bVar2.getLimit();
                            Double feePc = bVar2.getFeePc();
                            Boolean free = bVar2.getFree();
                            Long usage = bVar2.getUsage();
                            Long endDate = bVar2.getEndDate();
                            String limitUnit = bVar2.getLimitUnit();
                            arrayList.add(new in8.e(type, currency, price, limit, feePc, free, usage, endDate, limitUnit != null ? (in8.f) u1.v(limitUnit, qn8.a.f247876a) : null));
                        }
                        return arrayList;
                    case 4:
                        String juniorId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        return (in8.g) hVar.f281367b.get(h.c(juniorId4));
                    default:
                        String juniorId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        sn8.c cVar = (sn8.c) hVar.f281368c.T2(h.c(juniorId5), h.f281365j);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        return new in8.g(cVar.getReferralsEnabled());
                }
            }
        }, new Function2(this) { // from class: un8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281359b;

            {
                this.f281359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i5;
                h hVar = this.f281359b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<rn8.e>> currentProducts = hVar.f281366a.getCurrentProducts(juniorId);
                        uhl.b bVar = new uhl.b(new umc.c(6), 27);
                        currentProducts.getClass();
                        ufm.i iVar = new ufm.i(currentProducts, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        in8.c value = (in8.c) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        hVar.f281367b.f(h.a(juniorId2), value);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        hVar.f281367b.f(h.b(juniorId3), value2);
                        break;
                    case 3:
                        String juniorId4 = (String) obj2;
                        List planProducts = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        Intrinsics.checkNotNullParameter(planProducts, "planProducts");
                        ue0.c cVar = hVar.f281368c;
                        String strB = h.b(juniorId4);
                        Object obj4 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(planProducts, "<this>");
                        List<in8.e> list = planProducts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (in8.e eVar : list) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String str = eVar.f162688a;
                            String str2 = eVar.f162689b;
                            Long l2 = eVar.f162690c;
                            Long l3 = eVar.d;
                            Double d = eVar.e;
                            Boolean bool = eVar.f;
                            Long l4 = eVar.f162691g;
                            Long l5 = eVar.f162692h;
                            in8.f fVar = eVar.i;
                            arrayList.add(new sn8.b(str, str2, l2, l3, d, bool, l4, l5, fVar != null ? u1.h(fVar, qn8.a.f247876a) : null));
                        }
                        cVar.G(arrayList, strB, kii.e.o(sn8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String juniorId5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        d0<rn8.f> juniorReferralSetting = hVar.f281366a.getJuniorReferralSetting(juniorId5);
                        uhl.b bVar2 = new uhl.b(new umc.c(3), 24);
                        juniorReferralSetting.getClass();
                        ufm.i iVar2 = new ufm.i(juniorReferralSetting, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 5:
                        String juniorId6 = (String) obj2;
                        in8.g value3 = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId6, "juniorId");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        hVar.f281367b.f(h.c(juniorId6), value3);
                        break;
                    default:
                        String juniorId7 = (String) obj2;
                        in8.g referralSetting = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId7, "juniorId");
                        Intrinsics.checkNotNullParameter(referralSetting, "referralSetting");
                        ue0.c cVar2 = hVar.f281368c;
                        String strC = h.c(juniorId7);
                        Intrinsics.checkNotNullParameter(referralSetting, "<this>");
                        cVar2.G(new sn8.c(referralSetting.f162693a), strC, z.d(o0.b(sn8.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i6 = 4;
        Function2 function23 = new Function2(this) { // from class: un8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281359b;

            {
                this.f281359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i6;
                h hVar = this.f281359b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<rn8.e>> currentProducts = hVar.f281366a.getCurrentProducts(juniorId);
                        uhl.b bVar = new uhl.b(new umc.c(6), 27);
                        currentProducts.getClass();
                        ufm.i iVar = new ufm.i(currentProducts, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        in8.c value = (in8.c) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        hVar.f281367b.f(h.a(juniorId2), value);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        hVar.f281367b.f(h.b(juniorId3), value2);
                        break;
                    case 3:
                        String juniorId4 = (String) obj2;
                        List planProducts = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        Intrinsics.checkNotNullParameter(planProducts, "planProducts");
                        ue0.c cVar = hVar.f281368c;
                        String strB = h.b(juniorId4);
                        Object obj4 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(planProducts, "<this>");
                        List<in8.e> list = planProducts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (in8.e eVar : list) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String str = eVar.f162688a;
                            String str2 = eVar.f162689b;
                            Long l2 = eVar.f162690c;
                            Long l3 = eVar.d;
                            Double d = eVar.e;
                            Boolean bool = eVar.f;
                            Long l4 = eVar.f162691g;
                            Long l5 = eVar.f162692h;
                            in8.f fVar = eVar.i;
                            arrayList.add(new sn8.b(str, str2, l2, l3, d, bool, l4, l5, fVar != null ? u1.h(fVar, qn8.a.f247876a) : null));
                        }
                        cVar.G(arrayList, strB, kii.e.o(sn8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String juniorId5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        d0<rn8.f> juniorReferralSetting = hVar.f281366a.getJuniorReferralSetting(juniorId5);
                        uhl.b bVar2 = new uhl.b(new umc.c(3), 24);
                        juniorReferralSetting.getClass();
                        ufm.i iVar2 = new ufm.i(juniorReferralSetting, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 5:
                        String juniorId6 = (String) obj2;
                        in8.g value3 = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId6, "juniorId");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        hVar.f281367b.f(h.c(juniorId6), value3);
                        break;
                    default:
                        String juniorId7 = (String) obj2;
                        in8.g referralSetting = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId7, "juniorId");
                        Intrinsics.checkNotNullParameter(referralSetting, "referralSetting");
                        ue0.c cVar2 = hVar.f281368c;
                        String strC = h.c(juniorId7);
                        Intrinsics.checkNotNullParameter(referralSetting, "<this>");
                        cVar2.G(new sn8.c(referralSetting.f162693a), strC, z.d(o0.b(sn8.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: un8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281361b;

            {
                this.f281361b = this;
            }

            /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i59 = i6;
                h hVar = this.f281361b;
                switch (i59) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (in8.c) hVar.f281367b.get(h.a(juniorId));
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<rn8.f> d0VarUpdateJuniorReferralSetting = hVar.f281366a.updateJuniorReferralSetting((String) pair.f186385a, (rn8.f) pair.f186386b);
                        uhl.b bVar = new uhl.b(new umc.c(4), 25);
                        d0VarUpdateJuniorReferralSetting.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(d0VarUpdateJuniorReferralSetting, bVar, 1), new uhl.b(new umc.c(5), 26), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        return (List) hVar.f281367b.get(h.b(juniorId2));
                    case 3:
                        String juniorId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        List list = (List) hVar.f281368c.T2(h.b(juniorId3), h.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<sn8.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (sn8.b bVar2 : list2) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            String type = bVar2.getType();
                            String currency = bVar2.getCurrency();
                            Long price = bVar2.getPrice();
                            Long limit = bVar2.getLimit();
                            Double feePc = bVar2.getFeePc();
                            Boolean free = bVar2.getFree();
                            Long usage = bVar2.getUsage();
                            Long endDate = bVar2.getEndDate();
                            String limitUnit = bVar2.getLimitUnit();
                            arrayList.add(new in8.e(type, currency, price, limit, feePc, free, usage, endDate, limitUnit != null ? (in8.f) u1.v(limitUnit, qn8.a.f247876a) : null));
                        }
                        return arrayList;
                    case 4:
                        String juniorId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        return (in8.g) hVar.f281367b.get(h.c(juniorId4));
                    default:
                        String juniorId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        sn8.c cVar = (sn8.c) hVar.f281368c.T2(h.c(juniorId5), h.f281365j);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        return new in8.g(cVar.getReferralsEnabled());
                }
            }
        };
        final int i21 = 5;
        Function2 function24 = new Function2(this) { // from class: un8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281359b;

            {
                this.f281359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i21;
                h hVar = this.f281359b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<rn8.e>> currentProducts = hVar.f281366a.getCurrentProducts(juniorId);
                        uhl.b bVar = new uhl.b(new umc.c(6), 27);
                        currentProducts.getClass();
                        ufm.i iVar = new ufm.i(currentProducts, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        in8.c value = (in8.c) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        hVar.f281367b.f(h.a(juniorId2), value);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        hVar.f281367b.f(h.b(juniorId3), value2);
                        break;
                    case 3:
                        String juniorId4 = (String) obj2;
                        List planProducts = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        Intrinsics.checkNotNullParameter(planProducts, "planProducts");
                        ue0.c cVar = hVar.f281368c;
                        String strB = h.b(juniorId4);
                        Object obj4 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(planProducts, "<this>");
                        List<in8.e> list = planProducts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (in8.e eVar : list) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String str = eVar.f162688a;
                            String str2 = eVar.f162689b;
                            Long l2 = eVar.f162690c;
                            Long l3 = eVar.d;
                            Double d = eVar.e;
                            Boolean bool = eVar.f;
                            Long l4 = eVar.f162691g;
                            Long l5 = eVar.f162692h;
                            in8.f fVar = eVar.i;
                            arrayList.add(new sn8.b(str, str2, l2, l3, d, bool, l4, l5, fVar != null ? u1.h(fVar, qn8.a.f247876a) : null));
                        }
                        cVar.G(arrayList, strB, kii.e.o(sn8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String juniorId5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        d0<rn8.f> juniorReferralSetting = hVar.f281366a.getJuniorReferralSetting(juniorId5);
                        uhl.b bVar2 = new uhl.b(new umc.c(3), 24);
                        juniorReferralSetting.getClass();
                        ufm.i iVar2 = new ufm.i(juniorReferralSetting, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 5:
                        String juniorId6 = (String) obj2;
                        in8.g value3 = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId6, "juniorId");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        hVar.f281367b.f(h.c(juniorId6), value3);
                        break;
                    default:
                        String juniorId7 = (String) obj2;
                        in8.g referralSetting = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId7, "juniorId");
                        Intrinsics.checkNotNullParameter(referralSetting, "referralSetting");
                        ue0.c cVar2 = hVar.f281368c;
                        String strC = h.c(juniorId7);
                        Intrinsics.checkNotNullParameter(referralSetting, "<this>");
                        cVar2.G(new sn8.c(referralSetting.f162693a), strC, z.d(o0.b(sn8.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function13 = new Function1(this) { // from class: un8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281361b;

            {
                this.f281361b = this;
            }

            /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i59 = i21;
                h hVar = this.f281361b;
                switch (i59) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (in8.c) hVar.f281367b.get(h.a(juniorId));
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<rn8.f> d0VarUpdateJuniorReferralSetting = hVar.f281366a.updateJuniorReferralSetting((String) pair.f186385a, (rn8.f) pair.f186386b);
                        uhl.b bVar = new uhl.b(new umc.c(4), 25);
                        d0VarUpdateJuniorReferralSetting.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(d0VarUpdateJuniorReferralSetting, bVar, 1), new uhl.b(new umc.c(5), 26), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        return (List) hVar.f281367b.get(h.b(juniorId2));
                    case 3:
                        String juniorId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        List list = (List) hVar.f281368c.T2(h.b(juniorId3), h.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<sn8.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (sn8.b bVar2 : list2) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            String type = bVar2.getType();
                            String currency = bVar2.getCurrency();
                            Long price = bVar2.getPrice();
                            Long limit = bVar2.getLimit();
                            Double feePc = bVar2.getFeePc();
                            Boolean free = bVar2.getFree();
                            Long usage = bVar2.getUsage();
                            Long endDate = bVar2.getEndDate();
                            String limitUnit = bVar2.getLimitUnit();
                            arrayList.add(new in8.e(type, currency, price, limit, feePc, free, usage, endDate, limitUnit != null ? (in8.f) u1.v(limitUnit, qn8.a.f247876a) : null));
                        }
                        return arrayList;
                    case 4:
                        String juniorId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        return (in8.g) hVar.f281367b.get(h.c(juniorId4));
                    default:
                        String juniorId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        sn8.c cVar = (sn8.c) hVar.f281368c.T2(h.c(juniorId5), h.f281365j);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        return new in8.g(cVar.getReferralsEnabled());
                }
            }
        };
        final int i22 = 6;
        this.e = new w4l.f(function23, function12, function24, function13, new Function2(this) { // from class: un8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281359b;

            {
                this.f281359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i32 = i22;
                h hVar = this.f281359b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<rn8.e>> currentProducts = hVar.f281366a.getCurrentProducts(juniorId);
                        uhl.b bVar = new uhl.b(new umc.c(6), 27);
                        currentProducts.getClass();
                        ufm.i iVar = new ufm.i(currentProducts, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        in8.c value = (in8.c) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        hVar.f281367b.f(h.a(juniorId2), value);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        hVar.f281367b.f(h.b(juniorId3), value2);
                        break;
                    case 3:
                        String juniorId4 = (String) obj2;
                        List planProducts = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        Intrinsics.checkNotNullParameter(planProducts, "planProducts");
                        ue0.c cVar = hVar.f281368c;
                        String strB = h.b(juniorId4);
                        Object obj4 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(planProducts, "<this>");
                        List<in8.e> list = planProducts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (in8.e eVar : list) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String str = eVar.f162688a;
                            String str2 = eVar.f162689b;
                            Long l2 = eVar.f162690c;
                            Long l3 = eVar.d;
                            Double d = eVar.e;
                            Boolean bool = eVar.f;
                            Long l4 = eVar.f162691g;
                            Long l5 = eVar.f162692h;
                            in8.f fVar = eVar.i;
                            arrayList.add(new sn8.b(str, str2, l2, l3, d, bool, l4, l5, fVar != null ? u1.h(fVar, qn8.a.f247876a) : null));
                        }
                        cVar.G(arrayList, strB, kii.e.o(sn8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String juniorId5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        d0<rn8.f> juniorReferralSetting = hVar.f281366a.getJuniorReferralSetting(juniorId5);
                        uhl.b bVar2 = new uhl.b(new umc.c(3), 24);
                        juniorReferralSetting.getClass();
                        ufm.i iVar2 = new ufm.i(juniorReferralSetting, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 5:
                        String juniorId6 = (String) obj2;
                        in8.g value3 = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId6, "juniorId");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        hVar.f281367b.f(h.c(juniorId6), value3);
                        break;
                    default:
                        String juniorId7 = (String) obj2;
                        in8.g referralSetting = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId7, "juniorId");
                        Intrinsics.checkNotNullParameter(referralSetting, "referralSetting");
                        ue0.c cVar2 = hVar.f281368c;
                        String strC = h.c(juniorId7);
                        Intrinsics.checkNotNullParameter(referralSetting, "<this>");
                        cVar2.G(new sn8.c(referralSetting.f162693a), strC, z.d(o0.b(sn8.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        this.f = hlm.d.a();
        Continuation continuation = null;
        p pVar = new p(this, continuation, 7);
        final int i32 = 0;
        Function1 function14 = new Function1(this) { // from class: un8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281361b;

            {
                this.f281361b = this;
            }

            /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i59 = i32;
                h hVar = this.f281361b;
                switch (i59) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (in8.c) hVar.f281367b.get(h.a(juniorId));
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<rn8.f> d0VarUpdateJuniorReferralSetting = hVar.f281366a.updateJuniorReferralSetting((String) pair.f186385a, (rn8.f) pair.f186386b);
                        uhl.b bVar = new uhl.b(new umc.c(4), 25);
                        d0VarUpdateJuniorReferralSetting.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(d0VarUpdateJuniorReferralSetting, bVar, 1), new uhl.b(new umc.c(5), 26), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        return (List) hVar.f281367b.get(h.b(juniorId2));
                    case 3:
                        String juniorId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        List list = (List) hVar.f281368c.T2(h.b(juniorId3), h.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<sn8.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (sn8.b bVar2 : list2) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            String type = bVar2.getType();
                            String currency = bVar2.getCurrency();
                            Long price = bVar2.getPrice();
                            Long limit = bVar2.getLimit();
                            Double feePc = bVar2.getFeePc();
                            Boolean free = bVar2.getFree();
                            Long usage = bVar2.getUsage();
                            Long endDate = bVar2.getEndDate();
                            String limitUnit = bVar2.getLimitUnit();
                            arrayList.add(new in8.e(type, currency, price, limit, feePc, free, usage, endDate, limitUnit != null ? (in8.f) u1.v(limitUnit, qn8.a.f247876a) : null));
                        }
                        return arrayList;
                    case 4:
                        String juniorId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        return (in8.g) hVar.f281367b.get(h.c(juniorId4));
                    default:
                        String juniorId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        sn8.c cVar = (sn8.c) hVar.f281368c.T2(h.c(juniorId5), h.f281365j);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        return new in8.g(cVar.getReferralsEnabled());
                }
            }
        };
        final int i33 = 1;
        this.f281369g = new x4l.c(pVar, function14, new Function2(this) { // from class: un8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281359b;

            {
                this.f281359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i322 = i33;
                h hVar = this.f281359b;
                switch (i322) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<rn8.e>> currentProducts = hVar.f281366a.getCurrentProducts(juniorId);
                        uhl.b bVar = new uhl.b(new umc.c(6), 27);
                        currentProducts.getClass();
                        ufm.i iVar = new ufm.i(currentProducts, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        in8.c value = (in8.c) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        hVar.f281367b.f(h.a(juniorId2), value);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        hVar.f281367b.f(h.b(juniorId3), value2);
                        break;
                    case 3:
                        String juniorId4 = (String) obj2;
                        List planProducts = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        Intrinsics.checkNotNullParameter(planProducts, "planProducts");
                        ue0.c cVar = hVar.f281368c;
                        String strB = h.b(juniorId4);
                        Object obj4 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(planProducts, "<this>");
                        List<in8.e> list = planProducts;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (in8.e eVar : list) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            String str = eVar.f162688a;
                            String str2 = eVar.f162689b;
                            Long l2 = eVar.f162690c;
                            Long l3 = eVar.d;
                            Double d = eVar.e;
                            Boolean bool = eVar.f;
                            Long l4 = eVar.f162691g;
                            Long l5 = eVar.f162692h;
                            in8.f fVar = eVar.i;
                            arrayList.add(new sn8.b(str, str2, l2, l3, d, bool, l4, l5, fVar != null ? u1.h(fVar, qn8.a.f247876a) : null));
                        }
                        cVar.G(arrayList, strB, kii.e.o(sn8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String juniorId5 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        d0<rn8.f> juniorReferralSetting = hVar.f281366a.getJuniorReferralSetting(juniorId5);
                        uhl.b bVar2 = new uhl.b(new umc.c(3), 24);
                        juniorReferralSetting.getClass();
                        ufm.i iVar2 = new ufm.i(juniorReferralSetting, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 5:
                        String juniorId6 = (String) obj2;
                        in8.g value3 = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId6, "juniorId");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        hVar.f281367b.f(h.c(juniorId6), value3);
                        break;
                    default:
                        String juniorId7 = (String) obj2;
                        in8.g referralSetting = (in8.g) obj3;
                        Intrinsics.checkNotNullParameter(juniorId7, "juniorId");
                        Intrinsics.checkNotNullParameter(referralSetting, "referralSetting");
                        ue0.c cVar2 = hVar.f281368c;
                        String strC = h.c(juniorId7);
                        Intrinsics.checkNotNullParameter(referralSetting, "<this>");
                        cVar2.G(new sn8.c(referralSetting.f162693a), strC, z.d(o0.b(sn8.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new uf0.d(this, continuation, 21), new sne.e(this, continuation, 12));
        final int i43 = 1;
        this.f281370h = new ao.h(20, new Function1(this) { // from class: un8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f281361b;

            {
                this.f281361b = this;
            }

            /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i59 = i43;
                h hVar = this.f281361b;
                switch (i59) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (in8.c) hVar.f281367b.get(h.a(juniorId));
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d0<rn8.f> d0VarUpdateJuniorReferralSetting = hVar.f281366a.updateJuniorReferralSetting((String) pair.f186385a, (rn8.f) pair.f186386b);
                        uhl.b bVar = new uhl.b(new umc.c(4), 25);
                        d0VarUpdateJuniorReferralSetting.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(d0VarUpdateJuniorReferralSetting, bVar, 1), new uhl.b(new umc.c(5), 26), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 2:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        return (List) hVar.f281367b.get(h.b(juniorId2));
                    case 3:
                        String juniorId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        List list = (List) hVar.f281368c.T2(h.b(juniorId3), h.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = qn8.a.f247876a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<sn8.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (sn8.b bVar2 : list2) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            String type = bVar2.getType();
                            String currency = bVar2.getCurrency();
                            Long price = bVar2.getPrice();
                            Long limit = bVar2.getLimit();
                            Double feePc = bVar2.getFeePc();
                            Boolean free = bVar2.getFree();
                            Long usage = bVar2.getUsage();
                            Long endDate = bVar2.getEndDate();
                            String limitUnit = bVar2.getLimitUnit();
                            arrayList.add(new in8.e(type, currency, price, limit, feePc, free, usage, endDate, limitUnit != null ? (in8.f) u1.v(limitUnit, qn8.a.f247876a) : null));
                        }
                        return arrayList;
                    case 4:
                        String juniorId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                        return (in8.g) hVar.f281367b.get(h.c(juniorId4));
                    default:
                        String juniorId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId5, "juniorId");
                        sn8.c cVar = (sn8.c) hVar.f281368c.T2(h.c(juniorId5), h.f281365j);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        return new in8.g(cVar.getReferralsEnabled());
                }
            }
        });
    }

    public static String a(String str) {
        return j6.a.q("CACHE_KEY_PAYMENTS_SETTING", str);
    }

    public static String b(String str) {
        return j6.a.q("CACHE_KEY_PLAN_PRODUCTS", str);
    }

    public static String c(String str) {
        return j6.a.q("CACHE_KEY_REFERRAL_SETTING", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r7.f(r6, (in8.c) r3, r1) != r2) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r15v3, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v2, types: [x4l.c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r15, in8.d r16, gim.c r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof un8.g
            if (r1 == 0) goto L15
            r1 = r0
            un8.g r1 = (un8.g) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.B = r2
            goto L1a
        L15:
            un8.g r1 = new un8.g
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.z
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.B
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            r12 = 0
            if (r3 == 0) goto L67
            if (r3 == r7) goto L57
            if (r3 == r6) goto L41
            if (r3 != r5) goto L39
            hlm.a r15 = r1.f281362w
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L35
            r9 = r14
            goto Lbb
        L35:
            r0 = move-exception
            r9 = r14
            goto Lc2
        L39:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L41:
            int r4 = r1.f281364y
            int r15 = r1.f281363x
            hlm.a r3 = r1.f281362w
            java.lang.String r6 = r1.u
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L52
            r9 = r0
            r0 = r15
            r15 = r3
            r3 = r9
            r9 = r14
            goto La4
        L52:
            r0 = move-exception
            r9 = r14
            r15 = r3
            goto Lc2
        L57:
            int r15 = r1.f281363x
            hlm.a r3 = r1.f281362w
            in8.d r7 = r1.v
            java.lang.String r8 = r1.u
            yhm.o.b(r0)
            r0 = r15
            r11 = r7
            r10 = r8
        L65:
            r15 = r3
            goto L84
        L67:
            yhm.o.b(r0)
            r1.u = r15
            r0 = r16
            r1.v = r0
            hlm.c r3 = r14.f
            r1.f281362w = r3
            r1.f281363x = r4
            r1.B = r7
            java.lang.Object r7 = r3.lock(r12, r1)
            if (r7 != r2) goto L80
            r9 = r14
            goto Lba
        L80:
            r10 = r15
            r11 = r0
            r0 = r4
            goto L65
        L84:
            skm.p0 r3 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L35
            elm.f r3 = elm.f.f127540b     // Catch: java.lang.Throwable -> L35
            twb.b0 r8 = new twb.b0     // Catch: java.lang.Throwable -> L35
            r13 = 23
            r9 = r14
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lc1
            r1.u = r10     // Catch: java.lang.Throwable -> Lc1
            r1.v = r12     // Catch: java.lang.Throwable -> Lc1
            r1.f281362w = r15     // Catch: java.lang.Throwable -> Lc1
            r1.f281363x = r0     // Catch: java.lang.Throwable -> Lc1
            r1.f281364y = r4     // Catch: java.lang.Throwable -> Lc1
            r1.B = r6     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r3 = skm.e0.J(r3, r8, r1)     // Catch: java.lang.Throwable -> Lc1
            if (r3 != r2) goto La3
            goto Lba
        La3:
            r6 = r10
        La4:
            in8.c r3 = (in8.c) r3     // Catch: java.lang.Throwable -> Lc1
            x4l.c r7 = r9.f281369g     // Catch: java.lang.Throwable -> Lc1
            r1.u = r12     // Catch: java.lang.Throwable -> Lc1
            r1.v = r12     // Catch: java.lang.Throwable -> Lc1
            r1.f281362w = r15     // Catch: java.lang.Throwable -> Lc1
            r1.f281363x = r0     // Catch: java.lang.Throwable -> Lc1
            r1.f281364y = r4     // Catch: java.lang.Throwable -> Lc1
            r1.B = r5     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r0 = r7.f(r6, r3, r1)     // Catch: java.lang.Throwable -> Lc1
            if (r0 != r2) goto Lbb
        Lba:
            return r2
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> Lc1
            r15.unlock(r12)
            return r0
        Lc1:
            r0 = move-exception
        Lc2:
            r15.unlock(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: un8.h.d(java.lang.String, in8.d, gim.c):java.lang.Object");
    }
}
