package cyc;

import amh.k;
import cli.y;
import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreen;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreen;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreenContract$ModalStep;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.ChallengesOverviewListScreen;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreen;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.help.EntityHelpScreen;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen;
import com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.EmailVerificationOtpBottomSheet;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import djc.b0;
import djc.i;
import djc.q;
import dk9.a0;
import dmb.o;
import dmj.e0;
import dnc.j;
import dnc.r;
import dr2.m;
import eq8.t;
import eu4.u;
import eu4.v;
import io.fotoapparat.exception.camera.CameraException;
import ip0.dg;
import ip0.r40;
import ip0.um0;
import ip0.vd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import md6.s;
import rp0.p;
import tmb.l;
import vge.t3;
import vge.y2;
import vge.z2;
import vkm.j2;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110080a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f110080a = i3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = 6;
        int i2 = 1;
        Continuation continuation = null;
        switch (this.f110080a) {
            case 0:
                ty0.a clickData = (ty0.a) obj2;
                h hVar = (h) this.receiver;
                KProperty[] kPropertyArr = EntityHelpScreen.S;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                hVar.C1(new BridgeDestination(new BrowserCommand(((f80.b) hVar.f110084q).f(clickData.f275445a))));
                return Unit.f186387a;
            case 1:
                dg model = (dg) obj2;
                h hVar2 = (h) this.receiver;
                KProperty[] kPropertyArr2 = EntityHelpScreen.S;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (!Intrinsics.f(model.f163888a, "ERROR_STATE_ID")) {
                    throw new UnsupportedOperationException(j6.a.q("No click handler found for listId=", model.f163888a));
                }
                hVar2.I2(true);
                return Unit.f186387a;
            case 2:
                b0 b0Var = (b0) this.receiver;
                b0Var.getClass();
                if (Intrinsics.f(((PopupMenuItem) obj2).getF55172b(), "UNLINK_PAYMENT_MENU_ITEM_ID")) {
                    y yVar = b0Var.f115296x;
                    j2 j2Var = (j2) yVar.f22677a;
                    j2 j2Var2 = (j2) yVar.f22677a;
                    RentAndBillsLinkedPayments rentAndBillsLinkedPayments = (RentAndBillsLinkedPayments) ((i) j2Var.getValue()).f115301c.getContent();
                    if (rentAndBillsLinkedPayments != null) {
                        ArrayList arrayListB = bkc.c.b(rentAndBillsLinkedPayments, ((i) j2Var2.getValue()).f115299a);
                        List list = (List) ((i) j2Var2.getValue()).f115300b.getContent();
                        if (list != null) {
                            b0Var.C2(new q(arrayListB, list));
                        }
                    }
                }
                return Unit.f186387a;
            case 3:
                r40 model2 = (r40) obj2;
                dk9.q qVar = (dk9.q) this.receiver;
                KProperty[] kPropertyArr3 = PayLaterPlanDetailsScreen.j0;
                a0 a0Var = (a0) qVar;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj4 = model2.f166116s;
                if (obj4 instanceof bi9.b) {
                    bi9.b bVar = (bi9.b) obj4;
                    String strH = s.h(bVar);
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    a0Var.C1(new PayLaterKompotFeatureConfig.RepaymentDetailsNavigationDestination(strH, bVar.f15447a.f322366b.f322316a));
                }
                return Unit.f186387a;
            case 4:
                ty0.a clickData2 = (ty0.a) obj2;
                dmb.i iVar = (dmb.i) this.receiver;
                KProperty[] kPropertyArr4 = PickYourRateScreen.V;
                o oVar = (o) iVar;
                tmb.i iVar2 = oVar.f115896s;
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj5 = clickData2.d;
                String str = clickData2.f275445a;
                if (obj5 instanceof tmb.h) {
                    ((l) iVar2).Z2((tmb.h) obj5);
                } else if (((f80.b) oVar.f115897t).e(str)) {
                    ((l) iVar2).Z2(new tmb.f(str));
                }
                return Unit.f186387a;
            case 5:
                p reason = (p) obj2;
                dna.g gVar = (dna.g) ((dna.e) this.receiver);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(reason, "reason");
                int i3 = dna.f.f116254a[reason.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.v2(dna.c.f116253a);
                }
                return Unit.f186387a;
            case 6:
                dna.g gVar2 = (dna.g) ((dna.e) this.receiver);
                gVar2.getClass();
                Intrinsics.checkNotNullParameter((um0) obj2, "model");
                gVar2.v2(dna.c.f116253a);
                j60.a.v(gVar2.f116255p, false, null, 3);
                return Unit.f186387a;
            case 7:
                dna.g gVar3 = (dna.g) ((dna.e) this.receiver);
                gVar3.getClass();
                Intrinsics.checkNotNullParameter((um0) obj2, "model");
                gVar3.v2(dna.b.f116252a);
                j60.a.v(gVar3.f116255p, false, null, 3);
                return Unit.f186387a;
            case 8:
                g6 tabData = (g6) obj2;
                j jVar = (j) this.receiver;
                KProperty[] kPropertyArr5 = PortfolioAllocationsDetailsScreen.g0;
                r rVar = (r) jVar;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(tabData, "tabData");
                rVar.x2(new k(tabData, i2));
                return Unit.f186387a;
            case 9:
                ty0.a clickData3 = (ty0.a) obj2;
                j jVar2 = (j) this.receiver;
                KProperty[] kPropertyArr6 = PortfolioAllocationsDetailsScreen.g0;
                r rVar2 = (r) jVar2;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                Object obj6 = clickData3.d;
                if (obj6 instanceof k1h.i) {
                    k1h.i iVar3 = (k1h.i) obj6;
                    if (iVar3 instanceof k1h.g) {
                        rVar2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.how-is-the-projections-values-of-my-portfolio-calculated", 2))));
                    } else {
                        if (!(iVar3 instanceof k1h.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rVar2.C1(new ExternalDestination.Browser(((k1h.h) obj6).f180265a, null));
                    }
                }
                return Unit.f186387a;
            case 10:
                CameraException exception = (CameraException) obj2;
                dr2.g gVar4 = (dr2.g) this.receiver;
                KProperty[] kPropertyArr7 = BarcodeScreen.R;
                m mVar = (m) gVar4;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(exception, "exception");
                mVar.n2(new dlk.k(mVar, exception, continuation, 17), new whi.b(i));
                return Unit.f186387a;
            case 11:
                m mVar2 = (m) this.receiver;
                mVar2.H2(mVar2.f117083r, new e0((xq2.c) obj2, 18));
                return Unit.f186387a;
            case 12:
                String code = (String) obj2;
                ebi.h hVar3 = (ebi.h) this.receiver;
                int i5 = EmailVerificationOtpBottomSheet.V;
                ebi.j jVar3 = (ebi.j) hVar3;
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                jVar3.H2(jVar3.f124376t, new e2j.i(code, 5));
                return Unit.f186387a;
            case 13:
                ((ebi.j) this.receiver).J2((String) obj2, false);
                return Unit.f186387a;
            case 14:
                vd model3 = (vd) obj2;
                ech.f fVar = (ech.f) this.receiver;
                KProperty[] kPropertyArr8 = ScheduleScreen.f95597b0;
                ech.m mVar3 = (ech.m) fVar;
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                j60.a.v(mVar3.f124749r, false, new e58.d(mVar3, model3, 12), 1);
                return Unit.f186387a;
            case 15:
                ((aeh.b) this.receiver).Z2((aeh.f) obj2);
                return Unit.f186387a;
            case 16:
                eg0.h hVar4 = (eg0.h) this.receiver;
                List entities = hVar4.e.b(((zf0.c) obj2).e);
                if (entities.isEmpty()) {
                    entities = null;
                }
                if (entities == null) {
                    return null;
                }
                ((eg0.j) hVar4.f125519g).getClass();
                Intrinsics.checkNotNullParameter(entities, "entities");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it8 = entities.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        if (ue0.e.n((List) linkedHashMap.get("categoryKey"))) {
                            return f0.f322471a;
                        }
                        Iterable iterable = (Iterable) r0.h("categoryKey", linkedHashMap);
                        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                        Iterator it9 = iterable.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(eg0.j.b((FaqNode) it9.next(), linkedHashMap));
                        }
                        return arrayList;
                    }
                    zf0.f fVar2 = (zf0.f) it8.next();
                    FaqNode faqNodeC = bg0.a.c(fVar2);
                    String str2 = faqNodeC instanceof FaqNode.Category ? "categoryKey" : fVar2.d;
                    List arrayList2 = (List) linkedHashMap.get(str2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(faqNodeC);
                    linkedHashMap.put(str2, arrayList2);
                }
                break;
            case 17:
                SlotContext slotContext = (SlotContext) obj2;
                t3 t3Var = (t3) ((z2) this.receiver);
                if (slotContext == null) {
                    t3Var.getClass();
                    slotContext = new SlotContext(akd.s.HOME);
                }
                y2 y2Var = t3Var.d;
                Intrinsics.checkNotNullParameter(slotContext, "slotContext");
                y2Var.f289063a = slotContext;
                return Unit.f186387a;
            case 18:
                p dismissReason = (p) obj2;
                com.revolut.feature.tax_residency.impl.flows.submit.a aVar = (com.revolut.feature.tax_residency.impl.flows.submit.a) ((eoe.b) this.receiver);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
                if (dismissReason == p.USER) {
                    aVar.G2(eoe.c.f127902a);
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.tax_residency.impl.flows.submit.a aVar2 = (com.revolut.feature.tax_residency.impl.flows.submit.a) ((eoe.b) this.receiver);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter((um0) obj2, "model");
                j60.a.v(aVar2.v, false, null, 3);
                aVar2.G2(eoe.c.f127902a);
                return Unit.f186387a;
            case 20:
                com.revolut.feature.tax_residency.impl.flows.submit.a aVar3 = (com.revolut.feature.tax_residency.impl.flows.submit.a) ((eoe.b) this.receiver);
                aVar3.getClass();
                Intrinsics.checkNotNullParameter((um0) obj2, "model");
                j60.a.v(aVar3.v, false, new e58.e(aVar3, 24), 1);
                return Unit.f186387a;
            case 21:
                eq8.b0 b0Var2 = (eq8.b0) this.receiver;
                KProperty[] kPropertyArr9 = ChallengesOverviewListScreen.V;
                ((eq8.f0) b0Var2).I2((t) obj2);
                return Unit.f186387a;
            case 22:
                eq8.b0 b0Var3 = (eq8.b0) this.receiver;
                KProperty[] kPropertyArr10 = ChallengesOverviewListScreen.V;
                ((eq8.f0) b0Var3).I2((t) obj2);
                return Unit.f186387a;
            case 23:
                eq8.b0 b0Var4 = (eq8.b0) this.receiver;
                KProperty[] kPropertyArr11 = ChallengesOverviewListScreen.V;
                ((eq8.f0) b0Var4).I2((t) obj2);
                return Unit.f186387a;
            case 24:
                eq8.b0 b0Var5 = (eq8.b0) this.receiver;
                KProperty[] kPropertyArr12 = ChallengesOverviewListScreen.V;
                ((eq8.f0) b0Var5).I2((t) obj2);
                return Unit.f186387a;
            case 25:
                eq8.b0 b0Var6 = (eq8.b0) this.receiver;
                KProperty[] kPropertyArr13 = ChallengesOverviewListScreen.V;
                ((eq8.f0) b0Var6).I2((t) obj2);
                return Unit.f186387a;
            case 26:
                eq8.b0 b0Var7 = (eq8.b0) this.receiver;
                KProperty[] kPropertyArr14 = ChallengesOverviewListScreen.V;
                ((eq8.f0) b0Var7).I2((t) obj2);
                return Unit.f186387a;
            case 27:
                eq8.b0 b0Var8 = (eq8.b0) this.receiver;
                KProperty[] kPropertyArr15 = ChallengesOverviewListScreen.V;
                ((eq8.f0) b0Var8).I2((t) obj2);
                return Unit.f186387a;
            case 28:
                yx4.b event = (yx4.b) obj2;
                u uVar = (u) this.receiver;
                KProperty[] kPropertyArr16 = CreditCardChoosePaymentsScreen.S;
                com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a aVar4 = (com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a) uVar;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                Object obj7 = event.f317545b;
                if (obj7 instanceof eu4.w) {
                    aVar4.C2(eu4.s.f129519a);
                } else if (!(obj7 instanceof v)) {
                    String str3 = event.f317544a;
                    switch (str3.hashCode()) {
                        case -1311333297:
                            if (str3.equals("id_payment_options_revolut_account")) {
                                aVar4.C2(eu4.q.f129517a);
                            }
                            break;
                        case 163225540:
                            if (str3.equals("id_payment_options_pse")) {
                                aVar4.C2(eu4.p.f129516a);
                            }
                            break;
                        case 344890175:
                            if (str3.equals("id_payment_options_boleto")) {
                                aVar4.C2(eu4.o.f129515a);
                            }
                            break;
                        case 765111039:
                            if (str3.equals("id_payment_options_spei")) {
                                aVar4.C2(eu4.r.f129518a);
                            }
                            break;
                        case 1918729248:
                            if (str3.equals("ERROR_STATE_ID")) {
                                aVar4.n2(new ebg.o(aVar4, continuation, 27), new whi.b(i));
                            }
                            break;
                    }
                } else {
                    oki.h.v2(aVar4.v, new CreditCardChoosePaymentsScreenContract$ModalStep.IneligibilityWarning(((v) obj7).f129520a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.card_add_to_googlepay.impl.a aVar5 = (com.revolut.feature.card_add_to_googlepay.impl.a) this.receiver;
                aVar5.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var);
                aVar5.M2();
                return Boolean.TRUE;
        }
    }
}
