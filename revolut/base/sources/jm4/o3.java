package jm4;

import android.content.Context;
import com.revolut.feature.credit.overdraft.impl.network.OverdraftService;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreenContract$InputData;
import com.revolut.feature.user.checklist.impl.data.service.AdoptionJourneyService;
import com.revolut.feature.user.checklist.impl.data.service.UserChecklistService;
import com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.ScreenerStatsFiltersControllerContract$InputData;
import dw3.a6;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes22.dex */
public final class o3 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f176233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f176234c;

    public /* synthetic */ o3(Object obj2, int i, int i2) {
        this.f176232a = i2;
        this.f176234c = obj2;
        this.f176233b = i;
    }

    private final Object a() {
        kmg.a aVar = (kmg.a) this.f176234c;
        int i = this.f176233b;
        switch (i) {
            case 0:
                return new lmg.f(e4m.b.a(aVar.f185858m), aVar.d.c(), aVar.e.b(), (lmg.s) aVar.f185859n.get());
            case 1:
                ue0.c storage = (ue0.c) aVar.f185856j.get();
                ne0.j memoryCache = (ne0.j) aVar.k.get();
                AdoptionJourneyService adoptionService = (AdoptionJourneyService) aVar.f185857l.get();
                kmg.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(storage, "storage");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                Intrinsics.checkNotNullParameter(adoptionService, "adoptionService");
                return new img.d(adoptionService, storage, memoryCache);
            case 2:
                je0.d mapper = aVar.f185851a.d();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = aVar.f185852b.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f185851a.f();
                vc.s.j(storageFactory);
                kmg.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "ADOPTION_JOURNEY_FILE", mapper, 0, null, 56);
            case 3:
                return new ne0.d();
            case 4:
                rsb.b deps = aVar.f185853c;
                kmg.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(deps, "deps");
                Object objCreate = ((Retrofit) deps.f257044b.get()).create(AdoptionJourneyService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                AdoptionJourneyService adoptionJourneyService = (AdoptionJourneyService) objCreate;
                vc.s.k(adoptionJourneyService);
                return adoptionJourneyService;
            case 5:
                return new lmg.s();
            case 6:
                d4m.a aVarA = e4m.b.a(aVar.f185861q);
                skd.i iVarC = aVar.d.c();
                l93.f fVarJ = aVar.f185854g.j();
                vc.s.j(fVarJ);
                t9l.g gVarA = aVar.f185855h.a();
                vc.s.j(gVarA);
                return new lmg.m(aVarA, iVarC, new k7i.i(fVarJ, gVarA), aVar.e.b(), (lmg.s) aVar.f185859n.get());
            case 7:
                ue0.c storage2 = (ue0.c) aVar.f185856j.get();
                ne0.j memoryCache2 = (ne0.j) aVar.k.get();
                UserChecklistService userChecklistService = (UserChecklistService) aVar.f185860p.get();
                vxc.h hVar = aVar.f;
                yxc.l lVar = (yxc.l) hVar.f293075b.get();
                vc.s.j(lVar);
                yxc.l lVarA = hVar.a();
                vc.s.j(lVarA);
                hmg.b userChecklistMapper = new hmg.b(lVar, lVarA);
                kmg.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(storage2, "storage");
                Intrinsics.checkNotNullParameter(memoryCache2, "memoryCache");
                Intrinsics.checkNotNullParameter(userChecklistService, "userChecklistService");
                Intrinsics.checkNotNullParameter(userChecklistMapper, "userChecklistMapper");
                return new img.g(userChecklistService, storage2, userChecklistMapper, memoryCache2);
            case 8:
                rsb.b deps2 = aVar.f185853c;
                kmg.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(deps2, "deps");
                Object objCreate2 = ((Retrofit) deps2.f257044b.get()).create(UserChecklistService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                UserChecklistService userChecklistService2 = (UserChecklistService) objCreate2;
                vc.s.k(userChecklistService2);
                return userChecklistService2;
            case 9:
                CoroutineScope coroutineScopeA = aVar.i.a();
                vc.s.j(coroutineScopeA);
                emg.a aVar2 = (emg.a) aVar.o.get();
                zm0.c cVarJ = aVar.f185852b.j();
                vc.s.j(cVarJ);
                return new omg.c(coroutineScopeA, aVar2, cVarJ);
            case 10:
                CoroutineScope coroutineScopeA2 = aVar.i.a();
                vc.s.j(coroutineScopeA2);
                emg.a aVar3 = (emg.a) aVar.f185862r.get();
                zm0.c cVarJ2 = aVar.f185852b.j();
                vc.s.j(cVarJ2);
                return new omg.g(coroutineScopeA2, aVar3, cVarJ2);
            case 11:
                return new nmg.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        kr9.s sVar = (kr9.s) this.f176234c;
        int i = this.f176233b;
        if (i != 0) {
            if (i == 1) {
                return new pt9.d();
            }
            throw new AssertionError(i);
        }
        mq9.f fVarC = sVar.f188795b.f188757b.c();
        vc.s.j(fVarC);
        return new pt9.i(new os2.g(fVarC), sVar.f188794a, (jki.p) sVar.f188796c.get());
    }

    private final Object c() {
        kti.i iVar = (kti.i) this.f176234c;
        kti.g gVar = iVar.f189555a;
        int i = this.f176233b;
        if (i == 0) {
            return new lvi.a();
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        zsi.e eVarA = gVar.a();
        vc.s.j(eVarA);
        zsi.i iVar2 = (zsi.i) gVar.D.get();
        vc.s.j(iVar2);
        l80.e eVarH = iVar.f189556b.h();
        vc.s.j(eVarH);
        jvi.c cVar = (jvi.c) gVar.E.get();
        vc.s.j(cVar);
        return new mvi.f(eVarA, iVar2, eVarH, cVar);
    }

    private final Object d() {
        ku5.f fVar = (ku5.f) this.f176234c;
        l70.e eVar = fVar.f189670j;
        djf.c cVar = fVar.d;
        int i = this.f176233b;
        if (i == 0) {
            dv5.q qVarA = fVar.a();
            pt5.f fVar2 = (pt5.f) fVar.f189676r.get();
            iva.a aVarA = fVar.f.a();
            vc.s.j(aVarA);
            pu5.f fVar3 = new pu5.f();
            pu5.e eVarC = fVar.c();
            pu5.a aVarB = fVar.b();
            whf.b bVarA = cVar.a();
            vc.s.j(bVarA);
            wsg.n nVarB = fVar.f189665a.b();
            p0i.b bVarE = fVar.f189669h.e();
            vc.s.j(bVarE);
            xua.a aVarA2 = fVar.i.a();
            vc.s.j(aVarA2);
            lu5.n nVar = new lu5.n();
            t70.b bVarG = eVar.g();
            vc.s.j(bVarG);
            return new ev5.d(qVarA, fVar2, aVarA, fVar3, eVarC, aVarB, bVarA, nVarB, bVarE, aVarA2, nVar, new dv5.a(bVarG));
        }
        if (i == 1) {
            whf.n nVarB2 = cVar.b();
            vc.s.j(nVarB2);
            return new dv5.f(nVarB2, fVar.e.a());
        }
        if (i == 2) {
            dv5.q filterProvider = fVar.a();
            ev5.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(filterProvider, "filterProvider");
            return new ev5.a(filterProvider, 0);
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        thf.m textResourcesMapper = cVar.g();
        vc.s.j(textResourcesMapper);
        thf.c categoryResourcesMapper = cVar.c();
        vc.s.j(categoryResourcesMapper);
        n8b.a countryInteractor = fVar.f189671l.a();
        vc.s.j(countryInteractor);
        nhf.a unitedWalletInteractor = fVar.f189672m.a();
        vc.s.j(unitedWalletInteractor);
        l93.f revolutCardsInteractor = fVar.f189673n.j();
        vc.s.j(revolutCardsInteractor);
        wif.a userFeaturesChecker = fVar.o.a();
        t70.b currencyLocalization = eVar.g();
        vc.s.j(currencyLocalization);
        Context context = fVar.f189674p;
        ku5.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(textResourcesMapper, "textResourcesMapper");
        Intrinsics.checkNotNullParameter(categoryResourcesMapper, "categoryResourcesMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(context, "context");
        return new dtc.i(textResourcesMapper, categoryResourcesMapper, countryInteractor, unitedWalletInteractor, revolutCardsInteractor, userFeaturesChecker, currencyLocalization, context);
    }

    private final Object e() {
        ku5.i iVar = (ku5.i) this.f176234c;
        int i = this.f176233b;
        if (i == 0) {
            return new yu5.n((jki.p) iVar.f189700b.get(), iVar.f189699a);
        }
        if (i == 1) {
            return new yu5.p(new xu5.a());
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        kxa.b bVar = (kxa.b) this.f176234c;
        int i = this.f176233b;
        if (i == 0) {
            Context context = bVar.f190513a;
            kxa.l.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            return sri.o.c(context, null, null, 14);
        }
        if (i == 1) {
            sri.m mVar = (sri.m) bVar.f.get();
            gte.a aVarB = bVar.f190514b.b();
            vc.s.j(aVarB);
            return new mxa.g(mVar, aVarB, bVar.f190515c.e());
        }
        if (i == 2) {
            wwa.b bVarA = bVar.d.a();
            vc.s.j(bVarA);
            return new mxa.c(bVarA, (sri.m) bVar.f.get());
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        sri.m mVar2 = (sri.m) bVar.f.get();
        s70.a aVarM = bVar.e.m();
        vc.s.j(aVarM);
        return new mxa.h(mVar2, aVarM);
    }

    private final Object g() {
        int i = this.f176233b;
        if (i == 0) {
            return new pzk.e((jki.p) ((kyk.e) this.f176234c).f190935a.get());
        }
        if (i == 1) {
            return new pzk.f();
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object lVar;
        Object aVar2;
        Object eVar;
        int i = this.f176232a;
        int i2 = 3;
        Object obj2 = this.f176234c;
        int i3 = this.f176233b;
        switch (i) {
            case 0:
                a6 a6Var = (a6) obj2;
                if (i3 == 0) {
                    return new qk4.g((jki.p) a6Var.f118279c.get(), a6Var.f118278b);
                }
                if (i3 == 1) {
                    return new qk4.h();
                }
                throw new AssertionError(i3);
            case 1:
                r3 r3Var = (r3) obj2;
                if (i3 == 0) {
                    return new uk4.i((cli.n) r3Var.f176317c.get(), r3Var.f176316b);
                }
                if (i3 == 1) {
                    return new com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.a();
                }
                throw new AssertionError(i3);
            case 2:
                r3 r3Var2 = (r3) obj2;
                if (i3 == 0) {
                    return new uk4.i((cli.n) r3Var2.f176317c.get(), r3Var2.f176316b);
                }
                if (i3 == 1) {
                    return new com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.a();
                }
                throw new AssertionError(i3);
            case 3:
                if (i3 == 0) {
                    h4 h4Var = (h4) obj2;
                    return new qs4.h(h4Var.f176111b, (cli.n) h4Var.f176112c.get());
                }
                if (i3 == 1) {
                    return new qs4.i();
                }
                throw new AssertionError(i3);
            case 4:
                if (i3 == 0) {
                    h4 h4Var2 = (h4) obj2;
                    return new qs4.h(h4Var2.f176111b, (cli.n) h4Var2.f176112c.get());
                }
                if (i3 == 1) {
                    return new qs4.i();
                }
                throw new AssertionError(i3);
            case 5:
                joh.v vVar = (joh.v) obj2;
                if (i3 == 0) {
                    return new yph.f(vVar.f177064a, (yph.h) vVar.d.get());
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                ScreenerStatsFiltersControllerContract$InputData screenerStatsFiltersControllerContract$InputData = vVar.f177065b;
                qee.s sVar = new qee.s(new sph.l(new sph.e(new zph.s(new nd.o(new nd.n(new zph.m()), new zph.m()), new zph.u())), new sph.a(new zph.r(new zph.q())), new sph.d(new sph.b(), new sph.c(), new zph.t()), new nd.n(new sph.j())), new com.revolut.feature.wealth_discovery.impl.screener.domain.model.b());
                joh.w wVar = vVar.f177066c;
                ugl.c cVarD = wVar.f.d();
                vc.s.j(cVarD);
                gte.a aVarB = wVar.e.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a(screenerStatsFiltersControllerContract$InputData, sVar, new jul.o(new jt0.b(cVarD, aVarB, new sph.o(), new toh.o(), wVar.d()), wVar.e()), new vph.o(), new sph.m(), new vph.d());
            case 6:
                jok.c cVar = (jok.c) obj2;
                ee0.a aVar3 = cVar.f177152b;
                if (i3 == 0) {
                    jok.h.Companion.getClass();
                    return new ne0.d();
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                je0.d mapper = aVar3.b();
                vc.s.j(mapper);
                yk0.a dbSessionProvider = cVar.f177153c.b();
                vc.s.j(dbSessionProvider);
                xe0.f storageFactory = aVar3.f();
                vc.s.j(storageFactory);
                jok.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, dbSessionProvider, "pricing_plan_waitlist", mapper, 0, null, 56);
            case 7:
                jpj.b bVar = (jpj.b) obj2;
                if (i3 == 0) {
                    return new jpj.f();
                }
                if (i3 == 1) {
                    return new ap3.b(bVar.f177291a, bVar.f177292b, bVar.f177293c, bVar.d, bVar.e, bVar.f, bVar.f177294g, 4);
                }
                if (i3 == 2) {
                    return new a7d.a(bVar.f177295h, 19);
                }
                throw new AssertionError(i3);
            case 8:
                jqa.a aVar4 = (jqa.a) obj2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return new tqa.b(new tqa.c());
                        }
                        throw new AssertionError(i3);
                    }
                    ldd.a factory = new ldd.a();
                    rqa.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return new ldd.b();
                }
                era.i iVar = new era.i();
                ldd.b bVar2 = (ldd.b) aVar4.f177529b.get();
                sqa.a idGenerator = new sqa.a();
                vqa.a validator = new vqa.a();
                tqa.c maskUtils = new tqa.c();
                Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
                Intrinsics.checkNotNullParameter(validator, "validator");
                Intrinsics.checkNotNullParameter(maskUtils, "maskUtils");
                qqa.a aVar5 = new qqa.a();
                sqa.b bVar3 = new sqa.b();
                AdditionalFieldsScreenContract$InputData additionalFieldsScreenContract$InputData = aVar4.f177528a;
                sqa.e eVar2 = new sqa.e(new sqa.a(), (ldd.b) aVar4.f177529b.get(), new tqa.c());
                sqa.a idGenerator2 = new sqa.a();
                Intrinsics.checkNotNullParameter(idGenerator2, "idGenerator");
                return new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a(iVar, bVar2, aVar5, bVar3, additionalFieldsScreenContract$InputData, new i3g.k(new sqa.c(eVar2, new sqa.d()), new vqa.a()));
            case 9:
                jr9.a aVar6 = (jr9.a) obj2;
                if (i3 == 0) {
                    thf.c cVarC = aVar6.f177948a.c();
                    vc.s.j(cVarC);
                    return new tr9.b(cVarC, (nq9.c) aVar6.d.get());
                }
                if (i3 == 1) {
                    f01.c cVarG = aVar6.f177949b.g();
                    dl3.f fVarC = aVar6.f177950c.c();
                    vc.s.j(fVarC);
                    return new tr9.e(cVarG, fVarC);
                }
                if (i3 == 2) {
                    return new tr9.i((nq9.c) aVar6.d.get());
                }
                if (i3 == 3) {
                    return new tr9.g((nq9.c) aVar6.d.get());
                }
                if (i3 == 4) {
                    return new tr9.c();
                }
                throw new AssertionError(i3);
            case 10:
                jxj.a aVar7 = (jxj.a) obj2;
                jk3.c cVar2 = aVar7.f179241b;
                if (i3 == 0) {
                    om4.d0 d0VarC = aVar7.f179240a.c();
                    fk3.a aVarA = cVar2.a();
                    vc.s.j(aVarA);
                    return new kxj.h(d0VarC, new kxj.b(aVarA), (r0j.b) aVar7.f179242c.get());
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                fk3.a aVarA2 = cVar2.a();
                vc.s.j(aVarA2);
                return new ixj.b(aVarA2);
            case 11:
                k2b.a aVar8 = (k2b.a) obj2;
                a31.a aVar9 = aVar8.e;
                a31.a aVar10 = aVar8.f180453c;
                a31.a aVar11 = aVar8.f180458m;
                a31.a aVar12 = aVar8.i;
                a31.a aVar13 = aVar8.k;
                a31.a aVar14 = aVar8.f180452b;
                a31.a aVar15 = aVar8.f180466x;
                a31.a aVar16 = aVar8.A;
                a31.a aVar17 = aVar8.f180455h;
                a31.a aVar18 = aVar8.f;
                a31.a aVar19 = aVar8.f180457l;
                switch (i3) {
                    case 0:
                        aVar = new m2b.a(aVar8.f180451a, aVar14, aVar10, aVar8.d, aVar9, aVar18, aVar8.f180454g, aVar17, aVar12);
                        break;
                    case 1:
                        aVar = new k51.e(aVar8.G, aVar18, aVar8.f180456j, aVar8.I, aVar10, aVar13, aVar9, aVar8.f180459n, aVar8.o, aVar8.f180460p, aVar19, aVar8.f180461q, aVar8.f180462r, aVar8.f180463s, aVar8.f180464t, aVar8.u, aVar8.v, aVar8.f180465w, aVar15, aVar8.f180467y, aVar8.z, aVar16, aVar17, aVar11, aVar8.B, aVar8.C, aVar8.D, aVar8.E);
                        break;
                    case 2:
                        m2b.e eVar3 = (m2b.e) ((m2b.a) aVar8.F.get()).b();
                        vc.s.k(eVar3);
                        return eVar3;
                    case 3:
                        m2b.f fVar = (m2b.f) ((m2b.b) aVar8.H.get()).b();
                        vc.s.k(fVar);
                        return fVar;
                    case 4:
                        return new m2b.b(aVar14, aVar13, aVar19, aVar12, aVar11);
                    case 5:
                        return new s5d.b(aVar15, aVar19, 9);
                    case 6:
                        return new anb.c0(aVar18, aVar19, aVar16, aVar17, 6);
                    default:
                        throw new AssertionError(i3);
                }
                return aVar;
            case 12:
                k5j.a aVar20 = (k5j.a) obj2;
                a31.a aVar21 = aVar20.f181513c;
                if (i3 == 0) {
                    return new anb.c0(aVar20.f181511a, aVar20.f181512b, aVar21, aVar20.d, 15);
                }
                if (i3 == 1) {
                    return new a7d.a(aVar21, 23);
                }
                throw new AssertionError(i3);
            case 13:
                k5j.c cVar3 = (k5j.c) obj2;
                switch (i3) {
                    case 0:
                        return new ne0.d();
                    case 1:
                        return new j5j.a();
                    case 2:
                        mwa.b bVar4 = (mwa.b) cVar3.f181516a.f292676n.get();
                        vc.s.j(bVar4);
                        return new m5j.g(bVar4, (l5j.a) cVar3.f181519g.get());
                    case 3:
                        l80.e eVarH = cVar3.f181517b.h();
                        vc.s.j(eVarH);
                        return new l5j.c(eVarH);
                    case 4:
                        je0.d objectMapper = cVar3.d.b();
                        vc.s.j(objectMapper);
                        k5j.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                        return new k5j.d(objectMapper);
                    case 5:
                        return new n5j.b();
                    case 6:
                        return new n5j.j();
                    case 7:
                        return new n5j.k();
                    default:
                        throw new AssertionError(i3);
                }
            case 14:
                k78.b bVar5 = (k78.b) obj2;
                switch (i3) {
                    case 0:
                        wsg.b bVarA = bVar5.f181853b.a();
                        ssi.o oVarC = bVar5.f181855c.c();
                        vc.s.j(oVarC);
                        s78.m mVar = new s78.m(bVarA, oVarC, bVar5.v(), (ne0.j) bVar5.S.get(), bVar5.t());
                        yf8.a aVar22 = bVar5.f181858g;
                        zf8.k kVarA = aVar22.a();
                        vc.s.j(kVarA);
                        zf8.n nVarB = aVar22.b();
                        vc.s.j(nVarB);
                        ao.h hVarA = bVar5.f181859h.a();
                        ib8.b bVar6 = bVar5.i;
                        return new d78.f(mVar, new s78.h(kVarA, nVarB, hVarA, bVar6.a(), new r10.f((gb8.g) bVar6.f160124l.get(), bVar6.a()), (ne0.j) bVar5.S.get()), bVar5.f181861j.f(), bVar5.f181853b.b(), bVar5.u(), new d88.h());
                    case 1:
                        return new m78.a();
                    case 2:
                        return new ne0.d();
                    case 3:
                        mj8.b bVar7 = bVar5.f181872s;
                        usg.a aVar23 = bVar5.f181853b;
                        hj8.a aVarA3 = bVar7.a();
                        vc.s.j(aVarA3);
                        return new a88.d(aVarA3, aVar23.a(), ((rb8.a) bVar5.u).b(), aVar23.b());
                    case 4:
                        usg.a aVar24 = bVar5.f181853b;
                        mj8.b bVar8 = bVar5.f181872s;
                        usg.a aVar25 = bVar5.f181853b;
                        ib8.b bVar9 = bVar5.i;
                        se8.a aVar26 = bVar5.f181874t;
                        wsg.n nVarB2 = aVar24.b();
                        q58.b bVar10 = (q58.b) bVar5.v.f319540r.get();
                        vc.s.j(bVar10);
                        f88.f fVar2 = new f88.f(bVar10);
                        hj8.a aVarA4 = bVar8.a();
                        vc.s.j(aVarA4);
                        oqk.l lVarB = bVar5.f181855c.b();
                        vc.s.j(lVarB);
                        hj8.a aVarA5 = bVar8.a();
                        vc.s.j(aVarA5);
                        te8.e eVarA = aVar26.a();
                        vc.s.j(eVarA);
                        jul.o oVar = new jul.o(aVarA5, eVarA);
                        te8.e eVarA2 = aVar26.a();
                        vc.s.j(eVarA2);
                        kbb.c cVarF = aVar26.f();
                        s68.a aVar27 = (s68.a) bVar5.W.get();
                        r10.f fVar3 = new r10.f((gb8.g) bVar9.f160124l.get(), bVar9.a());
                        hj8.a aVarA6 = bVar9.e.a();
                        vc.s.j(aVarA6);
                        kb8.e eVar4 = new kb8.e(aVarA6, new f4h.a((gb8.b) bVar9.k.get()));
                        kb8.a aVar28 = new kb8.a(bVar9.f.g(), 0);
                        s70.a aVarM = bVar9.f160121g.m();
                        vc.s.j(aVarM);
                        kb8.f fVar4 = new kb8.f(aVar28, aVarM);
                        ob8.a aVar29 = new ob8.a((sb8.a) ((rb8.a) bVar5.u).f252984q.get(), new yb8.a());
                        hp8.b bVarA2 = bVar5.f181879x.a();
                        vc.s.j(bVarA2);
                        nxk.a aVar30 = (nxk.a) ((kyk.v) bVar5.f181881y).Q.get();
                        vc.s.j(aVar30);
                        wsg.b bVarA3 = aVar25.a();
                        kbb.c cVarB = bVar5.k.b();
                        gte.a aVarB2 = bVar5.e.b();
                        vc.s.j(aVarB2);
                        lVar = new d78.l(nVarB2, fVar2, aVarA4, lVarB, oVar, eVarA2, cVarF, aVar27, fVar3, eVar4, fVar4, aVar29, bVarA2, aVar30, bVarA3, cVarB, aVarB2, new f88.k(aVar25.a(), bVar5.f181870r.e()), new m78.i(aVar25.b(), 0), bVar5.t(), bVar5.w());
                        return lVar;
                    case 5:
                        hj8.a aVarA7 = bVar5.f181872s.a();
                        vc.s.j(aVarA7);
                        return new j78.g(aVarA7, bVar5.f181877w.a());
                    case 6:
                        d88.g gVarU = bVar5.u();
                        jla.h hVarA2 = bVar5.f181877w.a();
                        gte.a aVarB3 = bVar5.e.b();
                        vc.s.j(aVarB3);
                        return new d78.o(gVarU, hVarA2, aVarB3, new d88.h());
                    case 7:
                        return new d78.m();
                    case 8:
                        zf8.k kVarA2 = bVar5.f181858g.a();
                        vc.s.j(kVarA2);
                        d78.p pVar = new d78.p();
                        jla.h hVarA3 = bVar5.f181877w.a();
                        gte.a aVarB4 = bVar5.e.b();
                        vc.s.j(aVarB4);
                        lVar = new d78.t(kVarA2, pVar, hVarA3, aVarB4, new d88.h());
                        return lVar;
                    case 9:
                        return new d78.x(bVar5.v(), bVar5.f181853b.a());
                    case 10:
                        ang.f fVarE = bVar5.f181870r.e();
                        ao.h hVarA4 = bVar5.f181859h.a();
                        te8.z zVarE = bVar5.f181874t.e();
                        vc.s.j(zVarE);
                        zf8.n nVarB3 = bVar5.f181858g.b();
                        vc.s.j(nVarB3);
                        aVar2 = new n78.a(fVarE, hVarA4, zVarE, nVarB3, ((rb8.a) bVar5.u).b());
                        return aVar2;
                    case 11:
                        return new q78.g(bVar5.f181853b.b());
                    case 12:
                        l80.e eVarH2 = bVar5.z.h();
                        vc.s.j(eVarH2);
                        m88.b bVar11 = new m88.b(eVarH2, (m7a.a) bVar5.f181857e0.get());
                        ang.f fVarE2 = bVar5.f181870r.e();
                        ao.h hVarA5 = bVar5.f181859h.a();
                        te8.z zVarE2 = bVar5.f181874t.e();
                        vc.s.j(zVarE2);
                        zf8.n nVarB4 = bVar5.f181858g.b();
                        vc.s.j(nVarB4);
                        return new m88.f(bVar11, new n78.a(fVarE2, hVarA5, zVarE2, nVarB4, ((rb8.a) bVar5.u).b()));
                    case 13:
                        l80.e eVarH3 = bVar5.z.h();
                        vc.s.j(eVarH3);
                        t70.g gVarO = bVar5.z.o();
                        vc.s.j(gVarO);
                        return new m7a.b(eVarH3, gVarO);
                    case 14:
                        return new o88.b((n78.e) bVar5.g0.get(), (p88.a) bVar5.f181860h0.get());
                    case 15:
                        hp8.b bVarA4 = bVar5.f181879x.a();
                        vc.s.j(bVarA4);
                        te8.z zVarE3 = bVar5.f181874t.e();
                        vc.s.j(zVarE3);
                        zf8.n nVarB5 = bVar5.f181858g.b();
                        vc.s.j(nVarB5);
                        return new n78.e(bVarA4, zVarE3, nVarB5);
                    case 16:
                        return new p88.b();
                    case 17:
                        yf8.a aVar31 = bVar5.f181858g;
                        se8.a aVar32 = bVar5.f181874t;
                        npk.a aVar33 = bVar5.A;
                        usg.a aVar34 = bVar5.f181853b;
                        zf8.k kVarA3 = aVar31.a();
                        vc.s.j(kVarA3);
                        wsg.b bVarA5 = aVar34.a();
                        ppk.f fVarA = aVar33.a();
                        kye.e eVar5 = new kye.e(aVar33.a());
                        zf8.k kVarA4 = bVar5.f181858g.a();
                        vc.s.j(kVarA4);
                        g6e.d dVarB = bVar5.B.b();
                        vc.s.j(dVarB);
                        djb.n nVarA = bVar5.C.a();
                        vc.s.j(nVarA);
                        prl.e eVar6 = new prl.e(eVar5, kVarA4, dVarB, nVarA);
                        te8.v vVarD = aVar32.d();
                        vc.s.j(vVarD);
                        an8.b bVarA6 = bVar5.D.a();
                        vc.s.j(bVarA6);
                        x88.c cVar4 = (x88.c) bVar5.j0.get();
                        jla.h hVarA6 = bVar5.f181877w.a();
                        ybl.k kVarD = bVar5.F.d();
                        vc.s.j(kVarD);
                        ael.t tVarF = bVar5.G.f();
                        vc.s.j(tVarF);
                        wsg.n nVarB6 = aVar34.b();
                        hj8.a aVarA8 = bVar5.f181872s.a();
                        vc.s.j(aVarA8);
                        w88.g gVar = new w88.g(hVarA6, kVarD, tVarF, nVarB6, aVarA8, aVar32.f(), bVar5.H.c());
                        gte.a aVarB5 = bVar5.e.b();
                        vc.s.j(aVarB5);
                        aVar2 = new v88.c(kVarA3, bVarA5, fVarA, eVar6, vVarD, bVarA6, cVar4, gVar, aVarB5, new j9l.a(), bVar5.f181870r.e());
                        return aVar2;
                    case 18:
                        return new x88.f(((fob.a) bVar5.E).h());
                    case 19:
                        n78.c cVar5 = (n78.c) bVar5.l0.get();
                        da3.j jVar = bVar5.o;
                        ia3.r rVarB = jVar.b();
                        m93.g gVarI = jVar.i();
                        vc.s.j(gVarI);
                        n88.a aVar35 = new n88.a(rVarB, gVarI, new n88.i(jVar.b()));
                        f73.a aVar36 = (f73.a) bVar5.K.v.get();
                        vc.s.j(aVar36);
                        wif.a aVarA9 = bVar5.L.a();
                        mt8.d dVarB2 = bVar5.M.b();
                        vc.s.j(dVarB2);
                        te8.e eVarA3 = bVar5.f181874t.a();
                        vc.s.j(eVarA3);
                        return new n88.k(cVar5, aVar35, aVar36, aVarA9, dVarB2, eVarA3);
                    case 20:
                        wsg.n nVarB7 = bVar5.f181853b.b();
                        zf8.n nVarB8 = bVar5.f181858g.b();
                        vc.s.j(nVarB8);
                        l93.f fVarJ = bVar5.o.j();
                        vc.s.j(fVarJ);
                        hj8.a aVarA10 = bVar5.f181872s.a();
                        vc.s.j(aVarA10);
                        ic8.b bVarA7 = bVar5.f181868p.a();
                        vc.s.j(bVarA7);
                        hy2.f fVarA2 = bVar5.I.a();
                        ffk.t tVarF2 = bVar5.J.f();
                        vc.s.j(tVarF2);
                        return new n78.c(nVarB7, nVarB8, fVarJ, aVarA10, bVarA7, fVarA2, tVarF2);
                    case 21:
                        bgc.e eVarC = bVar5.N.c();
                        vc.s.j(eVarC);
                        t88.a aVar37 = new t88.a();
                        te8.z zVarE4 = bVar5.f181874t.e();
                        vc.s.j(zVarE4);
                        hj8.a aVarA11 = bVar5.f181872s.a();
                        vc.s.j(aVarA11);
                        return new s88.d(eVarC, aVar37, zVarE4, aVarA11);
                    case 22:
                        te8.z zVarE5 = bVar5.f181874t.e();
                        vc.s.j(zVarE5);
                        kd8.e eVarA4 = bVar5.O.a();
                        vc.s.j(eVarA4);
                        hj8.a aVarA12 = bVar5.f181872s.a();
                        vc.s.j(aVarA12);
                        return new r88.f(zVarE5, new prl.e(eVarA4, aVarA12, bVar5.f181853b.b(), bVar5.f181874t.f()), new r88.c(bVar5.z.d()));
                    case 23:
                        return new o88.a();
                    case 24:
                        return new v88.a();
                    case 25:
                        return new u88.a();
                    case 26:
                        return new n88.j();
                    case 27:
                        return new r88.a();
                    case 28:
                        c70.a aVarZ = bVar5.z.z();
                        vc.s.j(aVarZ);
                        return new l88.a(aVarZ);
                    case 29:
                        hj8.a aVarA13 = bVar5.f181872s.a();
                        vc.s.j(aVarA13);
                        se8.a aVar38 = bVar5.f181874t;
                        return new j88.g(aVarA13, new rul.e((ff8.e) aVar38.f262159x.get(), aVar38.i.a()));
                    case 30:
                        g6e.b bVarA8 = bVar5.P.a();
                        vc.s.j(bVarA8);
                        return new j88.a(bVarA8);
                    case 31:
                        return new j88.c();
                    default:
                        throw new AssertionError(i3);
                }
            case 15:
                if (i3 == 0) {
                    return new k88.c((cli.n) ((k78.i) obj2).f181892a.get());
                }
                if (i3 == 1) {
                    return new k88.d();
                }
                throw new AssertionError(i3);
            case 16:
                k95.a aVar39 = (k95.a) obj2;
                switch (i3) {
                    case 0:
                        xoj.a aVarA14 = aVar39.f182268a.a();
                        vc.s.j(aVarA14);
                        xq3.j jVarG = aVar39.f182269b.g();
                        vc.s.j(jVarG);
                        return new o95.g(aVarA14, jVarG, (t95.e) aVar39.f182276n.get());
                    case 1:
                        OverdraftService overdraftService = (OverdraftService) aVar39.f182274l.get();
                        ne0.d hashMapCache = new ne0.d();
                        m95.a aVar40 = m95.b.Companion;
                        aVar40.getClass();
                        Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
                        xx4.d dVar = new xx4.d(hashMapCache);
                        ue0.c storage = (ue0.c) aVar39.f182275m.get();
                        aVar40.getClass();
                        Intrinsics.checkNotNullParameter(storage, "storage");
                        eVar = new t95.e(overdraftService, dVar, new xx4.e(storage));
                        break;
                    case 2:
                        OverdraftService overdraftService2 = (OverdraftService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar39.k.get(), "retrofit", OverdraftService.class, "create(...)");
                        vc.s.k(overdraftService2);
                        return overdraftService2;
                    case 3:
                        Retrofit retrofit = ((c21.b) aVar39.f182270c).j();
                        vc.s.j(retrofit);
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Retrofit retrofitBuild = retrofit.newBuilder().build();
                        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                        vc.s.k(retrofitBuild);
                        return retrofitBuild;
                    case 4:
                        le0.b gsonObjectMapperFactory = aVar39.d.c();
                        vc.s.j(gsonObjectMapperFactory);
                        kg.o baseGson = fe0.c.a();
                        yk0.a databaseSessionProvider = aVar39.e.b();
                        vc.s.j(databaseSessionProvider);
                        xe0.f storageFactory2 = aVar39.d.f();
                        vc.s.j(storageFactory2);
                        m95.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
                        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider, "overdraft", gsonObjectMapperFactory.a(baseGson), 1, zhm.f0.f322471a, 32);
                    case 5:
                        return new o95.i((t95.e) aVar39.f182276n.get(), (o95.g) aVar39.o.get());
                    case 6:
                        return new o95.a((i95.e) aVar39.f182278q.get());
                    case 7:
                        OverdraftService overdraftService3 = (OverdraftService) aVar39.f182274l.get();
                        om4.d0 d0Var = new om4.d0(((nj0.d) aVar39.f).f216295c);
                        ne0.d hashMapCache2 = new ne0.d();
                        m95.a aVar41 = m95.b.Companion;
                        aVar41.getClass();
                        Intrinsics.checkNotNullParameter(hashMapCache2, "hashMapCache");
                        xx4.d dVar2 = new xx4.d(hashMapCache2);
                        ue0.c storage2 = (ue0.c) aVar39.f182275m.get();
                        aVar41.getClass();
                        Intrinsics.checkNotNullParameter(storage2, "storage");
                        eVar = new i95.e(overdraftService3, d0Var, dVar2, new xx4.e(storage2));
                        break;
                    case 8:
                        return new n95.d((o95.g) aVar39.o.get(), (o95.i) aVar39.f182277p.get());
                    case 9:
                        o95.g gVar2 = (o95.g) aVar39.o.get();
                        i95.e eVar7 = (i95.e) aVar39.f182278q.get();
                        p95.a aVar42 = new p95.a();
                        gte.a aVarB6 = aVar39.f182272h.b();
                        vc.s.j(aVarB6);
                        return new o95.e(gVar2, eVar7, aVar42, aVarB6);
                    case 10:
                        return new q95.b((o95.g) aVar39.o.get(), (o95.i) aVar39.f182277p.get());
                    case 11:
                        return new q95.a();
                    default:
                        throw new AssertionError(i3);
                }
                return eVar;
            case 17:
                ka7.a aVar43 = (ka7.a) obj2;
                ee0.a aVar44 = aVar43.f182439a;
                nj0.a aVar45 = aVar43.f182441c;
                l70.e eVar8 = aVar43.d;
                if (i3 == 0) {
                    je0.d mapper2 = aVar44.d();
                    vc.s.j(mapper2);
                    yk0.a databaseSessionProvider2 = aVar43.f182440b.b();
                    vc.s.j(databaseSessionProvider2);
                    xe0.f storageFactory3 = aVar44.f();
                    vc.s.j(storageFactory3);
                    ka7.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapper2, "mapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                    return xe0.f.f(storageFactory3, databaseSessionProvider2, "trips", mapper2, 2, zhm.u.c(new ja7.a()), 32);
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                ne0.d dVar3 = new ne0.d();
                ue0.c cVar6 = (ue0.c) aVar43.f.get();
                OkHttpClient okHttpClientE = ((nj0.d) aVar45).e();
                vc.s.j(okHttpClientE);
                z70.a aVarF = eVar8.f();
                vc.s.j(aVarF);
                n8b.a aVarA15 = aVar43.e.a();
                vc.s.j(aVarA15);
                l80.e eVarH4 = eVar8.h();
                vc.s.j(eVarH4);
                ia7.o oVar2 = new ia7.o(new ia7.a());
                ia7.a aVar46 = new ia7.a();
                zk0.b bVarL = eVar8.l();
                vc.s.j(bVarL);
                return new ia7.n(dVar3, cVar6, okHttpClientE, aVarF, aVarA15, eVarH4, oVar2, aVar46, bVarL, ((nj0.d) aVar45).h());
            case 18:
                kd5.c cVar7 = (kd5.c) obj2;
                if (i3 == 0) {
                    xoj.a aVarA16 = cVar7.f182807a.a();
                    vc.s.j(aVarA16);
                    return new ld5.b(aVarA16);
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                xh5.a aVarA17 = cVar7.f182808b.a();
                vc.s.j(aVarA17);
                return new md5.a(aVarA17, (ld5.b) cVar7.f182809c.get());
            case 19:
                kh7.a aVar47 = (kh7.a) obj2;
                ee0.a aVar48 = aVar47.f184074a;
                if (i3 == 0) {
                    ue0.c cVar8 = (ue0.c) aVar47.f.get();
                    f80.a aVarX = aVar47.f184076c.x();
                    vc.s.j(aVarX);
                    return new mh7.c(cVar8, new kpj.f(aVarX));
                }
                if (i3 == 1) {
                    je0.d objectMapper2 = aVar48.d();
                    vc.s.j(objectMapper2);
                    yk0.a databaseSessionProvider3 = aVar47.f184075b.b();
                    vc.s.j(databaseSessionProvider3);
                    xe0.f storageFactory4 = aVar48.f();
                    vc.s.j(storageFactory4);
                    kh7.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(objectMapper2, "objectMapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                    return xe0.f.f(storageFactory4, databaseSessionProvider3, "install_referrer_data", objectMapper2, 0, null, 56);
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        return new if0.a(Collections.singleton((od0.e) aVar47.f.get()));
                    }
                    throw new AssertionError(i3);
                }
                Context appContext = aVar47.d;
                mh7.c installDataMediator = (mh7.c) aVar47.f184077g.get();
                CoroutineScope scope = aVar47.e.a();
                vc.s.j(scope);
                kh7.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(installDataMediator, "installDataMediator");
                Intrinsics.checkNotNullParameter(scope, "scope");
                skm.p0 p0Var = skm.p0.f264001a;
                return new ih7.b(appContext, installDataMediator, scope, elm.f.f127540b, new kh4.b(i2));
            case 20:
                return a();
            case 21:
                g5f.a aVar49 = (g5f.a) obj2;
                switch (i3) {
                    case 0:
                        return new h5f.e((t1h.f) aVar49.d.get(), (t1h.d) aVar49.e.get(), (t1h.e) aVar49.f.get());
                    case 1:
                        return new lpc.e();
                    case 2:
                        return new lpc.b();
                    case 3:
                        return new lpc.d();
                    case 4:
                        ybl.d dVarH = aVar49.f140779b.h();
                        vc.s.j(dVarH);
                        return new ipc.e(dVarH);
                    case 5:
                        return new ipc.c(((dmc.r) aVar49.f140784l).f());
                    case 6:
                        by5.a componentFactory = new by5.a(24);
                        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
                        return new g5f.b(aVar49, 1);
                    default:
                        throw new AssertionError(i3);
                }
            case 22:
                return b();
            case 23:
                kti.h hVar = (kti.h) obj2;
                if (i3 == 0) {
                    return new c1g.v((mti.h) hVar.f189553b.get());
                }
                if (i3 == 1) {
                    return new mti.h(hVar.f189552a.a());
                }
                throw new AssertionError(i3);
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
                if (i3 == 0) {
                    kyk.m mVar2 = (kyk.m) obj2;
                    return new q0l.f(mVar2.f190957a, (jki.p) mVar2.f190958b.get());
                }
                if (i3 == 1) {
                    return new q0l.g();
                }
                throw new AssertionError(i3);
        }
    }

    public o3(jqa.e eVar, jqa.a aVar, int i) {
        this.f176232a = 8;
        this.f176234c = aVar;
        this.f176233b = i;
    }
}
