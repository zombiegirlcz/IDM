package fag;

import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class y0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsService f133401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f133402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f133403c;
    public final w4l.f d;

    public y0(TravelHotelsService api2, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f133401a = api2;
        this.f133402b = storage;
        this.f133403c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: fag.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f133392b;

            {
                this.f133392b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        x0 parameters = (x0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        TravelHotelsService travelHotelsService = this.f133392b.f133401a;
                        ffi.a aVar = parameters.f133399a;
                        efm.d0<dag.g> sortingOptions = travelHotelsService.getSortingOptions(aVar != null ? aVar.name() : null);
                        m0 m0Var = new m0(new o0(11), 17);
                        sortingOptions.getClass();
                        ufm.i iVar = new ufm.i(sortingOptions, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        x0 parameters2 = (x0) obj2;
                        ggi.a sortingOptions2 = (ggi.a) obj3;
                        Intrinsics.checkNotNullParameter(parameters2, "parameters");
                        Intrinsics.checkNotNullParameter(sortingOptions2, "sortingOptions");
                        ne0.j jVar = this.f133392b.f133403c;
                        w0 w0Var = y0.Companion;
                        ffi.a aVar2 = parameters2.f133399a;
                        w0Var.getClass();
                        jVar.f(w0.a(aVar2), sortingOptions2);
                        break;
                    default:
                        x0 parameters3 = (x0) obj2;
                        ggi.a sortingOptions3 = (ggi.a) obj3;
                        Intrinsics.checkNotNullParameter(parameters3, "parameters");
                        Intrinsics.checkNotNullParameter(sortingOptions3, "sortingOptions");
                        ue0.c cVar = this.f133392b.f133402b;
                        w0 w0Var2 = y0.Companion;
                        ffi.a aVar3 = parameters3.f133399a;
                        w0Var2.getClass();
                        String strA = w0.a(aVar3);
                        Intrinsics.checkNotNullParameter(sortingOptions3, "<this>");
                        String str = sortingOptions3.f143689a;
                        ArrayList<TravelHotelsSortingOption> arrayList = sortingOptions3.f143690b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (TravelHotelsSortingOption travelHotelsSortingOption : arrayList) {
                            Intrinsics.checkNotNullParameter(travelHotelsSortingOption, "<this>");
                            arrayList2.add(new dag.f(travelHotelsSortingOption.f98141a, travelHotelsSortingOption.f98142b));
                        }
                        cVar.G(new dag.g(str, arrayList2), strA, wim.z.d(kotlin.jvm.internal.o0.b(dag.g.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: fag.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f133397b;

            {
                this.f133397b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                x0 parameters = (x0) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        ne0.j jVar = this.f133397b.f133403c;
                        w0 w0Var = y0.Companion;
                        ffi.a aVar = parameters.f133399a;
                        w0Var.getClass();
                        return (ggi.a) jVar.get(w0.a(aVar));
                    default:
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        ue0.c cVar = this.f133397b.f133402b;
                        w0 w0Var2 = y0.Companion;
                        ffi.a aVar2 = parameters.f133399a;
                        w0Var2.getClass();
                        dag.g gVar = (dag.g) j6.a.k(dag.g.class, cVar, w0.a(aVar2));
                        if (gVar != null) {
                            return uc0.b.x(gVar);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: fag.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f133392b;

            {
                this.f133392b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        x0 parameters = (x0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        TravelHotelsService travelHotelsService = this.f133392b.f133401a;
                        ffi.a aVar = parameters.f133399a;
                        efm.d0<dag.g> sortingOptions = travelHotelsService.getSortingOptions(aVar != null ? aVar.name() : null);
                        m0 m0Var = new m0(new o0(11), 17);
                        sortingOptions.getClass();
                        ufm.i iVar = new ufm.i(sortingOptions, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        x0 parameters2 = (x0) obj2;
                        ggi.a sortingOptions2 = (ggi.a) obj3;
                        Intrinsics.checkNotNullParameter(parameters2, "parameters");
                        Intrinsics.checkNotNullParameter(sortingOptions2, "sortingOptions");
                        ne0.j jVar = this.f133392b.f133403c;
                        w0 w0Var = y0.Companion;
                        ffi.a aVar2 = parameters2.f133399a;
                        w0Var.getClass();
                        jVar.f(w0.a(aVar2), sortingOptions2);
                        break;
                    default:
                        x0 parameters3 = (x0) obj2;
                        ggi.a sortingOptions3 = (ggi.a) obj3;
                        Intrinsics.checkNotNullParameter(parameters3, "parameters");
                        Intrinsics.checkNotNullParameter(sortingOptions3, "sortingOptions");
                        ue0.c cVar = this.f133392b.f133402b;
                        w0 w0Var2 = y0.Companion;
                        ffi.a aVar3 = parameters3.f133399a;
                        w0Var2.getClass();
                        String strA = w0.a(aVar3);
                        Intrinsics.checkNotNullParameter(sortingOptions3, "<this>");
                        String str = sortingOptions3.f143689a;
                        ArrayList<TravelHotelsSortingOption> arrayList = sortingOptions3.f143690b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (TravelHotelsSortingOption travelHotelsSortingOption : arrayList) {
                            Intrinsics.checkNotNullParameter(travelHotelsSortingOption, "<this>");
                            arrayList2.add(new dag.f(travelHotelsSortingOption.f98141a, travelHotelsSortingOption.f98142b));
                        }
                        cVar.G(new dag.g(str, arrayList2), strA, wim.z.d(kotlin.jvm.internal.o0.b(dag.g.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: fag.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f133397b;

            {
                this.f133397b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                x0 parameters = (x0) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        ne0.j jVar = this.f133397b.f133403c;
                        w0 w0Var = y0.Companion;
                        ffi.a aVar = parameters.f133399a;
                        w0Var.getClass();
                        return (ggi.a) jVar.get(w0.a(aVar));
                    default:
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        ue0.c cVar = this.f133397b.f133402b;
                        w0 w0Var2 = y0.Companion;
                        ffi.a aVar2 = parameters.f133399a;
                        w0Var2.getClass();
                        dag.g gVar = (dag.g) j6.a.k(dag.g.class, cVar, w0.a(aVar2));
                        if (gVar != null) {
                            return uc0.b.x(gVar);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: fag.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f133392b;

            {
                this.f133392b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        x0 parameters = (x0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        TravelHotelsService travelHotelsService = this.f133392b.f133401a;
                        ffi.a aVar = parameters.f133399a;
                        efm.d0<dag.g> sortingOptions = travelHotelsService.getSortingOptions(aVar != null ? aVar.name() : null);
                        m0 m0Var = new m0(new o0(11), 17);
                        sortingOptions.getClass();
                        ufm.i iVar = new ufm.i(sortingOptions, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        x0 parameters2 = (x0) obj2;
                        ggi.a sortingOptions2 = (ggi.a) obj3;
                        Intrinsics.checkNotNullParameter(parameters2, "parameters");
                        Intrinsics.checkNotNullParameter(sortingOptions2, "sortingOptions");
                        ne0.j jVar = this.f133392b.f133403c;
                        w0 w0Var = y0.Companion;
                        ffi.a aVar2 = parameters2.f133399a;
                        w0Var.getClass();
                        jVar.f(w0.a(aVar2), sortingOptions2);
                        break;
                    default:
                        x0 parameters3 = (x0) obj2;
                        ggi.a sortingOptions3 = (ggi.a) obj3;
                        Intrinsics.checkNotNullParameter(parameters3, "parameters");
                        Intrinsics.checkNotNullParameter(sortingOptions3, "sortingOptions");
                        ue0.c cVar = this.f133392b.f133402b;
                        w0 w0Var2 = y0.Companion;
                        ffi.a aVar3 = parameters3.f133399a;
                        w0Var2.getClass();
                        String strA = w0.a(aVar3);
                        Intrinsics.checkNotNullParameter(sortingOptions3, "<this>");
                        String str = sortingOptions3.f143689a;
                        ArrayList<TravelHotelsSortingOption> arrayList = sortingOptions3.f143690b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (TravelHotelsSortingOption travelHotelsSortingOption : arrayList) {
                            Intrinsics.checkNotNullParameter(travelHotelsSortingOption, "<this>");
                            arrayList2.add(new dag.f(travelHotelsSortingOption.f98141a, travelHotelsSortingOption.f98142b));
                        }
                        cVar.G(new dag.g(str, arrayList2), strA, wim.z.d(kotlin.jvm.internal.o0.b(dag.g.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
