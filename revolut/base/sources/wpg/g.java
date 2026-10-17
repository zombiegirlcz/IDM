package wpg;

import ael.d0;
import buf.a1;
import buf.d1;
import bul.x;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.PaymentConsentType;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreenContract$InputData;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreenContract$InputData;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$InputData;
import com.revolut.feature.address.common.impl.flow.validation_flow.AddressEnhancementAdvisor;
import com.revolut.feature.apm.iris.impl.ui.area.IrisAreaScreenContract$InputData;
import com.revolut.feature.atm.impl.network.service.AtmsService;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferContract$InputData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2ScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperiencesQuestionsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOrderDraft;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOutputValue;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.screens.review.provider.NoteOrderPlacementDialogProvider;
import cul.i0;
import cul.p2;
import cul.z;
import gul.b0;
import gul.e0;
import gul.g0;
import gul.h0;
import gul.w;
import ip0.v7;
import java.util.List;
import jm4.a3;
import k4l.r0;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import kvl.a0;
import mga.f0;
import qgk.k3;
import rp0.g1;
import vrl.s0;
import vrl.u0;
import vrl.y0;
import vtc.p0;
import wk2.l0;
import wp5.y;
import x1g.c0;
import xf6.r2;
import xf6.s2;
import xf6.t2;
import xf6.u2;
import xf6.w2;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f299260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f299261c;
    public final Object d;
    public final Object e;

    public /* synthetic */ g(Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f299259a = i2;
        this.f299260b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f299261c = i;
    }

    private final Object a() {
        xsl.p pVar = (xsl.p) this.f299260b;
        xsl.e eVar = (xsl.e) this.e;
        int i = this.f299261c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) eVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) eVar.d.get(), (rp0.m) eVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) eVar.f308606h.get();
                pl1.d.n(keyboardSuggestionsControllerExtension);
                return keyboardSuggestionsControllerExtension;
            case 4:
                return pl1.d.u((com.revolut.kompot.navigable.a) eVar.d.get());
            case 5:
                n60.a aVar = (n60.a) eVar.f308607j.get();
                o5k.i.l(aVar);
                return aVar;
            case 6:
                return o5k.i.q((com.revolut.kompot.navigable.a) eVar.d.get());
            case 7:
                return new isl.j((isl.h) eVar.f308608l.get(), (isl.b) eVar.o.get());
            case 8:
                yji.o controller = (com.revolut.kompot.navigable.a) eVar.d.get();
                dul.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                isl.h hVar = (isl.h) controller;
                vc.s.k(hVar);
                return hVar;
            case 9:
                isl.c cVar = (isl.c) eVar.f308609m.get();
                ybl.b bVarB = pVar.e.b();
                vc.s.j(bVarB);
                d0 d0VarK = pVar.e.k();
                vc.s.j(d0VarK);
                return new isl.m(cVar, bVarB, d0VarK, (j60.a) eVar.f.get(), (isl.d) eVar.f308610n.get());
            case 10:
                InvestOrderEditScreenContract$InputData inputData = eVar.f308602a;
                dul.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return new isl.c(inputData.f106880a.f214596b);
            case 11:
                return new isl.n();
            case 12:
                return new kvl.q((kvl.g) eVar.f308612q.get(), (kvl.c) eVar.f308615t.get());
            case 13:
                yji.o controller2 = (com.revolut.kompot.navigable.a) eVar.d.get();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                kvl.g gVar = (kvl.g) controller2;
                vc.s.k(gVar);
                return gVar;
            case 14:
                kvl.e eVar2 = (kvl.e) eVar.f308613r.get();
                kvl.d dVar = (kvl.d) eVar.f308614s.get();
                wsg.n nVarB = pVar.f308695g.b();
                n60.a aVar2 = (n60.a) eVar.f308607j.get();
                j60.a aVar3 = (j60.a) eVar.f.get();
                ybl.k kVarD = pVar.f308696h.d();
                vc.s.j(kVarD);
                return new a0(eVar2, dVar, nVarB, aVar2, aVar3, kVarD, pVar.i.f());
            case 15:
                InvestOrderEditScreenContract$InputData inputData2 = eVar.f308602a;
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                return new kvl.e(inputData2.f106881b);
            case 16:
                oda.o oVar = pVar.f;
                return new lvl.a(new xea.g(oVar.f(), oVar.i.g()));
            case 17:
                InvestOrderEditScreenContract$InputData inputData3 = eVar.f308602a;
                xsl.p pVar2 = eVar.f308603b;
                i90.b uuidUtils = new i90.b();
                dul.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData3, "inputData");
                Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
                bfl.g gVar2 = inputData3.f106882c;
                r0 r0Var = inputData3.d;
                aul.b bVar = inputData3.i;
                Amount amount = inputData3.f106884h;
                String strU = y.u(uuidUtils, "toString(...)");
                InvestInputValue.INSTANCE.getClass();
                InvestInputValue investInputValue = InvestInputValue.e;
                Data data = new Data(null, null, true, 3, null);
                InvestOutputValue.INSTANCE.getClass();
                cul.v vVar = new cul.v(gVar2, r0Var, strU, bVar, investInputValue, data, null, InvestOutputValue.f106855c, new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), amount, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, true, 3, null), null, null, null, new Data(null, null, true, 3, null), false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, false, false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null);
                p2 p2Var = (p2) eVar.f308616w.get();
                z zVar = (z) eVar.f308617x.get();
                cul.u uVar = (cul.u) eVar.A.get();
                dsl.a aVar4 = (dsl.a) pVar2.R.get();
                xul.n nVar = (xul.n) pVar2.k.Y.get();
                vc.s.j(nVar);
                eul.v vVar2 = new eul.v(aVar4, nVar, new wul.g());
                e4m.e eVar3 = pVar.S;
                zdl.c cVar2 = pVar.e;
                trl.a aVar5 = pVar.k;
                vrl.c cVar3 = (vrl.c) eVar3.get();
                ybl.l lVarF = pVar.i.f();
                ybl.b bVarB2 = cVar2.b();
                vc.s.j(bVarB2);
                u0 u0VarI = aVar5.i();
                vc.s.j(u0VarI);
                wtl.e eVar4 = (wtl.e) ((xsl.f) this.d).d.get();
                isl.b bVar2 = (isl.b) eVar.o.get();
                j60.a aVar6 = (j60.a) eVar.f.get();
                w wVar = new w(new bul.u());
                bul.g gVar3 = new bul.g();
                gul.d dVar2 = new gul.d();
                g2e.t tVar = new g2e.t((vdf.d) pVar2.Q.get());
                bul.e eVar5 = new bul.e(new lul.c());
                e0 e0Var = new e0(new l4i.a());
                bul.k kVar = new bul.k();
                gte.a aVarB = pVar2.f308692a.b();
                vc.s.j(aVarB);
                bul.m mVar = new bul.m(aVarB);
                yhl.d dVarA = pVar2.f308699m.a();
                vc.s.j(dVarA);
                l80.e eVarH = pVar2.f308697j.h();
                vc.s.j(eVarH);
                bul.r rVar = new bul.r(dVarA, eVarH);
                bul.i iVar = new bul.i();
                n60.a aVar7 = (n60.a) eVar.f308607j.get();
                gul.q qVar = new gul.q(pVar2.k.e(), new l4i.a());
                by5.a aVar8 = new by5.a(new gul.z());
                gul.z zVar2 = new gul.z();
                ppk.f fVarA = pVar2.f308700n.a();
                l4i.a aVar9 = new l4i.a();
                gte.a aVarB2 = pVar2.f308692a.b();
                vc.s.j(aVarB2);
                b0 b0Var = new b0(fVarA, aVar9, aVarB2, new gul.z());
                g0 g0Var = new g0();
                vrl.a aVar10 = (vrl.a) aVar5.J.get();
                vc.s.j(aVar10);
                gul.h hVar2 = new gul.h();
                nvl.j jVar = (nvl.j) eVar.B.get();
                l80.e eVarH2 = pVar2.f308697j.h();
                vc.s.j(eVarH2);
                fkg.a aVar11 = new fkg.a(new v60.g(jVar, eVarH2));
                nvl.j jVar2 = (nvl.j) eVar.B.get();
                l80.e eVarH3 = pVar2.f308697j.h();
                vc.s.j(eVarH3);
                r10.a aVar12 = new r10.a(jVar2, eVarH3);
                gul.j jVar3 = new gul.j();
                gul.c cVar4 = new gul.c();
                gul.o oVar2 = new gul.o();
                h0 h0Var = new h0();
                bul.l lVar = new bul.l();
                kvl.b bVar3 = (kvl.b) eVar.f308615t.get();
                qr0.i iVarO = p0.o(aVar5.a());
                wul.a aVar13 = new wul.a(((k3) pVar2.o).b());
                ddf.a aVar14 = (ddf.a) aVar5.f273811b0.get();
                vc.s.j(aVar14);
                gul.d0 d0Var = new gul.d0(new m4f.b());
                zrc.e eVarC = pVar.d.c();
                gul.e eVar6 = new gul.e(new x(), new l4i.a());
                gul.x xVar = new gul.x();
                u0 u0VarI2 = pVar2.k.i();
                vc.s.j(u0VarI2);
                gte.a aVarB3 = pVar2.f308692a.b();
                vc.s.j(aVarB3);
                gul.g gVar4 = new gul.g(u0VarI2, aVarB3);
                gul.k kVar2 = new gul.k();
                gul.t amountBuilder = new gul.t();
                gul.u feeBreakdownBuilder = new gul.u();
                Intrinsics.checkNotNullParameter(amountBuilder, "amountBuilder");
                Intrinsics.checkNotNullParameter(feeBreakdownBuilder, "feeBreakdownBuilder");
                gul.v investOutputValueBuilder = new gul.v();
                o7.b orderQuoteInteractor = pVar2.f308693b.a();
                Intrinsics.checkNotNullParameter(investOutputValueBuilder, "investOutputValueBuilder");
                Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
                r10.d dVar3 = new r10.d();
                dVar3.f250818a = investOutputValueBuilder;
                dVar3.f250819b = orderQuoteInteractor;
                fk3.a aVarA = pVar.f308701p.a();
                vc.s.j(aVarA);
                gte.a aVarB4 = pVar.f308692a.b();
                vc.s.j(aVarB4);
                f7j.p pVar3 = new f7j.p(new l4i.a(), 1);
                zjh.f fVarC = cVar2.c();
                gte.a aVarB5 = pVar2.f308692a.b();
                vc.s.j(aVarB5);
                return new com.revolut.trading.orders.ui.invest.placement.screens.edit.e(inputData3, vVar, p2Var, zVar, uVar, vVar2, cVar3, lVarF, bVarB2, u0VarI, eVar4, bVar2, aVar6, wVar, gVar3, dVar2, tVar, eVar5, e0Var, kVar, mVar, rVar, iVar, aVar7, qVar, aVar8, zVar2, b0Var, g0Var, aVar10, hVar2, aVar11, aVar12, jVar3, cVar4, oVar2, h0Var, lVar, bVar3, iVarO, aVar13, aVar14, d0Var, eVarC, eVar6, xVar, gVar4, kVar2, dVar3, aVarA, aVarB4, pVar3, fVarC, new s0(aVarB5, new zrl.b(new su9.c(pVar2.f308694c.a(), pVar2.f308693b.a()), pVar2.f308700n.a(), new l4i.a()), pVar2.f308702q.b()));
            case 18:
                InvestOrderEditScreenContract$InputData inputData4 = eVar.f308602a;
                InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = eVar.f308602a;
                xsl.p pVar4 = eVar.f308603b;
                e4m.e eVar7 = pVar4.Q;
                trl.a aVar15 = pVar4.k;
                ImmutableSet subtitleMappers = ImmutableSet.of((ful.g) new ful.c((vdf.d) eVar7.get(), aVar15.k()), (ful.g) new ful.e((vdf.d) pVar4.Q.get()), new ful.g(aVar15.k()));
                ful.j titleMapper = new ful.j(pVar4.k.k());
                wul.o tradingOrderMapper = aVar15.k();
                Intrinsics.checkNotNullParameter(inputData4, "inputData");
                Intrinsics.checkNotNullParameter(subtitleMappers, "subtitleMappers");
                Intrinsics.checkNotNullParameter(titleMapper, "titleMapper");
                Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
                twg.c cVar5 = new twg.c();
                cVar5.f275017a = inputData4;
                cVar5.f275018b = subtitleMappers;
                cVar5.f275019c = titleMapper;
                cVar5.d = tradingOrderMapper;
                return new p2(inputData4, cVar5, new eul.h(new eul.c((vdf.d) pVar4.Q.get()), new eul.x(new l4i.a()), new o7.b((wdf.a) eVar.v.get()), new eul.j(pVar4.k.g()), new eul.r(investOrderEditScreenContract$InputData, (csl.i) eVar.f308604c.f308622g.get())), new eul.m(), new zrc.e(investOrderEditScreenContract$InputData), new vfl.a(), new eul.l(), (dsl.a) pVar.R.get());
            case 19:
                return new ysl.b();
            case 20:
                return new cul.a();
            case 21:
                return new i0(new ovl.a(), (jvl.a) eVar.f308618y.get(), (rvl.b) eVar.z.get());
            case 22:
                return new mvl.b();
            case 23:
                return new rvl.e();
            case 24:
                return new nvl.j();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        xsl.p pVar = (xsl.p) this.f299260b;
        xsl.g gVar = (xsl.g) this.e;
        int i = this.f299261c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) gVar.f308627h.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) gVar.f.get(), (rp0.m) gVar.f308626g.get());
            case 2:
                return new rp0.m();
            case 3:
                n60.a aVar = (n60.a) gVar.f308628j.get();
                o5k.i.l(aVar);
                return aVar;
            case 4:
                return o5k.i.q((com.revolut.kompot.navigable.a) gVar.f.get());
            case 5:
                return kii.e.j((u8h.b) pVar.f308703r, "factory");
            case 6:
                return nga.c.s(pVar.f308704s.c(), (mga.i0) gVar.f308630m.get(), (f0) gVar.o.get(), (on.a) gVar.f308632p.get());
            case 7:
                yji.o controller = (com.revolut.kompot.navigable.a) gVar.f.get();
                iul.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mga.i0 i0Var = (mga.i0) controller;
                vc.s.k(i0Var);
                return i0Var;
            case 8:
                return nga.c.u(pVar.f308704s.c(), gVar.f308624b, (wn.a) gVar.f308631n.get());
            case 9:
                return v7.z(pVar.f308705t, "provider");
            case 10:
                os2.g factory = pVar.f308705t.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 11:
                kcf.f factory2 = (kcf.f) pVar.u.L.get();
                vc.s.j(factory2);
                ocf.c screen = (ocf.c) gVar.f308634r.get();
                ocf.b controllerModelExtension = (ocf.b) gVar.f308635s.get();
                ocf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(screen, "screen");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                Intrinsics.checkNotNullParameter(screen, "screen");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                return new kcf.d(screen, controllerModelExtension);
            case 12:
                yji.o controller2 = (com.revolut.kompot.navigable.a) gVar.f.get();
                iul.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                ocf.c cVar = (ocf.c) controller2;
                vc.s.k(cVar);
                return cVar;
            case 13:
                kcf.f factory3 = (kcf.f) pVar.u.L.get();
                vc.s.j(factory3);
                ocf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                mbf.c tradingProUpsellingBannerProvider = factory3.f182726a;
                xbf.g tradingProUpsellingNavigationProvider = factory3.f182727b;
                Intrinsics.checkNotNullParameter(tradingProUpsellingBannerProvider, "tradingProUpsellingBannerProvider");
                Intrinsics.checkNotNullParameter(tradingProUpsellingNavigationProvider, "tradingProUpsellingNavigationProvider");
                return new kcf.e();
            case 14:
                return new isl.j((isl.h) gVar.u.get(), (isl.b) gVar.f308638x.get());
            case 15:
                yji.o controller3 = (com.revolut.kompot.navigable.a) gVar.f.get();
                iul.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller3, "controller");
                isl.h hVar = (isl.h) controller3;
                vc.s.k(hVar);
                return hVar;
            case 16:
                isl.c cVar2 = (isl.c) gVar.v.get();
                ybl.b bVarB = pVar.e.b();
                vc.s.j(bVarB);
                d0 d0VarK = pVar.e.k();
                vc.s.j(d0VarK);
                return new isl.m(cVar2, bVarB, d0VarK, (j60.a) gVar.f308627h.get(), (isl.d) gVar.f308637w.get());
            case 17:
                InvestOrderReviewScreenContract$InputData inputData = gVar.f308625c;
                iul.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return new isl.c(inputData.f106941a.f214596b);
            case 18:
                return new isl.n();
            case 19:
                return new kvl.q((kvl.g) gVar.z.get(), (kvl.c) gVar.C.get());
            case 20:
                yji.o controller4 = (com.revolut.kompot.navigable.a) gVar.f.get();
                Intrinsics.checkNotNullParameter(controller4, "controller");
                kvl.g gVar2 = (kvl.g) controller4;
                vc.s.k(gVar2);
                return gVar2;
            case 21:
                kvl.e eVar = (kvl.e) gVar.A.get();
                kvl.d dVar = (kvl.d) gVar.B.get();
                wsg.n nVarB = pVar.f308695g.b();
                n60.a aVar2 = (n60.a) gVar.f308628j.get();
                j60.a aVar3 = (j60.a) gVar.f308627h.get();
                ybl.k kVarD = pVar.f308696h.d();
                vc.s.j(kVarD);
                return new a0(eVar, dVar, nVarB, aVar2, aVar3, kVarD, pVar.i.f());
            case 22:
                InvestOrderReviewScreenContract$InputData inputData2 = gVar.f308625c;
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                return new kvl.e(inputData2.f106942b);
            case 23:
                oda.o oVar = pVar.f;
                return new lvl.a(new xea.g(oVar.f(), oVar.i.g()));
            case 24:
                wn.a aVar4 = (wn.a) gVar.f308631n.get();
                n57.a.d(aVar4);
                return aVar4;
            case 25:
                InvestOrderReviewScreenContract$InputData inputData3 = gVar.f308625c;
                xsl.p pVar2 = gVar.d;
                gte.a featureToggleInteractor = pVar2.f308692a.b();
                vc.s.j(featureToggleInteractor);
                iul.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData3, "inputData");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                InvestOrderDraft investOrderDraft = inputData3.f106943c;
                hul.h hVar2 = new hul.h(investOrderDraft, investOrderDraft.f106853l, investOrderDraft.f106854m, null, null, null, null, null, null, null, null, null, null, null, null, null, ((jte.d) featureToggleInteractor).c(TradingOrdersApi$Toggles.OrderReviewMarketTiming.f106793c), null);
                hul.p0 p0Var = (hul.p0) gVar.G.get();
                hul.o oVar2 = (hul.o) gVar.H.get();
                csl.k kVar = (csl.k) gVar.I.get();
                h9h.a aVar5 = pVar.i;
                trl.a aVar6 = pVar.k;
                zdl.c cVar3 = pVar.e;
                ybl.l lVarF = aVar5.f();
                vrl.c cVar4 = (vrl.c) pVar.S.get();
                ybl.b bVarB2 = cVar3.b();
                vc.s.j(bVarB2);
                y0 y0VarJ = aVar6.j();
                vc.s.j(y0VarJ);
                u0 u0VarI = aVar6.i();
                vc.s.j(u0VarI);
                vrl.p pVar3 = (vrl.p) pVar.W.get();
                wtl.e eVar2 = (wtl.e) ((xsl.f) this.d).d.get();
                tga.k kVarB = pVar.f308707x.b();
                isl.b bVar = (isl.b) gVar.f308638x.get();
                lul.h hVar3 = new lul.h();
                j60.a aVar7 = (j60.a) gVar.f308627h.get();
                lul.n nVar = new lul.n();
                bul.g gVar3 = new bul.g();
                bul.l lVar = new bul.l();
                bul.e eVar3 = new bul.e(new lul.c());
                bul.j jVar = new bul.j();
                lul.m mVar = new lul.m(new l4i.a(), new bul.o(ImmutableSet.of((bul.w) new bul.c(new l4i.a()), new bul.w(new bul.s(), new l4i.a())), 0), new x());
                jul.i iVar = new jul.i();
                lul.f fVar = new lul.f();
                vrl.a aVar8 = (vrl.a) pVar2.k.J.get();
                vc.s.j(aVar8);
                zjh.j jVar2 = new zjh.j(aVar8);
                wj0.a aVarI = ((nj0.d) pVar.f308706w).i();
                vc.s.j(aVarI);
                nvl.j jVar3 = (nvl.j) gVar.J.get();
                l70.e eVar4 = pVar2.f308697j;
                l80.e eVarH = eVar4.h();
                vc.s.j(eVarH);
                r10.a aVar9 = new r10.a(jVar3, eVarH);
                yhl.d dVarA = pVar2.f308699m.a();
                vc.s.j(dVarA);
                l80.e eVarH2 = eVar4.h();
                vc.s.j(eVarH2);
                lul.e eVar5 = new lul.e(aVar9, new bul.r(dVarA, eVarH2), (vrl.c) pVar2.S.get());
                kvl.b bVar2 = (kvl.b) gVar.C.get();
                qr0.i iVarO = p0.o(aVar6.a());
                pfh.b bVar3 = new pfh.b();
                wul.a aVar10 = new wul.a(((k3) pVar2.o).b());
                lul.g gVar4 = new lul.g();
                bul.u uVar = new bul.u();
                bul.k kVar2 = new bul.k();
                kbb.c cVar5 = new kbb.c(pVar2.f308693b.a(), new bul.s(), new l4i.a());
                d1h.e eVar6 = (d1h.e) gVar.f308629l.get();
                gte.a aVarB = pVar.f308692a.b();
                vc.s.j(aVarB);
                lul.c cbpDisclosureProvider = new lul.c();
                Intrinsics.checkNotNullParameter(cbpDisclosureProvider, "cbpDisclosureProvider");
                lul.a aVar11 = new lul.a();
                wli.x xVarD = ((s41.a) pVar.f308708y).d();
                tvl.a aVar12 = new tvl.a();
                d0 d0VarK2 = cVar3.k();
                vc.s.j(d0VarK2);
                NoteOrderPlacementDialogProvider noteOrderPlacementDialogProvider = new NoteOrderPlacementDialogProvider();
                lul.c cVar6 = new lul.c();
                zjh.f fVarC = cVar3.c();
                fxk.a tradingHoursInteractor = pVar2.z.a();
                vc.s.j(tradingHoursInteractor);
                ybl.b instrumentTickerInteractor = pVar2.e.b();
                vc.s.j(instrumentTickerInteractor);
                df0.b syncedDateProvider = pVar2.A.a();
                vc.s.j(syncedDateProvider);
                Intrinsics.checkNotNullParameter(tradingHoursInteractor, "tradingHoursInteractor");
                Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
                Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
                return new com.revolut.trading.orders.ui.invest.placement.screens.review.o(inputData3, hVar2, p0Var, oVar2, kVar, lVarF, cVar4, bVarB2, y0VarJ, u0VarI, pVar3, eVar2, kVarB, bVar, hVar3, aVar7, nVar, gVar3, lVar, eVar3, jVar, mVar, iVar, fVar, jVar2, aVarI, eVar5, bVar2, iVarO, bVar3, aVar10, gVar4, uVar, kVar2, cVar5, eVar6, aVarB, aVar11, xVarD, aVar12, d0VarK2, noteOrderPlacementDialogProvider, cVar6, fVarC, new ydf.b(tradingHoursInteractor, instrumentTickerInteractor, syncedDateProvider, new ydf.c()), new lul.i());
            case 26:
                jul.m mVar2 = new jul.m();
                xsl.p pVar4 = gVar.d;
                xsl.p pVar5 = gVar.d;
                jul.o oVar3 = new jul.o(mVar2, new jul.l(pVar4.k.k()), (d1h.h) gVar.F.get());
                l4i.a aVar13 = new l4i.a();
                kul.h hVarB = gVar.b();
                trl.a aVar14 = pVar5.k;
                xul.l lVarH = aVar14.h();
                vc.s.j(lVarH);
                bul.s sVar = new bul.s();
                wul.q qVar = new wul.q();
                gte.a aVarB2 = pVar5.f308692a.b();
                vc.s.j(aVarB2);
                kul.d dVar2 = new kul.d(aVar13, hVarB, lVarH, sVar, qVar, aVarB2);
                kul.f fVar2 = new kul.f(gVar.b(), new wul.q());
                l4i.a aVar15 = new l4i.a();
                kul.h hVarB2 = gVar.b();
                xul.l lVarH2 = aVar14.h();
                vc.s.j(lVarH2);
                jul.e eVar7 = new jul.e(ImmutableSet.of((kul.j) dVar2, (kul.j) fVar2, (kul.j) new kul.n(aVar15, hVarB2, lVarH2, new bul.s(), new wul.q()), new kul.j(gVar.b(), new wul.q())));
                jul.b footerConditionsMapper = new jul.b();
                Intrinsics.checkNotNullParameter(footerConditionsMapper, "footerConditionsMapper");
                return new hul.p0(oVar3, eVar7, new dcl.q(), new jul.f(), new jul.j((dsl.a) pVar5.R.get()));
            case 27:
                return kii.e.k((u8h.b) pVar.f308703r);
            case 28:
                return new hul.a();
            case 29:
                jul.o oVarI = pVar.f308697j.i();
                l80.e eVarH3 = gVar.d.f308697j.h();
                vc.s.j(eVarH3);
                return new csl.n(oVarI, new csl.g(eVarH3));
            case 30:
                return new nvl.j();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        ytf.b bVar = (ytf.b) this.d;
        ytf.e eVar = (ytf.e) this.f299260b;
        ytf.c cVar = (ytf.c) this.e;
        int i = this.f299261c;
        switch (i) {
            case 0:
                return kxa.j.j((j60.a) cVar.f316736g.get());
            case 1:
                return v1.c.r((com.revolut.kompot.navigable.a) cVar.e.get(), (rp0.m) cVar.f.get());
            case 2:
                return new rp0.m();
            case 3:
                n60.a aVar = (n60.a) cVar.i.get();
                o5k.i.l(aVar);
                return aVar;
            case 4:
                return o5k.i.q((com.revolut.kompot.navigable.a) cVar.e.get());
            case 5:
                n60.b bVar2 = (n60.b) cVar.k.get();
                o5k.i.m(bVar2);
                return bVar2;
            case 6:
                return o5k.i.r((com.revolut.kompot.navigable.a) cVar.e.get());
            case 7:
                return nga.c.s(eVar.f316769c.c(), (mga.i0) cVar.f316740m.get(), (f0) cVar.o.get(), (on.a) cVar.f316742p.get());
            case 8:
                yji.o controller = (com.revolut.kompot.navigable.a) cVar.e.get();
                huf.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mga.i0 i0Var = (mga.i0) controller;
                vc.s.k(i0Var);
                return i0Var;
            case 9:
                return nga.c.u(eVar.f316769c.c(), cVar.f316733a, (wn.a) cVar.f316741n.get());
            case 10:
                return v7.z(eVar.f316779s, "provider");
            case 11:
                os2.g factory = eVar.f316779s.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 12:
                return o5k.d.a((n5k.b) cVar.f316746t.get());
            case 13:
                ytf.b bVar3 = cVar.d;
                ytf.e eVar2 = cVar.f316735c;
                ztf.f fVar = new ztf.f(bVar3.f316724a, (luf.a) bVar3.o.get(), (guf.b) bVar3.f316731m.get());
                p5k.d dVar = new p5k.d();
                p5k.x xVarJ = cVar.j();
                qga.a aVar2 = eVar2.f316781w;
                p5k.k kVar = new p5k.k(dVar, xVarJ, aVar2.b(), cVar.b(), new jt0.b(aVar2.b(), eVar2.z.a(), cVar.b()), cVar.c(), new RateExplanationDialogMapper());
                ffk.t tVarF = eVar.A.f();
                vc.s.j(tVarF);
                ang.f fVarE = eVar.f316773l.e();
                wif.a aVarA = eVar.z.a();
                gte.a aVarB = eVar.f316776p.b();
                vc.s.j(aVarB);
                j60.a aVar3 = (j60.a) cVar.f316736g.get();
                qpk.b bVar4 = new qpk.b();
                v2k.c cVarA = eVar.v.a();
                mre.c cVarB = eVar.B.b();
                vc.s.j(cVarB);
                z0h.a aVarB2 = ((u8h.b) eVar.f316782x).b();
                vc.s.j(aVarB2);
                l80.e eVarH = eVar2.f316768b.h();
                vc.s.j(eVarH);
                return new n5k.p(fVar, kVar, tVarF, fVarE, aVarA, aVarB, aVar3, bVar4, cVarA, cVarB, aVarB2, new p5k.a(eVarH), eVar.C.b(), (n5k.q) cVar.f316745s.get());
            case 14:
                aah.i iVarD = ((u8h.b) eVar.f316782x).d();
                vc.s.j(iVarD);
                return o5k.i.C(iVarD);
            case 15:
                return new n5k.r(new RateExplanationDialogMapper());
            case 16:
                return o5k.i.a((n5k.q) cVar.f316745s.get());
            case 17:
                wn.a aVar4 = (wn.a) cVar.f316741n.get();
                n57.a.d(aVar4);
                return aVar4;
            case 18:
                a3 a3Var = eVar.G;
                vt4.h mapper = new vt4.h();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return new zrf.m(mapper);
            case 19:
                return v.C((zrf.m) cVar.f316748x.get(), (yrf.a) cVar.f316749y.get());
            case 20:
                return new yrf.a();
            case 21:
                i5k.a aVar5 = (i5k.a) cVar.A.get();
                j5k.b.a(aVar5);
                return aVar5;
            case 22:
                l80.h hVarV = eVar.f316768b.v();
                vc.s.j(hVarV);
                return new i5k.d(hVarV);
            case 23:
                ManualTransferReviewScreenContract$InputData manualTransferReviewScreenContract$InputData = cVar.f316734b;
                ytf.e eVar3 = cVar.f316735c;
                iuf.d dVar2 = new iuf.d(manualTransferReviewScreenContract$InputData, (guf.b) cVar.d.f316731m.get(), ((b3j.p) eVar3.f316777q).e());
                luf.a aVar6 = (luf.a) bVar.o.get();
                kuf.d dVar3 = (kuf.d) bVar.f316728h.get();
                kuf.e eVar4 = (kuf.e) bVar.f316729j.get();
                i5k.a aVar7 = (i5k.a) cVar.A.get();
                j60.a aVar8 = (j60.a) cVar.f316736g.get();
                yof.a aVarA2 = eVar.i.a();
                vc.s.j(aVarA2);
                tga.k kVarB = eVar.f316781w.b();
                vrf.h hVar = (vrf.h) cVar.D.get();
                yof.k kVarG = eVar3.i.g();
                vc.s.j(kVarG);
                p5k.x xVarJ2 = cVar.j();
                b3j.p pVar = (b3j.p) eVar3.f316777q;
                return new com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a(manualTransferReviewScreenContract$InputData, dVar2, aVar6, dVar3, eVar4, aVar7, aVar8, aVarA2, kVarB, hVar, new iuf.v(kVarG, xVarJ2, new m3j.p(new m3j.r(pVar.b(), b3j.p.d(), pVar.a(), new m3j.t())), (vrf.h) cVar.D.get()));
            case 24:
                List providers = v.D((zrf.g) cVar.z.get(), (zrf.m) cVar.f316748x.get(), (zrf.n) cVar.C.get());
                Intrinsics.checkNotNullParameter(providers, "providers");
                return new xrf.b(providers);
            case 25:
                return new zrf.n();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        ytf.b bVar = (ytf.b) this.d;
        ytf.e eVar = (ytf.e) this.f299260b;
        ytf.d dVar = (ytf.d) this.e;
        int i = this.f299261c;
        switch (i) {
            case 0:
                n60.b bVar2 = (n60.b) dVar.f.get();
                o5k.i.n(bVar2);
                return bVar2;
            case 1:
                return o5k.i.s((com.revolut.kompot.navigable.a) dVar.e.get());
            case 2:
                n60.a aVar = (n60.a) dVar.f316754h.get();
                o5k.i.k(aVar);
                return aVar;
            case 3:
                return o5k.i.p((com.revolut.kompot.navigable.a) dVar.e.get());
            case 4:
                return kxa.j.l((j60.a) dVar.k.get());
            case 5:
                return h30.l.p((com.revolut.kompot.navigable.a) dVar.e.get(), (rp0.m) dVar.f316755j.get());
            case 6:
                return new rp0.m();
            case 7:
                return n57.a.z(eVar.f316769c.c(), (mga.i0) dVar.f316757m.get(), (f0) dVar.o.get(), (on.a) dVar.f316759p.get());
            case 8:
                yji.o controller = (com.revolut.kompot.navigable.a) dVar.e.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mga.i0 i0Var = (mga.i0) controller;
                vc.s.k(i0Var);
                return i0Var;
            case 9:
                return nga.c.t(dVar.f316750a, eVar.f316769c.c(), (wn.a) dVar.f316758n.get());
            case 10:
                return v7.z(eVar.f316779s, "provider");
            case 11:
                os2.g factory = eVar.f316779s.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 12:
                xdk.b extension = (xdk.b) dVar.f316761r.get();
                ydk.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 13:
                xdk.a aVar2 = new xdk.a();
                z71.a aVarF = ((c21.b) eVar.f316780t).f();
                vc.s.j(aVarF);
                return new xdk.g(aVar2, aVarF, eVar.f.a());
            case 14:
                return o5k.b.a((n5k.b) dVar.A.get());
            case 15:
                n5k.a aVar3 = (n5k.a) dVar.f316763t.get();
                p5k.h hVar = (p5k.h) dVar.f316766y.get();
                ffk.t tVarF = eVar.A.f();
                vc.s.j(tVarF);
                ang.f fVarE = eVar.f316773l.e();
                wif.a aVarA = eVar.z.a();
                gte.a aVarB = eVar.f316776p.b();
                vc.s.j(aVarB);
                j60.a aVar4 = (j60.a) dVar.k.get();
                qpk.b bVar3 = new qpk.b();
                v2k.c cVarA = eVar.v.a();
                mre.c cVarB = eVar.B.b();
                vc.s.j(cVarB);
                z0h.a aVarB2 = ((u8h.b) eVar.f316782x).b();
                vc.s.j(aVarB2);
                l80.e eVarH = dVar.f316752c.f316768b.h();
                vc.s.j(eVarH);
                return new n5k.p(aVar3, hVar, tVarF, fVarE, aVarA, aVarB, aVar4, bVar3, cVarA, cVarB, aVarB2, new p5k.a(eVarH), eVar.C.b(), (n5k.q) dVar.z.get());
            case 16:
                return new ztf.f(bVar.f316724a, (luf.a) bVar.o.get(), (guf.b) bVar.f316731m.get());
            case 17:
                p5k.b bVar4 = (p5k.b) dVar.u.get();
                p5k.w wVar = (p5k.w) dVar.f316764w.get();
                tga.k kVarB = eVar.f316781w.b();
                m5k.b bVarD = dVar.d();
                ytf.e eVar2 = dVar.f316752c;
                return new p5k.k(bVar4, wVar, kVarB, bVarD, new jt0.b(eVar2.f316781w.b(), eVar2.z.a(), dVar.d()), dVar.l(), new RateExplanationDialogMapper());
            case 18:
                return new p5k.d();
            case 19:
                p5k.y yVar = (p5k.y) dVar.v.get();
                k5i.c cVarA2 = eVar.u.a();
                p5k.f fVarL = dVar.l();
                ytf.e eVar3 = dVar.f316752c;
                j9l.a aVar5 = new j9l.a();
                gte.a aVarB3 = eVar3.f316776p.b();
                vc.s.j(aVarB3);
                return new p5k.x(yVar, cVarA2, fVarL, new kgm.i(aVar5, aVarB3), new p5k.p());
            case 20:
                return new p5k.y();
            case 21:
                aah.i iVarD = ((u8h.b) eVar.f316782x).d();
                vc.s.j(iVarD);
                return o5k.i.B(iVarD);
            case 22:
                return new n5k.r(new RateExplanationDialogMapper());
            case 23:
                return nga.c.a((n5k.q) dVar.z.get());
            case 24:
                return t5k.b.a((s5k.a) dVar.E.get());
            case 25:
                return new s5k.d((r5k.d) dVar.D.get(), (j60.a) dVar.k.get(), new r5k.a(), new r5k.b());
            case 26:
                return new r5k.e();
            case 27:
                wn.a aVar6 = (wn.a) dVar.f316758n.get();
                n57.a.c(aVar6);
                return aVar6;
            case 28:
                ytf.e eVar4 = dVar.f316752c;
                ytf.e eVar5 = dVar.f316752c;
                fk3.a aVarA2 = eVar4.f316774m.a();
                vc.s.j(aVarA2);
                gte.a aVarB4 = eVar4.f316776p.b();
                vc.s.j(aVarB4);
                buf.t tVar = new buf.t(aVarA2, aVarB4);
                ManualTransferContract$InputData manualTransferContract$InputData = dVar.f316751b;
                guf.b bVar5 = (guf.b) dVar.d.f316731m.get();
                r10.q qVarE = dVar.e();
                vv9.b bVarB = ((s6k.b) eVar5.d).b();
                vc.s.j(bVarB);
                vo9.a aVarB5 = ((ut9.a) eVar5.D).b();
                vc.s.j(aVarB5);
                com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a aVar7 = new com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a(manualTransferContract$InputData, bVar5, qVarE, bVarB, aVarB5);
                r10.q qVarE2 = dVar.e();
                luf.a aVar8 = (luf.a) bVar.o.get();
                duf.b bVar6 = new duf.b();
                zof.f fVarD = eVar.i.d();
                vc.s.j(fVarD);
                kuf.d dVar2 = (kuf.d) bVar.f316728h.get();
                kuf.e eVar6 = (kuf.e) bVar.f316729j.get();
                xdk.b bVar7 = (xdk.b) dVar.f316761r.get();
                n5k.b bVar8 = (n5k.b) dVar.A.get();
                j60.a aVar9 = (j60.a) dVar.k.get();
                n60.a aVar10 = (n60.a) dVar.f316754h.get();
                rr9.d dVarB = eVar.f316771h.b();
                vc.s.j(dVarB);
                return new a1(tVar, aVar7, qVarE2, aVar8, bVar6, fVarD, dVar2, eVar6, bVar7, bVar8, aVar9, aVar10, dVarB, new buf.n(eVar5.f316773l.e(), 0), new auf.a(), (s5k.a) dVar.E.get(), (jki.p) dVar.K.get(), dVar.f316751b);
            case 29:
                e4m.e eVar7 = dVar.I;
                ytf.e eVar8 = dVar.f316752c;
                yof.d dVar3 = (yof.d) eVar7.get();
                vo9.a aVarB6 = ((ut9.a) eVar.D).b();
                vc.s.j(aVarB6);
                u80.o oVar = new u80.o();
                w80.b bVar9 = (w80.b) dVar.J.get();
                nq9.c cVarC = eVar8.F.c();
                vc.s.j(cVarC);
                d1 d1Var = new d1(cVarC);
                gte.a aVarB7 = eVar8.i.f218200a.b();
                vc.s.j(aVarB7);
                nd.n factory2 = new nd.n(aVarB7);
                ldd.b focusRequesterDelegate = (ldd.b) dVar.H.get();
                cuf.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "delegate");
                Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                ppf.c cVar = new ppf.c(focusRequesterDelegate);
                kgm.i iVar = new kgm.i(new jid.z(cVar, aVarB7), cVar);
                euf.b bVar10 = new euf.b(b3j.p.f());
                buf.a aVar11 = new buf.a();
                gte.a aVarB8 = eVar.f316776p.b();
                vc.s.j(aVarB8);
                return new buf.r(dVar3, aVarB6, oVar, bVar9, d1Var, iVar, bVar10, aVar11, aVarB8);
            case 30:
                ppf.a factory3 = eVar.i.b();
                vc.s.j(factory3);
                ldd.b delegate = (ldd.b) dVar.H.get();
                cuf.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            case 31:
                kdd.b bVar11 = eVar.E;
                ldd.a factory4 = new ldd.a();
                cuf.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return new ldd.b();
            case 32:
                qd0.b languageProvider = eVar.f316768b.n();
                vc.s.j(languageProvider);
                cuf.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        z0g.g gVar = (z0g.g) this.e;
        z0g.b bVar = (z0g.b) this.f299260b;
        ore.b bVar2 = bVar.f318320x;
        p7c.r rVar = bVar.f318319w;
        int i = this.f299261c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) gVar.e.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) gVar.f318366c.get(), (rp0.m) gVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                Object extension = (a6c.f) gVar.f318367g.get();
                y1g.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 4:
                o8c.a factory = rVar.a();
                vc.s.j(factory);
                y1g.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 5:
                TravelExperiencesCheckoutScreenContract$InputData travelExperiencesCheckoutScreenContract$InputData = gVar.f318364a;
                z0g.b bVar3 = gVar.f318365b;
                b1g.c cVar = (b1g.c) bVar3.Y.get();
                z1g.b bVar4 = new z1g.b();
                z1g.a exchangedAmountMapper = new z1g.a();
                Intrinsics.checkNotNullParameter(exchangedAmountMapper, "exchangedAmountMapper");
                z1g.c cVar2 = new z1g.c();
                x1g.g0 g0Var = new x1g.g0(new dyf.h());
                z1g.d dVar = (z1g.d) gVar.f318369j.get();
                dec.r rVar2 = new dec.r();
                dec.g gVar2 = new dec.g();
                dec.a aVar = new dec.a();
                l80.e eVarH = bVar3.f318306g.h();
                vc.s.j(eVarH);
                x1g.f0 f0Var = new x1g.f0(travelExperiencesCheckoutScreenContract$InputData, cVar, bVar4, cVar2, g0Var, dVar, new dec.q(rVar2, gVar2, aVar, eVarH), new z1g.a());
                TravelExperiencesCheckoutScreenContract$InputData travelExperiencesCheckoutScreenContract$InputData2 = gVar.f318364a;
                h1g.h hVar = (h1g.h) ((z0g.f) this.d).d.get();
                j60.a aVar2 = (j60.a) gVar.e.get();
                c3g.a aVar3 = new c3g.a();
                c1g.h hVar2 = (c1g.h) bVar.R.get();
                pre.c cVarA = bVar2.a();
                vc.s.j(cVarA);
                c1g.g gVar3 = (c1g.g) bVar.f318310k0.get();
                mre.c cVarB = bVar2.b();
                vc.s.j(cVarB);
                hyf.a aVarA = bVar.f318307h.a();
                vc.s.j(aVarA);
                eub.i iVarE = bVar.i.e();
                vc.s.j(iVarE);
                jgk.v vVarD = bVar.f318321y.d();
                vc.s.j(vVarD);
                ffk.t tVarF = bVar.z.f();
                vc.s.j(tVarF);
                q7c.g gVarE = rVar.e();
                q7c.m mVarD = rVar.d();
                vc.s.j(mVarD);
                l61.a aVarB = bVar.f318318t.b();
                vc.s.j(aVarB);
                return new c0(f0Var, travelExperiencesCheckoutScreenContract$InputData2, hVar, aVar2, aVar3, hVar2, cVarA, gVar3, cVarB, aVarA, iVarE, vVarD, tVarF, gVarE, mVarD, aVarB, new k0c.a(), (a6c.f) gVar.f318367g.get());
            case 6:
                zzl.b bVar5 = (zzl.b) gVar.i.get();
                z80.b bVarS = bVar.f318306g.s();
                vc.s.j(bVarS);
                return new z1g.f(bVarS, bVar5);
            case 7:
                y1g.b.Companion.getClass();
                return new zzl.c();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        z0g.f fVar = (z0g.f) this.d;
        z0g.b bVar = (z0g.b) this.f299260b;
        z0g.k kVar = (z0g.k) this.e;
        int i = this.f299261c;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) kVar.d.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) kVar.f318392b.get(), (rp0.m) kVar.f318393c.get());
            case 2:
                return new rp0.m();
            case 3:
                jki.p pVar = (jki.p) kVar.f318394g.get();
                TravelExperiencesOptionsV2ScreenContract$InputData travelExperiencesOptionsV2ScreenContract$InputData = kVar.f318391a;
                c1g.c0 c0Var = (c1g.c0) bVar.m0.get();
                c1g.y yVar = (c1g.y) bVar.L.get();
                j60.a aVar = (j60.a) kVar.d.get();
                u2g.c cVar = (u2g.c) kVar.f318395h.get();
                u2g.a aVar2 = (u2g.a) kVar.i.get();
                hyf.a aVarA = bVar.f318307h.a();
                vc.s.j(aVarA);
                return new s2g.w(pVar, travelExperiencesOptionsV2ScreenContract$InputData, c0Var, yVar, aVar, cVar, aVar2, aVarA, (h1g.h) fVar.d.get());
            case 4:
                b1g.c cVar2 = (b1g.c) bVar.Y.get();
                s2g.a aVar3 = (s2g.a) kVar.f.get();
                l80.e eVarH = bVar.f318306g.h();
                vc.s.j(eVarH);
                return new s2g.z(cVar2, aVar3, eVarH, (h1g.h) fVar.d.get());
            case 5:
                return new s2g.c();
            case 6:
                return new u2g.d((b1g.c) bVar.Y.get());
            case 7:
                return new u2g.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        z0g.b bVar = (z0g.b) this.f299260b;
        z0g.m mVar = (z0g.m) this.e;
        int i = this.f299261c;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) mVar.e.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) mVar.f318408c.get(), (rp0.m) mVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                jki.p pVar = (jki.p) mVar.f318410h.get();
                TravelExperiencesPickupDetailsScreenContract$InputData travelExperiencesPickupDetailsScreenContract$InputData = mVar.f318406a;
                d3g.g0 g0Var = (d3g.g0) mVar.i.get();
                j60.a aVar = (j60.a) mVar.e.get();
                e3g.a aVar2 = e3g.a.ENUM;
                e3g.d mapper = new e3g.d();
                y2g.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                e3g.a aVar3 = e3g.a.WEIGHT;
                z0g.b bVar2 = mVar.f318407b;
                e3g.i mapper2 = new e3g.i(bVar2.a(), y2g.c.a());
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                e3g.a aVar4 = e3g.a.HEIGHT;
                e3g.e mapper3 = new e3g.e(bVar2.a(), y2g.c.a());
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                e3g.a aVar5 = e3g.a.TIME;
                e3g.h mapper4 = new e3g.h((b1g.c) bVar2.Y.get());
                Intrinsics.checkNotNullParameter(mapper4, "mapper");
                return new x2g.o(pVar, travelExperiencesPickupDetailsScreenContract$InputData, g0Var, aVar, ImmutableMap.of(aVar2, (e3g.h) mapper, aVar3, (e3g.h) mapper2, aVar4, (e3g.h) mapper3, aVar5, mapper4), (b1g.c) bVar.Y.get(), (h1g.h) ((z0g.f) this.d).d.get());
            case 4:
                return new x2g.p((g3g.b) mVar.f318409g.get());
            case 5:
                return new g3g.c(bVar.u.g());
            case 6:
                return new d3g.h0();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        z0g.o oVar = (z0g.o) this.e;
        TravelExperiencesPriceBreakdownScreenContract$InputData travelExperiencesPriceBreakdownScreenContract$InputData = oVar.f318421a;
        int i = this.f299261c;
        if (i != 0) {
            if (i == 1) {
                return new z2g.g(travelExperiencesPriceBreakdownScreenContract$InputData, new c3g.a(), new c3g.b(), new kdc.d());
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) oVar.f318422b.get();
        hyf.a aVarA = ((z0g.b) this.f299260b).f318307h.a();
        vc.s.j(aVarA);
        return new com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.a(nVar, travelExperiencesPriceBreakdownScreenContract$InputData, aVarA, (h1g.h) ((z0g.f) this.d).d.get());
    }

    private final Object i() {
        z0g.r rVar = (z0g.r) this.e;
        int i = this.f299261c;
        if (i == 0) {
            return new s3g.h((jki.p) rVar.f318448c.get(), rVar.f318446a, (h1g.h) ((z0g.f) this.d).d.get(), (d3g.g0) rVar.d.get());
        }
        if (i == 1) {
            return new s3g.i((g3g.b) rVar.f318447b.get(), new g3g.d());
        }
        if (i == 2) {
            return new g3g.c(((z0g.b) this.f299260b).u.g());
        }
        if (i == 3) {
            return new d3g.h0();
        }
        throw new AssertionError(i);
    }

    private final Object j() {
        z0g.b bVar = (z0g.b) this.f299260b;
        z0g.s sVar = (z0g.s) this.e;
        int i = this.f299261c;
        if (i == 0) {
            return kxa.j.l((j60.a) sVar.e.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) sVar.f318451c.get(), (rp0.m) sVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new d3g.f0(bVar.u.g(), new g3g.d());
            }
            throw new AssertionError(i);
        }
        jki.p pVar = (jki.p) sVar.f318452g.get();
        TravelExperiencesQuestionsScreenContract$InputData travelExperiencesQuestionsScreenContract$InputData = sVar.f318449a;
        b1g.c cVar = (b1g.c) bVar.Y.get();
        j60.a aVar = (j60.a) sVar.e.get();
        e3g.a aVar2 = e3g.a.ENUM;
        e3g.d mapper = new e3g.d();
        f3g.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e3g.a aVar3 = e3g.a.WEIGHT;
        z0g.b bVar2 = sVar.f318450b;
        e3g.i mapper2 = new e3g.i(bVar2.a(), f3g.c.a());
        Intrinsics.checkNotNullParameter(mapper2, "mapper");
        e3g.a aVar4 = e3g.a.HEIGHT;
        e3g.e mapper3 = new e3g.e(bVar2.a(), f3g.c.a());
        Intrinsics.checkNotNullParameter(mapper3, "mapper");
        e3g.a aVar5 = e3g.a.TIME;
        e3g.h mapper4 = new e3g.h((b1g.c) bVar2.Y.get());
        Intrinsics.checkNotNullParameter(mapper4, "mapper");
        return new com.revolut.feature.travel.experiences.impl.ui.screen.questions.b(pVar, travelExperiencesQuestionsScreenContract$InputData, cVar, aVar, ImmutableMap.of(aVar2, (e3g.h) mapper, aVar3, (e3g.h) mapper2, aVar4, (e3g.h) mapper3, aVar5, mapper4), new e3g.f(), new e3g.g(), (h1g.h) ((z0g.f) this.d).d.get());
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f299259a) {
            case 0:
                h hVar = (h) this.e;
                int i = this.f299261c;
                if (i == 0) {
                    return kxa.j.l((j60.a) hVar.f299264c.get());
                }
                if (i == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) hVar.f299262a.get(), (rp0.m) hVar.f299263b.get());
                }
                if (i == 2) {
                    return new rp0.m();
                }
                if (i == 3) {
                    return new drg.l((jki.p) hVar.e.get(), (ypg.d) ((l) this.f299260b).T.get(), (j60.a) hVar.f299264c.get(), (drg.a) hVar.f.get(), (erg.c) ((b) this.d).f299241c.get());
                }
                if (i == 4) {
                    return new drg.m();
                }
                if (i == 5) {
                    return new drg.h();
                }
                throw new AssertionError(i);
            case 1:
                n nVar = (n) this.d;
                l lVar = (l) this.f299260b;
                o oVar = (o) this.e;
                int i2 = this.f299261c;
                if (i2 == 0) {
                    return xb1.a.p((xbb.d) nVar.e.get());
                }
                if (i2 == 1) {
                    return new ccb.c0((jki.p) oVar.f.get(), oVar.f299301b, (ybb.d) nVar.f.get(), (ccb.j) oVar.d.get(), (w80.b) oVar.e.get(), (acb.j) oVar.f299303g.get(), (zbb.a) oVar.f299304h.get());
                }
                if (i2 == 2) {
                    return new ccb.e0(new u80.o(), (w80.b) oVar.e.get());
                }
                if (i2 == 3) {
                    qd0.b bVarN = lVar.f299289s.n();
                    vc.s.j(bVarN);
                    return xb1.a.d(bVarN);
                }
                if (i2 == 4) {
                    return xb1.a.q(new l4i.a(), lVar.f299291w.a());
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                fk3.a aVarA = lVar.z.a();
                vc.s.j(aVarA);
                return xb1.a.o(aVarA);
            case 2:
                i iVar = (i) this.d;
                l lVar2 = (l) this.f299260b;
                o oVar2 = (o) this.e;
                int i3 = this.f299261c;
                if (i3 == 0) {
                    return xb1.a.p((xbb.d) iVar.f.get());
                }
                if (i3 == 1) {
                    return new ccb.c0((jki.p) oVar2.f.get(), oVar2.f299301b, (ybb.d) iVar.f299270h.get(), (ccb.j) oVar2.d.get(), (w80.b) oVar2.e.get(), (acb.j) oVar2.f299303g.get(), (zbb.a) oVar2.f299304h.get());
                }
                if (i3 == 2) {
                    return new ccb.e0(new u80.o(), (w80.b) oVar2.e.get());
                }
                if (i3 == 3) {
                    qd0.b bVarN2 = lVar2.f299289s.n();
                    vc.s.j(bVarN2);
                    return xb1.a.d(bVarN2);
                }
                if (i3 == 4) {
                    return xb1.a.q(new l4i.a(), lVar2.f299291w.a());
                }
                if (i3 != 5) {
                    throw new AssertionError(i3);
                }
                fk3.a aVarA2 = lVar2.z.a();
                vc.s.j(aVarA2);
                return xb1.a.o(aVarA2);
            case 3:
                m mVar = (m) this.d;
                l lVar3 = (l) this.f299260b;
                o oVar3 = (o) this.e;
                int i5 = this.f299261c;
                if (i5 == 0) {
                    return xb1.a.p((xbb.d) mVar.e.get());
                }
                if (i5 == 1) {
                    return new ccb.c0((jki.p) oVar3.f.get(), oVar3.f299301b, (ybb.d) mVar.f.get(), (ccb.j) oVar3.d.get(), (w80.b) oVar3.e.get(), (acb.j) oVar3.f299303g.get(), (zbb.a) oVar3.f299304h.get());
                }
                if (i5 == 2) {
                    return new ccb.e0(new u80.o(), (w80.b) oVar3.e.get());
                }
                if (i5 == 3) {
                    qd0.b bVarN3 = lVar3.f299289s.n();
                    vc.s.j(bVarN3);
                    return xb1.a.d(bVarN3);
                }
                if (i5 == 4) {
                    return xb1.a.q(new l4i.a(), lVar3.f299291w.a());
                }
                if (i5 != 5) {
                    throw new AssertionError(i5);
                }
                fk3.a aVarA3 = lVar3.z.a();
                vc.s.j(aVarA3);
                return xb1.a.o(aVarA3);
            case 4:
                x13.p pVar = (x13.p) this.f299260b;
                jk3.c cVar = pVar.f302171y;
                kj1.a aVar = pVar.A;
                x13.k kVar = (x13.k) this.e;
                int i6 = this.f299261c;
                switch (i6) {
                    case 0:
                        return kxa.j.k((j60.a) kVar.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) kVar.d.get(), (rp0.m) kVar.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        n60.b bVar = (n60.b) kVar.f302137h.get();
                        o5k.i.m(bVar);
                        return bVar;
                    case 4:
                        return o5k.i.r((com.revolut.kompot.navigable.a) kVar.d.get());
                    case 5:
                        cli.n nVar2 = (cli.n) kVar.f302138j.get();
                        AddressFormScreenContract$InputData addressFormScreenContract$InputData = kVar.f302133a;
                        mk3.a aVar2 = (mk3.a) cVar.f175062j.get();
                        vc.s.j(aVar2);
                        rh1.b bVarA = aVar.a();
                        vc.s.j(bVarA);
                        zi1.d dVarA = pVar.f302163n.a();
                        vc.s.j(dVarA);
                        vh1.d dVar = (vh1.d) aVar.f184283g.get();
                        vc.s.j(dVar);
                        fk3.a aVarA4 = cVar.a();
                        vc.s.j(aVarA4);
                        n8b.a aVarA5 = pVar.f302170x.a();
                        vc.s.j(aVarA5);
                        return new com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b(nVar2, addressFormScreenContract$InputData, aVar2, bVarA, dVarA, dVar, aVarA4, aVarA5, new u23.a(), (nj1.d) ((x13.q) this.d).v.get(), (j60.a) kVar.f.get(), (n60.b) kVar.f302137h.get(), new o23.t(), pVar.f302167s.e(), kVar.k);
                    case 6:
                        rh1.b bVarA2 = aVar.a();
                        vc.s.j(bVarA2);
                        return new o23.c0(bVarA2, new o23.t());
                    case 7:
                        return new o23.g0();
                    default:
                        throw new AssertionError(i6);
                }
            case 5:
                x13.q qVar = (x13.q) this.d;
                x13.p pVar2 = (x13.p) this.f299260b;
                jk3.c cVar2 = pVar2.f302171y;
                x13.l lVar4 = (x13.l) this.e;
                int i21 = this.f299261c;
                switch (i21) {
                    case 0:
                        return kxa.j.k((j60.a) lVar4.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) lVar4.d.get(), (rp0.m) lVar4.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        n60.a aVar3 = (n60.a) lVar4.f302144h.get();
                        o5k.i.l(aVar3);
                        return aVar3;
                    case 4:
                        return o5k.i.q((com.revolut.kompot.navigable.a) lVar4.d.get());
                    case 5:
                        cli.n nVar3 = (cli.n) lVar4.f302145j.get();
                        CardDeliveryAddressVerificationScreenContract$InputData cardDeliveryAddressVerificationScreenContract$InputData = lVar4.f302140a;
                        q13.d dVar2 = (q13.d) qVar.f302181p.get();
                        w39.b bVarA3 = pVar2.f302169w.a();
                        vc.s.j(bVarA3);
                        l93.e eVar = (l93.e) pVar2.o.I.get();
                        vc.s.j(eVar);
                        zi1.d dVarA2 = pVar2.f302163n.a();
                        vc.s.j(dVarA2);
                        u23.a aVar4 = new u23.a();
                        j60.a aVar5 = (j60.a) lVar4.f.get();
                        nj1.d dVar3 = (nj1.d) qVar.v.get();
                        mk3.e eVar2 = (mk3.e) cVar2.k.get();
                        vc.s.j(eVar2);
                        fk3.a aVarA6 = cVar2.a();
                        vc.s.j(aVarA6);
                        n60.a aVar6 = (n60.a) lVar4.f302144h.get();
                        ang.f fVarE = pVar2.f302167s.e();
                        gte.a aVarB = pVar2.f302155a.b();
                        vc.s.j(aVarB);
                        return new com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b(nVar3, cardDeliveryAddressVerificationScreenContract$InputData, dVar2, bVarA3, eVar, dVarA2, aVar4, aVar5, dVar3, eVar2, aVarA6, aVar6, fVarE, aVarB);
                    case 6:
                        qd0.b bVarN4 = pVar2.f302157c.n();
                        vc.s.j(bVarN4);
                        return new q23.v(bVarN4);
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                x13.x xVar = (x13.x) this.e;
                x13.p pVar3 = (x13.p) this.f299260b;
                int i22 = this.f299261c;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new AssertionError(i22);
                    }
                    qd0.b bVarN5 = pVar3.f302157c.n();
                    vc.s.j(bVarN5);
                    gte.a aVarB2 = pVar3.f302155a.b();
                    vc.s.j(aVarB2);
                    return new f33.r(bVarN5, aVarB2);
                }
                cli.n nVar4 = (cli.n) xVar.d.get();
                DeliveryMethodsScreenContract$InputData deliveryMethodsScreenContract$InputData = xVar.f302212a;
                ffk.t tVarF = pVar3.f302160j.f();
                vc.s.j(tVarF);
                z43.a aVarA7 = ((x13.q) this.d).f302174c.d.a();
                vc.s.j(aVarA7);
                c23.b bVar2 = new c23.b(aVarA7);
                q89.e eVarA = pVar3.k.a();
                vc.s.j(eVarA);
                sh3.a aVarA8 = pVar3.z.a();
                vc.s.j(aVarA8);
                return new f33.h(nVar4, deliveryMethodsScreenContract$InputData, tVarF, bVar2, eVarA, aVarA8);
            case 7:
                ka1.l lVar5 = ((xb1.p) this.f299260b).f303956b;
                xb1.g gVar = (xb1.g) this.e;
                int i32 = this.f299261c;
                if (i32 == 0) {
                    xc1.d extension = (xc1.d) gVar.f303926b.get();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    xc1.d dVar4 = extension;
                    vc.s.k(dVar4);
                    return dVar4;
                }
                if (i32 == 1) {
                    xc1.a dialogDisplayerProvider = (xc1.a) ((xb1.h) this.d).d.get();
                    Intrinsics.checkNotNullParameter(dialogDisplayerProvider, "dialogDisplayerProvider");
                    return new xc1.d(dialogDisplayerProvider);
                }
                if (i32 != 2) {
                    if (i32 == 3) {
                        return new jc1.i();
                    }
                    throw new AssertionError(i32);
                }
                jki.p pVar4 = (jki.p) gVar.d.get();
                CardReaderConnectingScreenContract$InputData cardReaderConnectingScreenContract$InputData = gVar.f303925a;
                da1.d dVar5 = (da1.d) lVar5.f182384w.get();
                vc.s.j(dVar5);
                ma1.u uVar = (ma1.u) lVar5.C.get();
                vc.s.j(uVar);
                return new jc1.h(pVar4, cardReaderConnectingScreenContract$InputData, dVar5, uVar, (xc1.d) gVar.f303926b.get());
            case 8:
                xb1.n nVar5 = (xb1.n) this.d;
                xb1.p pVar5 = (xb1.p) this.f299260b;
                ka1.l lVar6 = pVar5.f303956b;
                bfc.d dVar6 = pVar5.f303955a;
                l70.e eVar3 = pVar5.f;
                xb1.j jVar = (xb1.j) this.e;
                int i33 = this.f299261c;
                switch (i33) {
                    case 0:
                        xc1.d extension2 = (xc1.d) jVar.f303934c.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        xc1.d dVar7 = extension2;
                        vc.s.k(dVar7);
                        return dVar7;
                    case 1:
                        xc1.a dialogDisplayerProvider2 = (xc1.a) nVar5.f.get();
                        Intrinsics.checkNotNullParameter(dialogDisplayerProvider2, "dialogDisplayerProvider");
                        return new xc1.d(dialogDisplayerProvider2);
                    case 2:
                        n60.a aVar7 = (n60.a) jVar.f.get();
                        o5k.i.k(aVar7);
                        return aVar7;
                    case 3:
                        return o5k.i.p((com.revolut.kompot.navigable.a) jVar.e.get());
                    case 4:
                        Object extension3 = (ac1.a) jVar.f303936h.get();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar6 = (yji.n) extension3;
                        vc.s.k(nVar6);
                        return nVar6;
                    case 5:
                        ma1.d batteryInteractor = (ma1.d) lVar6.R.get();
                        vc.s.j(batteryInteractor);
                        g1 shotDialogDisplayer = (g1) nVar5.e.get();
                        xc1.d stickyActionExtension = (xc1.d) jVar.f303934c.get();
                        Intrinsics.checkNotNullParameter(batteryInteractor, "batteryInteractor");
                        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                        Intrinsics.checkNotNullParameter(stickyActionExtension, "stickyActionExtension");
                        return new ac1.e(batteryInteractor, shotDialogDisplayer, stickyActionExtension);
                    case 6:
                        jki.p pVar6 = (jki.p) jVar.f303937j.get();
                        da1.e eVar4 = (da1.e) lVar6.P.get();
                        vc.s.j(eVar4);
                        da1.d dVar8 = (da1.d) lVar6.f182384w.get();
                        vc.s.j(dVar8);
                        f01.a aVar8 = (f01.a) jVar.k.get();
                        dfc.a aVar9 = (dfc.a) dVar6.f14954m.get();
                        vc.s.j(aVar9);
                        cfc.b bVarA4 = dVar6.a();
                        vc.s.j(bVarA4);
                        ac1.a aVar10 = (ac1.a) jVar.f303936h.get();
                        xc1.d dVar9 = (xc1.d) jVar.f303934c.get();
                        n60.a aVar11 = (n60.a) jVar.f.get();
                        g1 g1Var = (g1) nVar5.e.get();
                        efc.b bVar3 = (efc.b) jVar.f303933b.f303955a.f14957q.get();
                        vc.s.j(bVar3);
                        pc1.b bVar4 = new pc1.b(bVar3);
                        qd0.b bVarN6 = eVar3.n();
                        vc.s.j(bVarN6);
                        return new nc1.m(pVar6, eVar4, dVar8, aVar8, aVar9, bVarA4, aVar10, dVar9, aVar11, g1Var, bVar4, bVarN6);
                    case 7:
                        qd0.b bVarN7 = eVar3.n();
                        vc.s.j(bVarN7);
                        w80.b bVarJ = eVar3.j();
                        vc.s.j(bVarJ);
                        cfc.a aVar12 = (cfc.a) dVar6.f14955n.get();
                        vc.s.j(aVar12);
                        return new nc1.o(bVarN7, bVarJ, aVar12);
                    case 8:
                        BaseScreen screen = jVar.f303932a;
                        oc1.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return new f01.c(screen.m2());
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                ka1.l lVar7 = ((xb1.p) this.f299260b).f303956b;
                xb1.q qVar2 = (xb1.q) this.e;
                int i43 = this.f299261c;
                if (i43 == 0) {
                    xc1.d extension4 = (xc1.d) qVar2.f303960b.get();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    xc1.d dVar10 = extension4;
                    vc.s.k(dVar10);
                    return dVar10;
                }
                if (i43 == 1) {
                    xc1.a dialogDisplayerProvider3 = (xc1.a) ((xb1.h) this.d).d.get();
                    Intrinsics.checkNotNullParameter(dialogDisplayerProvider3, "dialogDisplayerProvider");
                    return new xc1.d(dialogDisplayerProvider3);
                }
                if (i43 != 2) {
                    if (i43 == 3) {
                        return new uc1.f();
                    }
                    throw new AssertionError(i43);
                }
                jki.p pVar7 = (jki.p) qVar2.d.get();
                CardReaderUpdatingScreenContract$InputData cardReaderUpdatingScreenContract$InputData = qVar2.f303959a;
                ma1.b0 b0Var = (ma1.b0) lVar7.K.get();
                vc.s.j(b0Var);
                ma1.d dVar11 = (ma1.d) lVar7.R.get();
                vc.s.j(dVar11);
                return new uc1.e(pVar7, cardReaderUpdatingScreenContract$InputData, b0Var, dVar11, (xc1.d) qVar2.f303960b.get());
            case 10:
                xf6.m mVar2 = (xf6.m) this.d;
                xf6.n nVar7 = (xf6.n) this.e;
                xf6.t tVar = (xf6.t) this.f299260b;
                int i59 = this.f299261c;
                if (i59 == 0) {
                    return new com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b((cli.n) nVar7.f304954b.get(), nVar7.f304953a, new os2.g((of6.e) tVar.E0.get()), (qg6.f) tVar.F0.get(), (wj6.m) mVar2.d.get(), (hk6.k) mVar2.e.get(), (oj6.g) mVar2.f.get());
                }
                if (i59 == 1) {
                    return new com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.c((ne6.b) tVar.D0.get(), (je6.h) tVar.f305064e0.get(), nVar7.f304953a);
                }
                throw new AssertionError(i59);
            case 11:
                w2 w2Var = (w2) this.f299260b;
                s2 s2Var = (s2) this.e;
                int i66 = this.f299261c;
                switch (i66) {
                    case 0:
                        mkd.g view = s2Var.f305051a;
                        rkd.m factory = w2Var.f305142l.a();
                        vc.s.j(factory);
                        gj6.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(view);
                    case 1:
                        cli.n nVar8 = (cli.n) s2Var.e.get();
                        OpenBankingAuthPaymentScreenContract$InputData openBankingAuthPaymentScreenContract$InputData = s2Var.f305052b;
                        pi6.u uVar2 = (pi6.u) ((r2) this.d).f.get();
                        h6i.o oVarH = w2Var.f305143m.h();
                        w2 w2Var2 = s2Var.f305053c;
                        ej6.f fVar = new ej6.f(w2Var2.f305144n.a(), w2Var2.f305143m.h());
                        o7.b bVarA5 = w2Var.o.a();
                        j4i.a aVar13 = w2Var.k;
                        l4i.a aVar14 = new l4i.a();
                        t1 t1VarC = aVar13.c();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                        builderBuilderWithExpectedSize.put(PaymentConsentType.DOMESTIC_PAYMENT, s2Var.f.get());
                        builderBuilderWithExpectedSize.put(PaymentConsentType.DOMESTIC_SCHEDULED_PAYMENT, s2Var.f305054g.get());
                        builderBuilderWithExpectedSize.put(PaymentConsentType.DOMESTIC_RECURRING_ORDER, s2Var.f305055h.get());
                        builderBuilderWithExpectedSize.put(PaymentConsentType.INTERNATIONAL_PAYMENT, s2Var.i.get());
                        builderBuilderWithExpectedSize.put(PaymentConsentType.INTERNATIONAL_SCHEDULED_PAYMENT, s2Var.f305056j.get());
                        builderBuilderWithExpectedSize.put(PaymentConsentType.INTERNATIONAL_RECURRING_ORDER, s2Var.k.get());
                        a7j.g gVar2 = new a7j.g(builderBuilderWithExpectedSize.build(), 1);
                        oe6.m mVarF = ((xf6.t) w2Var.f305139g).f();
                        vc.s.j(mVarF);
                        ng6.a aVar15 = (ng6.a) w2Var.T.get();
                        com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.a aVar16 = new com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.a();
                        mkd.d dVar12 = (mkd.d) s2Var.d.get();
                        gte.a aVarB3 = w2Var.f305145p.b();
                        vc.s.j(aVarB3);
                        sh5.d dVarF = w2Var.f305147r.f();
                        vc.s.j(dVarF);
                        return new com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d(nVar8, openBankingAuthPaymentScreenContract$InputData, uVar2, oVarH, fVar, bVarA5, aVar14, t1VarC, gVar2, mVarF, aVar15, aVar16, dVar12, aVarB3, dVarF);
                    case 2:
                        return new ej6.h0(s2Var.f305052b);
                    case 3:
                        return new si6.a(s2Var.b(), 5);
                    case 4:
                        return new si6.a(s2Var.b(), 4);
                    case 5:
                        return new si6.a(s2Var.b(), 3);
                    case 6:
                        return new si6.a(s2Var.b(), 2);
                    case 7:
                        return new si6.a(s2Var.b(), 1);
                    case 8:
                        return new si6.a(s2Var.b(), 0);
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                u2 u2Var = (u2) this.d;
                w2 w2Var3 = (w2) this.f299260b;
                t2 t2Var = (t2) this.e;
                w2 w2Var4 = t2Var.f305096b;
                int i74 = this.f299261c;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new AssertionError(i74);
                    }
                    ne6.b bVar5 = (ne6.b) ((xf6.t) w2Var4.f305139g).D0.get();
                    vc.s.j(bVar5);
                    lk6.b bVar6 = new lk6.b(bVar5);
                    je6.h hVarC = ((xf6.t) w2Var3.f305139g).c();
                    vc.s.j(hVarC);
                    return new lk6.f0(bVar6, hVarC);
                }
                cli.n nVar9 = (cli.n) t2Var.f305097c.get();
                lk6.j jVar2 = t2Var.f305095a;
                com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a aVar17 = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a) w2Var3.Y.get();
                sf0.h hVarB = w2Var3.i.b();
                vc.s.j(hVarB);
                je0.d dVarD = w2Var4.f305136b.d();
                vc.s.j(dVarD);
                return new lk6.b0(nVar9, jVar2, aVar17, hVarB, new ogm.i(dVarD), (wj6.m) u2Var.f.get(), (hk6.k) u2Var.f305112g.get());
            case 13:
                xj2.n nVar10 = (xj2.n) this.f299260b;
                int i92 = this.f299261c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new uk2.y(new qd0.c());
                    }
                    throw new AssertionError(i92);
                }
                cli.n nVar11 = (cli.n) ((xj2.j) this.e).f306467a.get();
                tk2.p pVar8 = (tk2.p) ((xj2.o) this.d).d.get();
                bk2.j jVar3 = new bk2.j((AtmsService) nVar10.f306488r.get(), (bk2.e) nVar10.f306489s.get(), new bk2.c());
                w39.b bVarA6 = nVar10.d.a();
                vc.s.j(bVarA6);
                ang.f fVarE2 = nVar10.f306479c.e();
                xoj.a aVarA9 = nVar10.f306480g.a();
                vc.s.j(aVarA9);
                qd0.b bVarN8 = nVar10.f306478b.n();
                vc.s.j(bVarN8);
                return new uk2.v(nVar11, pVar8, new yj2.l(jVar3, bVarA6, fVarE2, aVarA9, new yj2.f(bVarN8)));
            case 14:
                xj2.k kVar2 = (xj2.k) this.e;
                xj2.n nVar12 = (xj2.n) this.f299260b;
                l70.e eVar5 = nVar12.f306478b;
                int i96 = this.f299261c;
                if (i96 != 0) {
                    if (i96 == 1) {
                        return new l0();
                    }
                    if (i96 != 2) {
                        throw new AssertionError(i96);
                    }
                    th0.b mapServices = th0.g.a();
                    xk2.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapServices, "mapServices");
                    return new com.revolut.core.mobile_services.impl.map.a();
                }
                cli.n nVar13 = (cli.n) kVar2.f306470b.get();
                tk2.p pVar9 = (tk2.p) ((xj2.o) this.d).d.get();
                s70.a aVarM = eVar5.m();
                vc.s.j(aVarM);
                sk2.a aVar18 = new sk2.a();
                y80.a aVarR = eVar5.r();
                vc.s.j(aVarR);
                ang.f fVarE3 = nVar12.f306479c.e();
                xj2.n nVar14 = kVar2.f306469a;
                y80.a aVarR2 = nVar14.f306478b.r();
                vc.s.j(aVarR2);
                w39.b bVarA7 = nVar14.d.a();
                vc.s.j(bVarA7);
                return new com.revolut.feature.atm.impl.ui.redesign.v2.map.a(nVar13, pVar9, aVarM, aVar18, aVarR, fVarE3, new sk2.i(aVarR2, bVarA7), (ah0.c) kVar2.f306471c.get());
            case 15:
                return a();
            case 16:
                return b();
            case 17:
                yh1.d dVar13 = (yh1.d) this.d;
                yh1.a aVar19 = (yh1.a) this.e;
                yh1.e eVar6 = (yh1.e) this.f299260b;
                ite.a aVar20 = eVar6.d;
                kj1.a aVar21 = eVar6.f313707a;
                int i99 = this.f299261c;
                switch (i99) {
                    case 0:
                        Object extension5 = (pi1.f) aVar19.f313691b.get();
                        si1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        yji.n nVar15 = (yji.n) extension5;
                        vc.s.k(nVar15);
                        return nVar15;
                    case 1:
                        AddAddressScreenContract$InputData addAddressScreenContract$InputData = aVar19.f313690a;
                        AddressEnhancementAdvisor addressEnhancementAdvisor = new AddressEnhancementAdvisor();
                        com.revolut.feature.address.common.impl.flow.validation_flow.b bVar7 = new com.revolut.feature.address.common.impl.flow.validation_flow.b();
                        vh1.d dVar14 = dVar13.f313703b;
                        rh1.b bVarA8 = aVar21.a();
                        vc.s.j(bVarA8);
                        gte.a aVarB4 = aVar20.b();
                        vc.s.j(aVarB4);
                        return new com.revolut.feature.address.common.impl.flow.validation_flow.c(addAddressScreenContract$InputData, addressEnhancementAdvisor, bVar7, dVar14, bVarA8, aVarB4);
                    case 2:
                        rh1.b bVarA9 = aVar21.a();
                        vc.s.j(bVarA9);
                        yi1.e eVar7 = new yi1.e();
                        vi1.a aVar22 = (vi1.a) aVar19.e.get();
                        AddAddressScreenContract$InputData addAddressScreenContract$InputData2 = aVar19.f313690a;
                        cli.n nVar16 = (cli.n) aVar19.f.get();
                        e4m.c cVar3 = dVar13.f313706h;
                        g gVar3 = aVar19.f313693g;
                        g gVar4 = aVar19.f313694h;
                        g gVar5 = aVar19.i;
                        vi1.i iVar2 = new vi1.i();
                        f80.a aVarX = eVar6.f313708b.x();
                        vc.s.j(aVarX);
                        mi1.d dVar15 = (mi1.d) dVar13.e.get();
                        gte.a aVarB5 = aVar20.b();
                        vc.s.j(aVarB5);
                        return new com.revolut.feature.address.common.impl.flow.screen.add.a(bVarA9, eVar7, aVar22, addAddressScreenContract$InputData2, nVar16, cVar3, gVar3, gVar4, gVar5, iVar2, aVarX, dVar15, aVarB5, (pi1.f) aVar19.f313691b.get());
                    case 3:
                        return new vi1.b((vi1.d) aVar19.d.get(), new vi1.h());
                    case 4:
                        gte.a aVarB6 = aVar20.b();
                        vc.s.j(aVarB6);
                        return new vi1.f(aVarB6);
                    case 5:
                        rh1.b bVarA10 = aVar21.a();
                        vc.s.j(bVarA10);
                        return new gi1.w(bVarA10, new yi1.e(), aVar19.f313690a, new xi1.a());
                    case 6:
                        rh1.b bVarA11 = aVar21.a();
                        vc.s.j(bVarA11);
                        return new vi1.r(bVarA11);
                    case 7:
                        rh1.b bVarA12 = aVar21.a();
                        vc.s.j(bVarA12);
                        return new vi1.o(bVarA12);
                    case 8:
                        return new vi1.t();
                    default:
                        throw new AssertionError(i99);
                }
            case 18:
                yh1.e eVar8 = (yh1.e) this.f299260b;
                yh1.l lVar8 = (yh1.l) this.e;
                int i100 = this.f299261c;
                if (i100 == 0) {
                    cli.n nVar17 = (cli.n) lVar8.d.get();
                    rh1.b bVarA13 = eVar8.f313707a.a();
                    vc.s.j(bVarA13);
                    return new com.revolut.feature.address.common.impl.flow.screen.find.b(nVar17, bVarA13, (e0m.f) lVar8.f.get(), lVar8.f313732c, (mi1.d) ((yh1.d) this.d).e.get());
                }
                if (i100 == 1) {
                    return new com.revolut.feature.address.common.impl.flow.screen.find.c(lVar8.f313731b, lVar8.f313732c, (uh1.a) eVar8.f.get(), new xi1.a());
                }
                if (i100 != 2) {
                    if (i100 != 3) {
                        throw new AssertionError(i100);
                    }
                    ki1.b.Companion.getClass();
                    return new zzl.c();
                }
                zzl.b regexMatcher = (zzl.b) lVar8.e.get();
                ki1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
                return new e0m.f(regexMatcher);
            case 19:
                yh1.e eVar9 = (yh1.e) this.f299260b;
                yh1.l lVar9 = (yh1.l) this.e;
                int i101 = this.f299261c;
                if (i101 == 0) {
                    cli.n nVar18 = (cli.n) lVar9.d.get();
                    rh1.b bVarA14 = eVar9.f313707a.a();
                    vc.s.j(bVarA14);
                    return new com.revolut.feature.address.common.impl.flow.screen.find.b(nVar18, bVarA14, (e0m.f) lVar9.f.get(), lVar9.f313732c, (mi1.d) ((yh1.f) this.d).d.get());
                }
                if (i101 == 1) {
                    return new com.revolut.feature.address.common.impl.flow.screen.find.c(lVar9.f313731b, lVar9.f313732c, (uh1.a) eVar9.f.get(), new xi1.a());
                }
                if (i101 != 2) {
                    if (i101 != 3) {
                        throw new AssertionError(i101);
                    }
                    ki1.b.Companion.getClass();
                    return new zzl.c();
                }
                zzl.b regexMatcher2 = (zzl.b) lVar9.e.get();
                ki1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(regexMatcher2, "regexMatcher");
                return new e0m.f(regexMatcher2);
            case 20:
                return c();
            case 21:
                return d();
            case 22:
                yzk.b bVar8 = (yzk.b) this.f299260b;
                yzk.a aVar23 = (yzk.a) this.d;
                int i102 = this.f299261c;
                if (i102 == 0) {
                    return new e0l.l((xzk.g) bVar8.z.get(), (xzk.b) bVar8.f318149y.get(), (e0l.b) ((of.a) this.e).f224676a.get(), (f9b.f) aVar23.f318127r.get(), (tpi.j) aVar23.f318120h.get(), (iqi.h) aVar23.f318124n.get(), (xpi.g) aVar23.o.get(), aVar23.f318117b, new a0l.p());
                }
                if (i102 == 1) {
                    return new e0l.f();
                }
                throw new AssertionError(i102);
            case 23:
                return e();
            case 24:
                return f();
            case 25:
                return g();
            case 26:
                return h();
            case 27:
                return i();
            case 28:
                return j();
            default:
                z52.m mVar3 = (z52.m) this.d;
                z52.j jVar4 = (z52.j) this.f299260b;
                p12.l lVar10 = jVar4.f319439l;
                z52.l lVar11 = (z52.l) this.e;
                ViewController viewController = lVar11.f319448a;
                z52.j jVar5 = lVar11.f319450c;
                int i103 = this.f299261c;
                if (i103 == 0) {
                    Object extension6 = (y02.a) lVar11.e.get();
                    z02.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension6, "extension");
                    yji.d dVar16 = (yji.d) extension6;
                    vc.s.k(dVar16);
                    return dVar16;
                }
                if (i103 == 1) {
                    r12.a aVar24 = (r12.a) lVar10.f231711s.get();
                    vc.s.j(aVar24);
                    return yf6.b.k(aVar24, viewController, (y02.c) lVar11.d.get());
                }
                if (i103 == 2) {
                    return yf6.b.l(viewController);
                }
                if (i103 == 3) {
                    ry9.d extension7 = (ry9.d) lVar11.f319451g.get();
                    h62.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension7, "extension");
                    vc.s.k(extension7);
                    return extension7;
                }
                if (i103 == 4) {
                    vy9.g factory2 = jVar4.f319440m.b();
                    vc.s.j(factory2);
                    h62.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    return factory2.a();
                }
                if (i103 != 5) {
                    throw new AssertionError(i103);
                }
                IrisAreaScreenContract$InputData irisAreaScreenContract$InputData = lVar11.f319449b;
                h12.h hVarF = jVar5.f319439l.f();
                vc.s.j(hVarF);
                zq.a aVar25 = new zq.a(irisAreaScreenContract$InputData, hVarF);
                lx1.d dVarB = ((ey1.e) jVar4.k).b();
                vc.s.j(dVarB);
                pn3.a aVar26 = (pn3.a) jVar4.f319445s.get();
                vz1.j jVarI = ((lz1.m) jVar4.f319438j).i();
                vc.s.j(jVarI);
                h12.a aVarD = lVar10.d();
                vc.s.j(aVarD);
                e12.f fVar2 = (e12.f) mVar3.f319458j.get();
                f62.f fVar3 = new f62.f((c12.f) mVar3.f.get());
                f62.o oVar4 = new f62.o((c12.z) mVar3.f319456g.get(), 0);
                ry9.d dVar17 = (ry9.d) lVar11.f319451g.get();
                p12.l lVar12 = jVar5.f319439l;
                a12.j jVarE = lVar12.e();
                vc.s.j(jVarE);
                a12.e eVarL = lVar12.l();
                vc.s.j(eVarL);
                a12.o oVarM = lVar12.m();
                vc.s.j(oVarM);
                a12.p pVar10 = (a12.p) lVar12.L.get();
                vc.s.j(pVar10);
                ty9.b bVarC = jVar5.f319440m.c();
                vc.s.j(bVarC);
                return new g62.l(irisAreaScreenContract$InputData, aVar25, dVarB, aVar26, jVarI, aVarD, fVar2, fVar3, oVar4, dVar17, new g62.n(jVarE, eVarL, oVarM, pVar10, bVarC));
        }
    }
}
