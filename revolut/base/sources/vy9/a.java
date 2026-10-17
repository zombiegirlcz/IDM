package vy9;

import a41.a0;
import a41.l0;
import a41.l1;
import a41.n0;
import a41.n1;
import a41.o;
import a41.o1;
import a41.p0;
import a41.r0;
import a41.v0;
import a41.x;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.rev_points.spare_change.impl.data.network.RevPointsSpareChangeService;
import com.revolut.feature.trading_asset_quotes.impl.data.network.services.FiatExchangeOrderQuoteService;
import com.revolut.shared.feature.cards.domain.impl.data.network.card.CardService;
import com.revolut.shared.feature.cards.domain.impl.data.network.config.CardConfigService;
import com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.CorporateEventsDatabase;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.WealthDiscoveryDomainDatabase;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.corporate_events.CorporateEventsService;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.curated_collections.CuratedCollectionsService;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.trading_events.TradingEventsService;
import dp4.z0;
import dz7.m;
import dz7.r;
import dz7.s;
import fx7.l;
import gz7.w;
import iri.j;
import java.time.Period;
import java.util.Collection;
import kl.c0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import ozc.s0;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tnb.g0;
import ulm.a1;
import v6l.b1;
import vy7.n;
import x13.b0;
import xf6.m0;
import xf6.x0;
import xy7.k;
import xy7.p;
import xy7.q;
import yy9.e0;
import yy9.h0;
import yy9.k0;
import yy9.z;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f293263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f293264c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f293262a = i2;
        this.f293264c = obj2;
        this.f293263b = i;
    }

    private final Object a() {
        wy7.f fVar = (wy7.f) this.f293264c;
        int i = this.f293263b;
        switch (i) {
            case 0:
                hri.b bVar = fVar.f301144a;
                return new ifm.b();
            case 1:
                hri.b bVar2 = fVar.f301144a;
                return new j();
            case 2:
                return new s();
            case 3:
                return new ln.c();
            case 4:
                fx7.g gVarC = fVar.f301146c.c();
                vc.s.j(gVarC);
                fx7.f fVarB = fVar.f301146c.b();
                vc.s.j(fVarB);
                return new m(gVarC, fVarB, (dz7.g) fVar.f301147g.get());
            case 5:
                return new r((ln.a) fVar.f301148h.get());
            case 6:
                return new q();
            case 7:
                fx7.g gVarC2 = fVar.f301146c.c();
                vc.s.j(gVarC2);
                fx7.f fVarB2 = fVar.f301146c.b();
                vc.s.j(fVarB2);
                return new k(gVarC2, fVarB2, new xy7.r());
            case 8:
                return new p((ln.a) fVar.f301148h.get());
            case 9:
                return new az7.i();
            case 10:
                fx7.g gVarC3 = fVar.f301146c.c();
                vc.s.j(gVarC3);
                return new az7.e(gVarC3);
            case 11:
                return new az7.h((ln.a) fVar.f301148h.get());
            case 12:
                return new cn.e();
            case 13:
                return new um.c();
            case 14:
                fVar.getClass();
                return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 15:
                return new ym.d();
            case 16:
                return new mm.d();
            case 17:
                ex7.a aVar = fVar.f301146c;
                ex7.a aVar2 = fVar.f301146c;
                fx7.f fVarB3 = aVar.b();
                vc.s.j(fVarB3);
                fx7.g gVarC4 = aVar2.c();
                vc.s.j(gVarC4);
                l lVarD = aVar2.d();
                vc.s.j(lVarD);
                return new hz7.b(fVarB3, gVarC4, lVarD, (g3l.a) fVar.v.get(), (ln.a) fVar.f301148h.get(), fVar.b());
            case 18:
                return new g3l.g();
            case 19:
                fx7.g gVarC5 = fVar.f301146c.c();
                vc.s.j(gVarC5);
                l lVarD2 = fVar.f301146c.d();
                vc.s.j(lVarD2);
                return new du8.b(gVarC5, lVarD2, fVar.b());
            case 20:
                wm.e eVar = (wm.e) fVar.f301160y.get();
                l80.e eVarH = fVar.f301145b.h();
                vc.s.j(eVarH);
                return new lz7.d(eVar, new mz7.a(eVarH), fVar.b());
            case 21:
                return new wm.a();
            case 22:
                t tVarB = fVar.b();
                fx7.m mVar = (fx7.m) fVar.f301146c.D.get();
                vc.s.j(mVar);
                return new lz7.f(tVarB, mVar, (g3l.a) fVar.v.get());
            case 23:
                return new sm.e();
            case 24:
                return new om.c();
            case 25:
                fx7.g gVarC6 = fVar.f301146c.c();
                vc.s.j(gVarC6);
                fx7.f fVarB4 = fVar.f301146c.b();
                vc.s.j(fVarB4);
                return new gz7.l(gVarC6, fVarB4);
            case 26:
                return new w((mm.d) fVar.u.get(), (ln.a) fVar.f301148h.get());
            case 27:
                return new n();
            case 28:
                return new vy7.m((ifm.b) fVar.e.get(), (vy7.g) fVar.G.get(), (ln.a) fVar.f301148h.get(), new kz7.b());
            case 29:
                ex7.a aVar3 = fVar.f301146c;
                ex7.a aVar4 = fVar.f301146c;
                fx7.f fVarB5 = aVar3.b();
                vc.s.j(fVarB5);
                fx7.i iVar = (fx7.i) aVar4.z.get();
                vc.s.j(iVar);
                fx7.k kVar = (fx7.k) aVar4.I.get();
                vc.s.j(kVar);
                return new vy7.g(fVarB5, iVar, kVar, (vy7.d) fVar.F.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        x31.a aVar = (x31.a) this.f293264c;
        ite.a aVar2 = aVar.f302612c;
        poi.b bVar = aVar.f302611b;
        Context context = aVar.f302610a;
        int i = this.f293263b;
        if (i != 0) {
            if (i == 1) {
                return new d41.d();
            }
            if (i == 2) {
                return new b41.e(context, aVar.b());
            }
            throw new AssertionError(i);
        }
        com.revolut.analytics.tracking.v3.d dVarF = bVar.f();
        vc.s.j(dVarF);
        gte.a aVarB = aVar2.b();
        vc.s.j(aVarB);
        x31.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        n80.e eVar = new n80.e(packageManager);
        l70.e eVar2 = aVar.d;
        y80.a aVarR = eVar2.r();
        vc.s.j(aVarR);
        th0.a aVar3 = aVar.e;
        ih0.b bVarF = aVar3.f();
        vc.s.j(bVarF);
        pn0.c cVarA = aVar.f.a();
        vc.s.j(cVarA);
        v0 applicationsRidge = new a41.b(eVar, aVarR, bVarF, cVarA);
        v0 audioRidge = new a41.c(context, 0);
        v0 boardRidge = new a41.e((d41.b) aVar.k.get());
        y80.a aVarR2 = eVar2.r();
        vc.s.j(aVarR2);
        v0 bluetoothRidge = new a41.d(context, aVarR2, (d41.b) aVar.k.get());
        v0 buildInfoRidge = new a41.f();
        y80.a aVarR3 = eVar2.r();
        vc.s.j(aVarR3);
        v0 cameraRidge = new a41.i(context, aVarR3);
        v0 codecRidge = new a41.k();
        v0 cpuRidge = new a41.l();
        vl0.a aVar4 = (vl0.a) aVar.f302613g.D.get();
        vc.s.j(aVar4);
        jm0.a aVar5 = aVar.f302614h;
        v0 deviceProtectionRidge = new o(aVar4, new fi0.b(aVar5.f, 1));
        nh0.b bVar2 = new nh0.b(new nh0.a(aVar3.f271230a), aVar3.f271231b);
        uo.s sVar = (uo.s) bVar.H.get();
        vc.s.j(sVar);
        dm0.d dVarD = aVar5.d();
        vc.s.j(dVarD);
        v0 idsRidge = new a0(bVar2, sVar, dVarD, new b4j.g(aVar.i.f319937a.e(), 3));
        e41.e eVar3 = new e41.e();
        e41.f fVar = new e41.f();
        gte.a aVarB2 = aVar2.b();
        vc.s.j(aVarB2);
        v0 gpuRidge = new x(eVar3, fVar, aVarB2);
        zh0.e eVar4 = (zh0.e) aVar3.f.get();
        vc.s.j(eVar4);
        y80.a aVarR4 = eVar2.r();
        vc.s.j(aVarR4);
        v0 locationRidge = new l0(eVar4, aVarR4);
        v0 memoryRidge = new a41.c(context, 1);
        y80.a aVarR5 = eVar2.r();
        vc.s.j(aVarR5);
        v0 networkRidge = new n0(context, aVarR5);
        v0 nfcRidge = new a41.e(context);
        v0 operatingSystemRidge = new p0((d41.b) aVar.k.get(), new mzl.b());
        c70.a aVarZ = eVar2.z();
        vc.s.j(aVarZ);
        v0 pasteboardRidge = new a41.e(aVarZ);
        y80.a aVarR6 = eVar2.r();
        vc.s.j(aVarR6);
        v0 phoneRidge = new p0(context, aVarR6);
        v0 powerRidge = new r0(context);
        v0 regionRidge = new a41.d(context);
        v0 screenRidge = new a41.c(context, 2);
        v0 sensorRidge = new l1(context);
        b70.e eVarB = eVar2.b();
        vc.s.j(eVarB);
        v0 settingsRidge = new n1(eVarB, context);
        v0 storageRidge = new o1();
        i41.c cVar = (i41.c) aVar.f302615j.f192032c.get();
        vc.s.j(cVar);
        v0 threatRidge = new a41.e(cVar);
        l80.e eVarH = eVar2.h();
        vc.s.j(eVarH);
        l80.h hVarV = eVar2.v();
        vc.s.j(hVarV);
        v0 timeRidge = new a41.d(context, eVarH, hVarV);
        Intrinsics.checkNotNullParameter(applicationsRidge, "applicationsRidge");
        Intrinsics.checkNotNullParameter(audioRidge, "audioRidge");
        Intrinsics.checkNotNullParameter(boardRidge, "boardRidge");
        Intrinsics.checkNotNullParameter(bluetoothRidge, "bluetoothRidge");
        Intrinsics.checkNotNullParameter(buildInfoRidge, "buildInfoRidge");
        Intrinsics.checkNotNullParameter(cameraRidge, "cameraRidge");
        Intrinsics.checkNotNullParameter(codecRidge, "codecRidge");
        Intrinsics.checkNotNullParameter(cpuRidge, "cpuRidge");
        Intrinsics.checkNotNullParameter(deviceProtectionRidge, "deviceProtectionRidge");
        Intrinsics.checkNotNullParameter(idsRidge, "idsRidge");
        Intrinsics.checkNotNullParameter(gpuRidge, "gpuRidge");
        Intrinsics.checkNotNullParameter(locationRidge, "locationRidge");
        Intrinsics.checkNotNullParameter(memoryRidge, "memoryRidge");
        Intrinsics.checkNotNullParameter(networkRidge, "networkRidge");
        Intrinsics.checkNotNullParameter(nfcRidge, "nfcRidge");
        Intrinsics.checkNotNullParameter(operatingSystemRidge, "operatingSystemRidge");
        Intrinsics.checkNotNullParameter(pasteboardRidge, "pasteboardRidge");
        Intrinsics.checkNotNullParameter(phoneRidge, "phoneRidge");
        Intrinsics.checkNotNullParameter(powerRidge, "powerRidge");
        Intrinsics.checkNotNullParameter(regionRidge, "regionRidge");
        Intrinsics.checkNotNullParameter(screenRidge, "screenRidge");
        Intrinsics.checkNotNullParameter(sensorRidge, "sensorRidge");
        Intrinsics.checkNotNullParameter(settingsRidge, "settingsRidge");
        Intrinsics.checkNotNullParameter(storageRidge, "storageRidge");
        Intrinsics.checkNotNullParameter(threatRidge, "threatRidge");
        Intrinsics.checkNotNullParameter(timeRidge, "timeRidge");
        v0[] elements = {applicationsRidge, audioRidge, boardRidge, bluetoothRidge, buildInfoRidge, deviceProtectionRidge, cameraRidge, codecRidge, cpuRidge, idsRidge, gpuRidge, locationRidge, memoryRidge, networkRidge, nfcRidge, operatingSystemRidge, pasteboardRidge, phoneRidge, powerRidge, regionRidge, screenRidge, sensorRidge, settingsRidge, storageRidge, threatRidge, timeRidge};
        Intrinsics.checkNotNullParameter(elements, "elements");
        z31.c cVar2 = new z31.c(kotlin.collections.d.y0(elements));
        com.revolut.analytics.tracking.v3.d dVarF2 = bVar.f();
        vc.s.j(dVarF2);
        return new w31.e(context, dVarF, aVarB, cVar2, new g0(dVarF2), (b41.e) aVar.f302616l.get(), aVar.b());
    }

    private final Object c() {
        x6l.c cVar = (x6l.c) this.f293264c;
        int i = this.f293263b;
        switch (i) {
            case 0:
                e4m.e eVar = cVar.f303126j;
                rk0.c cVar2 = cVar.e;
                an0.c cVar3 = cVar.f303123c;
                RevolutCardService revolutCardService = (RevolutCardService) eVar.get();
                ue0.c cVar4 = (ue0.c) cVar.k.get();
                ne0.j jVar = (ne0.j) cVar.f303128m.get();
                jm0.a aVar = cVar.d;
                kge.d dVar = new kge.d(new yf.c(aVar.c()), new k6l.b(new bm0.a(), aVar.c()));
                xm0.a aVar2 = (xm0.a) cVar3.f6530q.get();
                vc.s.j(aVar2);
                t6l.b bVar = new t6l.b(aVar2, fe0.d.a());
                mk0.a aVarA = cVar2.a();
                vc.s.j(aVarA);
                mk0.a aVarA2 = cVar2.a();
                vc.s.j(aVarA2);
                v6l.i iVar = new v6l.i(aVarA2);
                ze0.a aVarA3 = cVar.f303122b.a();
                vc.s.j(aVarA3);
                mg0.a aVar3 = (mg0.a) cVar3.C.get();
                vc.s.j(aVar3);
                sf0.h hVarB = cVar.f.b();
                vc.s.j(hVarB);
                return new b1(revolutCardService, cVar4, jVar, dVar, bVar, aVarA, iVar, aVarA3, aVar3, hVarB, (kg.o) cVar.f303129n.get(), new fn2.c(cVar.f303124g.f112465a.b()));
            case 1:
                Retrofit retrofit = (Retrofit) cVar.i.get();
                x6l.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(RevolutCardService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                RevolutCardService revolutCardService2 = (RevolutCardService) objCreate;
                vc.s.k(revolutCardService2);
                return revolutCardService2;
            case 2:
                ik0.b retrofitFactory = ((nj0.d) cVar.f303121a).m();
                vc.s.j(retrofitFactory);
                da3.m cardsNetworkConfiguration = new da3.m();
                x6l.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(cardsNetworkConfiguration, "cardsNetworkConfiguration");
                kg.p pVar = new kg.p();
                pVar.c(new he0.k(), new TypeToken<String>() { // from class: com.revolut.shared.feature.cards.domain.impl.di.CardsDomainModule$Companion$provideCardsRetrofit$gson$1
                }.getType());
                he0.m mVar = new he0.m("type", so3.a.class, false, false);
                mVar.c(so3.b.class, so3.b.class.getSimpleName());
                mVar.c(so3.c.class, so3.c.class.getSimpleName());
                pVar.e.add(mVar);
                Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, GsonConverterFactory.create(pVar.b()), null, 24);
                vc.s.k(retrofitA);
                return retrofitA;
            case 3:
                je0.d mapper = cVar.f303122b.b();
                vc.s.j(mapper);
                yk0.a databaseSecurityProvider = cVar.f303123c.b();
                vc.s.j(databaseSecurityProvider);
                xe0.f storageFactory = cVar.f303122b.f();
                vc.s.j(storageFactory);
                x6l.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSecurityProvider, "revolut_cards", mapper, 3, v.k(new y6l.a(), new y6l.b()), 32);
            case 4:
                return new ne0.d();
            case 5:
                ee0.a aVar4 = cVar.f303122b;
                kg.o baseGson = fe0.c.a();
                x6l.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(baseGson, "baseGson");
                return baseGson;
            case 6:
                CardService cardService = (CardService) cVar.f303130p.get();
                ne0.j jVar2 = (ne0.j) cVar.f303131q.get();
                xe0.e eVarA = cVar.a();
                v6l.e eVar2 = new v6l.e();
                v6l.f fVar = new v6l.f();
                gte.a aVarB = cVar.f303124g.e.b();
                vc.s.j(aVarB);
                ha3.b bVar2 = new ha3.b(aVarB);
                ze0.a aVarA4 = cVar.f303122b.a();
                vc.s.j(aVarA4);
                return new v6l.s(cardService, jVar2, eVarA, eVar2, fVar, bVar2, aVarA4);
            case 7:
                Retrofit retrofit3 = (Retrofit) cVar.i.get();
                x6l.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object objCreate2 = retrofit3.create(CardService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                CardService cardService2 = (CardService) objCreate2;
                vc.s.k(cardService2);
                return cardService2;
            case 8:
                CardConfigService cardConfigService = (CardConfigService) cVar.f303133s.get();
                n5l.a aVar5 = new n5l.a();
                ne0.j jVar3 = (ne0.j) cVar.f303134t.get();
                ue0.c cVar5 = (ue0.c) cVar.u.get();
                c90.a aVarE = cVar.f303125h.e();
                vc.s.j(aVarE);
                return new v6l.d(cardConfigService, aVar5, jVar3, cVar5, aVarE);
            case 9:
                Retrofit retrofit4 = (Retrofit) cVar.i.get();
                x6l.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Object objCreate3 = retrofit4.create(CardConfigService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                CardConfigService cardConfigService2 = (CardConfigService) objCreate3;
                vc.s.k(cardConfigService2);
                return cardConfigService2;
            case 10:
                je0.d mapper2 = cVar.f303122b.b();
                vc.s.j(mapper2);
                yk0.a databaseSecurityProvider2 = cVar.f303123c.b();
                vc.s.j(databaseSecurityProvider2);
                xe0.f storageFactory2 = cVar.f303122b.f();
                vc.s.j(storageFactory2);
                x6l.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider2, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSecurityProvider2, "cards_config", mapper2, 0, null, 56);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        xcf.b bVar = (xcf.b) this.f293264c;
        int i = this.f293263b;
        if (i == 0) {
            usc.a aVar = new usc.a((FiatExchangeOrderQuoteService) bVar.f304128g.get());
            CoroutineScope coroutineScopeA = bVar.f304126b.a();
            vc.s.j(coroutineScopeA);
            return new wcf.a(aVar, coroutineScopeA);
        }
        if (i == 1) {
            FiatExchangeOrderQuoteService fiatExchangeOrderQuoteService = (FiatExchangeOrderQuoteService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f.get(), "retrofit", FiatExchangeOrderQuoteService.class, "create(...)");
            vc.s.k(fiatExchangeOrderQuoteService);
            return fiatExchangeOrderQuoteService;
        }
        if (i == 2) {
            Retrofit retrofitF = ((nj0.d) bVar.f304125a).f();
            kg.o oVar = (kg.o) bVar.e.get();
            Retrofit.Builder builderX = p.a.x(retrofitF, "retrofit", oVar, "gson");
            builderX.converterFactories().clear();
            builderX.converterFactories().add(GsonConverterFactory.create(oVar));
            Retrofit retrofitBuild = builderX.build();
            Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
            vc.s.k(retrofitBuild);
            return retrofitBuild;
        }
        if (i != 3) {
            if (i == 4) {
                return new ycf.b();
            }
            throw new AssertionError(i);
        }
        kg.o gson = fe0.c.a();
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        pVar.e.add(c8l.a.a());
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    private final Object e() {
        vee.c cVar = (vee.c) this.f293264c;
        int i = this.f293263b;
        if (i == 0) {
            return new ifm.b();
        }
        if (i == 1) {
            return new j();
        }
        if (i == 2) {
            return new u3l.e();
        }
        if (i == 3) {
            return new um.c();
        }
        if (i == 4) {
            return new g3l.g();
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        f80.a uriHelper = cVar.f288309b.x();
        vc.s.j(uriHelper);
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        return new wee.a(uriHelper);
    }

    private final Object f() {
        xf6.m mVar = (xf6.m) this.f293264c;
        int i = this.f293263b;
        if (i == 0) {
            return new com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c(mVar.f304942a, (wj6.m) mVar.d.get(), (hk6.k) mVar.e.get(), (oj6.g) mVar.f.get(), new pj6.a());
        }
        if (i == 1) {
            return new wj6.m();
        }
        if (i == 2) {
            return new hk6.k();
        }
        if (i == 3) {
            return new oj6.g();
        }
        throw new AssertionError(i);
    }

    private final Object g() {
        int i = this.f293263b;
        if (i == 0) {
            return new dl6.h(new dl6.i((zzl.b) ((m0) this.f293264c).f304946a.get()));
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        el6.b.Companion.getClass();
        return new zzl.c();
    }

    private final Object h() {
        x0 x0Var = (x0) this.f293264c;
        IbanScreenContract$InputData ibanScreenContract$InputData = x0Var.f305156b;
        int i = this.f293263b;
        if (i == 0) {
            return new vn6.i(ibanScreenContract$InputData, (cli.n) x0Var.d.get());
        }
        if (i == 1) {
            return new vn6.k(ibanScreenContract$InputData, b3j.f.a(), b3j.g.a());
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object gVar;
        x4l.c cVar;
        Object bVar;
        int i = this.f293262a;
        int i2 = this.f293263b;
        Object obj2 = this.f293264c;
        switch (i) {
            case 0:
                b bVar2 = (b) obj2;
                vl3.n nVar = bVar2.i;
                if2.f fVar = bVar2.f293267c;
                ea2.h hVar = bVar2.f293266b;
                bw9.a aVar = bVar2.f293269h;
                ite.a aVar2 = bVar2.f293268g;
                l70.e eVar = bVar2.f;
                if (i2 == 0) {
                    zy9.d sendFromClipboardInteractor = (zy9.d) bVar2.f293273n.get();
                    gte.a featureToggleInteractor = aVar2.b();
                    vc.s.j(featureToggleInteractor);
                    a extensionsProvider = bVar2.o;
                    bz9.b clipboardErrorDialogMapper = new bz9.b();
                    i.Companion.getClass();
                    Intrinsics.checkNotNullParameter(sendFromClipboardInteractor, "sendFromClipboardInteractor");
                    Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                    Intrinsics.checkNotNullParameter(extensionsProvider, "extensionsProvider");
                    Intrinsics.checkNotNullParameter(clipboardErrorDialogMapper, "clipboardErrorDialogMapper");
                    gVar = new g(sendFromClipboardInteractor, extensionsProvider, featureToggleInteractor, clipboardErrorDialogMapper);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new AssertionError(i2);
                                }
                                gte.a aVarB = aVar2.b();
                                vc.s.j(aVarB);
                                c70.a aVarZ = eVar.z();
                                vc.s.j(aVarZ);
                                return new az9.b(aVarB, aVarZ);
                            }
                            yy9.v bankTransferPaymentOptionProvider = new yy9.v(aVar.a());
                            c70.a clipboard = eVar.z();
                            vc.s.j(clipboard);
                            bz9.b clipboardErrorDialogMapper2 = new bz9.b();
                            i.Companion.getClass();
                            Intrinsics.checkNotNullParameter(bankTransferPaymentOptionProvider, "bankTransferPaymentOptionProvider");
                            Intrinsics.checkNotNullParameter(clipboard, "clipboard");
                            Intrinsics.checkNotNullParameter(clipboardErrorDialogMapper2, "clipboardErrorDialogMapper");
                            return new f(bankTransferPaymentOptionProvider, clipboard, clipboardErrorDialogMapper2);
                        }
                        ha2.a factory = (ha2.a) hVar.f124082r.get();
                        vc.s.j(factory);
                        i.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Object obj3 = factory.f150394a.get();
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        ba2.e eVar2 = (ba2.e) obj3;
                        vc.s.k(eVar2);
                        xy9.c cVar2 = new xy9.c(eVar2);
                        kf2.c factory2 = (kf2.c) fVar.G.get();
                        vc.s.j(factory2);
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Object obj4 = factory2.f183284a.get();
                        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                        ve2.a aVar3 = (ve2.a) obj4;
                        vc.s.k(aVar3);
                        xy9.p pVar = new xy9.p(aVar3);
                        p8a.c cVar3 = bVar2.k;
                        f8a.c cVar4 = (f8a.c) cVar3.F.get();
                        vc.s.j(cVar4);
                        s8a.l lVarE = cVar3.e();
                        i8a.e eVar3 = (i8a.e) cVar3.C.get();
                        vc.s.j(eVar3);
                        tca.f fVar2 = (tca.f) cVar3.D.get();
                        vc.s.j(fVar2);
                        i8a.a aVar4 = (i8a.a) cVar3.G.get();
                        vc.s.j(aVar4);
                        kz9.a aVarA = bVar2.f293271l.a();
                        vc.s.j(aVarA);
                        x2k.e eVar4 = new x2k.e();
                        gte.a aVarB2 = aVar2.b();
                        vc.s.j(aVarB2);
                        j8a.b bVar3 = (j8a.b) cVar3.L.get();
                        vc.s.j(bVar3);
                        f8a.b bVar4 = (f8a.b) cVar3.M.get();
                        vc.s.j(bVar4);
                        xy9.o oVar = new xy9.o(cVar4, lVarE, eVar3, fVar2, aVar4, aVarA, eVar4, aVarB2, bVar3, bVar4);
                        xy9.a aVar5 = new xy9.a(bVar2.f293272m.b());
                        xy9.b bVar5 = new xy9.b();
                        cl3.a aVarD = nVar.d();
                        vc.s.j(aVarD);
                        return ImmutableSet.of((xy9.e) cVar2, (xy9.e) pVar, (xy9.e) oVar, (xy9.e) aVar5, (xy9.e) bVar5, new xy9.e(aVarD), (xy9.e[]) new ry9.b[0]);
                    }
                    lz1.m mVar = (lz1.m) bVar2.f293265a;
                    uw1.c cVarD = mVar.d();
                    vc.s.j(cVarD);
                    z zVar = new z(cVarD, hVar.a());
                    uw1.c cVarD2 = mVar.d();
                    vc.s.j(cVarD2);
                    ze2.a aVar6 = (ze2.a) fVar.H.get();
                    vc.s.j(aVar6);
                    k0 k0Var = new k0(cVarD2, aVar6);
                    uw1.c cVarD3 = mVar.d();
                    vc.s.j(cVarD3);
                    h0 h0Var = new h0(cVarD3, bVar2.d.a());
                    uw1.c cVarD4 = mVar.d();
                    vc.s.j(cVarD4);
                    yy9.f fVar3 = new yy9.f(cVarD4, bVar2.a());
                    uw1.c cVarD5 = mVar.d();
                    vc.s.j(cVarD5);
                    yy9.c cVar5 = new yy9.c(cVarD5, bVar2.a());
                    uw1.c cVarD6 = mVar.d();
                    vc.s.j(cVarD6);
                    yy9.i iVar = new yy9.i(cVarD6, bVar2.a());
                    uw1.c cVarD7 = mVar.d();
                    vc.s.j(cVarD7);
                    yy9.l lVar = new yy9.l(cVarD7, bVar2.a());
                    uw1.c cVarD8 = mVar.d();
                    vc.s.j(cVarD8);
                    yy9.r rVar = new yy9.r(cVarD8, bVar2.a());
                    yy9.v vVar = new yy9.v(aVar.a());
                    cw9.d dVarA = aVar.a();
                    z80.b bVarS = eVar.s();
                    vc.s.j(bVarS);
                    i.Companion.getClass();
                    zzl.c cVar6 = new zzl.c();
                    cl3.a aVarD2 = nVar.d();
                    vc.s.j(aVarD2);
                    ImmutableSet immutableSetOf = ImmutableSet.of((yy9.i) zVar, (yy9.i) k0Var, (yy9.i) h0Var, (yy9.i) fVar3, (yy9.i) cVar5, iVar, (yy9.i[]) new ry9.c[]{lVar, rVar, vVar, new e0(dVarA, bVarS, cVar6, aVarD2, bVar2.f293270j.e())});
                    c70.a aVarZ2 = eVar.z();
                    vc.s.j(aVarZ2);
                    gVar = new zy9.h(immutableSetOf, aVarZ2);
                }
                return gVar;
            case 1:
                vzc.b bVar6 = (vzc.b) obj2;
                switch (i2) {
                    case 0:
                        hri.b bVar7 = bVar6.f293449a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar8 = bVar6.f293449a;
                        return new j();
                    case 2:
                        return new com.revolut.feature.chooser.e();
                    case 3:
                        return new qi3.n((com.revolut.feature.chooser.c) bVar6.f293457n.get());
                    case 4:
                        sd0.c cVar7 = bVar6.f293451c;
                        td0.b currencySetsProvider = vd0.d.a();
                        com.revolut.feature.chooser.a chooserPresentationModel = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) bVar6.f293455l.get(), (qi3.o) bVar6.f293456m.get());
                        szc.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
                        Intrinsics.checkNotNullParameter(chooserPresentationModel, "chooserPresentationModel");
                        return new rzc.c(currencySetsProvider, chooserPresentationModel);
                    case 5:
                        return new qi3.b((com.revolut.feature.chooser.d) bVar6.f293455l.get());
                    case 6:
                        return new s0();
                    case 7:
                        return new cn.e();
                    case 8:
                        return new um.c();
                    case 9:
                        bVar6.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 10:
                        return new ln.c();
                    case 11:
                        return new ym.d();
                    case 12:
                        return new mm.d();
                    case 13:
                        return new sm.e();
                    case 14:
                        return new om.c();
                    case 15:
                        return new ozc.t((ozc.g) bVar6.f293458p.get(), new c0((nzc.d) ((izc.a) bVar6.d).e.get()), bVar6.e.a(), (rzc.a) bVar6.f293457n.get(), bVar6.f.a(), new t((cn.e) bVar6.f293459q.get(), (ym.d) bVar6.u.get(), (um.c) bVar6.f293460r.get(), (ifm.b) bVar6.f293454j.get()));
                    case 16:
                        return new mxc.c();
                    case 17:
                        return new g3l.g();
                    case 18:
                        ozc.d dVar = (ozc.d) bVar6.f293465y.get();
                        ozc.l0 l0Var = (ozc.l0) bVar6.B.get();
                        s70.a aVarM = bVar6.f293450b.m();
                        vc.s.j(aVarM);
                        return new ozc.r0(dVar, l0Var, aVarM);
                    case 19:
                        return new ozc.l0((ozc.d) bVar6.f293465y.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                w1c.j jVar = (w1c.j) obj2;
                ee0.a aVar7 = jVar.f293843b;
                if (i2 == 0) {
                    RevPointsSpareChangeService revPointsSpareChangeService = (RevPointsSpareChangeService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) jVar.f293845g.get(), "retrofit", RevPointsSpareChangeService.class, "create(...)");
                    vc.s.k(revPointsSpareChangeService);
                    return revPointsSpareChangeService;
                }
                if (i2 == 1) {
                    Retrofit retrofitF = ((nj0.d) jVar.f293842a).f();
                    kg.o oVar2 = (kg.o) jVar.f.get();
                    Retrofit.Builder builderX = p.a.x(retrofitF, "retrofit", oVar2, "gson");
                    builderX.converterFactories().clear();
                    Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar2)).build();
                    Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                    vc.s.k(retrofitBuild);
                    return retrofitBuild;
                }
                if (i2 == 2) {
                    kg.o gson = fe0.c.a();
                    Intrinsics.checkNotNullParameter(gson, "gson");
                    kg.p pVar2 = new kg.p(gson);
                    pVar2.c(new he0.h(), Period.class);
                    kg.o oVarB = pVar2.b();
                    Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                    return oVarB;
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        w1c.l.Companion.getClass();
                        return new ne0.d();
                    }
                    if (i2 == 5) {
                        return new x1c.a();
                    }
                    throw new AssertionError(i2);
                }
                je0.d mapper = aVar7.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = jVar.f293844c.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar7.f();
                vc.s.j(storageFactory);
                w1c.l.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "rev_points_spare_change", mapper, 1, f0.f322471a, 32);
            case 3:
                w2i.b bVar9 = (w2i.b) obj2;
                switch (i2) {
                    case 0:
                        hri.b bVar10 = bVar9.f294058a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar11 = bVar9.f294058a;
                        return new j();
                    case 2:
                        return new s2i.k();
                    case 3:
                        return new cn.e();
                    case 4:
                        return new um.c();
                    case 5:
                        bVar9.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 6:
                        return new ln.c();
                    case 7:
                        return new ym.d();
                    case 8:
                        return new mm.d();
                    case 9:
                        return new sm.e();
                    case 10:
                        return new om.c();
                    case 11:
                        e4m.e eVar5 = bVar9.f294074y;
                        efk.a aVar8 = bVar9.e;
                        v0i.b bVar12 = bVar9.d;
                        s2i.c cVar8 = (s2i.c) eVar5.get();
                        nd.k kVar = new nd.k(new l4i.a());
                        p0i.b bVarE = bVar12.e();
                        vc.s.j(bVarE);
                        ffk.t tVarF = aVar8.f();
                        vc.s.j(tVarF);
                        t tVar = new t((cn.e) bVar9.z.get(), (ym.d) bVar9.D.get(), (um.c) bVar9.A.get(), (ifm.b) bVar9.f294072w.get());
                        ffk.t tVarF2 = aVar8.f();
                        vc.s.j(tVarF2);
                        return new s2i.h(cVar8, kVar, bVarE, tVarF, tVar, new k1i.d(tVarF2), bVar9.f.e(), bVar12.f(), bVar9.f294061g.a(), bVar9.f294060c.d(), bVar9.f294062h.a(), new l4i.a());
                    case 12:
                        return new s2i.j((ln.a) bVar9.C.get(), new k1i.k((ln.a) bVar9.C.get()), bVar9.i.c());
                    case 13:
                        return new wm.a();
                    default:
                        throw new AssertionError(i2);
                }
            case 4:
                w3h.a aVar9 = (w3h.a) obj2;
                a31.a aVar10 = aVar9.f;
                a31.a aVar11 = aVar9.f294395b;
                a31.a aVar12 = aVar9.f294405r;
                if (i2 == 0) {
                    return new t1f.q(aVar9.f294394a, aVar11, aVar9.f294396c, aVar9.d, aVar9.e, aVar10, aVar9.f294397g, aVar9.f294398h, aVar9.i, aVar9.f294399j, aVar9.k, aVar9.f294400l, aVar9.f294401m, aVar9.f294402n, aVar9.o, aVar9.u, aVar9.f294403p, aVar9.f294404q, aVar12, aVar9.f294406s);
                }
                if (i2 == 1) {
                    y3h.a aVar13 = (y3h.a) ((y3h.b) aVar9.f294407t.get()).b();
                    vc.s.k(aVar13);
                    return aVar13;
                }
                if (i2 == 2) {
                    return new y3h.b();
                }
                if (i2 == 3) {
                    return new a2d.m(aVar12, aVar11, aVar10, 22);
                }
                throw new AssertionError(i2);
            case 5:
                w59.d dVar2 = (w59.d) obj2;
                if (i2 == 0) {
                    return new u59.a(ImmutableSet.of(new v59.a((t59.a) dVar2.i.get())));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                gte.a aVarB3 = dVar2.f294738a.b();
                vc.s.j(aVarB3);
                return new t59.a(aVarB3);
            case 6:
                w59.i iVar2 = (w59.i) obj2;
                a31.a aVar14 = iVar2.d;
                a31.a aVar15 = iVar2.f294758c;
                a31.a aVar16 = iVar2.f294757b;
                ecm.q qVar = iVar2.f294756a;
                if (i2 == 0) {
                    return new ax4.c(qVar, aVar16, aVar15, aVar14, 18);
                }
                if (i2 == 1) {
                    return new ee6.f(qVar, aVar16, iVar2.e, aVar15, iVar2.f, aVar14, iVar2.f294759g, iVar2.f294760h, iVar2.i, 11);
                }
                throw new AssertionError(i2);
            case 7:
                w5f.i iVar3 = (w5f.i) obj2;
                if (i2 == 0) {
                    return new w6f.e((cli.n) iVar3.f295180b.get(), iVar3.f295179a);
                }
                if (i2 == 1) {
                    return new w6f.f();
                }
                throw new AssertionError(i2);
            case 8:
                wbd.a aVar17 = (wbd.a) obj2;
                a31.a aVar18 = aVar17.e;
                a31.a aVar19 = aVar17.d;
                a31.a aVar20 = aVar17.f296133c;
                a31.a aVar21 = aVar17.f296132b;
                if (i2 == 0) {
                    return new emi.g(aVar17.f296131a, aVar21, aVar20, aVar19, aVar18, 15);
                }
                if (i2 == 1) {
                    return new anb.c0(aVar21, aVar20, aVar19, aVar18, 29);
                }
                throw new AssertionError(i2);
            case 9:
                if (i2 == 0) {
                    wcb.b bVar13 = (wcb.b) obj2;
                    return new adb.n(bVar13.f296384a, (cli.n) bVar13.f296385b.get());
                }
                if (i2 == 1) {
                    return new adb.o();
                }
                throw new AssertionError(i2);
            case 10:
                whl.e eVar6 = (whl.e) obj2;
                switch (i2) {
                    case 0:
                        phl.j jVar2 = (phl.j) eVar6.f297704q.get();
                        gte.a aVarB4 = eVar6.f.b();
                        vc.s.j(aVarB4);
                        return new yhl.d(jVar2, aVarB4);
                    case 1:
                        ne0.j jVar3 = (ne0.j) eVar6.f297699j.get();
                        b80.c cVarP = eVar6.f297694a.p();
                        vc.s.j(cVarP);
                        return new phl.j(jVar3, cVarP, (CorporateEventsService) eVar6.f297701m.get(), (bhl.f) eVar6.o.get(), (bhl.a) eVar6.f297703p.get());
                    case 2:
                        return new ne0.d();
                    case 3:
                        Retrofit retrofit = (Retrofit) eVar6.f297700l.get();
                        whl.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(CorporateEventsService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        CorporateEventsService corporateEventsService = (CorporateEventsService) objCreate;
                        vc.s.k(corporateEventsService);
                        return corporateEventsService;
                    case 4:
                        Retrofit retrofit3 = ((nj0.d) eVar6.f297695b).f();
                        Json json = (Json) eVar6.k.get();
                        whl.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Intrinsics.checkNotNullParameter(json, "json");
                        Retrofit.Builder builderNewBuilder = retrofit3.newBuilder();
                        builderNewBuilder.converterFactories().clear();
                        ulm.b1.Companion.getClass();
                        builderNewBuilder.addConverterFactory(ek.b.a(json, a1.a("application/json")));
                        Retrofit retrofitBuild2 = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(retrofitBuild2, "build(...)");
                        vc.s.k(retrofitBuild2);
                        return retrofitBuild2;
                    case 5:
                        whl.c.Companion.getClass();
                        Json json2 = (Json) jhl.a.f174314a.getValue();
                        vc.s.k(json2);
                        return json2;
                    case 6:
                        CorporateEventsDatabase db8 = (CorporateEventsDatabase) eVar6.f297702n.get();
                        whl.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db8, "db");
                        bhl.f fVarH = db8.h();
                        vc.s.k(fVarH);
                        return fVarH;
                    case 7:
                        Context context = eVar6.f297696c;
                        yk0.a databaseSessionProvider2 = eVar6.d.b();
                        vc.s.j(databaseSessionProvider2);
                        de0.a databaseEncryptionMigratorFactory = ((cl0.a) eVar6.e).a();
                        vc.s.j(databaseEncryptionMigratorFactory);
                        whl.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        CorporateEventsDatabase.Companion aVar22 = CorporateEventsDatabase.INSTANCE;
                        aVar22.getClass();
                        CorporateEventsDatabase corporateEventsDatabase = (CorporateEventsDatabase) aVar22.a(context, databaseSessionProvider2, CorporateEventsDatabase.f, databaseEncryptionMigratorFactory);
                        vc.s.k(corporateEventsDatabase);
                        return corporateEventsDatabase;
                    case 8:
                        CorporateEventsDatabase db10 = (CorporateEventsDatabase) eVar6.f297702n.get();
                        whl.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db10, "db");
                        bhl.a aVarG = db10.g();
                        vc.s.k(aVarG);
                        return aVarG;
                    case 9:
                        phl.j jVar4 = (phl.j) eVar6.f297704q.get();
                        phl.b bVar14 = (phl.b) eVar6.f297706s.get();
                        ybl.b bVarB = eVar6.f297698h.b();
                        vc.s.j(bVarB);
                        df0.b bVarA = eVar6.i.a();
                        vc.s.j(bVarA);
                        gte.a aVarB5 = eVar6.f.b();
                        vc.s.j(aVarB5);
                        return new yhl.b(jVar4, bVar14, bVarB, bVarA, aVarB5);
                    case 10:
                        mk0.a aVarA2 = eVar6.f297697g.a();
                        vc.s.j(aVarA2);
                        return new phl.f(aVarA2);
                    case 11:
                        return new whl.d();
                    default:
                        throw new AssertionError(i2);
                }
            case 11:
                whl.f fVar4 = (whl.f) obj2;
                int i3 = 10;
                Continuation continuation = null;
                switch (i2) {
                    case 0:
                        return new yhl.f(new prl.e((x4l.c) fVar4.f297717p.get(), (x4l.c) fVar4.f297718q.get(), (x4l.c) fVar4.f297719r.get(), fVar4.f()));
                    case 1:
                        fVar4.getClass();
                        ghl.j dodProvider = new ghl.j(fVar4.f(), (ne0.j) fVar4.f297715m.get(), (ue0.c) fVar4.o.get(), new ghl.i());
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dodProvider, "dodProvider");
                        cVar = new x4l.c(new frk.a(dodProvider, continuation, 29), new gd3.i(dodProvider, 13), new ghl.c(dodProvider, 2), new gaa.g(dodProvider, continuation, 25), new g2e.m0(dodProvider, continuation, 11));
                        break;
                    case 2:
                        ik0.b retrofitFactory = ((nj0.d) fVar4.f297708a).m();
                        vc.s.j(retrofitFactory);
                        Json json3 = (Json) fVar4.k.get();
                        gfl.a wealthNetworkConfiguration = fVar4.f297710c.f161039a;
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(json3, "json");
                        Intrinsics.checkNotNullParameter(wealthNetworkConfiguration, "wealthNetworkConfiguration");
                        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, wealthNetworkConfiguration.getHostUrl(), p.a.g(ulm.b1.Companion, "application/json", json3), null, 25);
                        vc.s.k(retrofitA);
                        return retrofitA;
                    case 3:
                        ee0.a aVar23 = fVar4.f297709b;
                        Json baseJson = fe0.d.a();
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                        return ue0.e.b(baseJson, new wgk.f(5));
                    case 4:
                        return new ne0.d();
                    case 5:
                        je0.d mapper2 = (je0.d) fVar4.f297716n.get();
                        yk0.a databaseSessionProvider3 = fVar4.d.b();
                        vc.s.j(databaseSessionProvider3);
                        xe0.f storageFactory2 = fVar4.f297709b.f();
                        vc.s.j(storageFactory2);
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider3, "screener_storage", mapper2, 2, u.c(new zgl.a()), 32);
                    case 6:
                        Json json4 = (Json) fVar4.k.get();
                        me0.a factory3 = fVar4.f297709b.e();
                        vc.s.j(factory3);
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(json4, "json");
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return factory3.a(json4);
                    case 7:
                        ghl.e dodProvider2 = new ghl.e(fVar4.f(), (ne0.j) fVar4.f297715m.get(), (ue0.c) fVar4.o.get());
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dodProvider2, "dodProvider");
                        cVar = new x4l.c(new e6d.f(dodProvider2, continuation, 13), new gd3.i(dodProvider2, 11), new ghl.c(dodProvider2, 0), new g85.f(dodProvider2, continuation, 12), new z0(dodProvider2, continuation, 22));
                        break;
                    case 8:
                        ghl.g dodProvider3 = new ghl.g(fVar4.f(), (ne0.j) fVar4.f297715m.get(), (ue0.c) fVar4.o.get());
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dodProvider3, "dodProvider");
                        cVar = new x4l.c(new frk.a(dodProvider3, continuation, 28), new gd3.i(dodProvider3, 12), new ghl.c(dodProvider3, 1), new gaa.g(dodProvider3, continuation, 24), new g2e.m0(dodProvider3, continuation, i3));
                        break;
                    case 9:
                        return new yhl.g(new os2.g((x4l.c) fVar4.f297721t.get()));
                    case 10:
                        ghl.m dodProvider4 = new ghl.m(fVar4.f(), (ne0.j) fVar4.f297715m.get(), (ue0.c) fVar4.o.get());
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dodProvider4, "dodProvider");
                        cVar = new x4l.c(new ghl.l(dodProvider4, continuation, 0), new gd3.i(dodProvider4, 14), new ghl.c(dodProvider4, 3), new gaa.g(dodProvider4, continuation, 26), new g2e.m0(dodProvider4, continuation, 12));
                        break;
                    case 11:
                        return new yhl.h((uhl.e) fVar4.A.get());
                    case 12:
                        ue0.c cVar9 = (ue0.c) fVar4.v.get();
                        TradingEventsService tradingEventsService = (TradingEventsService) fVar4.f297723x.get();
                        bhl.d dVar3 = (bhl.d) fVar4.z.get();
                        o7.d dVar4 = new o7.d((j3f.i) fVar4.f297711g.f21221b.get());
                        gte.a aVarB6 = fVar4.f297712h.b();
                        vc.s.j(aVarB6);
                        return new uhl.e(cVar9, tradingEventsService, dVar3, dVar4, aVarB6);
                    case 13:
                        je0.d mapper3 = fVar4.f297709b.b();
                        vc.s.j(mapper3);
                        yk0.a databaseSessionProvider4 = fVar4.d.b();
                        vc.s.j(databaseSessionProvider4);
                        xe0.f storageFactory3 = fVar4.f297709b.f();
                        vc.s.j(storageFactory3);
                        ygl.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return xe0.f.f(storageFactory3, databaseSessionProvider4, "trading_events", mapper3, 1, f0.f322471a, 32);
                    case 14:
                        Retrofit retrofit4 = (Retrofit) fVar4.f297722w.get();
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate2 = retrofit4.create(TradingEventsService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        TradingEventsService tradingEventsService2 = (TradingEventsService) objCreate2;
                        vc.s.k(tradingEventsService2);
                        return tradingEventsService2;
                    case 15:
                        Retrofit retrofit5 = ((nj0.d) fVar4.f297708a).f();
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                        Retrofit.Builder builderNewBuilder2 = retrofit5.newBuilder();
                        builderNewBuilder2.converterFactories().clear();
                        builderNewBuilder2.addConverterFactory(GsonConverterFactory.create(xgl.a.a()));
                        Retrofit retrofitBuild3 = builderNewBuilder2.build();
                        Intrinsics.checkNotNullExpressionValue(retrofitBuild3, "build(...)");
                        vc.s.k(retrofitBuild3);
                        return retrofitBuild3;
                    case 16:
                        WealthDiscoveryDomainDatabase db11 = (WealthDiscoveryDomainDatabase) fVar4.f297724y.get();
                        chl.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db11, "db");
                        bhl.d dVarG = db11.g();
                        vc.s.k(dVarG);
                        return dVarG;
                    case 17:
                        Context context2 = fVar4.e;
                        yk0.a databaseSessionProvider5 = fVar4.d.b();
                        vc.s.j(databaseSessionProvider5);
                        de0.a databaseEncryptionMigratorFactory2 = ((cl0.a) fVar4.f).a();
                        vc.s.j(databaseEncryptionMigratorFactory2);
                        chl.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider5, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory2, "databaseEncryptionMigratorFactory");
                        WealthDiscoveryDomainDatabase.Companion companion = WealthDiscoveryDomainDatabase.INSTANCE;
                        companion.getClass();
                        WealthDiscoveryDomainDatabase wealthDiscoveryDomainDatabase = (WealthDiscoveryDomainDatabase) companion.a(context2, databaseSessionProvider5, WealthDiscoveryDomainDatabase.f, databaseEncryptionMigratorFactory2);
                        vc.s.k(wealthDiscoveryDomainDatabase);
                        return wealthDiscoveryDomainDatabase;
                    case 18:
                        return new yhl.e(new lrk.a((x4l.c) fVar4.D.get(), 1));
                    case 19:
                        Retrofit retrofit6 = (Retrofit) fVar4.f297714l.get();
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit6, "retrofit");
                        Object objCreate3 = retrofit6.create(CuratedCollectionsService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        CuratedCollectionsService curatedCollectionsService = (CuratedCollectionsService) objCreate3;
                        vc.s.k(curatedCollectionsService);
                        ghl.b dodProvider5 = new ghl.b(curatedCollectionsService, (ne0.j) fVar4.f297715m.get(), (ue0.c) fVar4.C.get());
                        Intrinsics.checkNotNullParameter(dodProvider5, "dodProvider");
                        cVar = new x4l.c(new frk.a(dodProvider5, continuation, 27), new gd3.i(dodProvider5, i3), new g75.i(dodProvider5, 29), new gaa.g(dodProvider5, continuation, 23), new g2e.m0(dodProvider5, continuation, 9));
                        break;
                    case 20:
                        je0.d mapper4 = (je0.d) fVar4.f297716n.get();
                        yk0.a databaseSessionProvider6 = fVar4.d.b();
                        vc.s.j(databaseSessionProvider6);
                        xe0.f storageFactory4 = fVar4.f297709b.f();
                        vc.s.j(storageFactory4);
                        whl.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper4, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider6, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                        return xe0.f.f(storageFactory4, databaseSessionProvider6, "curated_collections_storage", mapper4, 0, null, 56);
                    default:
                        throw new AssertionError(i2);
                }
                return cVar;
            case 12:
                if (i2 == 0) {
                    return new com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.a((erg.c) ((wpg.b) obj2).f299241c.get());
                }
                if (i2 == 1) {
                    return new erg.e();
                }
                throw new AssertionError(i2);
            case 13:
                wsb.a aVar24 = (wsb.a) obj2;
                a31.a aVar25 = aVar24.f;
                if (i2 == 0) {
                    return new deh.c(aVar24.f299685a, aVar24.f299686b, aVar24.f299687c, aVar24.d, aVar24.e, aVar25, aVar24.f299688g, aVar24.f299689h, aVar24.i, 10);
                }
                if (i2 == 1) {
                    return new a16.b(aVar24.f299690j, aVar24.k, 25);
                }
                if (i2 == 2) {
                    return new awj.b(aVar24.f299691l, 23);
                }
                if (i2 == 3) {
                    return new s5d.b(aVar25, aVar24.f299692m, 8);
                }
                throw new AssertionError(i2);
            case 14:
                return a();
            case 15:
                x13.s sVar = (x13.s) obj2;
                if (i2 == 0) {
                    return new z23.f((cli.n) sVar.d.get(), sVar.f302195a);
                }
                if (i2 == 1) {
                    return new z23.g();
                }
                throw new AssertionError(i2);
            case 16:
                x13.t tVar2 = (x13.t) obj2;
                if (i2 == 0) {
                    return new b33.f((cli.n) tVar2.d.get(), tVar2.f302198a);
                }
                if (i2 == 1) {
                    return new b33.g();
                }
                throw new AssertionError(i2);
            case 17:
                x13.u uVar = (x13.u) obj2;
                if (i2 == 0) {
                    return new d33.g((cli.n) uVar.d.get(), uVar.f302201a);
                }
                if (i2 == 1) {
                    return new d33.h();
                }
                throw new AssertionError(i2);
            case 18:
                if (i2 == 0) {
                    return new s23.c((cli.n) ((x13.w) obj2).f302211c.get());
                }
                if (i2 == 1) {
                    return new s23.g();
                }
                throw new AssertionError(i2);
            case 19:
                b0 b0Var = (b0) obj2;
                PickerScreenContract$InputData pickerScreenContract$InputData = b0Var.f302124a;
                if (i2 == 0) {
                    x13.q qVar2 = b0Var.d;
                    return new y7a.f0(ImmutableMap.of("CountryPickerScreenInteractor", (a8a.d) qVar2.f302186w.get(), "RegionPickerScreenInteractor", (a8a.d) qVar2.f302187x.get()), pickerScreenContract$InputData, (jki.p) b0Var.e.get());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData, b0Var.f302125b);
                }
                throw new AssertionError(i2);
            case 20:
                return b();
            case 21:
                return c();
            case 22:
                xaj.b bVar15 = (xaj.b) obj2;
                if (i2 == 0) {
                    bVar = new yaj.b(bVar15.f303895a, bVar15.f303896b, bVar15.f303897c);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new AssertionError(i2);
                        }
                        yaj.a aVar26 = (yaj.a) ((yaj.b) bVar15.f.get()).b();
                        vc.s.k(aVar26);
                        return aVar26;
                    }
                    bVar = new ava.d(bVar15.d, bVar15.f303898g, bVar15.e, 6);
                }
                return bVar;
            case 23:
                return d();
            case 24:
                xdj.a aVar27 = (xdj.a) obj2;
                if (i2 == 0) {
                    return new wli.w();
                }
                if (i2 == 1) {
                    return new ami.l(e4m.b.a(aVar27.o));
                }
                if (i2 == 2) {
                    return c21.l.o(aVar27.f304479a.f21322a);
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                ih0.b bVarF = aVar27.f304486m.f();
                vc.s.j(bVarF);
                xdj.b bVar16 = xdj.c.Companion;
                bVar16.getClass();
                bVar16.getClass();
                return new ami.r(bVarF);
            case 25:
                return e();
            case 26:
                return f();
            case 27:
                return g();
            case 28:
                return h();
            default:
                x0 x0Var = (x0) obj2;
                IbanScreenContract$InputData ibanScreenContract$InputData = x0Var.f305156b;
                if (i2 == 0) {
                    return new vn6.i(ibanScreenContract$InputData, (cli.n) x0Var.d.get());
                }
                if (i2 == 1) {
                    return new vn6.k(ibanScreenContract$InputData, b3j.f.a(), b3j.g.a());
                }
                throw new AssertionError(i2);
        }
    }

    public /* synthetic */ a(xf6.t tVar, x0 x0Var, int i, int i2) {
        this.f293262a = i2;
        this.f293264c = x0Var;
        this.f293263b = i;
    }
}
