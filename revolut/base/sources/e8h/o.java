package e8h;

import com.revolut.feature.wealth.impl.data.network.mosttraded.MostTradedAssetsService;
import com.revolut.feature.wealth.impl.data.network.mosttraded.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MostTradedAssetsService f123716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l8h.g f123717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7h.a f123718c;
    public final w4l.f d;

    public o(MostTradedAssetsService service, l8h.g storage, b7h.a cache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f123716a = service;
        this.f123717b = storage;
        this.f123718c = cache;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: e8h.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f123707b;

            {
                this.f123707b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                a.EnumC0584a enumC0584a;
                a.d dVar;
                k params = (k) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        o oVar = this.f123707b;
                        MostTradedAssetsService mostTradedAssetsService = oVar.f123716a;
                        xzg.z zVar = params.f123701a;
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        boolean z = zVar instanceof xzg.y;
                        xzg.w wVar = xzg.w.f310036a;
                        if (z) {
                            enumC0584a = a.EnumC0584a.SECURITY;
                        } else {
                            if (!zVar.equals(wVar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            enumC0584a = a.EnumC0584a.CRYPTO;
                        }
                        xzg.b0 b0Var = params.f123702b;
                        Intrinsics.checkNotNullParameter(b0Var, "<this>");
                        int i2 = com.revolut.feature.wealth.impl.data.network.mosttraded.b.f95496b[b0Var.ordinal()];
                        if (i2 == 1) {
                            dVar = a.d.ONE_DAY;
                        } else if (i2 == 2) {
                            dVar = a.d.ONE_MONTH;
                        } else if (i2 == 3) {
                            dVar = a.d.ONE_WEEK;
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar = a.d.ONE_YEAR;
                        }
                        a.c cVar = null;
                        if (!zVar.equals(wVar)) {
                            if (!z) {
                                throw new NoWhenBranchMatchedException();
                            }
                            xzg.x xVar = ((xzg.y) zVar).f310037a;
                            if (xVar != null) {
                                Intrinsics.checkNotNullParameter(xVar, "<this>");
                                if (com.revolut.feature.wealth.impl.data.network.mosttraded.b.f95497c[xVar.ordinal()] != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar = a.c.CFD;
                            }
                        }
                        efm.d0<com.revolut.feature.wealth.impl.data.network.mosttraded.a> mostTraded = mostTradedAssetsService.getMostTraded(enumC0584a, dVar, cVar);
                        c cVar2 = new c(7, new e1.b(params, oVar, 25));
                        mostTraded.getClass();
                        ufm.i iVar = new ufm.i(mostTraded, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        b7h.a aVar = this.f123707b.f123718c;
                        String key = gj7.b.H(params);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (xzg.c0) aVar.f13040a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        l8h.b bVarA = this.f123707b.f123717b.a(l8h.e.e(params));
                        if (bVarA != null) {
                            return l8h.e.b(bVarA);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: e8h.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f123707b;

            {
                this.f123707b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                a.EnumC0584a enumC0584a;
                a.d dVar;
                k params = (k) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        o oVar = this.f123707b;
                        MostTradedAssetsService mostTradedAssetsService = oVar.f123716a;
                        xzg.z zVar = params.f123701a;
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        boolean z = zVar instanceof xzg.y;
                        xzg.w wVar = xzg.w.f310036a;
                        if (z) {
                            enumC0584a = a.EnumC0584a.SECURITY;
                        } else {
                            if (!zVar.equals(wVar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            enumC0584a = a.EnumC0584a.CRYPTO;
                        }
                        xzg.b0 b0Var = params.f123702b;
                        Intrinsics.checkNotNullParameter(b0Var, "<this>");
                        int i22 = com.revolut.feature.wealth.impl.data.network.mosttraded.b.f95496b[b0Var.ordinal()];
                        if (i22 == 1) {
                            dVar = a.d.ONE_DAY;
                        } else if (i22 == 2) {
                            dVar = a.d.ONE_MONTH;
                        } else if (i22 == 3) {
                            dVar = a.d.ONE_WEEK;
                        } else {
                            if (i22 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar = a.d.ONE_YEAR;
                        }
                        a.c cVar = null;
                        if (!zVar.equals(wVar)) {
                            if (!z) {
                                throw new NoWhenBranchMatchedException();
                            }
                            xzg.x xVar = ((xzg.y) zVar).f310037a;
                            if (xVar != null) {
                                Intrinsics.checkNotNullParameter(xVar, "<this>");
                                if (com.revolut.feature.wealth.impl.data.network.mosttraded.b.f95497c[xVar.ordinal()] != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar = a.c.CFD;
                            }
                        }
                        efm.d0<com.revolut.feature.wealth.impl.data.network.mosttraded.a> mostTraded = mostTradedAssetsService.getMostTraded(enumC0584a, dVar, cVar);
                        c cVar2 = new c(7, new e1.b(params, oVar, 25));
                        mostTraded.getClass();
                        ufm.i iVar = new ufm.i(mostTraded, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        b7h.a aVar = this.f123707b.f123718c;
                        String key = gj7.b.H(params);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (xzg.c0) aVar.f13040a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        l8h.b bVarA = this.f123707b.f123717b.a(l8h.e.e(params));
                        if (bVarA != null) {
                            return l8h.e.b(bVarA);
                        }
                        return null;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: e8h.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f123711b;

            {
                this.f123711b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l8h.c cVar;
                k params = (k) obj2;
                xzg.c0 value = (xzg.c0) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        if (o.a(params, value)) {
                            b7h.a aVar = this.f123711b.f123718c;
                            String key = gj7.b.H(params);
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            aVar.f13040a.f(key, value);
                        }
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        if (o.a(params, value)) {
                            l8h.g gVar = this.f123711b.f123717b;
                            String key2 = l8h.e.e(params);
                            xzg.z assetType = params.f123701a;
                            Intrinsics.checkNotNullParameter(value, "<this>");
                            Intrinsics.checkNotNullParameter(assetType, "assetType");
                            l8h.a aVarC = l8h.e.c(assetType);
                            xzg.b0 b0Var = value.f309973a;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            int i5 = l8h.d.d[b0Var.ordinal()];
                            if (i5 == 1) {
                                cVar = l8h.c.ONE_DAY;
                            } else if (i5 == 2) {
                                cVar = l8h.c.ONE_MONTH;
                            } else if (i5 == 3) {
                                cVar = l8h.c.ONE_WEEK;
                            } else {
                                if (i5 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar = l8h.c.ONE_YEAR;
                            }
                            l8h.c cVar2 = cVar;
                            List list = value.f309974b;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(l8h.e.d((xzg.a0) it8.next()));
                            }
                            List list2 = value.f309975c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                arrayList2.add(l8h.e.d((xzg.a0) it9.next()));
                            }
                            List list3 = value.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it10 = list3.iterator();
                            while (it10.hasNext()) {
                                arrayList3.add(l8h.e.d((xzg.a0) it10.next()));
                            }
                            l8h.b value2 = new l8h.b(aVarC, cVar2, arrayList, arrayList2, arrayList3);
                            Intrinsics.checkNotNullParameter(key2, "key");
                            Intrinsics.checkNotNullParameter(value2, "value");
                            gVar.f192994a.G(value2, a0.d.r(l8h.g.f192993c, key2), wim.z.d(kotlin.jvm.internal.o0.b(l8h.b.class)));
                        }
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: e8h.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f123707b;

            {
                this.f123707b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                a.EnumC0584a enumC0584a;
                a.d dVar;
                k params = (k) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        o oVar = this.f123707b;
                        MostTradedAssetsService mostTradedAssetsService = oVar.f123716a;
                        xzg.z zVar = params.f123701a;
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        boolean z = zVar instanceof xzg.y;
                        xzg.w wVar = xzg.w.f310036a;
                        if (z) {
                            enumC0584a = a.EnumC0584a.SECURITY;
                        } else {
                            if (!zVar.equals(wVar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            enumC0584a = a.EnumC0584a.CRYPTO;
                        }
                        xzg.b0 b0Var = params.f123702b;
                        Intrinsics.checkNotNullParameter(b0Var, "<this>");
                        int i22 = com.revolut.feature.wealth.impl.data.network.mosttraded.b.f95496b[b0Var.ordinal()];
                        if (i22 == 1) {
                            dVar = a.d.ONE_DAY;
                        } else if (i22 == 2) {
                            dVar = a.d.ONE_MONTH;
                        } else if (i22 == 3) {
                            dVar = a.d.ONE_WEEK;
                        } else {
                            if (i22 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar = a.d.ONE_YEAR;
                        }
                        a.c cVar = null;
                        if (!zVar.equals(wVar)) {
                            if (!z) {
                                throw new NoWhenBranchMatchedException();
                            }
                            xzg.x xVar = ((xzg.y) zVar).f310037a;
                            if (xVar != null) {
                                Intrinsics.checkNotNullParameter(xVar, "<this>");
                                if (com.revolut.feature.wealth.impl.data.network.mosttraded.b.f95497c[xVar.ordinal()] != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar = a.c.CFD;
                            }
                        }
                        efm.d0<com.revolut.feature.wealth.impl.data.network.mosttraded.a> mostTraded = mostTradedAssetsService.getMostTraded(enumC0584a, dVar, cVar);
                        c cVar2 = new c(7, new e1.b(params, oVar, 25));
                        mostTraded.getClass();
                        ufm.i iVar = new ufm.i(mostTraded, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        b7h.a aVar = this.f123707b.f123718c;
                        String key = gj7.b.H(params);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (xzg.c0) aVar.f13040a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        l8h.b bVarA = this.f123707b.f123717b.a(l8h.e.e(params));
                        if (bVarA != null) {
                            return l8h.e.b(bVarA);
                        }
                        return null;
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: e8h.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f123711b;

            {
                this.f123711b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l8h.c cVar;
                k params = (k) obj2;
                xzg.c0 value = (xzg.c0) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        if (o.a(params, value)) {
                            b7h.a aVar = this.f123711b.f123718c;
                            String key = gj7.b.H(params);
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            aVar.f13040a.f(key, value);
                        }
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        if (o.a(params, value)) {
                            l8h.g gVar = this.f123711b.f123717b;
                            String key2 = l8h.e.e(params);
                            xzg.z assetType = params.f123701a;
                            Intrinsics.checkNotNullParameter(value, "<this>");
                            Intrinsics.checkNotNullParameter(assetType, "assetType");
                            l8h.a aVarC = l8h.e.c(assetType);
                            xzg.b0 b0Var = value.f309973a;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            int i59 = l8h.d.d[b0Var.ordinal()];
                            if (i59 == 1) {
                                cVar = l8h.c.ONE_DAY;
                            } else if (i59 == 2) {
                                cVar = l8h.c.ONE_MONTH;
                            } else if (i59 == 3) {
                                cVar = l8h.c.ONE_WEEK;
                            } else {
                                if (i59 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar = l8h.c.ONE_YEAR;
                            }
                            l8h.c cVar2 = cVar;
                            List list = value.f309974b;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(l8h.e.d((xzg.a0) it8.next()));
                            }
                            List list2 = value.f309975c;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                arrayList2.add(l8h.e.d((xzg.a0) it9.next()));
                            }
                            List list3 = value.d;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it10 = list3.iterator();
                            while (it10.hasNext()) {
                                arrayList3.add(l8h.e.d((xzg.a0) it10.next()));
                            }
                            l8h.b value2 = new l8h.b(aVarC, cVar2, arrayList, arrayList2, arrayList3);
                            Intrinsics.checkNotNullParameter(key2, "key");
                            Intrinsics.checkNotNullParameter(value2, "value");
                            gVar.f192994a.G(value2, a0.d.r(l8h.g.f192993c, key2), wim.z.d(kotlin.jvm.internal.o0.b(l8h.b.class)));
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static boolean a(k kVar, xzg.c0 c0Var) {
        int i = n.f123712a[kVar.f123703c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (c0Var.f309974b.isEmpty()) {
            return false;
        }
        return true;
    }
}
