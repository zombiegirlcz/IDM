package ql7;

import afj.e4;
import android.content.Context;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.data.network.services.TopupService;
import com.revolut.feature.account_switching.impl.data.network.AccountSwitchingService;
import com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase;
import com.revolut.feature.offboarding.impl.data.service.RetailOffboardingService;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.selfserve.entity.config.impl.data.network.WarrantDetailsService;
import com.revolut.feature.topup_screen.impl.data.network.service.BrazilInboundStoredMethodDetailsService;
import com.revolut.feature.topup_screen.impl.data.network.service.StoredMethodService;
import com.revolut.feature.topup_screen.impl.data.network.service.TopupMethodsService;
import com.revolut.feature.transactions.impl.data.network.WarrantService;
import com.revolut.feature.wealth.options.ui.impl.data.network.OptionsApiService;
import com.youTransactor.uCube.rpc.Constants;
import java.time.Clock;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class d2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f247275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f247276c;

    public /* synthetic */ d2(Object obj2, int i, int i2) {
        this.f247274a = i2;
        this.f247276c = obj2;
        this.f247275b = i;
    }

    private final Object a() {
        r91.g gVar = (r91.g) this.f247276c;
        int i = this.f247275b;
        switch (i) {
            case 0:
                return new q91.d((sri.m) gVar.f252482j.get(), (s91.a) gVar.k.get(), (v91.a) gVar.f252483l.get());
            case 1:
                Context context = gVar.f252477a;
                r91.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            case 2:
                xoj.a aVarA = gVar.f252478b.a();
                vc.s.j(aVarA);
                gte.a aVarB = gVar.f252479c.b();
                vc.s.j(aVarB);
                return new s91.a(aVarA, aVarB);
            case 3:
                r91.b.Companion.getClass();
                return new v91.a();
            case 4:
                Context context2 = gVar.f252477a;
                yk0.a databaseSessionProvider = gVar.d.b();
                vc.s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) gVar.e).b();
                r91.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                AccountSwitchingDatabase.Companion companion = AccountSwitchingDatabase.INSTANCE;
                companion.getClass();
                AccountSwitchingDatabase accountSwitchingDatabase = (AccountSwitchingDatabase) companion.a(context2, databaseSessionProvider, new Migration[]{o91.a.f223053c, o91.b.f223054c, o91.c.f223055c, o91.d.f223056c, o91.e.f223057c, o91.f.f223058c}, databaseEncryptionMigratorFactory);
                vc.s.k(accountSwitchingDatabase);
                return accountSwitchingDatabase;
            case 5:
                je0.d mapper = gVar.f.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider2 = gVar.d.b();
                vc.s.j(databaseSessionProvider2);
                xe0.f fVarF = gVar.f.f();
                vc.s.j(fVarF);
                r91.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                return xe0.f.f(fVarF, databaseSessionProvider2, "account_switching_storage", mapper, 5, zhm.v.k(v0.a.c(fVarF, "storageFactory", 1, 2), new exa.a(2, 3, 5), new o91.g(), new o91.h()), 32);
            case 6:
                s91.b accountSwitchingInteractor = (s91.b) gVar.f252493y.get();
                s91.a accountSwitchingFeatureChecker = (s91.a) gVar.k.get();
                Intrinsics.checkNotNullParameter(accountSwitchingInteractor, "accountSwitchingInteractor");
                Intrinsics.checkNotNullParameter(accountSwitchingFeatureChecker, "accountSwitchingFeatureChecker");
                return new nd.m(11);
            case 7:
                l91.g repository = (l91.g) gVar.f252492x.get();
                d3j.b beneficiaryInteractor = ((b3j.p) gVar.f252481h).e();
                Intrinsics.checkNotNullParameter(repository, "repository");
                Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
                return new s91.b();
            case 8:
                return new l91.g((AccountSwitchingService) gVar.f252486p.get(), (m91.m) gVar.f252487q.get(), (m91.f) gVar.f252488r.get(), (m91.a) gVar.f252489s.get(), (m91.d) gVar.f252490t.get(), (m91.i) gVar.u.get(), (m91.k) gVar.v.get(), (ne0.j) gVar.f252491w.get(), (ue0.c) gVar.o.get());
            case 9:
                Retrofit retrofit = ((nj0.d) gVar.f252480g).f();
                r91.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(AccountSwitchingService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                AccountSwitchingService accountSwitchingService = (AccountSwitchingService) objCreate;
                vc.s.k(accountSwitchingService);
                return accountSwitchingService;
            case 10:
                AccountSwitchingDatabase db8 = (AccountSwitchingDatabase) gVar.f252485n.get();
                r91.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(db8, "db");
                m91.m mVarL = db8.l();
                vc.s.k(mVarL);
                return mVarL;
            case 11:
                AccountSwitchingDatabase db10 = (AccountSwitchingDatabase) gVar.f252485n.get();
                r91.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(db10, "db");
                m91.f fVarI = db10.i();
                vc.s.k(fVarI);
                return fVarI;
            case 12:
                AccountSwitchingDatabase db11 = (AccountSwitchingDatabase) gVar.f252485n.get();
                r91.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(db11, "db");
                m91.a aVarG = db11.g();
                vc.s.k(aVarG);
                return aVarG;
            case 13:
                AccountSwitchingDatabase db12 = (AccountSwitchingDatabase) gVar.f252485n.get();
                r91.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(db12, "db");
                m91.d dVarH = db12.h();
                vc.s.k(dVarH);
                return dVarH;
            case 14:
                AccountSwitchingDatabase db13 = (AccountSwitchingDatabase) gVar.f252485n.get();
                r91.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(db13, "db");
                m91.i iVarJ = db13.j();
                vc.s.k(iVarJ);
                return iVarJ;
            case 15:
                AccountSwitchingDatabase db14 = (AccountSwitchingDatabase) gVar.f252485n.get();
                r91.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(db14, "db");
                m91.k kVarK = db14.k();
                vc.s.k(kVarK);
                return kVarK;
            case 16:
                return new ne0.d();
            case 17:
                return new t91.a();
            case 18:
                q06.l deeplinkRouter = gVar.i.a();
                vc.s.j(deeplinkRouter);
                Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
                return new nd.p();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        reh.b bVar = (reh.b) this.f247276c;
        ee0.a aVar = bVar.f253589b;
        int i = this.f247275b;
        if (i == 0) {
            Retrofit retrofit = ((nj0.d) bVar.f253588a).f();
            reh.d.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCreate = retrofit.create(OptionsApiService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            OptionsApiService optionsApiService = (OptionsApiService) objCreate;
            vc.s.k(optionsApiService);
            return optionsApiService;
        }
        if (i == 1) {
            reh.d.Companion.getClass();
            return new ne0.d();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        xe0.f storageFactory = aVar.f();
        vc.s.j(storageFactory);
        je0.d objectMapper = aVar.d();
        vc.s.j(objectMapper);
        reh.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        return xe0.f.e(storageFactory, "storage_options.pref", objectMapper, 12);
    }

    private final Object c() {
        int i = this.f247275b;
        if (i == 0) {
            rr1.b bVar = (rr1.b) this.f247276c;
            return new yr1.f(bVar.f256640a, (cli.n) bVar.f256641b.get());
        }
        if (i == 1) {
            return new yr1.e();
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        rs5.c cVar = (rs5.c) this.f247276c;
        int i = this.f247275b;
        switch (i) {
            case 0:
                b9k.f cryptoReceiveWidgetContractFactory = cVar.f256963b.a();
                ij5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(cryptoReceiveWidgetContractFactory, "cryptoReceiveWidgetContractFactory");
                return new nj5.h((com.revolut.feature.crypto.remittance.api.navigation.a) cryptoReceiveWidgetContractFactory.f13817b, (fkg.a) cryptoReceiveWidgetContractFactory.f13816a, (xoj.a) cryptoReceiveWidgetContractFactory.f13818c, (xh5.a) cryptoReceiveWidgetContractFactory.d);
            case 1:
                prl.e factory = ((jaj.b) cVar.f256965c).a();
                vs5.a widgetConfigProvider = new vs5.a();
                iaj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
                Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
                return new saj.h((oaj.a) factory.f239325b, widgetConfigProvider);
            case 2:
                xi5.a api2 = cVar.d;
                xs5.a configProvider = new xs5.a();
                vi5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(api2, "api");
                Intrinsics.checkNotNullParameter(configProvider, "configProvider");
                ou5.b bVarA = api2.a();
                Intrinsics.checkNotNullParameter(configProvider, "configProvider");
                return new yi5.j(((ev5.d) bVarA.f229819a).a(null), (yd9.e) bVarA.f229820b, configProvider);
            case 3:
                ys5.h factory2 = cVar.m();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new ys5.d(factory2.f316408a, factory2.f316409b, (pt5.t) factory2.f316410c.get());
            case 4:
                return new ss5.a();
            case 5:
                mw5.l lVar = cVar.f256968g;
                tv5.b bVarC = lVar.f209377h.c();
                vc.s.j(bVarC);
                ny5.g gVar = new ny5.g((nw5.a) lVar.C.get());
                t70.b bVarG = lVar.f209379l.g();
                vc.s.j(bVarG);
                return new ns5.g(new ay5.b(bVarC, gVar, new ny5.c(bVarG), (nw5.j) lVar.H.get(), new ny5.u()), new ny5.e());
            case 6:
                da3.j jVar = cVar.f256969h;
                da3.j jVar2 = cVar.f256969h;
                l93.f fVarJ = jVar.j();
                vc.s.j(fVarJ);
                ia3.r rVarB = jVar2.b();
                m93.g gVarI = jVar2.i();
                vc.s.j(gVarI);
                f73.a aVar = (f73.a) cVar.i.v.get();
                vc.s.j(aVar);
                mt8.d dVarB = cVar.f256971j.b();
                vc.s.j(dVarB);
                ld5.b bVarB = cVar.k.b();
                vc.s.j(bVarB);
                return new os5.d(fVarJ, rVarB, gVarI, aVar, dVarB, bVarB, new os5.a());
            case 7:
                qud.c cVar2 = cVar.f256973l;
                p76.b bVar = cVar.f256979q;
                nyj.h hVar = cVar.f256974m;
                yud.g gVarD = cVar2.d();
                g09.e eVar = (g09.e) ((nyj.c) hVar).v.get();
                vc.s.j(eVar);
                ttd.a aVarH = cVar.f256973l.f249364b.h();
                o5c.a aVar2 = (o5c.a) cVar.f256975n.f202894q.get();
                vc.s.j(aVar2);
                xoj.a aVarA = cVar.o.a();
                vc.s.j(aVarA);
                x8h.k kVarD = cVar.f256978p.d();
                ld5.b bVarB2 = cVar.k.b();
                vc.s.j(bVarB2);
                myj.e eVar2 = (myj.e) ((nyj.c) hVar).K.get();
                vc.s.j(eVar2);
                return new ts5.n(gVarD, eVar, aVarH, aVar2, aVarA, kVarD, bVarB2, eVar2, bVar.a(), bVar.b());
            case 8:
                m0k.e eVar3 = (m0k.e) cVar.f256980r.H.get();
                vc.s.j(eVar3);
                return new ws5.h(eVar3, new a1k.b());
            case 9:
                r2d.h hVarA = cVar.f256981s.a();
                vc.s.j(hVarA);
                r2d.t factory3 = (r2d.t) cVar.f256981s.f180472h.get();
                vc.s.j(factory3);
                ms5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return oyj.c.p(hVarA, new jid.z(factory3.f251121a, new r2d.p(factory3.f251122b)), new ls5.a());
            case 10:
                r2d.h hVarA2 = cVar.f256981s.a();
                vc.s.j(hVarA2);
                r2d.t factory4 = (r2d.t) cVar.f256981s.f180472h.get();
                vc.s.j(factory4);
                ms5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return oyj.c.i(hVarA2, new jid.z(factory4.f251121a, new r2d.p(factory4.f251122b)), new ls5.a());
            case 11:
                g3d.a factory5 = (g3d.a) cVar.f256982t.f180694p.get();
                vc.s.j(factory5);
                jpc.e widgetDataProvider = cVar.n();
                zs5.a watchlistWidgetConfigProvider = new zs5.a();
                xv5.c cVarA = cVar.u.a();
                vc.s.j(cVarA);
                bt5.d symbolWidgetConfigProvider = new bt5.d(cVarA);
                ry5.p standaloneSymbolCustomisationScreenProvider = (ry5.p) cVar.f256968g.I.get();
                vc.s.j(standaloneSymbolCustomisationScreenProvider);
                ct5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(standaloneSymbolCustomisationScreenProvider, "standaloneSymbolCustomisationScreenProvider");
                dcl.q assetSelectorScreenProvider = new dcl.q(standaloneSymbolCustomisationScreenProvider);
                Intrinsics.checkNotNullParameter(factory5, "factory");
                Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
                Intrinsics.checkNotNullParameter(watchlistWidgetConfigProvider, "watchlistWidgetConfigProvider");
                Intrinsics.checkNotNullParameter(symbolWidgetConfigProvider, "symbolWidgetConfigProvider");
                Intrinsics.checkNotNullParameter(assetSelectorScreenProvider, "assetSelectorScreenProvider");
                return g3d.a.a(widgetDataProvider, assetSelectorScreenProvider, symbolWidgetConfigProvider, watchlistWidgetConfigProvider);
            case 12:
                s3d.l lVarB = cVar.f256982t.b();
                vc.s.j(lVarB);
                return vtc.p0.s(lVarB, cVar.n(), new zs5.a());
            case 13:
                s3d.l lVarB2 = cVar.f256982t.b();
                vc.s.j(lVarB2);
                return vtc.p0.q(lVarB2, cVar.n(), new zs5.a());
            case 14:
                s3d.l lVarB3 = cVar.f256982t.b();
                vc.s.j(lVarB3);
                return vtc.p0.A(lVarB3, cVar.n(), new zs5.a());
            case 15:
                s3d.l lVarB4 = cVar.f256982t.b();
                vc.s.j(lVarB4);
                return vtc.p0.k(lVarB4, cVar.n(), new zs5.a());
            case 16:
                ufm.d factory6 = cVar.v.a();
                nd.p widgetDataProvider2 = cVar.o();
                Intrinsics.checkNotNullParameter(factory6, "factory");
                Intrinsics.checkNotNullParameter(widgetDataProvider2, "widgetDataProvider");
                return factory6.f(widgetDataProvider2);
            case 17:
                ufm.d factory7 = cVar.v.a();
                nd.p widgetDataProvider3 = cVar.o();
                Intrinsics.checkNotNullParameter(factory7, "factory");
                Intrinsics.checkNotNullParameter(widgetDataProvider3, "widgetDataProvider");
                return factory7.f(widgetDataProvider3);
            case 18:
                r9h.a aVar3 = cVar.f256984x;
                s9h.c factory8 = new s9h.c();
                b9k.f assetWidgetFactory = aVar3.a();
                us5.a availabilityProvider = new us5.a();
                wr5.b widgetConfigProvider2 = new wr5.b();
                Intrinsics.checkNotNullParameter(factory8, "factory");
                Intrinsics.checkNotNullParameter(assetWidgetFactory, "assetWidgetFactory");
                Intrinsics.checkNotNullParameter(availabilityProvider, "availabilityProvider");
                Intrinsics.checkNotNullParameter(widgetConfigProvider2, "widgetConfigProvider");
                q9h.c presentationModel = new q9h.c((su9.c) assetWidgetFactory.f13816a, (d9h.a) assetWidgetFactory.f13818c, (e9h.d) assetWidgetFactory.d);
                q9h.a mapper = new q9h.a(new jbh.b((t70.b) assetWidgetFactory.f13817b, (nbh.f) assetWidgetFactory.f));
                Intrinsics.checkNotNullParameter(availabilityProvider, "availabilityProvider");
                Intrinsics.checkNotNullParameter(widgetConfigProvider2, "widgetConfigProvider");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return new s9h.h(availabilityProvider, widgetConfigProvider2, presentationModel, mapper);
            case 19:
                r2d.h hVarA3 = cVar.f256981s.a();
                vc.s.j(hVarA3);
                return oyj.c.d(hVarA3, new ls5.b(), new ls5.a());
            case 20:
                b9k.f cryptoReceiveWidgetContractFactory2 = cVar.f256963b.a();
                ij5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(cryptoReceiveWidgetContractFactory2, "cryptoReceiveWidgetContractFactory");
                return (nj5.a) cryptoReceiveWidgetContractFactory2.f13819g;
            case 21:
                g3d.a factory9 = (g3d.a) cVar.f256982t.f180694p.get();
                vc.s.j(factory9);
                zjh.f titleProvider = new zjh.f(cVar.n());
                ct5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory9, "factory");
                Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
                Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
                return new f3d.a(titleProvider, 0);
            case 22:
                r9h.a aVar4 = cVar.f256984x;
                s9h.c factory10 = new s9h.c();
                wr5.a catalogueConfigProvider = new wr5.a();
                Intrinsics.checkNotNullParameter(factory10, "factory");
                Intrinsics.checkNotNullParameter(catalogueConfigProvider, "catalogueConfigProvider");
                Intrinsics.checkNotNullParameter(catalogueConfigProvider, "catalogueConfigProvider");
                return new a67.a(catalogueConfigProvider);
            case 23:
                prl.e factory11 = ((jaj.b) cVar.f256965c).a();
                iaj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory11, "factory");
                return (saj.a) factory11.e;
            case 24:
                xi5.a api3 = cVar.d;
                vi5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(api3, "api");
                return (yi5.a) api3.a().e;
            case 25:
                ufm.d factory12 = cVar.v.a();
                nd.p widgetDataProvider4 = cVar.o();
                Intrinsics.checkNotNullParameter(factory12, "factory");
                Intrinsics.checkNotNullParameter(widgetDataProvider4, "widgetDataProvider");
                Intrinsics.checkNotNullParameter(widgetDataProvider4, "widgetDataProvider");
                return new cdh.a(widgetDataProvider4);
            case 26:
                s3d.l lVarB5 = cVar.f256982t.b();
                vc.s.j(lVarB5);
                return vtc.p0.g(lVarB5, cVar.n(), new zs5.a());
            case 27:
                s3d.l lVarB6 = cVar.f256982t.b();
                vc.s.j(lVarB6);
                return vtc.p0.z(lVarB6, new zjh.f(cVar.n()));
            case 28:
                return new ps5.d();
            case 29:
                return new ps5.b();
            case 30:
                return new ps5.a();
            case 31:
                return new ps5.c();
            case 32:
                f4h.a widgetsInteractorFactory = cVar.f256961a.b();
                csh.k widgetsDependenciesApi = (csh.k) cVar.l0.get();
                Intrinsics.checkNotNullParameter(widgetsInteractorFactory, "widgetsInteractorFactory");
                Intrinsics.checkNotNullParameter(widgetsDependenciesApi, "widgetsDependenciesApi");
                return widgetsInteractorFactory.i(widgetsDependenciesApi);
            case 33:
                ss5.a cryptoFeedWidgetsEventDispatcher = (ss5.a) cVar.H.get();
                ish.a0 widgetsUiInteractor = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor);
                ks5.g factory13 = (ks5.g) cVar.f256976n0.get();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(factory13, "factory");
                factory13.getClass();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                return new os5.e(cryptoFeedWidgetsEventDispatcher, widgetsUiInteractor, factory13.f189124a);
            case 34:
                l93.f fVarJ2 = cVar.f256969h.j();
                vc.s.j(fVarJ2);
                return new ks5.g(fVarJ2);
            case 35:
                ss5.a cryptoFeedWidgetsEventDispatcher2 = (ss5.a) cVar.H.get();
                ish.a0 widgetsUiInteractor2 = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor2);
                ks5.g factory14 = (ks5.g) cVar.f256976n0.get();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher2, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor2, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(factory14, "factory");
                factory14.getClass();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher2, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor2, "widgetsUiInteractor");
                return new os5.e(cryptoFeedWidgetsEventDispatcher2, widgetsUiInteractor2, factory14.f189124a);
            case 36:
                ss5.a cryptoFeedWidgetsEventDispatcher3 = (ss5.a) cVar.H.get();
                ish.a0 widgetsUiInteractor3 = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor3);
                ks5.g factory15 = (ks5.g) cVar.f256976n0.get();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher3, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor3, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(factory15, "factory");
                factory15.getClass();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher3, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor3, "widgetsUiInteractor");
                return new ts5.p(cryptoFeedWidgetsEventDispatcher3, widgetsUiInteractor3, factory15.f189124a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        ryc.b bVar = (ryc.b) this.f247276c;
        int i = this.f247275b;
        switch (i) {
            case 0:
                hri.b bVar2 = bVar.f258291a;
                return new ifm.b();
            case 1:
                hri.b bVar3 = bVar.f258291a;
                return new iri.j();
            case 2:
                return new pyc.h0();
            case 3:
                return new cn.e();
            case 4:
                return new um.c();
            case 5:
                bVar.getClass();
                return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 6:
                return new ln.c();
            case 7:
                return new ym.d();
            case 8:
                return new mm.d();
            case 9:
                e4m.e eVar = bVar.f258302r;
                l70.e eVar2 = bVar.f258293c;
                pyc.f fVar = (pyc.f) eVar.get();
                t70.g gVarO = eVar2.o();
                vc.s.j(gVarO);
                s70.a aVarM = eVar2.m();
                vc.s.j(aVarM);
                return new pyc.g0(fVar, gVarO, aVarM, (hn.h) bVar.f258299n.get(), (g3l.a) bVar.f258303s.get());
            case 10:
                e4m.e eVar3 = bVar.k;
                gyc.a aVar = bVar.f258292b;
                jhf.a aVar2 = bVar.d;
                pyc.i iVar = (pyc.i) eVar3.get();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar2).c();
                vc.s.j(aVarC);
                kpj.f fVarB = aVar.b();
                ks0.n nVarA = bVar.e.a();
                kza.a aVarA = bVar.f.a();
                kpj.f fVarB2 = aVar.b();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) aVar2).c();
                vc.s.j(aVarC2);
                return new pyc.t(iVar, aVarC, fVarB, nVarA, aVarA, new zq.a(fVarB2, aVarC2), (ifm.b) bVar.i.get());
            case 11:
                return new g3l.g();
            case 12:
                return new sm.e();
            case 13:
                return new om.c();
            case 14:
                thf.m mVarG = bVar.f258294g.g();
                vc.s.j(mVarG);
                thf.d dVarD = bVar.f258294g.d();
                vc.s.j(dVarD);
                return new pyc.n(mVarG, dVarD);
            case 15:
                return new mxc.c();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        s3i.a aVar = (s3i.a) this.f247276c;
        int i = this.f247275b;
        if (i == 0) {
            sri.m mVar = (sri.m) aVar.f259693c.get();
            gte.a aVarB = aVar.f259692b.b();
            vc.s.j(aVarB);
            return new q3i.a(aVarB, mVar);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        Context context = aVar.f259691a;
        s3i.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    private final Object g() {
        s79.b bVar = (s79.b) this.f247276c;
        int i = this.f247275b;
        if (i == 0) {
            return new u79.a((q79.d) bVar.f.get());
        }
        if (i == 1) {
            return new q79.d((RetailOffboardingService) bVar.f260593c.get(), (v79.a) bVar.d.get(), (ne0.j) bVar.e.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new v79.b();
            }
            if (i != 4) {
                throw new AssertionError(i);
            }
            s79.d.Companion.getClass();
            return new ne0.d();
        }
        Retrofit retrofit = ((c21.b) bVar.f260591a).i();
        vc.s.j(retrofit);
        s79.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(RetailOffboardingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RetailOffboardingService retailOffboardingService = (RetailOffboardingService) objCreate;
        vc.s.k(retailOffboardingService);
        return retailOffboardingService;
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object oVar;
        Object fVar;
        Object hVar;
        Object bVar;
        Object fVar2;
        Object mVar;
        switch (this.f247274a) {
            case 0:
                b2 b2Var = (b2) this.f247276c;
                PickerScreenContract$InputData pickerScreenContract$InputData = b2Var.f247246b;
                int i = this.f247275b;
                if (i == 0) {
                    return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (zp7.c) new sp7.b(), "CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) b2Var.d.f247363s.get())), pickerScreenContract$InputData, (jki.p) b2Var.e.get());
                }
                if (i == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData, b2Var.f247247c);
                }
                throw new AssertionError(i);
            case 1:
                b2 b2Var2 = (b2) this.f247276c;
                PickerScreenContract$InputData pickerScreenContract$InputData2 = b2Var2.f247246b;
                int i2 = this.f247275b;
                if (i2 == 0) {
                    return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (zp7.c) new sp7.b(), "CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) b2Var2.d.f247363s.get())), pickerScreenContract$InputData2, (jki.p) b2Var2.e.get());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData2, b2Var2.f247247c);
                }
                throw new AssertionError(i2);
            case 2:
                qof.c cVar = (qof.c) this.f247276c;
                int i3 = this.f247275b;
                switch (i3) {
                    case 0:
                        hri.b bVar2 = cVar.f248176a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar3 = cVar.f248176a;
                        return new iri.j();
                    case 2:
                        return new pof.c();
                    case 3:
                        e4m.e eVar = cVar.X;
                        jm4.r rVar = cVar.F;
                        ite.a aVar2 = cVar.A;
                        lal.k kVar = cVar.f248194t;
                        c21.e eVar2 = cVar.k;
                        usg.a aVar3 = cVar.e;
                        jhf.a aVar4 = cVar.f248180c;
                        pof.b bVar4 = (pof.b) eVar.get();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar4).c();
                        vc.s.j(aVarC);
                        eqj.g gVarG = ((dqj.r) cVar.d).g();
                        vc.s.j(gVarG);
                        wsg.n nVarB = aVar3.b();
                        cl3.a aVarD = cVar.f.d();
                        vc.s.j(aVarD);
                        k61.a aVarE = cVar.f248183g.e();
                        vc.s.j(aVarE);
                        d3j.b bVarE = ((b3j.p) cVar.f248184h).e();
                        xua.a aVarA = cVar.i.a();
                        vc.s.j(aVarA);
                        mjf.w wVar = (mjf.w) cVar.Y.get();
                        u71.a aVarG = ((c21.b) eVar2).g();
                        vc.s.j(aVarG);
                        vv9.c cVarC = ((s6k.b) cVar.f248187l).c();
                        vc.s.j(cVarC);
                        o71.a aVarA2 = ((c21.b) eVar2).a();
                        w39.b bVarA = cVar.f248188m.a();
                        vc.s.j(bVarA);
                        ang.f fVarE = cVar.f248189n.e();
                        ffk.t tVarF = cVar.o.f();
                        vc.s.j(tVarF);
                        ifm.b bVar5 = (ifm.b) cVar.V.get();
                        c61.a aVar5 = (c61.a) cVar.f248190p.M.get();
                        vc.s.j(aVar5);
                        g6e.d dVarB = cVar.f248191q.b();
                        vc.s.j(dVarB);
                        thf.m mVarG = cVar.f248192r.g();
                        vc.s.j(mVarG);
                        mhf.a aVar6 = (mhf.a) ((bjf.a) aVar4).u0.get();
                        vc.s.j(aVar6);
                        zxd.c cVarA = ((eyd.b) cVar.f248193s).a();
                        vc.s.j(cVarA);
                        fal.b bVar6 = (fal.b) kVar.f193459j.get();
                        vc.s.j(bVar6);
                        vtc.k0 k0Var = cVar.u;
                        ufm.d dVarC = k0Var.c();
                        l80.e eVarH = k0Var.e.h();
                        vc.s.j(eVarH);
                        r10.r rVar2 = new r10.r(dVarC, new xtc.a(eVarH), k0Var.d());
                        yig.a aVar7 = (yig.a) cVar.v.f126890n.get();
                        vc.s.j(aVar7);
                        eli.j jVarA = cVar.f248195w.a();
                        toa.a aVarA3 = cVar.f248196x.a();
                        vc.s.j(aVarA3);
                        wif.a aVarA4 = cVar.f248197y.a();
                        xoj.a aVarA5 = cVar.z.a();
                        vc.s.j(aVarA5);
                        gte.a aVarB = aVar2.b();
                        vc.s.j(aVarB);
                        k7i.i iVarA = kVar.a();
                        uhf.a aVar8 = (uhf.a) cVar.Z.get();
                        mjf.l0 l0Var = (mjf.l0) cVar.f248181d0.get();
                        ynf.l lVar = new ynf.l();
                        nhf.a aVarA6 = cVar.C.a();
                        vc.s.j(aVarA6);
                        ppg.a aVarA7 = ((wpg.l) cVar.D).a();
                        vc.s.j(aVarA7);
                        djb.q qVarC = cVar.E.c();
                        vc.s.j(qVarC);
                        al4.m mVarR = rVar.r();
                        vc.s.j(mVarR);
                        fm4.a aVarA8 = cVar.G.a();
                        al4.e eVarP = rVar.p();
                        vc.s.j(eVarP);
                        bd3.a aVarA9 = cVar.H.a();
                        vc.s.j(aVarA9);
                        a31.a aVarA10 = cVar.I.f234384a.a();
                        eub.a aVarA11 = cVar.J.a();
                        vc.s.j(aVarA11);
                        vo1.c cVarA2 = ((up1.e) cVar.K).a();
                        vc.s.j(cVarA2);
                        gte.a aVarB2 = aVar2.b();
                        vc.s.j(aVarB2);
                        vnf.a aVar9 = new vnf.a(aVarB2);
                        bej.m mVar2 = (bej.m) cVar.L.F0.get();
                        vc.s.j(mVar2);
                        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t((cn.e) cVar.f248182e0.get(), (ym.d) cVar.f0.get(), (um.c) cVar.g0.get(), (ifm.b) cVar.V.get());
                        cw9.d dVarA = cVar.M.a();
                        co9.b bVarB = cVar.N.b();
                        vc.s.j(bVarB);
                        wnf.b bVar7 = (wnf.b) cVar.f248185h0.get();
                        xqe.b bVarA2 = cVar.T.a();
                        vc.s.j(bVarA2);
                        return new pof.j(bVar4, aVarC, gVarG, nVarB, aVarD, aVarE, bVarE, aVarA, wVar, aVarG, cVarC, aVarA2, bVarA, fVarE, tVarF, bVar5, aVar5, dVarB, mVarG, aVar6, cVarA, bVar6, rVar2, aVar7, jVarA, aVarA3, aVarA4, aVarA5, aVarB, iVarA, aVar8, l0Var, lVar, aVarA6, aVarA7, qVarC, mVarR, aVarA8, eVarP, aVarA9, aVarA10, aVarA11, cVarA2, aVar9, mVar2, tVar, dVarA, bVarB, bVar7, bVarA2, aVar3.a(), cVar.S.i());
                    case 4:
                        wsg.n walletsInteractor = cVar.e.b();
                        hj8.a juniorProfileInteractor = cVar.f248186j.a();
                        vc.s.j(juniorProfileInteractor);
                        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
                        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
                        return new mjf.w();
                    case 5:
                        return new ujf.a();
                    case 6:
                        return new mjf.l0((xif.z) cVar.c0.get());
                    case 7:
                        return new xif.z((WarrantService) cVar.f248177a0.get(), new ne0.d(), (hif.c) cVar.f248179b0.get());
                    case 8:
                        Retrofit retrofit = ((nj0.d) cVar.B).f();
                        qof.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(WarrantService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        WarrantService warrantService = (WarrantService) objCreate;
                        vc.s.k(warrantService);
                        return warrantService;
                    case 9:
                        return new hif.d();
                    case 10:
                        return new cn.e();
                    case 11:
                        return new ym.d();
                    case 12:
                        return new um.c();
                    case 13:
                        l70.e eVar3 = cVar.f248178b;
                        l70.e eVar4 = cVar.f248178b;
                        jr9.a aVar10 = cVar.O;
                        ite.a aVar11 = cVar.A;
                        djf.c cVar2 = cVar.f248192r;
                        qd0.b bVarN = eVar3.n();
                        vc.s.j(bVarN);
                        u80.m mVar3 = new u80.m(bVarN);
                        thf.m mVarG2 = cVar2.g();
                        vc.s.j(mVarG2);
                        thf.d dVarD = cVar2.d();
                        vc.s.j(dVarD);
                        thf.c cVarC2 = cVar2.c();
                        vc.s.j(cVarC2);
                        gte.a aVarB3 = aVar11.b();
                        vc.s.j(aVarB3);
                        vnf.a aVar12 = new vnf.a(aVarB3);
                        nq9.a aVarA12 = aVar10.a();
                        vc.s.j(aVarA12);
                        nq9.e eVar5 = (nq9.e) aVar10.f.get();
                        vc.s.j(eVar5);
                        w0a.h hVar2 = (w0a.h) ((j1a.i) cVar.P).u.get();
                        vc.s.j(hVar2);
                        gte.a aVarB4 = aVar11.b();
                        vc.s.j(aVarB4);
                        whf.n nVarB2 = cVar2.b();
                        vc.s.j(nVarB2);
                        l4i.a aVar13 = new l4i.a();
                        u80.t tVarU = eVar4.u();
                        vc.s.j(tVarU);
                        v2k.c cVarA3 = cVar.Q.a();
                        nmc.d dVarD2 = cVar.R.d();
                        qd0.b bVarN2 = eVar4.n();
                        vc.s.j(bVarN2);
                        gi0.a aVar14 = new gi0.a();
                        cm4.f fVarF = cVar.G.f();
                        wnf.g gVar = new wnf.g();
                        wa7.p pVarE = cVar.S.e();
                        thf.g gVarE = cVar2.e();
                        vc.s.j(gVarE);
                        return new wnf.e(mVar3, mVarG2, dVarD, cVarC2, aVar12, aVarA12, eVar5, hVar2, aVarB4, nVarB2, aVar13, tVarU, cVarA3, dVarD2, bVarN2, aVar14, fVarF, gVar, pVarE, gVarE);
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                qqk.a aVar15 = (qqk.a) this.f247276c;
                int i5 = this.f247275b;
                if (i5 == 0) {
                    mli.e eVarB = ((j51.a) aVar15.f248567a).b();
                    vc.s.j(eVarB);
                    return new rqk.e(eVarB, (sri.m) aVar15.f248569c.get());
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                Context context = aVar15.f248568b;
                qqk.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            case 4:
                qsh.b bVar8 = (qsh.b) this.f247276c;
                osh.a aVar16 = bVar8.f248841b;
                csh.k widgetsDependenciesApi = bVar8.d;
                int i6 = this.f247275b;
                if (i6 == 0) {
                    return olc.c.C(aVar16, bVar8.f248842c, widgetsDependenciesApi);
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        return olc.c.B(aVar16, widgetsDependenciesApi);
                    }
                    throw new AssertionError(i6);
                }
                ish.b widgetContentInteractor = (ish.b) bVar8.f248843g.get();
                Intrinsics.checkNotNullParameter(widgetsDependenciesApi, "widgetsDependenciesApi");
                Intrinsics.checkNotNullParameter(widgetContentInteractor, "widgetContentInteractor");
                return new ish.a(widgetsDependenciesApi.b(), widgetsDependenciesApi.d(), widgetContentInteractor);
            case 5:
                qve.k kVar2 = (qve.k) this.f247276c;
                ee0.a aVar17 = kVar2.f249606c;
                nj0.a aVar18 = kVar2.f249602a;
                int i21 = this.f247275b;
                switch (i21) {
                    case 0:
                        aVar = new sve.a((zue.a) kVar2.f249605b0.get());
                        break;
                    case 1:
                        ik0.b retrofitFactory = ((nj0.d) aVar18).m();
                        vc.s.j(retrofitFactory);
                        Json baseJson = fe0.d.a();
                        ove.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                        Object objCreate2 = ik0.b.a(retrofitFactory, null, null, p.a.g(ulm.b1.Companion, "application/json", baseJson), null, 27).create(BrazilInboundStoredMethodDetailsService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        BrazilInboundStoredMethodDetailsService brazilInboundStoredMethodDetailsService = (BrazilInboundStoredMethodDetailsService) objCreate2;
                        vc.s.k(brazilInboundStoredMethodDetailsService);
                        aVar = new zue.a(brazilInboundStoredMethodDetailsService, (ne0.j) kVar2.Z.get(), (ue0.c) kVar2.f249603a0.get());
                        break;
                    case 2:
                        return new ne0.d();
                    case 3:
                        je0.d mapper = aVar17.b();
                        vc.s.j(mapper);
                        yk0.a dbSessionProvider = kVar2.d.b();
                        vc.s.j(dbSessionProvider);
                        xe0.f storageFactory = aVar17.f();
                        vc.s.j(storageFactory);
                        ove.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, dbSessionProvider, "brazil_inbound_stored_method_details_storage", mapper, 0, null, 56);
                    case 4:
                        TopupService topupService = (TopupService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) kVar2.f249608e0.get(), "retrofit", TopupService.class, "create(...)");
                        vc.s.k(topupService);
                        return topupService;
                    case 5:
                        ik0.b retrofitFactory2 = ((nj0.d) aVar18).m();
                        vc.s.j(retrofitFactory2);
                        OkHttpClient okHttpClient = (OkHttpClient) kVar2.f249607d0.get();
                        Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                        Retrofit retrofitA = ik0.b.a(retrofitFactory2, okHttpClient, null, null, null, 30);
                        vc.s.k(retrofitA);
                        return retrofitA;
                    case 6:
                        xj0.i okHttpClientFactory = ((nj0.d) aVar18).l();
                        vc.s.j(okHttpClientFactory);
                        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
                        return xj0.i.a(okHttpClientFactory, null, true, false, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                    default:
                        throw new AssertionError(i21);
                }
                return aVar;
            case 6:
                qve.w wVar2 = (qve.w) this.f247276c;
                nj0.a aVar19 = wVar2.f249665a;
                ite.a aVar20 = wVar2.e;
                an0.c cVar3 = wVar2.f249667c;
                ove.t tVar2 = wVar2.f;
                je6.g gVar2 = wVar2.i;
                ee0.a aVar21 = wVar2.f249666b;
                int i22 = this.f247275b;
                switch (i22) {
                    case 0:
                        hve.b bVar9 = (hve.b) wVar2.z.get();
                        xg6.x xVarA = wVar2.f249669h.a();
                        vc.s.j(xVarA);
                        ng0.b bVar10 = (ng0.b) tVar2.W.get();
                        vc.s.j(bVar10);
                        p71.a aVar22 = (p71.a) tVar2.N.get();
                        vc.s.j(aVar22);
                        xg6.l lVarD = ((xf6.t) gVar2).d();
                        vc.s.j(lVarD);
                        gg6.a aVarG2 = ((xf6.t) gVar2).g();
                        n8b.a aVarA13 = wVar2.f249670j.a();
                        vc.s.j(aVarA13);
                        return new e0f.r1(bVar9, xVarA, bVar10, aVar22, lVarD, aVarG2, aVarA13);
                    case 1:
                        ne0.j jVar = (ne0.j) wVar2.u.get();
                        TopupMethodsService topupMethodsService = (TopupMethodsService) wVar2.v.get();
                        StoredMethodService storedMethodService = (StoredMethodService) wVar2.f249679w.get();
                        nue.f fVar3 = new nue.f();
                        nue.f dtoMapper = new nue.f();
                        Intrinsics.checkNotNullParameter(dtoMapper, "dtoMapper");
                        nue.d dVar = new nue.d();
                        nue.a aVar23 = new nue.a();
                        nue.b bVar11 = new nue.b();
                        kve.a aVar24 = (kve.a) wVar2.f249681y.get();
                        xoj.a aVarA14 = wVar2.d.a();
                        vc.s.j(aVarA14);
                        gte.a aVarB5 = aVar20.b();
                        vc.s.j(aVarB5);
                        ng0.b bVar12 = (ng0.b) tVar2.W.get();
                        vc.s.j(bVar12);
                        awe.c cVar4 = new awe.c(bVar12);
                        CoroutineScope coroutineScopeA = wVar2.f249668g.a();
                        vc.s.j(coroutineScopeA);
                        oVar = new hve.o(jVar, topupMethodsService, storedMethodService, fVar3, dVar, aVar23, bVar11, aVar24, aVarA14, aVarB5, cVar4, coroutineScopeA);
                        break;
                    case 2:
                        return new ne0.d();
                    case 3:
                        Retrofit retrofit3 = ((nj0.d) aVar19).f();
                        ove.v0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Object objCreate3 = retrofit3.create(TopupMethodsService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        TopupMethodsService topupMethodsService2 = (TopupMethodsService) objCreate3;
                        vc.s.k(topupMethodsService2);
                        return topupMethodsService2;
                    case 4:
                        return olc.c.t(((nj0.d) aVar19).f());
                    case 5:
                        oVar = new kve.b((ue0.c) wVar2.f249680x.get());
                        break;
                    case 6:
                        je0.d mapper2 = aVar21.b();
                        vc.s.j(mapper2);
                        yk0.a dbSessionProvider2 = cVar3.b();
                        vc.s.j(dbSessionProvider2);
                        xe0.f storageFactory2 = aVar21.f();
                        vc.s.j(storageFactory2);
                        ove.v0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(dbSessionProvider2, "dbSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, dbSessionProvider2, "topup_methods_storage", mapper2, 0, null, 56);
                    case 7:
                        je6.h hVarC = ((xf6.t) gVar2).c();
                        vc.s.j(hVarC);
                        sze.d dVar2 = new sze.d(new sze.b());
                        gte.a aVarB6 = aVar20.b();
                        vc.s.j(aVarB6);
                        return new aze.b(hVarC, dVar2, aVarB6);
                    case 8:
                        je0.d dVarB2 = aVar21.b();
                        vc.s.j(dVarB2);
                        yk0.a aVarB7 = cVar3.b();
                        vc.s.j(aVarB7);
                        xe0.f fVarF2 = aVar21.f();
                        vc.s.j(fVarF2);
                        return olc.c.k(dVarB2, fVarF2, aVarB7);
                    default:
                        throw new AssertionError(i22);
                }
                return oVar;
            case 7:
                int i32 = this.f247275b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new qy.b();
                    }
                    throw new AssertionError(i32);
                }
                ey.b bVar13 = (ey.b) this.f247276c;
                ly.c cVar5 = bVar13.f130478b;
                y80.a aVarR = bVar13.f130479c.r();
                vc.s.j(aVarR);
                return new com.revolut.camerakit.revolut.ui.flow.b(cVar5, aVarR);
            case 8:
                qxc.a aVar25 = (qxc.a) this.f247276c;
                int i33 = this.f247275b;
                if (i33 == 0) {
                    fVar = new pxc.f(aVar25.a(), new gde.d(), ((h30.n) aVar25.f250063b).t());
                } else if (i33 == 1) {
                    fVar = new pxc.i(aVar25.a());
                } else if (i33 == 2) {
                    sri.m mVarA = aVar25.a();
                    gte.a aVarB8 = aVar25.f250064c.b();
                    vc.s.j(aVarB8);
                    fVar = new pxc.k(aVarB8, mVarA);
                } else if (i33 == 3) {
                    fVar = new pxc.m(aVar25.a());
                } else {
                    if (i33 != 4) {
                        if (i33 != 5) {
                            throw new AssertionError(i33);
                        }
                        Retrofit retrofit4 = ((nj0.d) aVar25.d).f();
                        rxc.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate4 = retrofit4.create(WarrantDetailsService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                        WarrantDetailsService warrantDetailsService = (WarrantDetailsService) objCreate4;
                        vc.s.k(warrantDetailsService);
                        return warrantDetailsService;
                    }
                    fVar = new pxc.r(new qr0.i((WarrantDetailsService) aVar25.i.get()), aVar25.a());
                }
                return fVar;
            case 9:
                qy2.a aVar26 = (qy2.a) this.f247276c;
                da3.j jVar2 = aVar26.f250112c;
                int i43 = this.f247275b;
                switch (i43) {
                    case 0:
                        return new ifm.b();
                    case 1:
                        return new iri.j();
                    case 2:
                        return new jy2.n();
                    case 3:
                        return new ln.c();
                    case 4:
                        jy2.h hVar3 = (jy2.h) aVar26.o.get();
                        ifm.b bVar14 = (ifm.b) aVar26.f250114h.get();
                        l93.f fVarJ = jVar2.j();
                        vc.s.j(fVarJ);
                        ln.a aVar27 = (ln.a) aVar26.k.get();
                        s70.a aVarM = aVar26.f250111b.m();
                        vc.s.j(aVarM);
                        return new py2.g(hVar3, bVar14, fVarJ, aVar27, aVarM);
                    case 5:
                        l93.f fVarJ2 = jVar2.j();
                        vc.s.j(fVarJ2);
                        jy2.k kVar3 = (jy2.k) aVar26.f250115j.get();
                        sf0.h hVarB = aVar26.d.b();
                        vc.s.j(hVarB);
                        v60.e eVarA = aVar26.e.a();
                        vc.s.j(eVarA);
                        return new py2.c(fVarJ2, kVar3, hVarB, eVarA, new com.google.firebase.messaging.t((cn.e) aVar26.f250116l.get(), (ym.d) aVar26.f250117m.get(), (um.c) aVar26.f250118n.get(), (ifm.b) aVar26.f250114h.get()), 0);
                    case 6:
                        return new cn.e();
                    case 7:
                        return new ym.d();
                    case 8:
                        return new um.c();
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                qy7.c cVar6 = (qy7.c) this.f247276c;
                int i59 = this.f247275b;
                switch (i59) {
                    case 0:
                        hri.b bVar15 = cVar6.f250187a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar16 = cVar6.f250187a;
                        return new iri.j();
                    case 2:
                        return new com.revolut.feature.chooser.e();
                    case 3:
                        hVar = new mx7.h((mx7.i) cVar6.f250193l.get(), (com.revolut.feature.chooser.c) cVar6.f250195n.get());
                        return hVar;
                    case 4:
                        hVar = new mx7.i((rz7.o) cVar6.k.get(), (rz7.e) cVar6.k.get());
                        return hVar;
                    case 5:
                        return new ly7.k();
                    case 6:
                        hVar = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) cVar6.f250192j.get(), (qi3.o) cVar6.f250194m.get());
                        return hVar;
                    case 7:
                        mx7.i iVar = (mx7.i) cVar6.f250193l.get();
                        com.revolut.feature.chooser.d dVar3 = (com.revolut.feature.chooser.d) cVar6.f250192j.get();
                        fx7.f fVarB = cVar6.f250189c.b();
                        vc.s.j(fVarB);
                        t70.g gVarO = cVar6.f250188b.o();
                        vc.s.j(gVarO);
                        hVar = new mx7.c(iVar, dVar3, fVarB, gVarO);
                        return hVar;
                    case 8:
                        hVar = new qi3.n((com.revolut.feature.chooser.c) cVar6.f250195n.get());
                        return hVar;
                    case 9:
                        return new hy7.k();
                    case 10:
                        return new ln.c();
                    case 11:
                        hVar = new hy7.g((hy7.c) cVar6.f250197q.get());
                        return hVar;
                    case 12:
                        hVar = new hy7.j((ln.a) cVar6.f250198r.get());
                        return hVar;
                    case 13:
                        return new cn.e();
                    case 14:
                        return new um.c();
                    case 15:
                        e4m.e eVar6 = cVar6.f250201w;
                        ex7.a aVar28 = cVar6.f250189c;
                        g3l.a aVar29 = (g3l.a) eVar6.get();
                        fx7.l lVarD2 = aVar28.d();
                        vc.s.j(lVarD2);
                        ang.f fVarE2 = cVar6.d.e();
                        fx7.f fVarB2 = aVar28.b();
                        vc.s.j(fVarB2);
                        fx7.a aVarA15 = aVar28.a();
                        vc.s.j(aVarA15);
                        ly7.b bVar17 = (ly7.b) cVar6.f250202x.get();
                        ly7.c cVar7 = (ly7.c) cVar6.k.get();
                        ry7.q qVar = new ry7.q();
                        sf0.h hVarB2 = cVar6.f.b();
                        vc.s.j(hVarB2);
                        hVar = new my7.d(aVar29, lVarD2, fVarE2, fVarB2, aVarA15, bVar17, cVar7, qVar, hVarB2, cVar6.a());
                        return hVar;
                    case 16:
                        return new g3l.g();
                    case 17:
                        hVar = new ly7.j((ln.a) cVar6.f250198r.get(), cVar6.e.g());
                        return hVar;
                    case 18:
                        return new ym.d();
                    case 19:
                        fx7.f fVarB3 = cVar6.f250189c.b();
                        vc.s.j(fVarB3);
                        fx7.a aVarA16 = cVar6.f250189c.a();
                        vc.s.j(aVarA16);
                        ly7.b bVar18 = (ly7.b) cVar6.f250202x.get();
                        g3l.a aVar30 = (g3l.a) cVar6.f250201w.get();
                        sf0.h hVarB3 = cVar6.f.b();
                        vc.s.j(hVarB3);
                        bVar = new my7.b(fVarB3, aVarA16, bVar18, aVar30, hVarB3, cVar6.a());
                        return bVar;
                    case 20:
                        cVar6.getClass();
                        hVar = new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                        return hVar;
                    case 21:
                        return new mm.d();
                    case 22:
                        fx7.f fVarB4 = cVar6.f250189c.b();
                        vc.s.j(fVarB4);
                        hVar = new du8.b(fVarB4, (ly7.b) cVar6.f250202x.get(), cVar6.a());
                        return hVar;
                    case 23:
                        return new sm.e();
                    case 24:
                        return new om.c();
                    case 25:
                        e4m.e eVar7 = cVar6.G;
                        ex7.a aVar31 = cVar6.f250189c;
                        rz7.n nVar = (rz7.n) eVar7.get();
                        rz7.j jVar3 = (rz7.j) cVar6.H.get();
                        rz7.h hVar4 = (rz7.h) cVar6.I.get();
                        rz7.f fVar4 = (rz7.f) cVar6.J.get();
                        rz7.b bVar19 = (rz7.b) cVar6.K.get();
                        rz7.d dVar4 = (rz7.d) cVar6.L.get();
                        rz7.l lVar2 = (rz7.l) cVar6.M.get();
                        fx7.a aVarA17 = aVar31.a();
                        vc.s.j(aVarA17);
                        ifm.b bVar20 = (ifm.b) cVar6.f250191h.get();
                        w80.b bVarJ = cVar6.f250188b.j();
                        vc.s.j(bVarJ);
                        sz7.b bVar21 = new sz7.b(bVarJ);
                        ly7.c cVar8 = (ly7.c) cVar6.k.get();
                        fx7.f fVarB5 = aVar31.b();
                        vc.s.j(fVarB5);
                        fx7.l lVarD3 = aVar31.d();
                        vc.s.j(lVarD3);
                        bVar = new ly7.h(nVar, jVar3, hVar4, fVar4, bVar19, dVar4, lVar2, aVarA17, bVar20, bVar21, cVar8, fVarB5, lVarD3, new ry7.q(), new l08.a());
                        return bVar;
                    case 26:
                        hVar = new rz7.t((rz7.o) cVar6.k.get());
                        return hVar;
                    case 27:
                        hVar = new rz7.r((rz7.k) cVar6.k.get());
                        return hVar;
                    case 28:
                        hVar = new rz7.p((rz7.i) cVar6.k.get());
                        return hVar;
                    case 29:
                        hVar = new com.revolut.feature.insurance_pet.impl.ui.pet.dob.b((rz7.g) cVar6.k.get());
                        return hVar;
                    case 30:
                        hVar = new sz7.d((rz7.c) cVar6.k.get());
                        return hVar;
                    case 31:
                        rz7.e eVar8 = (rz7.e) cVar6.k.get();
                        rz7.o oVar2 = (rz7.o) cVar6.k.get();
                        fx7.f fVarB6 = cVar6.f250189c.b();
                        vc.s.j(fVarB6);
                        hVar = new rz7.a(eVar8, oVar2, fVarB6);
                        return hVar;
                    case 32:
                        hVar = new rz7.s((rz7.m) cVar6.k.get());
                        return hVar;
                    case 33:
                        return new wm.a();
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                int i66 = this.f247275b;
                if (i66 == 0) {
                    qy8.b bVar22 = (qy8.b) this.f247276c;
                    return new com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.a(bVar22.f250250a, (g3l.a) bVar22.d.get(), new bs.a());
                }
                if (i66 == 1) {
                    return new g3l.g();
                }
                throw new AssertionError(i66);
            case 12:
                r1f.a aVar32 = (r1f.a) this.f247276c;
                int i74 = this.f247275b;
                if (i74 == 0) {
                    return new t1f.q(aVar32.f250988a, aVar32.f250989b, aVar32.f250990c, aVar32.d, aVar32.e, aVar32.f, aVar32.f250991g, aVar32.f250992h, aVar32.i, aVar32.f250993j, aVar32.k, aVar32.f250994l, aVar32.f250995m, aVar32.f250996n, aVar32.o, aVar32.f250997p, aVar32.f250998q, aVar32.f251003x, aVar32.u, aVar32.v);
                }
                if (i74 != 1) {
                    if (i74 == 2) {
                        return new t1f.s(aVar32.f250999r, aVar32.f251000s, aVar32.f251001t);
                    }
                    throw new AssertionError(i74);
                }
                t1f.p pVar = (t1f.p) ((t1f.s) aVar32.f251002w.get()).b();
                vc.s.k(pVar);
                return pVar;
            case 13:
                r29.a aVar33 = (r29.a) this.f247276c;
                ecm.q qVar2 = aVar33.f251068a;
                int i92 = this.f247275b;
                if (i92 == 0) {
                    return new t29.w(aVar33.f251069b, qVar2);
                }
                if (i92 == 1) {
                    return new gpc.b(qVar2, aVar33.f251070c, aVar33.e);
                }
                if (i92 != 2) {
                    throw new AssertionError(i92);
                }
                t29.i iVar2 = (t29.i) ((t29.w) aVar33.d.get()).b();
                vc.s.k(iVar2);
                return iVar2;
            case 14:
                r6j.c cVar9 = (r6j.c) this.f247276c;
                int i96 = this.f247275b;
                if (i96 == 0) {
                    return new w6j.a();
                }
                if (i96 != 1) {
                    throw new AssertionError(i96);
                }
                mk0.a aVarA18 = cVar9.f251877a.a();
                vc.s.j(aVarA18);
                n6j.c cVar10 = new n6j.c(aVarA18);
                fk3.a aVarA19 = cVar9.f251878b.a();
                vc.s.j(aVarA19);
                return new s6j.a(cVar10, aVarA19);
            case 15:
                r6j.f fVar5 = (r6j.f) this.f247276c;
                int i99 = this.f247275b;
                if (i99 == 0) {
                    return new j7j.k((cli.n) fVar5.f251907b.get(), fVar5.f251906a);
                }
                if (i99 == 1) {
                    return new ac4.g(new y6j.a(), new j7j.a());
                }
                throw new AssertionError(i99);
            case 16:
                r6j.h hVar5 = (r6j.h) this.f247276c;
                int i100 = this.f247275b;
                if (i100 == 0) {
                    return new r7j.j(hVar5.f251912a, (r7j.f) hVar5.f251913b.get());
                }
                if (i100 != 1) {
                    throw new AssertionError(i100);
                }
                s7j.b bVar23 = new s7j.b();
                s7j.a chartPointsProvider = new s7j.a();
                Intrinsics.checkNotNullParameter(chartPointsProvider, "chartPointsProvider");
                nd.k screenItemsMapper = new nd.k(bVar23, new s7j.g());
                Intrinsics.checkNotNullParameter(screenItemsMapper, "screenItemsMapper");
                return new r7j.l();
            case 17:
                r7d.h hVar6 = (r7d.h) this.f247276c;
                int i101 = this.f247275b;
                if (i101 == 0) {
                    return new j8d.g((jki.p) hVar6.f252118b.get(), hVar6.f252117a);
                }
                if (i101 == 1) {
                    return new j8d.h();
                }
                throw new AssertionError(i101);
            case 18:
                return a();
            case 19:
                rde.b bVar24 = (rde.b) this.f247276c;
                int i102 = this.f247275b;
                if (i102 == 0) {
                    fVar2 = new yde.f((cli.n) bVar24.f253414c.get(), bVar24.f253412a, (Clock) bVar24.f253413b.get());
                } else {
                    if (i102 != 1) {
                        if (i102 != 2) {
                            throw new AssertionError(i102);
                        }
                        zde.b.Companion.getClass();
                        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
                        Intrinsics.checkNotNullExpressionValue(clockSystemDefaultZone, "systemDefaultZone(...)");
                        vc.s.k(clockSystemDefaultZone);
                        return clockSystemDefaultZone;
                    }
                    fVar2 = new yde.h((Clock) bVar24.f253413b.get());
                }
                return fVar2;
            case 20:
                aj3.j jVar4 = (aj3.j) this.f247276c;
                PickerScreenContract$InputData pickerScreenContract$InputData3 = jVar4.f5394b;
                int i103 = this.f247275b;
                if (i103 == 0) {
                    return new y7a.f0(ImmutableMap.of("InboundTransferTrackerCountryPicker", (a8a.d) ((rde.f) jVar4.f).d.get()), pickerScreenContract$InputData3, (jki.p) jVar4.d.get());
                }
                if (i103 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData3, jVar4.f5395c);
                }
                throw new AssertionError(i103);
            case 21:
                re9.a aVar34 = (re9.a) this.f247276c;
                ee0.a aVar35 = aVar34.f253548a;
                int i104 = this.f247275b;
                if (i104 == 0) {
                    ue0.c cVar11 = (ue0.c) aVar34.i.get();
                    l80.e eVarH2 = aVar34.f253550c.h();
                    vc.s.j(eVarH2);
                    return new se9.d(cVar11, eVarH2);
                }
                if (i104 != 1) {
                    if (i104 != 2) {
                        throw new AssertionError(i104);
                    }
                    Context context2 = aVar34.d;
                    re9.e.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context2, "context");
                    return sri.o.c(context2, null, null, 14);
                }
                xe0.f storageFactory3 = aVar35.f();
                vc.s.j(storageFactory3);
                je0.d mapper3 = aVar35.d();
                vc.s.j(mapper3);
                yk0.a databaseSessionProvider = aVar34.f253549b.b();
                vc.s.j(databaseSessionProvider);
                re9.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                return xe0.f.f(storageFactory3, databaseSessionProvider, "security_hub_storage", mapper3, 0, null, 56);
            case 22:
                return b();
            case 23:
                int i105 = this.f247275b;
                if (i105 == 0) {
                    return new qr1.b();
                }
                if (i105 != 1) {
                    throw new AssertionError(i105);
                }
                yw1.b bVarK = ((lz1.m) ((rr1.a) this.f247276c).f256631a).k();
                vc.s.j(bVarK);
                return new tr1.g(bVarK);
            case 24:
                return c();
            case 25:
                return d();
            case 26:
                return e();
            case 27:
                return f();
            case 28:
                return g();
            default:
                sa7.a aVar36 = (sa7.a) this.f247276c;
                a31.a aVar37 = aVar36.e;
                int i106 = this.f247275b;
                if (i106 == 0) {
                    mVar = new ta7.m(aVar36.f261355a, aVar36.f261356b, aVar36.f261357c, aVar36.d, aVar37, aVar36.f);
                } else {
                    if (i106 != 1) {
                        if (i106 != 2) {
                            throw new AssertionError(i106);
                        }
                        ta7.a aVar38 = (ta7.a) ((ta7.m) aVar36.k.get()).b();
                        vc.s.k(aVar38);
                        return aVar38;
                    }
                    mVar = new e4(aVar36.f261358g, aVar36.f261361l, aVar36.f261359h, aVar36.i, aVar36.f261360j, aVar37);
                }
                return mVar;
        }
    }

    public d2(qy8.a aVar, qy8.b bVar, int i) {
        this.f247274a = 11;
        this.f247276c = bVar;
        this.f247275b = i;
    }
}
