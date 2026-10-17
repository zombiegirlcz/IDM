package nt;

import com.revolut.biometric_verification.impl.ui.step.active_liveness.intro.BiometricVerificationActiveLivenessIntroScreen;
import com.revolut.biometric_verification.impl.ui.step.document.liveness_intro.BiometricVerificationDocumentLivenessIntroScreen;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesController;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreen;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen;
import com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.SavingsInterestRateExplanationContract$ModalStep;
import com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.SavingsInterestRateExplanationScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionScreen;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.select_tracking_carrier.SelectTrackingCarrierScreen;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$ModalStep;
import e0f.u0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.flow.Flow;
import nel.n;
import nya.i0;
import o9a.y;
import o9c.m0;
import o9c.o0;
import obc.m;
import oc9.b0;
import oc9.x;
import om4.t3;
import otk.p;
import vkm.j2;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218935a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f218935a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Flow flowI;
        dj0.d dVar;
        n nVar;
        int i = this.f218935a;
        int i2 = 9;
        int i3 = 1;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i5 = 23;
        int i6 = 6;
        bVar = null;
        xi0.b bVar = null;
        switch (i) {
            case 0:
                j jVar = (j) this.receiver;
                KProperty[] kPropertyArr = BiometricVerificationDocumentLivenessIntroScreen.R;
                jVar.I2((h) obj2);
                return Unit.f186387a;
            case 1:
                j jVar2 = (j) this.receiver;
                KProperty[] kPropertyArr2 = BiometricVerificationDocumentLivenessIntroScreen.R;
                jVar2.I2((h) obj2);
                return Unit.f186387a;
            case 2:
                ((com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.b) this.receiver).I2((Throwable) obj2);
                return Boolean.TRUE;
            case 3:
                ((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver).K2((l6c.b) obj2);
                return Unit.f186387a;
            case 4:
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver;
                sdc.f fVar2 = fVar.L;
                fVar2.X2(fVar2.f261853n, new scl.e(fVar2, 4));
                fVar.J2((Throwable) obj2);
                return Boolean.FALSE;
            case 5:
                ((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver).K2((l6c.b) obj2);
                return Unit.f186387a;
            case 6:
                ((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver).J2((Throwable) obj2);
                return Boolean.FALSE;
            case 7:
                Data data = (Data) obj2;
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar3 = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver;
                fVar3.getClass();
                m0 m0Var = (m0) data.getContent();
                if ((m0Var != null ? m0Var.f223211c : 0) != 0) {
                    fVar3.H2(fVar3.M, new y(data, i3));
                }
                return Unit.f186387a;
            case 8:
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar4 = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver;
                fVar4.H2(fVar4.M, new y((Data) obj2, 3));
                return Unit.f186387a;
            case 9:
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar5 = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver;
                fVar5.H2(fVar5.M, new y((Data) obj2, 2));
                return Unit.f186387a;
            case 10:
                o0 o0Var = (o0) obj2;
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar6 = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver;
                fVar6.getClass();
                s6c.d dVar2 = o0Var.f223217c;
                dj0.d dVar3 = dVar2.f260217a;
                Object obj4 = o0Var.f223215a.f224257a;
                PaymentMethod.Pocket pocket = obj4 instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) obj4 : null;
                if (pocket != null && (dVar = pocket.i) != null) {
                    bVar = dVar.f115083b;
                }
                if (bVar == null || Intrinsics.f(dVar3.f115083b, bVar)) {
                    od0.i.Companion.getClass();
                    flowI = zi0.c.i(od0.i.f224256b);
                } else {
                    flowI = nim.a.v(fVar6.f84574s.b(bVar, dVar3.f115082a, new k6c.d(o0Var.d)), new o95.b(11));
                }
                return nim.a.v(nim.a.v(flowI, new o54.a(fVar6, dVar2, i2)), new o3k.a(o0Var, 25));
            case 11:
                ((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver).K2((l6c.b) obj2);
                return Unit.f186387a;
            case 12:
                ((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver).J2((Throwable) obj2);
                return Boolean.FALSE;
            case 13:
                String query = (String) obj2;
                obc.k kVar = (obc.k) this.receiver;
                KProperty[] kPropertyArr3 = SelectTrackingCarrierScreen.S;
                m mVar = (m) kVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                mVar.H2(mVar.f223926r, new o23.l(query, 14));
                return Unit.f186387a;
            case 14:
                ty0.a data2 = (ty0.a) obj2;
                x xVar = (x) this.receiver;
                QesTermsScreen.Companion aVar = QesTermsScreen.INSTANCE;
                b0 b0Var = (b0) xVar;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                Object obj5 = data2.d;
                TermsScope termsScope = obj5 instanceof TermsScope ? (TermsScope) obj5 : null;
                if (termsScope != null) {
                    b0Var.n2(new i0(b0Var, termsScope, , i5), new whi.b(i6));
                }
                return Unit.f186387a;
            case 15:
                AppTipUIModel appTipUIModel = (AppTipUIModel) obj2;
                dte.f fVar7 = (dte.f) ((dte.b) this.receiver);
                fVar7.getClass();
                Intrinsics.checkNotNullParameter(appTipUIModel, "appTipUIModel");
                if (appTipUIModel.i instanceof wse.b) {
                    wse.a aVarA = fVar7.f117438m.a(appTipUIModel.f57725a);
                    aVarA.b(aVarA.c());
                }
                return Unit.f186387a;
            case 16:
                ((dte.f) ((dte.b) this.receiver)).c3((AppTipUIModel) obj2);
                return Unit.f186387a;
            case 17:
                AppTipUIModel appTipUIModel2 = (AppTipUIModel) obj2;
                dte.f fVar8 = (dte.f) ((dte.b) this.receiver);
                fVar8.getClass();
                Intrinsics.checkNotNullParameter(appTipUIModel2, "appTipUIModel");
                if (appTipUIModel2.i instanceof wse.b) {
                    wse.a aVarA2 = fVar8.f117438m.a(appTipUIModel2.f57725a);
                    aVarA2.b(aVarA2.c());
                }
                return Unit.f186387a;
            case 18:
                ((di9.a) this.receiver).f1((ai9.b) obj2);
                return Unit.f186387a;
            case 19:
                ((di9.a) this.receiver).p((ai9.b) obj2);
                return Unit.f186387a;
            case 20:
                yx4.b event = (yx4.b) obj2;
                or4.f fVar9 = (or4.f) this.receiver;
                KProperty[] kPropertyArr4 = CreditCardDocumentsRatesController.T;
                com.revolut.feature.credit.card.impl.ui.documents_rates.a aVar2 = (com.revolut.feature.credit.card.impl.ui.documents_rates.a) fVar9;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                Object obj6 = event.f317545b;
                if (obj6 instanceof ux4.d) {
                    an4.e eVar = aVar2.f69289q;
                    ux4.d dVar4 = (ux4.d) obj6;
                    String str = dVar4.d;
                    String str2 = dVar4.f283867c;
                    eVar.getClass();
                    aVar2.C1(an4.e.b(str, str2));
                } else if (obj6 instanceof CreditCardModelParcel.DialogParcel) {
                    oki.h.v2(aVar2.f69291s, new CreditCardDocumentsRatesScreenContract$ModalStep.Dialog(((CreditCardModelParcel.DialogParcel) obj6).f68855a), bottom_dialog);
                } else if (Intrinsics.f(event.f317544a, "ERROR_STATE_ID")) {
                    aVar2.n2(new omg.e(aVar2, , i2), new whi.b(i6));
                }
                return Unit.f186387a;
            case 21:
                os.g event2 = (os.g) obj2;
                os.j jVar3 = (os.j) this.receiver;
                KProperty[] kPropertyArr5 = BiometricVerificationActiveLivenessIntroScreen.S;
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(event2, "event");
                if (Intrinsics.f(event2, os.e.f229211a)) {
                    jVar3.B2();
                } else {
                    if (!Intrinsics.f(event2, os.f.f229212a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.checkNotNullParameter("BiometricVerificationActiveLivenessIntroScreenContract_BUTTON_TAG", "buttonTag");
                    jVar3.C2(new os.h());
                }
                return Unit.f186387a;
            case 22:
                String menuItemId = (String) obj2;
                otk.d dVar5 = (otk.d) this.receiver;
                KProperty[] kPropertyArr6 = EtfDetailsFlowController.R;
                com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a aVar3 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a) dVar5;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                aVar3.n2(new osk.m(aVar3, menuItemId, , i3), new whi.b(i6));
                if (Intrinsics.f(menuItemId, "WATCHLIST_TOOLBAR_ICON_ID") && (nVar = (n) ((otk.f) ((j2) aVar3.v.f22677a).getValue()).f229727c.getContent()) != null) {
                    aVar3.n2(new p(aVar3, nVar, null), new whi.b(i6));
                }
                return Unit.f186387a;
            case 23:
                TagViewData tagViewData = (TagViewData) obj2;
                otk.d dVar6 = (otk.d) this.receiver;
                KProperty[] kPropertyArr7 = EtfDetailsFlowController.R;
                com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a aVar4 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a) dVar6;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
                oki.h.v2(aVar4.f103848x, EtfDetailsFlowControllerContract$ModalStep.LeveragedInfo.f103840a, bottom_dialog);
                return Unit.f186387a;
            case 24:
                String query2 = (String) obj2;
                ou6.l lVar = (ou6.l) this.receiver;
                KProperty[] kPropertyArr8 = FreelancerAcquiringOrderListScreen.T;
                com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a aVar5 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) lVar;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(query2, "query");
                aVar5.H2(aVar5.f73703x, new t3(query2, 8));
                return Unit.f186387a;
            case 25:
                Data data3 = (Data) obj2;
                u0 u0Var = (u0) this.receiver;
                u0Var.getClass();
                Intrinsics.checkNotNullParameter(data3, "data");
                Throwable error = data3.getError();
                if (error != null) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    ServerError serverErrorA = u0Var.f121691a.a(error);
                    if (serverErrorA != null && serverErrorA.f51362a == 1136) {
                        throw error;
                    }
                }
                return Unit.f186387a;
            case 26:
                String investorUpdateId = (String) obj2;
                p5f.b bVar2 = (p5f.b) this.receiver;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
                q5f.f fVar10 = (q5f.f) j6.a.k(q5f.f.class, bVar2.f233113b, investorUpdateId);
                if (fVar10 != null) {
                    return q5f.h.a(fVar10);
                }
                return null;
            case 27:
                p5f.f params = (p5f.f) obj2;
                p5f.e eVar2 = (p5f.e) this.receiver;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                List list = (List) p.a.j(q5f.g.class, KTypeProjection.INSTANCE, List.class, eVar2.f233119b, ebm.a.C(params));
                if (list != null) {
                    return q5f.h.b(list);
                }
                return null;
            case 28:
                ty0.a clickData = (ty0.a) obj2;
                plb.b bVar3 = (plb.b) this.receiver;
                int i21 = SavingsInterestRateExplanationScreen.V;
                com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.a aVar6 = (com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.a) bVar3;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str3 = clickData.f275445a;
                if (Intrinsics.f(str3, "TIERED_LIMITS_LEARN_MORE_ID")) {
                    oki.h.v2(aVar6.f83226s, SavingsInterestRateExplanationContract$ModalStep.TieredLimits.f83222a, ModalDestination.Style.POPUP.f98311a);
                } else {
                    aVar6.l2(new pdi.j(aVar6, str3, , i5), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                ty0.a clickData2 = (ty0.a) obj2;
                pmb.g gVar = (pmb.g) this.receiver;
                KProperty[] kPropertyArr9 = SavingsProductSelectionScreen.Y;
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a aVar7 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a) gVar;
                tmb.i iVar = aVar7.f83331r;
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj7 = clickData2.d;
                String str4 = clickData2.f275445a;
                if (obj7 instanceof tmb.h) {
                    ((tmb.l) iVar).Z2((tmb.h) obj7);
                } else if (((f80.b) aVar7.f83333t).e(str4)) {
                    ((tmb.l) iVar).Z2(new tmb.f(str4));
                }
                return Unit.f186387a;
        }
    }
}
