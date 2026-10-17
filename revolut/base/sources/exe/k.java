package exe;

import aj0.m0;
import androidx.room.util.DBUtil;
import aw0.o9;
import cli.y;
import com.revolut.biometric_verification.impl.ui.step.document.document_picker.BiometricVerificationDocumentSelectionScreen;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenHeaderAction;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details.ChecklistStepDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.CreditCardDownPaymentScreen;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.FreelancerAcquiringPaymentListScreen;
import com.revolut.feature.joint.impl.ui.phone_confirmation.JointContactPhoneConfirmationScreen;
import com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.feature.pay_later.impl.ui.planslist.PayLaterPlansListScreen;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorController;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreen;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$ModalStep;
import com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerController;
import com.revolut.feature.revolutpay.impl.ui.add_email.AddEmailScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreenContract$InputData;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.a;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import com.revolut.feature.workflow.chat.impl.ui.flow.screen.initial.WorkflowChatScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Redirect;
import fji.r;
import fth.e;
import hk9.u;
import hk9.x;
import ho.t;
import ip0.ut;
import ip0.x10;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import kotlin.text.z;
import kotlinx.serialization.SerializationException;
import rp0.l0;
import vkm.j2;
import zh9.a1;
import zh9.b1;
import zh9.z0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130408a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f130408a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        List list;
        Integer numValueOf;
        Collection collection;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        LargeActionButtonDelegate.Model modelB;
        int i = 9;
        int i2 = 22;
        int i3 = 26;
        int i5 = 10;
        int i6 = 6;
        int i21 = 2;
        int i22 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (this.f130408a) {
            case 0:
                CheckoutScreenContract$CheckoutTarget checkoutScreenContract$CheckoutTarget = (CheckoutScreenContract$CheckoutTarget) obj2;
                l lVar = (l) this.receiver;
                if (!(checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Junior)) {
                    lVar.getClass();
                } else if (!lVar.f130416m.a(JuniorOnboardingApi$Toggles.JuniorPendingKyc.f76949c)) {
                    return xam.a.h(new ew1.d(lVar, objArr == true ? 1 : 0, i), rd0.e.b(lVar.o.Y(((CheckoutScreenContract$CheckoutTarget.Junior) checkoutScreenContract$CheckoutTarget).f90716a)));
                }
                return new go.g(zi0.c.P(Boolean.FALSE, false, null, 3), 2);
            case 1:
                String id10 = (String) obj2;
                eyc.p pVar = (eyc.p) this.receiver;
                KProperty[] kPropertyArr = EntityHomeScreen.Z;
                com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) pVar;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (!Intrinsics.f(id10, "MENU_HELP_ID")) {
                    Object content = ((eyc.n) ((j2) bVar.f85856w.f22677a).getValue()).f130663b.getContent();
                    FincrimeHomeScreen$V2 fincrimeHomeScreen$V2 = content instanceof FincrimeHomeScreen$V2 ? (FincrimeHomeScreen$V2) content : null;
                    if (fincrimeHomeScreen$V2 != null && (list = fincrimeHomeScreen$V2.f64131h) != null) {
                        Integer numM = z.m(id10);
                        if (numM == null) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "EntityHomeScreenModel", "Unknown MenuItem id ".concat(id10), null, h0Var);
                        } else {
                            FincrimeHomeScreenHeaderAction fincrimeHomeScreenHeaderAction = (FincrimeHomeScreenHeaderAction) d0.e0(numM.intValue(), list);
                            if (fincrimeHomeScreenHeaderAction == null) {
                                h0 h0Var2 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, "EntityHomeScreenModel", "No click handler found for the menu item with id ".concat(id10), null, h0Var2);
                            } else {
                                FincrimeHomeScreenAction fincrimeHomeScreenAction = fincrimeHomeScreenHeaderAction.f64154c;
                                if (fincrimeHomeScreenAction instanceof FincrimeHomeScreenAction.PopupMenu) {
                                    FincrimeHomeScreenAction.PopupMenu popupMenu = (FincrimeHomeScreenAction.PopupMenu) fincrimeHomeScreenAction;
                                    l0 l0Var = bVar.u;
                                    Intrinsics.checkNotNullParameter(id10, "id");
                                    ListIdTarget listIdTarget = new ListIdTarget(id10);
                                    bVar.v.getClass();
                                    Intrinsics.checkNotNullParameter(popupMenu, "popupMenu");
                                    ArrayList arrayList = popupMenu.f64140a;
                                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                                    for (Object obj4 : arrayList) {
                                        int i32 = i22 + 1;
                                        if (i22 < 0) {
                                            v.s();
                                            throw null;
                                        }
                                        FincrimeHomeScreenAction.PopupMenu.Item item = (FincrimeHomeScreenAction.PopupMenu.Item) obj4;
                                        int i33 = eyc.b.f130659a[item.f64143c.ordinal()];
                                        if (i33 == 1) {
                                            numValueOf = null;
                                        } else {
                                            if (i33 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            numValueOf = Integer.valueOf(R$attr.uikit_colorStatusDanger);
                                        }
                                        String strN = a0.d.n("popup_menu_item_", i22);
                                        TextClause textClause = new TextClause(item.f64141a, (Style) (numValueOf != null ? new Custom(numValueOf, false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124);
                                        aal.b bVar2 = item.f64142b;
                                        arrayList2.add(new PopupMenuItem.Cell(strN, textClause, bVar2 != null ? new ResourceImage(yxc.l.b(bVar2), (Integer) null, (Integer) null, numValueOf, (List) null, (ImageTransformations) null, (Clause) null, 246) : null, null, null, null, null, null, item, null, 760));
                                        i22 = i32;
                                    }
                                    l0.d(l0Var, listIdTarget, zi0.c.d(arrayList2), null, 12);
                                } else {
                                    bVar.I2(fincrimeHomeScreenAction);
                                }
                            }
                        }
                    }
                } else if (bVar.o instanceof EntityHomeScreenContract$InputData.Params) {
                    bVar.C2(a.b.f85850a);
                }
                return Unit.f186387a;
            case 2:
                ut model = (ut) obj2;
                eyc.p pVar2 = (eyc.p) this.receiver;
                KProperty[] kPropertyArr2 = EntityHomeScreen.Z;
                com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar3 = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) pVar2;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                bVar3.J2(model.f);
                return Unit.f186387a;
            case 3:
                ty0.a clickData = (ty0.a) obj2;
                eyc.p pVar3 = (eyc.p) this.receiver;
                KProperty[] kPropertyArr3 = EntityHomeScreen.Z;
                com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar4 = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) pVar3;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                bVar4.I2(clickData.d);
                return Unit.f186387a;
            case 4:
                fg0.c cVar = (fg0.c) obj2;
                fg0.e eVar = (fg0.e) this.receiver;
                zf0.g gVar = (zf0.g) DBUtil.performBlocking(eVar.d.f304759a, true, false, new s7a.l0(cVar.f134865a.e, cVar.f134867c, i6));
                if (gVar == null) {
                    return null;
                }
                try {
                    fg0.a aVar = eVar.e;
                    String json = gVar.f321847c;
                    Intrinsics.checkNotNullParameter(json, "json");
                    rlm.o oVar = aVar.f134864a;
                    oVar.getClass();
                    return (m0) oVar.b(m0.Companion.serializer(), json);
                } catch (SerializationException e) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var3);
                    return null;
                }
            case 5:
                List list2 = (List) DBUtil.performBlocking(((fg0.k) this.receiver).d.f304759a, true, false, new xf0.h(((zf0.c) obj2).e, i21));
                ArrayList<PigeonNode> nodes = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    nodes.add(s.B((zf0.h) it8.next()));
                }
                Intrinsics.checkNotNullParameter(nodes, "nodes");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (PigeonNode pigeonNode : nodes) {
                    String str = pigeonNode.f51437g;
                    List arrayList3 = (List) linkedHashMap.get(str);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(pigeonNode);
                    linkedHashMap.put(str, arrayList3);
                }
                List list3 = (List) linkedHashMap.get(null);
                if (ue0.e.n(list3)) {
                    collection = f0.f322471a;
                } else {
                    List list4 = list3;
                    ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                    Iterator it9 = list4.iterator();
                    while (it9.hasNext()) {
                        arrayList4.add(fg0.g.b((PigeonNode) it9.next(), linkedHashMap));
                    }
                    collection = arrayList4;
                }
                if (collection.isEmpty()) {
                    return null;
                }
                return collection;
            case 6:
                fji.h inputData = (fji.h) obj2;
                r rVar = (r) ((fji.o) this.receiver);
                rVar.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                rVar.H2(rVar.o, new fjd.w(inputData, i21));
                return Unit.f186387a;
            case 7:
                ty0.a clickData2 = (ty0.a) obj2;
                r rVar2 = (r) ((fji.o) this.receiver);
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                rVar2.C2(new fji.i(clickData2));
                return Unit.f186387a;
            case 8:
                l5f.b parcel = (l5f.b) obj2;
                fnc.o oVar2 = (fnc.o) this.receiver;
                PortfolioDetailsScreen.Companion aVar2 = PortfolioDetailsScreen.INSTANCE;
                fnc.d0 d0Var = (fnc.d0) oVar2;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel == null) {
                    throw new NoWhenBranchMatchedException();
                }
                yji.l.j2(d0Var, d0Var.e1(new k5f.h(parcel.f192254a)), ModalDestination.Style.POPUP.f98311a, null, 2);
                return Unit.f186387a;
            case 9:
                ty0.a clickData3 = (ty0.a) obj2;
                fnc.o oVar3 = (fnc.o) this.receiver;
                PortfolioDetailsScreen.Companion aVar3 = PortfolioDetailsScreen.INSTANCE;
                fnc.d0 d0Var2 = (fnc.d0) oVar3;
                d0Var2.getClass();
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                Object obj5 = clickData3.d;
                if (obj5 instanceof k1h.i) {
                    ((moc.b) d0Var2.f136632t).Z2((k1h.i) obj5);
                }
                return Unit.f186387a;
            case 10:
                tpc.g parcel2 = (tpc.g) obj2;
                fnc.o oVar4 = (fnc.o) this.receiver;
                PortfolioDetailsScreen.Companion aVar4 = PortfolioDetailsScreen.INSTANCE;
                fnc.d0 d0Var3 = (fnc.d0) oVar4;
                d0Var3.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                ((tpc.h) d0Var3.f136633w).invoke(parcel2);
                return Unit.f186387a;
            case 11:
                ft.k kVar = (ft.k) this.receiver;
                KProperty[] kPropertyArr4 = BiometricVerificationDocumentSelectionScreen.U;
                ((ft.m) kVar).I2((ft.i) obj2);
                return Unit.f186387a;
            case 12:
                fth.d event = (fth.d) obj2;
                fth.f fVar = (fth.f) this.receiver;
                KProperty[] kPropertyArr5 = WorkflowChatScreen.c0;
                fth.i iVar = (fth.i) fVar;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (!Intrinsics.f(event, fth.d.f138023a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar.v2(new e.a());
                return Unit.f186387a;
            case 13:
                String query = (String) obj2;
                fv6.k kVar2 = (fv6.k) this.receiver;
                KProperty[] kPropertyArr6 = FreelancerAcquiringPaymentListScreen.U;
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar5 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) kVar2;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                bVar5.H2(bVar5.f73736s, new f9g.l(query, 23));
                return Unit.f186387a;
            case 14:
                CharSequence amount = (CharSequence) obj2;
                fw4.j jVar = (fw4.j) this.receiver;
                KProperty[] kPropertyArr7 = CreditCardDownPaymentScreen.R;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                w80.b bVar6 = jVar.o;
                String string = amount.toString();
                y yVar = jVar.f138581p;
                jVar.H2(yVar, new ar3.a(i, dj0.d.c(((fw4.d) ((j2) yVar.f22677a).getValue()).f138573a, bVar6.b(string, ((fw4.d) ((j2) yVar.f22677a).getValue()).f138573a.f115083b.f306286a), null, 2)));
                return Unit.f186387a;
            case 15:
                String code = (String) obj2;
                g58.d dVar = (g58.d) this.receiver;
                KProperty[] kPropertyArr8 = JointContactPhoneConfirmationScreen.c0;
                g58.j jVar2 = (g58.j) dVar;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                jVar2.x2(new g58.h(code, i22));
                return Unit.f186387a;
            case 16:
                String email = (String) obj2;
                g8c.g gVar2 = (g8c.g) this.receiver;
                KProperty[] kPropertyArr9 = AddEmailScreen.R;
                g8c.l lVar2 = (g8c.l) gVar2;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(email, "email");
                lVar2.H2(lVar2.f141349q, new g58.h(email, i21));
                return Unit.f186387a;
            case 17:
                ty0.a clickData4 = (ty0.a) obj2;
                gh3.h hVar = (gh3.h) this.receiver;
                KProperty[] kPropertyArr10 = ChecklistStepDetailsScreen.R;
                gh3.l lVar3 = (gh3.l) hVar;
                lVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData4, "clickData");
                lVar3.l2(new ga9.v((Object) lVar3, (Object) clickData4.f275445a, (Continuation) (objArr2 == true ? 1 : 0), 21), new yi5.b(i3));
                return Unit.f186387a;
            case 18:
                ty0.a clickData5 = (ty0.a) obj2;
                gk9.i iVar2 = (gk9.i) this.receiver;
                KProperty[] kPropertyArr11 = PayLaterPlansListScreen.f0;
                gk9.o oVar5 = (gk9.o) iVar2;
                oVar5.getClass();
                Intrinsics.checkNotNullParameter(clickData5, "clickData");
                if (Intrinsics.f(clickData5.f275445a, "PAY_LATER_NAVIGATE_TO_PAY_LATER_CARD_ACTION")) {
                    oVar5.n2(new ge7.f(oVar5, objArr3 == true ? 1 : 0, i5), new whi.b(i6));
                }
                return Unit.f186387a;
            case 19:
                gti.e brightness = (gti.e) obj2;
                gti.c cVar2 = (gti.c) this.receiver;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(brightness, "brightness");
                gti.e eVar2 = cVar2.e;
                cVar2.e = brightness;
                if (eVar2 != null) {
                    Object objC = cVar2.f146613c.c();
                    Object obj6 = cVar2.f146611a;
                    if (objC == obj6) {
                        gti.b bVar7 = cVar2.d;
                        String screen = cVar2.f146612b.e(obj6).f281496a;
                        float f = eVar2.f146614a;
                        float f4 = brightness.f146614a;
                        gti.d mode = brightness.f146615b;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(mode, "mode");
                        t tVar = bVar7.f146610a;
                        Pair pair = new Pair(ib.b.Screen, screen);
                        Locale locale = Locale.US;
                        tVar.e2(new ho.p("airport_brightness_changed", r0.k(pair, new Pair("previous_value", m72.b.t(new Object[]{Float.valueOf(f)}, 1, locale, "%.2f", "format(...)")), new Pair("new_value", m72.b.t(new Object[]{Float.valueOf(f4)}, 1, locale, "%.2f", "format(...)")), new Pair("mode", mode.a()))));
                    }
                }
                return Unit.f186387a;
            case 20:
                String str2 = (String) obj2;
                gv8.m mVar = (gv8.m) this.receiver;
                Redirect redirectM = mVar.f147085p.m(str2);
                aii.r iVar3 = a0.z(redirectM != null ? redirectM.f105639a : null, "success", true) ? new gv8.i(str2) : new gv8.h(str2);
                y yVar2 = mVar.f147087r;
                if (!((gv8.f) ((j2) yVar2.f22677a).getValue()).f147079a) {
                    mVar.H2(yVar2, new gul.f(25));
                    mVar.C2(iVar3);
                }
                return Unit.f186387a;
            case 21:
                x10 model2 = (x10) obj2;
                hea.p pVar4 = (hea.p) this.receiver;
                KProperty[] kPropertyArr12 = PocketDetailsScreen.f80841e0;
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar5 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pVar4;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f167082b.f58316a, "BANNER_BUTTON_ID")) {
                    Object obj7 = model2.f167082b.f58324n;
                    Intrinsics.i(obj7, "null cannot be cast to non-null type kotlin.String");
                    aVar5.n2(new h54.o(aVar5, (String) obj7, objArr4 == true ? 1 : 0, i2), new whi.b(i6));
                }
                return Unit.f186387a;
            case 22:
                ty0.a data = (ty0.a) obj2;
                hea.p pVar5 = (hea.p) this.receiver;
                KProperty[] kPropertyArr13 = PocketDetailsScreen.f80841e0;
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar6 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pVar5;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                if (Intrinsics.f(data.f275445a, "COUNTRY_CHANGE_ID")) {
                    dda.k kVar3 = ((hea.o) ((j2) aVar6.U.f22677a).getValue()).f151649g;
                    if (kVar3 != null) {
                        aVar6.L2(kVar3);
                    }
                } else {
                    hx7.e.n(new IllegalArgumentException(p.a.p("Click ", data.f275445a, " not supported!")));
                }
                return Unit.f186387a;
            case 23:
                ty0.a model3 = (ty0.a) obj2;
                hea.p pVar6 = (hea.p) this.receiver;
                KProperty[] kPropertyArr14 = PocketDetailsScreen.f80841e0;
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar7 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pVar6;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                if (a0.H(model3.f275445a, "BANNER_POPUP_LINK_ID_", false) || a0.H(model3.f275445a, "ID_HIGHLIGHTED_TEXT_", false)) {
                    Object obj8 = model3.d;
                    if (obj8 instanceof wda.e) {
                        j60.a aVar8 = aVar7.u;
                        gea.a aVar9 = aVar7.f80858p;
                        wda.d dVar2 = ((wda.e) obj8).f296478b;
                        aVar9.getClass();
                        aVar8.x(gea.a.b(dVar2));
                    } else if (obj8 instanceof wda.c) {
                        aVar7.n2(new h54.o(aVar7, ((wda.c) obj8).f296473b, objArr5 == true ? 1 : 0, i2), new whi.b(i6));
                    } else if (obj8 instanceof wda.g) {
                        com.revolut.kompot.navigable.vc.modal.a aVar10 = aVar7.V;
                        wda.g gVar3 = (wda.g) obj8;
                        String str3 = gVar3.f296482b;
                        ArrayList<wda.f> arrayList5 = gVar3.f296483c;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (wda.f fVar2 : arrayList5) {
                            arrayList6.add(new PocketDetailsScreenContract$ModalStep.PopupListDialog.PopupListItem(fVar2.f296479a, fVar2.f296480b));
                        }
                        oki.h.v2(aVar10, new PocketDetailsScreenContract$ModalStep.PopupListDialog(str3, arrayList6), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        hx7.e.n(new IllegalArgumentException(a0.d.m(obj8, "Unsupported highlight object ")));
                    }
                }
                return Unit.f186387a;
            case 24:
                String buttonId = (String) obj2;
                hh6.k kVar4 = (hh6.k) this.receiver;
                MandateDetailsScreen.Companion aVar11 = MandateDetailsScreen.INSTANCE;
                hh6.p pVar7 = (hh6.p) kVar4;
                j60.a aVar12 = pVar7.f152272t;
                Intrinsics.checkNotNullParameter(buttonId, "buttonId");
                if (Intrinsics.f(buttonId, "ITEM_BUTTON_CANCEL")) {
                    j60.a.v(aVar12, false, null, 3);
                } else if (Intrinsics.f(buttonId, "ITEM_BUTTON_REVOKE")) {
                    j60.a.v(aVar12, false, new h1g.a(pVar7, 16), 1);
                }
                return Unit.f186387a;
            case 25:
                hhd.i iVar4 = (hhd.i) this.receiver;
                WatchlistAddAssetFlow.Companion aVar13 = WatchlistAddAssetFlow.INSTANCE;
                ((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) iVar4).I2((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.d) obj2);
                return Unit.f186387a;
            case 26:
                hhd.i iVar5 = (hhd.i) this.receiver;
                WatchlistAddAssetFlow.Companion aVar14 = WatchlistAddAssetFlow.INSTANCE;
                ((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) iVar5).I2((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.d) obj2);
                return Unit.f186387a;
            case 27:
                hhd.i iVar6 = (hhd.i) this.receiver;
                WatchlistAddAssetFlow.Companion aVar15 = WatchlistAddAssetFlow.INSTANCE;
                ((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) iVar6).I2((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.d) obj2);
                return Unit.f186387a;
            case 28:
                bw0.m hint = (bw0.m) obj2;
                hk9.k kVar5 = (hk9.k) this.receiver;
                KProperty[] kPropertyArr15 = PurchaseCalculatorController.W;
                hk9.q qVar = (hk9.q) kVar5;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(hint, "hint");
                Object obj9 = hint.e;
                if (obj9 instanceof hk9.s) {
                    hk9.r rVar3 = qVar.f152889t;
                    hk9.s model4 = (hk9.s) obj9;
                    rVar3.getClass();
                    Intrinsics.checkNotNullParameter(model4, "model");
                    if (model4 instanceof u) {
                        textLocalisedClause = new TextLocalisedClause(R$string.pay_later_instalment_calculator_minimum_amount_explainer_title, null, null, 14);
                        textLocalisedClause2 = new TextLocalisedClause(R$string.pay_later_instalment_calculator_minimum_amount_explainer_subtitle, zhm.u.c(Integer.valueOf(((u) model4).f152893a)), null, 12);
                        modelB = hk9.r.b(rVar3);
                    } else if (model4 instanceof hk9.v) {
                        textLocalisedClause = new TextLocalisedClause(R$string.pay_later_instalment_calculator_insufficient_balance_explainer_title, null, null, 14);
                        int i43 = R$string.pay_later_instalment_calculator_insufficient_balance_explainer_subtitle;
                        hk9.v vVar = (hk9.v) model4;
                        dj0.d dVar3 = vVar.f152894a;
                        xi0.b bVar8 = dVar3.f115083b;
                        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
                        textLocalisedClause2 = new TextLocalisedClause(i43, v.k(new CurrencyClause(bVar8, ticker, null, 4), pi9.b.a(dVar3, null, 3), new CurrencyClause(bVar8, ticker, null, 4), Integer.valueOf(vVar.f152895b)), null, 12);
                        modelB = hk9.r.a(new TextLocalisedClause(R$string.pay_later_instalment_calculator_button_add_money, v.k(pi9.b.a(dVar3, null, 3), new CurrencyClause(bVar8, ticker, null, 4)), null, 12), "ADD_MONEY_BUTTON_ID");
                    } else if (model4 instanceof hk9.w) {
                        textLocalisedClause = new TextLocalisedClause(R$string.pay_later_instalment_calculator_purchase_amount_too_high_explainer_title, null, null, 14);
                        textLocalisedClause2 = new TextLocalisedClause(R$string.pay_later_instalment_calculator_purchase_amount_too_high_explainer_subtitle, zhm.u.c(pi9.b.a(((hk9.w) model4).f152896a, null, 3)), null, 12);
                        modelB = hk9.r.b(rVar3);
                    } else {
                        if (!(model4 instanceof x)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(R$string.pay_later_account_details_fee, null, null, 14);
                        textLocalisedClause2 = new TextLocalisedClause(R$string.pay_later_instalment_calculator_fee_explainer_subtitle, null, null, 14);
                        modelB = hk9.r.b(rVar3);
                    }
                    rp0.y yVar3 = new rp0.y(zhm.u.c(modelB), new rp0.t(textLocalisedClause, textLocalisedClause2, null, 28), rp0.l.WINDOW, null, null, null, 1016);
                    qVar.u.Q();
                    qVar.f152885p.x(yVar3);
                } else if (obj9 instanceof hk9.y) {
                    vj9.a aVar16 = ((hk9.y) obj9).f152898a;
                    qi9.d dVar4 = qVar.f152890w;
                    b1 b1Var = aVar16.f289656a;
                    if (b1Var instanceof z0) {
                        qVar.C1(dVar4.b((z0) b1Var, aVar16.f289657b));
                    } else {
                        if (!(b1Var instanceof a1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qVar.C1(dVar4.c((a1) b1Var));
                    }
                }
                return Unit.f186387a;
            default:
                ty0.a clickData6 = (ty0.a) obj2;
                hkb.d dVar5 = (hkb.d) this.receiver;
                int i59 = SavingsChallengeTrackerController.V;
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(clickData6, "clickData");
                dVar5.l2(new hg0.n(dVar5, clickData6.f275445a, objArr6 == true ? 1 : 0, 8), new yi5.b(i3));
                return Unit.f186387a;
        }
    }
}
