package jm4;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreenContract$InputData;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationInputData;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreenContract$InputData;
import com.revolut.feature.push_to_card.impl.ui.edit_card_owner.EditCardOwnerScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z3 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f176472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f176473c;
    public final Object d;

    public /* synthetic */ z3(Object obj2, Object obj3, int i, int i2) {
        this.f176471a = i2;
        this.f176472b = obj2;
        this.d = obj3;
        this.f176473c = i;
    }

    private final Object a() {
        joh.w wVar = (joh.w) this.f176472b;
        joh.k kVar = (joh.k) this.d;
        int i = this.f176473c;
        switch (i) {
            case 0:
                return va.g.i((uqh.s) kVar.e.get());
            case 1:
                joh.w wVar2 = kVar.d;
                fkg.a aVarF = wVar2.f();
                h9h.a aVar = wVar2.d;
                d9h.a aVarP = aVar.p();
                uqh.g0 g0Var = new uqh.g0();
                x8h.m mVarG = aVar.g();
                tzg.m mVarT = aVar.t();
                vc.s.j(mVarT);
                ybl.i iVarB = wVar2.f177070g.b();
                vc.s.j(iVarB);
                gte.a aVarB = wVar2.e.b();
                vc.s.j(aVarB);
                kl.t1 t1Var = new kl.t1(new aoh.a(mVarT, iVarB, aVarB));
                z0h.d dVarC = ((u8h.b) wVar2.f177071h).c();
                vc.s.j(dVarC);
                return va.g.o(new ugc.a(new uqh.l0(aVarF, aVarP, g0Var, mVarG, t1Var, new qr0.i(dVarC))), kVar.f177012a);
            case 2:
                return va.g.C(kVar.f177012a);
            case 3:
                return a10.b.f((u8h.b) wVar.f177071h, "factory");
            case 4:
                return n57.a.t((o5d.c) kVar.i.get());
            case 5:
                return n57.a.w(wVar.i.a(), kVar.f177013b);
            case 6:
                return va.g.j((uqh.s) kVar.e.get());
            case 7:
                return n57.a.v((o5d.c) kVar.i.get());
            case 8:
                return n57.a.g((o5d.c) kVar.i.get());
            case 9:
                ScreenerCollectionScreenContract$InputData screenerCollectionScreenContract$InputData = kVar.f177014c;
                ugl.c cVarD = wVar.f.d();
                vc.s.j(cVarD);
                uqh.u uVar = (uqh.u) kVar.f177020n.get();
                ooh.d dVar = new ooh.d();
                emi.a aVar2 = wVar.f177072j;
                q06.l legacyDeeplinkHandler = aVar2.f127661a.f304481c.a();
                vc.s.j(legacyDeeplinkHandler);
                lg0.b newDeeplinkHandlerWithoutFallbackToLegacy = (lg0.b) aVar2.f127664g.get();
                cmi.n deeplinkCoordinator = (cmi.n) aVar2.f127664g.get();
                emi.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(legacyDeeplinkHandler, "legacyDeeplinkHandler");
                Intrinsics.checkNotNullParameter(newDeeplinkHandlerWithoutFallbackToLegacy, "newDeeplinkHandlerWithoutFallbackToLegacy");
                Intrinsics.checkNotNullParameter(deeplinkCoordinator, "deeplinkCoordinator");
                wli.x xVar = new wli.x(new e58.e(deeplinkCoordinator, 18), new e58.e(newDeeplinkHandlerWithoutFallbackToLegacy, 19), new e58.e(legacyDeeplinkHandler, 20));
                o5d.a aVar3 = (o5d.a) kVar.o.get();
                joh.w wVar3 = kVar.d;
                return new com.revolut.feature.wealth_discovery.impl.screener.screens.collection.a(screenerCollectionScreenContract$InputData, cVarD, uVar, dVar, xVar, aVar3, new bof.r(new ryc.a(new uqh.c0(wVar3.g(), new uqh.q(), new uqh.p(), new vph.g(wVar3.h()), (iph.a) kVar.f177021p.get(), wVar3.d(), (z0h.q1) kVar.f177022q.get(), new uqh.a0()), new uqh.d0(wVar3.i(), new uqh.q(), new uqh.p(), (z0h.q1) kVar.f177022q.get())), new tnb.g0(wVar3.a()), new t5d.d()));
            case 10:
                return va.g.h((uqh.s) kVar.e.get());
            case 11:
                return n57.a.u((o5d.c) kVar.i.get());
            case 12:
                return new iph.a(wVar.d());
            case 13:
                return a10.b.g((u8h.b) wVar.f177071h, "factory");
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        joh.w wVar = (joh.w) this.f176472b;
        joh.q qVar = (joh.q) this.d;
        int i = this.f176473c;
        switch (i) {
            case 0:
                return va.g.i((uqh.s) qVar.e.get());
            case 1:
                joh.w wVar2 = qVar.d;
                fkg.a aVarF = wVar2.f();
                h9h.a aVar = wVar2.d;
                d9h.a aVarP = aVar.p();
                uqh.g0 g0Var = new uqh.g0();
                x8h.m mVarG = aVar.g();
                tzg.m mVarT = aVar.t();
                vc.s.j(mVarT);
                ybl.i iVarB = wVar2.f177070g.b();
                vc.s.j(iVarB);
                gte.a aVarB = wVar2.e.b();
                vc.s.j(aVarB);
                kl.t1 t1Var = new kl.t1(new aoh.a(mVarT, iVarB, aVarB));
                z0h.d dVarC = ((u8h.b) wVar2.f177071h).c();
                vc.s.j(dVarC);
                return va.g.o(new ugc.a(new uqh.l0(aVarF, aVarP, g0Var, mVarG, t1Var, new qr0.i(dVarC))), qVar.f177040a);
            case 2:
                return va.g.C(qVar.f177040a);
            case 3:
                return a10.b.f((u8h.b) wVar.f177071h, "factory");
            case 4:
                return n57.a.t((o5d.c) qVar.i.get());
            case 5:
                return n57.a.w(wVar.i.a(), qVar.f177041b);
            case 6:
                return va.g.j((uqh.s) qVar.e.get());
            case 7:
                return n57.a.v((o5d.c) qVar.i.get());
            case 8:
                return n57.a.g((o5d.c) qVar.i.get());
            case 9:
                cqh.h hVar = qVar.f177042c;
                cqh.h inputData = qVar.f177042c;
                zel.b bVar = zel.b.TOP_MOVERS;
                roh.a aVar2 = new roh.a();
                zel.b bVar2 = zel.b.MOST_TRADED;
                ImmutableMap configProviders = ImmutableMap.of(bVar, (qoh.b) aVar2, bVar2, new qoh.b());
                dqh.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(configProviders, "configProviders");
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                poh.j jVar = (poh.j) zhm.r0.h(yoj.b.q(inputData.f108108a), configProviders);
                vc.s.k(jVar);
                ImmutableMap paramsMappers = ImmutableMap.of(bVar, (qoh.c) new roh.b(), bVar2, new qoh.c());
                Intrinsics.checkNotNullParameter(paramsMappers, "paramsMappers");
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                poh.m mVar = (poh.m) zhm.r0.h(yoj.b.q(inputData.f108108a), paramsMappers);
                vc.s.k(mVar);
                uqh.u uVar = (uqh.u) qVar.f177048n.get();
                su9.c cVarE = wVar.f.e();
                o5d.a aVar3 = (o5d.a) qVar.o.get();
                cqh.a aVar4 = new cqh.a();
                joh.w wVar3 = qVar.d;
                return new com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a(hVar, jVar, mVar, uVar, cVarE, aVar3, new cqh.j(aVar4, new ryc.a(new uqh.c0(wVar3.g(), new uqh.q(), new uqh.p(), new vph.g(wVar3.h()), (iph.a) qVar.f177049p.get(), wVar3.d(), (z0h.q1) qVar.f177050q.get(), new uqh.a0()), new uqh.d0(wVar3.i(), new uqh.q(), new uqh.p(), (z0h.q1) qVar.f177050q.get())), new t5d.d()));
            case 10:
                return va.g.h((uqh.s) qVar.e.get());
            case 11:
                return n57.a.u((o5d.c) qVar.i.get());
            case 12:
                return new iph.a(wVar.d());
            case 13:
                return a10.b.g((u8h.b) wVar.f177071h, "factory");
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        joh.w wVar = (joh.w) this.f176472b;
        joh.z zVar = (joh.z) this.d;
        int i = this.f176473c;
        switch (i) {
            case 0:
                return va.g.C(zVar.f177080a);
            case 1:
                return a10.b.f((u8h.b) wVar.f177071h, "factory");
            case 2:
                return va.g.i((uqh.s) zVar.f177083g.get());
            case 3:
                joh.w wVar2 = zVar.d;
                fkg.a aVarF = wVar2.f();
                h9h.a aVar = wVar2.d;
                d9h.a aVarP = aVar.p();
                uqh.g0 g0Var = new uqh.g0();
                x8h.m mVarG = aVar.g();
                tzg.m mVarT = aVar.t();
                vc.s.j(mVarT);
                ybl.i iVarB = wVar2.f177070g.b();
                vc.s.j(iVarB);
                gte.a aVarB = wVar2.e.b();
                vc.s.j(aVarB);
                kl.t1 t1Var = new kl.t1(new aoh.a(mVarT, iVarB, aVarB));
                z0h.d dVarC = ((u8h.b) wVar2.f177071h).c();
                vc.s.j(dVarC);
                return va.g.o(new ugc.a(new uqh.l0(aVarF, aVarP, g0Var, mVarG, t1Var, new qr0.i(dVarC))), zVar.f177080a);
            case 4:
                return n57.a.t((o5d.c) zVar.i.get());
            case 5:
                return n57.a.w(wVar.i.a(), zVar.f177081b);
            case 6:
                return va.g.j((uqh.s) zVar.f177083g.get());
            case 7:
                return n57.a.v((o5d.c) zVar.i.get());
            case 8:
                return n57.a.g((o5d.c) zVar.i.get());
            case 9:
                nqh.e eVar = zVar.f177082c;
                sph.o oVar = new sph.o();
                uqh.u uVar = (uqh.u) zVar.f177088n.get();
                vph.a aVar2 = new vph.a();
                o5d.a aVar3 = (o5d.a) zVar.o.get();
                nqh.e eVar2 = zVar.f177082c;
                joh.w wVar3 = zVar.d;
                return new com.revolut.feature.wealth_discovery.impl.screener.screens.result.a(eVar, oVar, uVar, aVar2, aVar3, new bof.r(eVar2, new ryc.a(new uqh.c0(wVar3.g(), new uqh.q(), new uqh.p(), new vph.g(wVar3.h()), (iph.a) zVar.f177089p.get(), wVar3.d(), (z0h.q1) zVar.f177090q.get(), new uqh.a0()), new uqh.d0(wVar3.i(), new uqh.q(), new uqh.p(), (z0h.q1) zVar.f177090q.get())), new t5d.d()));
            case 10:
                return va.g.h((uqh.s) zVar.f177083g.get());
            case 11:
                return n57.a.u((o5d.c) zVar.i.get());
            case 12:
                return new iph.a(wVar.d());
            case 13:
                return a10.b.g((u8h.b) wVar.f177071h, "factory");
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        joh.w wVar = (joh.w) this.f176472b;
        joh.a0 a0Var = (joh.a0) this.d;
        int i = this.f176473c;
        switch (i) {
            case 0:
                return va.g.C(a0Var.f176958a);
            case 1:
                return a10.b.f((u8h.b) wVar.f177071h, "factory");
            case 2:
                return va.g.i((uqh.s) a0Var.f176961g.get());
            case 3:
                joh.w wVar2 = a0Var.d;
                fkg.a aVarF = wVar2.f();
                h9h.a aVar = wVar2.d;
                d9h.a aVarP = aVar.p();
                uqh.g0 g0Var = new uqh.g0();
                x8h.m mVarG = aVar.g();
                tzg.m mVarT = aVar.t();
                vc.s.j(mVarT);
                ybl.i iVarB = wVar2.f177070g.b();
                vc.s.j(iVarB);
                gte.a aVarB = wVar2.e.b();
                vc.s.j(aVarB);
                kl.t1 t1Var = new kl.t1(new aoh.a(mVarT, iVarB, aVarB));
                z0h.d dVarC = ((u8h.b) wVar2.f177071h).c();
                vc.s.j(dVarC);
                return va.g.o(new ugc.a(new uqh.l0(aVarF, aVarP, g0Var, mVarG, t1Var, new qr0.i(dVarC))), a0Var.f176958a);
            case 4:
                return n57.a.t((o5d.c) a0Var.i.get());
            case 5:
                return n57.a.w(wVar.i.a(), a0Var.f176959b);
            case 6:
                return va.g.j((uqh.s) a0Var.f176961g.get());
            case 7:
                return n57.a.v((o5d.c) a0Var.i.get());
            case 8:
                return n57.a.g((o5d.c) a0Var.i.get());
            case 9:
                nqh.e eVar = a0Var.f176960c;
                sph.o oVar = new sph.o();
                uqh.u uVar = (uqh.u) a0Var.f176966n.get();
                vph.a aVar2 = new vph.a();
                o5d.a aVar3 = (o5d.a) a0Var.o.get();
                nqh.e eVar2 = a0Var.f176960c;
                joh.w wVar3 = a0Var.d;
                return new com.revolut.feature.wealth_discovery.impl.screener.screens.result.a(eVar, oVar, uVar, aVar2, aVar3, new bof.r(eVar2, new ryc.a(new uqh.c0(wVar3.g(), new uqh.q(), new uqh.p(), new vph.g(wVar3.h()), (iph.a) a0Var.f176967p.get(), wVar3.d(), (z0h.q1) a0Var.f176968q.get(), new uqh.a0()), new uqh.d0(wVar3.i(), new uqh.q(), new uqh.p(), (z0h.q1) a0Var.f176968q.get())), new t5d.d()));
            case 10:
                return va.g.h((uqh.s) a0Var.f176961g.get());
            case 11:
                return n57.a.u((o5d.c) a0Var.i.get());
            case 12:
                return new iph.a(wVar.d());
            case 13:
                return a10.b.g((u8h.b) wVar.f177071h, "factory");
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        jqa.b bVar = (jqa.b) this.d;
        CardOwnerCreationInputData cardOwnerCreationInputData = bVar.f177531a;
        int i = this.f176473c;
        if (i == 0) {
            Object extension = (zqa.a) bVar.d.get();
            yqa.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i == 2) {
                return new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.d(new xqa.a(), (zqa.a) bVar.d.get(), cardOwnerCreationInputData);
            }
            throw new AssertionError(i);
        }
        lra.d dVarB = ((jqa.p) bVar.f177532b.C).b();
        vc.s.j(dVarB);
        tqa.c maskUtils = new tqa.c();
        Intrinsics.checkNotNullParameter(maskUtils, "maskUtils");
        t1j.b bVar2 = new t1j.b(dVarB, new xqa.d());
        zqa.g gVar = new zqa.g();
        ora.a aVar = (ora.a) ((jqa.p) ((jqa.e) this.f176472b).C).z.get();
        vc.s.j(aVar);
        return new zqa.f(bVar2, gVar, aVar, cardOwnerCreationInputData);
    }

    private final Object f() {
        jqa.e eVar = (jqa.e) this.f176472b;
        jqa.c cVar = (jqa.c) this.d;
        jqa.e eVar2 = cVar.f177535b;
        int i = this.f176473c;
        if (i == 0) {
            d2a.a model = (d2a.a) cVar.f177536c.get();
            fsa.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            vc.s.k(model);
            return model;
        }
        if (i == 1) {
            p2a.a factory = eVar.J.a();
            vc.s.j(factory);
            fsa.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        CardRecipientDetailsScreenContract$InputData cardRecipientDetailsScreenContract$InputData = cVar.f177534a;
        vpa.b bVar = eVar2.C;
        lra.d dVarB = ((jqa.p) bVar).b();
        vc.s.j(dVarB);
        zpa.a aVar = (zpa.a) ((jqa.p) bVar).u.get();
        vc.s.j(aVar);
        whf.b bVarA = eVar2.K.a();
        vc.s.j(bVarA);
        osa.b bVar2 = new osa.b(dVarB, aVar, bVarA, new r10.a(new b6k.f(eVar2.z.b(), eVar2.L.a(), new j9l.a()), new b6k.d()));
        esa.o oVar = new esa.o();
        zof.f fVarD = eVar.B.d();
        vc.s.j(fVarD);
        d2a.a aVar2 = (d2a.a) cVar.f177536c.get();
        aqa.a aVarA = ((jqa.p) eVar2.C).a();
        vc.s.j(aVarA);
        b6k.c cVar2 = new b6k.c();
        n8b.a aVarA2 = eVar2.M.a();
        vc.s.j(aVarA2);
        yof.a aVarA3 = eVar2.B.a();
        vc.s.j(aVarA3);
        r2a.b bVar3 = new r2a.b();
        whf.n nVarB = eVar2.K.b();
        vc.s.j(nVarB);
        return new com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a(cardRecipientDetailsScreenContract$InputData, bVar2, oVar, fVarD, aVar2, new esa.n(aVarA, new gsa.c(cVar2, aVarA2, aVarA3, bVar3, nVarB)));
    }

    private final Object g() {
        jqa.d dVar = (jqa.d) this.d;
        int i = this.f176473c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            jsa.b.Companion.getClass();
            return new zzl.c();
        }
        EditCardOwnerScreenContract$InputData editCardOwnerScreenContract$InputData = dVar.f177537a;
        lra.d dVarB = ((jqa.p) ((jqa.e) this.f176472b).C).b();
        vc.s.j(dVarB);
        return new hsa.m(editCardOwnerScreenContract$InputData, dVarB, new f4h.a((zzl.b) dVar.f177538b.get()), new a3e.u(new ksa.a(new mra.k())));
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object aVar2;
        switch (this.f176471a) {
            case 0:
                a3 a3Var = (a3) this.f176472b;
                w3 w3Var = (w3) this.d;
                CreditCardDescriptionScreenContract$InputData creditCardDescriptionScreenContract$InputData = w3Var.f176424b;
                int i = this.f176473c;
                if (i == 0) {
                    return new com.revolut.feature.credit.card.impl.ui.description.a(creditCardDescriptionScreenContract$InputData, ((s41.a) a3Var.f175975l).d(), (jki.p) w3Var.d.get());
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                qd0.b bVarN = w3Var.f176425c.k.n();
                vc.s.j(bVarN);
                return yf6.b.o(creditCardDescriptionScreenContract$InputData, new u80.m(bVarN), new bp4.h(), a3Var.L.b());
            case 1:
                pb5.a aVar3 = ((a3) this.f176472b).d;
                int i2 = this.f176473c;
                if (i2 == 0) {
                    lb5.a aVar4 = (lb5.a) aVar3.o.get();
                    vc.s.j(aVar4);
                    return new com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a(aVar4, new xy4.b(), ((a4) this.d).f175991a);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                lb5.a aVar5 = (lb5.a) aVar3.o.get();
                vc.s.j(aVar5);
                return new kr4.a(aVar5);
            case 2:
                a3 a3Var2 = (a3) this.f176472b;
                r rVar = a3Var2.f175965b;
                djf.c cVar = a3Var2.f175971h;
                c4 c4Var = (c4) this.d;
                a3 a3Var3 = c4Var.f176029c;
                int i3 = this.f176473c;
                if (i3 == 0) {
                    Object extension = (f15.a) c4Var.d.get();
                    as4.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar = (yji.n) extension;
                    vc.s.k(nVar);
                    return nVar;
                }
                if (i3 == 1) {
                    j15.e provider = a3Var2.C.a();
                    vc.s.j(provider);
                    as4.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider, "provider");
                    return provider.a();
                }
                if (i3 == 2) {
                    InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData = c4Var.f176028b;
                    al4.m mVarR = rVar.r();
                    vc.s.j(mVarR);
                    al4.n nVarS = rVar.s();
                    vc.s.j(nVarS);
                    jid.z zVarM = a3Var2.m();
                    yr4.g gVar = new yr4.g(new bp4.e());
                    vt4.b bVar = new vt4.b();
                    f15.a aVar6 = (f15.a) c4Var.d.get();
                    ang.f fVarE = a3Var2.f.e();
                    lt4.d dVar = new lt4.d();
                    al4.m mVarR2 = a3Var3.f175965b.r();
                    vc.s.j(mVarR2);
                    return new com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a(instalmentDetailsScreenContract$InputData, mVarR, nVarS, zVarM, gVar, bVar, aVar6, fVarE, dVar, new pak.h(mVarR2), (cli.n) c4Var.f.get());
                }
                if (i3 != 3) {
                    throw new AssertionError(i3);
                }
                InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData2 = c4Var.f176028b;
                whf.n nVarB = cVar.b();
                vc.s.j(nVarB);
                yr4.a aVar7 = new yr4.a();
                thf.m mVarG = a3Var3.f175971h.g();
                vc.s.j(mVarG);
                thf.d dVarD = a3Var3.f175971h.d();
                vc.s.j(dVarD);
                yr4.e eVar = new yr4.e(mVarG, new gs4.f(dVarD));
                thf.m mVarG2 = cVar.g();
                vc.s.j(mVarG2);
                thf.d dVarD2 = a3Var3.f175971h.d();
                vc.s.j(dVarD2);
                return new zr4.e0(instalmentDetailsScreenContract$InputData2, nVarB, aVar7, eVar, mVarG2, new gs4.f(dVarD2), new gs4.l(), new he2.b(new lt4.b(), new lt4.e()));
            case 3:
                a3 a3Var4 = (a3) this.f176472b;
                c4 c4Var2 = (c4) this.d;
                a3 a3Var5 = c4Var2.f176029c;
                int i5 = this.f176473c;
                if (i5 == 0) {
                    Object extension2 = (f15.a) c4Var2.d.get();
                    as4.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar2 = (yji.n) extension2;
                    vc.s.k(nVar2);
                    return nVar2;
                }
                if (i5 == 1) {
                    j15.e provider2 = a3Var4.C.a();
                    vc.s.j(provider2);
                    as4.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider2, "provider");
                    return provider2.a();
                }
                if (i5 == 2) {
                    InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData3 = c4Var2.f176028b;
                    al4.m mVarR3 = a3Var4.f175965b.r();
                    vc.s.j(mVarR3);
                    al4.n nVarS2 = a3Var4.f175965b.s();
                    vc.s.j(nVarS2);
                    jid.z zVarM2 = a3Var4.m();
                    yr4.g gVar2 = new yr4.g(new bp4.e());
                    vt4.b bVar2 = new vt4.b();
                    f15.a aVar8 = (f15.a) c4Var2.d.get();
                    ang.f fVarE2 = a3Var4.f.e();
                    lt4.d dVar2 = new lt4.d();
                    al4.m mVarR4 = a3Var5.f175965b.r();
                    vc.s.j(mVarR4);
                    return new com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a(instalmentDetailsScreenContract$InputData3, mVarR3, nVarS2, zVarM2, gVar2, bVar2, aVar8, fVarE2, dVar2, new pak.h(mVarR4), (cli.n) c4Var2.f.get());
                }
                if (i5 != 3) {
                    throw new AssertionError(i5);
                }
                InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData4 = c4Var2.f176028b;
                whf.n nVarB2 = a3Var4.f175971h.b();
                vc.s.j(nVarB2);
                yr4.a aVar9 = new yr4.a();
                thf.m mVarG3 = a3Var5.f175971h.g();
                vc.s.j(mVarG3);
                thf.d dVarD3 = a3Var5.f175971h.d();
                vc.s.j(dVarD3);
                yr4.e eVar2 = new yr4.e(mVarG3, new gs4.f(dVarD3));
                thf.m mVarG4 = a3Var4.f175971h.g();
                vc.s.j(mVarG4);
                thf.d dVarD4 = a3Var5.f175971h.d();
                vc.s.j(dVarD4);
                return new zr4.e0(instalmentDetailsScreenContract$InputData4, nVarB2, aVar9, eVar2, mVarG4, new gs4.f(dVarD4), new gs4.l(), new he2.b(new lt4.b(), new lt4.e()));
            case 4:
                f4 f4Var = (f4) this.d;
                int i6 = this.f176473c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new ls4.q(new vt4.h());
                    }
                    throw new AssertionError(i6);
                }
                CreditCardChooseInstalmentsScreenContract$InputData creditCardChooseInstalmentsScreenContract$InputData = f4Var.f176079b;
                al4.m mVarR5 = ((a3) this.f176472b).f175965b.r();
                vc.s.j(mVarR5);
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a(creditCardChooseInstalmentsScreenContract$InputData, mVarR5, (cli.n) f4Var.f176080c.get());
            case 5:
                f4 f4Var2 = (f4) this.d;
                int i21 = this.f176473c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new ls4.q(new vt4.h());
                    }
                    throw new AssertionError(i21);
                }
                CreditCardChooseInstalmentsScreenContract$InputData creditCardChooseInstalmentsScreenContract$InputData2 = f4Var2.f176079b;
                al4.m mVarR6 = ((a3) this.f176472b).f175965b.r();
                vc.s.j(mVarR6);
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a(creditCardChooseInstalmentsScreenContract$InputData2, mVarR6, (cli.n) f4Var2.f176080c.get());
            case 6:
                k4 k4Var = (k4) this.d;
                int i22 = this.f176473c;
                if (i22 == 0) {
                    return kxa.j.k((j60.a) k4Var.e.get());
                }
                if (i22 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) k4Var.f176176c.get(), (rp0.m) k4Var.d.get());
                }
                if (i22 == 2) {
                    return new rp0.m();
                }
                if (i22 != 3) {
                    if (i22 == 4) {
                        return new com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d();
                    }
                    throw new AssertionError(i22);
                }
                CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData = k4Var.f176175b;
                al4.m mVarR7 = ((a3) this.f176472b).f175965b.r();
                vc.s.j(mVarR7);
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c(creditCardRepayDetailsControllerScreenContract$InputData, mVarR7, new vt4.b(), (j60.a) k4Var.e.get(), (cli.n) k4Var.f176177g.get());
            case 7:
                k4 k4Var2 = (k4) this.d;
                int i32 = this.f176473c;
                if (i32 == 0) {
                    return kxa.j.k((j60.a) k4Var2.e.get());
                }
                if (i32 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) k4Var2.f176176c.get(), (rp0.m) k4Var2.d.get());
                }
                if (i32 == 2) {
                    return new rp0.m();
                }
                if (i32 != 3) {
                    if (i32 == 4) {
                        return new com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d();
                    }
                    throw new AssertionError(i32);
                }
                CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData2 = k4Var2.f176175b;
                al4.m mVarR8 = ((a3) this.f176472b).f175965b.r();
                vc.s.j(mVarR8);
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c(creditCardRepayDetailsControllerScreenContract$InputData2, mVarR8, new vt4.b(), (j60.a) k4Var2.e.get(), (cli.n) k4Var2.f176177g.get());
            case 8:
                a3 a3Var6 = (a3) this.f176472b;
                l4 l4Var = (l4) this.d;
                int i33 = this.f176473c;
                if (i33 == 0) {
                    CreditCardStatementDetailsScreenContract$InputData creditCardStatementDetailsScreenContract$InputData = l4Var.f176190a;
                    al4.n nVarS3 = a3Var6.f175965b.s();
                    vc.s.j(nVarS3);
                    return new com.revolut.feature.credit.card.impl.ui.statement.details.a(creditCardStatementDetailsScreenContract$InputData, nVarS3, new lt4.d(), a3Var6.f.e(), (cli.n) l4Var.f176191b.get());
                }
                if (i33 != 1) {
                    throw new AssertionError(i33);
                }
                fv4.a localizationProvider = new fv4.a();
                Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
                return new fv4.u();
            case 9:
                m4 m4Var = (m4) this.d;
                int i43 = this.f176473c;
                if (i43 == 0) {
                    return kxa.j.k((j60.a) m4Var.d.get());
                }
                if (i43 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) m4Var.f176206b.get(), (rp0.m) m4Var.f176207c.get());
                }
                if (i43 == 2) {
                    return new rp0.m();
                }
                if (i43 == 3) {
                    return new xv4.p(m4Var.f176205a, (cli.n) m4Var.f.get(), (j60.a) m4Var.d.get(), (aw4.b) ((a3) this.f176472b).f175966b0.get());
                }
                if (i43 == 4) {
                    return new xv4.q();
                }
                throw new AssertionError(i43);
            case 10:
                a3 a3Var7 = (a3) this.f176472b;
                o4 o4Var = (o4) this.d;
                a3 a3Var8 = o4Var.f176237c;
                int i59 = this.f176473c;
                switch (i59) {
                    case 0:
                        return kxa.j.k((j60.a) o4Var.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) o4Var.d.get(), (rp0.m) o4Var.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        ssi.m extension3 = (ssi.m) o4Var.i.get();
                        uv4.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        vc.s.k(extension3);
                        return extension3;
                    case 4:
                        oqk.l transactionsWidgetActionExtensionProvider = a3Var7.N.b();
                        vc.s.j(transactionsWidgetActionExtensionProvider);
                        j60.a bottomDialogExtension = (j60.a) o4Var.f.get();
                        rp0.l0 popupMenuDialogDisplayer = (rp0.l0) o4Var.f176239h.get();
                        uv4.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                        return transactionsWidgetActionExtensionProvider.a(bottomDialogExtension, popupMenuDialogDisplayer);
                    case 5:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) o4Var.d.get();
                        uv4.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new rp0.l0(controller.m2());
                    case 6:
                        CreditCardStatementTransactionsScreenContract$InputData creditCardStatementTransactionsScreenContract$InputData = o4Var.f176236b;
                        al4.n nVarS4 = a3Var7.f175965b.s();
                        vc.s.j(nVarS4);
                        r rVar2 = a3Var8.f175965b;
                        al4.q qVarA = rVar2.a();
                        al4.m mVarR9 = rVar2.r();
                        vc.s.j(mVarR9);
                        fm4.a aVarA = a3Var8.f175963a.a();
                        whf.b bVarA = a3Var8.f175971h.a();
                        vc.s.j(bVarA);
                        lal.a aVar10 = new lal.a(qVarA, mVarR9, aVarA, bVarA);
                        ssi.m mVar = (ssi.m) o4Var.i.get();
                        r rVar3 = a3Var8.f175965b;
                        x9e.a aVar11 = a3Var8.Q;
                        al4.q qVarA2 = rVar3.a();
                        g9e.a aVarC = aVar11.c();
                        vc.s.j(aVarC);
                        whf.b bVarA2 = a3Var8.f175971h.a();
                        vc.s.j(bVarA2);
                        h9e.h hVar = (h9e.h) aVar11.H.get();
                        vc.s.j(hVar);
                        om4.f4 f4Var3 = new om4.f4(qVarA2, aVarC, bVarA2, hVar);
                        c9e.c cVarB = a3Var7.Q.b();
                        vc.s.j(cVarB);
                        return new tv4.o(creditCardStatementTransactionsScreenContract$InputData, nVarS4, aVar10, mVar, f4Var3, cVarB, (cli.n) o4Var.k.get());
                    case 7:
                        djf.c cVar2 = a3Var8.f175971h;
                        thf.l lVarF = cVar2.f();
                        vc.s.j(lVarF);
                        thf.d dVarD5 = cVar2.d();
                        vc.s.j(dVarD5);
                        thf.m mVarG5 = cVar2.g();
                        vc.s.j(mVarG5);
                        sv4.k kVar = new sv4.k(lVarF, dVarD5, mVarG5);
                        mae.p pVarE = a3Var8.Q.e();
                        vc.s.j(pVarE);
                        com.revolut.kompot.navigable.a aVar12 = (com.revolut.kompot.navigable.a) o4Var.d.get();
                        t70.b bVarG = a3Var8.k.g();
                        vc.s.j(bVarG);
                        return new tv4.p(kVar, new sv4.m(us6.w3.w(pVarE, aVar12, bVarG)));
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                a3 a3Var9 = (a3) this.f176472b;
                o4 o4Var2 = (o4) this.d;
                a3 a3Var10 = o4Var2.f176237c;
                int i66 = this.f176473c;
                switch (i66) {
                    case 0:
                        return kxa.j.k((j60.a) o4Var2.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) o4Var2.d.get(), (rp0.m) o4Var2.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        ssi.m extension4 = (ssi.m) o4Var2.i.get();
                        uv4.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        vc.s.k(extension4);
                        return extension4;
                    case 4:
                        oqk.l transactionsWidgetActionExtensionProvider2 = a3Var9.N.b();
                        vc.s.j(transactionsWidgetActionExtensionProvider2);
                        j60.a bottomDialogExtension2 = (j60.a) o4Var2.f.get();
                        rp0.l0 popupMenuDialogDisplayer2 = (rp0.l0) o4Var2.f176239h.get();
                        uv4.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider2, "transactionsWidgetActionExtensionProvider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension2, "bottomDialogExtension");
                        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer2, "popupMenuDialogDisplayer");
                        return transactionsWidgetActionExtensionProvider2.a(bottomDialogExtension2, popupMenuDialogDisplayer2);
                    case 5:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) o4Var2.d.get();
                        uv4.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        return new rp0.l0(controller2.m2());
                    case 6:
                        CreditCardStatementTransactionsScreenContract$InputData creditCardStatementTransactionsScreenContract$InputData2 = o4Var2.f176236b;
                        al4.n nVarS5 = a3Var9.f175965b.s();
                        vc.s.j(nVarS5);
                        r rVar4 = a3Var10.f175965b;
                        al4.q qVarA3 = rVar4.a();
                        al4.m mVarR10 = rVar4.r();
                        vc.s.j(mVarR10);
                        fm4.a aVarA2 = a3Var10.f175963a.a();
                        whf.b bVarA3 = a3Var10.f175971h.a();
                        vc.s.j(bVarA3);
                        lal.a aVar13 = new lal.a(qVarA3, mVarR10, aVarA2, bVarA3);
                        ssi.m mVar2 = (ssi.m) o4Var2.i.get();
                        r rVar5 = a3Var10.f175965b;
                        x9e.a aVar14 = a3Var10.Q;
                        al4.q qVarA4 = rVar5.a();
                        g9e.a aVarC2 = aVar14.c();
                        vc.s.j(aVarC2);
                        whf.b bVarA4 = a3Var10.f175971h.a();
                        vc.s.j(bVarA4);
                        h9e.h hVar2 = (h9e.h) aVar14.H.get();
                        vc.s.j(hVar2);
                        om4.f4 f4Var4 = new om4.f4(qVarA4, aVarC2, bVarA4, hVar2);
                        c9e.c cVarB2 = a3Var9.Q.b();
                        vc.s.j(cVarB2);
                        return new tv4.o(creditCardStatementTransactionsScreenContract$InputData2, nVarS5, aVar13, mVar2, f4Var4, cVarB2, (cli.n) o4Var2.k.get());
                    case 7:
                        djf.c cVar3 = a3Var10.f175971h;
                        thf.l lVarF2 = cVar3.f();
                        vc.s.j(lVarF2);
                        thf.d dVarD6 = cVar3.d();
                        vc.s.j(dVarD6);
                        thf.m mVarG6 = cVar3.g();
                        vc.s.j(mVarG6);
                        sv4.k kVar2 = new sv4.k(lVarF2, dVarD6, mVarG6);
                        mae.p pVarE2 = a3Var10.Q.e();
                        vc.s.j(pVarE2);
                        com.revolut.kompot.navigable.a aVar15 = (com.revolut.kompot.navigable.a) o4Var2.d.get();
                        t70.b bVarG2 = a3Var10.k.g();
                        vc.s.j(bVarG2);
                        return new tv4.p(kVar2, new sv4.m(us6.w3.w(pVarE2, aVar15, bVarG2)));
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                l70.e eVar3 = ((a3) this.f176472b).k;
                int i74 = this.f176473c;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new com.revolut.feature.credit.direct.debit.account_details_v2.a();
                    }
                    throw new AssertionError(i74);
                }
                c70.a aVarZ = eVar3.z();
                vc.s.j(aVarZ);
                r70.c cVarA = eVar3.A();
                vc.s.j(cVarA);
                p4 p4Var = (p4) this.d;
                return new ry4.h(aVarZ, cVarA, p4Var.f176254a, (jki.p) p4Var.f176255b.get());
            case 13:
                l70.e eVar4 = ((a3) this.f176472b).k;
                dw3.f2 f2Var = (dw3.f2) this.d;
                int i92 = this.f176473c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new py4.h((c90.c) f2Var.d.get());
                    }
                    if (i92 == 2) {
                        return qw7.u.y(f2Var.f118708c);
                    }
                    throw new AssertionError(i92);
                }
                c70.a aVarZ2 = eVar4.z();
                vc.s.j(aVarZ2);
                r70.c cVarA2 = eVar4.A();
                vc.s.j(cVarA2);
                return new py4.f(aVarZ2, cVarA2, f2Var.f118707b, (jki.p) f2Var.e.get());
            case 14:
                joh.b bVar3 = (joh.b) this.d;
                joh.a aVar16 = bVar3.f176972c;
                joh.a aVar17 = (joh.a) this.f176472b;
                h9h.a aVar18 = aVar17.f176956b;
                u8h.c cVar4 = aVar17.f176955a;
                int i96 = this.f176473c;
                if (i96 == 0) {
                    return a10.b.f((u8h.b) cVar4, "factory");
                }
                if (i96 != 1) {
                    if (i96 == 2) {
                        return a10.b.g((u8h.b) cVar4, "factory");
                    }
                    throw new AssertionError(i96);
                }
                MostTradedAssetsScreenContract$InputData mostTradedAssetsScreenContract$InputData = bVar3.f176971b;
                su9.c cVarK = aVar18.k();
                d9h.a aVar19 = new d9h.a(aVar18.D(), 1);
                sgh.a aVar20 = new sgh.a();
                z0h.d dVarC = ((u8h.b) aVar16.f176955a).c();
                vc.s.j(dVarC);
                boh.x xVar = new boh.x(dVarC, 0);
                boh.b bVar4 = new boh.b();
                t70.b bVarG3 = aVar16.f176956b.o.g();
                vc.s.j(bVarG3);
                return new com.revolut.feature.wealth_discovery.impl.collection.most_traded.a(mostTradedAssetsScreenContract$InputData, cVarK, aVar19, aVar20, xVar, bVar4, new boh.w(new jbh.b(bVarG3, h9h.a.x()), new boh.b(), (z0h.q1) bVar3.e.get()));
            case 15:
                joh.c cVar5 = (joh.c) this.d;
                joh.a aVar21 = (joh.a) this.f176472b;
                u8h.c cVar6 = aVar21.f176955a;
                int i99 = this.f176473c;
                if (i99 == 0) {
                    return a10.b.f((u8h.b) cVar6, "factory");
                }
                if (i99 == 1) {
                    return new doh.j(cVar5.f176974b, new doh.k(new doh.a(), (z0h.q1) cVar5.e.get()), aVar21.f176956b.m(), (aah.h) cVar5.d.get());
                }
                if (i99 == 2) {
                    return a10.b.g((u8h.b) cVar6, "factory");
                }
                throw new AssertionError(i99);
            case 16:
                joh.d dVar3 = (joh.d) this.d;
                joh.a aVar22 = dVar3.f176978c;
                joh.a aVar23 = (joh.a) this.f176472b;
                h9h.a aVar24 = aVar23.f176956b;
                u8h.c cVar7 = aVar23.f176955a;
                int i100 = this.f176473c;
                if (i100 == 0) {
                    return a10.b.f((u8h.b) cVar7, "factory");
                }
                if (i100 != 1) {
                    if (i100 == 2) {
                        return a10.b.g((u8h.b) cVar7, "factory");
                    }
                    throw new AssertionError(i100);
                }
                TopMoversScreenContract$InputData topMoversScreenContract$InputData = dVar3.f176977b;
                h9h.a aVar25 = aVar22.f176956b;
                tsk.t topMoversInteractor = aVar25.r();
                e9h.d performanceAssetsTransformer = aVar25.D();
                adh.a performanceCalculator = new adh.a();
                Intrinsics.checkNotNullParameter(topMoversInteractor, "topMoversInteractor");
                Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
                Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
                twg.c cVar8 = new twg.c();
                cVar8.f275017a = topMoversInteractor;
                cVar8.f275018b = performanceAssetsTransformer;
                cVar8.f275019c = performanceCalculator;
                tsk.t tVarR = aVar24.r();
                ybl.l lVarF3 = aVar24.f();
                ugh.a aVar26 = new ugh.a();
                z0h.d dVarC2 = ((u8h.b) aVar22.f176955a).c();
                vc.s.j(dVarC2);
                return new com.revolut.feature.wealth_discovery.impl.collection.top_movers.a(topMoversScreenContract$InputData, cVar8, tVarR, lVarF3, aVar26, new boh.x(dVarC2, 1), new foh.e(), new foh.y(new adh.a(), new jbh.c(), new foh.e(), (z0h.q1) dVar3.e.get()));
            case 17:
                joh.w wVar = (joh.w) this.f176472b;
                joh.e eVar5 = (joh.e) this.d;
                int i101 = this.f176473c;
                switch (i101) {
                    case 0:
                        return va.g.i((uqh.s) eVar5.e.get());
                    case 1:
                        joh.w wVar2 = eVar5.d;
                        fkg.a aVarF = wVar2.f();
                        h9h.a aVar27 = wVar2.d;
                        d9h.a aVarP = aVar27.p();
                        uqh.g0 g0Var = new uqh.g0();
                        x8h.m mVarG7 = aVar27.g();
                        tzg.m mVarT = aVar27.t();
                        vc.s.j(mVarT);
                        ybl.i iVarB = wVar2.f177070g.b();
                        vc.s.j(iVarB);
                        gte.a aVarB = wVar2.e.b();
                        vc.s.j(aVarB);
                        kl.t1 t1Var = new kl.t1(new aoh.a(mVarT, iVarB, aVarB));
                        z0h.d dVarC3 = ((u8h.b) wVar2.f177071h).c();
                        vc.s.j(dVarC3);
                        return va.g.o(new ugc.a(new uqh.l0(aVarF, aVarP, g0Var, mVarG7, t1Var, new qr0.i(dVarC3))), eVar5.f176979a);
                    case 2:
                        return va.g.C(eVar5.f176979a);
                    case 3:
                        return a10.b.f((u8h.b) wVar.f177071h, "factory");
                    case 4:
                        return n57.a.t((o5d.c) eVar5.i.get());
                    case 5:
                        return n57.a.w(wVar.i.a(), eVar5.f176980b);
                    case 6:
                        return va.g.j((uqh.s) eVar5.e.get());
                    case 7:
                        return n57.a.v((o5d.c) eVar5.i.get());
                    case 8:
                        return n57.a.g((o5d.c) eVar5.i.get());
                    case 9:
                        jph.g gVar3 = eVar5.f176981c;
                        uqh.u uVar = (uqh.u) eVar5.f176987n.get();
                        sph.o oVar = new sph.o();
                        o5d.a aVar28 = (o5d.a) eVar5.o.get();
                        joh.w wVar3 = eVar5.d;
                        aVar = new com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list.a(gVar3, uVar, oVar, aVar28, new ac4.g(new fn2.c(new ryc.a(new uqh.c0(wVar3.g(), new uqh.q(), new uqh.p(), new vph.g(wVar3.h()), (iph.a) eVar5.f176988p.get(), wVar3.d(), (z0h.q1) eVar5.f176989q.get(), new uqh.a0()), new uqh.d0(wVar3.i(), new uqh.q(), new uqh.p(), (z0h.q1) eVar5.f176989q.get()))), new jph.j(), new t5d.d()));
                        break;
                    case 10:
                        return va.g.h((uqh.s) eVar5.e.get());
                    case 11:
                        return n57.a.u((o5d.c) eVar5.i.get());
                    case 12:
                        aVar = new iph.a(wVar.d());
                        break;
                    case 13:
                        return a10.b.g((u8h.b) wVar.f177071h, "factory");
                    default:
                        throw new AssertionError(i101);
                }
                return aVar;
            case 18:
                joh.w wVar4 = (joh.w) this.f176472b;
                joh.f fVar = (joh.f) this.d;
                int i102 = this.f176473c;
                switch (i102) {
                    case 0:
                        return va.g.i((uqh.s) fVar.e.get());
                    case 1:
                        joh.w wVar5 = fVar.d;
                        fkg.a aVarF2 = wVar5.f();
                        h9h.a aVar29 = wVar5.d;
                        d9h.a aVarP2 = aVar29.p();
                        uqh.g0 g0Var2 = new uqh.g0();
                        x8h.m mVarG8 = aVar29.g();
                        tzg.m mVarT2 = aVar29.t();
                        vc.s.j(mVarT2);
                        ybl.i iVarB2 = wVar5.f177070g.b();
                        vc.s.j(iVarB2);
                        gte.a aVarB2 = wVar5.e.b();
                        vc.s.j(aVarB2);
                        kl.t1 t1Var2 = new kl.t1(new aoh.a(mVarT2, iVarB2, aVarB2));
                        z0h.d dVarC4 = ((u8h.b) wVar5.f177071h).c();
                        vc.s.j(dVarC4);
                        return va.g.o(new ugc.a(new uqh.l0(aVarF2, aVarP2, g0Var2, mVarG8, t1Var2, new qr0.i(dVarC4))), fVar.f176991a);
                    case 2:
                        return va.g.C(fVar.f176991a);
                    case 3:
                        return a10.b.f((u8h.b) wVar4.f177071h, "factory");
                    case 4:
                        return n57.a.t((o5d.c) fVar.i.get());
                    case 5:
                        return n57.a.w(wVar4.i.a(), fVar.f176992b);
                    case 6:
                        return va.g.j((uqh.s) fVar.e.get());
                    case 7:
                        return n57.a.v((o5d.c) fVar.i.get());
                    case 8:
                        return n57.a.g((o5d.c) fVar.i.get());
                    case 9:
                        eqh.g gVar4 = fVar.f176993c;
                        sph.o oVar2 = new sph.o();
                        uqh.u uVar2 = (uqh.u) fVar.f176999n.get();
                        o5d.a aVar30 = (o5d.a) fVar.o.get();
                        joh.w wVar6 = fVar.d;
                        aVar2 = new com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.a(gVar4, oVar2, uVar2, aVar30, new cqh.j(new ryc.a(new uqh.c0(wVar6.g(), new uqh.q(), new uqh.p(), new vph.g(wVar6.h()), (iph.a) fVar.f177000p.get(), wVar6.d(), (z0h.q1) fVar.f177001q.get(), new uqh.a0()), new uqh.d0(wVar6.i(), new uqh.q(), new uqh.p(), (z0h.q1) fVar.f177001q.get())), new t5d.d()));
                        break;
                    case 10:
                        return va.g.h((uqh.s) fVar.e.get());
                    case 11:
                        return n57.a.u((o5d.c) fVar.i.get());
                    case 12:
                        aVar2 = new iph.a(wVar4.d());
                        break;
                    case 13:
                        return a10.b.g((u8h.b) wVar4.f177071h, "factory");
                    default:
                        throw new AssertionError(i102);
                }
                return aVar2;
            case 19:
                return a();
            case 20:
                joh.l lVar = (joh.l) this.d;
                joh.w wVar7 = lVar.f177026c;
                joh.w wVar8 = (joh.w) this.f176472b;
                u8h.c cVar9 = wVar8.f177071h;
                int i103 = this.f176473c;
                if (i103 == 0) {
                    return a10.b.f((u8h.b) cVar9, "factory");
                }
                if (i103 != 1) {
                    if (i103 == 2) {
                        return a10.b.g((u8h.b) cVar9, "factory");
                    }
                    throw new AssertionError(i103);
                }
                ScreenerCollectionsPageContract$InputData screenerCollectionsPageContract$InputData = lVar.f177025b;
                oph.o oVar3 = new oph.o(new ooh.d(), wVar7.a(), new hph.a(), new nph.d(), (z0h.q1) lVar.e.get());
                ugl.c cVarD = wVar8.f.d();
                vc.s.j(cVarD);
                ybl.b bVarB = wVar8.f177069c.b();
                vc.s.j(bVarB);
                toh.c cVar10 = new toh.c(bVarB, 0);
                x8h.m mVarG9 = wVar8.d.g();
                z0h.d dVarC5 = ((u8h.b) wVar7.f177071h).c();
                vc.s.j(dVarC5);
                return new oph.m(screenerCollectionsPageContract$InputData, oVar3, cVarD, cVar10, mVarG9, new qr0.i(dVarC5));
            case 21:
                joh.n nVar3 = (joh.n) this.d;
                joh.w wVar9 = (joh.w) this.f176472b;
                int i104 = this.f176473c;
                if (i104 == 0) {
                    return new yph.f(nVar3.f177032a, (yph.h) nVar3.d.get());
                }
                if (i104 == 1) {
                    return new aqh.v(nVar3.f177033b, new aqh.n(nVar3.f177034c.h(), new zph.s(new nd.o(new nd.n(new zph.m()), new zph.m()), new zph.u()), new zph.r(new zph.q()), new zph.p(new zph.j(new zph.a(), new zph.h(), new zph.e(), new zph.g()), new zph.t()), new vph.h()), wVar9.e(), new vph.o(), wVar9.f(), wVar9.d.g());
                }
                throw new AssertionError(i104);
            case 22:
                return b();
            case 23:
                return c();
            case 24:
                return d();
            case 25:
                jok.e eVar6 = (jok.e) this.d;
                int i105 = this.f176473c;
                if (i105 == 0) {
                    return new tok.h((cli.n) eVar6.f177160b.get(), eVar6.f177159a, ((s41.a) ((jok.c) this.f176472b).e).d());
                }
                if (i105 == 1) {
                    return new tok.j();
                }
                throw new AssertionError(i105);
            case 26:
                return e();
            case 27:
                return f();
            case 28:
                return g();
            default:
                jqa.e eVar7 = (jqa.e) this.f176472b;
                int i106 = this.f176473c;
                if (i106 != 0) {
                    if (i106 != 1) {
                        if (i106 == 2) {
                            return new com.revolut.feature.push_to_card.impl.ui.flow.b(((jqa.g) this.d).f177574a);
                        }
                        throw new AssertionError(i106);
                    }
                    pak.h priceQuoteTraceIdControllerExtensionFactory = eVar7.d.a();
                    nsa.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(priceQuoteTraceIdControllerExtensionFactory, "priceQuoteTraceIdControllerExtensionFactory");
                    return priceQuoteTraceIdControllerExtensionFactory.a("payments_push_to_card_price_quote");
                }
                wj0.a idempotencyKeyHolder = ((nj0.d) eVar7.f177541b).i();
                vc.s.j(idempotencyKeyHolder);
                l80.e dateProvider = eVar7.f177542c.h();
                vc.s.j(dateProvider);
                nsa.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new m60.b(idempotencyKeyHolder, dateProvider, "payments_push_to_card_transfer");
        }
    }
}
