package dw3;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.card_management.impl.cardagreements.screens.overview.CardIssuanceAgreementsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreenContract$InputData;
import com.revolut.feature.joint.impl.ui.consent.ConsentScreenContract$InputData;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$InputData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f119606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f119607c;
    public final Object d;
    public final Object e;

    public /* synthetic */ q8(Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f119605a = i2;
        this.f119606b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f119607c = i;
    }

    private final Object a() {
        q4 q4Var = (q4) this.d;
        c1 c1Var = (c1) this.f119606b;
        d9 d9Var = (d9) this.e;
        OfferContentScreenContract$InputData offerContentScreenContract$InputData = d9Var.f118598b;
        int i = this.f119607c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) d9Var.d.get(), (c84.b) d9Var.e.get(), (PluginFlowContract$Input) q4Var.i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) d9Var.d.get());
        }
        if (i == 3) {
            lx4.a aVarE = c1Var.f118489y.e();
            return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
        }
        if (i == 4) {
            return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b((cx4.a) d9Var.f118601h.get(), (pf4.v) q4Var.f119582y.get(), offerContentScreenContract$InputData, (cli.n) d9Var.f118602j.get());
        }
        if (i == 5) {
            return new kxk.o(offerContentScreenContract$InputData, new pf4.b(d9Var.f118599c.f118489y.c(), new ae4.a(), offerContentScreenContract$InputData, new q74.b()), new q74.b());
        }
        throw new AssertionError(i);
    }

    private final Object b() {
        q4 q4Var = (q4) this.d;
        c1 c1Var = (c1) this.f119606b;
        ax4.e eVar = c1Var.f118489y;
        f9 f9Var = (f9) this.e;
        int i = this.f119607c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) f9Var.e.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) f9Var.f118775c.get(), (rp0.m) f9Var.d.get());
            case 2:
                return new rp0.m();
            case 3:
                return e5f.b.e((com.revolut.kompot.navigable.a) f9Var.f118775c.get(), (c84.b) f9Var.f118776g.get(), (PluginFlowContract$Input) q4Var.i.get());
            case 4:
                return new c84.b();
            case 5:
                return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) f9Var.f118775c.get());
            case 6:
                lx4.a aVarE = eVar.e();
                return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
            case 7:
                return new mh4.y((cli.n) f9Var.f118779l.get(), f9Var.f118774b, (j60.a) f9Var.e.get(), (mh4.r) q4Var.f119582y.get(), (cx4.a) f9Var.f118778j.get());
            case 8:
                return new mh4.c0(eVar.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        p5 p5Var = (p5) this.d;
        c1 c1Var = (c1) this.f119606b;
        ax4.e eVar = c1Var.f118489y;
        f9 f9Var = (f9) this.e;
        int i = this.f119607c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) f9Var.e.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) f9Var.f118775c.get(), (rp0.m) f9Var.d.get());
            case 2:
                return new rp0.m();
            case 3:
                return e5f.b.e((com.revolut.kompot.navigable.a) f9Var.f118775c.get(), (c84.b) f9Var.f118776g.get(), (PluginFlowContract$Input) p5Var.i.get());
            case 4:
                return new c84.b();
            case 5:
                return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) f9Var.f118775c.get());
            case 6:
                lx4.a aVarE = eVar.e();
                return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
            case 7:
                return new mh4.y((cli.n) f9Var.f118779l.get(), f9Var.f118774b, (j60.a) f9Var.e.get(), (mh4.r) p5Var.z.get(), (cx4.a) f9Var.f118778j.get());
            case 8:
                return new mh4.c0(eVar.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        i9 i9Var = (i9) this.e;
        c1 c1Var = (c1) this.f119606b;
        int i = this.f119607c;
        if (i == 0) {
            return e5f.b.d((com.revolut.kompot.navigable.a) i9Var.f118992b.get(), (c84.b) i9Var.d.get(), (PluginFlowContract$Input) ((w6) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new ri4.n((hw3.e) c1Var.Q0.get(), (hw3.c) c1Var.f118472s0.get(), c1Var.b(), i9Var.f118991a, (jki.p) i9Var.f118994g.get());
        }
        if (i == 3) {
            return new ri4.p();
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        c1 c1Var = (c1) this.f119606b;
        j9 j9Var = (j9) this.e;
        int i = this.f119607c;
        if (i == 0) {
            return e5f.b.d((com.revolut.kompot.navigable.a) j9Var.f119060b.get(), (c84.b) j9Var.d.get(), (PluginFlowContract$Input) ((u6) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i != 2) {
            if (i == 3) {
                return new oi4.q();
            }
            throw new AssertionError(i);
        }
        hw3.e eVar = (hw3.e) c1Var.Q0.get();
        hw3.c cVar = (hw3.c) c1Var.f118472s0.get();
        RequestConsentScreenContract$InputData requestConsentScreenContract$InputData = j9Var.f119059a;
        mn3.a aVar = (mn3.a) ((in3.e) c1Var.Q).f162625j.get();
        vc.s.j(aVar);
        return new oi4.p(eVar, cVar, requestConsentScreenContract$InputData, aVar, (jki.p) j9Var.f119062g.get());
    }

    private final Object f() {
        l9 l9Var = (l9) this.e;
        c1 c1Var = (c1) this.f119606b;
        int i = this.f119607c;
        if (i == 0) {
            return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b(l9Var.f119225b, (ck4.a) ((d1) this.d).v.get(), new wj4.b(), new pk4.a(), (cli.n) l9Var.f119226c.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        vj4.b bVarA = c1Var.U.a();
        vc.s.j(bVarA);
        f90.b bVarT = c1Var.f118443h.t();
        vc.s.j(bVarT);
        return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.c(bVarA, bVarT);
    }

    private final Object g() {
        l9 l9Var = (l9) this.e;
        c1 c1Var = (c1) this.f119606b;
        int i = this.f119607c;
        if (i == 0) {
            return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b(l9Var.f119225b, (ck4.a) ((w) this.d).v.get(), new wj4.b(), new pk4.a(), (cli.n) l9Var.f119226c.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        vj4.b bVarA = c1Var.U.a();
        vc.s.j(bVarA);
        f90.b bVarT = c1Var.f118443h.t();
        vc.s.j(bVarT);
        return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.c(bVarA, bVarT);
    }

    private final Object h() {
        dz2.a aVar = (dz2.a) this.f119606b;
        ore.b bVar = aVar.f121215a;
        dz2.c cVar = (dz2.c) this.e;
        int i = this.f119607c;
        if (i != 0) {
            if (i == 1) {
                return new hz2.b(cVar.f121221a);
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) cVar.f121222b.get();
        CardIssuanceAgreementsScreenContract$InputData cardIssuanceAgreementsScreenContract$InputData = cVar.f121221a;
        pre.c cVarA = bVar.a();
        vc.s.j(cVarA);
        mre.c cVarB = bVar.b();
        vc.s.j(cVarB);
        return new com.revolut.feature.card_management.impl.cardagreements.screens.overview.a(nVar, cardIssuanceAgreementsScreenContract$InputData, cVarA, cVarB, aVar.f121216b.e(), (ez2.d) ((dz2.b) this.d).d.get());
    }

    private final Object i() {
        e48.d dVar = (e48.d) this.e;
        e48.g gVar = (e48.g) this.f119606b;
        ore.b bVar = gVar.f122433p;
        oai.i0 i0Var = gVar.k;
        int i = this.f119607c;
        if (i == 0) {
            jki.p pVar = (jki.p) dVar.f122417b.get();
            ConsentScreenContract$InputData consentScreenContract$InputData = dVar.f122416a;
            pre.c cVarA = bVar.a();
            vc.s.j(cVarA);
            mre.c cVarB = bVar.b();
            vc.s.j(cVarB);
            return new t48.y(pVar, consentScreenContract$InputData, cVarA, cVarB, gVar.d.c(), gVar.f.e());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        dci.b bVar2 = (dci.b) i0Var.f223714x.get();
        vc.s.j(bVar2);
        k58.a aVar = (k58.a) ((e48.m) this.d).i.get();
        bci.d dVar2 = (bci.d) i0Var.v.get();
        vc.s.j(dVar2);
        return new t48.b0(dVar2, bVar2, aVar);
    }

    private final Object j() {
        ehe.a aVar = (ehe.a) this.d;
        ehe.c cVar = (ehe.c) this.f119606b;
        ehe.e eVar = (ehe.e) this.e;
        int i = this.f119607c;
        switch (i) {
            case 0:
                fd6.a aVar2 = (fd6.a) eVar.e.get();
                va.g.t(aVar2);
                return aVar2;
            case 1:
                return va.g.s(((zc6.a) cVar.M).d(), (xc6.a) eVar.d.get());
            case 2:
                return r6.b.k((zc6.a) cVar.M, "factory");
            case 3:
                return ufg.p0.z((Map) eVar.u.get());
            case 4:
                return ufg.p0.B((com.revolut.kompot.navigable.a) eVar.f126007g.get(), ehe.n.r(), (Map) eVar.f126017t.get());
            case 5:
                return ufg.p0.A(eVar.b());
            case 6:
                vy5.k0 provider = ((yy5.b) cVar.f125993t).d();
                Intrinsics.checkNotNullParameter(provider, "provider");
                return provider;
            case 7:
                pfe.d provider2 = ((c89.a) cVar.u).a();
                vc.s.j(provider2);
                Intrinsics.checkNotNullParameter(provider2, "provider");
                return provider2;
            case 8:
                pfe.d provider3 = ((k78.b) cVar.i).r();
                vc.s.j(provider3);
                Intrinsics.checkNotNullParameter(provider3, "provider");
                return provider3;
            case 9:
                pfe.d provider4 = ((eqe.a) cVar.f125980j).a();
                vc.s.j(provider4);
                Intrinsics.checkNotNullParameter(provider4, "provider");
                return provider4;
            case 10:
                pfe.d provider5 = ((c6e.a) cVar.f).a();
                vc.s.j(provider5);
                Intrinsics.checkNotNullParameter(provider5, "provider");
                return provider5;
            case 11:
                pfe.d provider6 = ((fob.a) cVar.k).d();
                vc.s.j(provider6);
                Intrinsics.checkNotNullParameter(provider6, "provider");
                return provider6;
            case 12:
                pfe.d provider7 = ((t15.d) cVar.f125978h).g();
                vc.s.j(provider7);
                Intrinsics.checkNotNullParameter(provider7, "provider");
                return provider7;
            case 13:
                pfe.d provider8 = ((yha.a) cVar.o).c();
                vc.s.j(provider8);
                Intrinsics.checkNotNullParameter(provider8, "provider");
                return provider8;
            case 14:
                pfe.d provider9 = ((xf6.q1) cVar.f125977g).a();
                vc.s.j(provider9);
                Intrinsics.checkNotNullParameter(provider9, "provider");
                return provider9;
            case 15:
                pfe.d provider10 = ((q38.b) cVar.f125984n).c();
                vc.s.j(provider10);
                Intrinsics.checkNotNullParameter(provider10, "provider");
                return provider10;
            case 16:
                pfe.d provider11 = ((q38.b) cVar.f125984n).a();
                vc.s.j(provider11);
                Intrinsics.checkNotNullParameter(provider11, "provider");
                return provider11;
            case 17:
                eVar.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(8);
                yfe.a aVar3 = yfe.a.Crypto;
                ehe.c cVar2 = eVar.f126005b;
                yfe.d dVarA = cVar2.A.a();
                vc.s.j(dVarA);
                builderBuilderWithExpectedSize.put(aVar3, dVarA);
                builderBuilderWithExpectedSize.put(yfe.a.Invest, ((mkh.s) cVar2.B).c());
                yfe.a aVar4 = yfe.a.Credit;
                yfe.d dVarF = ((t15.d) cVar2.f125978h).f();
                vc.s.j(dVarF);
                builderBuilderWithExpectedSize.put(aVar4, dVarF);
                yfe.a aVar5 = yfe.a.Joint;
                yfe.d dVarB = ((q38.b) cVar2.f125984n).b();
                vc.s.j(dVarB);
                builderBuilderWithExpectedSize.put(aVar5, dVarB);
                yfe.a aVar6 = yfe.a.Pro;
                yfe.d dVarB2 = ((yha.a) cVar2.o).b();
                vc.s.j(dVarB2);
                builderBuilderWithExpectedSize.put(aVar6, dVarB2);
                yfe.a aVar7 = yfe.a.Youth;
                yfe.d dVarS = ((k78.b) cVar2.i).s();
                vc.s.j(dVarS);
                builderBuilderWithExpectedSize.put(aVar7, dVarS);
                yfe.a aVar8 = yfe.a.Savings;
                yfe.d dVarE = ((fob.a) cVar2.k).e();
                vc.s.j(dVarE);
                builderBuilderWithExpectedSize.put(aVar8, dVarE);
                yfe.a aVar9 = yfe.a.Linked;
                yfe.d dVarE2 = ((xf6.t) cVar2.z).e();
                vc.s.j(dVarE2);
                builderBuilderWithExpectedSize.put(aVar9, dVarE2);
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                oqk.l lVarB = cVar2.E.b();
                vc.s.j(lVarB);
                ehe.a aVar10 = eVar.f126006c;
                nhe.t provider12 = new nhe.t(immutableMapBuild, lVarB, (ahe.n) aVar10.f125944s.get(), (ahe.t) aVar10.v.get(), new uge.e(), cVar2.f125988q.a(), cVar2.f125998x.c(), cVar2.f125983m.e(), new nhe.g(), new kl.c0(cVar2.P.b()));
                Intrinsics.checkNotNullParameter(provider12, "provider");
                return provider12;
            case 18:
                oa7.a extension = (oa7.a) eVar.f126018w.get();
                lhe.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 19:
                kbb.c provider13 = cVar.f125991s.b();
                lhe.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider13, "provider");
                return provider13.R();
            case 20:
                return va.g.u((xc6.a) eVar.d.get());
            case 21:
                return ufg.p0.y((Map) eVar.A.get());
            case 22:
                ImmutableMap immutableMapB = eVar.b();
                Map map = (Map) eVar.u.get();
                rp0.l0 l0Var = (rp0.l0) eVar.z.get();
                gte.a aVarB = eVar.f126005b.v.b();
                vc.s.j(aVarB);
                return ufg.p0.g(immutableMapB, map, l0Var, new vhe.a(aVarB), (com.revolut.kompot.navigable.a) eVar.f126007g.get());
            case 23:
                return ufg.p0.v((com.revolut.kompot.navigable.a) eVar.f126007g.get());
            case 24:
                TotalWealthCategoryListContract$InputData totalWealthCategoryListContract$InputData = eVar.f126004a;
                ehe.c cVar3 = eVar.f126005b;
                mge.a aVar11 = new mge.a();
                zjh.j jVarC = ((zc6.a) cVar3.M).c();
                com.revolut.feature.tab.accounts.impl.total_wealth.category_list.b bVar = new com.revolut.feature.tab.accounts.impl.total_wealth.category_list.b((aie.c0) eVar.C.get(), aVar11, cVar3.f125991s.c(), jVarC);
                ahe.t tVar = (ahe.t) aVar.v.get();
                vfg.p pVarA = cVar.f125991s.a();
                vge.z2 z2Var = (vge.z2) aVar.B.get();
                rp0.l0 l0Var2 = (rp0.l0) eVar.z.get();
                the.a aVar12 = (the.a) eVar.D.get();
                fhe.a aVarA = hhe.c.a();
                i4b.f fVarB = ((zc6.a) cVar.M).b();
                ghe.a aVar13 = new ghe.a();
                oa7.a aVar14 = (oa7.a) eVar.f126018w.get();
                mie.a aVar15 = (mie.a) eVar.E.get();
                uge.e eVar2 = new uge.e();
                rfe.a aVarH = aVar.h();
                Context context = cVar3.C;
                lhe.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                zfe.g.Companion.getClass();
                return new com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a(totalWealthCategoryListContract$InputData, bVar, tVar, pVarA, z2Var, l0Var2, aVar12, aVarA, fVarB, aVar13, aVar14, aVar15, eVar2, aVarH, zfe.f.a(context));
            case 25:
                return new com.revolut.feature.tab.accounts.impl.ui.spaces.k(new com.revolut.feature.tab.accounts.impl.ui.spaces.a());
            case 26:
                return new the.a((Map) eVar.A.get());
            case 27:
                com.revolut.kompot.navigable.a aVar16 = (com.revolut.kompot.navigable.a) eVar.f126007g.get();
                gte.a aVarB2 = cVar.v.b();
                vc.s.j(aVarB2);
                return new mie.b(aVar16, aVarB2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        ehe.b bVar = (ehe.b) this.d;
        ehe.c cVar = (ehe.c) this.f119606b;
        ehe.f fVar = (ehe.f) this.e;
        int i = this.f119607c;
        switch (i) {
            case 0:
                fd6.a aVar = (fd6.a) fVar.e.get();
                va.g.t(aVar);
                return aVar;
            case 1:
                return va.g.s(((zc6.a) cVar.M).d(), (xc6.a) fVar.d.get());
            case 2:
                return r6.b.k((zc6.a) cVar.M, "factory");
            case 3:
                return ufg.p0.z((Map) fVar.u.get());
            case 4:
                return ufg.p0.B((com.revolut.kompot.navigable.a) fVar.f126024g.get(), ehe.n.r(), (Map) fVar.f126034t.get());
            case 5:
                return ufg.p0.A(fVar.b());
            case 6:
                vy5.k0 provider = ((yy5.b) cVar.f125993t).d();
                Intrinsics.checkNotNullParameter(provider, "provider");
                return provider;
            case 7:
                pfe.d provider2 = ((c89.a) cVar.u).a();
                vc.s.j(provider2);
                Intrinsics.checkNotNullParameter(provider2, "provider");
                return provider2;
            case 8:
                pfe.d provider3 = ((k78.b) cVar.i).r();
                vc.s.j(provider3);
                Intrinsics.checkNotNullParameter(provider3, "provider");
                return provider3;
            case 9:
                pfe.d provider4 = ((eqe.a) cVar.f125980j).a();
                vc.s.j(provider4);
                Intrinsics.checkNotNullParameter(provider4, "provider");
                return provider4;
            case 10:
                pfe.d provider5 = ((c6e.a) cVar.f).a();
                vc.s.j(provider5);
                Intrinsics.checkNotNullParameter(provider5, "provider");
                return provider5;
            case 11:
                pfe.d provider6 = ((fob.a) cVar.k).d();
                vc.s.j(provider6);
                Intrinsics.checkNotNullParameter(provider6, "provider");
                return provider6;
            case 12:
                pfe.d provider7 = ((t15.d) cVar.f125978h).g();
                vc.s.j(provider7);
                Intrinsics.checkNotNullParameter(provider7, "provider");
                return provider7;
            case 13:
                pfe.d provider8 = ((yha.a) cVar.o).c();
                vc.s.j(provider8);
                Intrinsics.checkNotNullParameter(provider8, "provider");
                return provider8;
            case 14:
                pfe.d provider9 = ((xf6.q1) cVar.f125977g).a();
                vc.s.j(provider9);
                Intrinsics.checkNotNullParameter(provider9, "provider");
                return provider9;
            case 15:
                pfe.d provider10 = ((q38.b) cVar.f125984n).c();
                vc.s.j(provider10);
                Intrinsics.checkNotNullParameter(provider10, "provider");
                return provider10;
            case 16:
                pfe.d provider11 = ((q38.b) cVar.f125984n).a();
                vc.s.j(provider11);
                Intrinsics.checkNotNullParameter(provider11, "provider");
                return provider11;
            case 17:
                fVar.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(8);
                yfe.a aVar2 = yfe.a.Crypto;
                ehe.c cVar2 = fVar.f126022b;
                yfe.d dVarA = cVar2.A.a();
                vc.s.j(dVarA);
                builderBuilderWithExpectedSize.put(aVar2, dVarA);
                builderBuilderWithExpectedSize.put(yfe.a.Invest, ((mkh.s) cVar2.B).c());
                yfe.a aVar3 = yfe.a.Credit;
                yfe.d dVarF = ((t15.d) cVar2.f125978h).f();
                vc.s.j(dVarF);
                builderBuilderWithExpectedSize.put(aVar3, dVarF);
                yfe.a aVar4 = yfe.a.Joint;
                yfe.d dVarB = ((q38.b) cVar2.f125984n).b();
                vc.s.j(dVarB);
                builderBuilderWithExpectedSize.put(aVar4, dVarB);
                yfe.a aVar5 = yfe.a.Pro;
                yfe.d dVarB2 = ((yha.a) cVar2.o).b();
                vc.s.j(dVarB2);
                builderBuilderWithExpectedSize.put(aVar5, dVarB2);
                yfe.a aVar6 = yfe.a.Youth;
                yfe.d dVarS = ((k78.b) cVar2.i).s();
                vc.s.j(dVarS);
                builderBuilderWithExpectedSize.put(aVar6, dVarS);
                yfe.a aVar7 = yfe.a.Savings;
                yfe.d dVarE = ((fob.a) cVar2.k).e();
                vc.s.j(dVarE);
                builderBuilderWithExpectedSize.put(aVar7, dVarE);
                yfe.a aVar8 = yfe.a.Linked;
                yfe.d dVarE2 = ((xf6.t) cVar2.z).e();
                vc.s.j(dVarE2);
                builderBuilderWithExpectedSize.put(aVar8, dVarE2);
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                oqk.l lVarB = cVar2.E.b();
                vc.s.j(lVarB);
                ehe.b bVar2 = fVar.f126023c;
                nhe.t provider12 = new nhe.t(immutableMapBuild, lVarB, (ahe.n) bVar2.f125961s.get(), (ahe.t) bVar2.v.get(), new uge.e(), cVar2.f125988q.a(), cVar2.f125998x.c(), cVar2.f125983m.e(), new nhe.g(), new kl.c0(cVar2.P.b()));
                Intrinsics.checkNotNullParameter(provider12, "provider");
                return provider12;
            case 18:
                oa7.a extension = (oa7.a) fVar.f126035w.get();
                lhe.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 19:
                kbb.c provider13 = cVar.f125991s.b();
                lhe.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider13, "provider");
                return provider13.R();
            case 20:
                return va.g.u((xc6.a) fVar.d.get());
            case 21:
                return ufg.p0.y((Map) fVar.A.get());
            case 22:
                ImmutableMap immutableMapB = fVar.b();
                Map map = (Map) fVar.u.get();
                rp0.l0 l0Var = (rp0.l0) fVar.z.get();
                gte.a aVarB = fVar.f126022b.v.b();
                vc.s.j(aVarB);
                return ufg.p0.g(immutableMapB, map, l0Var, new vhe.a(aVarB), (com.revolut.kompot.navigable.a) fVar.f126024g.get());
            case 23:
                return ufg.p0.v((com.revolut.kompot.navigable.a) fVar.f126024g.get());
            case 24:
                TotalWealthCategoryListContract$InputData totalWealthCategoryListContract$InputData = fVar.f126021a;
                ehe.c cVar3 = fVar.f126022b;
                mge.a aVar9 = new mge.a();
                zjh.j jVarC = ((zc6.a) cVar3.M).c();
                com.revolut.feature.tab.accounts.impl.total_wealth.category_list.b bVar3 = new com.revolut.feature.tab.accounts.impl.total_wealth.category_list.b((aie.c0) fVar.C.get(), aVar9, cVar3.f125991s.c(), jVarC);
                ahe.t tVar = (ahe.t) bVar.v.get();
                vfg.p pVarA = cVar.f125991s.a();
                vge.z2 z2Var = (vge.z2) bVar.B.get();
                rp0.l0 l0Var2 = (rp0.l0) fVar.z.get();
                the.a aVar10 = (the.a) fVar.D.get();
                fhe.a aVarA = hhe.c.a();
                i4b.f fVarB = ((zc6.a) cVar.M).b();
                ghe.a aVar11 = new ghe.a();
                oa7.a aVar12 = (oa7.a) fVar.f126035w.get();
                mie.a aVar13 = (mie.a) fVar.E.get();
                uge.e eVar = new uge.e();
                rfe.a aVarH = bVar.h();
                Context context = cVar3.C;
                lhe.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                zfe.g.Companion.getClass();
                return new com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a(totalWealthCategoryListContract$InputData, bVar3, tVar, pVarA, z2Var, l0Var2, aVar10, aVarA, fVarB, aVar11, aVar12, aVar13, eVar, aVarH, zfe.f.a(context));
            case 25:
                return new com.revolut.feature.tab.accounts.impl.ui.spaces.k(new com.revolut.feature.tab.accounts.impl.ui.spaces.a());
            case 26:
                return new the.a((Map) fVar.A.get());
            case 27:
                com.revolut.kompot.navigable.a aVar14 = (com.revolut.kompot.navigable.a) fVar.f126024g.get();
                gte.a aVarB2 = cVar.v.b();
                vc.s.j(aVarB2);
                return new mie.b(aVar14, aVarB2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        ehe.a aVar = (ehe.a) this.d;
        ehe.c cVar = (ehe.c) this.f119606b;
        ehe.k kVar = (ehe.k) this.e;
        int i = this.f119607c;
        switch (i) {
            case 0:
                fd6.a aVar2 = (fd6.a) kVar.d.get();
                va.g.t(aVar2);
                return aVar2;
            case 1:
                return va.g.s(((zc6.a) cVar.M).d(), (xc6.a) kVar.f126052c.get());
            case 2:
                return r6.b.k((zc6.a) cVar.M, "factory");
            case 3:
                return ufg.p0.z((Map) kVar.f126063t.get());
            case 4:
                return ufg.p0.B((com.revolut.kompot.navigable.a) kVar.f.get(), ehe.n.r(), (Map) kVar.f126062s.get());
            case 5:
                return ufg.p0.A(kVar.c());
            case 6:
                vy5.k0 provider = ((yy5.b) cVar.f125993t).d();
                Intrinsics.checkNotNullParameter(provider, "provider");
                return provider;
            case 7:
                pfe.d provider2 = ((c89.a) cVar.u).a();
                vc.s.j(provider2);
                Intrinsics.checkNotNullParameter(provider2, "provider");
                return provider2;
            case 8:
                pfe.d provider3 = ((k78.b) cVar.i).r();
                vc.s.j(provider3);
                Intrinsics.checkNotNullParameter(provider3, "provider");
                return provider3;
            case 9:
                pfe.d provider4 = ((eqe.a) cVar.f125980j).a();
                vc.s.j(provider4);
                Intrinsics.checkNotNullParameter(provider4, "provider");
                return provider4;
            case 10:
                pfe.d provider5 = ((c6e.a) cVar.f).a();
                vc.s.j(provider5);
                Intrinsics.checkNotNullParameter(provider5, "provider");
                return provider5;
            case 11:
                pfe.d provider6 = ((fob.a) cVar.k).d();
                vc.s.j(provider6);
                Intrinsics.checkNotNullParameter(provider6, "provider");
                return provider6;
            case 12:
                pfe.d provider7 = ((t15.d) cVar.f125978h).g();
                vc.s.j(provider7);
                Intrinsics.checkNotNullParameter(provider7, "provider");
                return provider7;
            case 13:
                pfe.d provider8 = ((yha.a) cVar.o).c();
                vc.s.j(provider8);
                Intrinsics.checkNotNullParameter(provider8, "provider");
                return provider8;
            case 14:
                pfe.d provider9 = ((xf6.q1) cVar.f125977g).a();
                vc.s.j(provider9);
                Intrinsics.checkNotNullParameter(provider9, "provider");
                return provider9;
            case 15:
                pfe.d provider10 = ((q38.b) cVar.f125984n).c();
                vc.s.j(provider10);
                Intrinsics.checkNotNullParameter(provider10, "provider");
                return provider10;
            case 16:
                pfe.d provider11 = ((q38.b) cVar.f125984n).a();
                vc.s.j(provider11);
                Intrinsics.checkNotNullParameter(provider11, "provider");
                return provider11;
            case 17:
                kVar.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(8);
                yfe.a aVar3 = yfe.a.Crypto;
                ehe.c cVar2 = kVar.f126050a;
                yfe.d dVarA = cVar2.A.a();
                vc.s.j(dVarA);
                builderBuilderWithExpectedSize.put(aVar3, dVarA);
                builderBuilderWithExpectedSize.put(yfe.a.Invest, ((mkh.s) cVar2.B).c());
                yfe.a aVar4 = yfe.a.Credit;
                yfe.d dVarF = ((t15.d) cVar2.f125978h).f();
                vc.s.j(dVarF);
                builderBuilderWithExpectedSize.put(aVar4, dVarF);
                yfe.a aVar5 = yfe.a.Joint;
                yfe.d dVarB = ((q38.b) cVar2.f125984n).b();
                vc.s.j(dVarB);
                builderBuilderWithExpectedSize.put(aVar5, dVarB);
                yfe.a aVar6 = yfe.a.Pro;
                yfe.d dVarB2 = ((yha.a) cVar2.o).b();
                vc.s.j(dVarB2);
                builderBuilderWithExpectedSize.put(aVar6, dVarB2);
                yfe.a aVar7 = yfe.a.Youth;
                yfe.d dVarS = ((k78.b) cVar2.i).s();
                vc.s.j(dVarS);
                builderBuilderWithExpectedSize.put(aVar7, dVarS);
                yfe.a aVar8 = yfe.a.Savings;
                yfe.d dVarE = ((fob.a) cVar2.k).e();
                vc.s.j(dVarE);
                builderBuilderWithExpectedSize.put(aVar8, dVarE);
                yfe.a aVar9 = yfe.a.Linked;
                yfe.d dVarE2 = ((xf6.t) cVar2.z).e();
                vc.s.j(dVarE2);
                builderBuilderWithExpectedSize.put(aVar9, dVarE2);
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                oqk.l lVarB = cVar2.E.b();
                vc.s.j(lVarB);
                ehe.a aVar10 = kVar.f126051b;
                nhe.t provider12 = new nhe.t(immutableMapBuild, lVarB, (ahe.n) aVar10.f125944s.get(), (ahe.t) aVar10.v.get(), new uge.e(), cVar2.f125988q.a(), cVar2.f125998x.c(), cVar2.f125983m.e(), new nhe.g(), new kl.c0(cVar2.P.b()));
                Intrinsics.checkNotNullParameter(provider12, "provider");
                return provider12;
            case 18:
                oa7.a extension = (oa7.a) kVar.v.get();
                bie.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 19:
                kbb.c provider13 = cVar.f125991s.b();
                bie.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider13, "provider");
                return provider13.R();
            case 20:
                return pge.b.a((oge.f) kVar.f126065x.get());
            case 21:
                return new oge.f((vge.z2) aVar.B.get(), zge.j.f322121a);
            case 22:
                return va.g.u((xc6.a) kVar.f126052c.get());
            case 23:
                return ufg.p0.y((Map) kVar.B.get());
            case 24:
                ImmutableMap immutableMapC = kVar.c();
                Map map = (Map) kVar.f126063t.get();
                rp0.l0 l0Var = (rp0.l0) kVar.A.get();
                gte.a aVarB = kVar.f126050a.v.b();
                vc.s.j(aVarB);
                return ufg.p0.g(immutableMapC, map, l0Var, new vhe.a(aVarB), (com.revolut.kompot.navigable.a) kVar.f.get());
            case 25:
                return ufg.p0.v((com.revolut.kompot.navigable.a) kVar.f.get());
            case 26:
                com.revolut.feature.tab.accounts.impl.ui.spaces.j jVarB = kVar.b();
                com.revolut.feature.tab.accounts.impl.ui.spaces.c cVar3 = (com.revolut.feature.tab.accounts.impl.ui.spaces.c) kVar.E.get();
                xge.a aVar11 = (xge.a) aVar.z.get();
                vge.z2 z2Var = (vge.z2) aVar.B.get();
                rp0.l0 l0Var2 = (rp0.l0) kVar.A.get();
                l70.e eVar = cVar.T;
                ta7.a aVar12 = cVar.f125991s;
                r70.c cVarA = eVar.A();
                vc.s.j(cVarA);
                return new com.revolut.feature.tab.accounts.impl.ui.spaces.i(jVarB, cVar3, aVar11, z2Var, l0Var2, cVarA, aVar12.a(), aVar12.i(), (oa7.a) kVar.v.get(), (the.a) kVar.F.get(), hhe.c.a(), ((zc6.a) cVar.M).b(), new ghe.a(), TabAccountsMode.Credit.f89462a, new uge.e(), e4m.b.a(aVar.v));
            case 27:
                return new com.revolut.feature.tab.accounts.impl.ui.spaces.k(new com.revolut.feature.tab.accounts.impl.ui.spaces.a());
            case 28:
                return new com.revolut.feature.tab.accounts.impl.ui.spaces.c(kVar.b(), (xge.a) aVar.z.get());
            case 29:
                return new the.a((Map) kVar.B.get());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object fVar;
        switch (this.f119605a) {
            case 0:
                m1 m1Var = (m1) this.d;
                c1 c1Var = (c1) this.f119606b;
                r8 r8Var = (r8) this.e;
                int i = this.f119607c;
                switch (i) {
                    case 0:
                        return kxa.j.l((j60.a) r8Var.e.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) r8Var.f119699c.get(), (rp0.m) r8Var.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return e5f.b.d((com.revolut.kompot.navigable.a) r8Var.f119699c.get(), (c84.b) r8Var.f119700g.get(), (PluginFlowContract$Input) m1Var.i.get());
                    case 4:
                        return new c84.b();
                    case 5:
                        j60.a aVar = (j60.a) r8Var.e.get();
                        ed4.a aVar2 = new ed4.a();
                        lx3.a aVar3 = (lx3.a) m1Var.u.get();
                        gte.a aVarB = c1Var.f118423b.b();
                        vc.s.j(aVarB);
                        return new cd4.k(aVar, aVar2, aVar3, aVarB, r8Var.f119698b, (jki.p) r8Var.f119702j.get());
                    case 6:
                        CreditLinkedAccountsV2ListScreenContract$InputData creditLinkedAccountsV2ListScreenContract$InputData = r8Var.f119698b;
                        je6.h hVarC = ((xf6.t) c1Var.R).c();
                        vc.s.j(hVarC);
                        return new cd4.n(creditLinkedAccountsV2ListScreenContract$InputData, hVarC);
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                l1 l1Var = (l1) this.d;
                c1 c1Var2 = (c1) this.f119606b;
                r8 r8Var2 = (r8) this.e;
                int i2 = this.f119607c;
                switch (i2) {
                    case 0:
                        return kxa.j.l((j60.a) r8Var2.e.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) r8Var2.f119699c.get(), (rp0.m) r8Var2.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return e5f.b.d((com.revolut.kompot.navigable.a) r8Var2.f119699c.get(), (c84.b) r8Var2.f119700g.get(), (PluginFlowContract$Input) l1Var.i.get());
                    case 4:
                        return new c84.b();
                    case 5:
                        j60.a aVar4 = (j60.a) r8Var2.e.get();
                        ed4.a aVar5 = new ed4.a();
                        lx3.a aVar6 = (lx3.a) l1Var.u.get();
                        gte.a aVarB2 = c1Var2.f118423b.b();
                        vc.s.j(aVarB2);
                        return new cd4.k(aVar4, aVar5, aVar6, aVarB2, r8Var2.f119698b, (jki.p) r8Var2.f119702j.get());
                    case 6:
                        CreditLinkedAccountsV2ListScreenContract$InputData creditLinkedAccountsV2ListScreenContract$InputData2 = r8Var2.f119698b;
                        je6.h hVarC2 = ((xf6.t) c1Var2.R).c();
                        vc.s.j(hVarC2);
                        return new cd4.n(creditLinkedAccountsV2ListScreenContract$InputData2, hVarC2);
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                t8 t8Var = (t8) this.e;
                AnimatedIntroScreenContract$InputData animatedIntroScreenContract$InputData = t8Var.f119868b;
                int i3 = this.f119607c;
                if (i3 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) t8Var.f119869c.get(), (c84.b) t8Var.d.get(), (PluginFlowContract$Input) ((q4) this.d).i.get());
                }
                if (i3 == 1) {
                    return new c84.b();
                }
                if (i3 == 2) {
                    return new df4.g((cli.n) t8Var.f119870g.get(), animatedIntroScreenContract$InputData, (rx3.a) ((c1) this.f119606b).f118473s1.get());
                }
                if (i3 == 3) {
                    return new df4.h(animatedIntroScreenContract$InputData);
                }
                throw new AssertionError(i3);
            case 3:
                t8 t8Var2 = (t8) this.e;
                AnimatedIntroScreenContract$InputData animatedIntroScreenContract$InputData2 = t8Var2.f119868b;
                int i5 = this.f119607c;
                if (i5 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) t8Var2.f119869c.get(), (c84.b) t8Var2.d.get(), (PluginFlowContract$Input) ((f4) this.d).i.get());
                }
                if (i5 == 1) {
                    return new c84.b();
                }
                if (i5 == 2) {
                    return new df4.g((cli.n) t8Var2.f119870g.get(), animatedIntroScreenContract$InputData2, (rx3.a) ((c1) this.f119606b).f118473s1.get());
                }
                if (i5 == 3) {
                    return new df4.h(animatedIntroScreenContract$InputData2);
                }
                throw new AssertionError(i5);
            case 4:
                t8 t8Var3 = (t8) this.e;
                AnimatedIntroScreenContract$InputData animatedIntroScreenContract$InputData3 = t8Var3.f119868b;
                int i6 = this.f119607c;
                if (i6 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) t8Var3.f119869c.get(), (c84.b) t8Var3.d.get(), (PluginFlowContract$Input) ((n4) this.d).i.get());
                }
                if (i6 == 1) {
                    return new c84.b();
                }
                if (i6 == 2) {
                    return new df4.g((cli.n) t8Var3.f119870g.get(), animatedIntroScreenContract$InputData3, (rx3.a) ((c1) this.f119606b).f118473s1.get());
                }
                if (i6 == 3) {
                    return new df4.h(animatedIntroScreenContract$InputData3);
                }
                throw new AssertionError(i6);
            case 5:
                f4 f4Var = (f4) this.d;
                c1 c1Var3 = (c1) this.f119606b;
                v8 v8Var = (v8) this.e;
                OfferContentScreenContract$InputData offerContentScreenContract$InputData = v8Var.f120026b;
                int i21 = this.f119607c;
                if (i21 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) v8Var.d.get(), (c84.b) v8Var.e.get(), (PluginFlowContract$Input) f4Var.i.get());
                }
                if (i21 == 1) {
                    return new c84.b();
                }
                if (i21 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var3.f118443h, (com.revolut.kompot.navigable.a) v8Var.d.get());
                }
                if (i21 == 3) {
                    lx4.a aVarE = c1Var3.f118489y.e();
                    return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var3.f118485x).d());
                }
                if (i21 == 4) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b((cx4.a) v8Var.f120029h.get(), (pf4.v) f4Var.v.get(), offerContentScreenContract$InputData, (cli.n) v8Var.f120030j.get());
                }
                if (i21 == 5) {
                    return new qf4.g(new pf4.b(v8Var.f120027c.f118489y.c(), new ae4.a(), offerContentScreenContract$InputData, new q74.b()), 0);
                }
                throw new AssertionError(i21);
            case 6:
                q4 q4Var = (q4) this.d;
                c1 c1Var4 = (c1) this.f119606b;
                v8 v8Var2 = (v8) this.e;
                OfferContentScreenContract$InputData offerContentScreenContract$InputData2 = v8Var2.f120026b;
                int i22 = this.f119607c;
                if (i22 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) v8Var2.d.get(), (c84.b) v8Var2.e.get(), (PluginFlowContract$Input) q4Var.i.get());
                }
                if (i22 == 1) {
                    return new c84.b();
                }
                if (i22 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var4.f118443h, (com.revolut.kompot.navigable.a) v8Var2.d.get());
                }
                if (i22 == 3) {
                    lx4.a aVarE2 = c1Var4.f118489y.e();
                    return new kx4.a(aVarE2, com.revolut.data.database.models.openbanking.d.v(aVarE2), ((s41.a) c1Var4.f118485x).d());
                }
                if (i22 == 4) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b((cx4.a) v8Var2.f120029h.get(), (pf4.v) q4Var.f119582y.get(), offerContentScreenContract$InputData2, (cli.n) v8Var2.f120030j.get());
                }
                if (i22 == 5) {
                    return new qf4.g(new pf4.b(v8Var2.f120027c.f118489y.c(), new ae4.a(), offerContentScreenContract$InputData2, new q74.b()), 0);
                }
                throw new AssertionError(i22);
            case 7:
                f4 f4Var2 = (f4) this.d;
                c1 c1Var5 = (c1) this.f119606b;
                x8 x8Var = (x8) this.e;
                int i32 = this.f119607c;
                switch (i32) {
                    case 0:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x8Var.e.get(), (c84.b) x8Var.f.get(), (PluginFlowContract$Input) f4Var2.i.get());
                    case 1:
                        return new c84.b();
                    case 2:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var5.f118443h, (com.revolut.kompot.navigable.a) x8Var.e.get());
                    case 3:
                        return new a84.e((a84.b) x8Var.i.get());
                    case 4:
                        return agk.b.l(x8Var.f120175b);
                    case 5:
                        lx4.a aVarE3 = c1Var5.f118489y.e();
                        return new kx4.a(aVarE3, com.revolut.data.database.models.openbanking.d.v(aVarE3), ((s41.a) c1Var5.f118485x).d());
                    case 6:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c((cx4.a) x8Var.k.get(), (nf4.l) f4Var2.v.get(), (ow3.e) c1Var5.Y0.get(), x8Var.f120176c, (cli.n) x8Var.f120181m.get());
                    case 7:
                        return new nf4.s(new kl.b0(x8Var.d.f118489y.c()), new ae4.a(), x8Var.f120176c);
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                n4 n4Var = (n4) this.d;
                c1 c1Var6 = (c1) this.f119606b;
                z8 z8Var = (z8) this.e;
                int i33 = this.f119607c;
                switch (i33) {
                    case 0:
                        return kxa.j.k((j60.a) z8Var.f120323g.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) z8Var.e.get(), (rp0.m) z8Var.f.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return e5f.b.e((com.revolut.kompot.navigable.a) z8Var.e.get(), (c84.b) z8Var.i.get(), (PluginFlowContract$Input) n4Var.i.get());
                    case 4:
                        return new c84.b();
                    case 5:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var6.f118443h, (com.revolut.kompot.navigable.a) z8Var.e.get());
                    case 6:
                        return new a84.e((a84.b) z8Var.f120326l.get());
                    case 7:
                        return agk.b.l(z8Var.f120321b);
                    case 8:
                        lx4.a aVarE4 = c1Var6.f118489y.e();
                        return new kx4.a(aVarE4, com.revolut.data.database.models.openbanking.d.v(aVarE4), ((s41.a) c1Var6.f118485x).d());
                    case 9:
                        return new ff4.b0((cli.n) z8Var.f120330q.get(), z8Var.f120322c, (cx4.a) z8Var.f120328n.get(), (ff4.t) n4Var.v.get(), new f64.a(), (j60.a) z8Var.f120323g.get());
                    case 10:
                        return new ff4.e0(new ff4.b((c90.c) z8Var.f120329p.get(), z8Var.d.f118489y.c()));
                    case 11:
                        return jr9.h.A((com.revolut.kompot.navigable.a) z8Var.e.get());
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                s0 s0Var = (s0) this.d;
                c1 c1Var7 = (c1) this.f119606b;
                x8 x8Var2 = (x8) this.e;
                int i43 = this.f119607c;
                switch (i43) {
                    case 0:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x8Var2.e.get(), (c84.b) x8Var2.f.get(), (PluginFlowContract$Input) s0Var.i.get());
                    case 1:
                        return new c84.b();
                    case 2:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var7.f118443h, (com.revolut.kompot.navigable.a) x8Var2.e.get());
                    case 3:
                        return new a84.e((a84.b) x8Var2.i.get());
                    case 4:
                        return agk.b.l(x8Var2.f120175b);
                    case 5:
                        lx4.a aVarE5 = c1Var7.f118489y.e();
                        return new kx4.a(aVarE5, com.revolut.data.database.models.openbanking.d.v(aVarE5), ((s41.a) c1Var7.f118485x).d());
                    case 6:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c((cx4.a) x8Var2.k.get(), (nf4.l) s0Var.f119724x.get(), (ow3.e) c1Var7.Y0.get(), x8Var2.f120176c, (cli.n) x8Var2.f120181m.get());
                    case 7:
                        return new nf4.s(new kl.b0(x8Var2.d.f118489y.c()), new ae4.a(), x8Var2.f120176c);
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                q4 q4Var2 = (q4) this.d;
                c1 c1Var8 = (c1) this.f119606b;
                x8 x8Var3 = (x8) this.e;
                int i59 = this.f119607c;
                switch (i59) {
                    case 0:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x8Var3.e.get(), (c84.b) x8Var3.f.get(), (PluginFlowContract$Input) q4Var2.i.get());
                    case 1:
                        return new c84.b();
                    case 2:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var8.f118443h, (com.revolut.kompot.navigable.a) x8Var3.e.get());
                    case 3:
                        return new a84.e((a84.b) x8Var3.i.get());
                    case 4:
                        return agk.b.l(x8Var3.f120175b);
                    case 5:
                        lx4.a aVarE6 = c1Var8.f118489y.e();
                        return new kx4.a(aVarE6, com.revolut.data.database.models.openbanking.d.v(aVarE6), ((s41.a) c1Var8.f118485x).d());
                    case 6:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c((cx4.a) x8Var3.k.get(), (nf4.l) q4Var2.f119582y.get(), (ow3.e) c1Var8.Y0.get(), x8Var3.f120176c, (cli.n) x8Var3.f120181m.get());
                    case 7:
                        return new nf4.s(new kl.b0(x8Var3.d.f118489y.c()), new ae4.a(), x8Var3.f120176c);
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                p5 p5Var = (p5) this.d;
                c1 c1Var9 = (c1) this.f119606b;
                z8 z8Var2 = (z8) this.e;
                int i66 = this.f119607c;
                switch (i66) {
                    case 0:
                        return kxa.j.k((j60.a) z8Var2.f120323g.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) z8Var2.e.get(), (rp0.m) z8Var2.f.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return e5f.b.e((com.revolut.kompot.navigable.a) z8Var2.e.get(), (c84.b) z8Var2.i.get(), (PluginFlowContract$Input) p5Var.i.get());
                    case 4:
                        return new c84.b();
                    case 5:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var9.f118443h, (com.revolut.kompot.navigable.a) z8Var2.e.get());
                    case 6:
                        return new a84.e((a84.b) z8Var2.f120326l.get());
                    case 7:
                        return agk.b.l(z8Var2.f120321b);
                    case 8:
                        lx4.a aVarE7 = c1Var9.f118489y.e();
                        return new kx4.a(aVarE7, com.revolut.data.database.models.openbanking.d.v(aVarE7), ((s41.a) c1Var9.f118485x).d());
                    case 9:
                        return new ff4.b0((cli.n) z8Var2.f120330q.get(), z8Var2.f120322c, (cx4.a) z8Var2.f120328n.get(), (ff4.t) p5Var.f119526x.get(), new f64.a(), (j60.a) z8Var2.f120323g.get());
                    case 10:
                        return new ff4.e0(new ff4.b((c90.c) z8Var2.f120329p.get(), z8Var2.d.f118489y.c()));
                    case 11:
                        return jr9.h.A((com.revolut.kompot.navigable.a) z8Var2.e.get());
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                f4 f4Var3 = (f4) this.d;
                c1 c1Var10 = (c1) this.f119606b;
                b9 b9Var = (b9) this.e;
                OfferContentScreenContract$InputData offerContentScreenContract$InputData3 = b9Var.f118397b;
                int i74 = this.f119607c;
                if (i74 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) b9Var.d.get(), (c84.b) b9Var.e.get(), (PluginFlowContract$Input) f4Var3.i.get());
                }
                if (i74 == 1) {
                    return new c84.b();
                }
                if (i74 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var10.f118443h, (com.revolut.kompot.navigable.a) b9Var.d.get());
                }
                if (i74 == 3) {
                    lx4.a aVarE8 = c1Var10.f118489y.e();
                    return new kx4.a(aVarE8, com.revolut.data.database.models.openbanking.d.v(aVarE8), ((s41.a) c1Var10.f118485x).d());
                }
                if (i74 == 4) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b((cx4.a) b9Var.f118400h.get(), (pf4.v) f4Var3.v.get(), offerContentScreenContract$InputData3, (cli.n) b9Var.f118401j.get());
                }
                if (i74 == 5) {
                    return new qf4.g(new pf4.b(b9Var.f118398c.f118489y.c(), new ae4.a(), offerContentScreenContract$InputData3, new q74.b()), 1);
                }
                throw new AssertionError(i74);
            case 13:
                q4 q4Var3 = (q4) this.d;
                c1 c1Var11 = (c1) this.f119606b;
                b9 b9Var2 = (b9) this.e;
                OfferContentScreenContract$InputData offerContentScreenContract$InputData4 = b9Var2.f118397b;
                int i92 = this.f119607c;
                if (i92 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) b9Var2.d.get(), (c84.b) b9Var2.e.get(), (PluginFlowContract$Input) q4Var3.i.get());
                }
                if (i92 == 1) {
                    return new c84.b();
                }
                if (i92 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var11.f118443h, (com.revolut.kompot.navigable.a) b9Var2.d.get());
                }
                if (i92 == 3) {
                    lx4.a aVarE9 = c1Var11.f118489y.e();
                    return new kx4.a(aVarE9, com.revolut.data.database.models.openbanking.d.v(aVarE9), ((s41.a) c1Var11.f118485x).d());
                }
                if (i92 == 4) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b((cx4.a) b9Var2.f118400h.get(), (pf4.v) q4Var3.f119582y.get(), offerContentScreenContract$InputData4, (cli.n) b9Var2.f118401j.get());
                }
                if (i92 == 5) {
                    return new qf4.g(new pf4.b(b9Var2.f118398c.f118489y.c(), new ae4.a(), offerContentScreenContract$InputData4, new q74.b()), 1);
                }
                throw new AssertionError(i92);
            case 14:
                e1 e1Var = (e1) this.d;
                c1 c1Var12 = (c1) this.f119606b;
                d9 d9Var = (d9) this.e;
                OfferContentScreenContract$InputData offerContentScreenContract$InputData5 = d9Var.f118598b;
                int i96 = this.f119607c;
                if (i96 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) d9Var.d.get(), (c84.b) d9Var.e.get(), (PluginFlowContract$Input) e1Var.i.get());
                }
                if (i96 == 1) {
                    return new c84.b();
                }
                if (i96 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var12.f118443h, (com.revolut.kompot.navigable.a) d9Var.d.get());
                }
                if (i96 == 3) {
                    lx4.a aVarE10 = c1Var12.f118489y.e();
                    return new kx4.a(aVarE10, com.revolut.data.database.models.openbanking.d.v(aVarE10), ((s41.a) c1Var12.f118485x).d());
                }
                if (i96 == 4) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b((cx4.a) d9Var.f118601h.get(), (pf4.v) e1Var.C.get(), offerContentScreenContract$InputData5, (cli.n) d9Var.f118602j.get());
                }
                if (i96 == 5) {
                    return new kxk.o(offerContentScreenContract$InputData5, new pf4.b(d9Var.f118599c.f118489y.c(), new ae4.a(), offerContentScreenContract$InputData5, new q74.b()), new q74.b());
                }
                throw new AssertionError(i96);
            case 15:
                f4 f4Var4 = (f4) this.d;
                c1 c1Var13 = (c1) this.f119606b;
                d9 d9Var2 = (d9) this.e;
                OfferContentScreenContract$InputData offerContentScreenContract$InputData6 = d9Var2.f118598b;
                int i99 = this.f119607c;
                if (i99 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) d9Var2.d.get(), (c84.b) d9Var2.e.get(), (PluginFlowContract$Input) f4Var4.i.get());
                }
                if (i99 == 1) {
                    return new c84.b();
                }
                if (i99 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var13.f118443h, (com.revolut.kompot.navigable.a) d9Var2.d.get());
                }
                if (i99 == 3) {
                    lx4.a aVarE11 = c1Var13.f118489y.e();
                    return new kx4.a(aVarE11, com.revolut.data.database.models.openbanking.d.v(aVarE11), ((s41.a) c1Var13.f118485x).d());
                }
                if (i99 == 4) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b((cx4.a) d9Var2.f118601h.get(), (pf4.v) f4Var4.v.get(), offerContentScreenContract$InputData6, (cli.n) d9Var2.f118602j.get());
                }
                if (i99 == 5) {
                    return new kxk.o(offerContentScreenContract$InputData6, new pf4.b(d9Var2.f118599c.f118489y.c(), new ae4.a(), offerContentScreenContract$InputData6, new q74.b()), new q74.b());
                }
                throw new AssertionError(i99);
            case 16:
                v4 v4Var = (v4) this.d;
                c1 c1Var14 = (c1) this.f119606b;
                d9 d9Var3 = (d9) this.e;
                OfferContentScreenContract$InputData offerContentScreenContract$InputData7 = d9Var3.f118598b;
                int i100 = this.f119607c;
                if (i100 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) d9Var3.d.get(), (c84.b) d9Var3.e.get(), (PluginFlowContract$Input) v4Var.i.get());
                }
                if (i100 == 1) {
                    return new c84.b();
                }
                if (i100 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var14.f118443h, (com.revolut.kompot.navigable.a) d9Var3.d.get());
                }
                if (i100 == 3) {
                    lx4.a aVarE12 = c1Var14.f118489y.e();
                    return new kx4.a(aVarE12, com.revolut.data.database.models.openbanking.d.v(aVarE12), ((s41.a) c1Var14.f118485x).d());
                }
                if (i100 == 4) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b((cx4.a) d9Var3.f118601h.get(), (pf4.v) v4Var.u.get(), offerContentScreenContract$InputData7, (cli.n) d9Var3.f118602j.get());
                }
                if (i100 == 5) {
                    return new kxk.o(offerContentScreenContract$InputData7, new pf4.b(d9Var3.f118599c.f118489y.c(), new ae4.a(), offerContentScreenContract$InputData7, new q74.b()), new q74.b());
                }
                throw new AssertionError(i100);
            case 17:
                return a();
            case 18:
                return b();
            case 19:
                return c();
            case 20:
                return d();
            case 21:
                return e();
            case 22:
                return f();
            case 23:
                return g();
            case 24:
                return h();
            case 25:
                return i();
            case 26:
                return j();
            case 27:
                return k();
            case 28:
                return l();
            default:
                ehe.b bVar = (ehe.b) this.d;
                ehe.c cVar = (ehe.c) this.f119606b;
                ehe.l lVar = (ehe.l) this.e;
                int i101 = this.f119607c;
                switch (i101) {
                    case 0:
                        fd6.a aVar7 = (fd6.a) lVar.d.get();
                        va.g.t(aVar7);
                        return aVar7;
                    case 1:
                        return va.g.s(((zc6.a) cVar.M).d(), (xc6.a) lVar.f126069c.get());
                    case 2:
                        return r6.b.k((zc6.a) cVar.M, "factory");
                    case 3:
                        return ufg.p0.z((Map) lVar.f126080t.get());
                    case 4:
                        return ufg.p0.B((com.revolut.kompot.navigable.a) lVar.f.get(), ehe.n.r(), (Map) lVar.f126079s.get());
                    case 5:
                        return ufg.p0.A(lVar.c());
                    case 6:
                        vy5.k0 provider = ((yy5.b) cVar.f125993t).d();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        return provider;
                    case 7:
                        pfe.d provider2 = ((c89.a) cVar.u).a();
                        vc.s.j(provider2);
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        return provider2;
                    case 8:
                        pfe.d provider3 = ((k78.b) cVar.i).r();
                        vc.s.j(provider3);
                        Intrinsics.checkNotNullParameter(provider3, "provider");
                        return provider3;
                    case 9:
                        pfe.d provider4 = ((eqe.a) cVar.f125980j).a();
                        vc.s.j(provider4);
                        Intrinsics.checkNotNullParameter(provider4, "provider");
                        return provider4;
                    case 10:
                        pfe.d provider5 = ((c6e.a) cVar.f).a();
                        vc.s.j(provider5);
                        Intrinsics.checkNotNullParameter(provider5, "provider");
                        return provider5;
                    case 11:
                        pfe.d provider6 = ((fob.a) cVar.k).d();
                        vc.s.j(provider6);
                        Intrinsics.checkNotNullParameter(provider6, "provider");
                        return provider6;
                    case 12:
                        pfe.d provider7 = ((t15.d) cVar.f125978h).g();
                        vc.s.j(provider7);
                        Intrinsics.checkNotNullParameter(provider7, "provider");
                        return provider7;
                    case 13:
                        pfe.d provider8 = ((yha.a) cVar.o).c();
                        vc.s.j(provider8);
                        Intrinsics.checkNotNullParameter(provider8, "provider");
                        return provider8;
                    case 14:
                        pfe.d provider9 = ((xf6.q1) cVar.f125977g).a();
                        vc.s.j(provider9);
                        Intrinsics.checkNotNullParameter(provider9, "provider");
                        return provider9;
                    case 15:
                        pfe.d provider10 = ((q38.b) cVar.f125984n).c();
                        vc.s.j(provider10);
                        Intrinsics.checkNotNullParameter(provider10, "provider");
                        return provider10;
                    case 16:
                        pfe.d provider11 = ((q38.b) cVar.f125984n).a();
                        vc.s.j(provider11);
                        Intrinsics.checkNotNullParameter(provider11, "provider");
                        return provider11;
                    case 17:
                        lVar.getClass();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(8);
                        yfe.a aVar8 = yfe.a.Crypto;
                        ehe.c cVar2 = lVar.f126067a;
                        yfe.d dVarA = cVar2.A.a();
                        vc.s.j(dVarA);
                        builderBuilderWithExpectedSize.put(aVar8, dVarA);
                        builderBuilderWithExpectedSize.put(yfe.a.Invest, ((mkh.s) cVar2.B).c());
                        yfe.a aVar9 = yfe.a.Credit;
                        yfe.d dVarF = ((t15.d) cVar2.f125978h).f();
                        vc.s.j(dVarF);
                        builderBuilderWithExpectedSize.put(aVar9, dVarF);
                        yfe.a aVar10 = yfe.a.Joint;
                        yfe.d dVarB = ((q38.b) cVar2.f125984n).b();
                        vc.s.j(dVarB);
                        builderBuilderWithExpectedSize.put(aVar10, dVarB);
                        yfe.a aVar11 = yfe.a.Pro;
                        yfe.d dVarB2 = ((yha.a) cVar2.o).b();
                        vc.s.j(dVarB2);
                        builderBuilderWithExpectedSize.put(aVar11, dVarB2);
                        yfe.a aVar12 = yfe.a.Youth;
                        yfe.d dVarS = ((k78.b) cVar2.i).s();
                        vc.s.j(dVarS);
                        builderBuilderWithExpectedSize.put(aVar12, dVarS);
                        yfe.a aVar13 = yfe.a.Savings;
                        yfe.d dVarE = ((fob.a) cVar2.k).e();
                        vc.s.j(dVarE);
                        builderBuilderWithExpectedSize.put(aVar13, dVarE);
                        yfe.a aVar14 = yfe.a.Linked;
                        yfe.d dVarE2 = ((xf6.t) cVar2.z).e();
                        vc.s.j(dVarE2);
                        builderBuilderWithExpectedSize.put(aVar14, dVarE2);
                        ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                        oqk.l lVarB = cVar2.E.b();
                        vc.s.j(lVarB);
                        ehe.b bVar2 = lVar.f126068b;
                        nhe.t provider12 = new nhe.t(immutableMapBuild, lVarB, (ahe.n) bVar2.f125961s.get(), (ahe.t) bVar2.v.get(), new uge.e(), cVar2.f125988q.a(), cVar2.f125998x.c(), cVar2.f125983m.e(), new nhe.g(), new kl.c0(cVar2.P.b()));
                        Intrinsics.checkNotNullParameter(provider12, "provider");
                        return provider12;
                    case 18:
                        oa7.a extension = (oa7.a) lVar.v.get();
                        bie.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 19:
                        kbb.c provider13 = cVar.f125991s.b();
                        bie.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider13, "provider");
                        return provider13.R();
                    case 20:
                        return pge.b.a((oge.f) lVar.f126082x.get());
                    case 21:
                        fVar = new oge.f((vge.z2) bVar.B.get(), (zge.a) bVar.F.get());
                        break;
                    case 22:
                        return va.g.u((xc6.a) lVar.f126069c.get());
                    case 23:
                        return ufg.p0.y((Map) lVar.B.get());
                    case 24:
                        ImmutableMap immutableMapC = lVar.c();
                        Map map = (Map) lVar.f126080t.get();
                        rp0.l0 l0Var = (rp0.l0) lVar.A.get();
                        gte.a aVarB3 = lVar.f126067a.v.b();
                        vc.s.j(aVarB3);
                        return ufg.p0.g(immutableMapC, map, l0Var, new vhe.a(aVarB3), (com.revolut.kompot.navigable.a) lVar.f.get());
                    case 25:
                        return ufg.p0.v((com.revolut.kompot.navigable.a) lVar.f.get());
                    case 26:
                        com.revolut.feature.tab.accounts.impl.ui.spaces.j jVarB = lVar.b();
                        com.revolut.feature.tab.accounts.impl.ui.spaces.c cVar3 = (com.revolut.feature.tab.accounts.impl.ui.spaces.c) lVar.E.get();
                        xge.a aVar15 = (xge.a) bVar.z.get();
                        vge.z2 z2Var = (vge.z2) bVar.B.get();
                        rp0.l0 l0Var2 = (rp0.l0) lVar.A.get();
                        l70.e eVar = cVar.T;
                        ta7.a aVar16 = cVar.f125991s;
                        r70.c cVarA = eVar.A();
                        vc.s.j(cVarA);
                        vfg.p pVarA = aVar16.a();
                        wa7.m mVarI = aVar16.i();
                        oa7.a aVar17 = (oa7.a) lVar.v.get();
                        the.a aVar18 = (the.a) lVar.F.get();
                        fhe.a aVarA = hhe.c.a();
                        i4b.f fVarB = ((zc6.a) cVar.M).b();
                        ghe.a aVar19 = new ghe.a();
                        sge.c.a();
                        return new com.revolut.feature.tab.accounts.impl.ui.spaces.i(jVarB, cVar3, aVar15, z2Var, l0Var2, cVarA, pVarA, mVarI, aVar17, aVar18, aVarA, fVarB, aVar19, TabAccountsMode.Home.f89466a, new uge.e(), e4m.b.a(bVar.v));
                    case 27:
                        return new com.revolut.feature.tab.accounts.impl.ui.spaces.k(new com.revolut.feature.tab.accounts.impl.ui.spaces.a());
                    case 28:
                        fVar = new com.revolut.feature.tab.accounts.impl.ui.spaces.c(lVar.b(), (xge.a) bVar.z.get());
                        break;
                    case 29:
                        return new the.a((Map) lVar.B.get());
                    default:
                        throw new AssertionError(i101);
                }
                return fVar;
        }
    }
}
