package e8h;

import com.revolut.feature.wealth.impl.data.network.topmovers.TopMoversService;
import com.revolut.feature.wealth.impl.data.network.topmovers.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o8h.b;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopMoversService f123694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8h.g f123695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d7h.a f123696c;
    public final w4l.f d;

    public i0(TopMoversService service, o8h.g storage, d7h.a cache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f123694a = service;
        this.f123695b = storage;
        this.f123696c = cache;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: e8h.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f123687b;

            {
                this.f123687b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [zhm.f0] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v1, types: [zhm.f0] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                a.EnumC0585a enumC0585a;
                a.c cVar;
                xzg.l0 l0Var;
                ?? arrayList;
                ?? arrayList2;
                int i2 = i;
                int i3 = 10;
                i0 i0Var = this.f123687b;
                e0 params = (e0) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        TopMoversService topMoversService = i0Var.f123694a;
                        xzg.j0 j0Var = params.f123682a;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        int i5 = com.revolut.feature.wealth.impl.data.network.topmovers.b.f95507c[j0Var.ordinal()];
                        if (i5 == 1) {
                            enumC0585a = a.EnumC0585a.STOCK;
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            enumC0585a = a.EnumC0585a.CRYPTO;
                        }
                        xzg.l0 l0Var2 = params.f123683b;
                        Intrinsics.checkNotNullParameter(l0Var2, "<this>");
                        int i6 = com.revolut.feature.wealth.impl.data.network.topmovers.b.d[l0Var2.ordinal()];
                        if (i6 == 1) {
                            cVar = a.c.ONE_DAY;
                        } else if (i6 == 2) {
                            cVar = a.c.ONE_MONTH;
                        } else if (i6 == 3) {
                            cVar = a.c.ONE_WEEK;
                        } else if (i6 == 4) {
                            cVar = a.c.ONE_YEAR;
                        } else {
                            if (i6 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = a.c.FIVE_YEARS;
                        }
                        efm.d0<com.revolut.feature.wealth.impl.data.network.topmovers.a> topMovers = topMoversService.getTopMovers(enumC0585a, cVar);
                        h0 h0Var = h0.f;
                        dug.e eVar = new dug.e(i3);
                        topMovers.getClass();
                        ufm.i iVar = new ufm.i(topMovers, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d7h.a aVar = i0Var.f123696c;
                        String key = ngm.n.v(params);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (xzg.m0) aVar.f111966a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        o8h.g gVar = i0Var.f123695b;
                        String key2 = o8h.e.d(params);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        o8h.b bVar = (o8h.b) yh5.b.u(gVar.f223031a, j6.a.q("TopMovers", key2), o8h.g.f223029b);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        int i21 = o8h.d.f223026a[bVar.getTimeSpan().ordinal()];
                        if (i21 == 1) {
                            l0Var = xzg.l0.ONE_DAY;
                        } else if (i21 == 2) {
                            l0Var = xzg.l0.ONE_WEEK;
                        } else if (i21 == 3) {
                            l0Var = xzg.l0.ONE_MONTH;
                        } else if (i21 == 4) {
                            l0Var = xzg.l0.ONE_YEAR;
                        } else {
                            if (i21 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            l0Var = xzg.l0.FIVE_YEARS;
                        }
                        List topGainers = bVar.getTopGainers();
                        if (topGainers != null) {
                            List list = topGainers;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(o8h.e.a((b.a) it8.next()));
                            }
                        } else {
                            arrayList = zhm.f0.f322471a;
                        }
                        List topLosers = bVar.getTopLosers();
                        if (topLosers != null) {
                            List list2 = topLosers;
                            arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                arrayList2.add(o8h.e.a((b.a) it9.next()));
                            }
                        } else {
                            arrayList2 = zhm.f0.f322471a;
                        }
                        return new xzg.m0(l0Var, arrayList, arrayList2);
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: e8h.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f123687b;

            {
                this.f123687b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [zhm.f0] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v1, types: [zhm.f0] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                a.EnumC0585a enumC0585a;
                a.c cVar;
                xzg.l0 l0Var;
                ?? arrayList;
                ?? arrayList2;
                int i22 = i2;
                int i3 = 10;
                i0 i0Var = this.f123687b;
                e0 params = (e0) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        TopMoversService topMoversService = i0Var.f123694a;
                        xzg.j0 j0Var = params.f123682a;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        int i5 = com.revolut.feature.wealth.impl.data.network.topmovers.b.f95507c[j0Var.ordinal()];
                        if (i5 == 1) {
                            enumC0585a = a.EnumC0585a.STOCK;
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            enumC0585a = a.EnumC0585a.CRYPTO;
                        }
                        xzg.l0 l0Var2 = params.f123683b;
                        Intrinsics.checkNotNullParameter(l0Var2, "<this>");
                        int i6 = com.revolut.feature.wealth.impl.data.network.topmovers.b.d[l0Var2.ordinal()];
                        if (i6 == 1) {
                            cVar = a.c.ONE_DAY;
                        } else if (i6 == 2) {
                            cVar = a.c.ONE_MONTH;
                        } else if (i6 == 3) {
                            cVar = a.c.ONE_WEEK;
                        } else if (i6 == 4) {
                            cVar = a.c.ONE_YEAR;
                        } else {
                            if (i6 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = a.c.FIVE_YEARS;
                        }
                        efm.d0<com.revolut.feature.wealth.impl.data.network.topmovers.a> topMovers = topMoversService.getTopMovers(enumC0585a, cVar);
                        h0 h0Var = h0.f;
                        dug.e eVar = new dug.e(i3);
                        topMovers.getClass();
                        ufm.i iVar = new ufm.i(topMovers, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d7h.a aVar = i0Var.f123696c;
                        String key = ngm.n.v(params);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (xzg.m0) aVar.f111966a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        o8h.g gVar = i0Var.f123695b;
                        String key2 = o8h.e.d(params);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        o8h.b bVar = (o8h.b) yh5.b.u(gVar.f223031a, j6.a.q("TopMovers", key2), o8h.g.f223029b);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        int i21 = o8h.d.f223026a[bVar.getTimeSpan().ordinal()];
                        if (i21 == 1) {
                            l0Var = xzg.l0.ONE_DAY;
                        } else if (i21 == 2) {
                            l0Var = xzg.l0.ONE_WEEK;
                        } else if (i21 == 3) {
                            l0Var = xzg.l0.ONE_MONTH;
                        } else if (i21 == 4) {
                            l0Var = xzg.l0.ONE_YEAR;
                        } else {
                            if (i21 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            l0Var = xzg.l0.FIVE_YEARS;
                        }
                        List topGainers = bVar.getTopGainers();
                        if (topGainers != null) {
                            List list = topGainers;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(o8h.e.a((b.a) it8.next()));
                            }
                        } else {
                            arrayList = zhm.f0.f322471a;
                        }
                        List topLosers = bVar.getTopLosers();
                        if (topLosers != null) {
                            List list2 = topLosers;
                            arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                arrayList2.add(o8h.e.a((b.a) it9.next()));
                            }
                        } else {
                            arrayList2 = zhm.f0.f322471a;
                        }
                        return new xzg.m0(l0Var, arrayList, arrayList2);
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: e8h.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f123691b;

            {
                this.f123691b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                o8h.c cVar;
                e0 params = (e0) obj2;
                xzg.m0 value = (xzg.m0) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        d7h.a aVar = this.f123691b.f123696c;
                        String key = ngm.n.v(params);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value, "value");
                        aVar.f111966a.f(key, value);
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        o8h.g gVar = this.f123691b.f123695b;
                        String key2 = o8h.e.d(params);
                        xzg.j0 assetType = params.f123682a;
                        Intrinsics.checkNotNullParameter(value, "<this>");
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        o8h.a aVarB = o8h.e.b(assetType);
                        xzg.l0 l0Var = value.f310012a;
                        Intrinsics.checkNotNullParameter(l0Var, "<this>");
                        int i5 = o8h.d.d[l0Var.ordinal()];
                        if (i5 == 1) {
                            cVar = o8h.c.ONE_DAY;
                        } else if (i5 == 2) {
                            cVar = o8h.c.ONE_MONTH;
                        } else if (i5 == 3) {
                            cVar = o8h.c.ONE_WEEK;
                        } else if (i5 == 4) {
                            cVar = o8h.c.ONE_YEAR;
                        } else {
                            if (i5 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = o8h.c.FIVE_YEARS;
                        }
                        List list = value.f310013b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(o8h.e.c((xzg.k0) it8.next()));
                        }
                        List list2 = value.f310014c;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(o8h.e.c((xzg.k0) it9.next()));
                        }
                        o8h.b value2 = new o8h.b(aVarB, cVar, arrayList, arrayList2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        gVar.f223031a.G(value2, j6.a.q("TopMovers", key2), wim.z.d(kotlin.jvm.internal.o0.b(o8h.b.class)));
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: e8h.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f123687b;

            {
                this.f123687b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [zhm.f0] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v1, types: [zhm.f0] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                a.EnumC0585a enumC0585a;
                a.c cVar;
                xzg.l0 l0Var;
                ?? arrayList;
                ?? arrayList2;
                int i22 = i5;
                int i32 = 10;
                i0 i0Var = this.f123687b;
                e0 params = (e0) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        TopMoversService topMoversService = i0Var.f123694a;
                        xzg.j0 j0Var = params.f123682a;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        int i59 = com.revolut.feature.wealth.impl.data.network.topmovers.b.f95507c[j0Var.ordinal()];
                        if (i59 == 1) {
                            enumC0585a = a.EnumC0585a.STOCK;
                        } else {
                            if (i59 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            enumC0585a = a.EnumC0585a.CRYPTO;
                        }
                        xzg.l0 l0Var2 = params.f123683b;
                        Intrinsics.checkNotNullParameter(l0Var2, "<this>");
                        int i6 = com.revolut.feature.wealth.impl.data.network.topmovers.b.d[l0Var2.ordinal()];
                        if (i6 == 1) {
                            cVar = a.c.ONE_DAY;
                        } else if (i6 == 2) {
                            cVar = a.c.ONE_MONTH;
                        } else if (i6 == 3) {
                            cVar = a.c.ONE_WEEK;
                        } else if (i6 == 4) {
                            cVar = a.c.ONE_YEAR;
                        } else {
                            if (i6 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = a.c.FIVE_YEARS;
                        }
                        efm.d0<com.revolut.feature.wealth.impl.data.network.topmovers.a> topMovers = topMoversService.getTopMovers(enumC0585a, cVar);
                        h0 h0Var = h0.f;
                        dug.e eVar = new dug.e(i32);
                        topMovers.getClass();
                        ufm.i iVar = new ufm.i(topMovers, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d7h.a aVar = i0Var.f123696c;
                        String key = ngm.n.v(params);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (xzg.m0) aVar.f111966a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        o8h.g gVar = i0Var.f123695b;
                        String key2 = o8h.e.d(params);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        o8h.b bVar = (o8h.b) yh5.b.u(gVar.f223031a, j6.a.q("TopMovers", key2), o8h.g.f223029b);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        int i21 = o8h.d.f223026a[bVar.getTimeSpan().ordinal()];
                        if (i21 == 1) {
                            l0Var = xzg.l0.ONE_DAY;
                        } else if (i21 == 2) {
                            l0Var = xzg.l0.ONE_WEEK;
                        } else if (i21 == 3) {
                            l0Var = xzg.l0.ONE_MONTH;
                        } else if (i21 == 4) {
                            l0Var = xzg.l0.ONE_YEAR;
                        } else {
                            if (i21 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            l0Var = xzg.l0.FIVE_YEARS;
                        }
                        List topGainers = bVar.getTopGainers();
                        if (topGainers != null) {
                            List list = topGainers;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(o8h.e.a((b.a) it8.next()));
                            }
                        } else {
                            arrayList = zhm.f0.f322471a;
                        }
                        List topLosers = bVar.getTopLosers();
                        if (topLosers != null) {
                            List list2 = topLosers;
                            arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                arrayList2.add(o8h.e.a((b.a) it9.next()));
                            }
                        } else {
                            arrayList2 = zhm.f0.f322471a;
                        }
                        return new xzg.m0(l0Var, arrayList, arrayList2);
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: e8h.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f123691b;

            {
                this.f123691b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                o8h.c cVar;
                e0 params = (e0) obj2;
                xzg.m0 value = (xzg.m0) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        d7h.a aVar = this.f123691b.f123696c;
                        String key = ngm.n.v(params);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value, "value");
                        aVar.f111966a.f(key, value);
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        o8h.g gVar = this.f123691b.f123695b;
                        String key2 = o8h.e.d(params);
                        xzg.j0 assetType = params.f123682a;
                        Intrinsics.checkNotNullParameter(value, "<this>");
                        Intrinsics.checkNotNullParameter(assetType, "assetType");
                        o8h.a aVarB = o8h.e.b(assetType);
                        xzg.l0 l0Var = value.f310012a;
                        Intrinsics.checkNotNullParameter(l0Var, "<this>");
                        int i59 = o8h.d.d[l0Var.ordinal()];
                        if (i59 == 1) {
                            cVar = o8h.c.ONE_DAY;
                        } else if (i59 == 2) {
                            cVar = o8h.c.ONE_MONTH;
                        } else if (i59 == 3) {
                            cVar = o8h.c.ONE_WEEK;
                        } else if (i59 == 4) {
                            cVar = o8h.c.ONE_YEAR;
                        } else {
                            if (i59 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = o8h.c.FIVE_YEARS;
                        }
                        List list = value.f310013b;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(o8h.e.c((xzg.k0) it8.next()));
                        }
                        List list2 = value.f310014c;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(o8h.e.c((xzg.k0) it9.next()));
                        }
                        o8h.b value2 = new o8h.b(aVarB, cVar, arrayList, arrayList2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        gVar.f223031a.G(value2, j6.a.q("TopMovers", key2), wim.z.d(kotlin.jvm.internal.o0.b(o8h.b.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
