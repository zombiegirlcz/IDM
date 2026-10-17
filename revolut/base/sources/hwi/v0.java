package hwi;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 implements n0 {

    @NotNull
    public static final t0 Companion = new t0();
    public static final Type i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f156259j;
    public static final Type k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Type f156260l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesService f156261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f156262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f156263c;
    public final b80.c d;
    public final ReentrantReadWriteLock e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f156264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f156265h;

    static {
        Type type = new TypeToken<List<? extends iwi.a>>() { // from class: com.revolut.retail.feature.airportlounges.impl.repository.AirportLoungesRepositoryImpl$Companion$TYPE_AIRPORTS_ENTITY$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        i = type;
        Type type2 = new TypeToken<List<? extends iwi.c>>() { // from class: com.revolut.retail.feature.airportlounges.impl.repository.AirportLoungesRepositoryImpl$Companion$TYPE_AIRPORT_LOUNGES_ENTITY$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f156259j = type2;
        Type type3 = new TypeToken<iwi.b>() { // from class: com.revolut.retail.feature.airportlounges.impl.repository.AirportLoungesRepositoryImpl$Companion$TYPE_AIRPORT_LOUNGE_DETAILS_ENTITY$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        k = type3;
        Type type4 = new TypeToken<List<? extends iwi.k>>() { // from class: com.revolut.retail.feature.airportlounges.impl.repository.AirportLoungesRepositoryImpl$Companion$TYPE_RECENTLY_VIEWED_AIRPORTS_ENTITY$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        f156260l = type4;
    }

    public v0(AirportLoungesService service, ne0.j memoryCache, ue0.c storage, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f156261a = service;
        this.f156262b = memoryCache;
        this.f156263c = storage;
        this.d = networkStateRepository;
        this.e = new ReentrantReadWriteLock();
        final int i2 = 0;
        this.f = yhm.j.b(new Function0(this) { // from class: hwi.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f156250b;

            {
                this.f156250b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        final int i3 = 6;
                        final v0 v0Var = this.f156250b;
                        Function2 function2 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i3) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var2 = v0Var;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var2.f156261a.getLoungeDetails(param.f156251a), v0Var2.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var3 = v0Var;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var3.f156261a.getLounges(param2.f156253a), v0Var3.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        p0 p0Var = new p0(v0Var, 5);
                        final int i5 = 7;
                        Function2 function22 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i5) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var2 = v0Var;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var2.f156261a.getLoungeDetails(param.f156251a), v0Var2.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var3 = v0Var;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var3.f156261a.getLounges(param2.f156253a), v0Var3.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        final int i6 = 8;
                        return new w4l.f(function2, p0Var, function22, new p0(v0Var, 6), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i6) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var2 = v0Var;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var2.f156261a.getLoungeDetails(param.f156251a), v0Var2.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var3 = v0Var;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var3.f156261a.getLounges(param2.f156253a), v0Var3.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, null, null, null, BERTags.FLAGS);
                    case 1:
                        final int i21 = 1;
                        final v0 v0Var2 = this.f156250b;
                        Function2 function23 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i21) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var2;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var3 = v0Var2;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var3.f156261a.getLounges(param2.f156253a), v0Var3.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var2.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var2.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var2.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var2.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var2;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var2.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var2.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        p0 p0Var2 = new p0(v0Var2, 0);
                        final int i22 = 2;
                        Function2 function24 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i22) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var2;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var3 = v0Var2;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var3.f156261a.getLounges(param2.f156253a), v0Var3.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var2.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var2.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var2.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var2.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var2;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var2.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var2.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        final int i32 = 3;
                        return new w4l.f(function23, p0Var2, function24, new p0(v0Var2, 1), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i32) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var2;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var3 = v0Var2;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var3.f156261a.getLounges(param2.f156253a), v0Var3.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var2.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var2.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var2.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var2.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var2;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var2.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var2.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, null, null, null, BERTags.FLAGS);
                    default:
                        final int i33 = 0;
                        final v0 v0Var3 = this.f156250b;
                        final int i43 = 4;
                        final int i59 = 5;
                        return new w4l.f(new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i33) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var3;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var3;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var3.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var3.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var3.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var3.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var3;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var3.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var3.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new p0(v0Var3, 2), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i43) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var3;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var3;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var3.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var3.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var3.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var3.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var3;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var3.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var3.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new p0(v0Var3, 4), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i59) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var3;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var3;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var3.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var3.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var3.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var3.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var3;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var3.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var3.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, null, null, null, BERTags.FLAGS);
                }
            }
        });
        final int i3 = 1;
        this.f156264g = yhm.j.b(new Function0(this) { // from class: hwi.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f156250b;

            {
                this.f156250b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        final int i32 = 6;
                        final v0 v0Var = this.f156250b;
                        Function2 function2 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i32) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        p0 p0Var = new p0(v0Var, 5);
                        final int i5 = 7;
                        Function2 function22 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i5) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        final int i6 = 8;
                        return new w4l.f(function2, p0Var, function22, new p0(v0Var, 6), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i6) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, null, null, null, BERTags.FLAGS);
                    case 1:
                        final int i21 = 1;
                        final v0 v0Var2 = this.f156250b;
                        Function2 function23 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i21) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var2;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var2;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var2.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var2.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var2.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var2.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var2;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var2.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var2.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        p0 p0Var2 = new p0(v0Var2, 0);
                        final int i22 = 2;
                        Function2 function24 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i22) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var2;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var2;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var2.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var2.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var2.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var2.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var2;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var2.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var2.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        final int i322 = 3;
                        return new w4l.f(function23, p0Var2, function24, new p0(v0Var2, 1), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i322) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var2;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var2;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var2.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var2.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var2.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var2.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var2;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var2.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var2.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, null, null, null, BERTags.FLAGS);
                    default:
                        final int i33 = 0;
                        final v0 v0Var3 = this.f156250b;
                        final int i43 = 4;
                        final int i59 = 5;
                        return new w4l.f(new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i33) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var3;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var3;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var3.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var3.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var3.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var3.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var3;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var3.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var3.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new p0(v0Var3, 2), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i43) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var3;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var3;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var3.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var3.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var3.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var3.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var3;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var3.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var3.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new p0(v0Var3, 4), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i59) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var3;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var3;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var3.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var3.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var3.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var3.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var3;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var3.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var3.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, null, null, null, BERTags.FLAGS);
                }
            }
        });
        final int i5 = 2;
        this.f156265h = yhm.j.b(new Function0(this) { // from class: hwi.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f156250b;

            {
                this.f156250b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        final int i32 = 6;
                        final v0 v0Var = this.f156250b;
                        Function2 function2 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i32) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        p0 p0Var = new p0(v0Var, 5);
                        final int i59 = 7;
                        Function2 function22 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i59) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        final int i6 = 8;
                        return new w4l.f(function2, p0Var, function22, new p0(v0Var, 6), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i6) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, null, null, null, BERTags.FLAGS);
                    case 1:
                        final int i21 = 1;
                        final v0 v0Var2 = this.f156250b;
                        Function2 function23 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i21) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var2;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var2;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var2.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var2.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var2.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var2.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var2;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var2.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var2.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        p0 p0Var2 = new p0(v0Var2, 0);
                        final int i22 = 2;
                        Function2 function24 = new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i22) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var2;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var2;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var2.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var2.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var2.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var2.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var2;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var2.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var2.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        final int i322 = 3;
                        return new w4l.f(function23, p0Var2, function24, new p0(v0Var2, 1), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i322) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var2;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var2;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var2.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var2.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var2.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var2.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var2;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var2.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var2.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, null, null, null, BERTags.FLAGS);
                    default:
                        final int i33 = 0;
                        final v0 v0Var3 = this.f156250b;
                        final int i43 = 4;
                        final int i592 = 5;
                        return new w4l.f(new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i33) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var3;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var3;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var3.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var3.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var3.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var3.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var3;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var3.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var3.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new p0(v0Var3, 2), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i43) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var3;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var3;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var3.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var3.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var3.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var3.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var3;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var3.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var3.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new p0(v0Var3, 4), new Function2() { // from class: hwi.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i592) {
                                    case 0:
                                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                                        r0 param = (r0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param, "param");
                                        v0 v0Var22 = v0Var3;
                                        ufm.i iVar = new ufm.i(te0.w.n0(v0Var22.f156261a.getLoungeDetails(param.f156251a), v0Var22.d), new hw3.d(15, new hwf.b(14)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                        break;
                                    case 1:
                                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                                        s0 param2 = (s0) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(param2, "param");
                                        v0 v0Var32 = v0Var3;
                                        ufm.i iVar2 = new ufm.i(te0.w.n0(v0Var32.f156261a.getLounges(param2.f156253a), v0Var32.d), new hw3.d(14, new hwf.b(13)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                        break;
                                    case 2:
                                        s0 param3 = (s0) obj2;
                                        List value = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param3, "param");
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        v0Var3.f156262b.f(v0.b(param3), value);
                                        break;
                                    case 3:
                                        s0 param4 = (s0) obj2;
                                        List value2 = (List) obj3;
                                        Intrinsics.checkNotNullParameter(param4, "param");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        v0Var3.f156263c.G(ksj.b.f(value2), v0.b(param4), kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                    case 4:
                                        r0 param5 = (r0) obj2;
                                        svi.c value3 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param5, "param");
                                        Intrinsics.checkNotNullParameter(value3, "value");
                                        v0Var3.f156262b.f(v0.a(param5), value3);
                                        break;
                                    case 5:
                                        r0 param6 = (r0) obj2;
                                        svi.c value4 = (svi.c) obj3;
                                        Intrinsics.checkNotNullParameter(param6, "param");
                                        Intrinsics.checkNotNullParameter(value4, "value");
                                        ue0.c cVar = v0Var3.f156263c;
                                        String strA = v0.a(param6);
                                        String str = "<this>";
                                        Intrinsics.checkNotNullParameter(value4, "<this>");
                                        String str2 = value4.f265883a;
                                        String str3 = value4.f265884b;
                                        String str4 = value4.f265885c;
                                        String str5 = value4.d;
                                        String str6 = value4.e;
                                        List list = value4.i;
                                        String str7 = value4.f;
                                        String str8 = value4.f265886g;
                                        String str9 = value4.f265887h;
                                        ArrayList arrayList = value4.f265888j;
                                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                                            svi.d dVar = (svi.d) it8.next();
                                            Intrinsics.checkNotNullParameter(dVar, str);
                                            arrayList2.add(new iwi.d(dVar.f265892b, dVar.f265891a));
                                            str = str;
                                        }
                                        cVar.G(new iwi.b(str2, str3, str4, str5, str6, str7, list, str8, str9, arrayList2, jwi.b.f(value4.k)), strA, wim.z.d(kotlin.jvm.internal.o0.b(iwi.b.class)));
                                        break;
                                    case 6:
                                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                                        Unit it9 = (Unit) obj3;
                                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        v0 v0Var4 = v0Var3;
                                        ufm.i iVar3 = new ufm.i(te0.w.n0(v0Var4.f156261a.getAirports(), v0Var4.d), new hw3.d(13, new hwf.b(12)), 1);
                                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                        break;
                                    case 7:
                                        List value5 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value5, "value");
                                        v0Var3.f156262b.f("CACHE_KEY_AIRPORTS", value5);
                                        break;
                                    default:
                                        List value6 = (List) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(value6, "value");
                                        ue0.c cVar2 = v0Var3.f156263c;
                                        String str10 = "<this>";
                                        Intrinsics.checkNotNullParameter(value6, "<this>");
                                        List list2 = value6;
                                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                        for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                            svi.a aVar = (svi.a) it10.next();
                                            Intrinsics.checkNotNullParameter(aVar, str10);
                                            arrayList3.add(new iwi.a(aVar.f265868a, aVar.f265870c, aVar.f265869b, aVar.d, aVar.e, aVar.f, aVar.f265871g, aVar.f265872h));
                                            str10 = str10;
                                        }
                                        cVar2.G(arrayList3, "CACHE_KEY_AIRPORTS", kii.e.o(iwi.a.class, KTypeProjection.INSTANCE, List.class));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, null, null, null, BERTags.FLAGS);
                }
            }
        });
    }

    public static String a(r0 r0Var) {
        return j6.a.q("CACHE_KEY_AIRPORT_LOUNGE_DETAILS_", r0Var.f156251a);
    }

    public static String b(s0 s0Var) {
        return j6.a.q("CACHE_KEY_AIRPORT_LOUNGES_", s0Var.f156253a);
    }
}
