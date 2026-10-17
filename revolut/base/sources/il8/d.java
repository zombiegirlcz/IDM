package il8;

import b9.w2;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.autopay.settings.AutopaySettingsContract$InputData;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreenContract$InputData;
import com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.JuniorAddPhoneNumberScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreenContract$InputData;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.msi.StoreBrandDetailMsiScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreenContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.TransactionRecogniserDetailsScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersControllerContract$InputData;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreenContract$InputData;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreenContract$InputData;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreenContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.PodNomineesPercentageScreenContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreenContract$InputData;
import dw3.l9;
import ine.t;
import ip0.v7;
import jm4.a3;
import jm4.a4;
import jm4.j0;
import jm4.l2;
import koe.c0;
import koe.d0;
import kotlin.jvm.internal.Intrinsics;
import ks9.b0;
import ks9.f0;
import ks9.n0;
import ks9.r0;
import ks9.s0;
import ks9.v;
import opf.z;
import p0l.w;
import p5k.y;
import retrofit2.Retrofit;
import rp0.g1;
import rp0.l0;
import rp0.p0;
import rp0.x0;
import sek.r;
import sek.u;
import sgm.e3;
import sxd.e0;
import v2e.m0;
import vc.s;
import vzk.x;
import wp4.i0;
import z0h.q1;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f162145c;
    public final qji.b d;
    public final Object e;

    public /* synthetic */ d(Object obj2, qji.b bVar, Object obj3, int i, int i2) {
        this.f162143a = i2;
        this.f162145c = obj2;
        this.d = bVar;
        this.e = obj3;
        this.f162144b = i;
    }

    private final Object a() {
        kek.a aVar = (kek.a) this.e;
        int i = this.f162144b;
        if (i == 0) {
            return new iek.n((cli.n) aVar.f183107b.get(), aVar.f183106a, (lek.b) ((kek.c) this.f162145c).f183126w.get(), ((kek.d) this.d).b());
        }
        if (i == 1) {
            return new com.revolut.retail.feature.pod_nominees.impl.details.b();
        }
        throw new AssertionError(i);
    }

    private final Object b() {
        kek.c cVar = (kek.c) this.f162145c;
        kek.b bVar = (kek.b) this.e;
        PodNomineeEditScreenContract$InputData podNomineeEditScreenContract$InputData = bVar.f183109a;
        int i = this.f162144b;
        if (i == 0) {
            return new com.revolut.retail.feature.pod_nominees.impl.edit.d(podNomineeEditScreenContract$InputData, (lek.b) cVar.f183126w.get(), ((kek.d) this.d).b());
        }
        if (i != 1) {
            if (i == 2) {
                return new i3g.k(new oek.a(podNomineeEditScreenContract$InputData));
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) bVar.f183111c.get();
        PodNomineeEditScreenContract$InputData podNomineeEditScreenContract$InputData2 = bVar.f183109a;
        i90.b bVar2 = new i90.b();
        lek.b bVar3 = (lek.b) cVar.f183126w.get();
        l80.e eVarH = cVar.k.h();
        s.j(eVarH);
        return new com.revolut.retail.feature.pod_nominees.impl.edit.c(nVar, podNomineeEditScreenContract$InputData2, bVar2, bVar3, eVarH, (mek.o) bVar.f183110b.get(), cVar.f183118l);
    }

    private final Object c() {
        kek.e eVar = (kek.e) this.e;
        PodNomineesListScreenContract$InputData podNomineesListScreenContract$InputData = eVar.f183130a;
        int i = this.f162144b;
        if (i == 0) {
            return new r(podNomineesListScreenContract$InputData, (lek.b) ((kek.c) this.f162145c).f183126w.get(), ((kek.d) this.d).b(), (cli.n) eVar.f183131b.get());
        }
        if (i == 1) {
            return new u(podNomineesListScreenContract$InputData);
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        kek.c cVar = (kek.c) this.f162145c;
        kek.f fVar = (kek.f) this.e;
        int i = this.f162144b;
        if (i != 0) {
            if (i == 1) {
                return new uek.n();
            }
            throw new AssertionError(i);
        }
        PodNomineesPercentageScreenContract$InputData podNomineesPercentageScreenContract$InputData = fVar.f183133a;
        lek.b bVar = (lek.b) cVar.f183126w.get();
        hp9.c cVarA = cVar.i.a();
        s.j(cVarA);
        return new uek.m(podNomineesPercentageScreenContract$InputData, bVar, new wek.b(cVarA), new wek.a(), ((kek.d) this.d).b(), (cli.n) fVar.f183134b.get());
    }

    private final Object e() {
        kr9.l lVar = (kr9.l) this.f162145c;
        kr9.b bVar = (kr9.b) this.e;
        int i = this.f162144b;
        switch (i) {
            case 0:
                Object impl = (j60.a) bVar.f188683h.get();
                i7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                yji.d dVar = (yji.d) impl;
                s.k(dVar);
                return dVar;
            case 1:
                return hy1.g.B((com.revolut.kompot.navigable.a) bVar.f188682g.get(), kxa.j.o(new nji.b()));
            case 2:
                return kxa.j.k((j60.a) bVar.k.get());
            case 3:
                return ehe.n.s((com.revolut.kompot.navigable.a) bVar.f188682g.get(), (rp0.m) bVar.f188684j.get());
            case 4:
                return new rp0.m();
            case 5:
                n60.b bVar2 = (n60.b) bVar.f188686m.get();
                o5k.i.m(bVar2);
                return bVar2;
            case 6:
                return o5k.i.r((com.revolut.kompot.navigable.a) bVar.f188682g.get());
            case 7:
                j9i.d extension = (j9i.d) bVar.o.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 8:
                o9i.a aVar = bVar.f188679a;
                kr9.l lVar2 = bVar.f;
                o9i.c cVar = bVar.f188681c;
                o9i.b bVar3 = bVar.f188680b;
                Retrofit retrofit = ((nj0.d) lVar2.i).f();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                q9i.d dVarE = o5k.i.e(aVar, o5k.i.c(bVar3, o5k.i.y(cVar, retrofit), new l9i.a(), new p9i.a()));
                Retrofit retrofit3 = ((nj0.d) lVar2.i).f();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                return jr9.h.w(new r9i.e(new q9i.b(dVarE, o5k.i.f(aVar, o5k.i.d(bVar3, o5k.i.y(cVar, retrofit3), new l9i.a(), new p9i.a()))), new r9i.a()), bVar.d, ds9.e.a());
            case 9:
                Object extension2 = (ks9.e) bVar.f188692t.get();
                ds9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar = (yji.n) extension2;
                s.k(nVar);
                return nVar;
            case 10:
                j60.a aVar2 = (j60.a) bVar.k.get();
                cu9.n nVar2 = (cu9.n) lVar.k.v.get();
                s.j(nVar2);
                r10.f fVarJ = bVar.j();
                c70.a aVarZ = lVar.f188760h.z();
                s.j(aVarZ);
                l0 l0Var = (l0) bVar.f188689q.get();
                wu9.c cVar2 = (wu9.c) lVar.k.E.get();
                s.j(cVar2);
                ang.f fVarE = lVar.f188763m.e();
                lv9.d dVarD = lVar.f188762l.d();
                s.j(dVarD);
                k61.a aVarE = lVar.f188764n.e();
                s.j(aVarE);
                return new ks9.s(aVar2, nVar2, fVarJ, aVarZ, l0Var, cVar2, fVarE, dVarD, aVarE, (h7k.a) bVar.f188691s.get());
            case 11:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) bVar.f188682g.get();
                ds9.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new l0(controller.m2());
            case 12:
                j60.a aVar3 = (j60.a) bVar.f188683h.get();
                k61.a aVarE2 = lVar.f188764n.e();
                s.j(aVarE2);
                return new h7k.i(aVar3, aVarE2, new j7k.a(), lVar.e.e(), (f01.a) bVar.f188690r.get());
            case 13:
                return hy1.g.u((com.revolut.kompot.navigable.a) bVar.f188682g.get());
            case 14:
                Object extension3 = (ks9.f) bVar.v.get();
                ds9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar3 = (yji.n) extension3;
                s.k(nVar3);
                return nVar3;
            case 15:
                b9k.f fVarB = bVar.b();
                k61.a aVarE3 = lVar.f188764n.e();
                s.j(aVarE3);
                return new v(fVarB, aVarE3);
            case 16:
                Object extension4 = (h7k.a) bVar.f188691s.get();
                i7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                yji.n nVar4 = (yji.n) extension4;
                s.k(nVar4);
                return nVar4;
            case 17:
                qu9.b extension5 = (qu9.b) bVar.f188695y.get();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                s.k(extension5);
                return extension5;
            case 18:
                qu9.a factory = (qu9.a) lVar.k.f219246w.get();
                s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new qu9.b(factory.f249275a, factory.f249276b, factory.f249277c);
            case 19:
                r0 extension6 = (r0) bVar.A.get();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                s.k(extension6);
                return extension6;
            case 20:
                mq9.f fVarC = lVar.f188757b.c();
                s.j(fVarC);
                return new r0(fVarC, new vr9.s(), (j60.a) bVar.k.get());
            case 21:
                ks9.a extension7 = (ks9.a) bVar.C.get();
                Intrinsics.checkNotNullParameter(extension7, "extension");
                s.k(extension7);
                return extension7;
            case 22:
                j60.a aVar4 = (j60.a) bVar.k.get();
                du9.b bVarA = lVar.k.a();
                s.j(bVarA);
                return new ks9.a(aVar4, bVarA);
            case 23:
                Object extension8 = (ks9.i) bVar.G.get();
                Intrinsics.checkNotNullParameter(extension8, "extension");
                yji.n nVar5 = (yji.n) extension8;
                s.k(nVar5);
                return nVar5;
            case 24:
                rr9.d dVarB = lVar.f188757b.b();
                s.j(dVarB);
                utf.a aVarA = lVar.o.a();
                s.j(aVarA);
                jt0.b bVarQ = bVar.q();
                kr9.l lVar3 = bVar.f;
                nq9.c cVarC = lVar3.f188765p.c();
                s.j(cVarC);
                yof.k kVarG = lVar3.f188766q.g();
                s.j(kVarG);
                vr9.r rVar = new vr9.r(cVarC, kVarG);
                vr9.d dVar2 = new vr9.d();
                ks9.c cVar3 = (ks9.c) bVar.F.get();
                ks9.g gVar = (ks9.g) bVar.E.get();
                j60.a aVar5 = (j60.a) bVar.k.get();
                gte.a aVarB = lVar.f188768s.b();
                s.j(aVarB);
                nq9.c cVarC2 = lVar3.f188765p.c();
                s.j(cVarC2);
                return new n0(dVarB, aVarA, bVarQ, rVar, dVar2, cVar3, gVar, aVar5, aVarB, new wr9.e(cVarC2));
            case 25:
                return new ks9.b(lVar.f188767r.f(), new vr9.b(), (ks9.g) bVar.E.get(), (j60.a) bVar.k.get());
            case 26:
                rr9.d dVarB2 = lVar.f188757b.b();
                s.j(dVarB2);
                zof.f fVarD = lVar.f188766q.d();
                s.j(fVarD);
                return new b0(dVarB2, fVarD);
            case 27:
                Object extension9 = (ks9.g) bVar.E.get();
                Intrinsics.checkNotNullParameter(extension9, "extension");
                yji.n nVar6 = (yji.n) extension9;
                s.k(nVar6);
                return nVar6;
            case 28:
                Object extension10 = (ks9.c) bVar.F.get();
                Intrinsics.checkNotNullParameter(extension10, "extension");
                yji.n nVar7 = (yji.n) extension10;
                s.k(nVar7);
                return nVar7;
            case 29:
                s0 extension11 = (s0) bVar.K.get();
                Intrinsics.checkNotNullParameter(extension11, "extension");
                s.k(extension11);
                return extension11;
            case 30:
                j60.a aVar6 = (j60.a) bVar.k.get();
                iu9.a aVar7 = (iu9.a) lVar.k.f219248y.get();
                s.j(aVar7);
                return new s0(aVar6, aVar7);
            case 31:
                Object extension12 = (ks9.h) bVar.M.get();
                Intrinsics.checkNotNullParameter(extension12, "extension");
                yji.n nVar8 = (yji.n) extension12;
                s.k(nVar8);
                return nVar8;
            case 32:
                mq9.f fVarC2 = lVar.f188757b.c();
                s.j(fVarC2);
                jt0.b bVarQ2 = bVar.q();
                mr9.d dVarD2 = lVar.f188757b.d();
                s.j(dVarD2);
                nq9.c cVarC3 = bVar.f.f188765p.c();
                s.j(cVarC3);
                wr9.e eVar = new wr9.e(cVarC3);
                j60.a aVar8 = (j60.a) bVar.k.get();
                sf0.h hVarB = lVar.f188769t.b();
                s.j(hVarB);
                return new f0(fVarC2, bVarQ2, dVarD2, eVar, aVar8, hVarB);
            case 33:
                b9k.f fVarB2 = bVar.b();
                kr9.l lVar4 = bVar.f;
                jr9.b bVar4 = lVar.f188757b;
                nu9.a aVar9 = lVar.k;
                mq9.f fVarC3 = bVar4.c();
                s.j(fVarC3);
                ks9.c cVar4 = (ks9.c) bVar.F.get();
                ks9.i iVar = (ks9.i) bVar.G.get();
                r0 r0Var = (r0) bVar.A.get();
                s0 s0Var = (s0) bVar.K.get();
                ks9.e eVar2 = (ks9.e) bVar.f188692t.get();
                ks9.g gVar2 = (ks9.g) bVar.E.get();
                r10.f fVarJ2 = bVar.j();
                pu9.b bVar5 = (pu9.b) aVar9.B.get();
                s.j(bVar5);
                iu9.b bVar6 = (iu9.b) aVar9.u.get();
                s.j(bVar6);
                ks9.a aVar10 = (ks9.a) bVar.C.get();
                tx9.f fVarC4 = lVar.u.c();
                s.j(fVarC4);
                n60.b bVar7 = (n60.b) bVar.f188686m.get();
                j9i.d dVar3 = (j9i.d) bVar.o.get();
                wu9.h hVar = (wu9.h) aVar9.o.get();
                s.j(hVar);
                jt0.b bVarQ3 = bVar.q();
                gte.a aVarB2 = lVar.f188768s.b();
                s.j(aVarB2);
                ln3.b bVar8 = new ln3.b();
                os9.c cVarC4 = bVar.c();
                c70.a aVarZ2 = lVar4.f188760h.z();
                s.j(aVarZ2);
                pqi.a aVar11 = lVar4.e;
                nd.o oVarA = aVar11.a();
                mq9.f fVarC5 = lVar4.f188757b.c();
                s.j(fVarC5);
                wj0.a aVarI = ((nj0.d) lVar4.i).i();
                s.j(aVarI);
                is9.a aVar12 = new is9.a(bVar8, new hd.r(cVarC4, aVarZ2, oVarA, fVarC5, aVarI, aVar11.g()), new is9.b());
                os9.c cVarC5 = bVar.c();
                ks9.f fVar = (ks9.f) bVar.v.get();
                pu9.c cVar5 = new pu9.c();
                lz0.g gVar3 = (lz0.g) bVar.O.get();
                cu9.o oVar = (cu9.o) aVar9.F.get();
                s.j(oVar);
                GroupChatScreenContract$InputData groupChatScreenContract$InputData = bVar.e;
                zjh.f fVar2 = new zjh.f(((n2a.a) ((kr9.a) this.d).f188677b.f188761j).b());
                cw9.d dVarA = lVar.v.a();
                qu9.b bVar9 = (qu9.b) bVar.f188695y.get();
                gte.a aVarB3 = lVar4.f188768s.b();
                s.j(aVarB3);
                return new com.revolut.feature.payments.groups.impl.ui_chat.chat.a(fVarB2, fVarC3, cVar4, iVar, r0Var, s0Var, eVar2, gVar2, fVarJ2, bVar5, bVar6, aVar10, fVarC4, bVar7, dVar3, hVar, bVarQ3, aVarB2, aVar12, cVarC5, fVar, cVar5, gVar3, oVar, groupChatScreenContract$InputData, fVar2, dVarA, bVar9, new d8k.f(aVarB3, 1), (cli.n) bVar.P.get());
            case 34:
                z70.a contextProvider = lVar.f188760h.f();
                s.j(contextProvider);
                ds9.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                lz0.g gVarC0 = jh.d.f(contextProvider.getContext()).c0();
                s.k(gVarC0);
                return gVarC0;
            case 35:
                nu9.a aVar13 = bVar.f.k;
                ru9.l0 l0Var2 = (ru9.l0) aVar13.f219244s.get();
                s.j(l0Var2);
                ru9.o oVar2 = (ru9.o) aVar13.f219245t.get();
                s.j(oVar2);
                du9.b bVarA2 = aVar13.a();
                s.j(bVarA2);
                fs9.d dVar4 = new fs9.d(l0Var2, oVar2, bVarA2);
                js9.c cVar6 = new js9.c();
                fs9.g gVar4 = new fs9.g();
                du9.b bVarA3 = lVar.k.a();
                s.j(bVarA3);
                gte.a aVarB4 = bVar.f.f188768s.b();
                s.j(aVarB4);
                return new bs9.l0(dVar4, cVar6, gVar4, bVarA3, new bs9.a(aVarB4), new fs9.e(), new gs9.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        kyk.v vVar = (kyk.v) this.f162145c;
        kyk.a aVar = (kyk.a) this.e;
        int i = this.f162144b;
        if (i == 0) {
            return s2l.c.k((r60.b) aVar.f190912c.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) aVar.f190910a.get(), (p0) aVar.f190911b.get());
        }
        if (i == 2) {
            return new p0();
        }
        if (i != 3) {
            if (i == 4) {
                return new s0l.u();
            }
            throw new AssertionError(i);
        }
        r0l.a aVar2 = (r0l.a) ((kyk.o) this.d).d.get();
        r60.b bVar = (r60.b) aVar.f190912c.get();
        mn3.a aVar3 = (mn3.a) ((in3.e) vVar.f190996s).f162625j.get();
        s.j(aVar3);
        return new s0l.s(aVar2, bVar, aVar3, (lyk.a) vVar.M.get(), (jki.p) aVar.e.get());
    }

    private final Object g() {
        kyk.v vVar = (kyk.v) this.f162145c;
        kyk.j jVar = (kyk.j) this.e;
        NationalitiesScreenContract$InputData nationalitiesScreenContract$InputData = jVar.f190949a;
        int i = this.f162144b;
        if (i == 0) {
            return kxa.j.l((j60.a) jVar.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) jVar.f190950b.get(), (rp0.m) jVar.f190951c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new vzk.u(new kye.e((hyk.l) vVar.F.get()), vVar.k.f(), (tzk.a) ((kyk.f) this.d).f.get(), (j60.a) jVar.d.get(), nationalitiesScreenContract$InputData, (jki.p) jVar.f.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        n8b.a aVarA = vVar.u.a();
        s.j(aVarA);
        return new x(aVarA, nationalitiesScreenContract$InputData);
    }

    private final Object h() {
        kyk.v vVar = (kyk.v) this.f162145c;
        kyk.r rVar = (kyk.r) this.e;
        int i = this.f162144b;
        switch (i) {
            case 0:
                return s2l.c.k((r60.b) rVar.f190973c.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) rVar.f190971a.get(), (p0) rVar.f190972b.get());
            case 2:
                return new p0();
            case 3:
                return kxa.j.l((j60.a) rVar.f.get());
            case 4:
                return h30.l.p((com.revolut.kompot.navigable.a) rVar.f190971a.get(), (rp0.m) rVar.e.get());
            case 5:
                return new rp0.m();
            case 6:
                return new p0l.v((r60.b) rVar.f190973c.get(), (j60.a) rVar.f.get(), (lyk.a) vVar.M.get(), vVar.f190997t.e(), (o0l.a) ((kyk.q) this.d).d.get(), (jki.p) rVar.f190975h.get());
            case 7:
                return new w();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        l0k.c cVar = (l0k.c) this.f162145c;
        l0k.f fVar = (l0k.f) this.e;
        l0k.h hVar = fVar.e;
        WealthDailyNewsScreenContract$InputData inputData = fVar.f191284c;
        l0k.c cVar2 = fVar.d;
        o0h.b bVar = fVar.f191282a;
        int i = this.f162144b;
        if (i == 0) {
            return nga.c.y(bVar, cVar.k.a(), nga.c.C(bVar, cVar2.k.a(), hVar.b(), nga.c.A(bVar, cVar2.k.a()), nga.c.D(hVar.f191294b, hVar.f191295c.k.a(), (ln.a) hVar.f.get())), new en.c(ImmutableSet.of((ln.d) hVar.f.get()), (sri.m) cVar2.J.get()), fVar.f191283b);
        }
        if (i == 1) {
            return new j1k.f(inputData, (m0k.c) fVar.f191285g.get(), ((l0k.h) this.d).b(), (jki.p) fVar.f191286h.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new j1k.g(nga.c.A(bVar, cVar2.k.a()), new a1k.b());
            }
            throw new AssertionError(i);
        }
        m0k.e wealthNewsInteractor = (m0k.e) cVar.H.get();
        yk0.d schedulerProvider = new yk0.d();
        k1k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new m0k.c(wealthNewsInteractor, schedulerProvider, inputData.f101871a, inputData.f101872b, inputData.f101873c);
    }

    private final Object j() {
        l0k.c cVar = (l0k.c) this.f162145c;
        h9h.a aVar = cVar.f191262g;
        l0k.g gVar = (l0k.g) this.e;
        l0k.h hVar = gVar.f;
        l0k.c cVar2 = gVar.e;
        o0h.b bVar = gVar.f191287a;
        int i = this.f162144b;
        if (i == 0) {
            return nga.c.y(bVar, cVar.k.a(), nga.c.C(bVar, cVar2.k.a(), hVar.b(), nga.c.A(bVar, cVar2.k.a()), nga.c.D(hVar.f191294b, hVar.f191295c.k.a(), (ln.a) hVar.f.get())), new en.c(ImmutableSet.of((ln.d) hVar.f.get()), (sri.m) cVar2.J.get()), gVar.f191288b);
        }
        if (i == 1) {
            return trl.f.i((t60.b) gVar.f191291h.get());
        }
        if (i == 2) {
            return trl.f.r(gVar.f191289c);
        }
        if (i == 3) {
            return new l1k.n(gVar.d, (m0k.e) cVar.H.get(), aVar.D(), aVar.f(), ((l0k.h) this.d).b(), new g9h.c(), (jki.p) gVar.f191292j.get());
        }
        if (i == 4) {
            return new l1k.o(aVar.C(), nga.c.A(bVar, cVar2.k.a()));
        }
        throw new AssertionError(i);
    }

    private final Object k() {
        l0k.c cVar = (l0k.c) this.f162145c;
        u8h.c cVar2 = cVar.f191264j;
        l0k.k kVar = (l0k.k) this.e;
        l0k.i iVar = (l0k.i) kVar.k;
        int i = this.f162144b;
        if (i == 0) {
            return a10.b.f((u8h.b) cVar2, "factory");
        }
        if (i == 1) {
            return new vzh.d(new u0k.d(new e3((m0k.a) iVar.f191297b.u.get(), iVar.c()), new y0k.a(iVar.c()), new toh.d((ln.a) iVar.e.get(), new qpk.b())), kVar.f191305c);
        }
        if (i == 2) {
            WealthAssetTypeNewsScreenContract$InputData wealthAssetTypeNewsScreenContract$InputData = kVar.d;
            m0k.e eVar = (m0k.e) cVar.H.get();
            l0k.i iVar2 = (l0k.i) this.d;
            return new h1k.l(wealthAssetTypeNewsScreenContract$InputData, eVar, new e3((m0k.a) iVar2.f191297b.u.get(), iVar2.c()), (aah.h) kVar.f.get(), (jki.p) kVar.i.get());
        }
        if (i == 3) {
            return new h1k.o(new y0k.a(iVar.c()), (q1) kVar.f191307h.get());
        }
        if (i == 4) {
            return a10.b.g((u8h.b) cVar2, "factory");
        }
        throw new AssertionError(i);
    }

    private final Object l() {
        l0k.c cVar = (l0k.c) this.f162145c;
        u8h.c cVar2 = cVar.f191264j;
        l0k.k kVar = (l0k.k) this.e;
        l0k.e eVar = (l0k.e) kVar.k;
        int i = this.f162144b;
        if (i == 0) {
            return a10.b.f((u8h.b) cVar2, "factory");
        }
        if (i == 1) {
            return new vzh.d(new u0k.d(new e3((m0k.a) eVar.f191280b.u.get(), eVar.c()), new y0k.a(eVar.c()), new toh.d((ln.a) eVar.e.get(), new qpk.b())), kVar.f191305c);
        }
        if (i == 2) {
            WealthAssetTypeNewsScreenContract$InputData wealthAssetTypeNewsScreenContract$InputData = kVar.d;
            m0k.e eVar2 = (m0k.e) cVar.H.get();
            l0k.e eVar3 = (l0k.e) this.d;
            return new h1k.l(wealthAssetTypeNewsScreenContract$InputData, eVar2, new e3((m0k.a) eVar3.f191280b.u.get(), eVar3.c()), (aah.h) kVar.f.get(), (jki.p) kVar.i.get());
        }
        if (i == 3) {
            return new h1k.o(new y0k.a(eVar.c()), (q1) kVar.f191307h.get());
        }
        if (i == 4) {
            return a10.b.g((u8h.b) cVar2, "factory");
        }
        throw new AssertionError(i);
    }

    private final Object m() {
        int i = this.f162144b;
        if (i == 0) {
            l9f.u uVar = (l9f.u) this.e;
            return new com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a(uVar.f193226b, (cli.n) uVar.f193227c.get(), ((l9f.o) this.d).e);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        n8b.a aVarA = ((l9f.k) this.f162145c).f193194s.a();
        s.j(aVarA);
        return new baf.q(aVarA);
    }

    private final Object n() {
        int i = this.f162144b;
        if (i == 0) {
            l9f.u uVar = (l9f.u) this.e;
            return new com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a(uVar.f193226b, (cli.n) uVar.f193227c.get(), ((l9f.i) this.d).e);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        n8b.a aVarA = ((l9f.k) this.f162145c).f193194s.a();
        s.j(aVarA);
        return new baf.q(aVarA);
    }

    @Override // phm.a
    public final Object get() {
        Object dVar;
        Object eVar;
        Object cVar;
        switch (this.f162143a) {
            case 0:
                e eVar2 = (e) this.e;
                int i = this.f162144b;
                if (i != 0) {
                    if (i == 1) {
                        return new ul8.j();
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar = (cli.n) eVar2.f162147b.get();
                JuniorAddPhoneNumberScreenContract$InputData juniorAddPhoneNumberScreenContract$InputData = eVar2.f162146a;
                z80.b bVarS = ((k) this.f162145c).f162164a.s();
                s.j(bVarS);
                return new com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.a(nVar, juniorAddPhoneNumberScreenContract$InputData, bVarS, ((c) this.d).e);
            case 1:
                ine.n nVar2 = (ine.n) this.d;
                ine.o oVar = (ine.o) this.f162145c;
                t tVar = (t) this.e;
                int i2 = this.f162144b;
                if (i2 == 0) {
                    n8b.a aVarA = tVar.f162905b.d.a();
                    s.j(aVarA);
                    return new com.revolut.feature.tax_residency.impl.screens.list.a(new c0(aVarA, tVar.f162904a), tVar.f162904a, (tme.b) oVar.f162891s.get(), (yme.a) oVar.f162889q.get(), oVar.f.e(), new d0(), (l0) tVar.d.get(), (ihm.k) nVar2.d.get(), (ihm.k) nVar2.e.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) tVar.f162906c.get();
                loe.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new l0(controller.m2());
            case 2:
                ix5.i iVar = (ix5.i) this.e;
                int i3 = this.f162144b;
                if (i3 == 0) {
                    return new com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a(new rx5.k(new ny5.e()), ((ix5.e) this.d).f169359a, new kgm.c((tw5.i) iVar.f169376a.u.get()), (ny5.g) iVar.f169377b.get());
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                nw5.a aVarC = ((ix5.d) this.f162145c).f169345a.c();
                s.j(aVarC);
                return new ny5.g(aVarC);
            case 3:
                jef.g gVar = (jef.g) this.d;
                jef.f fVar = (jef.f) this.e;
                int i5 = this.f162144b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new wef.j();
                    }
                    throw new AssertionError(i5);
                }
                jki.p pVar = (jki.p) fVar.f173377b.get();
                TransactionRecogniserDetailsScreenContract$InputData transactionRecogniserDetailsScreenContract$InputData = fVar.f173376a;
                kef.a aVar = (kef.a) gVar.f173383h.get();
                eff.a aVar2 = (eff.a) gVar.i.get();
                hff.c cVarB = ((jef.e) this.f162145c).f173374c.b();
                s.j(cVarB);
                return new wef.l(pVar, transactionRecogniserDetailsScreenContract$InputData, aVar, aVar2, cVarB);
            case 4:
                a3 a3Var = (a3) this.f162145c;
                je6.g gVar2 = a3Var.f175977n;
                dw3.o oVar2 = (dw3.o) this.e;
                int i6 = this.f162144b;
                if (i6 == 0) {
                    return kxa.j.l((j60.a) oVar2.e.get());
                }
                if (i6 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) oVar2.f119377c.get(), (rp0.m) oVar2.d.get());
                }
                if (i6 == 2) {
                    return new rp0.m();
                }
                if (i6 != 3) {
                    if (i6 == 4) {
                        return new ty4.q((vy4.b) oVar2.f119378g.get());
                    }
                    if (i6 == 5) {
                        return new vy4.d(new vy4.a());
                    }
                    throw new AssertionError(i6);
                }
                wli.x xVarD = ((s41.a) a3Var.f175975l).d();
                DirectDebitAccountSelectionScreenContract$InputData directDebitAccountSelectionScreenContract$InputData = oVar2.f119376b;
                f01.c cVarG = a3Var.f175976m.g();
                cz4.b bVar = (cz4.b) ((a4) this.d).e.get();
                xy4.b bVar2 = new xy4.b();
                je6.h hVarC = ((xf6.t) gVar2).c();
                s.j(hVarC);
                t70.b bVarG = a3Var.k.g();
                s.j(bVarG);
                wsg.n nVarB = a3Var.o.b();
                z71.a aVarF = ((c21.b) a3Var.f175980p).f();
                s.j(aVarF);
                a3 a3Var2 = (a3) oVar2.f119380j;
                wsg.n nVarB2 = a3Var2.o.b();
                oe6.a aVarA2 = a3Var2.f175981q.a();
                s.j(aVarA2);
                je6.h hVarC2 = ((xf6.t) a3Var2.f175977n).c();
                s.j(hVarC2);
                cz4.a aVar3 = new cz4.a(nVarB2, aVarA2, hVarC2);
                j60.a aVar4 = (j60.a) oVar2.e.get();
                com.revolut.feature.external_accounts.api.navigation.a aVarB = ((xf6.t) gVar2).b();
                s.j(aVarB);
                gte.a aVarB2 = a3Var.f175982r.b();
                s.j(aVarB2);
                return new ty4.o(xVarD, directDebitAccountSelectionScreenContract$InputData, cVarG, bVar, bVar2, hVarC, bVarG, nVarB, aVarF, aVar3, aVar4, aVarB, aVarB2, (jki.p) oVar2.f119379h.get());
            case 5:
                jm4.c0 c0Var = (jm4.c0) this.e;
                a3 a3Var3 = c0Var.f176012b;
                a3 a3Var4 = (a3) this.f162145c;
                int i21 = this.f162144b;
                if (i21 == 0) {
                    return kxa.j.l((j60.a) c0Var.e.get());
                }
                if (i21 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) c0Var.f176013c.get(), (rp0.m) c0Var.d.get());
                }
                if (i21 == 2) {
                    return new rp0.m();
                }
                if (i21 != 3) {
                    if (i21 != 4) {
                        throw new AssertionError(i21);
                    }
                    n3i.b bVarA = a3Var4.v.a();
                    vj4.b bVarA2 = a3Var4.u.a();
                    s.j(bVarA2);
                    f90.b bVarT = a3Var4.k.t();
                    s.j(bVarT);
                    return new wp4.n0(bVarA, bVarA2, bVarT);
                }
                AutopaySettingsContract$InputData autopaySettingsContract$InputData = c0Var.f176011a;
                j60.a aVar5 = (j60.a) c0Var.e.get();
                lb5.b bVarA3 = a3Var4.d.a();
                s.j(bVarA3);
                wj4.b bVar3 = new wj4.b();
                y51.a aVarA3 = a3Var4.f175988w.a();
                s.j(aVarA3);
                ang.f fVarE = a3Var4.f.e();
                vt4.b bVar4 = new vt4.b();
                d3j.b bVarE = ((b3j.p) a3Var4.f175989x).e();
                m3j.j jVarD = b3j.p.d();
                vp4.a aVar6 = new vp4.a();
                sf0.h hVarB = a3Var4.f175984s.b();
                s.j(hVarB);
                ck4.b bVar5 = (ck4.b) ((j0) this.d).i.get();
                bp4.a aVar7 = new bp4.a();
                lb5.b bVarA4 = a3Var3.d.a();
                s.j(bVarA4);
                wp4.a aVar8 = new wp4.a(bVarA4);
                dp4.w wVar = (dp4.w) a3Var3.f175974k0.get();
                gte.a aVarB3 = a3Var3.f175982r.b();
                s.j(aVarB3);
                return new i0(autopaySettingsContract$InputData, aVar5, bVarA3, bVar3, aVarA3, fVarE, bVar4, bVarE, jVarD, aVar6, hVarB, bVar5, aVar7, aVar8, new lal.a(wVar, aVarB3, a3Var3.B.e(), a3Var3.f175965b.a()), (jki.p) c0Var.f176014g.get());
            case 6:
                l9 l9Var = (l9) this.e;
                a3 a3Var5 = (a3) this.f162145c;
                int i22 = this.f162144b;
                if (i22 == 0) {
                    return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b(l9Var.f119225b, (ck4.a) ((j0) this.d).f176148j.get(), new wj4.b(), new pk4.a(), (cli.n) l9Var.f119226c.get());
                }
                if (i22 != 1) {
                    throw new AssertionError(i22);
                }
                vj4.b bVarA5 = a3Var5.u.a();
                s.j(bVarA5);
                f90.b bVarT2 = a3Var5.k.t();
                s.j(bVarT2);
                return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.c(bVarA5, bVarT2);
            case 7:
                l9 l9Var2 = (l9) this.e;
                a3 a3Var6 = (a3) this.f162145c;
                int i32 = this.f162144b;
                if (i32 == 0) {
                    return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b(l9Var2.f119225b, (ck4.a) ((l2) this.d).f.get(), new wj4.b(), new pk4.a(), (cli.n) l9Var2.f119226c.get());
                }
                if (i32 != 1) {
                    throw new AssertionError(i32);
                }
                vj4.b bVarA6 = a3Var6.u.a();
                s.j(bVarA6);
                f90.b bVarT3 = a3Var6.k.t();
                s.j(bVarT3);
                return new com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.c(bVarA6, bVarT3);
            case 8:
                joh.w wVar2 = (joh.w) this.f162145c;
                u8h.c cVar2 = wVar2.f177071h;
                joh.m mVar = (joh.m) this.e;
                joh.w wVar3 = mVar.d;
                int i33 = this.f162144b;
                if (i33 == 0) {
                    return a10.b.f((u8h.b) cVar2, "factory");
                }
                if (i33 == 1) {
                    return new yph.f(mVar.f177028b, (yph.h) mVar.f177030g.get());
                }
                if (i33 != 2) {
                    if (i33 == 3) {
                        return a10.b.g((u8h.b) cVar2, "factory");
                    }
                    throw new AssertionError(i33);
                }
                ScreenerEmbeddedFiltersControllerContract$InputData screenerEmbeddedFiltersControllerContract$InputData = mVar.f177029c;
                sph.l lVar = new sph.l(new sph.e(new zph.s(new nd.o(new nd.n(new zph.m()), new zph.m()), new zph.u())), new sph.a(new zph.r(new zph.q())), new sph.d(new sph.b(), new sph.c(), new zph.t()), new nd.n(new sph.j()));
                com.revolut.feature.wealth_discovery.impl.screener.domain.model.b groupNameMapper = new com.revolut.feature.wealth_discovery.impl.screener.domain.model.b();
                Intrinsics.checkNotNullParameter(groupNameMapper, "groupNameMapper");
                qph.v vVar = new qph.v(lVar, new wqh.b(), mVar.f177029c, (q1) mVar.f.get());
                qph.w wVar4 = new qph.w(wVar3.f177068b.g(), wVar3.h());
                jul.o oVar3 = new jul.o(mVar.b(), wVar3.e());
                vph.o oVar4 = new vph.o();
                jt0.b bVarC = mVar.c();
                sph.m mVar2 = new sph.m();
                z0h.d dVarC = ((u8h.b) wVar3.f177071h).c();
                s.j(dVarC);
                return new com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a(screenerEmbeddedFiltersControllerContract$InputData, vVar, wVar4, oVar3, oVar4, bVarC, mVar2, new qr0.i(dVarC), ((joh.j) this.d).f177010b, new vph.d(), new toh.d(mVar.b(), mVar.c()), wVar2.e());
            case 9:
                jqa.e eVar3 = (jqa.e) this.f162145c;
                jqa.f fVar2 = (jqa.f) this.e;
                int i43 = this.f162144b;
                switch (i43) {
                    case 0:
                        return kxa.j.l((j60.a) fVar2.f177560g.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) fVar2.e.get(), (rp0.m) fVar2.f.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        n60.b bVar6 = (n60.b) fVar2.i.get();
                        o5k.i.n(bVar6);
                        return bVar6;
                    case 4:
                        return o5k.i.s((com.revolut.kompot.navigable.a) fVar2.e.get());
                    case 5:
                        n60.a aVar9 = (n60.a) fVar2.k.get();
                        o5k.i.k(aVar9);
                        return aVar9;
                    case 6:
                        return o5k.i.p((com.revolut.kompot.navigable.a) fVar2.e.get());
                    case 7:
                        return n57.a.z(eVar3.d.c(), (mga.i0) fVar2.f177564m.get(), (mga.f0) fVar2.o.get(), (on.a) fVar2.f177566p.get());
                    case 8:
                        yji.o controller2 = (com.revolut.kompot.navigable.a) fVar2.e.get();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        mga.i0 i0Var = (mga.i0) controller2;
                        s.k(i0Var);
                        return i0Var;
                    case 9:
                        return nga.c.t(fVar2.f177557a, eVar3.d.c(), (wn.a) fVar2.f177565n.get());
                    case 10:
                        return v7.z(eVar3.e, "provider");
                    case 11:
                        os2.g factory = eVar3.e.c();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return (sn.a) factory.f229224b;
                    case 12:
                        xpa.a extension = (xpa.a) fVar2.f177568r.get();
                        zra.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        s.k(extension);
                        return extension;
                    case 13:
                        r10.r checksExtensionFactory = eVar3.f.b();
                        zra.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(checksExtensionFactory, "checksExtensionFactory");
                        csa.c cVar3 = (csa.c) checksExtensionFactory.f250851a;
                        utk.f fVar3 = (utk.f) checksExtensionFactory.f250852b;
                        dVar = new asa.d(cVar3, new xdk.g((xdk.a) fVar3.f283121a, (z71.a) fVar3.f283122b, (wsg.b) fVar3.f283123c), ((w2) checksExtensionFactory.f250853c).m());
                        return dVar;
                    case 14:
                        return o5k.b.a((n5k.b) fVar2.B.get());
                    case 15:
                        n5k.a aVar10 = (n5k.a) fVar2.u.get();
                        p5k.h hVar = (p5k.h) fVar2.z.get();
                        ffk.t tVarF = eVar3.f177551r.f();
                        s.j(tVarF);
                        ang.f fVarE2 = eVar3.f177549p.e();
                        wif.a aVarA4 = eVar3.f177550q.a();
                        gte.a aVarB4 = eVar3.f177545j.b();
                        s.j(aVarB4);
                        j60.a aVar11 = (j60.a) fVar2.f177560g.get();
                        qpk.b bVar7 = new qpk.b();
                        v2k.c cVarA = eVar3.f177546l.a();
                        mre.c cVarB2 = eVar3.f177552s.b();
                        s.j(cVarB2);
                        z0h.a aVarB5 = ((u8h.b) eVar3.f177548n).b();
                        s.j(aVarB5);
                        l80.e eVarH = fVar2.f177559c.f177542c.h();
                        s.j(eVarH);
                        return new n5k.p(aVar10, hVar, tVarF, fVarE2, aVarA4, aVarB4, aVar11, bVar7, cVarA, cVarB2, aVarB5, new p5k.a(eVarH), eVar3.f177553t.b(), (n5k.q) fVar2.A.get());
                    case 16:
                        vsa.a aVar12 = (vsa.a) fVar2.f177570t.get();
                        osa.f fVarL = fVar2.l();
                        gte.a aVarB6 = eVar3.f177545j.b();
                        s.j(aVarB6);
                        eVar = new lsa.e(aVar12, fVarL, aVarB6);
                        return eVar;
                    case 17:
                        vsa.c.Companion.getClass();
                        return new vsa.a();
                    case 18:
                        p5k.b bVar8 = (p5k.b) fVar2.v.get();
                        p5k.w wVar5 = (p5k.w) fVar2.f177572x.get();
                        tga.k kVarB = eVar3.f177547m.b();
                        m5k.b bVarD = fVar2.d();
                        jqa.e eVar4 = fVar2.f177559c;
                        dVar = new p5k.k(bVar8, wVar5, kVarB, bVarD, new jt0.b(eVar4.f177547m.b(), eVar4.f177550q.a(), fVar2.d()), fVar2.e(), new RateExplanationDialogMapper());
                        return dVar;
                    case 19:
                        return new p5k.d();
                    case 20:
                        y yVar = (y) fVar2.f177571w.get();
                        k5i.c cVarA2 = eVar3.k.a();
                        p5k.f fVarE3 = fVar2.e();
                        jqa.e eVar5 = fVar2.f177559c;
                        j9l.a aVar13 = new j9l.a();
                        gte.a aVarB7 = eVar5.f177545j.b();
                        s.j(aVarB7);
                        dVar = new p5k.x(yVar, cVarA2, fVarE3, new kgm.i(aVar13, aVarB7), new p5k.p());
                        return dVar;
                    case 21:
                        return new y();
                    case 22:
                        aah.i iVarD = ((u8h.b) eVar3.f177548n).d();
                        s.j(iVarD);
                        return o5k.i.B(iVarD);
                    case 23:
                        return new n5k.r(new RateExplanationDialogMapper());
                    case 24:
                        return nga.c.a((n5k.q) fVar2.A.get());
                    case 25:
                        return t5k.b.a((s5k.a) fVar2.F.get());
                    case 26:
                        return new s5k.d((r5k.d) fVar2.E.get(), (j60.a) fVar2.f177560g.get(), new r5k.a(), new r5k.b());
                    case 27:
                        return new r5k.e();
                    case 28:
                        wn.a aVar14 = (wn.a) fVar2.f177565n.get();
                        n57.a.c(aVar14);
                        return aVar14;
                    case 29:
                        PushToCardTransferAmountScreenContract$InputData pushToCardTransferAmountScreenContract$InputData = fVar2.f177558b;
                        jqa.e eVar6 = fVar2.f177559c;
                        lpf.a aVar15 = eVar6.i;
                        opf.b bVarG2 = aVar15.g();
                        fk3.a aVarA5 = eVar6.u.a();
                        s.j(aVarA5);
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) aVar15.d).c();
                        s.j(aVarC2);
                        opf.i iVar2 = new opf.i(aVarC2);
                        z70.a aVarF2 = eVar6.f177542c.f();
                        s.j(aVarF2);
                        z zVarD = aVar15.d();
                        iz9.c cVar4 = (iz9.c) eVar6.v.S.get();
                        s.j(cVar4);
                        bsa.i iVar3 = new bsa.i(pushToCardTransferAmountScreenContract$InputData, bVarG2, aVarA5, iVar2, aVarF2, zVarD, cVar4, new opf.c(), new bsa.c());
                        td0.b bVarA7 = vd0.d.a();
                        gte.a aVarB8 = eVar6.f177545j.b();
                        s.j(aVarB8);
                        p38.a aVarA6 = eVar6.f177554w.a();
                        s.j(aVarA6);
                        eVar = new yra.x(pushToCardTransferAmountScreenContract$InputData, iVar3, new yra.a(bVarA7, aVarB8, aVarA6), (vsa.a) fVar2.f177570t.get(), (xpa.a) fVar2.f177568r.get(), (asa.f) fVar2.I.get(), (n5k.b) fVar2.B.get(), (s5k.a) fVar2.F.get(), (n60.a) fVar2.k.get(), (j60.a) fVar2.f177560g.get(), (w80.b) fVar2.J.get(), (ldd.b) fVar2.K.get(), new bsa.b(), (jki.p) fVar2.M.get());
                        return eVar;
                    case 30:
                        osa.f fVarL2 = fVar2.l();
                        jqa.e eVar7 = fVar2.f177559c;
                        lpf.a aVar16 = eVar3.i;
                        opf.c0 c0Var2 = new opf.c0();
                        vo9.a aVarB9 = ((ut9.a) eVar3.f177555x).b();
                        s.j(aVarB9);
                        jid.z zVarQ = ((jqa.g) this.d).q();
                        u5k.c cVar5 = (u5k.c) eVar3.P.get();
                        wsg.n nVarB3 = eVar3.z.b();
                        l1l.a aVar17 = new l1l.a();
                        l1l.d dVar2 = new l1l.d();
                        gte.a aVarB10 = eVar7.f177545j.b();
                        s.j(aVarB10);
                        l1l.s sVar = new l1l.s(aVarB10);
                        l1l.q qVar = new l1l.q();
                        l1l.k kVar = new l1l.k();
                        urf.f fVar4 = new urf.f();
                        wsa.c cVar6 = new wsa.c();
                        gte.a aVarB11 = eVar7.f177545j.b();
                        s.j(aVarB11);
                        l1l.h hVar2 = new l1l.h(aVarB11, 0);
                        gte.a aVarB12 = eVar7.f177545j.b();
                        s.j(aVarB12);
                        dVar = new asa.m(fVarL2, c0Var2, aVarB9, zVarQ, cVar5, nVarB3, aVar17, dVar2, sVar, qVar, kVar, fVar4, cVar6, hVar2, new l1l.h(aVarB12, 1), new asa.e());
                        return dVar;
                    case 31:
                        qd0.b languageProvider = eVar3.f177542c.n();
                        s.j(languageProvider);
                        zra.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return v80.b.b(languageProvider, false, false, 58);
                    case 32:
                        kdd.b bVar9 = eVar3.A;
                        ldd.a factory2 = new ldd.a();
                        zra.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return new ldd.b();
                    case 33:
                        yof.d dVar3 = (yof.d) fVar2.L.get();
                        jqa.e eVar8 = fVar2.f177559c;
                        vo9.a aVarB13 = ((ut9.a) eVar8.f177555x).b();
                        s.j(aVarB13);
                        u80.o oVar5 = new u80.o();
                        w80.b bVar10 = (w80.b) fVar2.J.get();
                        ldd.b bVar11 = (ldd.b) fVar2.K.get();
                        yof.d dVar4 = (yof.d) fVar2.L.get();
                        yof.d transferAmountMapper = (yof.d) fVar2.L.get();
                        yof.d dVar5 = (yof.d) fVar2.L.get();
                        gte.a aVarB14 = eVar8.f177545j.b();
                        s.j(aVarB14);
                        c8k.a hintTextProviderV2 = new c8k.a(dVar5, aVarB14, 1);
                        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
                        Intrinsics.checkNotNullParameter(hintTextProviderV2, "hintTextProviderV2");
                        r10.d dVar6 = new r10.d();
                        dVar6.f250818a = transferAmountMapper;
                        dVar6.f250819b = hintTextProviderV2;
                        csa.b bVar12 = new csa.b(dVar3, aVarB13, oVar5, bVar10, bVar11, new r10.t(dVar4, dVar6));
                        yof.d dVar7 = (yof.d) fVar2.L.get();
                        aqa.a aVarA7 = ((jqa.p) eVar3.C).a();
                        s.j(aVarA7);
                        eVar = new yra.r(bVar12, dVar7, aVarA7);
                        return eVar;
                    case 34:
                        ppf.a factory3 = eVar3.B.b();
                        s.j(factory3);
                        ldd.b delegate = (ldd.b) fVar2.K.get();
                        zra.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(delegate, "delegate");
                        return ppf.a.a(delegate);
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                jxd.a aVar18 = (jxd.a) this.d;
                jxd.e eVar9 = (jxd.e) this.e;
                jxd.f fVar5 = (jxd.f) this.f162145c;
                int i59 = this.f162144b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    xte.a aVar19 = (xte.a) fVar5.f179153c.B.get();
                    s.j(aVar19);
                    return new sxd.b0(aVar19);
                }
                cli.n nVar3 = (cli.n) eVar9.f179150c.get();
                EditTopUpOrderScreenContract$InputData editTopUpOrderScreenContract$InputData = eVar9.f179148a;
                i61.b bVarA8 = fVar5.f179151a.a();
                xoj.a aVarA8 = fVar5.f.a();
                s.j(aVarA8);
                return new sxd.z(nVar3, editTopUpOrderScreenContract$InputData, bVarA8, aVarA8, new e0((kxd.a) eVar9.f179149b.f179138g.get()), fVar5.f179154g.e(), (nxd.b) aVar18.d.get(), (nxd.c) aVar18.e.get(), (kxd.a) aVar18.f179138g.get());
            case 11:
                k2e.d dVar8 = (k2e.d) this.d;
                k2e.j jVar = (k2e.j) this.f162145c;
                vn.a aVar20 = jVar.k;
                k2e.b bVar13 = (k2e.b) this.e;
                int i66 = this.f162144b;
                if (i66 == 0) {
                    wn.a aVar21 = (wn.a) bVar13.f180488b.get();
                    ms1.g.y(aVar21);
                    return aVar21;
                }
                if (i66 == 1) {
                    return v7.z(aVar20, "provider");
                }
                if (i66 != 2) {
                    if (i66 != 3) {
                        throw new AssertionError(i66);
                    }
                    os2.g factory4 = aVar20.c();
                    Intrinsics.checkNotNullParameter(factory4, "factory");
                    return (sn.a) factory4.f229224b;
                }
                StoreBrandDetailDiscountScreenContract$InputData storeBrandDetailDiscountScreenContract$InputData = bVar13.f180487a;
                l2e.a aVarE = jVar.e();
                q2e.a aVar22 = (q2e.a) dVar8.e.get();
                vii.b bVar14 = (vii.b) dVar8.f180497h.get();
                wn.a aVar23 = (wn.a) bVar13.f180488b.get();
                k3e.d storeTagViewDataMapper = new k3e.d();
                o2e.b campaignBannerMapper = new o2e.b();
                o2e.d campaignInstructionsMapper = new o2e.d();
                o2e.a termsItemMapper = new o2e.a();
                Intrinsics.checkNotNullParameter(storeTagViewDataMapper, "storeTagViewDataMapper");
                Intrinsics.checkNotNullParameter(campaignBannerMapper, "campaignBannerMapper");
                Intrinsics.checkNotNullParameter(campaignInstructionsMapper, "campaignInstructionsMapper");
                Intrinsics.checkNotNullParameter(termsItemMapper, "termsItemMapper");
                return new s2e.k(storeBrandDetailDiscountScreenContract$InputData, aVarE, aVar22, bVar14, aVar23, new s2e.m());
            case 12:
                k2e.d dVar9 = (k2e.d) this.d;
                k2e.j jVar2 = (k2e.j) this.f162145c;
                vn.a aVar24 = jVar2.k;
                k2e.c cVar7 = (k2e.c) this.e;
                int i74 = this.f162144b;
                if (i74 == 0) {
                    wn.a aVar25 = (wn.a) cVar7.f180491b.get();
                    ms1.g.y(aVar25);
                    return aVar25;
                }
                if (i74 == 1) {
                    return v7.z(aVar24, "provider");
                }
                if (i74 == 2) {
                    return new com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a(cVar7.f180490a, jVar2.e(), (q2e.a) dVar9.e.get(), (vii.b) dVar9.f180497h.get(), (wn.a) cVar7.f180491b.get(), new p2e.a(), new t2e.r(new k3e.d(), new o2e.g(new k3e.d(), new o2e.b(), new o2e.d(), new o2e.c()), new o2e.b(), new o2e.d(), new o2e.a()));
                }
                if (i74 != 3) {
                    throw new AssertionError(i74);
                }
                os2.g factory5 = aVar24.c();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                return (sn.a) factory5.f229224b;
            case 13:
                k2e.d dVar10 = (k2e.d) this.d;
                k2e.j jVar3 = (k2e.j) this.f162145c;
                vn.a aVar26 = jVar3.k;
                k2e.e eVar10 = (k2e.e) this.e;
                int i92 = this.f162144b;
                if (i92 == 0) {
                    wn.a aVar27 = (wn.a) eVar10.f180500b.get();
                    ms1.g.y(aVar27);
                    return aVar27;
                }
                if (i92 == 1) {
                    return v7.z(aVar26, "provider");
                }
                if (i92 != 2) {
                    if (i92 != 3) {
                        throw new AssertionError(i92);
                    }
                    os2.g factory6 = aVar26.c();
                    Intrinsics.checkNotNullParameter(factory6, "factory");
                    return (sn.a) factory6.f229224b;
                }
                StoreBrandDetailMsiScreenContract$InputData storeBrandDetailMsiScreenContract$InputData = eVar10.f180499a;
                l2e.a aVarE2 = jVar3.e();
                q2e.a aVar28 = (q2e.a) dVar10.e.get();
                vii.b bVar15 = (vii.b) dVar10.f180497h.get();
                wn.a aVar29 = (wn.a) eVar10.f180500b.get();
                o2e.b campaignBannerMapper2 = new o2e.b();
                o2e.d campaignInstructionsMapper2 = new o2e.d();
                o2e.a termsItemMapper2 = new o2e.a();
                Intrinsics.checkNotNullParameter(campaignBannerMapper2, "campaignBannerMapper");
                Intrinsics.checkNotNullParameter(campaignInstructionsMapper2, "campaignInstructionsMapper");
                Intrinsics.checkNotNullParameter(termsItemMapper2, "termsItemMapper");
                return new u2e.j(storeBrandDetailMsiScreenContract$InputData, aVarE2, aVar28, bVar15, aVar29, new u2e.l());
            case 14:
                k2e.f fVar6 = (k2e.f) this.e;
                k2e.d dVar11 = (k2e.d) this.d;
                k2e.j jVar4 = (k2e.j) this.f162145c;
                vn.a aVar30 = jVar4.k;
                int i96 = this.f162144b;
                if (i96 == 0) {
                    wn.a aVar31 = (wn.a) fVar6.f180503b.get();
                    ms1.g.y(aVar31);
                    return aVar31;
                }
                if (i96 == 1) {
                    return v7.z(aVar30, "provider");
                }
                if (i96 != 2) {
                    if (i96 != 3) {
                        throw new AssertionError(i96);
                    }
                    os2.g factory7 = aVar30.c();
                    Intrinsics.checkNotNullParameter(factory7, "factory");
                    return (sn.a) factory7.f229224b;
                }
                StoreBrandDetailRedeemScreenContract$InputData storeBrandDetailRedeemScreenContract$InputData = fVar6.f180502a;
                l2e.a aVarE3 = jVar4.e();
                kye.e eVarG = jVar4.g();
                jwb.e eVarB = jVar4.f180512c.b();
                s.j(eVarB);
                nyb.k kVarC = jVar4.f180511b.c();
                s.j(kVarC);
                wli.x xVarD2 = ((s41.a) jVar4.f180517m).d();
                q2e.a aVar32 = (q2e.a) dVar11.e.get();
                vii.b bVar16 = (vii.b) dVar11.f.get();
                vii.b bVar17 = (vii.b) dVar11.f180496g.get();
                vii.b bVar18 = (vii.b) dVar11.f180497h.get();
                vii.b bVar19 = (vii.b) dVar11.f180498j.get();
                wn.a aVar33 = (wn.a) fVar6.f180503b.get();
                l80.e eVarH2 = jVar4.f180516l.h();
                s.j(eVarH2);
                return new v2e.i0(storeBrandDetailRedeemScreenContract$InputData, aVarE3, eVarG, eVarB, kVarC, xVarD2, aVar32, bVar16, bVar17, bVar18, bVar19, aVar33, eVarH2, new m0(new o2e.h(), new u3e.c(), new o2e.g(new k3e.d(), new o2e.b(), new o2e.d(), new o2e.c()), new o2e.b(), new o2e.d(), new o2e.a()));
            case 15:
                return a();
            case 16:
                return b();
            case 17:
                return c();
            case 18:
                return d();
            case 19:
                return e();
            case 20:
                return f();
            case 21:
                return g();
            case 22:
                return h();
            case 23:
                return i();
            case 24:
                return j();
            case 25:
                return k();
            case 26:
                return l();
            case 27:
                return m();
            case 28:
                return n();
            default:
                ld1.w wVar6 = (ld1.w) this.d;
                ld1.l lVar2 = (ld1.l) this.f162145c;
                ld1.o oVar6 = (ld1.o) this.e;
                ld1.l lVar3 = oVar6.f193980a;
                int i99 = this.f162144b;
                switch (i99) {
                    case 0:
                        xc1.d extension2 = (xc1.d) oVar6.f193981b.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        xc1.d dVar12 = extension2;
                        s.k(dVar12);
                        return dVar12;
                    case 1:
                        xc1.a dialogDisplayerProvider = (xc1.a) wVar6.f194008c.get();
                        Intrinsics.checkNotNullParameter(dialogDisplayerProvider, "dialogDisplayerProvider");
                        return new xc1.d(dialogDisplayerProvider);
                    case 2:
                        Object extension3 = (ad1.b) oVar6.e.get();
                        ef1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar4 = (yji.n) extension3;
                        s.k(nVar4);
                        return nVar4;
                    case 3:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) oVar6.d.get();
                        fc1.a extensionFactory = (fc1.a) lVar2.f193956b.d.get();
                        s.j(extensionFactory);
                        ef1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        Intrinsics.checkNotNullParameter(extensionFactory, "extensionFactory");
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        cVar = new ec1.c(extensionFactory.f133608a, x0.a(g1.Companion, controller3.D2()));
                        break;
                    case 4:
                        df1.o oVar7 = new df1.o((df1.a) oVar6.f193983g.get());
                        nd1.n nVar5 = (nd1.n) lVar2.f193964p.get();
                        rd1.a aVar34 = new rd1.a((pd1.a) lVar3.f193968t.get());
                        nd1.j jVar5 = (nd1.j) lVar2.d.f.get();
                        s.j(jVar5);
                        nd1.n nVar6 = (nd1.n) lVar3.f193964p.get();
                        nd1.i iVar4 = (nd1.i) lVar3.f193966r.get();
                        ad1.b bVar20 = (ad1.b) oVar6.e.get();
                        bd1.a aVarA9 = lVar3.d.a();
                        s.j(aVarA9);
                        hf1.d dVar13 = (hf1.d) oVar6.f193984h.get();
                        gd1.a aVar35 = (gd1.a) lVar3.f193956b.f303969c.get();
                        s.j(aVar35);
                        return new com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c(oVar7, nVar5, aVar34, jVar5, new hd.r(nVar6, iVar4, bVar20, aVarA9, dVar13, aVar35));
                    case 5:
                        cVar = new df1.b((rd1.b) wVar6.d.get(), (hf1.f) lVar2.o.get());
                        break;
                    case 6:
                        return new hf1.e((f01.a) wVar6.f.get());
                    default:
                        throw new AssertionError(i99);
                }
                return cVar;
        }
    }
}
