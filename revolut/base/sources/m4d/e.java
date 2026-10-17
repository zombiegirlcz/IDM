package m4d;

import android.content.Context;
import com.revolut.feature.cash_topup.impl.data.service.CashTopUpBarcodeService;
import com.revolut.feature.cash_topup.impl.data.service.CashTopUpService;
import com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase;
import com.revolut.feature.separate_favourites.item_data.impl.watchlist.network.WatchlistService;
import com.revolut.feature.wealth.impl.data.network.mostowned.MostOwnedAssetsService;
import com.revolut.feature.wealth.impl.data.network.portfolio_metrics.PortfolioMetricsService;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.RegionSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.SectorSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.TopHoldingSubclassAllocation;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import efm.d0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3c.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import l5a.u;
import l9f.a0;
import mqc.p;
import mtj.k;
import mx5.g;
import mz3.r;
import n1.y;
import n4d.n;
import org.bouncycastle.asn1.BERTags;
import org.joda.time.DateTime;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sri.m;
import sri.o;
import te0.w;
import vc.s;
import wim.z;
import x7h.a;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements e4m.e {
    public static x4l.c A(m7h.a aVar, n7h.b dodProvider) {
        Intrinsics.checkNotNullParameter(dodProvider, "dodProvider");
        Continuation continuation = null;
        return new x4l.c(new k(dodProvider, continuation, 2), new y(dodProvider, 29), new r(dodProvider, 24), new g(dodProvider, continuation, 24), new lp6.g(dodProvider, continuation, 18));
    }

    public static x4l.c B(m7h.a aVar, n7h.e dodProvider) {
        Intrinsics.checkNotNullParameter(dodProvider, "dodProvider");
        return new x4l.c(new k(dodProvider, null, 3), new n7h.c(dodProvider, 0), new r(dodProvider, 25), new p(2, 3, null), new l(3, 24, null));
    }

    public static obk.a C(obk.b bVar) {
        obk.a aVar = (obk.a) bVar.b();
        s.k(aVar);
        return aVar;
    }

    public static l9f.k D(a0 a0Var) {
        l9f.k kVar = (l9f.k) a0Var.b();
        s.k(kVar);
        return kVar;
    }

    public static a7d.a a(a31.a aVar) {
        return new a7d.a(aVar, 28);
    }

    public static h7e.a b(m6e.a dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return new h7e.a();
    }

    public static m60.b c(wj0.a idempotencyKeyHolder, l80.e dateProvider) {
        mf9.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        return new m60.b(idempotencyKeyHolder, dateProvider, "BILL_COPY_IDEMPOTENCY_KEY");
    }

    public static m60.b d(wj0.a idempotencyKeyHolder, l80.e dateProvider) {
        mf9.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        return new m60.b(idempotencyKeyHolder, dateProvider, "BILL_PAYMENT_IDEMPOTENCY_KEY");
    }

    public static xe0.e e(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        m53.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "card_personalisation", mapper, 0, null, 56);
    }

    public static j7e.d f(m6e.a dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        g7e.a aVar = (g7e.a) dependency;
        return new j7e.d(aVar.f141184c, aVar.f, aVar.f141192q, aVar.f141193r, aVar.f141194s);
    }

    public static k7e.f g(m6e.a dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        g7e.a aVar = (g7e.a) dependency;
        return new k7e.f(aVar.d, aVar.f141184c, aVar.e, aVar.f141186h, aVar.f141183b, aVar.f141191p);
    }

    public static w4l.f h(m7h.a aVar, final l7h.e mostOwnedDodProvider) {
        Intrinsics.checkNotNullParameter(mostOwnedDodProvider, "mostOwnedDodProvider");
        final int i = 0;
        uj0.b bVarK0 = w.k0(mostOwnedDodProvider.d, new Function1() { // from class: l7h.a
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
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                int i2 = i;
                ArrayList arrayList = null;
                xzg.s sVar = null;
                e eVar = mostOwnedDodProvider;
                List params = (List) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        MostOwnedAssetsService mostOwnedAssetsService = eVar.f192641a;
                        Iterator it8 = params.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (next instanceof xzg.b) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        xzg.b bVar = (xzg.b) next;
                        if (bVar != null) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            List list = bVar.f309972a;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it9 = list.iterator();
                            while (it9.hasNext()) {
                                arrayList.add(((xzg.a) it9.next()).name());
                            }
                        }
                        d0<List<v7h.a>> mostOwned = mostOwnedAssetsService.getMostOwned(arrayList);
                        d dVar = d.f;
                        o0 o0Var = new o0(2);
                        mostOwned.getClass();
                        ufm.i iVar = new ufm.i(mostOwned, o0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        b7h.a aVar2 = eVar.f192643c;
                        String key = "MOST_OWNED_MEMORY_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (xzg.s) aVar2.f13040a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        k8h.f fVar = eVar.f192642b;
                        String key2 = "MOST_OWNED_STORAGE_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(key2, "key");
                        k8h.b bVar2 = (k8h.b) yh5.b.u(fVar.f182164a, a0.d.r(k8h.f.f182163c, key2), k8h.f.f182162b);
                        if (bVar2 != null) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            List commodities = bVar2.getCommodities();
                            List listA = commodities != null ? k8h.d.a(commodities) : f0.f322471a;
                            List allAssets = bVar2.getAllAssets();
                            List listA2 = allAssets != null ? k8h.d.a(allAssets) : f0.f322471a;
                            List stocks = bVar2.getStocks();
                            List listA3 = stocks != null ? k8h.d.a(stocks) : f0.f322471a;
                            List crypto = bVar2.getCrypto();
                            sVar = new xzg.s(listA, listA2, listA3, crypto != null ? k8h.d.a(crypto) : f0.f322471a);
                        }
                        return sVar;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1() { // from class: l7h.a
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
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                int i22 = i2;
                ArrayList arrayList = null;
                xzg.s sVar = null;
                e eVar = mostOwnedDodProvider;
                List params = (List) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        MostOwnedAssetsService mostOwnedAssetsService = eVar.f192641a;
                        Iterator it8 = params.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (next instanceof xzg.b) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        xzg.b bVar = (xzg.b) next;
                        if (bVar != null) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            List list = bVar.f309972a;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it9 = list.iterator();
                            while (it9.hasNext()) {
                                arrayList.add(((xzg.a) it9.next()).name());
                            }
                        }
                        d0<List<v7h.a>> mostOwned = mostOwnedAssetsService.getMostOwned(arrayList);
                        d dVar = d.f;
                        o0 o0Var = new o0(2);
                        mostOwned.getClass();
                        ufm.i iVar = new ufm.i(mostOwned, o0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        b7h.a aVar2 = eVar.f192643c;
                        String key = "MOST_OWNED_MEMORY_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (xzg.s) aVar2.f13040a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        k8h.f fVar = eVar.f192642b;
                        String key2 = "MOST_OWNED_STORAGE_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(key2, "key");
                        k8h.b bVar2 = (k8h.b) yh5.b.u(fVar.f182164a, a0.d.r(k8h.f.f182163c, key2), k8h.f.f182162b);
                        if (bVar2 != null) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            List commodities = bVar2.getCommodities();
                            List listA = commodities != null ? k8h.d.a(commodities) : f0.f322471a;
                            List allAssets = bVar2.getAllAssets();
                            List listA2 = allAssets != null ? k8h.d.a(allAssets) : f0.f322471a;
                            List stocks = bVar2.getStocks();
                            List listA3 = stocks != null ? k8h.d.a(stocks) : f0.f322471a;
                            List crypto = bVar2.getCrypto();
                            sVar = new xzg.s(listA, listA2, listA3, crypto != null ? k8h.d.a(crypto) : f0.f322471a);
                        }
                        return sVar;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2() { // from class: l7h.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List params = (List) obj2;
                xzg.s value = (xzg.s) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        b7h.a aVar2 = mostOwnedDodProvider.f192643c;
                        String key = "MOST_OWNED_MEMORY_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value, "value");
                        aVar2.f13040a.f(key, value);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        k8h.f fVar = mostOwnedDodProvider.f192642b;
                        String key2 = "MOST_OWNED_STORAGE_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(value, "<this>");
                        k8h.b value2 = new k8h.b(k8h.d.b(value.f310027a), k8h.d.b(value.f310028b), k8h.d.b(value.f310029c), k8h.d.b(value.d));
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        fVar.f182164a.G(value2, a0.d.r(k8h.f.f182163c, key2), z.d(kotlin.jvm.internal.o0.b(k8h.b.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1() { // from class: l7h.a
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
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                int i22 = i5;
                ArrayList arrayList = null;
                xzg.s sVar = null;
                e eVar = mostOwnedDodProvider;
                List params = (List) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        MostOwnedAssetsService mostOwnedAssetsService = eVar.f192641a;
                        Iterator it8 = params.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (next instanceof xzg.b) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        xzg.b bVar = (xzg.b) next;
                        if (bVar != null) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            List list = bVar.f309972a;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it9 = list.iterator();
                            while (it9.hasNext()) {
                                arrayList.add(((xzg.a) it9.next()).name());
                            }
                        }
                        d0<List<v7h.a>> mostOwned = mostOwnedAssetsService.getMostOwned(arrayList);
                        d dVar = d.f;
                        o0 o0Var = new o0(2);
                        mostOwned.getClass();
                        ufm.i iVar = new ufm.i(mostOwned, o0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        b7h.a aVar2 = eVar.f192643c;
                        String key = "MOST_OWNED_MEMORY_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (xzg.s) aVar2.f13040a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        k8h.f fVar = eVar.f192642b;
                        String key2 = "MOST_OWNED_STORAGE_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(key2, "key");
                        k8h.b bVar2 = (k8h.b) yh5.b.u(fVar.f182164a, a0.d.r(k8h.f.f182163c, key2), k8h.f.f182162b);
                        if (bVar2 != null) {
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            List commodities = bVar2.getCommodities();
                            List listA = commodities != null ? k8h.d.a(commodities) : f0.f322471a;
                            List allAssets = bVar2.getAllAssets();
                            List listA2 = allAssets != null ? k8h.d.a(allAssets) : f0.f322471a;
                            List stocks = bVar2.getStocks();
                            List listA3 = stocks != null ? k8h.d.a(stocks) : f0.f322471a;
                            List crypto = bVar2.getCrypto();
                            sVar = new xzg.s(listA, listA2, listA3, crypto != null ? k8h.d.a(crypto) : f0.f322471a);
                        }
                        return sVar;
                }
            }
        };
        final int i6 = 1;
        return new w4l.f(bVarK0, function1, function2, function12, new Function2() { // from class: l7h.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List params = (List) obj2;
                xzg.s value = (xzg.s) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        b7h.a aVar2 = mostOwnedDodProvider.f192643c;
                        String key = "MOST_OWNED_MEMORY_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value, "value");
                        aVar2.f13040a.f(key, value);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "content");
                        k8h.f fVar = mostOwnedDodProvider.f192642b;
                        String key2 = "MOST_OWNED_STORAGE_KEY_" + (params.isEmpty() ? "MOST_OWNED_KEY" : zhm.d0.k0(params, ";", null, null, 0, new u(5), 30));
                        Intrinsics.checkNotNullParameter(value, "<this>");
                        k8h.b value2 = new k8h.b(k8h.d.b(value.f310027a), k8h.d.b(value.f310028b), k8h.d.b(value.f310029c), k8h.d.b(value.d));
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        fVar.f182164a.G(value2, a0.d.r(k8h.f.f182163c, key2), z.d(kotlin.jvm.internal.o0.b(k8h.b.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static m i(Context context) {
        mb3.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static n j(SeparateFavouritesItemDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        n nVarI = db8.i();
        s.k(nVarI);
        return nVarI;
    }

    public static w4l.f k(m7h.a aVar, final jt0.b portfolioMetricsDodProvider) {
        Intrinsics.checkNotNullParameter(portfolioMetricsDodProvider, "portfolioMetricsDodProvider");
        final int i = 0;
        Function2 function2 = new Function2() { // from class: l7h.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.C1684a.EnumC1685a enumC1685a;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<x7h.a> portfolioMetrics = ((PortfolioMetricsService) portfolioMetricsDodProvider.f178265b).getPortfolioMetrics(portfolioId);
                        l5i.b bVar = new l5i.b(6, new u(6));
                        portfolioMetrics.getClass();
                        ufm.i iVar = new ufm.i(portfolioMetrics, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String portfolioId2 = (String) obj2;
                        vdh.b portfolioMetrics2 = (vdh.b) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolioMetrics2, "portfolioMetrics");
                        ((ne0.j) portfolioMetricsDodProvider.f178266c).f(jt0.b.C0(portfolioId2), portfolioMetrics2);
                        return Unit.f186387a;
                    default:
                        String portfolioId3 = (String) obj2;
                        vdh.b portfolioMetrics3 = (vdh.b) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolioMetrics3, "portfolioMetrics");
                        ue0.c cVar = (ue0.c) portfolioMetricsDodProvider.d;
                        String strC0 = jt0.b.C0(portfolioId3);
                        Intrinsics.checkNotNullParameter(portfolioMetrics3, "<this>");
                        ArrayList<AssetSubclassAllocation> arrayList = portfolioMetrics3.f287930a;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (AssetSubclassAllocation assetSubclassAllocation : arrayList) {
                            if (assetSubclassAllocation instanceof AssetSubclassAllocation.Bonds) {
                                enumC1685a = a.C1684a.EnumC1685a.BOND;
                            } else if (assetSubclassAllocation instanceof AssetSubclassAllocation.Cash) {
                                enumC1685a = a.C1684a.EnumC1685a.CASH;
                            } else if (assetSubclassAllocation instanceof AssetSubclassAllocation.Commodities) {
                                enumC1685a = a.C1684a.EnumC1685a.COMMODITY;
                            } else {
                                if (!(assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                enumC1685a = a.C1684a.EnumC1685a.STOCK;
                            }
                            arrayList2.add(new a.C1684a(enumC1685a, assetSubclassAllocation.getF95689b(), assetSubclassAllocation.getF95688a()));
                        }
                        List<SectorSubclassAllocation> list = portfolioMetrics3.f287931b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                        for (SectorSubclassAllocation sectorSubclassAllocation : list) {
                            arrayList3.add(new a.c(sectorSubclassAllocation.f95694b, sectorSubclassAllocation.f95693a));
                        }
                        List<RegionSubclassAllocation> list2 = portfolioMetrics3.f287932c;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                        for (RegionSubclassAllocation regionSubclassAllocation : list2) {
                            arrayList4.add(new a.b(regionSubclassAllocation.f95691a.b(), regionSubclassAllocation.f95692b));
                        }
                        List<TopHoldingSubclassAllocation> list3 = portfolioMetrics3.d;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (TopHoldingSubclassAllocation topHoldingSubclassAllocation : list3) {
                            arrayList5.add(new a.d(topHoldingSubclassAllocation.f95695a, topHoldingSubclassAllocation.f95696b));
                        }
                        dj0.d dVar = portfolioMetrics3.e;
                        cVar.G(new x7h.a(dVar != null ? mo3.a.p(dVar) : null, arrayList2, arrayList3, arrayList4, arrayList5), strC0, z.d(kotlin.jvm.internal.o0.b(x7h.a.class)));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1() { // from class: l7h.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String portfolioId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (vdh.b) ((ne0.j) portfolioMetricsDodProvider.f178266c).get(jt0.b.C0(portfolioId));
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        x7h.a aVar2 = (x7h.a) ((ue0.c) portfolioMetricsDodProvider.d).T2(jt0.b.C0(portfolioId), x7h.a.class);
                        if (aVar2 != null) {
                            return x7h.c.a(aVar2);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2() { // from class: l7h.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.C1684a.EnumC1685a enumC1685a;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<x7h.a> portfolioMetrics = ((PortfolioMetricsService) portfolioMetricsDodProvider.f178265b).getPortfolioMetrics(portfolioId);
                        l5i.b bVar = new l5i.b(6, new u(6));
                        portfolioMetrics.getClass();
                        ufm.i iVar = new ufm.i(portfolioMetrics, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String portfolioId2 = (String) obj2;
                        vdh.b portfolioMetrics2 = (vdh.b) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolioMetrics2, "portfolioMetrics");
                        ((ne0.j) portfolioMetricsDodProvider.f178266c).f(jt0.b.C0(portfolioId2), portfolioMetrics2);
                        return Unit.f186387a;
                    default:
                        String portfolioId3 = (String) obj2;
                        vdh.b portfolioMetrics3 = (vdh.b) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolioMetrics3, "portfolioMetrics");
                        ue0.c cVar = (ue0.c) portfolioMetricsDodProvider.d;
                        String strC0 = jt0.b.C0(portfolioId3);
                        Intrinsics.checkNotNullParameter(portfolioMetrics3, "<this>");
                        ArrayList<AssetSubclassAllocation> arrayList = portfolioMetrics3.f287930a;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (AssetSubclassAllocation assetSubclassAllocation : arrayList) {
                            if (assetSubclassAllocation instanceof AssetSubclassAllocation.Bonds) {
                                enumC1685a = a.C1684a.EnumC1685a.BOND;
                            } else if (assetSubclassAllocation instanceof AssetSubclassAllocation.Cash) {
                                enumC1685a = a.C1684a.EnumC1685a.CASH;
                            } else if (assetSubclassAllocation instanceof AssetSubclassAllocation.Commodities) {
                                enumC1685a = a.C1684a.EnumC1685a.COMMODITY;
                            } else {
                                if (!(assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                enumC1685a = a.C1684a.EnumC1685a.STOCK;
                            }
                            arrayList2.add(new a.C1684a(enumC1685a, assetSubclassAllocation.getF95689b(), assetSubclassAllocation.getF95688a()));
                        }
                        List<SectorSubclassAllocation> list = portfolioMetrics3.f287931b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                        for (SectorSubclassAllocation sectorSubclassAllocation : list) {
                            arrayList3.add(new a.c(sectorSubclassAllocation.f95694b, sectorSubclassAllocation.f95693a));
                        }
                        List<RegionSubclassAllocation> list2 = portfolioMetrics3.f287932c;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                        for (RegionSubclassAllocation regionSubclassAllocation : list2) {
                            arrayList4.add(new a.b(regionSubclassAllocation.f95691a.b(), regionSubclassAllocation.f95692b));
                        }
                        List<TopHoldingSubclassAllocation> list3 = portfolioMetrics3.d;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (TopHoldingSubclassAllocation topHoldingSubclassAllocation : list3) {
                            arrayList5.add(new a.d(topHoldingSubclassAllocation.f95695a, topHoldingSubclassAllocation.f95696b));
                        }
                        dj0.d dVar = portfolioMetrics3.e;
                        cVar.G(new x7h.a(dVar != null ? mo3.a.p(dVar) : null, arrayList2, arrayList3, arrayList4, arrayList5), strC0, z.d(kotlin.jvm.internal.o0.b(x7h.a.class)));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1() { // from class: l7h.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String portfolioId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (vdh.b) ((ne0.j) portfolioMetricsDodProvider.f178266c).get(jt0.b.C0(portfolioId));
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        x7h.a aVar2 = (x7h.a) ((ue0.c) portfolioMetricsDodProvider.d).T2(jt0.b.C0(portfolioId), x7h.a.class);
                        if (aVar2 != null) {
                            return x7h.c.a(aVar2);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        return new w4l.f(function2, function1, function22, function12, new Function2() { // from class: l7h.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.C1684a.EnumC1685a enumC1685a;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<x7h.a> portfolioMetrics = ((PortfolioMetricsService) portfolioMetricsDodProvider.f178265b).getPortfolioMetrics(portfolioId);
                        l5i.b bVar = new l5i.b(6, new u(6));
                        portfolioMetrics.getClass();
                        ufm.i iVar = new ufm.i(portfolioMetrics, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String portfolioId2 = (String) obj2;
                        vdh.b portfolioMetrics2 = (vdh.b) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolioMetrics2, "portfolioMetrics");
                        ((ne0.j) portfolioMetricsDodProvider.f178266c).f(jt0.b.C0(portfolioId2), portfolioMetrics2);
                        return Unit.f186387a;
                    default:
                        String portfolioId3 = (String) obj2;
                        vdh.b portfolioMetrics3 = (vdh.b) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolioMetrics3, "portfolioMetrics");
                        ue0.c cVar = (ue0.c) portfolioMetricsDodProvider.d;
                        String strC0 = jt0.b.C0(portfolioId3);
                        Intrinsics.checkNotNullParameter(portfolioMetrics3, "<this>");
                        ArrayList<AssetSubclassAllocation> arrayList = portfolioMetrics3.f287930a;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (AssetSubclassAllocation assetSubclassAllocation : arrayList) {
                            if (assetSubclassAllocation instanceof AssetSubclassAllocation.Bonds) {
                                enumC1685a = a.C1684a.EnumC1685a.BOND;
                            } else if (assetSubclassAllocation instanceof AssetSubclassAllocation.Cash) {
                                enumC1685a = a.C1684a.EnumC1685a.CASH;
                            } else if (assetSubclassAllocation instanceof AssetSubclassAllocation.Commodities) {
                                enumC1685a = a.C1684a.EnumC1685a.COMMODITY;
                            } else {
                                if (!(assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                enumC1685a = a.C1684a.EnumC1685a.STOCK;
                            }
                            arrayList2.add(new a.C1684a(enumC1685a, assetSubclassAllocation.getF95689b(), assetSubclassAllocation.getF95688a()));
                        }
                        List<SectorSubclassAllocation> list = portfolioMetrics3.f287931b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                        for (SectorSubclassAllocation sectorSubclassAllocation : list) {
                            arrayList3.add(new a.c(sectorSubclassAllocation.f95694b, sectorSubclassAllocation.f95693a));
                        }
                        List<RegionSubclassAllocation> list2 = portfolioMetrics3.f287932c;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                        for (RegionSubclassAllocation regionSubclassAllocation : list2) {
                            arrayList4.add(new a.b(regionSubclassAllocation.f95691a.b(), regionSubclassAllocation.f95692b));
                        }
                        List<TopHoldingSubclassAllocation> list3 = portfolioMetrics3.d;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (TopHoldingSubclassAllocation topHoldingSubclassAllocation : list3) {
                            arrayList5.add(new a.d(topHoldingSubclassAllocation.f95695a, topHoldingSubclassAllocation.f95696b));
                        }
                        dj0.d dVar = portfolioMetrics3.e;
                        cVar.G(new x7h.a(dVar != null ? mo3.a.p(dVar) : null, arrayList2, arrayList3, arrayList4, arrayList5), strC0, z.d(kotlin.jvm.internal.o0.b(x7h.a.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static w4l.f l(m7h.a aVar, final l7h.o recurringOrdersByPortfolioIdDodProvider) {
        Intrinsics.checkNotNullParameter(recurringOrdersByPortfolioIdDodProvider, "recurringOrdersByPortfolioIdDodProvider");
        final int i = 0;
        Function2 function2 = new Function2() { // from class: l7h.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<List<c8h.b>> recurringOrders = recurringOrdersByPortfolioIdDodProvider.f192659a.getRecurringOrders(portfolioId);
                        l5i.b bVar = new l5i.b(8, new u(8));
                        recurringOrders.getClass();
                        ufm.i iVar = new ufm.i(recurringOrders, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String portfolioId2 = (String) obj2;
                        List recurringOrders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(recurringOrders2, "recurringOrders");
                        ehe.n.z("RECURRING_ORDERS_", portfolioId2, recurringOrdersByPortfolioIdDodProvider.f192660b, recurringOrders2);
                        break;
                    default:
                        String portfolioId3 = (String) obj2;
                        List recurringOrders3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(recurringOrders3, "recurringOrders");
                        i7h.a aVar2 = recurringOrdersByPortfolioIdDodProvider.f192661c;
                        List list = recurringOrders3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(i7h.e.a((PortfolioRecurringOrder) it8.next()));
                        }
                        aVar2.e(portfolioId3, arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1() { // from class: l7h.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String portfolioId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) v7.r("RECURRING_ORDERS_", portfolioId, recurringOrdersByPortfolioIdDodProvider.f192660b);
                    case 1:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        List listD = recurringOrdersByPortfolioIdDodProvider.f192661c.d(portfolioId);
                        ArrayList arrayList = new ArrayList(zhm.w.t(listD, 10));
                        Iterator it8 = listD.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(i7h.e.b((i7h.d) it8.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        o oVar = recurringOrdersByPortfolioIdDodProvider;
                        oVar.f192661c.b(portfolioId);
                        oVar.f192660b.remove("RECURRING_ORDERS_" + portfolioId);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2() { // from class: l7h.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<List<c8h.b>> recurringOrders = recurringOrdersByPortfolioIdDodProvider.f192659a.getRecurringOrders(portfolioId);
                        l5i.b bVar = new l5i.b(8, new u(8));
                        recurringOrders.getClass();
                        ufm.i iVar = new ufm.i(recurringOrders, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String portfolioId2 = (String) obj2;
                        List recurringOrders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(recurringOrders2, "recurringOrders");
                        ehe.n.z("RECURRING_ORDERS_", portfolioId2, recurringOrdersByPortfolioIdDodProvider.f192660b, recurringOrders2);
                        break;
                    default:
                        String portfolioId3 = (String) obj2;
                        List recurringOrders3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(recurringOrders3, "recurringOrders");
                        i7h.a aVar2 = recurringOrdersByPortfolioIdDodProvider.f192661c;
                        List list = recurringOrders3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(i7h.e.a((PortfolioRecurringOrder) it8.next()));
                        }
                        aVar2.e(portfolioId3, arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1() { // from class: l7h.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String portfolioId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) v7.r("RECURRING_ORDERS_", portfolioId, recurringOrdersByPortfolioIdDodProvider.f192660b);
                    case 1:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        List listD = recurringOrdersByPortfolioIdDodProvider.f192661c.d(portfolioId);
                        ArrayList arrayList = new ArrayList(zhm.w.t(listD, 10));
                        Iterator it8 = listD.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(i7h.e.b((i7h.d) it8.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        o oVar = recurringOrdersByPortfolioIdDodProvider;
                        oVar.f192661c.b(portfolioId);
                        oVar.f192660b.remove("RECURRING_ORDERS_" + portfolioId);
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 2;
        return new w4l.f(function2, function1, function22, function12, new Function2() { // from class: l7h.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<List<c8h.b>> recurringOrders = recurringOrdersByPortfolioIdDodProvider.f192659a.getRecurringOrders(portfolioId);
                        l5i.b bVar = new l5i.b(8, new u(8));
                        recurringOrders.getClass();
                        ufm.i iVar = new ufm.i(recurringOrders, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String portfolioId2 = (String) obj2;
                        List recurringOrders2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(recurringOrders2, "recurringOrders");
                        ehe.n.z("RECURRING_ORDERS_", portfolioId2, recurringOrdersByPortfolioIdDodProvider.f192660b, recurringOrders2);
                        break;
                    default:
                        String portfolioId3 = (String) obj2;
                        List recurringOrders3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(recurringOrders3, "recurringOrders");
                        i7h.a aVar2 = recurringOrdersByPortfolioIdDodProvider.f192661c;
                        List list = recurringOrders3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(i7h.e.a((PortfolioRecurringOrder) it8.next()));
                        }
                        aVar2.e(portfolioId3, arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1() { // from class: l7h.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String portfolioId = (String) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) v7.r("RECURRING_ORDERS_", portfolioId, recurringOrdersByPortfolioIdDodProvider.f192660b);
                    case 1:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        List listD = recurringOrdersByPortfolioIdDodProvider.f192661c.d(portfolioId);
                        ArrayList arrayList = new ArrayList(zhm.w.t(listD, 10));
                        Iterator it8 = listD.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(i7h.e.b((i7h.d) it8.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        o oVar = recurringOrdersByPortfolioIdDodProvider;
                        oVar.f192661c.b(portfolioId);
                        oVar.f192660b.remove("RECURRING_ORDERS_" + portfolioId);
                        return Unit.f186387a;
                }
            }
        }, null, null, 192);
    }

    public static Retrofit m(kg.o gson, Retrofit retrofit) {
        mb3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
    }

    public static Retrofit n(Retrofit retrofit) {
        mb3.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        builderNewBuilder.converterFactories().clear();
        kg.p pVar = new kg.p();
        pVar.c(new he0.a(), DateTime.class);
        builderNewBuilder.addConverterFactory(GsonConverterFactory.create(pVar.b()));
        Retrofit retrofitBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static vbc.e o(ou5.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new vbc.e((gte.a) factory.f229819a, (usc.a) factory.f229820b, new vbc.f((kbc.b) factory.f229821c, (kbc.c) factory.d));
    }

    public static vbc.a p(ou5.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new vbc.a();
    }

    public static CashTopUpBarcodeService q(Retrofit retrofit) {
        mb3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CashTopUpBarcodeService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CashTopUpBarcodeService cashTopUpBarcodeService = (CashTopUpBarcodeService) objCreate;
        s.k(cashTopUpBarcodeService);
        return cashTopUpBarcodeService;
    }

    public static CashTopUpService r(Retrofit retrofit) {
        mb3.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CashTopUpService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CashTopUpService cashTopUpService = (CashTopUpService) objCreate;
        s.k(cashTopUpService);
        return cashTopUpService;
    }

    public static xe0.e s(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "SHARED_WATCHLIST_STORAGE_FILE_NAME", mapper, 2, zhm.u.c(q4d.a.d), 32);
    }

    public static w4l.f t(m7h.a aVar, final l7h.k portfolioRecurringOrderByOrderIdDodProvider) {
        Intrinsics.checkNotNullParameter(portfolioRecurringOrderByOrderIdDodProvider, "portfolioRecurringOrderByOrderIdDodProvider");
        final int i = 0;
        Function2 function2 = new Function2() { // from class: l7h.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String orderId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        d0<c8h.b> recurringOrder = portfolioRecurringOrderByOrderIdDodProvider.f192652a.getRecurringOrder(orderId);
                        l5i.b bVar = new l5i.b(7, new u(7));
                        recurringOrder.getClass();
                        pfm.z zVar = new pfm.z(new ufm.i(recurringOrder, bVar, 1), 1, new o0(3), null);
                        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
                        break;
                    case 1:
                        String orderId2 = (String) obj2;
                        od0.i recurringOrderOptional = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(orderId2, "orderId");
                        Intrinsics.checkNotNullParameter(recurringOrderOptional, "recurringOrderOptional");
                        String str = "RECURRING_ORDER_ID_" + orderId2;
                        ne0.j jVar = portfolioRecurringOrderByOrderIdDodProvider.f192653b;
                        if (recurringOrderOptional.d()) {
                            jVar.f(str, recurringOrderOptional.c());
                        } else {
                            jVar.remove(str);
                        }
                        break;
                    default:
                        i7h.a aVar2 = portfolioRecurringOrderByOrderIdDodProvider.f192654c;
                        String orderId3 = (String) obj2;
                        od0.i recurringOrderOptional2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(orderId3, "orderId");
                        Intrinsics.checkNotNullParameter(recurringOrderOptional2, "recurringOrderOptional");
                        if (recurringOrderOptional2.d()) {
                            aVar2.f(i7h.e.a((PortfolioRecurringOrder) recurringOrderOptional2.c()));
                        } else {
                            aVar2.a(orderId3);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1() { // from class: l7h.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String orderId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        PortfolioRecurringOrder portfolioRecurringOrder = (PortfolioRecurringOrder) v7.r("RECURRING_ORDER_ID_", orderId, portfolioRecurringOrderByOrderIdDodProvider.f192653b);
                        if (portfolioRecurringOrder == null) {
                            return null;
                        }
                        od0.i.Companion.getClass();
                        return od0.h.a(portfolioRecurringOrder);
                    case 1:
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        i7h.d dVarC = portfolioRecurringOrderByOrderIdDodProvider.f192654c.c(orderId);
                        if (dVarC == null) {
                            return null;
                        }
                        PortfolioRecurringOrder portfolioRecurringOrderB = i7h.e.b(dVarC);
                        od0.i.Companion.getClass();
                        return od0.h.a(portfolioRecurringOrderB);
                    default:
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        k kVar = portfolioRecurringOrderByOrderIdDodProvider;
                        kVar.f192654c.a(orderId);
                        kVar.f192653b.remove("RECURRING_ORDER_ID_" + orderId);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2() { // from class: l7h.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String orderId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        d0<c8h.b> recurringOrder = portfolioRecurringOrderByOrderIdDodProvider.f192652a.getRecurringOrder(orderId);
                        l5i.b bVar = new l5i.b(7, new u(7));
                        recurringOrder.getClass();
                        pfm.z zVar = new pfm.z(new ufm.i(recurringOrder, bVar, 1), 1, new o0(3), null);
                        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
                        break;
                    case 1:
                        String orderId2 = (String) obj2;
                        od0.i recurringOrderOptional = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(orderId2, "orderId");
                        Intrinsics.checkNotNullParameter(recurringOrderOptional, "recurringOrderOptional");
                        String str = "RECURRING_ORDER_ID_" + orderId2;
                        ne0.j jVar = portfolioRecurringOrderByOrderIdDodProvider.f192653b;
                        if (recurringOrderOptional.d()) {
                            jVar.f(str, recurringOrderOptional.c());
                        } else {
                            jVar.remove(str);
                        }
                        break;
                    default:
                        i7h.a aVar2 = portfolioRecurringOrderByOrderIdDodProvider.f192654c;
                        String orderId3 = (String) obj2;
                        od0.i recurringOrderOptional2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(orderId3, "orderId");
                        Intrinsics.checkNotNullParameter(recurringOrderOptional2, "recurringOrderOptional");
                        if (recurringOrderOptional2.d()) {
                            aVar2.f(i7h.e.a((PortfolioRecurringOrder) recurringOrderOptional2.c()));
                        } else {
                            aVar2.a(orderId3);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1() { // from class: l7h.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String orderId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        PortfolioRecurringOrder portfolioRecurringOrder = (PortfolioRecurringOrder) v7.r("RECURRING_ORDER_ID_", orderId, portfolioRecurringOrderByOrderIdDodProvider.f192653b);
                        if (portfolioRecurringOrder == null) {
                            return null;
                        }
                        od0.i.Companion.getClass();
                        return od0.h.a(portfolioRecurringOrder);
                    case 1:
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        i7h.d dVarC = portfolioRecurringOrderByOrderIdDodProvider.f192654c.c(orderId);
                        if (dVarC == null) {
                            return null;
                        }
                        PortfolioRecurringOrder portfolioRecurringOrderB = i7h.e.b(dVarC);
                        od0.i.Companion.getClass();
                        return od0.h.a(portfolioRecurringOrderB);
                    default:
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        k kVar = portfolioRecurringOrderByOrderIdDodProvider;
                        kVar.f192654c.a(orderId);
                        kVar.f192653b.remove("RECURRING_ORDER_ID_" + orderId);
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 2;
        return new w4l.f(function2, function1, function22, function12, new Function2() { // from class: l7h.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String orderId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        d0<c8h.b> recurringOrder = portfolioRecurringOrderByOrderIdDodProvider.f192652a.getRecurringOrder(orderId);
                        l5i.b bVar = new l5i.b(7, new u(7));
                        recurringOrder.getClass();
                        pfm.z zVar = new pfm.z(new ufm.i(recurringOrder, bVar, 1), 1, new o0(3), null);
                        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
                        break;
                    case 1:
                        String orderId2 = (String) obj2;
                        od0.i recurringOrderOptional = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(orderId2, "orderId");
                        Intrinsics.checkNotNullParameter(recurringOrderOptional, "recurringOrderOptional");
                        String str = "RECURRING_ORDER_ID_" + orderId2;
                        ne0.j jVar = portfolioRecurringOrderByOrderIdDodProvider.f192653b;
                        if (recurringOrderOptional.d()) {
                            jVar.f(str, recurringOrderOptional.c());
                        } else {
                            jVar.remove(str);
                        }
                        break;
                    default:
                        i7h.a aVar2 = portfolioRecurringOrderByOrderIdDodProvider.f192654c;
                        String orderId3 = (String) obj2;
                        od0.i recurringOrderOptional2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(orderId3, "orderId");
                        Intrinsics.checkNotNullParameter(recurringOrderOptional2, "recurringOrderOptional");
                        if (recurringOrderOptional2.d()) {
                            aVar2.f(i7h.e.a((PortfolioRecurringOrder) recurringOrderOptional2.c()));
                        } else {
                            aVar2.a(orderId3);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1() { // from class: l7h.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String orderId = (String) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        PortfolioRecurringOrder portfolioRecurringOrder = (PortfolioRecurringOrder) v7.r("RECURRING_ORDER_ID_", orderId, portfolioRecurringOrderByOrderIdDodProvider.f192653b);
                        if (portfolioRecurringOrder == null) {
                            return null;
                        }
                        od0.i.Companion.getClass();
                        return od0.h.a(portfolioRecurringOrder);
                    case 1:
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        i7h.d dVarC = portfolioRecurringOrderByOrderIdDodProvider.f192654c.c(orderId);
                        if (dVarC == null) {
                            return null;
                        }
                        PortfolioRecurringOrder portfolioRecurringOrderB = i7h.e.b(dVarC);
                        od0.i.Companion.getClass();
                        return od0.h.a(portfolioRecurringOrderB);
                    default:
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        k kVar = portfolioRecurringOrderByOrderIdDodProvider;
                        kVar.f192654c.a(orderId);
                        kVar.f192653b.remove("RECURRING_ORDER_ID_" + orderId);
                        return Unit.f186387a;
                }
            }
        }, null, null, 192);
    }

    public static xe0.e u(kg.o gson, le0.b gsonObjectMapperFactory, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        mb3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "cash_topup_barcode_storage", gsonObjectMapperFactory.a(gson), 0, null, 56);
    }

    public static i7e.a v(m6e.a dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return new i7e.a();
    }

    public static i7e.d w(m6e.a dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        g7e.a aVar = (g7e.a) dependency;
        return new i7e.d(aVar.f141182a, aVar.f141183b, aVar.i, aVar.f141187j, aVar.f141190n);
    }

    public static n4d.s x(SeparateFavouritesItemDatabase db8) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        n4d.s sVarJ = db8.j();
        s.k(sVarJ);
        return sVarJ;
    }

    public static WatchlistService y(f fVar, Retrofit retrofit) {
        WatchlistService watchlistService = (WatchlistService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", WatchlistService.class, "create(...)");
        s.k(watchlistService);
        return watchlistService;
    }

    public static x4l.c z(m7h.a aVar, lal.a dodProvider) {
        Intrinsics.checkNotNullParameter(dodProvider, "dodProvider");
        Continuation continuation = null;
        return new x4l.c(new k(dodProvider, continuation, 1), new y(dodProvider, 28), new r(dodProvider, 23), new g(dodProvider, continuation, 23), new lp6.g(dodProvider, continuation, 17));
    }
}
