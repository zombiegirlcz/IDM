package fag;

import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature_travel_hotels_models.property.PointsRewardRate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsService f133393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f133394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f133395c;
    public final w4l.f d;

    public v(TravelHotelsService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f133393a = service;
        this.f133394b = memoryCache;
        this.f133395c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: fag.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f133371b;

            {
                this.f133371b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<sfi.a> boostedProperties = this.f133371b.f133393a.getBoostedProperties();
                        f9g.h hVar = new f9g.h(new f7l.c(13), 16);
                        boostedProperties.getClass();
                        ufm.i iVar = new ufm.i(boostedProperties, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List properties = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(properties, "properties");
                        this.f133371b.f133394b.f("KEY_BOOSTED_PROPERTIES", properties);
                        break;
                    default:
                        List properties2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(properties2, "properties");
                        ue0.c cVar = this.f133371b.f133395c;
                        List<wfi.a> list = properties2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (wfi.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String str = aVar.f297148a;
                            String str2 = aVar.f297149b;
                            String str3 = aVar.f297150c;
                            String str4 = aVar.d;
                            PointsRewardRate pointsRewardRate = aVar.e;
                            Intrinsics.checkNotNullParameter(pointsRewardRate, "<this>");
                            String strW = pointsRewardRate.f98060a.W();
                            jo3.a aVarP = mo3.a.p(pointsRewardRate.f98061b);
                            Double d = pointsRewardRate.f98062c;
                            arrayList.add(new sfi.b(str, str2, str3, str4, new ofi.l(strW, d != null ? String.valueOf(d.doubleValue()) : null, aVarP)));
                        }
                        cVar.G(arrayList, "KEY_BOOSTED_PROPERTIES", kii.e.o(sfi.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: fag.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f133373b;

            {
                this.f133373b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f133373b.f133394b.get("KEY_BOOSTED_PROPERTIES");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "<unused var>");
                        List list = (List) p.a.j(sfi.b.class, KTypeProjection.INSTANCE, List.class, this.f133373b.f133395c, "KEY_BOOSTED_PROPERTIES");
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(ue8.c.Z((sfi.b) it9.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: fag.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f133371b;

            {
                this.f133371b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<sfi.a> boostedProperties = this.f133371b.f133393a.getBoostedProperties();
                        f9g.h hVar = new f9g.h(new f7l.c(13), 16);
                        boostedProperties.getClass();
                        ufm.i iVar = new ufm.i(boostedProperties, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List properties = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(properties, "properties");
                        this.f133371b.f133394b.f("KEY_BOOSTED_PROPERTIES", properties);
                        break;
                    default:
                        List properties2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(properties2, "properties");
                        ue0.c cVar = this.f133371b.f133395c;
                        List<wfi.a> list = properties2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (wfi.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String str = aVar.f297148a;
                            String str2 = aVar.f297149b;
                            String str3 = aVar.f297150c;
                            String str4 = aVar.d;
                            PointsRewardRate pointsRewardRate = aVar.e;
                            Intrinsics.checkNotNullParameter(pointsRewardRate, "<this>");
                            String strW = pointsRewardRate.f98060a.W();
                            jo3.a aVarP = mo3.a.p(pointsRewardRate.f98061b);
                            Double d = pointsRewardRate.f98062c;
                            arrayList.add(new sfi.b(str, str2, str3, str4, new ofi.l(strW, d != null ? String.valueOf(d.doubleValue()) : null, aVarP)));
                        }
                        cVar.G(arrayList, "KEY_BOOSTED_PROPERTIES", kii.e.o(sfi.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: fag.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f133373b;

            {
                this.f133373b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f133373b.f133394b.get("KEY_BOOSTED_PROPERTIES");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "<unused var>");
                        List list = (List) p.a.j(sfi.b.class, KTypeProjection.INSTANCE, List.class, this.f133373b.f133395c, "KEY_BOOSTED_PROPERTIES");
                        if (list == null) {
                            return null;
                        }
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(ue8.c.Z((sfi.b) it9.next()));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: fag.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f133371b;

            {
                this.f133371b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<sfi.a> boostedProperties = this.f133371b.f133393a.getBoostedProperties();
                        f9g.h hVar = new f9g.h(new f7l.c(13), 16);
                        boostedProperties.getClass();
                        ufm.i iVar = new ufm.i(boostedProperties, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List properties = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(properties, "properties");
                        this.f133371b.f133394b.f("KEY_BOOSTED_PROPERTIES", properties);
                        break;
                    default:
                        List properties2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(properties2, "properties");
                        ue0.c cVar = this.f133371b.f133395c;
                        List<wfi.a> list = properties2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (wfi.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String str = aVar.f297148a;
                            String str2 = aVar.f297149b;
                            String str3 = aVar.f297150c;
                            String str4 = aVar.d;
                            PointsRewardRate pointsRewardRate = aVar.e;
                            Intrinsics.checkNotNullParameter(pointsRewardRate, "<this>");
                            String strW = pointsRewardRate.f98060a.W();
                            jo3.a aVarP = mo3.a.p(pointsRewardRate.f98061b);
                            Double d = pointsRewardRate.f98062c;
                            arrayList.add(new sfi.b(str, str2, str3, str4, new ofi.l(strW, d != null ? String.valueOf(d.doubleValue()) : null, aVarP)));
                        }
                        cVar.G(arrayList, "KEY_BOOSTED_PROPERTIES", kii.e.o(sfi.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
