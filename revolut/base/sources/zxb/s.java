package zxb;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.wrapped.cards.RevPointsWrappedCardsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import i60.b;
import java.util.Collection;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1c.i1;
import om4.b4;
import qgk.k3;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f326256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f326257c;
    public final Object d;

    public /* synthetic */ s(Object obj2, Object obj3, int i, int i2) {
        this.f326255a = i2;
        this.f326256b = obj2;
        this.d = obj3;
        this.f326257c = i;
    }

    private final Object a() {
        zz7.c cVar = (zz7.c) this.f326256b;
        zz7.d dVar = (zz7.d) this.d;
        int i = this.f326257c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(dVar.f326560a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(dVar.f326560a);
                t70.g gVarO = cVar.f326544b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) dVar.e.get(), gsi.c.a(dVar.f326560a));
            case 3:
                return new rpi.b(bq.i.b(dVar.f326560a));
            case 4:
                return new rpi.h(bq.i.b(dVar.f326560a));
            case 5:
                return new iri.g((iri.j) cVar.f326547h.get(), cVar.b(), bq.i.f(dVar.f326560a), bq.i.l(dVar.f326560a));
            case 6:
                return new iri.l(cVar.b(), bq.i.f(dVar.f326560a), (iri.d) dVar.i.get());
            case 7:
                return new iri.d(bq.i.f(dVar.f326560a));
            case 8:
                return new opi.b(bq.i.f(dVar.f326560a));
            case 9:
                return new en.c(ImmutableSet.of((ln.d) dVar.f326561b.f326548j.get()), bq.i.l(dVar.f326560a));
            case 10:
                dVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(dVar.f326560a));
            case 11:
                dVar.getClass();
                return new iqi.b(iqi.g.f167870b, bq.i.b(dVar.f326560a));
            case 12:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize.add(dVar.f326561b.f326554r.get());
                builderBuilderWithExpectedSize.addAll((Iterable) dn.b.a());
                return new cn.d(builderBuilderWithExpectedSize.build(), (cn.e) cVar.o.get(), cVar.c());
            case 13:
                um.c cVar2 = (um.c) cVar.f326553q.get();
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(6);
                zz7.c cVar3 = dVar.f326561b;
                builderBuilderWithExpectedSize2.add(cVar3.f326558x.get());
                hn.h hVar = (hn.h) cVar3.f326559y.get();
                t70.g gVarO2 = cVar3.f326544b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize2.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize2.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize2.add(cVar3.h());
                builderBuilderWithExpectedSize2.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize2.add(new jn.d(e4m.b.a(dVar.f326569p)));
                return new in.e(cVar2, builderBuilderWithExpectedSize2.build(), cVar.c());
            case 14:
                return bq.i.t(dVar.f326560a);
            case 15:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize3.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize3.add(dVar.f326571r.get());
                builderBuilderWithExpectedSize3.add(new kn.h(e4m.b.a(dVar.f)));
                return new kn.e(builderBuilderWithExpectedSize3.build(), (ym.d) cVar.f326552p.get(), cVar.c());
            case 16:
                return new zm.a();
            case 17:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize4.add(dVar.f326561b.h());
                return new hn.d(builderBuilderWithExpectedSize4.build(), (hn.h) cVar.f326559y.get(), (npi.f) dVar.d.get());
            case 18:
                return new gn.c((lpi.e) dVar.u.get(), (sm.e) cVar.D.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar.c());
            case 19:
                return new lpi.b(bq.i.i(dVar.f326560a), bq.i.j(dVar.f326560a));
            case 20:
                dVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar.E.get(), cVar.c());
            case 21:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize5.addAll((Iterable) g3l.f.a());
                zz7.c cVar4 = dVar.f326561b;
                builderBuilderWithExpectedSize5.add(cVar4.f326558x.get());
                return new g3l.c(j6.a.g(cVar4.A, builderBuilderWithExpectedSize5), (g3l.g) cVar.f326555s.get(), (k3l.b) dVar.f326575x.get(), cVar.c());
            case 22:
                return new k3l.d(bq.i.b(dVar.f326560a));
            case 23:
                xz7.m mVar = new xz7.m((xpi.g) dVar.f326567m.get(), (iqi.h) dVar.f326568n.get(), (uz7.b) cVar.f326557w.get(), (uz7.a) cVar.v.get(), (tpi.j) dVar.f.get(), (f9b.f) dVar.f326569p.get(), new yz7.a(), new tsk.t((mm.d) dVar.f326561b.z.get()));
                kli.a.p(mVar, bq.i.d(dVar.f326560a));
                return mVar;
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object hVar;
        Object cVar;
        switch (this.f326255a) {
            case 0:
                t tVar = (t) this.d;
                e eVar = (e) this.f326256b;
                int i = this.f326257c;
                switch (i) {
                    case 0:
                        fd6.a aVar = (fd6.a) tVar.d.get();
                        va.g.t(aVar);
                        return aVar;
                    case 1:
                        return va.g.s(((zc6.a) eVar.f326134t).d(), (xc6.a) tVar.f326263c.get());
                    case 2:
                        return r6.b.k((zc6.a) eVar.f326134t, "factory");
                    case 3:
                        ImmutableMap handlersMap = tVar.b();
                        d0c.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(handlersMap, "handlersMap");
                        Set setI1 = zhm.d0.i1(handlersMap.values());
                        vc.s.k(setI1);
                        return setI1;
                    case 4:
                        ifg.a aVar2 = (ifg.a) eVar.u.d.get();
                        vc.s.j(aVar2);
                        return new e0c.a(aVar2);
                    case 5:
                        jm4.r rVar = eVar.v;
                        al4.q qVarA = rVar.f176290a.a();
                        vc.s.j(qVarA);
                        return new e0c.a(new an4.k(qVarA, rVar.o.a()));
                    case 6:
                        return new e0c.e();
                    case 7:
                        b6c.c cVarB = eVar.f326135w.b();
                        vc.s.j(cVarB);
                        h30.q qVarD = eVar.f326136x.d();
                        gte.a aVarB = eVar.f326124g.b();
                        vc.s.j(aVarB);
                        return new e0c.h(cVarB, qVarD, aVarB);
                    case 8:
                        return new e0c.a(eVar.f326137y.a());
                    case 9:
                        fej.b bVarM = eVar.z.m();
                        vc.s.j(bVarM);
                        return new e0c.a(bVarM);
                    case 10:
                        return new e0c.a(eVar.A.b());
                    case 11:
                        tvi.a aVar3 = (tvi.a) eVar.B.f109793d0.get();
                        vc.s.j(aVar3);
                        return new e0c.a(aVar3);
                    case 12:
                        cti.a aVar4 = (cti.a) eVar.C.i.get();
                        vc.s.j(aVar4);
                        return new e0c.a(aVar4);
                    case 13:
                        puf.a aVar5 = (puf.a) ((hvf.b) eVar.D).u.get();
                        vc.s.j(aVar5);
                        return new e0c.a(aVar5);
                    case 14:
                        return new e0c.b();
                    case 15:
                        return new e0c.c();
                    case 16:
                        return new e0c.k();
                    case 17:
                        return new e0c.i();
                    case 18:
                        return new e0c.j();
                    case 19:
                        return new e0c.f();
                    case 20:
                        return va.g.u((xc6.a) tVar.f326263c.get());
                    case 21:
                        c0c.t view = tVar.f326261a;
                        rkd.m factory = eVar.E.a();
                        vc.s.j(factory);
                        d0c.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(view);
                    case 22:
                        cli.n nVar = (cli.n) tVar.A.get();
                        RevPointsRedeemScreenContract$InputData revPointsRedeemScreenContract$InputData = tVar.f326262b;
                        ozb.f fVar = (ozb.f) eVar.f326123e0.get();
                        nyb.k kVarC = eVar.f.c();
                        vc.s.j(kVarC);
                        c0c.a aVar6 = (c0c.a) tVar.S.get();
                        ImmutableMap immutableMapB = tVar.b();
                        q06.l lVarA = eVar.f326132r.a();
                        vc.s.j(lVarA);
                        mkd.d dVar = (mkd.d) tVar.f326276x.get();
                        i4b.f fVarB = ((zc6.a) eVar.f326134t).b();
                        gte.a aVarB2 = eVar.f326124g.b();
                        vc.s.j(aVarB2);
                        p19.a aVarA = ((o19.b) eVar.M).a();
                        vc.s.j(aVarA);
                        return new c0c.s(nVar, revPointsRedeemScreenContract$InputData, fVar, kVarC, aVar6, immutableMapB, lVarA, dVar, fVarB, aVarB2, aVarA);
                    case 23:
                        return new f0c.l((f0c.i) tVar.f326277y.get(), (f0c.n) tVar.z.get(), new f0c.d(y0.w(eVar.f326121c)), new f0c.h(y0.w(eVar.f326121c)), new f0c.a(), ((zc6.a) eVar.f326134t).c());
                    case 24:
                        return new f0c.j();
                    case 25:
                        return new f0c.o();
                    case 26:
                        nyb.i0 i0VarF = eVar.f.f();
                        vc.s.j(i0VarF);
                        tVar.getClass();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(16);
                        builderBuilderWithExpectedSize.put(i1.MILES, tVar.C);
                        builderBuilderWithExpectedSize.put(i1.CREDIT_CARD, tVar.D);
                        builderBuilderWithExpectedSize.put(i1.GIFT_CARDS, tVar.E);
                        builderBuilderWithExpectedSize.put(i1.REVPAY, tVar.F);
                        builderBuilderWithExpectedSize.put(i1.STAYS, tVar.G);
                        builderBuilderWithExpectedSize.put(i1.ESIM, tVar.H);
                        builderBuilderWithExpectedSize.put(i1.EXPERIENCES, tVar.I);
                        builderBuilderWithExpectedSize.put(i1.LOUNGES, tVar.J);
                        builderBuilderWithExpectedSize.put(i1.FAST_TRACK, tVar.K);
                        builderBuilderWithExpectedSize.put(i1.TRANSPORT, tVar.L);
                        builderBuilderWithExpectedSize.put(i1.CRYPTO, tVar.M);
                        builderBuilderWithExpectedSize.put(i1.DONATIONS, tVar.N);
                        builderBuilderWithExpectedSize.put(i1.VIRTUAL_CARDS, tVar.O);
                        builderBuilderWithExpectedSize.put(i1.THEMES, tVar.P);
                        builderBuilderWithExpectedSize.put(i1.TRAINS, tVar.Q);
                        builderBuilderWithExpectedSize.put(i1.HOTELS_POINTS, tVar.R);
                        return new c0c.a(i0VarF, builderBuilderWithExpectedSize.build());
                    case 27:
                        vfg.g gVar = (vfg.g) eVar.u.f279774c.get();
                        vc.s.j(gVar);
                        return new g0c.b(gVar, (h0c.a) tVar.B.get());
                    case 28:
                        return new h0c.b();
                    case 29:
                        b4 b4Var = (b4) eVar.v.O.get();
                        vc.s.j(b4Var);
                        return new g0c.b(b4Var, (h0c.a) tVar.B.get());
                    case 30:
                        svb.a aVarA2 = eVar.F.a();
                        vc.s.j(aVarA2);
                        return new g0c.b(aVarA2, (h0c.a) tVar.B.get());
                    case 31:
                        kcc.a aVar7 = (kcc.a) eVar.G.f172778q.get();
                        vc.s.j(aVar7);
                        d9c.d dVar2 = (d9c.d) eVar.f326135w.f233705h.get();
                        vc.s.j(dVar2);
                        return new g0c.b(aVar7, dVar2);
                    case 32:
                        p8g.c cVarB2 = eVar.f326137y.b();
                        vc.s.j(cVarB2);
                        eub.a aVarA3 = eVar.f.a();
                        vc.s.j(aVarA3);
                        return new g0c.v(cVarB2, aVarA3, (h0c.a) tVar.B.get());
                    case 33:
                        cej.a aVarL = eVar.z.l();
                        vc.s.j(aVarL);
                        oej.a aVarA4 = eVar.H.a();
                        vc.s.j(aVarA4);
                        gte.a aVarB3 = eVar.f326124g.b();
                        vc.s.j(aVarB3);
                        return new g0c.l(aVarL, aVarA4, aVarB3, (h0c.a) tVar.B.get());
                    case 34:
                        hyf.a aVarA5 = eVar.A.a();
                        vc.s.j(aVarA5);
                        return new g0c.b(aVarA5, (h0c.a) tVar.B.get());
                    case 35:
                        dwi.x xVar = (dwi.x) eVar.B.f109801m.get();
                        vc.s.j(xVar);
                        return new g0c.b(xVar, (h0c.a) tVar.B.get());
                    case 36:
                        mti.h hVar2 = (mti.h) eVar.C.f189544p.get();
                        vc.s.j(hVar2);
                        return new g0c.b(hVar2, (h0c.a) tVar.B.get());
                    case 37:
                        quf.b bVar = (quf.b) ((hvf.b) eVar.D).k.get();
                        vc.s.j(bVar);
                        return new g0c.b(bVar, (h0c.a) tVar.B.get());
                    case 38:
                        xh5.a aVarA6 = eVar.I.a();
                        vc.s.j(aVarA6);
                        gte.a aVarB4 = eVar.f326124g.b();
                        vc.s.j(aVarB4);
                        return new g0c.f(aVarA6, aVarB4, (h0c.a) tVar.B.get());
                    case 39:
                        return new g0c.b(eVar.J.a(), (h0c.a) tVar.B.get());
                    case 40:
                        gte.a aVarB5 = eVar.f326124g.b();
                        vc.s.j(aVarB5);
                        return new g0c.b0(aVarB5, (h0c.a) tVar.B.get());
                    case 41:
                        gte.a aVarB6 = eVar.f326124g.b();
                        vc.s.j(aVarB6);
                        return new g0c.x(aVarB6, (h0c.a) tVar.B.get());
                    case 42:
                        return new g0c.b(eVar.K.a(), (h0c.a) tVar.B.get());
                    case 43:
                        return new g0c.b(eVar.L.a(), (h0c.a) tVar.B.get());
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                z zVar = (z) this.d;
                int i2 = this.f326257c;
                if (i2 == 0) {
                    return new z0c.i((cli.n) zVar.f326316c.get(), zVar.f326314a, ((e) this.f326256b).U.a());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.a();
                }
                throw new AssertionError(i2);
            case 2:
                e eVar2 = (e) this.f326256b;
                b0 b0Var = (b0) this.d;
                int i3 = this.f326257c;
                if (i3 == 0) {
                    cli.n nVar2 = (cli.n) b0Var.f326106c.get();
                    ffk.t tVarF = eVar2.f326125h.f();
                    vc.s.j(tVarF);
                    nyb.c cVar2 = (nyb.c) eVar2.f.Y.get();
                    vc.s.j(cVar2);
                    hVar = new xyb.h(nVar2, tVarF, cVar2);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new AssertionError(i3);
                        }
                        ViewController controller = b0Var.f326104a;
                        yyb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new c90.c(controller.m2());
                    }
                    hVar = new xyb.j(((k3) eVar2.f326133s).b(), (c90.c) b0Var.f326105b.get());
                }
                return hVar;
            case 3:
                c0 c0Var = (c0) this.d;
                int i5 = this.f326257c;
                if (i5 == 0) {
                    com.revolut.kompot.navigable.a aVar8 = (com.revolut.kompot.navigable.a) c0Var.f326111c.get();
                    i60.b.Companion.getClass();
                    return b.a.a(aVar8);
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                e eVar3 = c0Var.f326110b;
                f01.c cVarW = y0.w(eVar3.f326121c);
                f80.a aVarX = eVar3.f326128m.x();
                vc.s.j(aVarX);
                a3e.u uVar = new a3e.u(new f1c.f(cVarW, aVarX));
                RevPointsWrappedCardsScreenContract$InputData revPointsWrappedCardsScreenContract$InputData = c0Var.f326109a;
                u29.q qVar = (u29.q) ((t29.h) ((e) this.f326256b).T).f267501p.get();
                vc.s.j(qVar);
                return new f1c.t(uVar, revPointsWrappedCardsScreenContract$InputData, qVar, (h60.d) c0Var.d.get());
            case 4:
                e eVar4 = (e) this.f326256b;
                e0 e0Var = (e0) this.d;
                int i6 = this.f326257c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new a3e.u(new e1c.d(((k3) e0Var.f326138a.f326133s).b()));
                    }
                    throw new AssertionError(i6);
                }
                cli.n nVar3 = (cli.n) e0Var.f326139b.get();
                ffk.t tVarF2 = eVar4.f326125h.f();
                vc.s.j(tVarF2);
                nyb.k kVarC2 = eVar4.f.c();
                vc.s.j(kVarC2);
                return new e1c.q(nVar3, tVarF2, kVarC2);
            case 5:
                h0 h0Var = (h0) this.d;
                e eVar5 = (e) this.f326256b;
                w1c.j jVar = eVar5.k;
                int i21 = this.f326257c;
                if (i21 == 0) {
                    Object extension = (o1c.a) h0Var.d.get();
                    o0c.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar4 = (yji.n) extension;
                    vc.s.k(nVar4);
                    return nVar4;
                }
                if (i21 == 1) {
                    return o0c.d.a(new ugc.a(jVar.k));
                }
                if (i21 != 2) {
                    if (i21 == 3) {
                        return o0c.e.a((com.revolut.kompot.navigable.a) h0Var.f.get());
                    }
                    throw new AssertionError(i21);
                }
                e eVar6 = h0Var.f326159c;
                djf.c cVar3 = eVar6.f326119b;
                whf.n nVarB = cVar3.b();
                vc.s.j(nVarB);
                thf.m mVarG = cVar3.g();
                vc.s.j(mVarG);
                thf.d dVarD = cVar3.d();
                vc.s.j(dVarD);
                gte.a aVarB7 = eVar6.f326124g.b();
                vc.s.j(aVarB7);
                n0c.y yVar = new n0c.y(nVarB, mVarG, dVarD, aVarB7);
                RevPointsTransactionDetailsScreenContract$InputData revPointsTransactionDetailsScreenContract$InputData = h0Var.f326158b;
                wsg.b bVarA = eVar5.f326130p.a();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) eVar5.f326131q).c();
                vc.s.j(aVarC);
                nyb.m0 m0VarG = eVar5.f.g();
                vc.s.j(m0VarG);
                rul.e eVarA = jVar.a();
                a2c.e eVarB = jVar.b();
                o1c.a aVar9 = (o1c.a) h0Var.d.get();
                rp0.l0 l0Var = (rp0.l0) h0Var.f326160g.get();
                whf.b bVarA2 = eVar5.f326119b.a();
                vc.s.j(bVarA2);
                return new com.revolut.feature.rev_points.impl.ui.transactions.details.b(yVar, revPointsTransactionDetailsScreenContract$InputData, bVarA, aVarC, m0VarG, eVarA, eVarB, aVar9, l0Var, bVarA2);
            case 6:
                h0 h0Var2 = (h0) this.d;
                e eVar7 = (e) this.f326256b;
                w1c.j jVar2 = eVar7.k;
                int i22 = this.f326257c;
                if (i22 == 0) {
                    Object extension2 = (o1c.a) h0Var2.d.get();
                    o0c.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar5 = (yji.n) extension2;
                    vc.s.k(nVar5);
                    return nVar5;
                }
                if (i22 == 1) {
                    return o0c.d.a(new ugc.a(jVar2.k));
                }
                if (i22 != 2) {
                    if (i22 == 3) {
                        return o0c.e.a((com.revolut.kompot.navigable.a) h0Var2.f.get());
                    }
                    throw new AssertionError(i22);
                }
                e eVar8 = h0Var2.f326159c;
                djf.c cVar4 = eVar8.f326119b;
                whf.n nVarB2 = cVar4.b();
                vc.s.j(nVarB2);
                thf.m mVarG2 = cVar4.g();
                vc.s.j(mVarG2);
                thf.d dVarD2 = cVar4.d();
                vc.s.j(dVarD2);
                gte.a aVarB8 = eVar8.f326124g.b();
                vc.s.j(aVarB8);
                n0c.y yVar2 = new n0c.y(nVarB2, mVarG2, dVarD2, aVarB8);
                RevPointsTransactionDetailsScreenContract$InputData revPointsTransactionDetailsScreenContract$InputData2 = h0Var2.f326158b;
                wsg.b bVarA3 = eVar7.f326130p.a();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) eVar7.f326131q).c();
                vc.s.j(aVarC2);
                nyb.m0 m0VarG2 = eVar7.f.g();
                vc.s.j(m0VarG2);
                rul.e eVarA2 = jVar2.a();
                a2c.e eVarB2 = jVar2.b();
                o1c.a aVar10 = (o1c.a) h0Var2.d.get();
                rp0.l0 l0Var2 = (rp0.l0) h0Var2.f326160g.get();
                whf.b bVarA4 = eVar7.f326119b.a();
                vc.s.j(bVarA4);
                return new com.revolut.feature.rev_points.impl.ui.transactions.details.b(yVar2, revPointsTransactionDetailsScreenContract$InputData2, bVarA3, aVarC2, m0VarG2, eVarA2, eVarB2, aVar10, l0Var2, bVarA4);
            case 7:
                h0 h0Var3 = (h0) this.d;
                e eVar9 = (e) this.f326256b;
                int i32 = this.f326257c;
                if (i32 == 0) {
                    Object extension3 = (o1c.a) h0Var3.d.get();
                    o0c.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension3, "extension");
                    yji.n nVar6 = (yji.n) extension3;
                    vc.s.k(nVar6);
                    return nVar6;
                }
                if (i32 == 1) {
                    return o0c.d.a(new ugc.a(eVar9.k.k));
                }
                if (i32 != 2) {
                    if (i32 == 3) {
                        return o0c.e.a((com.revolut.kompot.navigable.a) h0Var3.f.get());
                    }
                    throw new AssertionError(i32);
                }
                e eVar10 = h0Var3.f326159c;
                djf.c cVar5 = eVar10.f326119b;
                whf.n nVarB3 = cVar5.b();
                vc.s.j(nVarB3);
                thf.m mVarG3 = cVar5.g();
                vc.s.j(mVarG3);
                thf.d dVarD3 = cVar5.d();
                vc.s.j(dVarD3);
                gte.a aVarB9 = eVar10.f326124g.b();
                vc.s.j(aVarB9);
                n0c.y yVar3 = new n0c.y(nVarB3, mVarG3, dVarD3, aVarB9);
                RevPointsTransactionDetailsScreenContract$InputData revPointsTransactionDetailsScreenContract$InputData3 = h0Var3.f326158b;
                usg.a aVar11 = eVar9.f326130p;
                w1c.j jVar3 = eVar9.k;
                wsg.b bVarA5 = aVar11.a();
                com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) eVar9.f326131q).c();
                vc.s.j(aVarC3);
                nyb.m0 m0VarG3 = eVar9.f.g();
                vc.s.j(m0VarG3);
                rul.e eVarA3 = jVar3.a();
                a2c.e eVarB3 = jVar3.b();
                o1c.a aVar12 = (o1c.a) h0Var3.d.get();
                rp0.l0 l0Var3 = (rp0.l0) h0Var3.f326160g.get();
                whf.b bVarA6 = eVar9.f326119b.a();
                vc.s.j(bVarA6);
                return new com.revolut.feature.rev_points.impl.ui.transactions.details.b(yVar3, revPointsTransactionDetailsScreenContract$InputData3, bVarA5, aVarC3, m0VarG3, eVarA3, eVarB3, aVar12, l0Var3, bVarA6);
            case 8:
                zz7.c cVar6 = (zz7.c) this.f326256b;
                zz7.a aVar13 = (zz7.a) this.d;
                int i33 = this.f326257c;
                switch (i33) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar13.f326517a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar13.f326517a);
                        t70.g gVarO = cVar6.f326544b.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) aVar13.e.get(), gsi.c.a(aVar13.f326517a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar13.f326517a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar13.f326517a));
                    case 5:
                        return new iri.g((iri.j) cVar6.f326547h.get(), cVar6.b(), bq.i.f(aVar13.f326517a), bq.i.l(aVar13.f326517a));
                    case 6:
                        return new iri.l(cVar6.b(), bq.i.f(aVar13.f326517a), (iri.d) aVar13.i.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar13.f326517a));
                    case 8:
                        return new opi.b(bq.i.f(aVar13.f326517a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) aVar13.f326518b.f326548j.get()), bq.i.l(aVar13.f326517a));
                    case 10:
                        aVar13.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(aVar13.f326517a));
                    case 11:
                        vz7.e eVar11 = new vz7.e((xpi.g) aVar13.f326524m.get(), (uz7.b) cVar6.f326557w.get(), new wz7.a());
                        kli.a.p(eVar11, bq.i.d(aVar13.f326517a));
                        return eVar11;
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                zz7.c cVar7 = (zz7.c) this.f326256b;
                zz7.b bVar2 = (zz7.b) this.d;
                int i43 = this.f326257c;
                switch (i43) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI2 = bq.i.i(bVar2.f326526a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(bVar2.f326526a);
                        t70.g gVarO2 = cVar7.f326544b.o();
                        vc.s.j(gVarO2);
                        return new npi.c(contextI2, baseDelegatesActivityF2, gVarO2);
                    case 2:
                        return new tpi.i((rpi.c) bVar2.f.get(), gsi.c.a(bVar2.f326526a));
                    case 3:
                        return new rpi.b(bq.i.b(bVar2.f326526a));
                    case 4:
                        return new rpi.h(bq.i.b(bVar2.f326526a));
                    case 5:
                        iri.j jVar4 = (iri.j) cVar7.f326547h.get();
                        bVar2.getClass();
                        xoi.d dVar3 = bVar2.f326526a;
                        return new iri.g(jVar4, new uz7.r((fy7.e) bVar2.f326528c.f326550m.get()), bq.i.f(dVar3), bq.i.l(dVar3));
                    case 6:
                        bVar2.getClass();
                        return new iri.l(new uz7.r((fy7.e) bVar2.f326528c.f326550m.get()), bq.i.f(bVar2.f326526a), (iri.d) bVar2.f326531j.get());
                    case 7:
                        return new iri.d(bq.i.f(bVar2.f326526a));
                    case 8:
                        return new opi.b(bq.i.f(bVar2.f326526a));
                    case 9:
                        bVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize2.add(bVar2.f326528c.f326554r.get());
                        builderBuilderWithExpectedSize2.addAll((Iterable) dn.b.a());
                        return new cn.d(builderBuilderWithExpectedSize2.build(), (cn.e) cVar7.o.get(), cVar7.c());
                    case 10:
                        um.c cVar8 = (um.c) cVar7.f326553q.get();
                        bVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(6);
                        zz7.c cVar9 = bVar2.f326528c;
                        builderBuilderWithExpectedSize3.add(cVar9.f326558x.get());
                        hn.h hVar3 = (hn.h) cVar9.f326559y.get();
                        t70.g gVarO3 = cVar9.f326544b.o();
                        vc.s.j(gVarO3);
                        builderBuilderWithExpectedSize3.add(new jn.a(hVar3, gVarO3));
                        builderBuilderWithExpectedSize3.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize3.add(cVar9.h());
                        builderBuilderWithExpectedSize3.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize3.add(new jn.d(e4m.b.a(bVar2.f326534n)));
                        return new in.e(cVar8, builderBuilderWithExpectedSize3.build(), cVar7.c());
                    case 11:
                        return bq.i.t(bVar2.f326526a);
                    case 12:
                        bVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize4.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize4.add(bVar2.f326535p.get());
                        builderBuilderWithExpectedSize4.add(new kn.h(e4m.b.a(bVar2.f326529g)));
                        return new kn.e(builderBuilderWithExpectedSize4.build(), (ym.d) cVar7.f326552p.get(), cVar7.c());
                    case 13:
                        return new zm.a();
                    case 14:
                        bVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize5.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize5.add(bVar2.f326528c.h());
                        return new hn.d(builderBuilderWithExpectedSize5.build(), (hn.h) cVar7.f326559y.get(), (npi.f) bVar2.e.get());
                    case 15:
                        return new en.c(ImmutableSet.of((ln.d) bVar2.f326528c.f326548j.get()), bq.i.l(bVar2.f326526a));
                    case 16:
                        return new gn.c((lpi.e) bVar2.f326539t.get(), (sm.e) cVar7.D.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar7.c());
                    case 17:
                        return new lpi.b(bq.i.i(bVar2.f326526a), bq.i.j(bVar2.f326526a));
                    case 18:
                        bVar2.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar7.E.get(), cVar7.c());
                    case 19:
                        return new wm.l((opi.d) bVar2.f326532l.get(), (wm.a) cVar7.f326551n.get(), ImmutableSet.copyOf((Collection) xm.b.a()), cVar7.c());
                    case 20:
                        bVar2.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(bVar2.f326526a));
                    case 21:
                        bVar2.getClass();
                        return new iqi.b(iqi.g.f167870b, bq.i.b(bVar2.f326526a));
                    case 22:
                        return new a08.c0((iqi.h) bVar2.f326542y.get(), (uz7.b) cVar7.f326557w.get(), (uz7.a) cVar7.v.get(), new a08.y0(), (f9b.f) bVar2.f326534n.get(), (opi.d) bVar2.f326532l.get(), (mm.d) cVar7.z.get(), new b08.c(new yx7.m()), (kpi.c) bVar2.d.get(), bq.i.d(bVar2.f326526a), (a08.g) bVar2.z.get());
                    case 23:
                        PetPlanBuilderContract$Configuration configuration = bVar2.f326527b;
                        xpi.g navBar = (xpi.g) bVar2.f326541x.get();
                        iqi.h twinVerticalButtonView = (iqi.h) bVar2.f326542y.get();
                        uz7.b router = (uz7.b) cVar7.f326557w.get();
                        uz7.a presentationModel = (uz7.a) cVar7.v.get();
                        b08.c uiBuilder = new b08.c(new yx7.m());
                        fx7.f fVarB2 = bVar2.f326528c.f326545c.b();
                        vc.s.j(fVarB2);
                        yx7.h petImageBuilder = new yx7.h(fVarB2);
                        mm.d actionDispatcher = (mm.d) cVar7.z.get();
                        c08.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        Intrinsics.checkNotNullParameter(navBar, "navBar");
                        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
                        Intrinsics.checkNotNullParameter(router, "router");
                        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
                        Intrinsics.checkNotNullParameter(petImageBuilder, "petImageBuilder");
                        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
                        if (configuration instanceof PetPlanBuilderContract$Configuration.DefaultConfig) {
                            return new a08.m0(navBar, twinVerticalButtonView, router, presentationModel, uiBuilder, petImageBuilder, actionDispatcher);
                        }
                        if (configuration instanceof PetPlanBuilderContract$Configuration.RenewalPlanConfig) {
                            return new a08.v0(navBar, twinVerticalButtonView, router, presentationModel, petImageBuilder, actionDispatcher);
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                return a();
            default:
                zz7.c cVar10 = (zz7.c) this.f326256b;
                zz7.e eVar12 = (zz7.e) this.d;
                int i59 = this.f326257c;
                switch (i59) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI3 = bq.i.i(eVar12.f326577a);
                        BaseDelegatesActivity baseDelegatesActivityF3 = bq.i.f(eVar12.f326577a);
                        t70.g gVarO4 = cVar10.f326544b.o();
                        vc.s.j(gVarO4);
                        cVar = new npi.c(contextI3, baseDelegatesActivityF3, gVarO4);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) eVar12.f.get(), gsi.c.a(eVar12.f326577a));
                    case 3:
                        return new rpi.b(bq.i.b(eVar12.f326577a));
                    case 4:
                        return new rpi.h(bq.i.b(eVar12.f326577a));
                    case 5:
                        cVar = new iri.g((iri.j) cVar10.f326547h.get(), (iri.m) cVar10.i.get(), bq.i.f(eVar12.f326577a), bq.i.l(eVar12.f326577a));
                        break;
                    case 6:
                        cVar = new iri.l((iri.m) cVar10.i.get(), bq.i.f(eVar12.f326577a), (iri.d) eVar12.f326582j.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(eVar12.f326577a));
                    case 8:
                        return new opi.b(bq.i.f(eVar12.f326577a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) eVar12.f326579c.f326548j.get()), bq.i.l(eVar12.f326577a));
                    case 10:
                        return new xpi.c(eVar12.f326578b, bq.i.b(eVar12.f326577a));
                    case 11:
                        hy7.i iVar = new hy7.i((xpi.g) eVar12.f326585n.get(), (f9b.f) eVar12.o.get(), (hy7.g) cVar10.k.get(), (hy7.b) cVar10.f326549l.get(), new iy7.a());
                        kli.a.p(iVar, bq.i.d(eVar12.f326577a));
                        return iVar;
                    case 12:
                        return bq.i.t(eVar12.f326577a);
                    default:
                        throw new AssertionError(i59);
                }
                return cVar;
        }
    }
}
