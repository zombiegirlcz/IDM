package y99;

import com.revolut.core.backend_flow.impl.ui.transactions.TransactionsSelectionController;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.internal.delegates.scroller.lm.ScrollerLayoutManager;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreen;
import com.revolut.feature.onboarding.impl.missinginfo.MissingInfoFlow;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.PayBillsAndTaxesFlow;
import com.revolut.feature.profile.api.ProfileApi$Toggles$RevampedProfileScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreen;
import com.revolut.feature.tax_residency.impl.flows.edit.EditTaxResidenciesFlow;
import com.revolut.feature.transaction_list.impl.ui.recurring_transfers.RecurringTransfersScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.sorting.TravelHotelsSortingOptionSelectorScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_segments.TravelMilesFlightSegmentsScreen;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.flow.SimpleFlow;
import com.revolut.retail.common.ui.R$string;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import lb0.l0;
import ql7.w1;
import skm.p0;
import ulm.r0;
import vge.t2;
import vkm.c2;
import vkm.d2;
import yna.h1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f311767b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f311766a = i;
        this.f311767b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v148, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CharSequence charSequenceSubstring;
        kotlin.text.o oVarB;
        int i = this.f311766a;
        int i2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.f311767b;
        switch (i) {
            case 0:
                return (d) ((ca9.b) ((MissingInfoFlow) obj2).P.getValue()).f22541c.get();
            case 1:
                return ofm.q.L(p0.f264003c, new y5g.d((kotlin.jvm.internal.q) obj2, null));
            case 2:
                int i3 = TransactionsSelectionController.f51291b0;
                fa0.w wVar = (fa0.w) ((TransactionsSelectionController) obj2).V.getValue();
                switch (wVar.f133166a) {
                    case 0:
                        fa0.j jVar = (fa0.j) wVar.f133171j;
                        BackendFlow backendFlow = jVar.f133070a;
                        FormScreen formScreen = wVar.f133167b;
                        fa0.k kVar = wVar.f133168c;
                        fc0.i iVar = (fc0.i) kVar.f133104g.f311715l.get();
                        vc.s.j(iVar);
                        r10.q qVar = new r10.q(backendFlow, formScreen, iVar);
                        dc0.f fVar = (dc0.f) wVar.f133170h.get();
                        aa0.s sVar = new aa0.s((ad0.a) jVar.z.get(), 1);
                        hbl.d dVarC = kVar.f133105h.c();
                        vc.s.j(dVarC);
                        yb0.j jVar2 = new yb0.j(dVarC, (lb0.p0) jVar.m0.get(), (bd0.a) jVar.u0.get(), (l0) jVar.f133090r0.get(), (yc0.v) jVar.f133092s0.get(), (yc0.c0) jVar.f133094t0.get(), (ad0.a) jVar.z.get());
                        j60.a aVar = (j60.a) wVar.f.get();
                        qa0.b bVar = (qa0.b) jVar.u.get();
                        c70.a aVarZ = kVar.f133103c.z();
                        vc.s.j(aVarZ);
                        return new yb0.i(qVar, fVar, sVar, jVar2, aVar, bVar, aVarZ, wVar.f133167b);
                    default:
                        fa0.h hVar = (fa0.h) wVar.f133171j;
                        BackendFlow backendFlow2 = hVar.f133036a;
                        FormScreen formScreen2 = wVar.f133167b;
                        fa0.k kVar2 = wVar.f133168c;
                        fc0.i iVar2 = (fc0.i) kVar2.f133104g.f311715l.get();
                        vc.s.j(iVar2);
                        r10.q qVar2 = new r10.q(backendFlow2, formScreen2, iVar2);
                        dc0.f fVar2 = (dc0.f) wVar.f133170h.get();
                        aa0.s sVar2 = new aa0.s((ad0.a) hVar.z.get(), 1);
                        hbl.d dVarC2 = kVar2.f133105h.c();
                        vc.s.j(dVarC2);
                        yb0.j jVar3 = new yb0.j(dVarC2, (lb0.p0) hVar.m0.get(), (bd0.a) hVar.u0.get(), (l0) hVar.f133056r0.get(), (yc0.v) hVar.f133058s0.get(), (yc0.c0) hVar.f133060t0.get(), (ad0.a) hVar.z.get());
                        j60.a aVar2 = (j60.a) wVar.f.get();
                        qa0.b bVar2 = (qa0.b) hVar.u.get();
                        c70.a aVarZ2 = kVar2.f133103c.z();
                        vc.s.j(aVarZ2);
                        return new yb0.i(qVar2, fVar2, sVar2, jVar3, aVar2, bVar2, aVarZ2, wVar.f133167b);
                }
            case 3:
                return vkm.q.c(Boolean.valueOf(((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) obj2).o.e != null));
            case 4:
                KProperty[] kPropertyArr = SharedCreateAlertRevampedScreen.f0;
                return (yed.q) ((ned.l) ((SharedCreateAlertRevampedScreen) obj2).X.getValue()).f214480j.get();
            case 5:
                KProperty[] kPropertyArr2 = SharedCreateAlertScreen.f0;
                return (yed.q) ((ned.l) ((SharedCreateAlertScreen) obj2).Y.getValue()).f214480j.get();
            case 6:
                int i5 = TravelHotelsSortingOptionSelectorScreen.U;
                return (yeg.d) ((g9g.l0) ((TravelHotelsSortingOptionSelectorScreen) obj2).S.getValue()).f141734b.get();
            case 7:
                PayBillsAndTaxesFlow payBillsAndTaxesFlow = (PayBillsAndTaxesFlow) obj2;
                return czi.c.d(0, 6, null, payBillsAndTaxesFlow, (yf9.a) ((lf9.n) payBillsAndTaxesFlow.K.getValue()).f194753j.get());
            case 8:
                yge.e eVar = (yge.e) obj2;
                return vkm.q.M(((t2) eVar.f313646b).d(), eVar.f313645a, c2.a(d2.Companion, 0L, 3), 1);
            case 9:
                KProperty[] kPropertyArr3 = RecurringTransfersScreen.c0;
                return (ygf.e) ((pgf.b) ((RecurringTransfersScreen) obj2).W.getValue()).e.get();
            case 10:
                int i6 = TravelMilesFlightSegmentsScreen.T;
                return (yhg.b) ((ufg.q) ((TravelMilesFlightSegmentsScreen) obj2).R.getValue()).f279785c.get();
            case 11:
                ((com.revolut.feature.chooser.external_map.screen.b) obj2).B2();
                return Unit.f186387a;
            case 12:
                yki.i iVar3 = ((com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a) obj2).u;
                if (iVar3.d() == null) {
                    oki.h.D2(iVar3);
                }
                return Unit.f186387a;
            case 13:
                return ((yj0.g) obj2).f314358a.a();
            case 14:
                return ((yj0.h) obj2).d.a();
            case 15:
                yj2.d dVar = (yj2.d) obj2;
                ufm.i iVarC = dVar.f314384a.c(true);
                od0.i.Companion.getClass();
                efm.r rVarX = ue0.e.F(iVarC, od0.i.f224256b).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                efm.r rVarSwitchMap = te0.w.l(rVarX, ((z39.b) dVar.f314385b).f319221b.j()).switchMap(new ya6.f(new yed.g0(dVar, 16), 28));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return vkm.q.O(rd0.e.b(rVarSwitchMap), dVar.d, c2.a(d2.Companion, 5000L, 2), new Data(null, null, true, 3, null));
            case 16:
                String country = ((s80.b) ((yj2.f) obj2).f314387a).a().getCountry();
                Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
                String upperCase = country.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return Intrinsics.f(upperCase, "US") ? sj2.a.MILE : sj2.a.KILOMETER;
            case 17:
                com.revolut.kompot.navigable.b bVar3 = (com.revolut.kompot.navigable.b) obj2;
                com.revolut.kompot.navigable.a aVar3 = bVar3.k;
                if (aVar3 != null) {
                    wji.c.Companion.getClass();
                    wji.b.a(aVar3, bVar3).a(new ModalTransitionAnimation(ModalTransitionAnimation.Style.POPUP.f98391a, false));
                    bVar3.k = null;
                }
                return Unit.f186387a;
            case 18:
                ((ykf.b) obj2).L2(new mii.i("ID_SHOT_DIALOG_COPIED", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, 28));
                return Unit.f186387a;
            case 19:
                yki.e eVar2 = (yki.e) obj2;
                if (!eVar2.f314629c.s().e(true)) {
                    rd0.e.o(eVar2.d(), eVar2.c(), true);
                }
                return Unit.f186387a;
            case 20:
                SimpleFlow simpleFlow = (SimpleFlow) obj2;
                return czi.c.d(0, 6, null, simpleFlow, simpleFlow.d3());
            case 21:
                CreditCardDeeplink creditCardDeeplink = (CreditCardDeeplink) obj2;
                yl4.a aVar4 = yl4.b.Companion;
                Regex regex = new Regex(creditCardDeeplink.f68986a);
                String uri2 = creditCardDeeplink.f68987b;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(regex, "regex");
                Intrinsics.checkNotNullParameter(uri2, "uri");
                int iS = kotlin.text.d0.S(uri2, '?', 0, 6);
                if (iS == -1) {
                    charSequenceSubstring = uri2;
                } else {
                    charSequenceSubstring = uri2.substring(0, iS);
                    Intrinsics.checkNotNullExpressionValue(charSequenceSubstring, "substring(...)");
                }
                if (!regex.f(charSequenceSubstring) || (oVarB = regex.b(uri2)) == null) {
                    return null;
                }
                return new yl4.b(oVarB);
            case 22:
                nkm.l lVarC = Regex.c(new Regex("([^&=]+)=([^&]*)"), (String) zhm.d0.m0(((yl4.b) obj2).f314654a.c()));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                nkm.k kVar3 = new nkm.k(lVarC);
                while (kVar3.hasNext()) {
                    fnc.s sVarA = ((MatchResult) kVar3.next()).a();
                    linkedHashMap.put((String) ((kotlin.text.m) ((kotlin.text.o) sVarA.f136657b).c()).get(1), (String) ((kotlin.text.m) ((kotlin.text.o) sVarA.f136657b).c()).get(2));
                }
                return linkedHashMap;
            case 23:
                List<Certificate> listA = ((r0) obj2).a();
                ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
                for (Certificate certificate : listA) {
                    Intrinsics.i(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 24:
                yma.p pVar = ((yma.e0) obj2).f314903a;
                ifm.b bVar4 = pVar.f314925c;
                pfm.a aVarL3 = pVar.l3();
                yma.g gVar = (yma.g) pVar.d;
                pfm.a aVarE = aVarL3.e(gVar.f314913j.getValue(gVar, yma.g.k[7]).b(Boolean.TRUE).ignoreElements());
                yj2.a aVar5 = new yj2.a(25, new yma.j(pVar, objArr2 == true ? 1 : 0));
                dfm.c cVar = mfm.f.d;
                en.a aVar6 = mfm.f.f205043c;
                pfm.t tVarL = new pfm.t(aVarE, aVar5, cVar, aVar6, aVar6, aVar6, aVar6).m(new yj2.a(26, new yma.j(pVar, 7))).l(new yma.k(pVar, objArr == true ? 1 : 0));
                Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                pfm.a aVar7 = new pfm.a(tVarL, new xz7.f(1, new xy7.n(new BreadcrumbException(), 24)), i2);
                Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar7.w(new nw8.d(27, yma.o.f314923a), yma.n.f314922a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                te0.w.j0(bVar4, hVarW);
                return Unit.f186387a;
            case 25:
                return Boolean.valueOf(((jte.d) ((h1) obj2).d).c(ProfileApi$Toggles$RevampedProfileScreen.f81321c));
            case 26:
                return (yne.a) ((ine.e) ((EditTaxResidenciesFlow) obj2).P.getValue()).f162848b.get();
            case 27:
                return ((dm0.d) ((tb4.t) obj2).f269456b).b();
            case 28:
                KProperty[] kPropertyArr4 = AdditionalDriverDetailsScreen.f75571d0;
                w1 w1Var = (w1) ((AdditionalDriverDetailsScreen) obj2).Y.getValue();
                switch (w1Var.f247509a) {
                    case 0:
                        return (yo7.k) w1Var.f247514j.get();
                    default:
                        return (yo7.k) w1Var.f247514j.get();
                }
            default:
                ScrollerLayoutManager scrollerLayoutManager = (ScrollerLayoutManager) obj2;
                return new yq0.d(scrollerLayoutManager, scrollerLayoutManager.f55871b, scrollerLayoutManager.f55872c, scrollerLayoutManager.d, scrollerLayoutManager.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(Function0 function0) {
        this.f311766a = 1;
        this.f311767b = (kotlin.jvm.internal.q) function0;
    }
}
