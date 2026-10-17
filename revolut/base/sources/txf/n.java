package txf;

import com.revolut.feature.travel.common.impl.network.TravelService;
import efm.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import tx0.o1;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelService f275406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f275407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wxf.f f275408c;

    public n(TravelService travelService, ne0.d memoryCache, wxf.f favoriteDao) {
        Intrinsics.checkNotNullParameter(travelService, "travelService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(favoriteDao, "favoriteDao");
        this.f275406a = travelService;
        this.f275407b = memoryCache;
        this.f275408c = favoriteDao;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: txf.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f275403b;

            {
                this.f275403b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                int i3 = 10;
                n nVar = this.f275403b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<nxf.c>> favorites = nVar.f275406a.getFavorites();
                        o1 o1Var = new o1(new tx.f(i3), 24);
                        favorites.getClass();
                        ufm.i iVar = new ufm.i(favorites, o1Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        nVar.f275407b.f("TRAVEL_FAVORITE_CACHE_KEY", items);
                        break;
                    default:
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        wxf.f fVar = nVar.f275408c;
                        List<ixf.b> list = items2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ixf.b bVar : list) {
                            Object obj4 = mxf.a.f210256a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            arrayList.add(new oxf.c(bVar.f169564a, bVar.f169565b, bVar.f169566c, u1.g(bVar.d, mxf.a.f210256a)));
                        }
                        oxf.c[] cVarArr = (oxf.c[]) arrayList.toArray(new oxf.c[0]);
                        fVar.d((oxf.c[]) Arrays.copyOf(cVarArr, cVarArr.length));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: txf.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f275405b;

            {
                this.f275405b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                n nVar = this.f275405b;
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) nVar.f275407b.get("TRAVEL_FAVORITE_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List listB = nVar.f275408c.b();
                        if (listB.isEmpty()) {
                            return null;
                        }
                        List<oxf.c> list = listB;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (oxf.c cVar : list) {
                            Object obj3 = mxf.a.f210256a;
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            arrayList.add(new ixf.b(cVar.f230810a, cVar.f230811b, cVar.f230812c, (ixf.a) u1.u(cVar.d, mxf.a.f210256a)));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: txf.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f275403b;

            {
                this.f275403b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                int i3 = 10;
                n nVar = this.f275403b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<nxf.c>> favorites = nVar.f275406a.getFavorites();
                        o1 o1Var = new o1(new tx.f(i3), 24);
                        favorites.getClass();
                        ufm.i iVar = new ufm.i(favorites, o1Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        nVar.f275407b.f("TRAVEL_FAVORITE_CACHE_KEY", items);
                        break;
                    default:
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        wxf.f fVar = nVar.f275408c;
                        List<ixf.b> list = items2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ixf.b bVar : list) {
                            Object obj4 = mxf.a.f210256a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            arrayList.add(new oxf.c(bVar.f169564a, bVar.f169565b, bVar.f169566c, u1.g(bVar.d, mxf.a.f210256a)));
                        }
                        oxf.c[] cVarArr = (oxf.c[]) arrayList.toArray(new oxf.c[0]);
                        fVar.d((oxf.c[]) Arrays.copyOf(cVarArr, cVarArr.length));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: txf.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f275405b;

            {
                this.f275405b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                n nVar = this.f275405b;
                Unit it8 = (Unit) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) nVar.f275407b.get("TRAVEL_FAVORITE_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List listB = nVar.f275408c.b();
                        if (listB.isEmpty()) {
                            return null;
                        }
                        List<oxf.c> list = listB;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (oxf.c cVar : list) {
                            Object obj3 = mxf.a.f210256a;
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            arrayList.add(new ixf.b(cVar.f230810a, cVar.f230811b, cVar.f230812c, (ixf.a) u1.u(cVar.d, mxf.a.f210256a)));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: txf.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f275403b;

            {
                this.f275403b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                int i32 = 10;
                n nVar = this.f275403b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<nxf.c>> favorites = nVar.f275406a.getFavorites();
                        o1 o1Var = new o1(new tx.f(i32), 24);
                        favorites.getClass();
                        ufm.i iVar = new ufm.i(favorites, o1Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        nVar.f275407b.f("TRAVEL_FAVORITE_CACHE_KEY", items);
                        break;
                    default:
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        wxf.f fVar = nVar.f275408c;
                        List<ixf.b> list = items2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ixf.b bVar : list) {
                            Object obj4 = mxf.a.f210256a;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            arrayList.add(new oxf.c(bVar.f169564a, bVar.f169565b, bVar.f169566c, u1.g(bVar.d, mxf.a.f210256a)));
                        }
                        oxf.c[] cVarArr = (oxf.c[]) arrayList.toArray(new oxf.c[0]);
                        fVar.d((oxf.c[]) Arrays.copyOf(cVarArr, cVarArr.length));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
