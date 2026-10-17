package ix5;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.room.migration.Migration;
import b9.w2;
import bn2.p;
import cge.k;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog.CreditCardAccruedInterestsBottomSheetControllerContract$InputData;
import com.revolut.feature.credit.impl.ui.account.collateral.CollateralPocketMapperImpl;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.feature.cryptocommodity_invest.impl.network.CryptoTrendingService;
import com.revolut.feature.post_activation.impl.service.PostActivationService;
import com.revolut.feature.revolutpay.promoted_merchants.impl.data.service.RevolutPayPromotedMerchantsApiService;
import com.revolut.feature.selfserve.sow.impl.services.SowService;
import com.revolut.feature.shared.airtip.impl.data.database.AirTipDatabase;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreenContract$InputData;
import com.revolut.retail.feature.crypto.newlyadded.impl.data.network.NewlyAddedCryptoService;
import dcl.q;
import et6.h1;
import ffk.t;
import g1i.d0;
import g1i.l0;
import g1i.m0;
import g1i.o0;
import h30.n;
import java.util.Collection;
import jge.m;
import jje.l;
import jm4.a1;
import jm4.a3;
import jm4.f0;
import jm4.f2;
import jm4.f3;
import jm4.g2;
import jm4.g3;
import jm4.i1;
import jm4.n3;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ljl.q0;
import ljl.q1;
import mp.r;
import om4.n4;
import qgk.k3;
import retrofit2.Retrofit;
import sri.o;
import uge.j;
import ulm.b1;
import vc.s;
import vge.y2;
import vrl.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f169340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f169341c;

    public /* synthetic */ b(Object obj2, int i, int i2) {
        this.f169339a = i2;
        this.f169341c = obj2;
        this.f169340b = i;
    }

    private final Object a() {
        m mVar = (m) this.f169341c;
        int i = this.f169340b;
        switch (i) {
            case 0:
                sri.m mVarD = ((g8b.a) mVar.f174014a).d();
                s.j(mVarD);
                return new uge.c(mVarD, mVar.f174015b.a());
            case 1:
                sri.m mVarD2 = ((g8b.a) mVar.f174014a).d();
                s.j(mVarD2);
                return new uge.g(mVarD2);
            case 2:
                sri.m mVarD3 = ((g8b.a) mVar.f174014a).d();
                s.j(mVarD3);
                return new j(mVarD3);
            case 3:
                return new cge.a((rge.b) mVar.f174022n.get());
            case 4:
                return new rge.b(mVar.f174020l, mVar.f174021m, mVar.f.a());
            case 5:
                ehe.c cVar = ((ehe.c) mVar.f174016c).f125990r0;
                q graphFactory = new q(new r39.a(cVar), new qy5.a(cVar));
                b9k.f dependencies = mVar.d.a();
                Intrinsics.checkNotNullParameter(graphFactory, "graphFactory");
                Intrinsics.checkNotNullParameter(dependencies, "homeDependencies");
                Intrinsics.checkNotNullParameter(dependencies, "dependencies");
                return new ehe.b(cVar, dependencies);
            case 6:
                ehe.c cVar2 = ((ehe.c) mVar.f174016c).f125990r0;
                q graphFactory2 = new q(new r39.a(cVar2), new qy5.a(cVar2));
                w2 dependencies2 = mVar.e.a();
                Intrinsics.checkNotNullParameter(graphFactory2, "graphFactory");
                Intrinsics.checkNotNullParameter(dependencies2, "creditDependencies");
                Intrinsics.checkNotNullParameter(dependencies2, "dependencies");
                return new ehe.a(cVar2, dependencies2);
            case 7:
                return new cge.e((rge.b) mVar.f174022n.get());
            case 8:
                zfe.b bVar = (zfe.b) mVar.o.get();
                oqk.b bVar2 = (oqk.b) mVar.f174017g.A.get();
                s.j(bVar2);
                return new qhe.b(bVar, bVar2);
            case 9:
                return new cge.c((rge.b) mVar.f174022n.get());
            case 10:
                return new k((rge.b) mVar.f174022n.get(), new r10.a(new ihe.a(), new ihe.b()));
            case 11:
                return new cge.d((rge.b) mVar.f174022n.get());
            case 12:
                return new cge.f((rge.b) mVar.f174022n.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        jje.c cVar = (jje.c) this.f169341c;
        int i = this.f169340b;
        switch (i) {
            case 0:
                tla.e eVarA = cVar.d.a();
                s.j(eVarA);
                n63.h hVar = (n63.h) cVar.e.f319904a.get();
                s.j(hVar);
                j30.d dVarU = ((n) cVar.f).u();
                s.j(dVarU);
                gte.a aVarB = cVar.f174832g.b();
                s.j(aVarB);
                return new eje.c(eVarA, hVar, dVarU, aVarB, (vqi.a) cVar.W.get());
            case 1:
                l.Companion.getClass();
                return new vqi.a();
            case 2:
                sri.m mVar = (sri.m) cVar.Y.get();
                ai5.b bVarB = cVar.f174833h.b();
                s.j(bVarB);
                ld5.b bVarB2 = cVar.f174835j.b();
                s.j(bVarB2);
                return new hje.c(mVar, bVarB, bVarB2);
            case 3:
                Context context = cVar.i;
                ije.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return o.c(context, null, null, 14);
            case 4:
                sri.m mVar2 = (sri.m) cVar.Y.get();
                ai5.b bVarB3 = cVar.f174833h.b();
                s.j(bVarB3);
                return new hje.k(mVar2, bVarB3);
            case 5:
                e4m.e eVar = cVar.Y;
                ei5.d dVar = cVar.f174833h;
                sri.m mVar3 = (sri.m) eVar.get();
                hc5.a aVarA = ((gc5.c) cVar.k).a();
                s.j(aVarA);
                xh5.a aVarA2 = dVar.a();
                s.j(aVarA2);
                yje.a aVar = (yje.a) cVar.f174828b0.get();
                qka.c cVarB = ((ika.b) cVar.f174839n).b();
                ai5.b bVarB4 = dVar.b();
                s.j(bVarB4);
                return new hje.n(mVar3, aVarA, aVarA2, aVar, cVarB, bVarB4);
            case 6:
                f01.c cVarG = cVar.f174837l.g();
                tv5.b bVarC = cVar.f174838m.c();
                s.j(bVarC);
                return new yje.e(cVarG, bVarC);
            case 7:
                sri.m mVar4 = (sri.m) cVar.Y.get();
                ai5.b bVarB5 = cVar.f174833h.b();
                s.j(bVarB5);
                gte.a aVarB2 = cVar.f174832g.b();
                s.j(aVarB2);
                toa.a aVarA3 = cVar.o.a();
                s.j(aVarA3);
                return new hje.i(mVar4, bVarB5, aVarB2, aVarA3);
            case 8:
                return new eje.d((y4d.l) cVar.f0.get());
            case 9:
                cm2.a aVar2 = cVar.f174840p;
                vv5.e eVar2 = cVar.f174838m;
                p pVarC = aVar2.c();
                lje.b bVar = (lje.b) cVar.f174831e0.get();
                xv5.c cVarA = eVar2.a();
                s.j(cVarA);
                xv5.g gVar = (xv5.g) eVar2.f292456h.get();
                s.j(gVar);
                return new tje.c(pVarC, bVar, cVarA, gVar);
            case 10:
                xv5.g gVar2 = (xv5.g) cVar.f174838m.f292456h.get();
                s.j(gVar2);
                return new lje.b(gVar2, cVar.f174841q.d());
            case 11:
                d16.b bVar2 = cVar.f174844t;
                n16.b bVar3 = cVar.u;
                mil.a aVar3 = bVar3.o;
                mil.a aVar4 = bVar3.f211256p;
                nd.o provider = new nd.o(aVar3, aVar4);
                Intrinsics.checkNotNullParameter(provider, "provider");
                Object obj2 = aVar4.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return (dje.c) obj2;
            case 12:
                return new vje.b();
            case 13:
                return new tje.b();
            case 14:
                l.Companion.getClass();
                return new qje.d();
            case 15:
                r productIntroInteractor = cVar.U.b();
                l.Companion.getClass();
                Intrinsics.checkNotNullParameter(productIntroInteractor, "productIntroInteractor");
                return new qje.c(productIntroInteractor);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.f169340b;
        if (i == 0) {
            return new bt4.i((cli.n) ((i1) this.f169341c).f176116a.get());
        }
        if (i == 1) {
            return new bt4.j();
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        f2 f2Var = (f2) this.f169341c;
        int i = this.f169340b;
        if (i == 0) {
            return new xu4.g((cli.n) f2Var.f176073b.get(), f2Var.f176072a);
        }
        if (i == 1) {
            return new xu4.h();
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        int i = this.f169340b;
        if (i == 0) {
            g2 g2Var = (g2) this.f169341c;
            return new vu4.e(g2Var.f176088a, (cli.n) g2Var.f176089b.get());
        }
        if (i == 1) {
            return new vu4.f();
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        f3 f3Var = (f3) this.f169341c;
        int i = this.f169340b;
        if (i == 0) {
            return new ly4.o((cli.n) f3Var.f176076b.get(), f3Var.f176075a);
        }
        if (i == 1) {
            return new com.revolut.feature.credit.direct.debit.account_confirm_v2.a();
        }
        throw new AssertionError(i);
    }

    private final Object g() {
        g3 g3Var = (g3) this.f169341c;
        int i = this.f169340b;
        if (i == 0) {
            return new hz4.o((cli.n) g3Var.f176092b.get(), g3Var.f176091a);
        }
        if (i == 1) {
            return new hz4.p();
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object sVar;
        Object eVar;
        Object aVar;
        Object dVar;
        Object bVar;
        switch (this.f169339a) {
            case 0:
                c cVar = (c) this.f169341c;
                CryptoSortingPickerInputData cryptoSortingPickerInputData = cVar.f169343b;
                int i = this.f169340b;
                if (i == 0) {
                    return new ox5.h(cryptoSortingPickerInputData, (cli.n) cVar.f169344c.get());
                }
                if (i == 1) {
                    return new i3g.k(new ny5.j(), cryptoSortingPickerInputData);
                }
                throw new AssertionError(i);
            case 1:
                d dVar2 = (d) this.f169341c;
                c21.e dataApi = dVar2.f169346b;
                int i2 = this.f169340b;
                switch (i2) {
                    case 0:
                        return new kw5.b();
                    case 1:
                        return new tw5.i((CryptoTrendingService) dVar2.f169356r.get(), (ne0.j) dVar2.f169357s.get(), (ue0.c) dVar2.f169358t.get());
                    case 2:
                        Retrofit retrofit = (Retrofit) dVar2.f169355q.get();
                        mw5.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(CryptoTrendingService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        CryptoTrendingService cryptoTrendingService = (CryptoTrendingService) objCreate;
                        s.k(cryptoTrendingService);
                        return cryptoTrendingService;
                    case 3:
                        Retrofit retrofitI = ((c21.b) dataApi).i();
                        s.j(retrofitI);
                        return ms1.g.k((kg.o) dVar2.f169354p.get(), retrofitI);
                    case 4:
                        kg.o oVarH = ((c21.b) dataApi).h();
                        s.j(oVarH);
                        return oVarH;
                    case 5:
                        ne0.d hashMapCache = new ne0.d();
                        Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
                        return hashMapCache;
                    case 6:
                        Intrinsics.checkNotNullParameter(dataApi, "dataApi");
                        ue0.c cVar2 = (ue0.c) ((c21.b) dataApi).A.get();
                        s.k(cVar2);
                        return cVar2;
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                int i3 = this.f169340b;
                if (i3 == 0) {
                    h hVar = (h) this.f169341c;
                    return new tx5.h(hVar.f169373a, (cli.n) hVar.f169374b.get());
                }
                if (i3 == 1) {
                    return new tx5.i();
                }
                throw new AssertionError(i3);
            case 3:
                izc.a aVar2 = (izc.a) this.f169341c;
                int i5 = this.f169340b;
                if (i5 == 0) {
                    SowService sowService = (SowService) aVar2.f169866c.get();
                    ne0.j jVar = (ne0.j) aVar2.d.get();
                    lzc.a aVar3 = new lzc.a();
                    m31.c cVarG = aVar2.f169865b.f179133a.g();
                    s.j(cVarG);
                    return new nzc.d(sowService, jVar, aVar3, new nd.k(cVarG));
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        return new ne0.d();
                    }
                    throw new AssertionError(i5);
                }
                Retrofit retrofit3 = ((c21.b) aVar2.f169864a).i();
                s.j(retrofit3);
                izc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object objCreate2 = retrofit3.create(SowService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                SowService sowService2 = (SowService) objCreate2;
                s.k(sowService2);
                return sowService2;
            case 4:
                j1i.a aVar4 = (j1i.a) this.f169341c;
                int i6 = this.f169340b;
                switch (i6) {
                    case 0:
                        hri.b bVar2 = aVar4.f170463a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar3 = aVar4.f170463a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        sf0.h hVarB = aVar4.f170465b.b();
                        s.j(hVarB);
                        v60.e eVarA = aVar4.f170467c.a();
                        s.j(eVarA);
                        g3l.a aVar5 = (g3l.a) aVar4.f170464a0.get();
                        m1i.k kVar = (m1i.k) aVar4.l0.get();
                        t70.b bVarG = aVar4.f170473j.g();
                        s.j(bVarG);
                        sVar = new m1i.s(hVarB, eVarA, aVar5, kVar, bVarG, ((k3) aVar4.D).b(), (ym.d) aVar4.f170468d0.get(), aVar4.E.g());
                        break;
                    case 5:
                        return new g3l.g();
                    case 6:
                        usg.a aVar6 = aVar4.d;
                        q8b.a aVar7 = aVar4.B;
                        qud.c cVar3 = aVar4.f170488w;
                        ite.a aVar8 = aVar4.f170475l;
                        efk.a aVar9 = aVar4.f;
                        v0i.b bVar4 = aVar4.i;
                        wsg.n nVarB = aVar6.b();
                        fk3.b bVarB = aVar4.e.b();
                        s.j(bVarB);
                        g1i.b bVar5 = (g1i.b) aVar4.f170466b0.get();
                        ifm.b bVar6 = (ifm.b) aVar4.W.get();
                        t tVarF = aVar9.f();
                        s.j(tVarF);
                        xv5.a aVar10 = (xv5.a) aVar4.f170470g.f.get();
                        s.j(aVar10);
                        ang.f fVarE = aVar4.f170471h.e();
                        p0i.b bVarE = bVar4.e();
                        s.j(bVarE);
                        i90.b bVar7 = new i90.b();
                        c1i.b bVar8 = new c1i.b(bVar4.b());
                        nd.k kVar2 = new nd.k(new l4i.a());
                        gte.a aVarB = aVar8.b();
                        s.j(aVarB);
                        o0 o0Var = new o0(aVarB);
                        rea.m mVarF = aVar4.f170476m.f();
                        w0i.b bVarF = bVar4.f();
                        t tVarF2 = aVar9.f();
                        s.j(tVarF2);
                        k1i.d dVar3 = new k1i.d(tVarF2);
                        o7.b bVarA = aVar4.f170477n.a();
                        l4i.a aVar11 = new l4i.a();
                        jva.a aVar12 = (jva.a) aVar4.o.i.get();
                        s.j(aVar12);
                        mm.d dVar4 = (mm.d) aVar4.c0.get();
                        e2i.m mVar = (e2i.m) aVar4.f170469e0.get();
                        m1i.i iVar = (m1i.i) aVar4.f170474k0.get();
                        yud.g gVarD = cVar3.d();
                        zud.a aVarE = cVar3.e();
                        AccountId accountId = aVar4.f170484s;
                        ppk.f fVarA = aVar4.f170489x.a();
                        w0i.a aVarA = bVar4.a();
                        irh.a aVar13 = (irh.a) ((krh.a) aVar4.f170490y).f188873h.get();
                        s.j(aVar13);
                        tzg.m mVarT = aVar4.v.t();
                        s.j(mVarT);
                        ybl.d dVarH = aVar4.z.h();
                        s.j(dVarH);
                        wj0.a aVarI = ((nj0.d) aVar4.A).i();
                        s.j(aVarI);
                        x0i.f fVarD = bVar4.d();
                        n8b.a aVarA2 = aVar7.a();
                        s.j(aVarA2);
                        wsg.n walletInteractor = aVar4.d.b();
                        n8b.a countryInteractor = aVar7.a();
                        s.j(countryInteractor);
                        x0i.f exchangeCurrenciesInteractor = bVar4.d();
                        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                        Intrinsics.checkNotNullParameter(exchangeCurrenciesInteractor, "exchangeCurrenciesInteractor");
                        r10.r rVar = new r10.r();
                        rVar.f250851a = walletInteractor;
                        rVar.f250852b = countryInteractor;
                        rVar.f250853c = exchangeCurrenciesInteractor;
                        gte.a aVarB2 = aVar8.b();
                        s.j(aVarB2);
                        g1i.c cVar4 = new g1i.c(aVarB2, 0);
                        rga.c cVarB = aVar4.C.b();
                        s.j(cVarB);
                        sVar = new d0(nVarB, bVarB, bVar5, bVar6, tVarF, aVar10, fVarE, bVarE, bVar7, bVar8, kVar2, o0Var, mVarF, bVarF, dVar3, bVarA, aVar11, aVar12, dVar4, mVar, iVar, gVarD, aVarE, accountId, fVarA, aVarA, aVar13, mVarT, dVarH, aVarI, fVarD, aVarA2, rVar, cVar4, cVarB);
                        break;
                    case 7:
                        return new m0();
                    case 8:
                        return new mm.d();
                    case 9:
                        rea.m mVarF2 = aVar4.f170476m.f();
                        xua.a aVarA3 = aVar4.f170480p.a();
                        s.j(aVarA3);
                        sVar = new e2i.m(mVarF2, aVarA3, aVar4.f170481q.a(), aVar4.d.b(), aVar4.d());
                        break;
                    case 10:
                        return new ym.d();
                    case 11:
                        return new m1i.a((d2i.h) aVar4.j0.get(), new c1i.b(aVar4.i.b()), aVar4.d.b(), aVar4.f170484s, aVar4.d());
                    case 12:
                        sVar = new d2i.h(ImmutableMap.of("DEFAULT", (d2i.f) aVar4.g0.get(), "FREELANCER", (d2i.f) aVar4.f170472h0.get(), "TRADING", (d2i.f) aVar4.i0.get()));
                        break;
                    case 13:
                        k61.a aVarE2 = aVar4.f170482r.e();
                        s.j(aVarE2);
                        sVar = new d2i.e(aVarE2, (vi0.b) aVar4.f0.get(), aVar4.f170476m.f(), aVar4.i.d());
                        break;
                    case 14:
                        AccountId accountId2 = aVar4.f170484s;
                        j1i.j.Companion.getClass();
                        Intrinsics.checkNotNullParameter(accountId2, "accountId");
                        return vi0.a.a(accountId2);
                    case 15:
                        rea.m mVarF3 = aVar4.f170476m.f();
                        h1 h1VarN = aVar4.f170486t.n();
                        s.j(h1VarN);
                        sVar = new d2i.k(mVarF3, h1VarN, (vi0.b) aVar4.f0.get(), aVar4.i.d());
                        break;
                    case 16:
                        u0 u0VarI = aVar4.u.i();
                        s.j(u0VarI);
                        tzg.m mVarT2 = aVar4.v.t();
                        s.j(mVarT2);
                        sVar = new d2i.m(u0VarI, mVarT2);
                        break;
                    case 17:
                        aVar4.getClass();
                        sVar = new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                        break;
                    case 18:
                        return new ln.c();
                    case 19:
                        return new sm.e();
                    case 20:
                        return new om.c();
                    case 21:
                        return new an.a();
                    case 22:
                        g1i.a aVar14 = (g1i.a) aVar4.l0.get();
                        g1i.b bVar9 = (g1i.b) aVar4.f170466b0.get();
                        ln.a aVar15 = (ln.a) aVar4.f170479o0.get();
                        AccountId accountId3 = aVar4.f170484s;
                        k1i.k kVar3 = new k1i.k((ln.a) aVar4.f170479o0.get());
                        iva.a aVarA4 = aVar4.o.a();
                        s.j(aVarA4);
                        t1 t1VarC = aVar4.k.c();
                        jx0.a aVar16 = new jx0.a(((n51.a) aVar4.F).b(), aVar4.f170489x.a());
                        xh5.a aVarA5 = aVar4.G.a();
                        s.j(aVarA5);
                        sVar = new l0(aVar14, bVar9, aVar15, accountId3, kVar3, aVarA4, t1VarC, aVar16, aVarA5);
                        break;
                    case 23:
                        return new wm.a();
                    default:
                        throw new AssertionError(i6);
                }
                return sVar;
            case 5:
                j25.a aVar17 = (j25.a) this.f169341c;
                jm4.r rVar2 = aVar17.f170697c;
                int i21 = this.f169340b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new CollateralPocketMapperImpl();
                    }
                    if (i21 != 2) {
                        throw new AssertionError(i21);
                    }
                    i25.c cVar5 = (i25.c) aVar17.e.get();
                    x6e.d dVar5 = (x6e.d) aVar17.d.U.get();
                    s.j(dVar5);
                    return new i25.b(cVar5, dVar5);
                }
                wsg.n nVarB2 = aVar17.f170695a.b();
                i25.c cVar6 = (i25.c) aVar17.e.get();
                ssi.o oVarC = aVar17.f170696b.c();
                s.j(oVarC);
                al4.n nVarS = rVar2.s();
                s.j(nVarS);
                n4 n4Var = (n4) rVar2.D.get();
                s.j(n4Var);
                return new i25.g(nVarB2, cVar6, oVarC, nVarS, n4Var, new i25.h());
            case 6:
                j26.a aVar18 = (j26.a) this.f169341c;
                a31.a aVar19 = aVar18.e;
                int i22 = this.f169340b;
                if (i22 == 0) {
                    eVar = new k26.e(aVar18.f170699a, aVar18.f170700b, aVar18.f170701c, aVar18.d, aVar19);
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new AssertionError(i22);
                        }
                        k26.b bVar10 = (k26.b) ((k26.e) aVar18.f170707n.get()).b();
                        s.k(bVar10);
                        return bVar10;
                    }
                    eVar = new f1i.d(aVar18.f, aVar18.f170702g, aVar18.f170703h, aVar18.i, aVar19, aVar18.f170704j, aVar18.o, aVar18.k, aVar18.f170705l, aVar18.f170706m);
                }
                return eVar;
            case 7:
                j3l.c cVar7 = (j3l.c) this.f169341c;
                int i32 = this.f169340b;
                switch (i32) {
                    case 0:
                        hri.b bVar11 = cVar7.f171240a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar12 = cVar7.f171240a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        cVar7.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 5:
                        return new ln.c();
                    case 6:
                        return new ym.d();
                    case 7:
                        return new mm.d();
                    case 8:
                        h3l.e eVar2 = (h3l.e) cVar7.f171247m.get();
                        ln.a aVar20 = (ln.a) cVar7.f171245j.get();
                        ho.t tVarC = cVar7.f171242c.c();
                        s.j(tVarC);
                        return new i3l.b(eVar2, aVar20, tVarC, 0);
                    case 9:
                        return new h3l.m();
                    case 10:
                        h3l.e eVar3 = (h3l.e) cVar7.f171247m.get();
                        ln.a aVar21 = (ln.a) cVar7.f171245j.get();
                        ho.t tVarC2 = cVar7.f171242c.c();
                        s.j(tVarC2);
                        return new i3l.b(eVar3, aVar21, tVarC2, 1);
                    case 11:
                        return new i3l.a((h3l.e) cVar7.f171247m.get(), (ln.a) cVar7.f171245j.get(), 1);
                    case 12:
                        return new i3l.a((h3l.e) cVar7.f171247m.get(), (ln.a) cVar7.f171245j.get(), 0);
                    case 13:
                        return new sm.e();
                    case 14:
                        return new om.c();
                    case 15:
                        return new h3l.h((h3l.e) cVar7.f171247m.get());
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                j51.a aVar22 = (j51.a) this.f169341c;
                an0.c cVar8 = aVar22.f171455a;
                Context context = aVar22.e;
                int i33 = this.f169340b;
                if (i33 == 0) {
                    zm0.b bVarI = cVar8.i();
                    s.j(bVarI);
                    yri.a aVar23 = (yri.a) aVar22.f.get();
                    asi.a aVar24 = (asi.a) aVar22.f171457c.f177696a.get();
                    s.j(aVar24);
                    return new asi.d(bVarI, aVar23, aVar24);
                }
                if (i33 == 1) {
                    l80.h hVarV = aVar22.f171456b.v();
                    s.j(hVarV);
                    return new yri.b(hVarV);
                }
                if (i33 != 2) {
                    throw new AssertionError(i33);
                }
                Context context2 = aVar22.d.f150870a;
                hcb.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
                s.k(defaultSharedPreferences);
                a31.a aVar25 = new a31.a(defaultSharedPreferences);
                j51.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                phm.a aVar26 = (phm.a) ue0.e.j(context).a().get(poi.b.class);
                b60.a aVar27 = aVar26 != null ? (b60.a) aVar26.get() : null;
                if (aVar27 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", poi.b.class, " is not found"));
                }
                com.revolut.analytics.tracking.v3.d dVarF = ((poi.b) aVar27.b()).f();
                s.k(dVarF);
                Intrinsics.checkNotNullParameter(context, "context");
                phm.a aVar28 = (phm.a) j6.a.i(context, if2.f.class);
                b60.a aVar29 = aVar28 != null ? (b60.a) aVar28.get() : null;
                if (aVar29 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                }
                ah2.d dVar6 = (ah2.d) ((if2.f) aVar29.b()).E.get();
                s.k(dVar6);
                mli.k kVar4 = new mli.k(aVar25, dVarF, dVar6);
                phm.a aVar30 = (phm.a) kii.e.l(context, "context", context, xmg.a.class);
                b60.a aVar31 = aVar30 != null ? (b60.a) aVar30.get() : null;
                if (aVar31 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", xmg.a.class, " is not found"));
                }
                ang.f fVarE2 = ((xmg.a) aVar31.b()).e();
                b60.a aVar32 = null;
                zm0.b bVarI2 = cVar8.i();
                s.j(bVarI2);
                Intrinsics.checkNotNullParameter(context, "context");
                phm.a aVar33 = (phm.a) j6.a.i(context, q1.class);
                b60.a aVar34 = aVar33 != null ? (b60.a) aVar33.get() : null;
                if (aVar34 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                }
                xjl.o oVar = (xjl.o) ((q0) ((q1) aVar34.b())).u0.get();
                s.k(oVar);
                Intrinsics.checkNotNullParameter(context, "context");
                phm.a aVar35 = (phm.a) ue0.e.j(context).a().get(ite.a.class);
                if (aVar35 != null) {
                    aVar32 = (b60.a) aVar35.get();
                }
                if (aVar32 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ite.a.class, " is not found"));
                }
                gte.a aVarB3 = ((ite.a) aVar32.b()).b();
                s.k(aVarB3);
                return new mli.e(kVar4, fVarE2, bVarI2, oVar, aVarB3);
            case 9:
                j5d.b bVar13 = (j5d.b) this.f169341c;
                int i43 = this.f169340b;
                if (i43 == 0) {
                    AirTipDatabase database = (AirTipDatabase) bVar13.f171620g.get();
                    h5d.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(database, "database");
                    g5d.d dVarG = database.g();
                    s.k(dVarG);
                    return dVarG;
                }
                if (i43 != 1) {
                    if (i43 == 2) {
                        return new l5d.k((l5d.a) bVar13.i.get());
                    }
                    if (i43 == 3) {
                        return new l5d.a();
                    }
                    if (i43 == 4) {
                        return bVar13.f.a();
                    }
                    if (i43 == 5) {
                        return new j5d.a();
                    }
                    throw new AssertionError(i43);
                }
                Context context3 = bVar13.f171617a;
                yk0.a databaseSessionProvider = bVar13.f171618b.b();
                s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((cl0.a) bVar13.f171619c).a();
                s.j(databaseEncryptionMigratorFactory);
                h5d.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                AirTipDatabase airTipDatabase = (AirTipDatabase) AirTipDatabase.INSTANCE.a(context3, databaseSessionProvider, new Migration[0], databaseEncryptionMigratorFactory);
                s.k(airTipDatabase);
                return airTipDatabase;
            case 10:
                j73.b bVar14 = (j73.b) this.f169341c;
                int i59 = this.f169340b;
                if (i59 == 0) {
                    return new k73.d((cli.n) bVar14.f171846b.get(), bVar14.f171845a);
                }
                if (i59 == 1) {
                    return new k73.e();
                }
                throw new AssertionError(i59);
            case 11:
                jaj.b bVar15 = (jaj.b) this.f169341c;
                ee0.a aVar36 = bVar15.f172486a;
                int i66 = this.f169340b;
                if (i66 == 0) {
                    return new naj.a();
                }
                if (i66 == 1) {
                    je0.d mapper = aVar36.b();
                    s.j(mapper);
                    yk0.a databaseSessionProvider2 = bVar15.f172487b.b();
                    s.j(databaseSessionProvider2);
                    xe0.f storageFactory = aVar36.f();
                    s.j(storageFactory);
                    maj.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapper, "mapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                    return xe0.f.f(storageFactory, databaseSessionProvider2, "newly_added_crypto", mapper, 0, null, 56);
                }
                if (i66 == 2) {
                    laj.a aVar37 = (laj.a) bVar15.k.get();
                    nw5.a aVarC = bVar15.d.c();
                    s.j(aVarC);
                    aVar = new oaj.a(aVar37, aVarC);
                } else {
                    if (i66 != 3) {
                        if (i66 != 4) {
                            throw new AssertionError(i66);
                        }
                        Retrofit retrofit4 = ((c21.b) bVar15.f172488c).i();
                        s.j(retrofit4);
                        kaj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate3 = retrofit4.create(NewlyAddedCryptoService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        NewlyAddedCryptoService newlyAddedCryptoService = (NewlyAddedCryptoService) objCreate3;
                        s.k(newlyAddedCryptoService);
                        return newlyAddedCryptoService;
                    }
                    aVar = new laj.d((NewlyAddedCryptoService) bVar15.f172491j.get(), new ne0.d(), (ue0.c) bVar15.i.get());
                }
                return aVar;
            case 12:
                jak.b bVar16 = (jak.b) this.f169341c;
                int i74 = this.f169340b;
                switch (i74) {
                    case 0:
                        hri.b bVar17 = bVar16.f172513a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar18 = bVar16.f172513a;
                        return new iri.j();
                    case 2:
                        return new iak.a();
                    case 3:
                        dVar = new iak.d((iak.b) bVar16.f172520m.get());
                        break;
                    case 4:
                        dVar = new iak.b((lak.d) bVar16.i.get(), bVar16.f172515c.a(), bVar16.d.e(), new com.google.firebase.messaging.t((cn.e) bVar16.f172518j.get(), (ym.d) bVar16.k.get(), (um.c) bVar16.f172519l.get(), (ifm.b) bVar16.f172516g.get()));
                        break;
                    case 5:
                        return new cn.e();
                    case 6:
                        return new ym.d();
                    case 7:
                        return new um.c();
                    case 8:
                        return new ln.c();
                    case 9:
                        bVar16.getClass();
                        dVar = new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                        break;
                    case 10:
                        return new mm.d();
                    case 11:
                        return new sm.e();
                    case 12:
                        return new om.c();
                    default:
                        throw new AssertionError(i74);
                }
                return dVar;
            case 13:
                jcc.e eVar4 = (jcc.e) this.f169341c;
                int i92 = this.f169340b;
                switch (i92) {
                    case 0:
                        return new gcc.g((RevolutPayPromotedMerchantsApiService) eVar4.k.get(), (ne0.j) eVar4.f172774l.get(), (fd0.d) eVar4.f172775m.get(), (ue0.c) eVar4.f172776n.get());
                    case 1:
                        Retrofit retrofit5 = ((nj0.d) eVar4.f172768a).f();
                        jcc.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                        Object objCreate4 = retrofit5.create(RevolutPayPromotedMerchantsApiService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                        RevolutPayPromotedMerchantsApiService revolutPayPromotedMerchantsApiService = (RevolutPayPromotedMerchantsApiService) objCreate4;
                        s.k(revolutPayPromotedMerchantsApiService);
                        return revolutPayPromotedMerchantsApiService;
                    case 2:
                        jcc.h.Companion.getClass();
                        return new ne0.d();
                    case 3:
                        jcc.h.Companion.getClass();
                        return new fd0.d(16);
                    case 4:
                        je0.d mapper2 = eVar4.f172769b.b();
                        s.j(mapper2);
                        yk0.a databaseSessionProvider3 = eVar4.f172770c.b();
                        s.j(databaseSessionProvider3);
                        xe0.f storageFactory2 = eVar4.f172769b.f();
                        s.j(storageFactory2);
                        jcc.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider3, "revolut_pay_promoted_merchants", mapper2, 1, null, 48);
                    case 5:
                        return new occ.m();
                    case 6:
                        gcc.g gVar = (gcc.g) eVar4.o.get();
                        h4g.g gVarB = eVar4.d.b();
                        b6c.c cVarB2 = eVar4.e.b();
                        s.j(cVarB2);
                        return new kcc.a(gVar, gVarB, cVarB2);
                    case 7:
                        Context context4 = eVar4.f;
                        jcc.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context4, "context");
                        sri.m mVarC = o.c(context4, null, null, 14);
                        b6c.c cVarB3 = eVar4.e.b();
                        s.j(cVarB3);
                        bVar = new icc.b(mVarC, cVarB3, (kcc.a) eVar4.f172778q.get());
                        break;
                    case 8:
                        Context context5 = eVar4.f;
                        jcc.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context5, "context");
                        sri.m mVarC2 = o.c(context5, null, null, 14);
                        gte.a aVarB4 = eVar4.f172771g.b();
                        s.j(aVarB4);
                        eub.a aVarA6 = eVar4.f172772h.a();
                        s.j(aVarA6);
                        bVar = new icc.e(mVarC2, aVarB4, aVarA6);
                        break;
                    case 9:
                        return new hcc.b();
                    case 10:
                        return new if0.a(ImmutableSet.of((od0.e) eVar4.f172776n.get()));
                    case 11:
                        Object extension = (bcc.a) eVar4.f172777p.get();
                        pcc.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar = (yji.n) extension;
                        s.k(nVar);
                        return nVar;
                    case 12:
                        return new kcc.b((gcc.g) eVar4.o.get());
                    default:
                        throw new AssertionError(i92);
                }
                return bVar;
            case 14:
                jdi.e eVar5 = (jdi.e) this.f169341c;
                RevPointsPocketDowngradeScreenContract$InputData revPointsPocketDowngradeScreenContract$InputData = eVar5.f173090a;
                int i96 = this.f169340b;
                if (i96 == 0) {
                    return new wdi.h((cli.n) eVar5.f173091b.get(), revPointsPocketDowngradeScreenContract$InputData);
                }
                if (i96 == 1) {
                    return new wdi.i(revPointsPocketDowngradeScreenContract$InputData);
                }
                throw new AssertionError(i96);
            case 15:
                jfa.a aVar38 = (jfa.a) this.f169341c;
                ee0.a aVar39 = aVar38.f173731a;
                w9k.a aVar40 = aVar38.f173734g;
                ite.a aVar41 = aVar38.f173735h;
                int i99 = this.f169340b;
                switch (i99) {
                    case 0:
                        return new ifa.a();
                    case 1:
                        je0.d mapper3 = (je0.d) aVar38.f173744t.get();
                        yk0.a databaseSessionProvider4 = aVar38.f173732b.b();
                        s.j(databaseSessionProvider4);
                        xe0.f storageFactory3 = aVar39.f();
                        s.j(storageFactory3);
                        jfa.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return xe0.f.f(storageFactory3, databaseSessionProvider4, "post_activation", mapper3, 0, null, 56);
                    case 2:
                        Json json = (Json) aVar38.f173743s.get();
                        me0.a factory = aVar39.e();
                        s.j(factory);
                        jfa.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(json, "json");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(json);
                    case 3:
                        Json baseJson = fe0.d.a();
                        jfa.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                        return ue0.e.b(baseJson, new je5.n(9));
                    case 4:
                        return new qfa.e((PostActivationService) aVar38.v.get(), (ne0.j) aVar38.f173745w.get(), (ue0.c) aVar38.u.get(), aVar38.e.a());
                    case 5:
                        ik0.b retrofitFactory = ((nj0.d) aVar38.d).m();
                        s.j(retrofitFactory);
                        Json json2 = (Json) aVar38.f173743s.get();
                        jfa.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(json2, "json");
                        Object objCreate5 = ik0.b.a(retrofitFactory, null, null, p.a.g(b1.Companion, "application/json", json2), null, 27).create(PostActivationService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate5, "create(...)");
                        PostActivationService postActivationService = (PostActivationService) objCreate5;
                        s.k(postActivationService);
                        return postActivationService;
                    case 6:
                        return new ne0.d();
                    case 7:
                        qfa.e eVar6 = (qfa.e) aVar38.f173746x.get();
                        x9k.a aVarA7 = aVar40.a();
                        s.j(aVarA7);
                        gte.a aVarB5 = aVar41.b();
                        s.j(aVarB5);
                        return new mfa.g(eVar6, aVarA7, aVarB5, aVar38.i.e());
                    case 8:
                        qfa.e eVar7 = (qfa.e) aVar38.f173746x.get();
                        gte.a aVarB6 = aVar41.b();
                        s.j(aVarB6);
                        x9k.a aVarA8 = aVar40.a();
                        s.j(aVarA8);
                        return new mfa.l(eVar7, aVarB6, aVarA8);
                    default:
                        throw new AssertionError(i99);
                }
            case 16:
                jg5.g gVar2 = (jg5.g) this.f169341c;
                int i100 = this.f169340b;
                if (i100 == 0) {
                    sri.m mVar2 = (sri.m) gVar2.f173925g.get();
                    ai5.b bVarB2 = gVar2.f173923b.b();
                    s.j(bVarB2);
                    return new ig5.b(mVar2, bVarB2);
                }
                if (i100 != 1) {
                    throw new AssertionError(i100);
                }
                Context context6 = gVar2.f173922a;
                jg5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context6, "context");
                return o.c(context6, null, null, 14);
            case 17:
                jge.g gVar3 = (jge.g) this.f169341c;
                int i101 = this.f169340b;
                if (i101 == 0) {
                    r10.a aVar42 = new r10.a(new ihe.a(), new ihe.b());
                    y2 y2Var = (y2) gVar3.f174004b.get();
                    e4m.e eVar8 = gVar3.f174005c;
                    vie.h hVarA = gVar3.f174003a.a();
                    s.j(hVarA);
                    return new cge.h(aVar42, y2Var, eVar8, hVarA);
                }
                if (i101 == 1) {
                    y2 impl = new y2();
                    jge.e.Companion.getClass();
                    Intrinsics.checkNotNullParameter(impl, "impl");
                    return impl;
                }
                if (i101 != 2) {
                    throw new AssertionError(i101);
                }
                y2 impl2 = new y2();
                jge.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl2, "impl");
                return impl2;
            case 18:
                return a();
            case 19:
                return b();
            case 20:
                int i102 = this.f169340b;
                if (i102 == 0) {
                    return new com.revolut.feature.tab.crypto.impl.ui.v2.a((zje.a) ((jje.f) this.f169341c).f174877a.get());
                }
                if (i102 == 1) {
                    return new zje.a();
                }
                throw new AssertionError(i102);
            case 21:
                int i103 = this.f169340b;
                if (i103 == 0) {
                    return new lp4.e((cli.n) ((jm4.t) this.f169341c).f176358a.get());
                }
                if (i103 == 1) {
                    return new lp4.f();
                }
                throw new AssertionError(i103);
            case 22:
                f0 f0Var = (f0) this.f169341c;
                a3 a3Var = f0Var.f176067b;
                CreditCardAccruedInterestsBottomSheetControllerContract$InputData creditCardAccruedInterestsBottomSheetControllerContract$InputData = f0Var.f176066a;
                int i104 = this.f169340b;
                if (i104 == 0) {
                    jm4.r rVar3 = a3Var.f175965b;
                    al4.q qVarA = rVar3.a();
                    al4.m mVarR = rVar3.r();
                    s.j(mVarR);
                    fm4.a aVarA9 = a3Var.f175963a.a();
                    whf.b bVarA2 = a3Var.f175971h.a();
                    s.j(bVarA2);
                    return new iv4.g(creditCardAccruedInterestsBottomSheetControllerContract$InputData, new lal.a(qVarA, mVarR, aVarA9, bVarA2), (cli.n) f0Var.f176068c.get());
                }
                if (i104 != 1) {
                    throw new AssertionError(i104);
                }
                djf.c cVar9 = a3Var.f175971h;
                thf.l lVarF = cVar9.f();
                s.j(lVarF);
                thf.d dVarD = cVar9.d();
                s.j(dVarD);
                thf.m mVarG = cVar9.g();
                s.j(mVarG);
                return new iv4.h(creditCardAccruedInterestsBottomSheetControllerContract$InputData, new sv4.k(lVarF, dVarD, mVarG));
            case 23:
                int i105 = this.f169340b;
                if (i105 == 0) {
                    a1 a1Var = (a1) this.f169341c;
                    return new com.revolut.feature.credit.card.impl.ui.instalment.agreement.a(a1Var.f175957a, (cli.n) a1Var.f175958b.get());
                }
                if (i105 == 1) {
                    return new rr4.n();
                }
                throw new AssertionError(i105);
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
                n3 n3Var = (n3) this.f169341c;
                SelectAmountTypeScreenContract$InputData selectAmountTypeScreenContract$InputData = n3Var.f176218a;
                int i106 = this.f169340b;
                if (i106 == 0) {
                    return new lk4.h(selectAmountTypeScreenContract$InputData, (jki.p) n3Var.f176219b.get());
                }
                if (i106 == 1) {
                    return new lk4.j(selectAmountTypeScreenContract$InputData);
                }
                throw new AssertionError(i106);
        }
    }
}
