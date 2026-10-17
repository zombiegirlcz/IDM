package j1a;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import com.revolut.feature.credit.card.impl.ui.description.flow.CreditCardBeDrivenDescriptionFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreenContract$InputData;
import gp8.t;
import jdi.p;
import jm4.a3;
import jm4.b1;
import jm4.d1;
import jm4.g0;
import jm4.i0;
import jm4.k0;
import jm4.l1;
import jm4.n0;
import jm4.t0;
import k2e.w;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import te8.z;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f170325b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f170324a = i;
        this.f170325b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f170324a) {
            case 0:
                l lVar = (l) this.f170325b;
                return new n1a.f(lVar.f170326a, new n1a.h(lVar.f170327b.o.b()));
            case 1:
                j5d.c cVar = (j5d.c) this.f170325b;
                return new bo9.d(cVar.f171624a, cVar.f171625b, cVar.f171626c, cVar.d, cVar.e, cVar.f, 4);
            case 2:
                j99.b bVar = (j99.b) this.f170325b;
                return new c3d.a(bVar.f172314a, bVar.f172315b, bVar.f172316c);
            case 3:
                return new a7d.a(((jd5.a) this.f170325b).f172977a, 24);
            case 4:
                jd5.b bVar2 = (jd5.b) this.f170325b;
                return new c3d.a(bVar2.f172979a, bVar2.f172980b, bVar2.f172981c, 12);
            case 5:
                jd8.e eVar = (jd8.e) this.f170325b;
                kd8.e eVarA = eVar.f173025b.a();
                s.j(eVarA);
                z zVarE = eVar.f173026c.e();
                s.j(zVarE);
                gte.a aVarB = eVar.d.b();
                s.j(aVarB);
                return new qd8.f(eVarA, zVarE, aVarB);
            case 6:
                return new com.revolut.feature.onboarding.impl.verifyaccount.flow.a(((jd9.b) this.f170325b).f173038a);
            case 7:
                return new com.revolut.feature_rev_points_pocket_impl.ui.add_money.a(((jdi.b) this.f170325b).f173077a);
            case 8:
                return new com.revolut.feature_rev_points_pocket_impl.ui.flow.a(((jdi.f) this.f170325b).f173093a);
            case 9:
                jdi.g gVar = (jdi.g) this.f170325b;
                bei.a itemsMapper = new bei.a();
                Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
                return new aei.b(new aei.c(), gVar.f173096a);
            case 10:
                eub.a aVarA = ((p) this.f170325b).f173137a.a();
                s.j(aVarA);
                return new ldi.g(aVarA, 0);
            case 11:
                jef.e eVar2 = (jef.e) this.f170325b;
                ee0.a aVar = eVar2.f173372a;
                je0.d mapper = aVar.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = eVar2.f173373b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                jef.k.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "feature_transaction_recogniser", mapper, 0, null, 56);
            case 12:
                jfa.c cVar2 = (jfa.c) this.f170325b;
                return new w(cVar2.f173752b, cVar2.f173753c, cVar2.d, cVar2.e, cVar2.f, cVar2.f173754g, cVar2.f173755h, cVar2.i, cVar2.f173756j, cVar2.k, cVar2.f173757l, cVar2.f173758m, cVar2.f173759n, cVar2.o, cVar2.f173760p, cVar2.f173761q, cVar2.f173762r, cVar2.f173763s, cVar2.f173751a);
            case 13:
                jg5.h hVar = (jg5.h) this.f170325b;
                return new bo9.d(hVar.f173927a, hVar.f173928b, hVar.f173929c, hVar.d, hVar.e, hVar.f, 6);
            case 14:
                jh7.a aVar2 = (jh7.a) this.f170325b;
                return new emi.g(aVar2.f174152a, aVar2.f174153b, aVar2.f174154c, aVar2.d, aVar2.e, 5);
            case 15:
                jj5.d dVar = (jj5.d) this.f170325b;
                return new ee6.f(dVar.f174642a, dVar.f174643b, dVar.f174644c, dVar.d, dVar.e, dVar.f, dVar.f174645g, dVar.f174646h, dVar.i, 4);
            case 16:
                jjf.a aVar3 = (jjf.a) this.f170325b;
                nhf.a aVarA2 = aVar3.f174936a.a();
                s.j(aVarA2);
                mhf.j jVarE = ((bjf.a) aVar3.f174937b).e();
                s.j(jVarE);
                djf.c cVar3 = aVar3.f174938c;
                thf.m mVarG = cVar3.g();
                s.j(mVarG);
                thf.c cVarC = cVar3.c();
                s.j(cVarC);
                qd0.b bVarN = aVar3.d.n();
                s.j(bVarN);
                return new pjf.f(aVarA2, jVarE, mVarG, cVarC, bVarN, aVar3.e.a());
            case 17:
                jjf.b bVar3 = (jjf.b) this.f170325b;
                return new ajf.d(bVar3.f174939a, bVar3.f174940b, bVar3.f174941c, bVar3.d, bVar3.e, 11);
            case 18:
                jk8.a aVar4 = (jk8.a) this.f170325b;
                return new ok8.m(aVar4.a(), (kk8.e) aVar4.k.get());
            case 19:
                jm0.b bVar4 = (jm0.b) this.f170325b;
                return new t(bVar4.f175908a, bVar4.f175909b, bVar4.f175910c, bVar4.d, bVar4.e, bVar4.f, bVar4.f175911g, bVar4.f175912h, bVar4.i);
            case 20:
                return new com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.a(((jm4.w) this.f170325b).f176409a);
            case 21:
                return new com.revolut.feature.credit.card.impl.ui.additional_cards.flow.a(((jm4.z) this.f170325b).f176459a);
            case 22:
                CreditCardAccruedInterestsScreenContract$InputData creditCardAccruedInterestsScreenContract$InputData = ((g0) this.f170325b).f176081a;
                gv4.a localizationProvider = new gv4.a();
                Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
                return new com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.a(creditCardAccruedInterestsScreenContract$InputData, new gv4.k());
            case 23:
                return new com.revolut.feature.credit.autopay.ui.screen.amount.flow.a(((i0) this.f170325b).f176113a);
            case 24:
                k0 k0Var = (k0) this.f170325b;
                CreditCardBeDrivenDescriptionFlowContract$InputData creditCardBeDrivenDescriptionFlowContract$InputData = k0Var.f176162a;
                a3 a3Var = k0Var.f176163b;
                dp4.w wVar = (dp4.w) a3Var.f175974k0.get();
                gte.a aVarB2 = a3Var.f175982r.b();
                s.j(aVarB2);
                return new com.revolut.feature.credit.card.impl.ui.description.flow.b(creditCardBeDrivenDescriptionFlowContract$InputData, new lal.a(wVar, aVarB2, a3Var.B.e(), a3Var.f175965b.a()));
            case 25:
                n0 n0Var = (n0) this.f170325b;
                return new jt4.i(n0Var.f176210a, new d0(new zjh.c((CreditCardService) n0Var.f176211b.p0.get())), new jt4.j(new he2.b(new lt4.b(), new lt4.e()), new lt4.e()));
            case 26:
                return new com.revolut.feature.credit.card.impl.ui.details.flow.a(((t0) this.f170325b).f176360a);
            case 27:
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.a(((b1) this.f170325b).f175997a);
            case 28:
                return new com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.a(((d1) this.f170325b).f176033a);
            default:
                return new pq4.h(((l1) this.f170325b).f176182a, new pq4.i());
        }
    }
}
