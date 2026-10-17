package fd2;

import android.content.Context;
import c1g.v;
import com.feature.navigation.hub.impl.network.NavigationHubService;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeService;
import com.revolut.feature.defi.transactions.impl.data.network.DeFiFeeBreakdownService;
import com.revolut.feature.globalsearch.impl.data.GlobalSearchService;
import com.revolut.feature.globalsearch.impl.data.SmartTileService;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.additional_details.TravelHotelsAdditionalDetailsScreenContract$InputData;
import com.revolut.shared.feature.card.request.impl.data.service.CardRequestService;
import com.revolut.shared.feature.card.request.impl.data.service.LegacyCardRequestService;
import com.revolut.shared.feature.configuration.impl.network.ConfigurationService;
import djb.u;
import fma.w;
import g9g.k0;
import g9g.o1;
import g9g.p0;
import g9g.t0;
import i9g.b0;
import i9g.h0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import rpb.a0;
import tnb.d0;
import tnb.g0;
import tnb.r;
import tnb.t;
import vc.s;
import y7a.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f133891c;

    public /* synthetic */ n(Object obj2, int i, int i2) {
        this.f133889a = i2;
        this.f133891c = obj2;
        this.f133890b = i;
    }

    private final Object a() {
        g97.d dVar = (g97.d) this.f133891c;
        ee0.a aVar = dVar.f141481a;
        ite.a aVar2 = dVar.f141484g;
        pp.b bVar = dVar.e;
        cf0.f fVar = dVar.f141485h;
        int i = this.f133890b;
        switch (i) {
            case 0:
                je0.d mapper = aVar.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = dVar.f141482b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                h97.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "global_search", mapper, 0, null, 56);
            case 1:
                GlobalSearchService globalSearchServiceA = dVar.a();
                h97.b.Companion.getClass();
                ne0.d dVar2 = new ne0.d();
                ue0.c cVar = (ue0.c) dVar.i.get();
                e97.a aVar3 = (e97.a) dVar.f141486j.get();
                c97.i sourceIdentifierParser = new c97.i();
                Intrinsics.checkNotNullParameter(sourceIdentifierParser, "sourceIdentifierParser");
                return new b97.f(globalSearchServiceA, dVar2, cVar, aVar3, new r39.a());
            case 2:
                e97.b globalSearchContextParser = new e97.b();
                c97.i sourceIdentifierParser2 = new c97.i();
                Intrinsics.checkNotNullParameter(globalSearchContextParser, "globalSearchContextParser");
                Intrinsics.checkNotNullParameter(sourceIdentifierParser2, "sourceIdentifierParser");
                return new e97.a();
            case 3:
                GlobalSearchService globalSearchServiceA2 = dVar.a();
                h97.b.Companion.getClass();
                return new i97.d(globalSearchServiceA2, new fd0.d(30), new c97.i());
            case 4:
                n nVar = dVar.f141488m;
                wsg.n nVarB = dVar.d.b();
                i97.e eVar = new i97.e();
                fk3.a aVarA = dVar.f.a();
                s.j(aVarA);
                gte.a aVarB = aVar2.b();
                s.j(aVarB);
                return new i97.l(nVar, nVarB, eVar, aVarA, aVarB);
            case 5:
                Retrofit retrofit = ((nj0.d) dVar.f141483c).f();
                h97.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(SmartTileService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                SmartTileService smartTileService = (SmartTileService) objCreate;
                s.k(smartTileService);
                return smartTileService;
            case 6:
                b97.g gVar = (b97.g) dVar.o.get();
                gte.a aVarB2 = aVar2.b();
                s.j(aVarB2);
                p56.a aVar4 = new p56.a(bVar.f238111a.i());
                ef0.b bVarB = fVar.b();
                s.j(bVarB);
                return new i97.a(gVar, aVarB2, aVar4, bVarB);
            case 7:
                h97.b.Companion.getClass();
                ne0.d dVar3 = new ne0.d();
                ue0.c cVar2 = (ue0.c) dVar.i.get();
                ef0.b bVarB2 = fVar.b();
                s.j(bVarB2);
                return new b97.l(dVar3, cVar2, bVarB2, new p56.a(bVar.f238111a.i()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        t0 t0Var = (t0) this.f133891c;
        int i = this.f133890b;
        if (i == 0) {
            return new xbg.e((cli.n) t0Var.f141817c.get(), t0Var.f141816b);
        }
        if (i == 1) {
            return new xbg.f();
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        t0 t0Var = (t0) this.f133891c;
        int i = this.f133890b;
        if (i == 0) {
            return new xbg.e((cli.n) t0Var.f141817c.get(), t0Var.f141816b);
        }
        if (i == 1) {
            return new xbg.f();
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        t0 t0Var = (t0) this.f133891c;
        int i = this.f133890b;
        if (i == 0) {
            return new xbg.e((cli.n) t0Var.f141817c.get(), t0Var.f141816b);
        }
        if (i == 1) {
            return new xbg.f();
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        o1 o1Var = (o1) this.f133891c;
        int i = this.f133890b;
        if (i == 0) {
            return new v((p8g.c) o1Var.d.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        gte.a aVarB = o1Var.f141768a.b();
        s.j(aVarB);
        xoj.a aVarA = o1Var.f141769b.a();
        s.j(aVarA);
        eub.a aVarA2 = o1Var.f141770c.a();
        s.j(aVarA2);
        return new i9g.v(aVarA2, aVarB, aVarA);
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object qVar;
        Object rVar;
        int i = this.f133889a;
        int i2 = this.f133890b;
        Object obj2 = this.f133891c;
        switch (i) {
            case 0:
                if (i2 == 0) {
                    return new ld2.a((cli.n) ((o) obj2).f133892a.get());
                }
                if (i2 == 1) {
                    return new ld2.d();
                }
                throw new AssertionError(i2);
            case 1:
                p pVar = (p) obj2;
                a31.a aVar2 = pVar.e;
                a31.a aVar3 = pVar.f133896c;
                ecm.q qVar2 = pVar.f133894a;
                if (i2 == 0) {
                    aVar = new a(pVar.f133895b, aVar3, pVar.d, aVar2, pVar.f, qVar2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new AssertionError(i2);
                        }
                        f fVar = (f) ((a) pVar.f133897g.get()).b();
                        s.k(fVar);
                        return fVar;
                    }
                    aVar = new ezj.h(qVar2, aVar3, aVar2, pVar.f133898h, 1);
                }
                return aVar;
            case 2:
                fdb.a aVar4 = (fdb.a) obj2;
                if (i2 == 0) {
                    return new hdb.c((sri.m) aVar4.d.get(), ((ika.b) aVar4.f133925b).b());
                }
                if (i2 == 1) {
                    Context context = aVar4.f133924a;
                    fdb.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return sri.o.c(context, null, null, 14);
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                gte.a aVarB = aVar4.f133926c.b();
                s.j(aVarB);
                return new hdb.e(aVarB);
            case 3:
                fdj.d dVar = (fdj.d) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new anl.j(dVar.f133963a);
                    }
                    throw new AssertionError(i2);
                }
                jki.p stateMapper = (jki.p) dVar.f133964b.get();
                Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
                return new ndj.d(stateMapper);
            case 4:
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new pdj.i();
                    }
                    throw new AssertionError(i2);
                }
                jki.p stateMapper2 = (jki.p) ((fdj.e) obj2).f133966a.get();
                Intrinsics.checkNotNullParameter(stateMapper2, "stateMapper");
                return new pdj.f(stateMapper2);
            case 5:
                fhh.b bVar = (fhh.b) obj2;
                if (i2 == 0) {
                    ybl.k kVarD = bVar.f135233a.d();
                    s.j(kVarD);
                    return new mhh.d(kVarD);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new ehh.b();
                    }
                    throw new AssertionError(i2);
                }
                kpj.f fVar2 = new kpj.f(bVar.f135234b.H());
                hj8.a aVarA = bVar.f135235c.a();
                s.j(aVarA);
                z80.b bVarS = bVar.d.s();
                s.j(bVarS);
                return new shh.g(fVar2, aVarA, bVarS);
            case 6:
                fma.b bVar2 = (fma.b) obj2;
                if (i2 == 0) {
                    return kxa.j.s((j60.a) bVar2.f136044c.get());
                }
                if (i2 == 1) {
                    return kxa.j.q((com.revolut.kompot.navigable.a) bVar2.f136042a.get(), (rp0.m) bVar2.f136043b.get(), new j60.e());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 == 3) {
                    return new dna.g((j60.a) bVar2.e.get(), (jki.p) bVar2.f.get());
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        return new dna.h();
                    }
                    throw new AssertionError(i2);
                }
                j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) bVar2.f136044c.get();
                ena.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
                s.k(bottomExpandableDialogEmbeddedControllerExtension);
                return bottomExpandableDialogEmbeddedControllerExtension;
            case 7:
                fma.o oVar = (fma.o) obj2;
                q8b.a aVar5 = oVar.f136209a;
                if (i2 == 0) {
                    n8b.b bVarB = aVar5.b();
                    s.j(bVarB);
                    return new kma.a(bVarB);
                }
                if (i2 == 1) {
                    return new kma.b(oVar.f);
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                fk3.a aVarA2 = oVar.f136210b.a();
                s.j(aVarA2);
                gbd.a aVar6 = (gbd.a) oVar.e.get();
                n8b.b bVarB2 = aVar5.b();
                s.j(bVarB2);
                return new hma.o(aVarA2, aVar6, bVarB2, oVar.f136211c.c(), oVar.d.e());
            case 8:
                aj3.j jVar = (aj3.j) obj2;
                PickerScreenContract$InputData pickerScreenContract$InputData = jVar.f5394b;
                if (i2 == 0) {
                    w wVar = (w) jVar.f;
                    return new f0(ImmutableMap.of("VaultsCurrencyPickerInteractor", (a8a.d) wVar.e.get(), "StatementsCurrencyPickerInteractor", (a8a.d) wVar.f.get()), pickerScreenContract$InputData, (jki.p) jVar.d.get());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData, jVar.f5395c);
                }
                throw new AssertionError(i2);
            case 9:
                fob.a aVar7 = (fob.a) obj2;
                switch (i2) {
                    case 0:
                        cob.e eVarJ = aVar7.j();
                        ite.a aVar8 = aVar7.f136891m;
                        anb.s sVar = aVar7.f136884a;
                        xnb.a aVar9 = (xnb.a) aVar7.I.get();
                        djb.n nVarA = sVar.a();
                        s.j(nVarA);
                        djb.n nVarA2 = sVar.a();
                        s.j(nVarA2);
                        u uVarD = sVar.d();
                        s.j(uVarD);
                        blb.e eVar = (blb.e) aVar7.e;
                        elb.b bVarE = eVar.e();
                        c89.b bVar3 = aVar7.k;
                        x79.a aVarA3 = bVar3.a();
                        s.j(aVarA3);
                        ou5.b bVarG = aVar7.g();
                        xqe.b bVarA = aVar7.f136890l.a();
                        s.j(bVarA);
                        iob.c cVarC = eVar.c();
                        mbd.b bVar4 = new mbd.b();
                        dcd.b bVar5 = new dcd.b();
                        gte.a aVarB2 = aVar8.b();
                        s.j(aVarB2);
                        y79.a aVarB3 = bVar3.b();
                        s.j(aVarB3);
                        aob.d dVar2 = new aob.d(cVarC, bVar4, bVar5, aVarB2, aVarB3, new aob.a(aVar7.f136892n.a()), new gjb.b(), aVar7.h(), new wjb.a(), aVar7.i());
                        ijb.a aVarG = eVar.g();
                        s.j(aVarG);
                        gte.a aVarB4 = aVar8.b();
                        s.j(aVarB4);
                        tnb.g gVar = new tnb.g(nVarA2, uVarD, bVarE, aVarA3, bVarG, bVarA, dVar2, aVarG, aVarB4, aVar7.f136893p.i(), new gjb.b(), aVar7.f136889j.e());
                        rnb.w wVarB = aVar7.f136894q.b();
                        s.j(wVarB);
                        wsg.n nVarB = aVar7.f136895r.b();
                        djb.n nVarA3 = sVar.a();
                        s.j(nVarA3);
                        t tVar = new t(wVarB, nVarB, nVarA3);
                        cob.e eVarJ2 = aVar7.j();
                        lkb.a challengeFooterMapper = new lkb.a();
                        lkb.e challengeTimelineMapper = new lkb.e();
                        Intrinsics.checkNotNullParameter(challengeFooterMapper, "challengeFooterMapper");
                        Intrinsics.checkNotNullParameter(challengeTimelineMapper, "challengeTimelineMapper");
                        lkb.d dVar3 = new lkb.d();
                        ugc.a aVarB5 = ((vjb.b) aVar7.f136896s).b();
                        gte.a aVarB6 = aVar8.b();
                        s.j(aVarB6);
                        qVar = new tnb.q(eVarJ, aVar9, nVarA, gVar, tVar, new k18.c(eVarJ2, dVar3, aVarB5, aVarB6), new gjb.b());
                        return qVar;
                    case 1:
                        ijb.a aVarG2 = ((blb.e) aVar7.e).g();
                        s.j(aVarG2);
                        return new xnb.q(aVarG2, new dcd.b(), aVar7.g(), aVar7.f136889j.e());
                    case 2:
                        djb.n nVarA4 = aVar7.f136884a.a();
                        s.j(nVarA4);
                        ou5.b bVarG2 = aVar7.g();
                        l61.a aVarB7 = aVar7.f136897t.f172982a.b();
                        s.j(aVarB7);
                        return new wnb.c(nVarA4, bVarG2, new kd6.a(aVarB7, 0));
                    case 3:
                        tib.b bVar6 = aVar7.e;
                        tib.b bVar7 = aVar7.e;
                        ijb.a aVarG3 = ((blb.e) bVar6).g();
                        s.j(aVarG3);
                        znb.a aVar10 = (znb.a) aVar7.L.get();
                        oqk.l lVarB = aVar7.f136885b.b();
                        s.j(lVarB);
                        mjb.a aVarA4 = ((anb.n) aVar7.f136886c).a();
                        s.j(aVarA4);
                        skb.f fVarB = ((blb.e) bVar7).b();
                        w5i.b bVarB3 = aVar7.u.b();
                        s.j(bVarB3);
                        wob.a aVar11 = new wob.a();
                        rnb.w wVarB2 = aVar7.f136894q.b();
                        s.j(wVarB2);
                        djb.n nVarA5 = aVar7.f136884a.a();
                        s.j(nVarA5);
                        rVar = new r(aVarG3, aVar10, lVarB, aVarA4, fVarB, bVarB3, aVar11, wVarB2, nVarA5, aVar7.f136893p.b(), ((blb.e) bVar7).h(), ((s41.a) aVar7.v).d(), ((vjb.b) aVar7.f136896s).b(), aVar7.f136898w.a(), new gjb.b(), new kkb.b());
                        return rVar;
                    case 4:
                        return new znb.b();
                    case 5:
                        e4m.e eVar2 = aVar7.N;
                        tib.b bVar8 = aVar7.e;
                        anb.s sVar2 = aVar7.f136884a;
                        d0 d0Var = (d0) eVar2.get();
                        djb.n nVarA6 = sVar2.a();
                        s.j(nVarA6);
                        ijb.a aVarG4 = ((blb.e) bVar8).g();
                        s.j(aVarG4);
                        toh.d dVarA = aVar7.f136894q.a();
                        u uVarD2 = sVar2.d();
                        s.j(uVarD2);
                        x79.a aVarA5 = aVar7.k.a();
                        s.j(aVarA5);
                        elb.b bVarE2 = ((blb.e) bVar8).e();
                        gte.a aVarB8 = aVar7.f136891m.b();
                        s.j(aVarB8);
                        aob.f fVar3 = new aob.f(aVarB8);
                        ou5.b bVarG3 = aVar7.g();
                        xqe.b bVarA2 = aVar7.f136890l.a();
                        s.j(bVarA2);
                        return new aob.i(d0Var, nVarA6, aVarG4, dVarA, uVarD2, aVarA5, bVarE2, fVar3, bVarG3, bVarA2, aVar7.f136893p.i(), ((vjb.b) aVar7.f136896s).b(), aVar7.f136889j.e());
                    case 6:
                        iob.c cVarC2 = ((blb.e) aVar7.e).c();
                        mbd.b bVar9 = new mbd.b();
                        dcd.b bVar10 = new dcd.b();
                        gte.a aVarB9 = aVar7.f136891m.b();
                        s.j(aVarB9);
                        y79.a aVarB10 = aVar7.k.b();
                        s.j(aVarB10);
                        return new aob.d(cVarC2, bVar9, bVar10, aVarB9, aVarB10, new aob.a(aVar7.f136892n.a()), new gjb.b(), aVar7.h(), new wjb.a(), aVar7.i());
                    case 7:
                        g0 g0VarH = aVar7.h();
                        tib.b bVar11 = aVar7.e;
                        ite.a aVar12 = aVar7.f136891m;
                        dcd.b bVar12 = new dcd.b();
                        gte.a aVarB11 = aVar12.b();
                        s.j(aVarB11);
                        vnb.i iVar = new vnb.i(g0VarH, bVar12, aVarB11);
                        rnb.w wVarB3 = aVar7.f136894q.b();
                        s.j(wVarB3);
                        ijb.a aVarG5 = ((blb.e) bVar11).g();
                        s.j(aVarG5);
                        slb.a aVarA6 = aVar7.f136899x.a();
                        elb.b bVarE3 = ((blb.e) bVar11).e();
                        ffk.t tVarF = aVar7.f136900y.f();
                        s.j(tVarF);
                        gte.a aVarB12 = aVar12.b();
                        s.j(aVarB12);
                        qVar = new vnb.h(iVar, wVarB3, aVarG5, aVarA6, bVarE3, tVarF, aVarB12, aVar7.f136889j.e(), aVar7.f136895r.a());
                        return qVar;
                    case 8:
                        e4m.e eVar3 = aVar7.S;
                        ite.a aVar13 = aVar7.f136891m;
                        l70.e eVar4 = aVar7.G;
                        bnb.a aVar14 = aVar7.f136894q;
                        fpg.c cVar = aVar7.B;
                        qpb.e eVar5 = (qpb.e) eVar3.get();
                        hpg.a aVar15 = (hpg.a) ((wpg.l) cVar).V.get();
                        s.j(aVar15);
                        ft6.d dVar4 = new ft6.d();
                        xzi.a aVar16 = (xzi.a) ((dqj.r) aVar7.E).Y.get();
                        s.j(aVar16);
                        nob.a aVar17 = new nob.a(aVar15, dVar4, aVar16);
                        ppg.b bVarB4 = ((wpg.l) cVar).b();
                        s.j(bVarB4);
                        rnb.w wVarB4 = aVar14.b();
                        s.j(wVarB4);
                        wsg.n nVarB2 = aVar7.f136895r.b();
                        xoj.a aVarA7 = aVar7.F.a();
                        s.j(aVarA7);
                        elb.b bVarE4 = ((blb.e) aVar7.e).e();
                        rpb.c cVar2 = (rpb.c) aVar7.U.get();
                        rpb.d dVar5 = (rpb.d) aVar7.T.get();
                        rpb.b bVar13 = new rpb.b();
                        mjb.a aVarA8 = ((anb.n) aVar7.f136886c).a();
                        s.j(aVarA8);
                        tpb.g gVar2 = new tpb.g();
                        l80.e eVarH = eVar4.h();
                        s.j(eVarH);
                        ypb.g gVar3 = new ypb.g(eVarH);
                        wa7.m mVarI = aVar7.f136893p.i();
                        gte.a aVarB13 = aVar13.b();
                        s.j(aVarB13);
                        rnb.w wVarB5 = aVar14.b();
                        s.j(wVarB5);
                        gte.a aVarB14 = aVar13.b();
                        s.j(aVarB14);
                        a0 a0Var = new a0(wVarB5, aVarB14, (qpb.e) aVar7.S.get());
                        l80.e eVarH2 = eVar4.h();
                        s.j(eVarH2);
                        return new ppb.a(eVar5, aVar17, bVarB4, wVarB4, nVarB2, aVarA7, bVarE4, cVar2, dVar5, bVar13, aVarA8, gVar2, gVar3, mVarI, aVarB13, a0Var, eVarH2);
                    case 9:
                        bt6.b bVar14 = aVar7.A;
                        gr6.e freelancerAvailabilityInteractor = bVar14.f18294a.a();
                        s.j(freelancerAvailabilityInteractor);
                        zjh.i freelancerTaxPocketsInteractor = bVar14.e();
                        xua.a recurringPaymentInteractor = bVar14.f.a();
                        s.j(recurringPaymentInteractor);
                        ppg.b vaultsInteractor = ((wpg.l) bVar14.f18297g).b();
                        s.j(vaultsInteractor);
                        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
                        Intrinsics.checkNotNullParameter(freelancerTaxPocketsInteractor, "freelancerTaxPocketsInteractor");
                        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
                        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
                        twg.c cVar3 = new twg.c();
                        cVar3.f275017a = freelancerAvailabilityInteractor;
                        cVar3.f275018b = freelancerTaxPocketsInteractor;
                        cVar3.f275019c = recurringPaymentInteractor;
                        cVar3.d = vaultsInteractor;
                        ppg.b bVarB5 = ((wpg.l) aVar7.B).b();
                        s.j(bVarB5);
                        rnb.w wVarB6 = aVar7.f136894q.b();
                        s.j(wVarB6);
                        rnb.m mVar = (rnb.m) aVar7.f136884a.u.get();
                        s.j(mVar);
                        kbb.c cVarA = aVar7.C.a();
                        s6e.b bVar15 = (s6e.b) aVar7.D.T.get();
                        s.j(bVar15);
                        return new qpb.n(cVar3, bVarB5, wVarB6, mVar, cVarA, bVar15);
                    case 10:
                        anb.s sVar3 = aVar7.f136884a;
                        izi.a aVar18 = aVar7.E;
                        anb.s sVar4 = aVar7.f136884a;
                        tib.b bVar16 = aVar7.e;
                        djb.n nVarA7 = sVar3.a();
                        s.j(nVarA7);
                        elb.b bVarE5 = ((blb.e) bVar16).e();
                        rnb.w wVarB7 = aVar7.f136894q.b();
                        s.j(wVarB7);
                        djb.p pVar2 = (djb.p) sVar4.f6709t.get();
                        s.j(pVar2);
                        wsg.n nVarB3 = aVar7.f136895r.b();
                        l80.e eVarH3 = aVar7.G.h();
                        s.j(eVarH3);
                        rnb.a aVar19 = new rnb.a((mjb.a) ((anb.n) aVar7.f136886c).H.get());
                        ijb.a aVarG6 = ((blb.e) bVar16).g();
                        s.j(aVarG6);
                        djb.q qVarC = sVar4.c();
                        s.j(qVarC);
                        eqj.d dVarA2 = ((dqj.r) aVar18).a();
                        s.j(dVarA2);
                        kzi.a aVarB15 = ((dqj.r) aVar18).b();
                        s.j(aVarB15);
                        rVar = new rpb.u(nVarA7, bVarE5, wVarB7, pVar2, nVarB3, eVarH3, aVar19, aVarG6, qVarC, dVarA2, aVarB15, (rpb.d) aVar7.T.get(), aVar7.d.c(), ((vjb.b) aVar7.f136896s).b(), new gjb.b());
                        return rVar;
                    case 11:
                        return new rpb.a();
                    case 12:
                        rlb.a aVar20 = aVar7.f136899x;
                        tib.b bVar17 = aVar7.e;
                        slb.a aVarA9 = aVar20.a();
                        elb.b bVarE6 = ((blb.e) bVar17).e();
                        ijb.a aVarG7 = ((blb.e) bVar17).g();
                        s.j(aVarG7);
                        ffk.t tVarF2 = aVar7.f136900y.f();
                        s.j(tVarF2);
                        rVar = new bob.j(aVarA9, bVarE6, aVarG7, tVarF2, aVar7.h(), aVar7.f136889j.e(), aVar7.H.g());
                        return rVar;
                    case 13:
                        return new bob.a();
                    case 14:
                        return new bob.c();
                    default:
                        throw new AssertionError(i2);
                }
            case 10:
                fq6.a aVar21 = (fq6.a) obj2;
                ee0.a aVar22 = aVar21.f137190b;
                if (i2 == 0) {
                    yk0.a databaseSessionProvider = aVar21.f137189a.b();
                    s.j(databaseSessionProvider);
                    je0.d mapper = aVar22.b();
                    s.j(mapper);
                    xe0.f storageFactory = aVar22.f();
                    s.j(storageFactory);
                    fq6.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(mapper, "mapper");
                    Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                    return xe0.f.f(storageFactory, databaseSessionProvider, "flexible_staking_consent_storage", mapper, 0, null, 56);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new cq6.c((ue0.c) aVar21.f137193h.get());
                    }
                    if (i2 == 3) {
                        return new eq6.b();
                    }
                    throw new AssertionError(i2);
                }
                iq6.a aVar23 = new iq6.a();
                cq6.c cVar4 = (cq6.c) aVar21.i.get();
                yud.g gVarD = aVar21.f137191c.d();
                s.j(gVarD);
                gte.a aVarB16 = aVar21.d.b();
                s.j(aVarB16);
                return new cq6.d(aVar23, cVar4, gVarD, new cq6.n(aVarB16, aVar21.e.h()));
            case 11:
                g5f.a aVar24 = (g5f.a) obj2;
                u8h.c cVar5 = (u8h.c) aVar24.f140783j;
                zdl.c cVar6 = aVar24.f140779b;
                h9h.a aVar25 = (h9h.a) aVar24.k;
                if (i2 == 0) {
                    ybl.d dVarH = cVar6.h();
                    s.j(dVarH);
                    return new f5f.d(dVarH);
                }
                if (i2 == 1) {
                    aah.i factory = ((u8h.b) cVar5).d();
                    s.j(factory);
                    g5f.e.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return new h5f.d(factory.a());
                }
                if (i2 == 2) {
                    aah.i factory2 = ((u8h.b) cVar5).d();
                    s.j(factory2);
                    g5f.e.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    return new h5f.c(factory2.b());
                }
                if (i2 == 3) {
                    ybl.d dVarH2 = cVar6.h();
                    s.j(dVarH2);
                    return new f5f.e(dVarH2);
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new AssertionError(i2);
                    }
                    g5f.g.Companion.getClass();
                    return null;
                }
                ybl.l lVarF = aVar25.f();
                kpj.f fVar4 = new kpj.f(aVar25.H());
                ybl.k kVarD2 = ((zdl.f) aVar24.f140784l).d();
                s.j(kVarD2);
                return new f5f.c(lVarF, fVar4, kVarD2);
            case 12:
                g67.b bVar18 = (g67.b) obj2;
                if (i2 == 0) {
                    return new com.revolut.feature.full_screen_prompt.e((cli.n) bVar18.f140884b.get());
                }
                if (i2 == 1) {
                    return new d67.j(bVar18.f140883a);
                }
                throw new AssertionError(i2);
            case 13:
                g6l.e eVar6 = (g6l.e) obj2;
                nj0.a aVar26 = eVar6.f141018a;
                ee0.a aVar27 = eVar6.f141019b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new ne0.d();
                    }
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    je0.d mapper2 = aVar27.b();
                    s.j(mapper2);
                    yk0.a databaseSessionProvider2 = eVar6.f141020c.b();
                    s.j(databaseSessionProvider2);
                    xe0.f fVarF = aVar27.f();
                    s.j(fVarF);
                    g6l.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapper2, "mapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                    return xe0.f.g(fVarF, databaseSessionProvider2, "card_order", mapper2, 4, zhm.v.k(v0.a.c(fVarF, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5)), true, 32);
                }
                h98.e.Companion.getClass();
                h98.c cVar7 = new h98.c();
                ik0.b retrofitFactory = ((nj0.d) aVar26).m();
                s.j(retrofitFactory);
                g6l.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, null, null, 30).create(LegacyCardRequestService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                LegacyCardRequestService legacyCardRequestService = (LegacyCardRequestService) objCreate;
                s.k(legacyCardRequestService);
                ik0.b retrofitFactory2 = ((nj0.d) aVar26).m();
                s.j(retrofitFactory2);
                da3.m cardsNetworkConfiguration = new da3.m();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(cardsNetworkConfiguration, "cardsNetworkConfiguration");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, null, null, null, 28).create(CardRequestService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                CardRequestService cardRequestService = (CardRequestService) objCreate2;
                s.k(cardRequestService);
                ne0.j jVar2 = (ne0.j) eVar6.e.get();
                ue0.c cVar8 = (ue0.c) eVar6.f.get();
                ze0.a aVarA10 = aVar27.a();
                s.j(aVarA10);
                b80.c cVarP = eVar6.d.p();
                s.j(cVarP);
                return new d6l.h(cVar7, legacyCardRequestService, cardRequestService, jVar2, cVar8, aVarA10, cVarP);
            case 14:
                g76.a aVar28 = (g76.a) obj2;
                ee0.a aVar29 = aVar28.f141128c;
                if (i2 == 0) {
                    e76.d dVar6 = (e76.d) aVar28.f141130h.get();
                    xv5.c cVarA2 = aVar28.d.a();
                    s.j(cVarA2);
                    return new h76.a(dVar6, cVarA2);
                }
                if (i2 == 1) {
                    return new e76.d((DeFiFeeBreakdownService) aVar28.e.get(), (ne0.j) aVar28.f.get(), (ue0.c) aVar28.f141129g.get());
                }
                if (i2 == 2) {
                    DeFiFeeBreakdownService deFiFeeBreakdownService = (DeFiFeeBreakdownService) a0.d.f((nj0.d) aVar28.f141127b, "retrofit", DeFiFeeBreakdownService.class, "create(...)");
                    s.k(deFiFeeBreakdownService);
                    return deFiFeeBreakdownService;
                }
                if (i2 == 3) {
                    return new ne0.d();
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                je0.d mapper3 = aVar29.b();
                s.j(mapper3);
                xe0.f storageFactory2 = aVar29.f();
                s.j(storageFactory2);
                g76.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.e(storageFactory2, "defi_transactions_storage", mapper3, 8);
            case 15:
                g7l.c cVar9 = (g7l.c) obj2;
                ee0.a aVar30 = cVar9.f141213b;
                switch (i2) {
                    case 0:
                        return new f7l.a((f7l.b) cVar9.i.get());
                    case 1:
                        return new f7l.k((ConfigurationService) cVar9.e.get(), (ue0.c) cVar9.f.get(), (lfm.c) cVar9.f141215g.get(), (ne0.j) cVar9.f141216h.get(), (ne0.j) cVar9.f141216h.get());
                    case 2:
                        Retrofit retrofit = (Retrofit) cVar9.d.get();
                        g7l.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate3 = retrofit.create(ConfigurationService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        ConfigurationService configurationService = (ConfigurationService) objCreate3;
                        s.k(configurationService);
                        return configurationService;
                    case 3:
                        Retrofit retrofit3 = ((nj0.d) cVar9.f141212a).f();
                        kg.o gson = fe0.c.a();
                        d7l.a networkConfiguration = cVar9.f141214c;
                        g7l.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
                        return j6.a.B(retrofit3.newBuilder().baseUrl(networkConfiguration.getHostUrl()), gson, "build(...)");
                    case 4:
                        je0.d mapper4 = aVar30.b();
                        s.j(mapper4);
                        xe0.f storageFactory3 = aVar30.f();
                        s.j(storageFactory3);
                        g7l.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper4, "mapper");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return storageFactory3.d(3, "configuration_storage.pref", zhm.v.k(new h7l.a(), new we0.e(2, 3, 0)), mapper4);
                    case 5:
                        g7l.b.Companion.getClass();
                        return new ifm.b();
                    case 6:
                        g7l.b.Companion.getClass();
                        return new ne0.d();
                    default:
                        throw new AssertionError(i2);
                }
            case 16:
                if (i2 == 0) {
                    g8b.d.Companion.getClass();
                    return new ifm.b();
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Context context2 = ((g8b.a) obj2).f141332a;
                g8b.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                return sri.o.c(context2, null, null, 14);
            case 17:
                g8g.a aVar31 = (g8g.a) obj2;
                if (i2 == 0) {
                    return new bi3.j(aVar31.f141352a, aVar31.f141353b, aVar31.f141354c, aVar31.d, aVar31.e, aVar31.f141357j);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new i8g.d(aVar31.f, aVar31.f141355g, aVar31.f141356h);
                    }
                    throw new AssertionError(i2);
                }
                i8g.c cVar10 = (i8g.c) ((i8g.d) aVar31.i.get()).b();
                s.k(cVar10);
                return cVar10;
            case 18:
                g92.e eVar7 = (g92.e) obj2;
                if (i2 == 0) {
                    return new f92.g((ViaVerdeService) eVar7.f.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Retrofit retrofit4 = ((nj0.d) eVar7.f141443a).f();
                g92.i.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Object objCreate4 = retrofit4.create(ViaVerdeService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                ViaVerdeService viaVerdeService = (ViaVerdeService) objCreate4;
                s.k(viaVerdeService);
                return viaVerdeService;
            case 19:
                g92.g gVar4 = (g92.g) obj2;
                g92.e eVar8 = gVar4.f141450a;
                if (i2 == 0) {
                    f92.g gVar5 = (f92.g) eVar8.f141446g.get();
                    whf.b bVarA3 = eVar8.d.a();
                    s.j(bVarA3);
                    return new com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.c(new l92.g(gVar5, bVarA3), new e92.a(), (cli.n) gVar4.f141451b.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Intrinsics.checkNotNullParameter(new e92.b(), "mapper");
                n92.b bVar19 = new n92.b();
                thf.g gVarE = eVar8.d.e();
                s.j(gVarE);
                return new com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.d(bVar19, new n92.d(gVarE));
            case 20:
                return a();
            case 21:
                g9g.b bVar20 = (g9g.b) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new at.r(new jdg.f());
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar = (cli.n) bVar20.f141597c.get();
                TravelHotelsAdditionalDetailsScreenContract$InputData travelHotelsAdditionalDetailsScreenContract$InputData = bVar20.f141595a;
                g9g.d dVar7 = bVar20.f141596b;
                return new jdg.e(nVar, travelHotelsAdditionalDetailsScreenContract$InputData, new i9g.d0((b0) dVar7.m0.get(), (h0) dVar7.f141631o0.get()));
            case 22:
                g9g.b0 b0Var = (g9g.b0) obj2;
                if (i2 == 0) {
                    return new vcg.f((cli.n) b0Var.f141599b.get(), b0Var.f141598a);
                }
                if (i2 == 1) {
                    return new vcg.g();
                }
                throw new AssertionError(i2);
            case 23:
                if (i2 == 0) {
                    return new seg.b((cli.n) ((k0) obj2).f141727a.get());
                }
                if (i2 == 1) {
                    return new seg.c();
                }
                throw new AssertionError(i2);
            case 24:
                if (i2 == 0) {
                    return new com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.a(((p0) obj2).f141775a);
                }
                if (i2 == 1) {
                    return new xag.g();
                }
                throw new AssertionError(i2);
            case 25:
                return b();
            case 26:
                return c();
            case 27:
                return d();
            case 28:
                return e();
            default:
                ga.a aVar32 = (ga.a) obj2;
                ee0.a aVar33 = aVar32.e;
                if (i2 == 0) {
                    ecm.k0 k0Var = new ecm.k0();
                    k0Var.f124832a = r0.k(new Pair("PENDING", fa.l.PENDING), new Pair("COMPLETED", fa.l.COMPLETED), new Pair("IN_REVIEW", fa.l.IN_REVIEW));
                    return new ja.b(k0Var, (NavigationHubService) aVar32.i.get(), (ue0.c) aVar32.f141960j.get(), (ne0.j) aVar32.k.get());
                }
                if (i2 == 1) {
                    Retrofit retrofit5 = ((nj0.d) aVar32.d).f();
                    ga.h.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                    Object objCreate5 = retrofit5.create(NavigationHubService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate5, "create(...)");
                    NavigationHubService navigationHubService = (NavigationHubService) objCreate5;
                    s.k(navigationHubService);
                    return navigationHubService;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        return new ne0.d();
                    }
                    throw new AssertionError(i2);
                }
                je0.d mapper5 = aVar33.b();
                s.j(mapper5);
                yk0.a databaseSessionProvider3 = aVar32.f.b();
                s.j(databaseSessionProvider3);
                xe0.f storageFactory4 = aVar33.f();
                s.j(storageFactory4);
                ga.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper5, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                return xe0.f.f(storageFactory4, databaseSessionProvider3, "navigation_hub", mapper5, 1, zhm.f0.f322471a, 32);
        }
    }
}
