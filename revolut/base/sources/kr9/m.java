package kr9;

import android.content.Context;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreenContract$InputData;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreenContract$InputData;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingControllerContract$InputData;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreenContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.TransferProgressScreenContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlowContract$InputData;
import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsControllerContract$InputData;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsContract$InputData;
import hbf.c0;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ks9.b0;
import ks9.f0;
import ks9.n0;
import ks9.r0;
import ks9.s0;
import l9f.y;
import rp0.p0;
import ru5.z;
import z0h.q1;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f188774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188775c;
    public final Object d;

    public /* synthetic */ m(Object obj2, Object obj3, int i, int i2) {
        this.f188773a = i2;
        this.f188774b = obj2;
        this.d = obj3;
        this.f188775c = i;
    }

    private final Object a() {
        l9f.r rVar = (l9f.r) this.d;
        l9f.k kVar = (l9f.k) this.f188774b;
        ibh.b bVar = kVar.f193188l;
        yah.a aVar = kVar.f193189m;
        int i = this.f188775c;
        if (i == 0) {
            hbh.j jVarA = bVar.a();
            vc.s.j(jVarA);
            return hy1.g.k(jVarA, rVar.f193214a, (h1h.b) rVar.d.get());
        }
        if (i == 1) {
            hbh.j jVarA2 = bVar.a();
            vc.s.j(jVarA2);
            return hy1.g.l(jVarA2);
        }
        if (i == 2) {
            f1h.c cVarA = aVar.a();
            vc.s.j(cVarA);
            return fp8.c.s(cVarA, (f1h.f) rVar.f.get(), (f1h.b) rVar.f193217g.get());
        }
        if (i == 3) {
            f1h.c cVarA2 = aVar.a();
            vc.s.j(cVarA2);
            return fp8.c.t(cVarA2);
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        c0 c0Var = new c0(new kpj.f(rVar.f193216c.f193190n.H()));
        TransferProgressScreenContract$InputData transferProgressScreenContract$InputData = rVar.f193215b;
        o9f.g gVar = (o9f.g) kVar.H.get();
        ybl.k kVarD = kVar.f193182a.d();
        vc.s.j(kVarD);
        return new com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a(c0Var, transferProgressScreenContract$InputData, gVar, kVarD, kVar.f193190n.f(), new hbf.a(), (h1h.b) rVar.d.get());
    }

    @Override // phm.a
    public final Object get() {
        Object r0Var;
        Object eVar;
        Object cVar;
        Object hVar;
        switch (this.f188773a) {
            case 0:
                l lVar = (l) this.f188774b;
                n nVar = (n) this.d;
                GroupQrScreenContract$InputData groupQrScreenContract$InputData = nVar.f188776a;
                int i = this.f188775c;
                if (i == 0) {
                    return new rt9.b(groupQrScreenContract$InputData, lVar.e.e(), (cli.n) nVar.f188777b.get());
                }
                if (i == 1) {
                    return new rt9.c(groupQrScreenContract$InputData, lVar.f188760h.d());
                }
                throw new AssertionError(i);
            case 1:
                l lVar2 = (l) this.f188774b;
                jr9.a aVar = lVar2.f188765p;
                p pVar = (p) this.d;
                int i2 = this.f188775c;
                if (i2 == 0) {
                    return kxa.j.l((j60.a) pVar.f.get());
                }
                if (i2 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) pVar.d.get(), (rp0.m) pVar.e.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 == 3) {
                    return new bt9.w(pVar.f188783b, new et9.a(), (dt9.a) pVar.f188786h.get(), (j60.a) pVar.f.get(), (jki.p) pVar.i.get(), lVar2.f188771x.b());
                }
                if (i2 == 4) {
                    mq9.f fVarC = lVar2.f188757b.c();
                    vc.s.j(fVarC);
                    com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) lVar2.f188770w).c();
                    vc.s.j(aVarC);
                    return new dt9.b(fVarC, aVarC, lVar2.f188763m.e());
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                nq9.a aVarA = aVar.a();
                vc.s.j(aVarA);
                nq9.e eVar2 = (nq9.e) aVar.f.get();
                vc.s.j(eVar2);
                l lVar3 = pVar.f188784c;
                m1a.q qVarB = lVar3.f188771x.b();
                gte.a aVarB = lVar3.f188768s.b();
                vc.s.j(aVarB);
                return new bt9.d(aVarA, eVar2, new bt9.a(qVarB, new ys9.a(aVarB)));
            case 2:
                jr9.a aVar2 = ((l) this.f188774b).f188765p;
                int i3 = this.f188775c;
                if (i3 == 0) {
                    r rVar = (r) this.d;
                    return new ft9.i(rVar.f188792b, (jki.p) rVar.f188793c.get());
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                nq9.d dVar = (nq9.d) aVar2.f177951g.get();
                vc.s.j(dVar);
                nq9.c cVarC = aVar2.c();
                vc.s.j(cVarC);
                return new ft9.c(dVar, cVarC);
            case 3:
                l lVar4 = (l) this.f188774b;
                jr9.a aVar3 = lVar4.f188765p;
                p pVar2 = (p) this.d;
                int i5 = this.f188775c;
                if (i5 == 0) {
                    return kxa.j.l((j60.a) pVar2.f.get());
                }
                if (i5 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) pVar2.d.get(), (rp0.m) pVar2.e.get());
                }
                if (i5 == 2) {
                    return new rp0.m();
                }
                if (i5 == 3) {
                    return new bt9.w(pVar2.f188783b, new et9.a(), (dt9.a) pVar2.f188786h.get(), (j60.a) pVar2.f.get(), (jki.p) pVar2.i.get(), lVar4.f188771x.b());
                }
                if (i5 == 4) {
                    mq9.f fVarC2 = lVar4.f188757b.c();
                    vc.s.j(fVarC2);
                    com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) lVar4.f188770w).c();
                    vc.s.j(aVarC2);
                    return new dt9.b(fVarC2, aVarC2, lVar4.f188763m.e());
                }
                if (i5 != 5) {
                    throw new AssertionError(i5);
                }
                nq9.a aVarA2 = aVar3.a();
                vc.s.j(aVarA2);
                nq9.e eVar3 = (nq9.e) aVar3.f.get();
                vc.s.j(eVar3);
                l lVar5 = pVar2.f188784c;
                m1a.q qVarB2 = lVar5.f188771x.b();
                gte.a aVarB2 = lVar5.f188768s.b();
                vc.s.j(aVarB2);
                return new bt9.d(aVarA2, eVar3, new bt9.a(qVarB2, new ys9.a(aVarB2)));
            case 4:
                jr9.a aVar4 = ((l) this.f188774b).f188765p;
                int i6 = this.f188775c;
                if (i6 == 0) {
                    r rVar2 = (r) this.d;
                    return new ft9.i(rVar2.f188792b, (jki.p) rVar2.f188793c.get());
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                nq9.d dVar2 = (nq9.d) aVar4.f177951g.get();
                vc.s.j(dVar2);
                nq9.c cVarC2 = aVar4.c();
                vc.s.j(cVarC2);
                return new ft9.c(dVar2, cVarC2);
            case 5:
                l lVar6 = (l) this.f188774b;
                u uVar = (u) this.d;
                int i21 = this.f188775c;
                switch (i21) {
                    case 0:
                        return kxa.j.l((j60.a) uVar.e.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) uVar.f188802c.get(), (rp0.m) uVar.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        r0 extension = (r0) uVar.f188803g.get();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 4:
                        mq9.f fVarC3 = lVar6.f188757b.c();
                        vc.s.j(fVarC3);
                        r0Var = new r0(fVarC3, new vr9.s(), (j60.a) uVar.e.get());
                        break;
                    case 5:
                        ks9.a extension2 = (ks9.a) uVar.i.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 6:
                        j60.a aVar5 = (j60.a) uVar.e.get();
                        du9.b bVarA = lVar6.k.a();
                        vc.s.j(bVarA);
                        r0Var = new ks9.a(aVar5, bVarA);
                        break;
                    case 7:
                        Object extension3 = (ks9.i) uVar.f188807m.get();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar2 = (yji.n) extension3;
                        vc.s.k(nVar2);
                        return nVar2;
                    case 8:
                        rr9.d dVarB = lVar6.f188757b.b();
                        vc.s.j(dVarB);
                        utf.a aVarA3 = lVar6.o.a();
                        vc.s.j(aVarA3);
                        jt0.b bVarE = uVar.e();
                        l lVar7 = uVar.f188801b;
                        nq9.c cVarC3 = lVar7.f188765p.c();
                        vc.s.j(cVarC3);
                        yof.k kVarG = lVar7.f188766q.g();
                        vc.s.j(kVarG);
                        vr9.r rVar3 = new vr9.r(cVarC3, kVarG);
                        vr9.d dVar3 = new vr9.d();
                        ks9.c cVar2 = (ks9.c) uVar.f188806l.get();
                        ks9.g gVar = (ks9.g) uVar.k.get();
                        j60.a aVar6 = (j60.a) uVar.e.get();
                        gte.a aVarB3 = lVar6.f188768s.b();
                        vc.s.j(aVarB3);
                        nq9.c cVarC4 = lVar7.f188765p.c();
                        vc.s.j(cVarC4);
                        return new n0(dVarB, aVarA3, bVarE, rVar3, dVar3, cVar2, gVar, aVar6, aVarB3, new wr9.e(cVarC4));
                    case 9:
                        r0Var = new ks9.b(lVar6.f188767r.f(), new vr9.b(), (ks9.g) uVar.k.get(), (j60.a) uVar.e.get());
                        break;
                    case 10:
                        rr9.d dVarB2 = lVar6.f188757b.b();
                        vc.s.j(dVarB2);
                        zof.f fVarD = lVar6.f188766q.d();
                        vc.s.j(fVarD);
                        return new b0(dVarB2, fVarD);
                    case 11:
                        Object extension4 = (ks9.g) uVar.k.get();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.n nVar3 = (yji.n) extension4;
                        vc.s.k(nVar3);
                        return nVar3;
                    case 12:
                        Object extension5 = (ks9.c) uVar.f188806l.get();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        yji.n nVar4 = (yji.n) extension5;
                        vc.s.k(nVar4);
                        return nVar4;
                    case 13:
                        s0 extension6 = (s0) uVar.f188810q.get();
                        Intrinsics.checkNotNullParameter(extension6, "extension");
                        vc.s.k(extension6);
                        return extension6;
                    case 14:
                        j60.a aVar7 = (j60.a) uVar.e.get();
                        iu9.a aVar8 = (iu9.a) lVar6.k.f219248y.get();
                        vc.s.j(aVar8);
                        r0Var = new s0(aVar7, aVar8);
                        break;
                    case 15:
                        Object extension7 = (ks9.h) uVar.f188812s.get();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        yji.n nVar5 = (yji.n) extension7;
                        vc.s.k(nVar5);
                        return nVar5;
                    case 16:
                        mq9.f fVarC4 = lVar6.f188757b.c();
                        vc.s.j(fVarC4);
                        jt0.b bVarE2 = uVar.e();
                        mr9.d dVarD = lVar6.f188757b.d();
                        vc.s.j(dVarD);
                        nq9.c cVarC5 = uVar.f188801b.f188765p.c();
                        vc.s.j(cVarC5);
                        wr9.e eVar4 = new wr9.e(cVarC5);
                        j60.a aVar9 = (j60.a) uVar.e.get();
                        sf0.h hVarB = lVar6.f188769t.b();
                        vc.s.j(hVarB);
                        return new f0(fVarC4, bVarE2, dVarD, eVar4, aVar9, hVarB);
                    case 17:
                        GroupChatMembersScreenContract$InputData groupChatMembersScreenContract$InputData = uVar.f188800a;
                        l lVar8 = uVar.f188801b;
                        os9.c cVarD = uVar.d();
                        ks9.h hVar2 = (ks9.h) uVar.f188812s.get();
                        nq9.c membersMapper = lVar8.f188765p.c();
                        vc.s.j(membersMapper);
                        Intrinsics.checkNotNullParameter(membersMapper, "membersMapper");
                        com.revolut.feature.payments.groups.impl.mappers.settings.a aVar10 = new com.revolut.feature.payments.groups.impl.mappers.settings.a();
                        j60.a aVar11 = (j60.a) uVar.e.get();
                        ln3.b bVar = new ln3.b();
                        os9.c cVarD2 = uVar.d();
                        c70.a aVarZ = lVar8.f188760h.z();
                        vc.s.j(aVarZ);
                        pqi.a aVar12 = lVar8.e;
                        nd.o oVarA = aVar12.a();
                        mq9.f fVarC5 = lVar8.f188757b.c();
                        vc.s.j(fVarC5);
                        wj0.a aVarI = ((nj0.d) lVar8.i).i();
                        vc.s.j(aVarI);
                        return new os9.u(groupChatMembersScreenContract$InputData, cVarD, hVar2, aVar10, aVar11, new is9.a(bVar, new hd.r(cVarD2, aVarZ, oVarA, fVarC5, aVarI, aVar12.g()), new is9.b()), (jki.p) uVar.u.get());
                    case 18:
                        nq9.c cVarC6 = lVar6.f188765p.c();
                        vc.s.j(cVarC6);
                        return new os9.e(cVarC6);
                    default:
                        throw new AssertionError(i21);
                }
                return r0Var;
            case 6:
                ku5.e eVar5 = (ku5.e) this.d;
                ku5.f fVar = eVar5.f189663b;
                ActivityScreenContract$InputData inputData = eVar5.f189662a;
                ku5.f fVar2 = (ku5.f) this.f188774b;
                l70.e eVar6 = fVar2.f189670j;
                int i22 = this.f188775c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        l80.e eVarH = eVar6.h();
                        vc.s.j(eVarH);
                        return new uu5.d(eVarH);
                    }
                    if (i22 != 2) {
                        throw new AssertionError(i22);
                    }
                    thf.g gVarE = fVar2.d.e();
                    vc.s.j(gVarE);
                    pt5.f fVar3 = (pt5.f) fVar2.f189676r.get();
                    he2.b factory = new he2.b(gVarE, fVar3);
                    tu5.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return new su5.b(fVar3);
                }
                pt5.f fVar4 = (pt5.f) fVar.f189676r.get();
                uu5.a aVar13 = (uu5.a) eVar5.f189664c.get();
                thf.g gVarE2 = fVar.d.e();
                vc.s.j(gVarE2);
                he2.b factory2 = new he2.b(gVarE2, (pt5.f) fVar.f189676r.get());
                su5.b transactionItemCache = (su5.b) eVar5.d.get();
                tu5.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(transactionItemCache, "transactionItemCache");
                Intrinsics.checkNotNullParameter(transactionItemCache, "transactionItemCache");
                ru5.b0 b0Var = new ru5.b0(inputData, fVar4, aVar13, new cv5.a(transactionItemCache, gVarE2));
                ev5.d factory3 = (ev5.d) fVar.f189677s.get();
                pt5.t cryptoFilterProvider = fVar.a();
                ev5.a deFiFilterProvider = fVar.k.a();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(cryptoFilterProvider, "cryptoFilterProvider");
                Intrinsics.checkNotNullParameter(deFiFilterProvider, "deFiFilterProvider");
                int i32 = tu5.a.f274530a[inputData.e.ordinal()];
                if (i32 == 1) {
                    cryptoFilterProvider = (d76.b) deFiFilterProvider.f129738b;
                } else if (i32 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dv5.l lVarA = factory3.a(cryptoFilterProvider);
                iva.a aVarA4 = fVar2.f.a();
                vc.s.j(aVarA4);
                dtc.i iVar = (dtc.i) fVar2.u.get();
                t70.b bVarG = eVar6.g();
                vc.s.j(bVarG);
                dv5.a aVar14 = new dv5.a(bVarG);
                ku5.g gVar2 = fVar2.f189666b;
                return new z(b0Var, inputData, lVarA, aVarA4, iVar, aVar14, new lu5.k(gVar2.d(), gVar2.i.b()), new lu5.d(vd0.d.a()), (uu5.a) eVar5.f189664c.get(), new lu5.b(), fVar2.c(), fVar2.b());
            case 7:
                ku5.h hVar3 = (ku5.h) this.d;
                int i33 = this.f188775c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new av5.n(new xu5.a());
                    }
                    throw new AssertionError(i33);
                }
                jki.p pVar3 = (jki.p) hVar3.f189697b.get();
                FiltersByTypeScreenContract$InputData filtersByTypeScreenContract$InputData = hVar3.f189696a;
                t70.b bVarG2 = ((ku5.g) this.f188774b).f.g();
                vc.s.j(bVarG2);
                return new av5.l(pVar3, filtersByTypeScreenContract$InputData, bVarG2);
            case 8:
                ku5.g gVar3 = (ku5.g) this.f188774b;
                ite.a aVar15 = gVar3.f189686m;
                ku5.j jVar = (ku5.j) this.d;
                ku5.g gVar4 = jVar.f189707j;
                ut5.c cryptoStatsDataProvider = jVar.f189703b;
                ut5.d dVar4 = jVar.d;
                ut5.h pocketsDataProvider = jVar.f189704c;
                int i43 = this.f188775c;
                switch (i43) {
                    case 0:
                        a5h.g gVar5 = new a5h.g(new gv5.k(), new jv5.g(jVar.c()), cryptoStatsDataProvider, pocketsDataProvider, new kv5.c((f01.a) jVar.k.get()));
                        mu5.p pVarE = gVar3.e();
                        nu5.c cVar3 = new nu5.c(gVar3.a());
                        yud.g gVarD = gVar3.f189687n.d();
                        vc.s.j(gVarD);
                        gte.a aVarB4 = aVar15.b();
                        vc.s.j(aVarB4);
                        eVar = new jv5.e(gVar5, pVarE, cVar3, gVarD, pocketsDataProvider, aVarB4, new jv5.f(gVar4.f189692t.h()), new iq6.a());
                        return eVar;
                    case 1:
                        Context context = gVar3.d;
                        lv5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        cVar = new f01.c(context);
                        return cVar;
                    case 2:
                        mu5.p pVarE2 = gVar3.e();
                        nv5.m mVarD = jVar.d();
                        kv5.l lVar9 = new kv5.l();
                        dcl.q qVar = new dcl.q(new wt5.a());
                        xv5.c cVarA = gVar3.f189684j.a();
                        vc.s.j(cVarA);
                        hVar = new nv5.h(pVarE2, mVarD, lVar9, qVar, pocketsDataProvider, dVar4, cVarA);
                        return hVar;
                    case 3:
                        gv5.k investmentsWidgetItemsListModifier = new gv5.k();
                        mv5.g itemsMapper = new mv5.g(jVar.c());
                        kv5.c pocketUiDataToInvestItemMapper = new kv5.c((f01.a) jVar.k.get());
                        yud.g gVarD2 = gVar4.f189687n.d();
                        vc.s.j(gVarD2);
                        fnc.s stakeableCurrenciesProvider = new fnc.s(gVarD2);
                        Intrinsics.checkNotNullParameter(investmentsWidgetItemsListModifier, "investmentsWidgetItemsListModifier");
                        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
                        Intrinsics.checkNotNullParameter(cryptoStatsDataProvider, "cryptoStatsDataProvider");
                        Intrinsics.checkNotNullParameter(pocketsDataProvider, "pocketsDataProvider");
                        Intrinsics.checkNotNullParameter(pocketUiDataToInvestItemMapper, "pocketUiDataToInvestItemMapper");
                        Intrinsics.checkNotNullParameter(stakeableCurrenciesProvider, "stakeableCurrenciesProvider");
                        hd.r rVar4 = new hd.r();
                        rVar4.f151364a = investmentsWidgetItemsListModifier;
                        rVar4.f151365b = itemsMapper;
                        rVar4.f151366c = cryptoStatsDataProvider;
                        rVar4.d = pocketsDataProvider;
                        rVar4.e = pocketUiDataToInvestItemMapper;
                        rVar4.f = stakeableCurrenciesProvider;
                        kv5.l lVar10 = new kv5.l();
                        dcl.q qVar2 = new dcl.q(new wt5.a());
                        mu5.p pVarE3 = gVar3.e();
                        gte.a aVarB5 = aVar15.b();
                        vc.s.j(aVarB5);
                        eVar = new mv5.f(rVar4, pocketsDataProvider, lVar10, qVar2, pVarE3, aVarB5);
                        return eVar;
                    case 4:
                        cVar = new qv5.b(gVar3.e(), jVar.e);
                        return cVar;
                    case 5:
                        cVar = new pv5.b(gVar3.e(), jVar.f);
                        return cVar;
                    case 6:
                        cVar = new ov5.e(gVar3.e(), jVar.d(), dVar4);
                        return cVar;
                    case 7:
                        hVar = new iv5.o(jVar.f189706h, jVar.i, new gv5.e(), gVar3.e(), pocketsDataProvider, dVar4);
                        return hVar;
                    case 8:
                        jv5.a autoEarnEligible = (jv5.a) jVar.f189708l.get();
                        lv5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(autoEarnEligible, "autoEarnEligible");
                        Set setB = y0.b(autoEarnEligible);
                        vc.s.k(setB);
                        return setB;
                    default:
                        throw new AssertionError(i43);
                }
            case 9:
                ku5.g gVar6 = (ku5.g) this.f188774b;
                ku5.k kVar = (ku5.k) this.d;
                int i59 = this.f188775c;
                if (i59 == 0) {
                    Object extension8 = (r60.b) kVar.f189717c.get();
                    Intrinsics.checkNotNullParameter(extension8, "extension");
                    yji.d dVar5 = (yji.d) extension8;
                    vc.s.k(dVar5);
                    return dVar5;
                }
                if (i59 == 1) {
                    return s2l.c.r((com.revolut.kompot.navigable.a) kVar.f189715a.get(), (p0) kVar.f189716b.get(), kxa.j.o(new nji.b()));
                }
                if (i59 == 2) {
                    return new p0();
                }
                if (i59 != 3) {
                    throw new AssertionError(i59);
                }
                kl.c0 c0Var = new kl.c0((hu5.e) gVar6.C.get());
                mu5.s sVar = new mu5.s(gVar6.f());
                p0 p0Var = (p0) kVar.f189716b.get();
                mre.c cVarB = gVar6.f189685l.b();
                vc.s.j(cVarB);
                return new vu5.h(c0Var, sVar, p0Var, cVarB);
            case 10:
                kvb.c cVar4 = (kvb.c) this.d;
                kvb.b bVar2 = (kvb.b) this.f188774b;
                int i66 = this.f188775c;
                if (i66 != 0) {
                    if (i66 == 1) {
                        return new ovb.p();
                    }
                    throw new AssertionError(i66);
                }
                cli.n nVar6 = (cli.n) cVar4.f190075c.get();
                RevPointsExclusiveStoreProductCheckoutScreenContract$InputData revPointsExclusiveStoreProductCheckoutScreenContract$InputData = cVar4.f190073a;
                ivb.h hVar4 = (ivb.h) bVar2.f190069q.get();
                i4b.f fVar5 = new i4b.f((y1e.b) bVar2.f190062g.f803g.get());
                nyb.k kVarC = bVar2.f190060b.c();
                vc.s.j(kVarC);
                i90.b bVar3 = new i90.b();
                ang.f fVarE = bVar2.i.e();
                wub.a aVarA5 = bVar2.f190064j.a();
                vc.s.j(aVarA5);
                rh1.b bVarA2 = cVar4.f190074b.k.a();
                vc.s.j(bVarA2);
                lvb.c cVar5 = new lvb.c(bVarA2);
                mre.c cVarB2 = bVar2.f190065l.b();
                vc.s.j(cVarB2);
                return new com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d(nVar6, revPointsExclusiveStoreProductCheckoutScreenContract$InputData, hVar4, fVar5, kVarC, bVar3, fVarE, aVarA5, cVar5, cVarB2);
            case 11:
                kvb.b bVar4 = (kvb.b) this.f188774b;
                kvb.e eVar7 = (kvb.e) this.d;
                int i74 = this.f188775c;
                if (i74 == 0) {
                    return new pvb.e((cli.n) eVar7.f190079b.get(), eVar7.f190078a, new o7.b((y1e.d) bVar4.f190062g.e.get()), ((c21.b) bVar4.f190063h).c());
                }
                if (i74 == 1) {
                    return new pvb.f();
                }
                throw new AssertionError(i74);
            case 12:
                kxa.d dVar6 = (kxa.d) this.d;
                kxa.f fVar6 = dVar6.f190521b;
                kxa.f fVar7 = (kxa.f) this.f188774b;
                int i92 = this.f188775c;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new AssertionError(i92);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) dVar6.f190522c.get();
                    oxa.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return new f01.c(controller.m2());
                }
                l80.e eVarH2 = fVar6.e.h();
                vc.s.j(eVarH2);
                nxa.c0 c0Var2 = new nxa.c0(new nxa.f(eVarH2), new nxa.d((f01.a) dVar6.d.get()), new nxa.a());
                PersonalizedTrackingControllerContract$InputData personalizedTrackingControllerContract$InputData = dVar6.f190520a;
                gxa.c cVar6 = (gxa.c) fVar6.f190534p.get();
                wwa.b bVarA3 = fVar6.f190526b.a();
                vc.s.j(bVarA3);
                jul.o oVar = new jul.o(cVar6, bVarA3);
                wli.x xVarD = ((s41.a) fVar7.f190529h).d();
                jxa.f fVar8 = new jxa.f();
                jxa.i iVar2 = new jxa.i();
                jxa.k kVar2 = new jxa.k();
                yva.a aVarA6 = fVar7.i.a();
                vc.s.j(aVarA6);
                gte.a aVarB6 = fVar7.f190530j.b();
                vc.s.j(aVarB6);
                return new com.revolut.feature.referrals.impl.personalized_tracking.a(c0Var2, personalizedTrackingControllerContract$InputData, oVar, xVarD, fVar8, iVar2, kVar2, aVarA6, aVarB6);
            case 13:
                kyk.v vVar = (kyk.v) this.f188774b;
                kyk.f fVar9 = (kyk.f) this.d;
                int i96 = this.f188775c;
                if (i96 == 0) {
                    return new com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.a(fVar9.f190937a);
                }
                if (i96 == 1) {
                    return new tzk.b();
                }
                if (i96 != 2) {
                    if (i96 != 3) {
                        throw new AssertionError(i96);
                    }
                    BaseFlow flow = fVar9.f190938b;
                    szk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(flow, "flow");
                    return new f01.c(flow.m2());
                }
                ybl.l lVarF = vVar.k.f();
                fk3.a aVarA7 = vVar.v.a();
                vc.s.j(aVarA7);
                n8b.a aVarA8 = vVar.u.a();
                vc.s.j(aVarA8);
                return new uzk.d(lVarF, aVarA7, aVarA8, (f01.a) fVar9.f190940g.get());
            case 14:
                int i99 = this.f188775c;
                if (i99 == 0) {
                    return new t0l.j((lyk.a) ((kyk.v) this.f188774b).M.get(), (jki.p) ((kyk.g) this.d).f190942a.get());
                }
                if (i99 == 1) {
                    return new t0l.k();
                }
                throw new AssertionError(i99);
            case 15:
                kyk.v vVar2 = (kyk.v) this.f188774b;
                int i100 = this.f188775c;
                if (i100 == 0) {
                    return new com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b(new kye.e((hyk.l) vVar2.F.get()), vVar2.e(), new zzk.a((zzl.b) ((kyk.i) this.d).f190948c.get()));
                }
                if (i100 != 1) {
                    throw new AssertionError(i100);
                }
                d0l.b.Companion.getClass();
                return new zzl.c();
            case 16:
                l0k.a aVar16 = (l0k.a) this.d;
                l0k.c cVar7 = (l0k.c) this.f188774b;
                u8h.c cVar8 = cVar7.f191264j;
                int i101 = this.f188775c;
                if (i101 == 0) {
                    return a10.b.f((u8h.b) cVar8, "factory");
                }
                if (i101 != 1) {
                    if (i101 == 2) {
                        return a10.b.g((u8h.b) cVar8, "factory");
                    }
                    throw new AssertionError(i101);
                }
                InstrumentNewsControllerContract$InputData instrumentNewsControllerContract$InputData = aVar16.f191254b;
                kxk.o oVar2 = new kxk.o(new z0k.p(), (q1) aVar16.f.get());
                puk.d dVar7 = aVar16.f191255c;
                ybl.b bVarB = cVar7.f.b();
                vc.s.j(bVarB);
                return new z0k.o(instrumentNewsControllerContract$InputData, oVar2, dVar7, bVarB, (aah.h) aVar16.e.get(), (m0k.e) cVar7.H.get());
            case 17:
                u8h.c cVar9 = ((l0k.c) this.f188774b).f191264j;
                l0k.d dVar8 = (l0k.d) this.d;
                int i102 = this.f188775c;
                if (i102 == 0) {
                    return a10.b.f((u8h.b) cVar9, "factory");
                }
                if (i102 == 1) {
                    WealthAllNewsContract$InputData wealthAllNewsContract$InputData = dVar8.f191277b;
                    return new com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b(wealthAllNewsContract$InputData, new g1k.w(wealthAllNewsContract$InputData, new ykh.a(), new a1k.a(), (q1) dVar8.e.get()), new g1k.l(dVar8.f191277b, (m0k.e) dVar8.f191278c.H.get()), new g1k.b(), (aah.h) dVar8.d.get());
                }
                if (i102 == 2) {
                    return a10.b.g((u8h.b) cVar9, "factory");
                }
                throw new AssertionError(i102);
            case 18:
                int i103 = this.f188775c;
                if (i103 != 0) {
                    if (i103 == 1) {
                        return new ln.c();
                    }
                    throw new AssertionError(i103);
                }
                WealthNewsOverviewFlowContract$InputData wealthNewsOverviewFlowContract$InputData = ((l0k.i) this.d).f191296a;
                xoj.a aVarA9 = ((l0k.c) this.f188774b).f191267n.f191309a.a();
                vc.s.j(aVarA9);
                return new com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a(wealthNewsOverviewFlowContract$InputData, new qr0.i(aVarA9));
            case 19:
                l9f.k kVar3 = (l9f.k) this.f188774b;
                l9f.a aVar17 = (l9f.a) this.d;
                int i104 = this.f188775c;
                if (i104 == 0) {
                    return new naf.k((naf.e) aVar17.f193140b.get(), aVar17.f193139a, (o9f.c) kVar3.P.get(), (o9f.g) kVar3.H.get());
                }
                if (i104 == 1) {
                    return new naf.l();
                }
                throw new AssertionError(i104);
            case 20:
                int i105 = this.f188775c;
                if (i105 != 0) {
                    if (i105 == 1) {
                        return new v9f.q();
                    }
                    throw new AssertionError(i105);
                }
                o9f.c cVar10 = (o9f.c) ((l9f.k) this.f188774b).P.get();
                l9f.b bVar5 = (l9f.b) this.d;
                return new v9f.p(cVar10, bVar5.f193155a, (cli.n) bVar5.f193156b.get());
            case 21:
                l9f.k kVar4 = (l9f.k) this.f188774b;
                l9f.c cVar11 = (l9f.c) this.d;
                int i106 = this.f188775c;
                if (i106 == 0) {
                    return new gaf.k((cli.n) cVar11.f193159b.get(), cVar11.f193158a, (o9f.c) kVar4.P.get(), kVar4.f193190n.f());
                }
                if (i106 != 1) {
                    throw new AssertionError(i106);
                }
                gaf.n itemMapper = new gaf.n();
                Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
                return new gaf.o();
            case 22:
                l9f.e eVar8 = (l9f.e) this.d;
                int i107 = this.f188775c;
                if (i107 != 0) {
                    if (i107 == 1) {
                        return new taf.m();
                    }
                    throw new AssertionError(i107);
                }
                cli.n nVar7 = (cli.n) eVar8.f193164b.get();
                taf.g gVar7 = eVar8.f193163a;
                ybl.d dVarH = ((l9f.k) this.f188774b).f193191p.h();
                vc.s.j(dVarH);
                return new taf.l(nVar7, gVar7, dVarH);
            case 23:
                l9f.k kVar5 = (l9f.k) this.f188774b;
                int i108 = this.f188775c;
                if (i108 == 0) {
                    return new com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.a(((l9f.i) this.d).f193176a);
                }
                if (i108 != 1) {
                    throw new AssertionError(i108);
                }
                n8b.b bVarB2 = kVar5.f193194s.b();
                vc.s.j(bVarB2);
                fk3.a aVarA10 = kVar5.f193195t.a();
                vc.s.j(aVarA10);
                return new caf.c(bVarB2, aVarA10);
            case 24:
                l9f.k kVar6 = (l9f.k) this.f188774b;
                int i109 = this.f188775c;
                if (i109 == 0) {
                    return new com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a(((l9f.o) this.d).f193205a);
                }
                if (i109 != 1) {
                    throw new AssertionError(i109);
                }
                n8b.b bVarB3 = kVar6.f193194s.b();
                vc.s.j(bVarB3);
                fk3.a aVarA11 = kVar6.f193195t.a();
                vc.s.j(aVarA11);
                return new caf.c(bVarB3, aVarA11);
            case 25:
                l9f.p pVar4 = (l9f.p) this.d;
                l9f.k kVar7 = (l9f.k) this.f188774b;
                u8h.c cVar12 = kVar7.u;
                int i110 = this.f188775c;
                if (i110 == 0) {
                    return a10.b.f((u8h.b) cVar12, "factory");
                }
                if (i110 == 1) {
                    return new com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a(pVar4.f193209b, new ebf.r(new kpj.f(pVar4.f193210c.f193190n.H()), (q1) pVar4.e.get()), (o9f.c) kVar7.P.get(), kVar7.f193190n.f(), new ebf.a(), (aah.h) pVar4.d.get());
                }
                if (i110 == 2) {
                    return a10.b.g((u8h.b) cVar12, "factory");
                }
                throw new AssertionError(i110);
            case 26:
                return a();
            case 27:
                int i111 = this.f188775c;
                if (i111 == 0) {
                    l9f.s sVar2 = (l9f.s) this.d;
                    return new kaf.g(sVar2.f193219a, (kaf.b) sVar2.f193220b.get(), (o9f.c) ((l9f.k) this.f188774b).P.get());
                }
                if (i111 == 1) {
                    return new kaf.h();
                }
                throw new AssertionError(i111);
            case 28:
                l9f.w wVar = (l9f.w) this.d;
                int i112 = this.f188775c;
                if (i112 == 0) {
                    return new eaf.q(wVar.f193232b, (o9f.c) ((l9f.k) this.f188774b).P.get(), (cli.n) wVar.f193233c.get());
                }
                if (i112 == 1) {
                    return new eaf.r();
                }
                throw new AssertionError(i112);
            default:
                y yVar = (y) this.d;
                int i113 = this.f188775c;
                if (i113 == 0) {
                    return kxa.j.k((j60.a) yVar.f.get());
                }
                if (i113 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) yVar.d.get(), (rp0.m) yVar.e.get());
                }
                if (i113 == 2) {
                    return new rp0.m();
                }
                if (i113 == 3) {
                    return new t9f.o(yVar.f193238b, (w80.b) yVar.f193241h.get(), new t9f.a((w80.b) yVar.f193241h.get()), (j60.a) yVar.f.get());
                }
                if (i113 != 4) {
                    throw new AssertionError(i113);
                }
                qd0.b languageProvider = ((l9f.k) this.f188774b).f193185g.n();
                vc.s.j(languageProvider);
                u9f.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
        }
    }
}
