package pl1;

import android.content.Context;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableSet;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.biometric_verification.impl.ui.step.document.liveness_intro.BiometricVerificationDocumentLivenessIntroScreenContract$InputData;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.aani.impl.data.network.AaniQrCodeService;
import com.revolut.feature.globalsearch.sources.suggestion.data.ProductSuggestionsService;
import com.revolut.retail.feature.stockdetails.impl.data.database.StockDetailsDatabase;
import com.revolut.retail.feature.stockdetails.impl.data.network.AssetDataPointsService;
import com.revolut.retail.feature.stockdetails.impl.data.network.StockFinancialsService;
import com.revolut.retail.feature.stockdetails.impl.data.network.StockInsightsService;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreenContract$Input;
import d3i.z;
import dqj.r;
import et6.h3;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import lo5.p;
import ppd.b1;
import ppd.v0;
import ppd.x0;
import pr.b0;
import q97.a0;
import q97.a2;
import q97.c0;
import q97.c1;
import q97.d2;
import q97.e1;
import q97.e3;
import q97.f1;
import q97.f2;
import q97.g0;
import q97.h1;
import q97.i0;
import q97.i2;
import q97.j1;
import q97.j3;
import q97.k1;
import q97.k2;
import q97.l3;
import q97.m1;
import q97.m2;
import q97.m3;
import q97.n0;
import q97.n1;
import q97.o0;
import q97.o1;
import q97.o3;
import q97.p0;
import q97.q0;
import q97.r0;
import q97.s0;
import q97.s1;
import q97.s2;
import q97.t0;
import q97.t1;
import q97.u1;
import q97.v;
import q97.v1;
import q97.w0;
import q97.x;
import q97.x2;
import q97.y;
import q97.y1;
import q97.z0;
import qgk.k3;
import retrofit2.Retrofit;
import rp0.g1;
import us6.q;
import vc.s;
import xf6.t;
import xq3.u;
import y45.o;
import yo5.w;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f237248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f237249c;

    public /* synthetic */ h(Object obj2, int i, int i2) {
        this.f237247a = i2;
        this.f237249c = obj2;
        this.f237248b = i;
    }

    private final Object a() {
        pp.a aVar = (pp.a) this.f237249c;
        ite.a aVar2 = aVar.i;
        h9h.a aVar3 = aVar.Y;
        int i = this.f237248b;
        switch (i) {
            case 0:
                t97.c productCellProvider = new t97.c();
                q qVar = aVar.Z;
                oda.d dVar = aVar.f238090q;
                usg.a aVar4 = aVar.o;
                bw9.a aVar5 = aVar.f238080l;
                h3 interactor = (h3) qVar.f282677e1.get();
                s.j(interactor);
                yha.a aVar6 = (yha.a) aVar.f238059a0;
                sha.c factory = aVar6.a();
                s.j(factory);
                s97.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                Intrinsics.checkNotNullParameter(interactor, "interactor");
                Intrinsics.checkNotNullParameter(factory, "factory");
                f2 f2Var = new f2(productCellProvider, interactor, factory, t97.d.PRO_CARD_READER, cs6.c.CARD_READER);
                t97.c productCellProvider2 = new t97.c();
                h3 interactor2 = (h3) qVar.f282677e1.get();
                s.j(interactor2);
                sha.c factory2 = aVar6.a();
                s.j(factory2);
                Intrinsics.checkNotNullParameter(productCellProvider2, "productCellProvider");
                Intrinsics.checkNotNullParameter(interactor2, "interactor");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                f2 f2Var2 = new f2(productCellProvider2, interactor2, factory2, t97.d.PRO_INVOICES, cs6.c.INVOICE);
                t97.c productCellProvider3 = new t97.c();
                h3 interactor3 = (h3) qVar.f282677e1.get();
                s.j(interactor3);
                sha.c factory3 = aVar6.a();
                s.j(factory3);
                Intrinsics.checkNotNullParameter(productCellProvider3, "productCellProvider");
                Intrinsics.checkNotNullParameter(interactor3, "interactor");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                f2 f2Var3 = new f2(productCellProvider3, interactor3, factory3, t97.d.PRO_PAYMENT_LINKS, cs6.c.PAYMENT_LINK);
                q97.a aVar7 = new q97.a(new t97.c(), 0);
                q97.f fVar = new q97.f(new t97.c());
                t97.c cVar = new t97.c();
                gte.a aVarB = aVar2.b();
                s.j(aVarB);
                q97.e eVar = new q97.e(cVar, aVarB);
                q97.g gVar = new q97.g(new t97.c());
                t97.c cVar2 = new t97.c();
                pzi.a aVar8 = (pzi.a) aVar.f238061b0.B.get();
                s.j(aVar8);
                v vVar = new v(cVar2, aVar8);
                t97.c cVar3 = new t97.c();
                gte.a aVarB2 = aVar2.b();
                s.j(aVarB2);
                f1 f1Var = new f1(cVar3, aVarB2);
                t97.c cVar4 = new t97.c();
                t tVar = (t) aVar.c0;
                oe6.m mVarF = tVar.f();
                s.j(mVarF);
                u1 u1Var = new u1(cVar4, mVarF);
                t97.c cVar5 = new t97.c();
                efk.a aVar9 = aVar.f238065d0;
                ffk.t tVarF = aVar9.f();
                s.j(tVarF);
                g0 g0Var = new g0(cVar5, tVarF, aVar.f238067e0.h(), ((k3) aVar.f0).b());
                q97.a aVar10 = new q97.a(new t97.c(), 3);
                j0j.a aVarH = ((r) aVar.g0).h();
                s.j(aVarH);
                m3 m3Var = new m3(aVarH, new t97.c());
                t97.c cVar6 = new t97.c();
                wzi.a aVarA = ((ctj.b) aVar.f238073h0).a();
                s.j(aVarA);
                r0 r0Var = new r0(cVar6, aVarA);
                q97.a aVar11 = new q97.a(new t97.c(), 4);
                t97.c cVar7 = new t97.c();
                p9g.g gVarA = aVar.i0.a();
                a61.a aVarB3 = aVar.j0.b();
                tvi.a aVar12 = (tvi.a) aVar.f238078k0.f109793d0.get();
                s.j(aVar12);
                cti.a aVar13 = (cti.a) aVar.l0.i.get();
                s.j(aVar13);
                puf.a aVar14 = (puf.a) ((hvf.b) aVar.m0).u.get();
                s.j(aVar14);
                f39.c cVarA = aVar.f238084n0.a();
                s.j(cVarA);
                e1 e1Var = new e1(cVar7, gVarA, aVarB3, aVar12, aVar13, aVar14, cVarA);
                b6b.h hVar = aVar.f238086o0;
                q5b.c cVarC = hVar.c();
                s.j(cVarC);
                s5b.a aVar15 = (s5b.a) hVar.R.get();
                s.j(aVar15);
                y yVar = new y(cVarC, aVar15);
                t97.c cVar8 = new t97.c();
                wwa.b bVarA = aVar.p0.a();
                s.j(bVarA);
                i2 i2Var = new i2(cVar8, bVarA);
                t97.c cVar9 = new t97.c();
                g6e.d dVarB = aVar.q0.b();
                s.j(dVarB);
                g6e.g gVarA2 = aVar.f238060b.a();
                s.j(gVarA2);
                e48.a aVar16 = aVar.d;
                j3 j3Var = new j3(cVar9, dVarB, gVarA2, aVar16.c());
                t97.c cVar10 = new t97.c();
                slb.a aVarA2 = aVar.f238092r0.a();
                g48.r0 r0VarC = aVar16.c();
                elb.b bVarE = ((blb.e) aVar.f238072h).e();
                mjb.a aVarA3 = ((anb.n) aVar.f238095s0).a();
                s.j(aVarA3);
                m1 m1Var = new m1(cVar10, aVarA2, r0VarC, bVarE, aVarA3);
                q97.e eVar2 = new q97.e(new t97.c(), aVar.f238098t0.a());
                q97.a aVar17 = new q97.a(new t97.c(), 2);
                t97.c cVar11 = new t97.c();
                cha.c cVarJ = aVar9.j();
                s.j(cVarJ);
                gte.a aVarB4 = aVar2.b();
                s.j(aVarB4);
                q97.h3 h3Var = new q97.h3(cVar11, cVarJ, aVarB4);
                t97.c cVar12 = new t97.c();
                v67.b bVarA2 = aVar.u0.a();
                s.j(bVarA2);
                t59.a aVar18 = (t59.a) aVar.f238101v0.d.get();
                s.j(aVar18);
                o0 o0Var = new o0(cVar12, bVarA2, aVar18);
                t97.c cVar13 = new t97.c();
                com.revolut.feature.external_accounts.api.navigation.a aVarB5 = tVar.b();
                s.j(aVarB5);
                h1 h1Var = new h1(cVar13, aVarB5, aVar.f238097t.a());
                t97.c cVar14 = new t97.c();
                g48.r0 r0VarC2 = aVar16.c();
                xmg.a aVar19 = aVar.f238088p;
                l61.a aVarB6 = aVar19.b();
                s.j(aVarB6);
                g0 g0Var2 = new g0(cVar14, r0VarC2, aVarB6, aVar19.e());
                z0 z0Var = new z0(new t97.c(), aVar.F.f());
                c1 c1Var = new c1(new t97.c(), aVar.f238104w0.a());
                t97.c cVar15 = new t97.c();
                p pVarB = ((w) aVar.f238106x0).b();
                s.j(pVarB);
                bpj.a aVar20 = aVar.f238076j;
                xoj.a aVarA4 = aVar20.a();
                s.j(aVarA4);
                ei5.d dVar2 = aVar.y0;
                xh5.a aVarA5 = dVar2.a();
                s.j(aVarA5);
                ai5.b bVarB = dVar2.b();
                s.j(bVarB);
                l93.f fVarJ = aVar.S.j();
                s.j(fVarJ);
                o5c.a aVar21 = (o5c.a) aVar.z0.f202894q.get();
                s.j(aVar21);
                ld5.b bVarB2 = aVar.A0.b();
                s.j(bVarB2);
                gte.a aVarB7 = aVar2.b();
                s.j(aVarB7);
                sd5.c cVarA2 = aVar.B0.a();
                s.j(cVarA2);
                n0 n0Var = new n0(cVar15, pVarB, aVarA4, aVarA5, bVarB, fVarJ, aVar21, bVarB2, aVarB7, cVarA2);
                t97.c cVar16 = new t97.c();
                jm4.r rVar = aVar.H;
                al4.l lVarH = rVar.h();
                al4.q qVarA = rVar.a();
                dw3.c1 c1Var2 = (dw3.c1) aVar.C0;
                g0 g0Var3 = new g0(cVar16, lVarH, qVarA, c1Var2.h());
                t97.c cVar17 = new t97.c();
                js7.d dVar3 = (js7.d) aVar.D0.f18434q.get();
                s.j(dVar3);
                uq3.b bVar = aVar.E0;
                u uVarJ = bVar.j();
                s.j(uVarJ);
                c0 c0Var = new c0(cVar17, dVar3, uVarJ, c1Var2.h());
                t97.c cVar18 = new t97.c();
                u45.h hVar2 = aVar.I;
                l35.a aVarK = hVar2.k();
                u uVarJ2 = bVar.j();
                s.j(uVarJ2);
                c0 c0Var2 = new c0(cVar18, aVarK, uVarJ2, c1Var2.h());
                t97.c cVar19 = new t97.c();
                xq3.w wVarL = bVar.l();
                s.j(wVarL);
                i0 i0Var = new i0(cVar19, wVarL, aVar.F0.a());
                t97.c cVar20 = new t97.c();
                al4.d dVarO = rVar.o();
                s.j(dVarO);
                q97.d dVar4 = new q97.d(cVar20, dVarO, c1Var2.h());
                t97.c cVar21 = new t97.c();
                y45.h hVarG = hVar2.g();
                u uVarJ3 = bVar.j();
                s.j(uVarJ3);
                xq3.w wVarL2 = bVar.l();
                s.j(wVarL2);
                j1 j1Var = new j1(cVar21, hVarG, uVarJ3, wVarL2, c1Var2.h(), 0);
                t97.c cVar22 = new t97.c();
                y45.h hVarG2 = hVar2.g();
                u uVarJ4 = bVar.j();
                s.j(uVarJ4);
                xq3.w wVarL3 = bVar.l();
                s.j(wVarL3);
                j1 j1Var2 = new j1(cVar22, hVarG2, uVarJ4, wVarL3, c1Var2.h(), 1);
                t97.c cVar23 = new t97.c();
                y45.n nVarE = hVar2.e();
                u uVarJ5 = bVar.j();
                s.j(uVarJ5);
                c0 c0Var3 = new c0(cVar23, nVarE, uVarJ5, c1Var2.h());
                t97.c cVar24 = new t97.c();
                o oVarJ = hVar2.j();
                u uVarJ6 = bVar.j();
                s.j(uVarJ6);
                m1 m1Var2 = new m1(cVar24, oVarJ, uVarJ6, aVar19.e(), c1Var2.h());
                o1 o1Var = new o1(new t97.c());
                t97.c cVar25 = new t97.c();
                gte.a aVarB8 = aVar2.b();
                s.j(aVarB8);
                a0 a0Var = new a0(cVar25, aVarB8);
                t97.c cVar26 = new t97.c();
                k95.a aVar22 = aVar.G0;
                o95.g gVarC = aVar22.c();
                s.j(gVarC);
                u uVarJ7 = bVar.j();
                s.j(uVarJ7);
                h95.a aVarB9 = aVar22.b();
                s.j(aVarB9);
                c0 c0Var4 = new c0(cVar26, gVarC, uVarJ7, aVarB9);
                t97.c cVar27 = new t97.c();
                lz1.m mVar = (lz1.m) aVar.H0;
                uw1.e eVarJ = mVar.j();
                s.j(eVarJ);
                q97.l lVar = new q97.l(cVar27, eVarJ, aVar.I0.b());
                t97.c cVar28 = new t97.c();
                uw1.c cVarD = mVar.d();
                s.j(cVarD);
                q97.m mVar2 = new q97.m(cVar28, cVarD);
                t97.c cVar29 = new t97.c();
                zj2.a aVar23 = new zj2.a();
                ila.b bVar2 = aVar.G;
                q97.n nVar = new q97.n(cVar29, aVar23, bVar2.a());
                q97.a aVar24 = new q97.a(new t97.c(), bVar2.a());
                t97.c cVar30 = new t97.c();
                oi9.f fVar2 = aVar.V;
                ti9.h hVarB = fVar2.b();
                u uVarJ8 = bVar.j();
                s.j(uVarJ8);
                xh9.a aVarE = fVar2.e();
                s.j(aVarE);
                s1 s1Var = new s1(cVar30, hVarB, uVarJ8, aVarE, c1Var2.h());
                t97.c cVar31 = new t97.c();
                ws6.a aVar25 = aVar.J0;
                gr6.e eVarA = aVar25.a();
                s.j(eVarA);
                sha.c cVarA3 = aVar6.a();
                s.j(cVarA3);
                y1 y1Var = new y1(cVar31, eVarA, cVarA3, 0);
                t97.c cVar32 = new t97.c();
                gr6.e eVarA2 = aVar25.a();
                s.j(eVarA2);
                r10.v vVarG = qVar.g();
                sha.c cVarA4 = aVar6.a();
                s.j(cVarA4);
                a2 a2Var = new a2(cVar32, eVarA2, vVarG, cVarA4);
                t97.c cVar33 = new t97.c();
                gr6.e eVarA3 = aVar25.a();
                s.j(eVarA3);
                gr6.h hVarK = qVar.k();
                s.j(hVarK);
                sha.c cVarA5 = aVar6.a();
                s.j(cVarA5);
                d2 d2Var = new d2(cVar33, eVarA3, hVarK, cVarA5);
                t97.c cVar34 = new t97.c();
                gr6.e eVarA4 = aVar25.a();
                s.j(eVarA4);
                sha.c cVarA6 = aVar6.a();
                s.j(cVarA6);
                y1 y1Var2 = new y1(cVar34, eVarA4, cVarA6, 1);
                t97.c cVar35 = new t97.c();
                mkh.s sVar = (mkh.s) aVar.D;
                oih.j jVarE = sVar.e();
                s.j(jVarE);
                xoj.a aVarA6 = aVar20.a();
                s.j(aVarA6);
                zdl.f fVar3 = aVar.K0;
                ybl.i iVarB = fVar3.b();
                s.j(iVarB);
                s2 s2Var = new s2(cVar35, jVarE, aVarA6, iVarB, aVar3.f());
                t97.c cVar36 = new t97.c();
                oih.j jVarE2 = sVar.e();
                s.j(jVarE2);
                xoj.a aVarA7 = aVar20.a();
                s.j(aVarA7);
                tzg.m mVarT = aVar3.t();
                s.j(mVarT);
                w0 w0Var = new w0(cVar36, jVarE2, aVarA7, mVarT, aVar3.f());
                t97.c cVar37 = new t97.c();
                oih.j jVarE3 = sVar.e();
                s.j(jVarE3);
                ybl.i iVarB2 = fVar3.b();
                s.j(iVarB2);
                q97.s sVar2 = new q97.s(cVar37, jVarE3, iVarB2);
                t97.c cVar38 = new t97.c();
                oih.g gVar2 = (oih.g) sVar.z0.get();
                s.j(gVar2);
                xoj.a aVarA8 = aVar20.a();
                s.j(aVarA8);
                q97.n nVar2 = new q97.n(cVar38, gVar2, aVarA8);
                t97.c cVar39 = new t97.c();
                oih.i iVar = (oih.i) sVar.A0.get();
                s.j(iVar);
                xoj.a aVarA9 = aVar20.a();
                s.j(aVarA9);
                gte.a aVarB10 = aVar2.b();
                s.j(aVarB10);
                m2 m2Var = new m2(cVar39, iVar, aVarA9, aVarB10);
                t97.c cVar40 = new t97.c();
                ubf.d dVar5 = aVar.L0;
                kbf.a aVar26 = (kbf.a) dVar5.E.get();
                s.j(aVar26);
                q97.e eVar3 = new q97.e(cVar40, aVar26);
                t97.c cVar41 = new t97.c();
                xoj.a aVarA10 = aVar20.a();
                s.j(aVarA10);
                ybl.l lVarF = aVar3.f();
                tzg.m mVarT2 = aVar3.t();
                s.j(mVarT2);
                kpj.f fVar4 = new kpj.f(aVar3.H());
                ybl.k kVarD = sVar.f.d();
                s.j(kVarD);
                a2b.b bVarF = sVar.E.f();
                s.j(bVarF);
                kbb.r rVarA = sVar.B.a();
                s.j(rVarA);
                x xVar = new x(cVar41, aVarA10, lVarF, mVarT2, fVar4, new llh.a(kVarD, bVarF, rVarA));
                t97.c cVar42 = new t97.c();
                xoj.a aVarA11 = aVar20.a();
                s.j(aVarA11);
                tzg.m mVarT3 = aVar3.t();
                s.j(mVarT3);
                oih.k kVar = (oih.k) sVar.R0.get();
                s.j(kVar);
                x2 x2Var = new x2(cVar42, aVarA11, mVarT3, kVar, aVar3.f(), new kpj.f(aVar3.H()));
                t97.c cVar43 = new t97.c();
                tzg.m mVarT4 = aVar3.t();
                s.j(mVarT4);
                oih.k kVar2 = (oih.k) sVar.R0.get();
                s.j(kVar2);
                jla.h hVarA = bVar2.a();
                xoj.a aVarA12 = aVar20.a();
                s.j(aVarA12);
                e3 e3Var = new e3(cVar43, mVarT4, kVar2, hVarA, aVarA12);
                t97.c cVar44 = new t97.c();
                tzg.m mVarT5 = aVar3.t();
                s.j(mVarT5);
                l3 l3Var = new l3(cVar44, mVarT5);
                t97.c cVar45 = new t97.c();
                kbf.a aVar27 = (kbf.a) dVar5.E.get();
                s.j(aVar27);
                o3 o3Var = new o3(cVar45, aVar27, new kpj.f((hwg.a) ((ewg.h) aVar.M0).l0.get()), aVar3.f());
                t97.c cVar46 = new t97.c();
                rl7.e eVar4 = (rl7.e) aVar.N0.f247254l.get();
                s.j(eVar4);
                s0 s0Var = new s0(cVar46, eVar4);
                t97.c cVar47 = new t97.c();
                obk.a aVar28 = aVar.O0;
                tbk.b bVar3 = (tbk.b) aVar28.v.get();
                s.j(bVar3);
                lbk.a aVar29 = (lbk.a) aVar28.B.get();
                s.j(aVar29);
                q97.n nVar3 = new q97.n(cVar47, bVar3, aVar29);
                t97.c cVar48 = new t97.c();
                oej.a aVarA13 = aVar.P0.a();
                s.j(aVarA13);
                afj.b bVar4 = aVar.Q;
                fej.b bVarM = bVar4.m();
                s.j(bVarM);
                cej.a aVarL = bVar4.l();
                s.j(aVarL);
                fej.e eVar5 = (fej.e) bVar4.I.get();
                s.j(eVar5);
                p0 p0Var = new p0(cVar48, aVarA13, bVarM, aVarL, eVar5);
                t97.c cVar49 = new t97.c();
                on2.b bVarA3 = aVar.Q0.a();
                s.j(bVarA3);
                k1 k1Var = new k1(cVar49, bVarA3);
                t97.c cVar50 = new t97.c();
                fp1.f fVarC = ((up1.e) aVar.R0).c();
                s.j(fVarC);
                q97.i iVar2 = new q97.i(cVar50, fVarC);
                t97.c cVar51 = new t97.c();
                er1.b bVarA4 = ((ir1.b) aVar.S0).a();
                s.j(bVarA4);
                v1 v1Var = new v1(cVar51, bVarA4);
                t97.c cVar52 = new t97.c();
                tzg.m mVarT6 = aVar3.t();
                s.j(mVarT6);
                q97.e eVar6 = new q97.e(cVar52, mVarT6);
                t97.c cVar53 = new t97.c();
                t0 t0VarE = aVar.e();
                gte.a aVarB11 = aVar3.f150284x.b();
                s.j(aVarB11);
                q97.n nVar4 = new q97.n(cVar53, t0VarE, new g9h.b(aVarB11));
                q97.n nVar5 = new q97.n(new t97.c(), aVar.e(), aVar3.I());
                q97.e eVar7 = new q97.e(new t97.c(), aVar.e());
                n1 n1Var = new n1(new t97.c());
                q97.e eVar8 = new q97.e(new t97.c(), aVar5.a());
                t1 t1Var = new t1(new t97.c(), aVar5.a());
                t97.c cVar54 = new t97.c();
                vfg.g gVar3 = (vfg.g) aVar.T0.f279774c.get();
                s.j(gVar3);
                q97.e eVar9 = new q97.e(cVar54, gVar3);
                q97.k3 k3Var = new q97.k3(new t97.c());
                t97.c cVar55 = new t97.c();
                vpc.a aVar30 = (vpc.a) aVar.U0.C.get();
                s.j(aVar30);
                c0 c0Var5 = new c0(cVar55, aVar30, aVar4.a(), dVar.b());
                k2 k2Var = new k2(new t97.c(), aVar4.a(), dVar.b());
                q0 q0Var = new q0(new t97.c(), aVar.V0.a());
                u97.a aVar31 = new u97.a(new t97.c());
                t97.c cVar56 = new t97.c();
                gte.a aVarB12 = aVar2.b();
                s.j(aVarB12);
                q97.n nVar6 = new q97.n(cVar56, aVarB12, aVar.W0.a());
                q97.a aVar32 = new q97.a(new t97.c(), 5);
                t97.c cVar57 = new t97.c();
                gte.a aVarB13 = aVar2.b();
                s.j(aVarB13);
                u97.b bVar5 = new u97.b(cVar57, aVarB13);
                t97.c cVar58 = new t97.c();
                u79.a aVar33 = (u79.a) ((s79.b) ((t8l.a) aVar.X0).f268903a).f260594g.get();
                s.j(aVar33);
                gte.a aVarB14 = aVar2.b();
                s.j(aVarB14);
                c0 c0Var6 = new c0(cVar58, aVar33, aVarB14, aVar.Y0.i());
                t97.c cVar59 = new t97.c();
                gte.a aVarB15 = aVar2.b();
                s.j(aVarB15);
                u97.g gVar4 = new u97.g(cVar59, aVarB15);
                q97.a aVar34 = new q97.a(new t97.c(), 6);
                t97.c cVar60 = new t97.c();
                mre.c cVarB = aVar.Z0.b();
                s.j(cVarB);
                return new t97.b(ImmutableSet.of((q97.e) f2Var, (q97.e) f2Var2, (q97.e) f2Var3, (q97.e) aVar7, (q97.e) fVar, eVar, (q97.e[]) new p97.c[]{gVar, vVar, f1Var, u1Var, g0Var, aVar10, m3Var, r0Var, aVar11, e1Var, yVar, i2Var, j3Var, m1Var, eVar2, aVar17, h3Var, o0Var, h1Var, g0Var2, z0Var, c1Var, n0Var, g0Var3, c0Var, c0Var2, i0Var, dVar4, j1Var, j1Var2, c0Var3, m1Var2, o1Var, a0Var, c0Var4, lVar, mVar2, nVar, aVar24, s1Var, y1Var, a2Var, d2Var, y1Var2, s2Var, w0Var, sVar2, nVar2, m2Var, eVar3, xVar, x2Var, e3Var, l3Var, o3Var, s0Var, nVar3, p0Var, k1Var, iVar2, v1Var, eVar6, nVar4, nVar5, eVar7, n1Var, eVar8, t1Var, eVar9, k3Var, c0Var5, k2Var, q0Var, aVar31, nVar6, aVar32, bVar5, c0Var6, gVar4, aVar34, new u97.i(cVar60, cVarB), new u97.j(new t97.c()), new q97.a(new t97.c(), 7), new q97.e(new t97.c(), aVar.a1.b()), new u97.l(new t97.c(), aVar.f238062b1.c())}), ImmutableSet.of());
            case 1:
                Retrofit retrofit = ((nj0.d) aVar.f238068e1).f();
                ca7.a aVar35 = ca7.b.Companion;
                aVar35.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(ProductSuggestionsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                ProductSuggestionsService productSuggestionsService = (ProductSuggestionsService) objCreate;
                s.k(productSuggestionsService);
                aVar35.getClass();
                ne0.d dVar6 = new ne0.d();
                ee0.a aVar36 = aVar.f238069f1;
                je0.d mapper = aVar36.b();
                s.j(mapper);
                xe0.f storageFactory = aVar36.f();
                s.j(storageFactory);
                yk0.a dbSessionProvider = aVar.f238071g1.b();
                s.j(dbSessionProvider);
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
                xe0.e eVarF = xe0.f.f(storageFactory, dbSessionProvider, "product_suggestions_storage", mapper, 1, null, 48);
                e97.b globalSearchContextParser = new e97.b();
                t97.e productIdParser = new t97.e();
                Intrinsics.checkNotNullParameter(globalSearchContextParser, "globalSearchContextParser");
                Intrinsics.checkNotNullParameter(productIdParser, "productIdParser");
                return new fa7.e(productSuggestionsService, dVar6, eVarF, new dcl.q(), new p97.d());
            case 2:
                return new v97.e(new v97.a(aVar.e.g()), (t97.b) aVar.C1.get());
            case 3:
                f1i.c api2 = aVar.f238099t1;
                Intrinsics.checkNotNullParameter(api2, "api");
                f1i.a aVar37 = (f1i.a) api2;
                ite.a aVar38 = aVar37.f131276h;
                o7.b bVarA5 = aVar37.f131272a.a();
                f61.a aVarB16 = ((n51.a) aVar37.f131273b).b();
                ppk.f fVarA = aVar37.f131274c.a();
                wsg.n nVarB = aVar37.d.b();
                v0i.b bVar6 = aVar37.e;
                x0i.f fVarD = bVar6.d();
                s99.i iVarB3 = ((s99.a) aVar37.f).b();
                l70.e eVar10 = aVar37.f131275g;
                i90.b bVar7 = new i90.b();
                gte.a aVarB17 = aVar38.b();
                s.j(aVarB17);
                a5h.g gVar5 = new a5h.g(nVarB, fVarD, iVarB3, bVar7, new g1i.o0(aVarB17));
                j4i.a aVar39 = aVar37.i;
                l4i.a aVar40 = new l4i.a();
                w80.b bVarJ = eVar10.j();
                s.j(bVarJ);
                x0i.f fVarD2 = bVar6.d();
                w80.b bVarJ2 = eVar10.j();
                s.j(bVarJ2);
                l4i.a aVar41 = new l4i.a();
                gte.a aVarB18 = aVar38.b();
                s.j(aVarB18);
                z zVar = new z(new q1i.b(bVarJ2, aVar41, aVarB18, new u80.o(), AccountId.Personal.f51414a), aVar37.f131277j.a());
                gte.a aVarB19 = aVar38.b();
                s.j(aVarB19);
                g1i.o0 o0Var2 = new g1i.o0(aVarB19);
                kl.t1 t1VarC = aVar39.c();
                gte.a aVarB20 = aVar38.b();
                s.j(aVarB20);
                return new d3i.n(bVarA5, aVarB16, fVarA, gVar5, aVar40, bVarJ, fVarD2, zVar, o0Var2, t1VarC, aVarB20);
            case 4:
                n5a.h api3 = aVar.f238100u1;
                Intrinsics.checkNotNullParameter(api3, "api");
                o5a.a aVar42 = (o5a.a) api3;
                l70.e eVar11 = aVar42.f222388a;
                w80.b bVarJ3 = eVar11.j();
                s.j(bVarJ3);
                b3j.p pVar = (b3j.p) aVar42.f222389b;
                m3j.j jVarD = b3j.p.d();
                m3j.n nVarI = pVar.i();
                jqa.p pVar2 = (jqa.p) aVar42.f222390c;
                aqa.c cVarC2 = pVar2.c();
                s.j(cVarC2);
                aqa.a aVarA14 = pVar2.a();
                s.j(aVarA14);
                jk3.c cVar61 = aVar42.d;
                fk3.a aVarA15 = cVar61.a();
                s.j(aVarA15);
                usg.a aVar43 = aVar42.e;
                wsg.n nVarB2 = aVar43.b();
                vl3.n nVar7 = aVar42.f;
                dl3.f fVarC2 = nVar7.c();
                s.j(fVarC2);
                p5a.c cVar62 = new p5a.c(jVarD, nVarI, cVarC2, aVarA14, aVarA15, nVarB2, fVarC2);
                zu8.c0 c0Var7 = aVar42.f222391g;
                cu8.r0 r0VarA = c0Var7.a();
                ox9.a aVar44 = aVar42.f222392h;
                fx9.a aVarA16 = aVar44.a();
                s.j(aVarA16);
                x2k.e eVar12 = new x2k.e();
                y8k.b bVarA6 = aVar42.i.a();
                rq9.a aVarA17 = aVar42.f222393j.a();
                s.j(aVarA17);
                oy1.b bVarB3 = aVar42.k.b();
                un9.a aVarD = aVar42.f222394l.d();
                s.j(aVarD);
                p38.a aVarA18 = aVar42.f222395m.a();
                s.j(aVarA18);
                p pVarB2 = ((w) aVar42.f222396n).b();
                s.j(pVarB2);
                h3a.l lVar2 = new h3a.l(r0VarA, aVarA16, eVar12, bVarA6, aVarA17, bVarB3, aVarD, aVarA18, pVarB2);
                fk3.a aVarA19 = cVar61.a();
                s.j(aVarA19);
                cu8.r0 r0VarA2 = c0Var7.a();
                lpf.a aVar45 = aVar42.o;
                opf.z zVarD = aVar45.d();
                wsg.n nVarB3 = aVar43.b();
                jqa.r rVar2 = aVar42.f222397p;
                jid.z zVarA = rVar2.a();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) rVar2.d).c();
                s.j(aVarC);
                osa.f fVar5 = new osa.f(zVarA, aVarC, rVar2.e.a());
                opf.c0 c0Var8 = new opf.c0();
                vo9.a aVarB21 = ((ut9.a) rVar2.f).b();
                s.j(aVarB21);
                jid.z zVarA2 = rVar2.a();
                u5k.d dVar7 = new u5k.d(rVar2.f177669g.a());
                wsg.n nVarB4 = rVar2.f177670h.b();
                l1l.a aVar46 = new l1l.a();
                l1l.d dVar8 = new l1l.d();
                ite.a aVar47 = rVar2.i;
                gte.a aVarB22 = aVar47.b();
                s.j(aVarB22);
                l1l.s sVar3 = new l1l.s(aVarB22);
                l1l.q qVar2 = new l1l.q();
                l1l.k kVar3 = new l1l.k();
                urf.f fVar6 = new urf.f();
                wsa.c cVar63 = new wsa.c();
                gte.a aVarB23 = aVar47.b();
                s.j(aVarB23);
                l1l.h hVar3 = new l1l.h(aVarB23, 0);
                gte.a aVarB24 = aVar47.b();
                s.j(aVarB24);
                asa.m mVar3 = new asa.m(fVar5, c0Var8, aVarB21, zVarA2, dVar7, nVarB4, aVar46, dVar8, sVar3, qVar2, kVar3, fVar6, cVar63, hVar3, new l1l.h(aVarB24, 1), new asa.e());
                f4h.a aVarA20 = aVar42.f222398q.a();
                v8k.i iVar3 = aVar42.f222399r;
                p5a.l lVar3 = new p5a.l(aVarA19, r0VarA2, zVarD, nVarB3, mVar3, aVarA20, iVar3.a(), aVar45.a(), aVar45.f(), iVar3.c(), new csa.c());
                ang.f fVarE = aVar42.f222400s.e();
                xx9.p pVarB3 = aVar44.b();
                s.j(pVarB3);
                tx9.f fVarC3 = aVar44.c();
                s.j(fVarC3);
                jei.b bVarA7 = aVar42.f222401t.a();
                l80.e eVarH = eVar11.h();
                s.j(eVarH);
                cl3.a aVarD2 = nVar7.d();
                s.j(aVarD2);
                h30.q qVar3 = new h30.q(fVarE, pVarB3, fVarC3, bVarA7, eVarH, aVarD2);
                d3a.b bVarA8 = ((s3a.k) aVar42.u).a();
                s.j(bVarA8);
                p5a.s sVar4 = new p5a.s(qVar3, bVarA8, ((oq8.a) aVar42.v).a());
                p5a.t tVar2 = new p5a.t();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) aVar42.f222402w).c();
                s.j(aVarC2);
                opf.c0 c0Var9 = new opf.c0();
                wj0.a aVarI = ((nj0.d) aVar42.f222403x).i();
                s.j(aVarI);
                return new n5a.f(bVarJ3, cVar62, lVar2, lVar3, sVar4, tVar2, aVarC2, c0Var9, aVarI);
            case 5:
                nbh.a aVar48 = new nbh.a();
                nbh.c cVar64 = new nbh.c();
                nbh.f fVarX = h9h.a.x();
                gte.a aVarB25 = aVar2.b();
                s.j(aVarB25);
                aa7.m mVar4 = new aa7.m(aVar48, cVar64, fVarX, aVarB25);
                ybl.b bVarB4 = aVar.f238102v1.b();
                s.j(bVarB4);
                return new aa7.i(mVar4, new r10.f(new r10.t(bVarB4, new blh.j()), aVar.w1.a()));
            case 6:
                xv5.c cVarA7 = aVar.f238107x1.a();
                s.j(cVarA7);
                return new ba7.h(cVarA7, new r10.f(((n51.a) aVar.f238109y1).b(), aVar.f238110z1.a()), new ba7.k(aVar.A1.a()));
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        np9.b bVar;
        int i = this.f237247a;
        int i2 = this.f237248b;
        Object obj2 = this.f237249c;
        switch (i) {
            case 0:
                i iVar = (i) obj2;
                uw1.b bVar2 = iVar.f237250a;
                if (i2 == 0) {
                    ik0.b retrofitFactory = ((nj0.d) iVar.f237251b).m();
                    s.j(retrofitFactory);
                    Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                    Object objCreate = ik0.b.a(retrofitFactory, null, null, null, null, 31).create(AaniQrCodeService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                    AaniQrCodeService aaniQrCodeService = (AaniQrCodeService) objCreate;
                    s.k(aaniQrCodeService);
                    return aaniQrCodeService;
                }
                if (i2 == 1) {
                    fx1.a aVarF = ((lz1.m) bVar2).f();
                    s.j(aVarF);
                    return new ol1.f(new kdh.b(aVarF, (a) iVar.f.get()));
                }
                if (i2 == 2) {
                    com.revolut.feature.apm.core.impl.crypto.h hVar = (com.revolut.feature.apm.core.impl.crypto.h) ((lz1.m) bVar2).S.get();
                    s.j(hVar);
                    return d.j(hVar);
                }
                if (i2 == 3) {
                    return new ol1.g();
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                uw1.c cVarD = ((lz1.m) bVar2).d();
                s.j(cVarD);
                oz1.j jVarG = ((lz1.m) bVar2).g();
                a12.q qVar = (a12.q) iVar.f237252c.f231713w.get();
                s.j(qVar);
                sl1.h hVar2 = new sl1.h(qVar);
                l80.e eVarH = iVar.d.h();
                s.j(eVarH);
                return new sl1.c(cVarD, jVarG, hVar2, eVarH);
            case 1:
                m mVar = (m) obj2;
                uw1.b bVar3 = mVar.f237263a;
                if (i2 == 0) {
                    return new ol1.a();
                }
                if (i2 == 1) {
                    com.revolut.feature.apm.core.impl.crypto.h hVar3 = (com.revolut.feature.apm.core.impl.crypto.h) ((lz1.m) bVar3).S.get();
                    s.j(hVar3);
                    return d.j(hVar3);
                }
                if (i2 == 2) {
                    return new vl1.a((kl1.a) mVar.f237267h.get());
                }
                if (i2 == 3) {
                    return new ol1.g();
                }
                if (i2 == 4) {
                    return new vl1.g(((lz1.m) bVar3).g());
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                uy1.b factory = ((lz1.m) bVar3).b();
                s.j(factory);
                g.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                zz1.h.Companion.getClass();
                return factory.a(zz1.h.d);
            case 2:
                n nVar = (n) obj2;
                a31.a aVar = nVar.d;
                a31.a aVar2 = nVar.f237271c;
                a31.a aVar3 = nVar.f237270b;
                ecm.q qVar2 = nVar.f237269a;
                if (i2 == 0) {
                    return new emi.g(qVar2, aVar3, aVar2, aVar, nVar.e, 8);
                }
                if (i2 == 1) {
                    return new emi.g(qVar2, aVar3, aVar2, aVar, nVar.f, 9);
                }
                throw new AssertionError(i2);
            case 3:
                pma.b bVar4 = (pma.b) obj2;
                switch (i2) {
                    case 0:
                        hri.b bVar5 = bVar4.f237508a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar6 = bVar4.f237508a;
                        return new iri.j();
                    case 2:
                        return new oma.t();
                    case 3:
                        return new cn.e();
                    case 4:
                        return new um.c();
                    case 5:
                        bVar4.getClass();
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
                        return new g3l.g();
                    case 12:
                        return new wm.a();
                    case 13:
                        oma.d dVar = (oma.d) bVar4.f237513j.get();
                        ang.f fVarE = bVar4.e.e();
                        bma.a aVar4 = (bma.a) ((zla.a) bVar4.f237510c).f323206g.get();
                        s.j(aVar4);
                        mt8.d dVarB = bVar4.f.b();
                        s.j(dVarB);
                        return new oma.g(dVar, fVarE, aVar4, dVarB);
                    default:
                        throw new AssertionError(i2);
                }
            case 4:
                poa.b bVar7 = (poa.b) obj2;
                vxd.b bVar8 = bVar7.f237952b;
                if (i2 == 0) {
                    return new ifm.b();
                }
                if (i2 == 1) {
                    return new iri.j();
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return new ooa.b();
                        }
                        throw new AssertionError(i2);
                    }
                    z21.a aVar5 = (z21.a) ((c21.b) bVar7.f237951a).i0.get();
                    s.j(aVar5);
                    return new d61.a(aVar5);
                }
                d61.a aVar6 = (d61.a) bVar7.f.get();
                zxd.b bVar9 = (zxd.b) ((eyd.b) bVar8).D.get();
                s.j(bVar9);
                ooa.a aVar7 = (ooa.a) bVar7.f237954g.get();
                zxd.c cVarA = ((eyd.b) bVar8).a();
                s.j(cVarA);
                return new ooa.d(aVar6, bVar9, aVar7, cVarA);
            case 5:
                return a();
            case 6:
                pp.c cVar = (pp.c) obj2;
                a31.a aVar8 = cVar.f238155v0;
                if (i2 == 0) {
                    return new pp.d(cVar.f238112a, cVar.f238114b, cVar.f238117c, cVar.d, cVar.e, cVar.f, cVar.f238124g, cVar.f238126h, cVar.i, cVar.f238130j, cVar.k, cVar.f238134l, cVar.f238136m, cVar.f238137n, cVar.o, cVar.f238142p, cVar.f238144q, cVar.f238145r, cVar.f238148s, cVar.f238151t, cVar.u, cVar.v, cVar.f238157w, cVar.f238159x, cVar.f238162y, cVar.z, cVar.A, cVar.B, cVar.C, cVar.D, cVar.E, cVar.F, cVar.G, cVar.H, cVar.I, cVar.J, cVar.K, cVar.L, cVar.M, cVar.N, cVar.O, cVar.P, cVar.Q, cVar.R, cVar.S, cVar.T, cVar.U, cVar.V, cVar.W, cVar.X, cVar.Y, cVar.Z, cVar.f238113a0, cVar.f238115b0, cVar.c0, cVar.f238119d0, cVar.f238121e0, cVar.f0, cVar.g0, cVar.f238127h0, cVar.i0, cVar.j0, cVar.f238132k0, cVar.l0, cVar.m0, cVar.f238138n0, cVar.f238140o0, cVar.p0, cVar.q0, cVar.f238146r0, cVar.f238149s0, cVar.f238152t0, cVar.u0, aVar8, cVar.f238158w0, cVar.f238160x0, cVar.y0, cVar.z0, cVar.A0, cVar.B0, cVar.C0, cVar.D0, cVar.E0, cVar.F0, cVar.G0, cVar.H0, cVar.I0, cVar.J0, cVar.K0, cVar.L0, cVar.M0, cVar.N0, cVar.O0, cVar.P0, cVar.Q0, cVar.R0, cVar.S0, cVar.T0, cVar.U0, cVar.V0, cVar.W0, cVar.X0, cVar.Y0, cVar.Z0, cVar.a1, cVar.f238116b1, cVar.f238118c1, cVar.f238120d1, cVar.f238122e1, cVar.f238123f1, cVar.f238125g1, cVar.f238128h1, cVar.f238129i1, cVar.f238131j1, cVar.f238133k1, cVar.f238135l1, cVar.m1, cVar.f238139n1, cVar.f238141o1, cVar.f238143p1, cVar.q1, cVar.f238147r1, cVar.f238150s1, cVar.f238153t1, cVar.f238154u1, cVar.f238156v1, cVar.w1, cVar.f238161x1, cVar.f238163y1, cVar.f238164z1, cVar.A1, cVar.B1, cVar.C1, cVar.D1, cVar.E1);
                }
                if (i2 == 1) {
                    return new n8j.a(aVar8, 11);
                }
                throw new AssertionError(i2);
            case 7:
                pp9.b bVar10 = (pp9.b) obj2;
                if (i2 == 0) {
                    np9.b splitInteractorTypeAmount = (np9.b) bVar10.f238303a.get();
                    np9.b splitInteractorTypePercent = (np9.b) bVar10.f238304b.get();
                    np9.b splitInteractorTypeShare = (np9.b) bVar10.f238305c.get();
                    Intrinsics.checkNotNullParameter(splitInteractorTypeAmount, "splitInteractorTypeAmount");
                    Intrinsics.checkNotNullParameter(splitInteractorTypePercent, "splitInteractorTypePercent");
                    Intrinsics.checkNotNullParameter(splitInteractorTypeShare, "splitInteractorTypeShare");
                    return new nd.o();
                }
                if (i2 == 1) {
                    qp9.a strategy = new qp9.a();
                    op9.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(strategy, "strategy");
                    Intrinsics.checkNotNullParameter(strategy, "strategy");
                    bVar = new np9.b();
                } else if (i2 == 2) {
                    qp9.b strategy2 = new qp9.b();
                    op9.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(strategy2, "strategy");
                    Intrinsics.checkNotNullParameter(strategy2, "strategy");
                    bVar = new np9.b();
                } else {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return new hp9.c();
                        }
                        throw new AssertionError(i2);
                    }
                    qp9.d strategy3 = new qp9.d();
                    op9.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(strategy3, "strategy");
                    Intrinsics.checkNotNullParameter(strategy3, "strategy");
                    bVar = new np9.b();
                }
                return bVar;
            case 8:
                if (i2 == 0) {
                    ppd.o oVar = (ppd.o) obj2;
                    return new com.revolut.feature.spending_analytics.impl.ui.budget.a(oVar.f238515a, (smd.y) oVar.d.get());
                }
                if (i2 == 1) {
                    return new smd.y();
                }
                throw new AssertionError(i2);
            case 9:
                if (i2 == 0) {
                    ppd.a0 a0Var = (ppd.a0) obj2;
                    return new jpd.e(a0Var.f238370a, (cli.n) a0Var.f238371b.get());
                }
                if (i2 == 1) {
                    return new jpd.f();
                }
                throw new AssertionError(i2);
            case 10:
                v0 v0Var = (v0) obj2;
                if (i2 == 0) {
                    return new etd.h((cli.n) v0Var.f238563b.get());
                }
                if (i2 == 1) {
                    return new etd.j(v0Var.f238562a);
                }
                throw new AssertionError(i2);
            case 11:
                x0 x0Var = (x0) obj2;
                if (i2 == 0) {
                    return new mtd.f((cli.n) x0Var.f238576c.get(), x0Var.f238574a, x0Var.f238575b);
                }
                if (i2 == 1) {
                    return new mtd.g();
                }
                throw new AssertionError(i2);
            case 12:
                if (i2 == 0) {
                    b1 b1Var = (b1) obj2;
                    return new kod.h(b1Var.f238379a, (cli.n) b1Var.f238380b.get());
                }
                if (i2 == 1) {
                    return new kod.j();
                }
                throw new AssertionError(i2);
            case 13:
                ppd.c1 c1Var = (ppd.c1) obj2;
                if (i2 == 0) {
                    ppd.n nVar2 = c1Var.f238386b;
                    j0j.a aVarH = ((r) nVar2.f238484b).h();
                    s.j(aVarH);
                    ood.x0 x0Var2 = (ood.x0) c1Var.d.get();
                    l80.e eVarH2 = nVar2.d.h();
                    s.j(eVarH2);
                    return new com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a(new mod.l(aVarH, x0Var2, eVarH2), (g1) c1Var.f.get(), c1Var.f238385a);
                }
                if (i2 == 1) {
                    return new ood.x0();
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) c1Var.e.get();
                nod.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return rp0.x0.a(g1.Companion, controller.D2());
            case 14:
                ppd.e1 e1Var = (ppd.e1) obj2;
                if (i2 == 0) {
                    return new sod.g(e1Var.f238401a, (cli.n) e1Var.f238403c.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                ppd.n nVar3 = e1Var.f238402b;
                l80.e eVarH3 = nVar3.d.h();
                s.j(eVarH3);
                n8b.a aVarA = nVar3.o.a();
                s.j(aVarA);
                return new sod.i(new rod.g(eVarH3, aVarA));
            case 15:
                if (i2 == 0) {
                    return new is.n((cli.n) ((pr.k) obj2).f238855a.get());
                }
                if (i2 == 1) {
                    return new is.o();
                }
                throw new AssertionError(i2);
            case 16:
                if (i2 == 0) {
                    return new os.j((cli.n) ((pr.l) obj2).f238857a.get());
                }
                if (i2 == 1) {
                    return new os.k();
                }
                throw new AssertionError(i2);
            case 17:
                pr.n nVar4 = (pr.n) obj2;
                if (i2 == 0) {
                    return new rs.n((cli.n) nVar4.f238863b.get());
                }
                if (i2 == 1) {
                    return new rs.p(nVar4.f238862a);
                }
                throw new AssertionError(i2);
            case 18:
                if (i2 == 0) {
                    return new ts.i((cli.n) ((pr.o) obj2).f238865a.get());
                }
                if (i2 == 1) {
                    return new ts.j();
                }
                throw new AssertionError(i2);
            case 19:
                pr.r rVar = (pr.r) obj2;
                if (i2 == 0) {
                    return new lt.g((cli.n) rVar.f238887b.get());
                }
                if (i2 == 1) {
                    return new lt.i(rVar.f238886a);
                }
                throw new AssertionError(i2);
            case 20:
                pr.s sVar = (pr.s) obj2;
                if (i2 == 0) {
                    return new nt.j((cli.n) sVar.f238890b.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                BiometricVerificationDocumentLivenessIntroScreenContract$InputData inputData = sVar.f238889a;
                ot.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                BiometricVerificationDocumentType biometricVerificationDocumentType = inputData.f50598a;
                s.k(biometricVerificationDocumentType);
                return new nt.l(biometricVerificationDocumentType);
            case 21:
                if (i2 == 0) {
                    pr.t tVar = (pr.t) obj2;
                    return new ft.m(tVar.f238892a, (cli.n) tVar.f238893b.get());
                }
                if (i2 == 1) {
                    return new ft.n();
                }
                throw new AssertionError(i2);
            case 22:
                pr.y yVar = (pr.y) obj2;
                if (i2 == 0) {
                    return new vs.o((cli.n) yVar.f238910b.get());
                }
                if (i2 == 1) {
                    return new vs.r(yVar.f238909a);
                }
                throw new AssertionError(i2);
            case 23:
                if (i2 == 0) {
                    return new ct.l((cli.n) ((pr.z) obj2).f238912a.get());
                }
                if (i2 == 1) {
                    return new ct.m();
                }
                throw new AssertionError(i2);
            case 24:
                pr.a0 a0Var2 = (pr.a0) obj2;
                if (i2 == 0) {
                    return new com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.a(a0Var2.f238826a, new ys.z(), new ys.y(), (cli.n) a0Var2.f238827b.get());
                }
                if (i2 == 1) {
                    return new tyc.l(new ys.z());
                }
                throw new AssertionError(i2);
            case 25:
                b0 b0Var = (b0) obj2;
                if (i2 == 0) {
                    return new at.q(b0Var.f238830a, new at.s(), (cli.n) b0Var.f238831b.get());
                }
                if (i2 == 1) {
                    return new at.r(new at.s());
                }
                throw new AssertionError(i2);
            case 26:
                if (i2 == 0) {
                    pr.c0 c0Var = (pr.c0) obj2;
                    return new ut.q(c0Var.f238833a, (cli.n) c0Var.f238834b.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                wt.a countryDropdownMapper = new wt.a();
                wt.b documentItemsMapper = new wt.b();
                Intrinsics.checkNotNullParameter(countryDropdownMapper, "countryDropdownMapper");
                Intrinsics.checkNotNullParameter(documentItemsMapper, "documentItemsMapper");
                return new ut.s();
            case 27:
                prk.a aVar9 = (prk.a) obj2;
                switch (i2) {
                    case 0:
                        return new xqj.a(aVar9.f239040a, (StockDetailsDatabase) aVar9.f239044h.get());
                    case 1:
                        Context context = aVar9.f239040a;
                        yk0.a databaseSessionProvider = aVar9.f239041b.b();
                        s.j(databaseSessionProvider);
                        de0.a databaseEncryptionMigratorFactory = ((c21.b) aVar9.f239042c).b();
                        brk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        StockDetailsDatabase.Companion aVar10 = StockDetailsDatabase.INSTANCE;
                        aVar10.getClass();
                        StockDetailsDatabase stockDetailsDatabase = (StockDetailsDatabase) aVar10.a(context, databaseSessionProvider, new Migration[]{crk.a.f108400c, crk.b.f108401c}, databaseEncryptionMigratorFactory);
                        s.k(stockDetailsDatabase);
                        return stockDetailsDatabase;
                    case 2:
                        return new ne0.d();
                    case 3:
                        an0.c cVar2 = aVar9.f239041b;
                        ee0.a aVar11 = aVar9.d;
                        yk0.a databaseSessionProvider2 = cVar2.b();
                        s.j(databaseSessionProvider2);
                        le0.b gsonObjectMapperFactory = aVar11.c();
                        s.j(gsonObjectMapperFactory);
                        xe0.f storageFactory = aVar11.f();
                        s.j(storageFactory);
                        wqk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        Object value = hrk.a.f154832a.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return xe0.f.f(storageFactory, databaseSessionProvider2, "stock_details_storage", gsonObjectMapperFactory.a((kg.o) value), 3, zhm.v.k(new mrk.b(), mrk.a.d), 32);
                    case 4:
                        an0.c cVar3 = aVar9.f239041b;
                        ee0.a aVar12 = aVar9.d;
                        yk0.a databaseSessionProvider3 = cVar3.b();
                        s.j(databaseSessionProvider3);
                        me0.a jsonObjectMapperFactory = aVar12.e();
                        s.j(jsonObjectMapperFactory);
                        xe0.f storageFactory2 = aVar12.f();
                        s.j(storageFactory2);
                        Json featureJson = (Json) aVar9.f239046l.get();
                        wqk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(jsonObjectMapperFactory, "jsonObjectMapperFactory");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        Intrinsics.checkNotNullParameter(featureJson, "featureJson");
                        return xe0.f.f(storageFactory2, databaseSessionProvider3, "stock_details_json_storage", jsonObjectMapperFactory.a(featureJson), 1, f0.f322471a, 32);
                    case 5:
                        ee0.a aVar13 = aVar9.d;
                        Json baseJson = fe0.d.a();
                        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                        return ue0.e.b(baseJson, new ip4.m(14));
                    case 6:
                        return new qrk.b((lrk.i) aVar9.f239051r.get());
                    case 7:
                        StockFinancialsService stockFinancialsService = (StockFinancialsService) aVar9.o.get();
                        ark.d dVar2 = (ark.d) aVar9.f239049p.get();
                        xqk.a aVar14 = (xqk.a) aVar9.f239050q.get();
                        b80.c cVarP = aVar9.f.p();
                        s.j(cVarP);
                        return new lrk.i(stockFinancialsService, dVar2, aVar14, cVarP);
                    case 8:
                        StockFinancialsService stockFinancialsService2 = (StockFinancialsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar9.f239048n.get(), "retrofit", StockFinancialsService.class, "create(...)");
                        s.k(stockFinancialsService2);
                        return stockFinancialsService2;
                    case 9:
                        ik0.b retrofitFactory2 = ((nj0.d) aVar9.e).m();
                        s.j(retrofitFactory2);
                        Json json = (Json) aVar9.f239046l.get();
                        Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(json, "json");
                        Retrofit retrofitA = ik0.b.a(retrofitFactory2, null, null, p.a.g(ulm.b1.Companion, "application/json", json), null, 27);
                        s.k(retrofitA);
                        return retrofitA;
                    case 10:
                        StockDetailsDatabase db8 = (StockDetailsDatabase) aVar9.f239044h.get();
                        brk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db8, "db");
                        ark.d dVarG = db8.g();
                        s.k(dVarG);
                        return dVarG;
                    case 11:
                        return new xqk.a((ne0.j) aVar9.f239045j.get());
                    case 12:
                        return new qrk.d((lrk.r) aVar9.f239053t.get());
                    case 13:
                        return new lrk.r((ue0.c) aVar9.k.get());
                    case 14:
                        return new qrk.c(new lrk.o((StockInsightsService) aVar9.v.get(), (ne0.j) aVar9.f239045j.get(), (x4l.c) aVar9.f239054w.get(), (ue0.c) aVar9.f239047m.get()));
                    case 15:
                        Retrofit retrofit = (Retrofit) aVar9.f239048n.get();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        StockInsightsService stockInsightsService = (StockInsightsService) retrofit.create(StockInsightsService.class);
                        s.k(stockInsightsService);
                        return stockInsightsService;
                    case 16:
                        frk.b provider = new frk.b((StockInsightsService) aVar9.v.get(), (ne0.j) aVar9.f239045j.get(), (ue0.c) aVar9.f239047m.get());
                        erk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        x4l.c cVar4 = provider.f137490c;
                        s.k(cVar4);
                        return cVar4;
                    case 17:
                        return new qrk.a(new lrk.a((x4l.c) aVar9.z.get(), 0));
                    case 18:
                        aVar9.getClass();
                        frk.d provider2 = new frk.d((AssetDataPointsService) aVar9.f239056y.get(), (ne0.j) aVar9.f239045j.get(), (ue0.c) aVar9.f239047m.get());
                        erk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        x4l.c cVar5 = provider2.d;
                        s.k(cVar5);
                        return cVar5;
                    case 19:
                        Retrofit retrofit3 = (Retrofit) aVar9.f239048n.get();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        AssetDataPointsService assetDataPointsService = (AssetDataPointsService) retrofit3.create(AssetDataPointsService.class);
                        s.k(assetDataPointsService);
                        return assetDataPointsService;
                    default:
                        throw new AssertionError(i2);
                }
            case 28:
                prk.c cVar6 = (prk.c) obj2;
                if (i2 == 0) {
                    awk.b extensions = (awk.b) cVar6.e.get();
                    vvk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extensions, "extensions");
                    return extensions.f10795a;
                }
                if (i2 == 1) {
                    awk.f input = cVar6.f239065a;
                    zjh.j jVar = new zjh.j(new zvk.b());
                    r39.a factory2 = new r39.a(jVar);
                    awk.a delegates = cVar6.f239066b;
                    vvk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(input, "input");
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    Intrinsics.checkNotNullParameter(delegates, "delegates");
                    Intrinsics.checkNotNullParameter(input, "input");
                    Intrinsics.checkNotNullParameter(delegates, "delegates");
                    awk.l lVar = new awk.l(input, jVar);
                    return new awk.b(new awk.i(lVar, delegates), lVar);
                }
                if (i2 == 2) {
                    awk.b extensions2 = (awk.b) cVar6.e.get();
                    vvk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extensions2, "extensions");
                    return extensions2.f10796b;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new AssertionError(i2);
                    }
                    awk.b extensions3 = (awk.b) cVar6.e.get();
                    vvk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extensions3, "extensions");
                    return extensions3.f10796b;
                }
                zvk.d assetStatsUIMapper = cVar6.b();
                Intrinsics.checkNotNullParameter(assetStatsUIMapper, "assetStatsUIMapper");
                qee.s sVar2 = new qee.s(new uvk.k(), new uvk.l(new zvk.b(), cVar6.b(), new awk.m(cVar6.b())));
                AddKeyStatsViewGroupsScreenContract$Input addKeyStatsViewGroupsScreenContract$Input = cVar6.f239067c;
                nd.p pVar = new nd.p(new zvk.b(), 15);
                kb8.a aVar15 = new kb8.a(cVar6.d.f239149q.g(), new zvk.b(), cVar6.b());
                AddKeyStatsViewGroupsScreenContract$Input input2 = cVar6.f239067c;
                vvk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(input2, "input");
                trk.a aVar16 = input2.f104021a;
                s.k(aVar16);
                return new uvk.o(sVar2, addKeyStatsViewGroupsScreenContract$Input, pVar, new su9.c(aVar15, aVar16), (awk.g) cVar6.f239069h.get());
            default:
                prk.d dVar3 = (prk.d) obj2;
                if (i2 == 0) {
                    awk.b extensions4 = (awk.b) dVar3.d.get();
                    xvk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extensions4, "extensions");
                    return extensions4.f10795a;
                }
                if (i2 == 1) {
                    awk.f input3 = dVar3.f239072a;
                    zjh.j jVar2 = new zjh.j(new zvk.b());
                    r39.a factory3 = new r39.a(jVar2);
                    awk.a delegates2 = dVar3.f239073b;
                    xvk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(input3, "input");
                    Intrinsics.checkNotNullParameter(factory3, "factory");
                    Intrinsics.checkNotNullParameter(delegates2, "delegates");
                    Intrinsics.checkNotNullParameter(input3, "input");
                    Intrinsics.checkNotNullParameter(delegates2, "delegates");
                    awk.l lVar2 = new awk.l(input3, jVar2);
                    return new awk.b(new awk.i(lVar2, delegates2), lVar2);
                }
                if (i2 == 2) {
                    awk.b extensions5 = (awk.b) dVar3.d.get();
                    xvk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extensions5, "extensions");
                    return extensions5.f10796b;
                }
                if (i2 == 3) {
                    return new wvk.j(new wvk.i(dVar3.f239074c, new awk.m(new zvk.d(new o7.d(new x3h.a()))), new zvk.d(new o7.d(new x3h.a())), new wvk.g()), (awk.g) dVar3.f239075g.get());
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                awk.b extensions6 = (awk.b) dVar3.d.get();
                xvk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions6, "extensions");
                return extensions6.f10796b;
        }
    }
}
