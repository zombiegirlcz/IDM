package c21;

import android.content.Context;
import c4f.r;
import com.revolut.data.network.services.AutoTopUpService;
import com.revolut.data.network.services.ExternalInstitutionsService;
import com.revolut.data.network.services.NewsService;
import com.revolut.data.network.services.PeerToPeerTransferService;
import com.revolut.data.network.services.UserService;
import com.revolut.data.network.services.exchange.ExchangeRatesService;
import com.revolut.feature.on_hold.accounts.impl.network.BlockedFundsService;
import com.revolut.retail.feature.cryptocommoditydetails.impl.data.commodity.network.CommodityPriceTargetsService;
import com.revolut.shared.feature.recurring_payments.data.services.StandingOrdersService;
import ecm.q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import mae.p;
import retrofit2.Retrofit;
import sri.o;
import vc.s;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public abstract class l implements e4m.e {
    public static xe0.e A(k kVar, je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "top_up", mapper, 2, u.c(new f31.a()), 32);
    }

    public static f01.c B(com.revolut.kompot.navigable.a controller) {
        c7f.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new f01.c(controller.m2());
    }

    public static UserService C(m mVar, Retrofit retrofit) {
        UserService userService = (UserService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", UserService.class, "create(...)");
        s.k(userService);
        return userService;
    }

    public static xe0.e D(k kVar, je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "new_home_widgets", mapper, 0, null, 56);
    }

    public static a51.d a(a1j.a aVar) {
        return new a51.d(aVar, 3);
    }

    public static ae9.d b(a1j.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new ae9.d(aVar, aVar2, aVar3, aVar4, aVar5, 1);
    }

    public static c1d.d c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6) {
        return new c1d.d(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, 1);
    }

    public static c4f.m d(a31.a aVar, a31.a aVar2, q qVar) {
        return new c4f.m(aVar, aVar2, qVar);
    }

    public static g31.c e(n nVar, d4m.a repositoryLazy) {
        Object obj2;
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        HashMap map = nVar.f20605a;
        Object obj3 = map.get(g31.c.class);
        WeakReference weakReference = obj3 instanceof WeakReference ? (WeakReference) obj3 : null;
        if (weakReference == null || (obj2 = weakReference.get()) == null) {
            obj2 = repositoryLazy.get();
            map.put(g31.c.class, new WeakReference(obj2));
        }
        g31.c cVar = (g31.c) obj2;
        s.k(cVar);
        return cVar;
    }

    public static AutoTopUpService f(m mVar, Retrofit retrofit) {
        AutoTopUpService autoTopUpService = (AutoTopUpService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", AutoTopUpService.class, "create(...)");
        s.k(autoTopUpService);
        return autoTopUpService;
    }

    public static BlockedFundsService g(Retrofit retrofit) {
        c89.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BlockedFundsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BlockedFundsService blockedFundsService = (BlockedFundsService) objCreate;
        s.k(blockedFundsService);
        return blockedFundsService;
    }

    public static xe0.e h(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        c73.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "revolut_cards", mapper, 0, null, 56);
    }

    public static aah.g i(zjh.i factory, b2b.e view, b2b.c controllerModelExtension) {
        c2b.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new aah.g(view, controllerModelExtension);
    }

    public static b5b.a j(zjh.i factory, b2b.f cfdSwipeActionsInstrumentRefsProvider) {
        c2b.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(cfdSwipeActionsInstrumentRefsProvider, "cfdSwipeActionsInstrumentRefsProvider");
        Intrinsics.checkNotNullParameter(cfdSwipeActionsInstrumentRefsProvider, "cfdSwipeActionsInstrumentRefsProvider");
        return new b5b.a((ybl.b) factory.f322838b, cfdSwipeActionsInstrumentRefsProvider);
    }

    public static CommodityPriceTargetsService k(cdj.a aVar, Retrofit retrofit) {
        CommodityPriceTargetsService commodityPriceTargetsService = (CommodityPriceTargetsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CommodityPriceTargetsService.class, "create(...)");
        s.k(commodityPriceTargetsService);
        return commodityPriceTargetsService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n l(gb0.a extension) {
        cb0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        s.k(nVar);
        return nVar;
    }

    public static ExchangeRatesService m(m mVar, Retrofit retrofit) {
        ExchangeRatesService exchangeRatesService = (ExchangeRatesService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ExchangeRatesService.class, "create(...)");
        s.k(exchangeRatesService);
        return exchangeRatesService;
    }

    public static ExternalInstitutionsService n(m mVar, Retrofit retrofit) {
        ExternalInstitutionsService externalInstitutionsService = (ExternalInstitutionsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", ExternalInstitutionsService.class, "create(...)");
        s.k(externalInstitutionsService);
        return externalInstitutionsService;
    }

    public static yhi.a o(Context context) {
        c51.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new yhi.a(yh5.b.c(((ip.a) ue0.e.j(context)).b()));
    }

    public static sri.m p(Context context) {
        c43.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static sri.m q(Context context) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static sri.m r(Context context) {
        c73.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static NewsService s(m mVar, Retrofit retrofit) {
        NewsService newsService = (NewsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", NewsService.class, "create(...)");
        s.k(newsService);
        return newsService;
    }

    public static le0.a t(kg.o gson, le0.b factory) {
        c43.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(gson);
    }

    public static y21.c u(n nVar, d4m.a repositoryLazy) {
        Object obj2;
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        HashMap map = nVar.f20605a;
        Object obj3 = map.get(y21.c.class);
        WeakReference weakReference = obj3 instanceof WeakReference ? (WeakReference) obj3 : null;
        if (weakReference == null || (obj2 = weakReference.get()) == null) {
            obj2 = repositoryLazy.get();
            map.put(y21.c.class, new WeakReference(obj2));
        }
        y21.c cVar = (y21.c) obj2;
        s.k(cVar);
        return cVar;
    }

    public static PeerToPeerTransferService v(m mVar, Retrofit retrofit) {
        PeerToPeerTransferService peerToPeerTransferService = (PeerToPeerTransferService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PeerToPeerTransferService.class, "create(...)");
        s.k(peerToPeerTransferService);
        return peerToPeerTransferService;
    }

    public static xe0.e w(k kVar, je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "split_bill", mapper, 0, null, 56);
    }

    public static StandingOrdersService x(m mVar, Retrofit retrofit) {
        StandingOrdersService standingOrdersService = (StandingOrdersService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", StandingOrdersService.class, "create(...)");
        s.k(standingOrdersService);
        return standingOrdersService;
    }

    public static xe0.e y(yk0.a databaseSessionProvider, je0.d objectMapper, xe0.f storageFactory) {
        c43.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "CARD_PAYMENT_METHOD_STORAGE", objectMapper, 1, f0.f322471a, 32);
    }

    public static mae.o z(p factory, f01.c uiKitResources, t70.b currenciesLocalization) {
        c43.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.d(uiKitResources, currenciesLocalization);
    }
}
