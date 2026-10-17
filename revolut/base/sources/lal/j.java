package lal;

import ael.z;
import al4.u;
import android.content.Context;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.chaosmanagement.data.network.ChaosManagementService;
import com.revolut.feature.cash_topup.impl.data.service.CashTopUpService;
import com.revolut.feature.credit.card.impl.network.CreditCardEntryPointDetailsService;
import com.revolut.feature.credit.card.impl.network.CreditCardProductService;
import com.revolut.feature.revpro.card_reader.order.impl.data.service.CardReaderOrdersService;
import com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl;
import com.revolut.feature.rewards.shops.impl.data.network.services.LifestyleWidgetService;
import com.revolut.feature.separate_favourites.item_data.impl.alerts.universal.network.UniversalAlertsService;
import com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase;
import com.revolut.feature.separate_favourites.item_data.impl.watchlist.network.WatchlistService;
import com.revolut.feature.us_send_checks.impl.service.SendChecksTransferService;
import com.revolut.shared.feature.suspicious_transaction.impl.data.service.SuspiciousTransactionService;
import dp4.o0;
import ecm.q;
import g2e.t;
import java.util.Comparator;
import java.util.Map;
import jlh.w;
import jlh.y;
import kbb.r;
import kotlin.jvm.internal.Intrinsics;
import kyk.v;
import kyk.x;
import l9f.a0;
import ld1.f0;
import lf9.c0;
import ljl.w1;
import lp.q9;
import lpf.g0;
import lu7.m0;
import om4.e0;
import om4.k4;
import om4.m4;
import om4.q4;
import om4.s3;
import om4.u0;
import om4.y3;
import retrofit2.Retrofit;
import tjh.i0;
import vc.s;
import x8h.n0;
import z0g.f1;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f193452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f193453c;

    public /* synthetic */ j(Object obj2, int i, int i2) {
        this.f193451a = i2;
        this.f193453c = obj2;
        this.f193452b = i;
    }

    private final Object a() {
        mb3.i iVar = (mb3.i) this.f193453c;
        int i = this.f193452b;
        if (i == 0) {
            CashTopUpService cashTopUpService = (CashTopUpService) iVar.f204066j.get();
            d49.a aVar = (d49.a) iVar.f.f132031l.get();
            s.j(aVar);
            hb3.c cVar = new hb3.c(aVar);
            fd0.d dVar = (fd0.d) iVar.k.get();
            b80.c cVarP = iVar.f204065h.p();
            s.j(cVarP);
            return new jb3.j(cashTopUpService, cVar, dVar, cVarP);
        }
        if (i == 1) {
            return m4d.e.r((Retrofit) iVar.i.get());
        }
        if (i == 2) {
            return m4d.e.n(((nj0.d) iVar.f204062b).f());
        }
        if (i == 3) {
            return mb3.h.a();
        }
        if (i == 4) {
            return new ob3.f();
        }
        throw new AssertionError(i);
    }

    private final Object b() {
        mkh.s sVar = (mkh.s) this.f193453c;
        int i = this.f193452b;
        switch (i) {
            case 0:
                gte.a aVarB = sVar.f206400a.b();
                s.j(aVarB);
                xih.f fVar = new xih.f(aVarB);
                ktg.a aVar = (ktg.a) sVar.f206402b.f325162w.get();
                s.j(aVar);
                zih.a aVar2 = (zih.a) sVar.m0.get();
                tzg.m mVarT = sVar.d.t();
                s.j(mVarT);
                return new xih.d(fVar, aVar, aVar2, mVarT);
            case 1:
                return new zih.b(sVar.f206405c.a());
            case 2:
                c4f.a aVar3 = sVar.e;
                h9h.a aVar4 = sVar.d;
                zdl.f fVar2 = sVar.f;
                d4f.f fVar3 = (d4f.f) aVar3.f21182l.get();
                s.j(fVar3);
                n0 n0VarQ = aVar4.q();
                wlh.l lVar = new wlh.l();
                wlh.n nVar = new wlh.n();
                wlh.m mVar = new wlh.m();
                wlh.a aVar5 = (wlh.a) sVar.f206419o0.get();
                kpj.f fVarJ = sVar.j();
                ybl.l lVarF = aVar4.f();
                gte.a aVarB2 = sVar.f206400a.b();
                s.j(aVarB2);
                ybl.i iVarB = fVar2.b();
                s.j(iVarB);
                d1e.a aVarA = ((a1e.b) sVar.f206410g).a();
                Map mapA = fVar2.a();
                s.j(mapA);
                Map map = mapA;
                wlh.o oVar = new wlh.o();
                j6h.c cVarA = sVar.f206411h.a();
                ybl.j jVarC = fVar2.c();
                s.j(jVarC);
                return new wlh.c(fVar3, n0VarQ, lVar, nVar, mVar, aVar5, fVarJ, lVarF, aVarB2, iVarB, aVarA, map, oVar, cVarA, jVarC);
            case 3:
                return new wlh.b();
            case 4:
                aah.i iVarD = ((u8h.b) sVar.i).d();
                s.j(iVarD);
                return mj8.n.A(iVarD);
            case 5:
                return f1.o(sVar.f206420p.a());
            case 6:
                return f1.u(sVar.f206421q.a());
            case 7:
                return new y();
            case 8:
                tv5.b bVarC = sVar.f206426t.c();
                s.j(bVarC);
                return new w(bVarC, sVar.d.D(), sVar.f206415l.g());
            case 9:
                h9h.a aVar6 = sVar.d;
                h9h.a aVar7 = sVar.d;
                wzg.a aVarE = aVar6.e();
                s.j(aVarE);
                zjh.f fVarA = sVar.f206429w.a();
                qmc.h hVarA = sVar.f206431x.a();
                qmc.b bVarF = sVar.f206433y.f();
                tzg.m mVarT2 = aVar7.t();
                s.j(mVarT2);
                ybl.l lVarF2 = aVar7.f();
                ybl.k kVarD = sVar.f.d();
                s.j(kVarD);
                ybl.l lVarF3 = aVar7.f();
                ybl.d dVarH = sVar.f206413j.h();
                s.j(dVarH);
                yjh.c cVar = new yjh.c(kVarD, lVarF3, dVarH);
                cjh.a aVar8 = (cjh.a) sVar.f206428v0.get();
                tzg.l lVar2 = (tzg.l) aVar7.u0.get();
                s.j(lVar2);
                tzg.m mVarT3 = aVar7.t();
                s.j(mVarT3);
                yjh.y yVar = new yjh.y(mVarT3);
                tzg.h hVarJ = aVar7.j();
                s.j(hVarJ);
                return new xjh.a(aVarE, fVarA, hVarA, bVarF, mVarT2, lVarF2, cVar, aVar8, lVar2, yVar, hVarJ);
            case 10:
                return new cjh.c(sVar.d.f());
            case 11:
                return new xjh.f(new wqi.a());
            case 12:
                x xVar = sVar.z;
                kyk.y yVar2 = sVar.A;
                c1l.e eVarA = xVar.a();
                wxk.f fVar4 = (wxk.f) ((v) yVar2).P.get();
                s.j(fVar4);
                wxk.c cVar2 = new wxk.c(((v) yVar2).k.f());
                r rVarA = sVar.B.a();
                s.j(rVarA);
                nlh.b bVarA = sVar.f206417n.a();
                s.j(bVarA);
                ybl.k kVarD2 = sVar.f.d();
                s.j(kVarD2);
                return new llh.i(eVarA, fVar4, cVar2, rVarA, bVarA, kVarD2);
            case 13:
                tzg.m mVarT4 = sVar.d.t();
                s.j(mVarT4);
                sj3.a aVar9 = (sj3.a) sVar.C.f314404m.get();
                s.j(aVar9);
                r rVarA2 = sVar.B.a();
                s.j(rVarA2);
                nlh.b bVarA2 = sVar.f206417n.a();
                s.j(bVarA2);
                return new llh.b(mVarT4, aVar9, rVarA2, bVarA2);
            case 14:
                h9h.a aVar10 = sVar.d;
                dmc.b bVar = sVar.D;
                tzg.m mVarT5 = aVar10.t();
                s.j(mVarT5);
                r rVarA3 = sVar.B.a();
                s.j(rVarA3);
                clc.b bVarA3 = bVar.a();
                s.j(bVarA3);
                xkc.a aVarB3 = bVar.b();
                s.j(aVarB3);
                return new llh.f(mVarT5, rVarA3, bVarA3, aVarB3);
            case 15:
                h9h.a aVar11 = sVar.d;
                h9h.a aVar12 = sVar.d;
                ite.a aVar13 = sVar.f206400a;
                x8h.k kVarD3 = aVar11.d();
                vjh.a aVar14 = (vjh.a) sVar.B0.get();
                jlh.f fVar5 = (jlh.f) sVar.F0.get();
                ujh.d dVar = new ujh.d();
                ujh.b bVar2 = new ujh.b();
                ujh.a aVar15 = new ujh.a();
                gte.a aVarB4 = aVar13.b();
                s.j(aVarB4);
                jlh.e eVar = new jlh.e(fVar5, dVar, bVar2, aVar15, aVarB4);
                jlh.f fVar6 = (jlh.f) sVar.F0.get();
                ojh.a aVar16 = (ojh.a) sVar.I0.get();
                njh.d dVar2 = (njh.d) sVar.K0.get();
                kjh.a aVar17 = (kjh.a) sVar.M0.get();
                mjh.h hVar = (mjh.h) sVar.P0.get();
                rjh.a aVar18 = (rjh.a) sVar.Q0.get();
                gte.a aVarB5 = aVar13.b();
                s.j(aVarB5);
                vjh.e eVar2 = new vjh.e(aVar16, dVar2, aVar17, hVar, aVar18, aVarB5);
                gte.a aVarB6 = aVar13.b();
                s.j(aVarB6);
                ael.w wVarG = sVar.f206413j.g();
                s.j(wVarG);
                ijh.d dVar3 = new ijh.d(sVar.f206429w.d());
                z8h.g gVarU = aVar12.u();
                tzg.m mVarT6 = aVar12.t();
                s.j(mVarT6);
                ybl.l lVarF4 = aVar12.f();
                bnh.n nVarI = sVar.i();
                ejh.b bVarH = sVar.h();
                mk0.a aVarA2 = sVar.H.a();
                s.j(aVarA2);
                return new i0(kVarD3, aVar14, eVar, fVar6, eVar2, aVarB6, wVarG, dVar3, gVarU, mVarT6, lVarF4, nVarI, bVarH, aVarA2);
            case 16:
                gte.a aVarB7 = sVar.f206400a.b();
                s.j(aVarB7);
                return new vjh.b(aVarB7);
            case 17:
                ulh.a aVar19 = (ulh.a) sVar.E0.get();
                l80.e eVarH = sVar.I.h();
                s.j(eVarH);
                return new jlh.o(aVar19, eVarH);
            case 18:
                d4m.a aVarA3 = e4m.b.a(sVar.C0);
                d4m.a aVarA4 = e4m.b.a(sVar.D0);
                mk0.a aVarA5 = sVar.H.a();
                s.j(aVarA5);
                return new ulh.n(aVarA3, aVarA4, aVarA5, new vlh.b(), new vlh.a());
            case 19:
                je0.d dVarB = sVar.F.b();
                s.j(dVarB);
                yk0.a aVarB8 = sVar.G.b();
                s.j(aVarB8);
                xe0.f fVarF = sVar.F.f();
                s.j(fVarF);
                return mj8.n.w(dVarB, aVarB8, fVarF);
            case 20:
                return new ne0.d();
            case 21:
                return new ojh.c((pjh.g) sVar.H0.get(), sVar.j(), sVar.k(), new zjh.i(sVar.f206413j.i()));
            case 22:
                ljh.a aVar20 = new ljh.a();
                sVar.getClass();
                return new pjh.k(aVar20, new ufl.b(new tfl.a()), new bnh.c((qjh.b) sVar.G0.get()));
            case 23:
                return new qjh.c(sVar.f206429w.d(), dmc.r.h(), sVar.k(), sVar.f206413j.i());
            case 24:
                z zVarI = sVar.f206413j.i();
                njh.b bVar3 = (njh.b) sVar.J0.get();
                ljh.c cVarK = sVar.k();
                gte.a aVarB9 = sVar.f206400a.b();
                s.j(aVarB9);
                return new njh.e(zVarI, bVar3, cVarK, aVarB9);
            case 25:
                return new njh.c(sVar.f206429w.d(), dmc.r.h(), sVar.f206413j.i());
            case 26:
                return new kjh.b((kjh.c) sVar.L0.get(), new ljh.a());
            case 27:
                ku5.g gVar = sVar.J;
                return new kjh.d(new wt5.a());
            case 28:
                e4m.e eVar3 = sVar.N0;
                m2b.e eVar4 = sVar.E;
                mjh.a aVar21 = (mjh.a) eVar3.get();
                mjh.e eVar5 = (mjh.e) sVar.O0.get();
                ljh.a aVar22 = new ljh.a();
                k5b.d dVarG = eVar4.g();
                s.j(dVarG);
                return new mjh.i(aVar21, eVar5, aVar22, dVarG, eVar4.j(), sVar.k());
            case 29:
                return new mjh.g();
            case 30:
                d2b.a aVarC = sVar.E.c();
                s.j(aVarC);
                return new mjh.f(aVarC);
            case 31:
                return new rjh.b((pjh.g) sVar.H0.get(), sVar.j(), sVar.k());
            case 32:
                c1l.e eVarA2 = sVar.z.a();
                nxk.a aVar23 = (nxk.a) ((v) sVar.A).Q.get();
                s.j(aVar23);
                r rVarA4 = sVar.B.a();
                s.j(rVarA4);
                ybl.k kVarD4 = sVar.f.d();
                s.j(kVarD4);
                return new llh.l(eVarA2, aVar23, rVarA4, kVarD4, sVar.L.b());
            case 33:
                a2b.b bVarF2 = sVar.E.f();
                s.j(bVarF2);
                return new llh.c(bVarF2);
            case 34:
                return new djh.c((gjh.f) sVar.V0.get(), (hjh.c) sVar.X0.get(), (eih.a) sVar.Y0.get());
            case 35:
                return new gjh.f(sVar.h(), (gjh.g) sVar.U0.get(), (jlh.f) sVar.F0.get(), new gjh.j());
            case 36:
                return new gjh.g(new fmc.z(sVar.a()));
            case 37:
                return new hjh.c(sVar.h(), (hjh.f) sVar.W0.get());
            case 38:
                return new hjh.f(new t(sVar.a(), new hjh.d()));
            case 39:
                tzg.m mVarT7 = sVar.d.t();
                s.j(mVarT7);
                ybl.l lVarF5 = sVar.d.f();
                ybl.i iVarB2 = sVar.f.b();
                s.j(iVarB2);
                jlh.f fVar7 = (jlh.f) sVar.F0.get();
                r10.t tVarA = sVar.L.a();
                gte.a aVarB10 = sVar.f206400a.b();
                s.j(aVarB10);
                return new djh.d(mVarT7, lVarF5, iVarB2, fVar7, tVarA, aVarB10);
            case 40:
                mlh.c cVar3 = new mlh.c();
                y4d.l lVar3 = (y4d.l) sVar.a1.get();
                tzg.m mVarT8 = sVar.d.t();
                s.j(mVarT8);
                ejh.b bVarH2 = sVar.h();
                j6h.c cVarA2 = sVar.f206411h.a();
                mlh.a aVar24 = new mlh.a();
                iih.a aVar25 = (iih.a) sVar.K.f263842g.get();
                s.j(aVar25);
                return new wih.d(cVar3, lVar3, mVarT8, bVarH2, cVarA2, aVar24, new com.revolut.feature.wealth.ui.impl.actions.handler.b(aVar25));
            case 41:
                return new ikh.a(sVar.M.c(), sVar.d.d());
            case 42:
                return db5.e.o(sVar.P);
            case 43:
                gte.a aVarB11 = sVar.f206400a.b();
                s.j(aVarB11);
                return new jlh.v(aVarB11);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        mla.a aVar = (mla.a) this.f193453c;
        lla.a aVar2 = aVar.f206656a;
        int i = this.f193452b;
        if (i == 0) {
            return new nla.d(aVar2.a(), (ne0.j) aVar.f206658c.get());
        }
        if (i == 1) {
            return new ne0.d();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        mk0.a aVarA = aVar.f206657b.a();
        s.j(aVarA);
        return new nla.b(aVarA, aVar2.a(), new bng.b(aVar2.f196688b.e(), 1), (ne0.j) aVar.f206658c.get());
    }

    private final Object d() {
        mlg.b bVar = (mlg.b) this.f193453c;
        osb.a aVar = bVar.f206942a;
        nj0.a aVar2 = bVar.d;
        int i = this.f193452b;
        if (i == 0) {
            return new llg.b();
        }
        if (i == 1) {
            eli.j jVarA = aVar.a();
            hlg.b bVar2 = (hlg.b) bVar.o.get();
            y1k.a aVarA = bVar.f.a();
            s.j(aVarA);
            return new olg.c(jVarA, bVar2, aVarA, bVar.f206945g.b());
        }
        if (i == 2) {
            d3j.b bVarE = ((b3j.p) bVar.f206943b).e();
            slg.a aVar3 = (slg.a) bVar.f206950n.get();
            eli.j jVarA2 = aVar.a();
            je0.d dVarD = bVar.e.d();
            s.j(dVarD);
            return new olg.g(bVarE, aVar3, jVarA2, new plg.k(dVarD));
        }
        if (i == 3) {
            return new slg.a((SendChecksTransferService) bVar.f206949m.get(), ((nj0.d) aVar2).i);
        }
        if (i == 4) {
            return mj8.n.z(bVar.f206944c, ((nj0.d) aVar2).f());
        }
        if (i == 5) {
            return new rlg.a();
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        mpk.a aVar = (mpk.a) this.f193453c;
        a31.a aVar2 = aVar.i;
        q qVar = aVar.f207826a;
        int i = this.f193452b;
        if (i == 0) {
            return new npk.f(aVar.f207827b, aVar.f207828c, aVar.d, aVar.e, aVar.f, aVar.f207829g, aVar.f207830h, aVar2, aVar.f207831j, qVar);
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            npk.a aVar3 = (npk.a) ((npk.f) aVar.f207839t.get()).b();
            s.k(aVar3);
            return aVar3;
        }
        return new iq.a(aVar.k, aVar.f207832l, aVar2, aVar.f207833m, aVar.f207834n, aVar.o, aVar.f207835p, aVar.f207836q, aVar.f207837r, aVar.f207838s, qVar, aVar.u);
    }

    private final Object f() {
        ms1.j jVar = (ms1.j) this.f193453c;
        l70.e eVar = jVar.f208535c;
        int i = this.f193452b;
        switch (i) {
            case 0:
                return new ls1.a();
            case 1:
                ps1.b bVar = (ps1.b) jVar.D.get();
                sf0.h hVarB = jVar.f208533a.b();
                s.j(hVarB);
                v60.e eVarA = jVar.f208534b.a();
                s.j(eVarA);
                return new rs1.c(bVar, new e1l.a(hVarB, eVarA, 4));
            case 2:
                hs1.c cVarA = jVar.e.a();
                s.j(cVarA);
                mp.p pVarB = jVar.f.b();
                gte.a aVarB = jVar.f208536g.b();
                s.j(aVarB);
                return new ps1.b(cVarA, pVarB, aVarB);
            case 3:
                kz9.a aVarA = jVar.f208537h.a();
                s.j(aVarA);
                return new rs1.d(aVarA);
            case 4:
                hy1.l lVar = (hy1.l) ((ey1.e) jVar.i).H.get();
                s.j(lVar);
                fl3.a aVarE = jVar.f208538j.e();
                s.j(aVarE);
                return new rs1.f(lVar, aVarE, new pak.h((c12.f) jVar.F.get()));
            case 5:
                return new u5k.d(jVar.o.a());
            case 6:
                s70.a aVarM = eVar.m();
                s.j(aVarM);
                y80.a aVarR = eVar.r();
                s.j(aVarR);
                return new pn3.b(aVarM, aVarR);
            case 7:
                h12.h hVarF = jVar.f208545s.f();
                s.j(hVarF);
                return new rs1.g(hVarF);
            case 8:
                Context context = jVar.z;
                mae.p pVarE = jVar.A.e();
                s.j(pVarE);
                t70.b bVarG = eVar.g();
                s.j(bVarG);
                return ms1.g.v(context, pVarE, bVarG);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object obj2;
        Object o0Var;
        Object bVar;
        Object xVar;
        Object aVar;
        int i = this.f193451a;
        int i2 = this.f193452b;
        Object obj3 = this.f193453c;
        switch (i) {
            case 0:
                k kVar = (k) obj3;
                if (i2 == 0) {
                    return new pal.a((hal.a) kVar.i.get());
                }
                if (i2 == 1) {
                    return new ial.f((SuspiciousTransactionService) kVar.f193457g.get(), (ne0.j) kVar.f193458h.get());
                }
                if (i2 == 2) {
                    return l70.h.D(fe0.c.a(), (Retrofit) kVar.f.get());
                }
                if (i2 == 3) {
                    Retrofit retrofitF = ((nj0.d) kVar.f193454a).f();
                    l70.h.x(retrofitF);
                    return retrofitF;
                }
                if (i2 == 4) {
                    return p.a();
                }
                if (i2 == 5) {
                    return new ual.a();
                }
                throw new AssertionError(i2);
            case 1:
                ld0.c cVar = (ld0.c) obj3;
                ld0.a aVar2 = cVar.f193912a;
                if (i2 == 0) {
                    md0.e eVar = new md0.e((gd0.f) cVar.f.get(), cVar.f193914c.a());
                    l70.h.h(aVar2, eVar);
                    obj2 = eVar;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return l70.h.j(aVar2, cVar.f193913b);
                        }
                        if (i2 == 3) {
                            return ld0.b.a();
                        }
                        throw new AssertionError(i2);
                    }
                    gd0.f fVar = new gd0.f((ChaosManagementService) cVar.d.get(), (ne0.j) cVar.e.get());
                    l70.h.i(aVar2, fVar);
                    obj2 = fVar;
                }
                return obj2;
            case 2:
                ld1.a aVar3 = (ld1.a) obj3;
                if (i2 == 0) {
                    return new pd1.d((hf1.f) aVar3.f193920b.get(), (pd1.a) aVar3.d.get());
                }
                if (i2 == 1) {
                    return new hf1.f();
                }
                if (i2 == 2) {
                    return new pd1.c((c90.c) aVar3.f193921c.get());
                }
                if (i2 == 3) {
                    return l70.h.m(aVar3.f193919a);
                }
                if (i2 == 4) {
                    return new nd1.j();
                }
                throw new AssertionError(i2);
            case 3:
                ld1.l lVar = (ld1.l) obj3;
                switch (i2) {
                    case 0:
                        return new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.a();
                    case 1:
                        return new qd1.a();
                    case 2:
                        return new be1.a();
                    case 3:
                        return new nd1.b((nd1.c) lVar.f193960j.get());
                    case 4:
                        return new nd1.c((id1.n) lVar.i.get());
                    case 5:
                        ne0.j jVar = (ne0.j) lVar.f193959h.get();
                        hd1.a aVar4 = new hd1.a();
                        CatalogueDataProviderImpl catalogueDataProviderImpl = (CatalogueDataProviderImpl) lVar.f193955a.f253756h.get();
                        s.j(catalogueDataProviderImpl);
                        return new id1.n(jVar, aVar4, catalogueDataProviderImpl);
                    case 6:
                        return f0.a();
                    case 7:
                        return new kd1.b();
                    case 8:
                        id1.p pVar = (id1.p) lVar.f193963n.get();
                        hf1.f fVar2 = (hf1.f) lVar.o.get();
                        ad1.a aVar5 = (ad1.a) lVar.f193955a.i.get();
                        s.j(aVar5);
                        return new nd1.n(pVar, fVar2, aVar5);
                    case 9:
                        return new id1.p((md1.a) lVar.f193962m.get());
                    case 10:
                        return new md1.a();
                    case 11:
                        return new hf1.f();
                    case 12:
                        ad1.a aVar6 = (ad1.a) lVar.f193955a.i.get();
                        s.j(aVar6);
                        return new nd1.i(aVar6, (id1.o) lVar.f193965q.get());
                    case 13:
                        return new id1.o();
                    case 14:
                        return new pd1.c((c90.c) lVar.f193967s.get());
                    case 15:
                        return l70.h.n(lVar.f193957c);
                    case 16:
                        qd0.b bVarN = lVar.e.n();
                        s.j(bVarN);
                        return new hf1.g(bVarN);
                    default:
                        throw new AssertionError(i2);
                }
            case 4:
                if (i2 == 0) {
                    return new jf9.a();
                }
                if (i2 == 1) {
                    return new u5k.d(((lf9.m) obj3).f194740m.a());
                }
                throw new AssertionError(i2);
            case 5:
                lf9.z zVar = (lf9.z) obj3;
                a31.a aVar7 = zVar.f194819c;
                a31.a aVar8 = zVar.f194818b;
                q qVar = zVar.f194817a;
                if (i2 == 0) {
                    return new c3d.a(qVar, aVar8, aVar7, 13);
                }
                if (i2 == 1) {
                    return new c0(zVar.e, zVar.f, aVar8, zVar.f194820g, zVar.f194821h, zVar.i, zVar.f194822j, zVar.k, zVar.f194823l, zVar.f194824m, zVar.f194825n, zVar.o, zVar.f194826p, zVar.f194827q, zVar.f194828r, zVar.f194829s, zVar.f194830t, aVar7, zVar.u, zVar.v, zVar.f194831w, zVar.f194832x, qVar, zVar.d);
                }
                throw new AssertionError(i2);
            case 6:
                lfc.b bVar2 = (lfc.b) obj3;
                switch (i2) {
                    case 0:
                        ab1.a aVar9 = (ab1.a) bVar2.i.get();
                        ang.f fVarE = bVar2.f194847b.e();
                        w39.b bVarA = bVar2.f194848c.a();
                        s.j(bVarA);
                        return new mfc.c(aVar9, fVarE, bVarA, bVar2.d.b());
                    case 1:
                        return new jfc.h((ne0.j) bVar2.f.get(), (CardReaderOrdersService) bVar2.f194849g.get(), (hfc.a) bVar2.f194850h.get());
                    case 2:
                        return new ne0.d();
                    case 3:
                        return l70.h.A(((nj0.d) bVar2.f194846a).f());
                    case 4:
                        return new hfc.b();
                    case 5:
                        return new gfc.a();
                    case 6:
                        n8b.a aVarA = bVar2.e.a();
                        s.j(aVarA);
                        return new nfc.k(aVarA);
                    default:
                        throw new AssertionError(i2);
                }
            case 7:
                lfe.b bVar3 = (lfe.b) obj3;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar3.f194858c).c();
                    s.j(aVarC);
                    return new ife.c(aVarC);
                }
                q06.d dVarA = bVar3.f194856a.a();
                s.j(dVarA);
                e8c.a aVar10 = (e8c.a) bVar3.f194857b.O.get();
                s.j(aVar10);
                return new ife.b(dVarA, aVar10);
            case 8:
                lj8.a aVar11 = (lj8.a) obj3;
                a31.a aVar12 = aVar11.f195607h;
                if (i2 == 0) {
                    return new mj8.i(aVar11.f195604b, aVar11.f195605c, aVar11.d, aVar11.e, aVar11.f, aVar11.f195606g, aVar12, aVar11.f195603a);
                }
                if (i2 == 1) {
                    return mj8.n.b(aVar12, aVar11.i, aVar11.f195610m, aVar11.f195608j, aVar11.k);
                }
                if (i2 == 2) {
                    return l70.h.C((mj8.i) aVar11.f195609l.get());
                }
                throw new AssertionError(i2);
            case 9:
                lkc.a aVar13 = (lkc.a) obj3;
                c21.e eVar2 = aVar13.f196348b;
                ee0.a aVar14 = aVar13.f196349c;
                lkc.b bVar4 = aVar13.f196347a;
                if (i2 == 0) {
                    jkc.a aVar15 = (jkc.a) aVar13.f196353l.get();
                    n80.c cVar2 = (n80.c) aVar13.f196350g.T.get();
                    s.j(cVar2);
                    return new gkc.b(aVar15, cVar2);
                }
                if (i2 == 1) {
                    return new jkc.h((LifestyleWidgetService) aVar13.f196352j.get(), (ue0.c) aVar13.k.get(), new ne0.d(), aVar13.e.a(), aVar13.f.a());
                }
                if (i2 == 2) {
                    return w1.p(bVar4, (Retrofit) aVar13.i.get());
                }
                if (i2 == 3) {
                    Retrofit retrofitI = ((c21.b) eVar2).i();
                    s.j(retrofitI);
                    return w1.i(bVar4, retrofitI, (kg.o) aVar13.f196351h.get());
                }
                if (i2 == 4) {
                    kg.o oVarH = ((c21.b) eVar2).h();
                    s.j(oVarH);
                    return w1.h(bVar4, oVarH);
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                je0.d dVarB = aVar14.b();
                s.j(dVarB);
                yk0.a aVarB = aVar13.d.b();
                s.j(aVarB);
                xe0.f fVarF = aVar14.f();
                s.j(fVarF);
                return w1.o(dVarB, fVarF, aVarB);
            case 10:
                lm4.b bVar5 = (lm4.b) obj3;
                switch (i2) {
                    case 0:
                        return new y3((o0) bVar5.f196897r.get(), bVar5.e.a(), bVar5.f.e(), (al4.p) bVar5.f196901x.get());
                    case 1:
                        CreditCardProductService creditCardProductService = (CreditCardProductService) bVar5.f196895p.get();
                        ne0.d hashMapCache = new ne0.d();
                        mm4.a aVar16 = mm4.b.Companion;
                        aVar16.getClass();
                        Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
                        xx4.d dVar = new xx4.d(hashMapCache);
                        ue0.c storage = (ue0.c) bVar5.f196896q.get();
                        aVar16.getClass();
                        Intrinsics.checkNotNullParameter(storage, "storage");
                        o0Var = new o0(creditCardProductService, dVar, new xx4.e(storage));
                        break;
                    case 2:
                        mm4.c cVar3 = bVar5.f196886a;
                        CreditCardProductService creditCardProductService2 = (CreditCardProductService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar5.o.get(), "retrofit", CreditCardProductService.class, "create(...)");
                        s.k(creditCardProductService2);
                        return creditCardProductService2;
                    case 3:
                        mm4.c cVar4 = bVar5.f196886a;
                        Retrofit retrofitJ = ((c21.b) bVar5.f196887b).j();
                        s.j(retrofitJ);
                        kg.o oVar = (kg.o) bVar5.f196894n.get();
                        return j6.a.B(p.a.x(retrofitJ, "retrofit", oVar, "gson"), oVar, "build(...)");
                    case 4:
                        kg.o gson = ((c21.b) bVar5.f196887b).h();
                        s.j(gson);
                        mm4.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        return cn4.a.a(gson);
                    case 5:
                        le0.b gsonObjectMapperFactory = bVar5.f196888c.c();
                        s.j(gsonObjectMapperFactory);
                        kg.o baseGson = fe0.c.a();
                        yk0.a databaseSessionProvider = bVar5.d.b();
                        s.j(databaseSessionProvider);
                        xe0.f storageFactory = bVar5.f196888c.f();
                        s.j(storageFactory);
                        mm4.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
                        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSessionProvider, "credit_card_core", gsonObjectMapperFactory.a(cn4.a.a(baseGson)), 3, zhm.v.k(new ap4.a(), new ap4.b()), 32);
                    case 6:
                        bpj.a aVar17 = bVar5.f196889g;
                        uq3.b bVar6 = bVar5.i;
                        xoj.a aVarA2 = aVar17.a();
                        s.j(aVarA2);
                        o0 o0Var2 = (o0) bVar5.f196897r.get();
                        gte.a aVarB2 = bVar5.f196890h.b();
                        s.j(aVarB2);
                        xq3.j jVarG = bVar6.g();
                        s.j(jVarG);
                        wsg.n nVarB = bVar5.e.b();
                        ang.f fVarE2 = bVar5.f.e();
                        dp4.r rVar = (dp4.r) bVar5.f196899t.get();
                        jla.h hVarA = bVar5.f196891j.a();
                        k4 k4Var = (k4) bVar5.f196900w.get();
                        e0 e0Var = (e0) bVar5.u.get();
                        zq3.a aVar18 = (zq3.a) bVar6.U.get();
                        s.j(aVar18);
                        vie.h hVarA2 = bVar5.k.a();
                        s.j(hVarA2);
                        return new s3(aVarA2, o0Var2, aVarB2, jVarG, nVarB, fVarE2, rVar, hVarA, k4Var, e0Var, aVar18, hVarA2);
                    case 7:
                        CreditCardEntryPointDetailsService creditCardEntryPointDetailsService = (CreditCardEntryPointDetailsService) bVar5.f196898s.get();
                        ne0.d hashMapCache2 = new ne0.d();
                        mm4.a aVar19 = mm4.b.Companion;
                        aVar19.getClass();
                        Intrinsics.checkNotNullParameter(hashMapCache2, "hashMapCache");
                        xx4.d dVar2 = new xx4.d(hashMapCache2);
                        ue0.c storage2 = (ue0.c) bVar5.f196896q.get();
                        aVar19.getClass();
                        Intrinsics.checkNotNullParameter(storage2, "storage");
                        o0Var = new dp4.r(creditCardEntryPointDetailsService, dVar2, new xx4.e(storage2));
                        break;
                    case 8:
                        return mj8.n.f(bVar5.f196886a, (Retrofit) bVar5.o.get());
                    case 9:
                        k4 k4Var2 = (k4) bVar5.v.get();
                        mj8.n.C(k4Var2);
                        return k4Var2;
                    case 10:
                        uq3.b bVar7 = bVar5.i;
                        xq3.j jVarG2 = bVar7.g();
                        s.j(jVarG2);
                        up3.b bVarI = bVar7.i();
                        s.j(bVarI);
                        k4 k4Var3 = new k4(jVarG2, bVarI, (e0) bVar5.u.get());
                        mj8.n.D(k4Var3);
                        return k4Var3;
                    case 11:
                        return new e0((o0) bVar5.f196897r.get(), bVar5.e.b());
                    case 12:
                        ite.a aVar20 = bVar5.f196890h;
                        uq3.b bVar8 = bVar5.i;
                        gte.a aVarB3 = aVar20.b();
                        s.j(aVarB3);
                        jla.h hVarA3 = bVar5.f196891j.a();
                        xq3.j jVarG3 = bVar8.g();
                        s.j(jVarG3);
                        zq3.a aVar21 = (zq3.a) bVar8.U.get();
                        s.j(aVar21);
                        e0 e0Var2 = (e0) bVar5.u.get();
                        al4.j jVar2 = (al4.j) bVar5.z.get();
                        vie.h hVarA4 = bVar5.k.a();
                        s.j(hVarA4);
                        o0Var = new q4(aVarB3, hVarA3, jVarG3, aVar21, e0Var2, jVar2, hVarA4);
                        break;
                    case 13:
                        al4.p pVar2 = (al4.p) bVar5.f196901x.get();
                        mj8.n.a(pVar2);
                        return pVar2;
                    case 14:
                        ite.a aVar22 = bVar5.f196890h;
                        uq3.b bVar9 = bVar5.i;
                        gte.a aVarB4 = aVar22.b();
                        s.j(aVarB4);
                        xq3.j jVarG4 = bVar9.g();
                        s.j(jVarG4);
                        zq3.a aVar23 = (zq3.a) bVar9.U.get();
                        s.j(aVar23);
                        e0 e0Var3 = (e0) bVar5.u.get();
                        d4m.a aVarA3 = e4m.b.a(bVar5.z);
                        vie.h hVarA5 = bVar5.k.a();
                        s.j(hVarA5);
                        return new om4.g(aVarB4, jVarG4, aVar23, e0Var3, aVarA3, hVarA5);
                    case 15:
                        al4.q qVar2 = (al4.q) bVar5.f196902y.get();
                        wsg.n nVarB2 = bVar5.e.b();
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) bVar5.f196892l).c();
                        s.j(aVarC2);
                        return new m4(qVar2, nVarB2, aVarC2);
                    case 16:
                        ite.a aVar24 = bVar5.f196890h;
                        uq3.b bVar10 = bVar5.i;
                        gte.a aVarB5 = aVar24.b();
                        s.j(aVarB5);
                        xq3.w wVarL = bVar10.l();
                        s.j(wVarL);
                        al4.p pVar3 = (al4.p) bVar5.f196901x.get();
                        u uVar = (u) bVar5.A.get();
                        al4.c cVar5 = (al4.c) bVar5.B.get();
                        xq3.u uVarJ = bVar10.j();
                        s.j(uVarJ);
                        o0Var = new u0(aVarB5, wVarL, pVar3, uVar, cVar5, uVarJ, (cm4.h) bVar5.D.get());
                        break;
                    case 17:
                        return new vt4.g();
                    case 18:
                        gte.a aVarB6 = bVar5.f196890h.b();
                        s.j(aVarB6);
                        return new it4.b(aVarB6, (al4.p) bVar5.f196901x.get(), (al4.j) bVar5.z.get(), bVar5.f196893m.d(), (cm4.h) bVar5.D.get(), new pm4.b());
                    default:
                        throw new AssertionError(i2);
                }
                return o0Var;
            case 11:
                ln8.a aVar25 = (ln8.a) obj3;
                a31.a aVar26 = aVar25.f197116c;
                if (i2 == 0) {
                    return new mn8.u(aVar25.f197114a, aVar25.f197115b, aVar26, aVar25.d);
                }
                if (i2 == 1) {
                    return mj8.n.c(aVar25.e, aVar26, aVar25.f, aVar25.f197117g, aVar25.f197118h, aVar25.i, aVar25.f197119j, aVar25.k, aVar25.f197120l, aVar25.f197121m, aVar25.f197122n, aVar25.o, aVar25.f197123p, aVar25.f197124q, aVar25.z, aVar25.f197125r, aVar25.f197126s, aVar25.f197127t, aVar25.u, aVar25.v, aVar25.f197128w, aVar25.f197129x);
                }
                if (i2 == 2) {
                    return w1.C((mn8.u) aVar25.f197130y.get());
                }
                throw new AssertionError(i2);
            case 12:
                loj.a aVar27 = (loj.a) obj3;
                ite.a aVar28 = aVar27.d;
                ckg.a aVar29 = aVar27.f197457c;
                l70.e eVar3 = aVar27.f197456b;
                switch (i2) {
                    case 0:
                        return new qoj.a(aVar27.a());
                    case 1:
                        return new roj.a();
                    case 2:
                        q7l.b bVar11 = (q7l.b) aVar27.f.get();
                        toj.b bVarA2 = aVar27.a();
                        l80.e eVarH = eVar3.h();
                        s.j(eVarH);
                        return new ooj.c(bVar11, bVarA2, eVarH);
                    case 3:
                        toj.b bVarA3 = aVar27.a();
                        l80.e eVarH2 = eVar3.h();
                        s.j(eVarH2);
                        return new poj.a(bVarA3, eVarH2, aVar29.b());
                    case 4:
                        return new qoj.a(aVar29.b());
                    case 5:
                        return new soj.a(aVar27.a(), aVar29.b());
                    case 6:
                        gte.a aVarB7 = aVar28.b();
                        s.j(aVarB7);
                        bVar = new voj.b(aVarB7, aVar27.a());
                        break;
                    case 7:
                        gte.a aVarB8 = aVar28.b();
                        s.j(aVarB8);
                        toj.b bVarA4 = aVar27.a();
                        l80.e eVarH3 = eVar3.h();
                        s.j(eVarH3);
                        bVar = new uoj.d(aVarB8, bVarA4, new uoj.h(eVarH3));
                        break;
                    case 8:
                        return new moj.b(aVar27.e.e());
                    default:
                        throw new AssertionError(i2);
                }
                return bVar;
            case 13:
                lpf.a aVar30 = (lpf.a) obj3;
                g0 g0Var = aVar30.f198996a;
                if (i2 == 0) {
                    return q9.v(g0Var, (Retrofit) aVar30.f199005p.get());
                }
                if (i2 == 1) {
                    return q9.r(g0Var, ((nj0.d) aVar30.f198997b).f(), (kg.o) aVar30.o.get());
                }
                if (i2 == 2) {
                    return q9.q(g0Var);
                }
                if (i2 == 3) {
                    return lpf.f0.a();
                }
                throw new AssertionError(i2);
            case 14:
                lpf.w wVar = (lpf.w) obj3;
                a31.a aVar31 = wVar.e;
                a31.a aVar32 = wVar.f;
                if (i2 == 0) {
                    xVar = new lpf.x(wVar.f199094a, wVar.f199095b, wVar.f199096c, wVar.d, aVar31, aVar32, wVar.f199097g, wVar.f199098h, wVar.i, wVar.f199099j, wVar.k, wVar.f199100l, wVar.f199101m, 0);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return nga.c.b(wVar.A, wVar.B);
                        }
                        if (i2 == 3) {
                            return mp.g.b(aVar32, wVar.C, wVar.D, wVar.E);
                        }
                        throw new AssertionError(i2);
                    }
                    xVar = new ea2.s(wVar.f199102n, wVar.o, wVar.f199103p, wVar.f199104q, wVar.f199105r, wVar.f199106s, wVar.f199107t, wVar.u, aVar31, wVar.v, wVar.f199108w, wVar.f199109x, wVar.f199110y, wVar.z, aVar32, 1);
                }
                return xVar;
            case 15:
                lsb.a aVar33 = (lsb.a) obj3;
                l70.e eVar4 = aVar33.f199663c;
                fjf.a aVar34 = aVar33.f199662b;
                jhf.a aVar35 = aVar33.f199661a;
                djf.c cVar6 = aVar33.d;
                if (i2 == 0) {
                    com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) aVar35).c();
                    s.j(aVarC3);
                    nhf.a aVarA4 = aVar34.a();
                    s.j(aVarA4);
                    t70.g gVarO = eVar4.o();
                    s.j(gVarO);
                    return new t9l.g(aVarC3, aVarA4, gVarO);
                }
                if (i2 == 1) {
                    whf.n nVarB3 = cVar6.b();
                    s.j(nVarB3);
                    return new u9l.c(nVarB3);
                }
                if (i2 == 2) {
                    thf.d dVarD = cVar6.d();
                    s.j(dVarD);
                    return new u9l.a(dVarD);
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new AssertionError(i2);
                    }
                    com.revolut.domain.interactors.transactions.a aVarC4 = ((bjf.a) aVar35).c();
                    s.j(aVarC4);
                    bnf.f fVar3 = (bnf.f) cVar6.V.get();
                    s.j(fVar3);
                    return new ksb.c(aVarC4, fVar3);
                }
                com.revolut.domain.interactors.transactions.a aVarC5 = ((bjf.a) aVar35).c();
                s.j(aVarC5);
                nhf.a aVarA5 = aVar34.a();
                s.j(aVarA5);
                thf.g gVarE = cVar6.e();
                s.j(gVarE);
                l80.e eVarH4 = eVar4.h();
                s.j(eVarH4);
                return new ksb.g(aVarC5, aVarA5, gVarE, eVarH4);
            case 16:
                lsb.b bVar12 = (lsb.b) obj3;
                a31.a aVar36 = bVar12.d;
                a31.a aVar37 = bVar12.f199667b;
                a31.a aVar38 = bVar12.f199666a;
                if (i2 == 0) {
                    return new fh7.c(aVar38, aVar37, bVar12.f199668c, aVar36, 7);
                }
                if (i2 == 1) {
                    return s2l.c.a(aVar38, aVar37, aVar36);
                }
                throw new AssertionError(i2);
            case 17:
                m41.c cVar7 = (m41.c) obj3;
                jhf.a aVar39 = cVar7.f202621a;
                usg.a aVar40 = cVar7.f202622b;
                if (i2 == 0) {
                    com.revolut.domain.interactors.transactions.a aVarC6 = ((bjf.a) aVar39).c();
                    s.j(aVarC6);
                    x71.b bVar13 = (x71.b) ((bjf.a) aVar39).f15638w0.get();
                    s.j(bVar13);
                    return new j61.b(aVarC6, bVar13, aVar40.b(), cVar7.f202623c.a());
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return new w51.a();
                        }
                        throw new AssertionError(i2);
                    }
                    mt8.d dVarB2 = cVar7.k.b();
                    s.j(dVarB2);
                    return new m61.c(dVarB2, aVar40.b());
                }
                y71.c cVar8 = (y71.c) ((c21.b) cVar7.d).f20585w.get();
                s.j(cVar8);
                wsg.n nVarB4 = aVar40.b();
                xua.a aVarA6 = cVar7.f.a();
                s.j(aVarA6);
                fk3.b bVarB = cVar7.f202624g.b();
                s.j(bVarB);
                f7l.a aVarA7 = cVar7.f202625h.a();
                s.j(aVarA7);
                ppk.f fVarA = cVar7.i.a();
                mri.w wVarA = ((ozl.a) cVar7.f202626j).a();
                s.j(wVarA);
                return new k61.i(cVar8, nVarB4, aVarA6, bVarB, aVarA7, fVarA, wVarA);
            case 18:
                m49.a aVar41 = (m49.a) obj3;
                vbb.a aVar42 = aVar41.f202678a;
                if (i2 == 0) {
                    ImmutableSet immutableSetA = aVar42.a();
                    s.j(immutableSetA);
                    Comparator comparator = (Comparator) aVar42.f287462h0.get();
                    s.j(comparator);
                    return new k49.b(immutableSetA, comparator);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                i49.a aVar43 = (i49.a) aVar41.f202679b.get();
                ImmutableSet immutableSetA2 = aVar42.a();
                s.j(immutableSetA2);
                return new k49.m(aVar43, immutableSetA2);
            case 19:
                m4d.a aVar44 = (m4d.a) obj3;
                switch (i2) {
                    case 0:
                        SeparateFavouritesItemDatabase db8 = (SeparateFavouritesItemDatabase) aVar44.f202704j.get();
                        m4d.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db8, "db");
                        b4d.b bVarG = db8.g();
                        s.k(bVarG);
                        return bVarG;
                    case 1:
                        Context context = aVar44.f202699a;
                        yk0.a databaseSessionProvider2 = aVar44.f202700b.b();
                        s.j(databaseSessionProvider2);
                        de0.a databaseEncryptionMigratorFactory = ((cl0.a) aVar44.f202701c).a();
                        s.j(databaseEncryptionMigratorFactory);
                        m4d.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        SeparateFavouritesItemDatabase.Companion aVar45 = SeparateFavouritesItemDatabase.INSTANCE;
                        aVar45.getClass();
                        SeparateFavouritesItemDatabase separateFavouritesItemDatabase = (SeparateFavouritesItemDatabase) aVar45.a(context, databaseSessionProvider2, new Migration[]{l4d.a.f192100c, l4d.b.f192101c, l4d.c.f192102c, l4d.d.f192103c, l4d.e.f192104c}, databaseEncryptionMigratorFactory);
                        s.k(separateFavouritesItemDatabase);
                        return separateFavouritesItemDatabase;
                    case 2:
                        m4d.f fVar4 = aVar44.d;
                        UniversalAlertsService universalAlertsService = (UniversalAlertsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar44.f202706m.get(), "retrofit", UniversalAlertsService.class, "create(...)");
                        s.k(universalAlertsService);
                        return universalAlertsService;
                    case 3:
                        m4d.f fVar5 = aVar44.d;
                        Retrofit retrofitF2 = ((nj0.d) aVar44.e).f();
                        kg.o oVar2 = (kg.o) aVar44.f202705l.get();
                        return j6.a.B(p.a.x(retrofitF2, "retrofit", oVar2, "gson"), oVar2, "build(...)");
                    case 4:
                        m4d.f fVar6 = aVar44.d;
                        kg.o oVar3 = (kg.o) r4d.a.f251442a.getValue();
                        Intrinsics.checkNotNullExpressionValue(oVar3, "<get-instance>(...)");
                        s.k(oVar3);
                        return oVar3;
                    case 5:
                        return new ne0.d();
                    case 6:
                        je0.d mapper = aVar44.f.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider3 = aVar44.f202700b.b();
                        s.j(databaseSessionProvider3);
                        xe0.f storageFactory2 = aVar44.f.f();
                        s.j(storageFactory2);
                        m4d.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider3, "SHARED_ALERTS_STORAGE_FILE_NAME", mapper, 0, null, 56);
                    case 7:
                        l80.e eVarH5 = aVar44.f202702g.h();
                        s.j(eVarH5);
                        return new b4d.k(eVarH5);
                    case 8:
                        return m4d.e.j((SeparateFavouritesItemDatabase) aVar44.f202704j.get());
                    case 9:
                        je0.d dVarB3 = aVar44.f.b();
                        s.j(dVarB3);
                        yk0.a aVarB9 = aVar44.f202700b.b();
                        s.j(aVarB9);
                        xe0.f fVarF2 = aVar44.f.f();
                        s.j(fVarF2);
                        return m4d.e.s(dVarB3, fVarF2, aVarB9);
                    case 10:
                        return m4d.e.y(aVar44.d, (Retrofit) aVar44.f202706m.get());
                    case 11:
                        l80.e eVarH6 = aVar44.f202702g.h();
                        s.j(eVarH6);
                        return new n4d.r(eVarH6);
                    case 12:
                        l80.e eVarH7 = aVar44.f202702g.h();
                        s.j(eVarH7);
                        ne0.j jVar3 = (ne0.j) aVar44.o.get();
                        mk0.a aVarA8 = aVar44.i.a();
                        s.j(aVarA8);
                        WatchlistService watchlistService = (WatchlistService) aVar44.f202712t.get();
                        n4d.s sVar = (n4d.s) aVar44.v.get();
                        ue0.c cVar9 = (ue0.c) aVar44.f202713w.get();
                        ze0.a aVarA9 = aVar44.f.a();
                        s.j(aVarA9);
                        return new n4d.m(eVarH7, jVar3, aVarA8, watchlistService, sVar, cVar9, aVarA9);
                    case 13:
                        return m4d.e.x((SeparateFavouritesItemDatabase) aVar44.f202704j.get());
                    case 14:
                        je0.d dVarB4 = aVar44.f.b();
                        s.j(dVarB4);
                        yk0.a aVarB10 = aVar44.f202700b.b();
                        s.j(aVarB10);
                        xe0.f fVarF3 = aVar44.f.f();
                        s.j(fVarF3);
                        return m0.t(dVarB4, fVarF3, aVarB10);
                    case 15:
                        return m0.p((SeparateFavouritesItemDatabase) aVar44.f202704j.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 20:
                m53.e eVar5 = (m53.e) obj3;
                da3.j jVar4 = eVar5.f202792c;
                ee0.a aVar46 = eVar5.f202790a;
                switch (i2) {
                    case 0:
                        o53.b bVar14 = (o53.b) eVar5.i.get();
                        j6l.b bVarD = jVar4.e.d();
                        s.j(bVarD);
                        v6l.s sVarH = jVar4.h();
                        gte.a aVarB11 = eVar5.d.b();
                        s.j(aVarB11);
                        return new n53.b(bVar14, bVarD, sVarH, aVarB11, eVar5.e.c());
                    case 1:
                        return new o53.b((ne0.j) eVar5.f202794h.get(), (ue0.c) eVar5.f202793g.get());
                    case 2:
                        je0.d dVarB5 = aVar46.b();
                        s.j(dVarB5);
                        yk0.a aVarB12 = eVar5.f202791b.b();
                        s.j(aVarB12);
                        xe0.f fVarF4 = aVar46.f();
                        s.j(fVarF4);
                        return m4d.e.e(dVarB5, fVarF4, aVarB12);
                    case 3:
                        return new ne0.d();
                    case 4:
                        return new p96.a((o53.b) eVar5.i.get());
                    case 5:
                        return new p53.c(m53.d.a(eVar5.f));
                    case 6:
                        return new p53.a();
                    default:
                        throw new AssertionError(i2);
                }
            case 21:
                m9f.a aVar47 = (m9f.a) obj3;
                if (i2 == 0) {
                    return new a0(aVar47.f203766b, aVar47.f203767c, aVar47.d, aVar47.e, aVar47.f, aVar47.f203768g, aVar47.f203769h, aVar47.i, aVar47.f203770j, aVar47.k, aVar47.f203771l, aVar47.f203772m, aVar47.f203773n, aVar47.o, aVar47.f203774p, aVar47.f203775q, aVar47.f203776r, aVar47.f203777s, aVar47.f203765a);
                }
                if (i2 == 1) {
                    return m4d.e.D((a0) aVar47.f203781y.get());
                }
                throw new AssertionError(i2);
            case 22:
                return a();
            case 23:
                mbk.a aVar48 = (mbk.a) obj3;
                a31.a aVar49 = aVar48.k;
                a31.a aVar50 = aVar48.f204231h;
                a31.a aVar51 = aVar48.e;
                a31.a aVar52 = aVar48.f204229c;
                q qVar3 = aVar48.f204227a;
                if (i2 == 0) {
                    return new obk.b(aVar48.f204228b, aVar52, aVar48.d, aVar51, aVar48.f, aVar48.f204230g, aVar50, aVar48.i, aVar48.f204232j, aVar49, qVar3);
                }
                if (i2 == 1) {
                    return p7h.b.h(aVar48.f204233l, aVar52, aVar51, aVar50, aVar49, aVar48.f204234m, aVar48.f204235n, aVar48.o, aVar48.f204236p, aVar48.f204237q, qVar3, aVar48.f204239s);
                }
                if (i2 == 2) {
                    return m4d.e.C((obk.b) aVar48.f204238r.get());
                }
                throw new AssertionError(i2);
            case 24:
                return b();
            case 25:
                return c();
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                return f();
            default:
                ms1.v vVar = (ms1.v) obj3;
                a31.a aVar53 = vVar.f208605c;
                a31.a aVar54 = vVar.f208604b;
                q qVar4 = vVar.f208603a;
                if (i2 == 0) {
                    aVar = new ms1.a(aVar54, qVar4);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return ms1.g.w((ms1.a) vVar.B.get());
                        }
                        if (i2 == 3) {
                            return new ms1.d(qVar4, vVar.d, vVar.e, vVar.f, aVar54, vVar.f208606g, vVar.f208607h, aVar53, vVar.i, vVar.C, vVar.f208608j, vVar.k, vVar.f208609l, vVar.f208610m, vVar.f208611n, vVar.o, vVar.f208612p, vVar.f208613q, vVar.f208614r, vVar.f208615s, vVar.f208616t, vVar.u, vVar.v, vVar.f208617w, vVar.f208618x, vVar.f208619y, vVar.z, vVar.A);
                        }
                        throw new AssertionError(i2);
                    }
                    aVar = new c89.c(qVar4, aVar53, vVar.C);
                }
                return aVar;
        }
    }
}
