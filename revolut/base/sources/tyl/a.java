package tyl;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreen;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.select_account.ApmSelectAccountController;
import com.revolut.feature.apm.core.ui.impl.ui.qr.permissions.QrWrapperPermissionsFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.KontomatikPopupScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.repeater_dropdown.RepeaterDropdownSelectionScreen;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection_custom.CustomBillScreen;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.revolut_x_common.api.RevolutXCommonApi$Toggles;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreen;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.faq.FaqFlowContract$Step;
import com.revolut.feature.subaccount.impl.ui.recurring_transfer.RecurringTransferFlow;
import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import com.revolut.feature.transfer.core.impl.ui.reference.flow.ReferenceFlow;
import com.revolut.feature_move_money.impl.amount.order_options.OrderOptionsScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheet;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.dialogs.delegate.DialogImageTextRowDelegate;
import com.revolut.uicomponent.dialogs.delegate.DialogMessageDelegate;
import com.revolut.uicomponent.dialogs.delegate.DialogNegPosButtonsDelegate;
import com.revolut.uicomponent.dialogs.delegate.DialogTextItemWithSelectionDelegate;
import com.revolut.uicomponent.dialogs.delegate.DialogTextRowDelegate;
import com.revolut.uicomponent.products.EditTextDelegate;
import dw3.s3;
import ip0.jm0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lf9.s;
import ljl.c1;
import lk0.g;
import ngm.n;
import p12.h0;
import ql7.p;
import rfm.u;
import ss4.a0;
import u2i.h;
import u3a.r;
import u6i.e;
import u7i.q;
import u80.k;
import u82.m;
import unc.b0;
import unc.x;
import uo7.i;
import up0.d0;
import up0.v;
import up0.w;
import up9.l;
import z4l.j;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f275719b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f275718a = i;
        this.f275719b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v119, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v131, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v147, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v155, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v95, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f275718a;
        int i2 = 6;
        int i3 = 1;
        Continuation continuation = null;
        Object obj2 = this.f275719b;
        switch (i) {
            case 0:
                d dVar = (d) obj2;
                koi.c cVar = new koi.c(0);
                cVar.a(new DialogMessageDelegate());
                cVar.a(new DialogNegPosButtonsDelegate(dVar));
                cVar.a(new DialogTextRowDelegate(dVar));
                cVar.a(new DialogImageTextRowDelegate(R$layout.delegate_dialog_image_text_row, new a0(25)));
                cVar.a(new DialogTextItemWithSelectionDelegate(R$layout.delegate_dialog_text_selection, new a0(28)));
                cVar.a(dVar.o);
                cVar.a(new EditTextDelegate(0));
                return new j(cVar, false, 14);
            case 1:
                int i5 = ApmSelectAccountController.U;
                return (u22.a) ((h0) ((ApmSelectAccountController) obj2).T.getValue()).f231678b.get();
            case 2:
                return Boolean.valueOf(((jte.d) ((h) obj2).f276672h).c(RevolutXCommonApi$Toggles.RevolutXPromo.f84262c));
            case 3:
                QrWrapperPermissionsFlow qrWrapperPermissionsFlow = (QrWrapperPermissionsFlow) obj2;
                return czi.c.d(0, 6, null, qrWrapperPermissionsFlow, qrWrapperPermissionsFlow.M);
            case 4:
                return n.I(((r) obj2).f276874a.b(new TextLocalisedClause(R$string.who_to_pay_searchable_keyword_revolut, null, null, 14)).toString());
            case 5:
                oki.h.D2(((f) obj2).f99761y);
                return Unit.f186387a;
            case 6:
                return ((u5d.c) obj2).f277450a.g();
            case 7:
                int i6 = OrderOptionsScreen.U;
                return (e) ((q) ((OrderOptionsScreen) obj2).S.getValue()).f277890b.get();
            case 8:
                com.revolut.feature.shared.help_centre.impl.faq.c cVar2 = (com.revolut.feature.shared.help_centre.impl.faq.c) obj2;
                SharedFaqDestination.StartPoint startPoint = cVar2.v.f86108a;
                if (startPoint instanceof SharedFaqDestination.StartPoint.Search) {
                    return new FaqFlowContract$Step.Search(((SharedFaqDestination.StartPoint.Search) startPoint).f86128a);
                }
                if (startPoint instanceof SharedFaqDestination.StartPoint.TopLevelFaq) {
                    return new FaqFlowContract$Step.TopLevelFaq(((SharedFaqDestination.StartPoint.TopLevelFaq) startPoint).f86130a);
                }
                if (startPoint instanceof SharedFaqDestination.StartPoint.SomethingElse) {
                    return new FaqFlowContract$Step.SomethingElse(((SharedFaqDestination.StartPoint.SomethingElse) startPoint).f86129a);
                }
                if (startPoint instanceof SharedFaqDestination.StartPoint.FaqExplicit) {
                    SharedFaqDestination.StartPoint.FaqExplicit faqExplicit = (SharedFaqDestination.StartPoint.FaqExplicit) startPoint;
                    return new FaqFlowContract$Step.LoadExplicit(faqExplicit.f86123a, faqExplicit.f86124b, faqExplicit.f86125c, faqExplicit.d);
                }
                if (startPoint instanceof SharedFaqDestination.StartPoint.CardsTroubleshooter) {
                    return new FaqFlowContract$Step.CardsTroubleshooter(((SharedFaqDestination.StartPoint.CardsTroubleshooter) startPoint).f86117a);
                }
                if (startPoint instanceof SharedFaqDestination.StartPoint.FaqTransactionTroubleshooter) {
                    SharedFaqDestination.StartPoint.FaqTransactionTroubleshooter faqTransactionTroubleshooter = (SharedFaqDestination.StartPoint.FaqTransactionTroubleshooter) startPoint;
                    return new FaqFlowContract$Step.FaqArticle.TransactionTroubleshooter(faqTransactionTroubleshooter.f86126a, faqTransactionTroubleshooter.f86127b);
                }
                if (startPoint instanceof SharedFaqDestination.StartPoint.TransactionTroubleshooter) {
                    SharedFaqDestination.StartPoint.TransactionTroubleshooter transactionTroubleshooter = (SharedFaqDestination.StartPoint.TransactionTroubleshooter) startPoint;
                    return new FaqFlowContract$Step.TransactionsTroubleshooterByFaqKey(transactionTroubleshooter.f86131a, transactionTroubleshooter.f86132b, transactionTroubleshooter.f86133c);
                }
                if (startPoint instanceof SharedFaqDestination.StartPoint.UpcomingTransactionTroubleshooter) {
                    return new FaqFlowContract$Step.UpcomingTransactionTroubleshooter(((SharedFaqDestination.StartPoint.UpcomingTransactionTroubleshooter) startPoint).f86134a, null);
                }
                if (startPoint instanceof SharedFaqDestination.StartPoint.CardTroubleshooter) {
                    SharedFaqDestination.StartPoint.CardTroubleshooter cardTroubleshooter = (SharedFaqDestination.StartPoint.CardTroubleshooter) startPoint;
                    return new FaqFlowContract$Step.CardTroubleshooter(cardTroubleshooter.f86114a, cardTroubleshooter.f86115b, cardTroubleshooter.f86116c);
                }
                if (startPoint instanceof SharedFaqDestination.StartPoint.AllCards) {
                    return new FaqFlowContract$Step.SeeAllCards(((SharedFaqDestination.StartPoint.AllCards) startPoint).f86113a);
                }
                if (!(startPoint instanceof SharedFaqDestination.StartPoint.FaqByNode)) {
                    if (!(startPoint instanceof SharedFaqDestination.StartPoint.FaqByDisplayableItems)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SharedFaqDestination.StartPoint.FaqByDisplayableItems faqByDisplayableItems = (SharedFaqDestination.StartPoint.FaqByDisplayableItems) startPoint;
                    return new FaqFlowContract$Step.FaqList.ByDisplayableItems(faqByDisplayableItems.f86118a, faqByDisplayableItems.f86120c, faqByDisplayableItems.f86119b);
                }
                SharedFaqDestination.StartPoint.FaqByNode faqByNode = (SharedFaqDestination.StartPoint.FaqByNode) startPoint;
                lde.n nVar = cVar2.f86205x;
                FaqNodeBase faqNodeBase = faqByNode.f86121a;
                boolean z = faqByNode.f86122b;
                if (faqNodeBase instanceof FaqNode) {
                    FaqNode faqNode = (FaqNode) faqNodeBase;
                    if (faqNode instanceof FaqNode.Category) {
                        String key = ((FaqNode.Category) faqNode).f51424a;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return new FaqFlowContract$Step.FaqList.ByNode(faqNode, z);
                    }
                    if (faqNode instanceof FaqNode.Topic) {
                        return new FaqFlowContract$Step.FaqList.ByNode(faqNode, z);
                    }
                    if (faqNode instanceof FaqNode.Article) {
                        return new FaqFlowContract$Step.FaqArticle.ByNode(faqNode);
                    }
                    if (faqNode instanceof FaqNode.Deeplink) {
                        throw new IllegalStateException("All deeplinks must be handled in FaqListScreenModel!");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!(faqNodeBase instanceof PigeonNode)) {
                    throw new NoWhenBranchMatchedException();
                }
                PigeonNode pigeonNode = (PigeonNode) faqNodeBase;
                int i21 = u7d.e.f277739a[pigeonNode.f51436c.ordinal()];
                if (i21 == 1) {
                    return new FaqFlowContract$Step.FaqArticle.ByNode(pigeonNode);
                }
                if (i21 != 2) {
                    if (i21 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("All deeplinks must be handled in FaqListScreenModel!");
                }
                String key2 = pigeonNode.f51434a;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(key2, "key");
                return new FaqFlowContract$Step.FaqList.ByNode(pigeonNode, z);
            case 9:
                ((com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) obj2).B2();
                return Unit.f186387a;
            case 10:
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(((s80.b) ((qd0.b) ((toh.d) obj2).f273214a)).b());
                Intrinsics.i(currencyInstance, "null cannot be cast to non-null type android.icu.text.DecimalFormat");
                return Character.valueOf(((DecimalFormat) currencyInstance).getDecimalFormatSymbols().getMonetaryGroupingSeparator());
            case 11:
                return Boolean.valueOf(jh.d.j(((s80.b) ((k) obj2).f278046a).b()));
            case 12:
                ((m) obj2).C2(v62.h.f286318a);
                return Unit.f186387a;
            case 13:
                return (u8e.c) ((r6e.j) ((RecurringTransferFlow) obj2).P.getValue()).f.get();
            case 14:
                jm0 jm0Var = new jm0("ASSET_DETAILS_CHART_LIST_ID", null, null, false, null, null, -1, true, 230, null, false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -454);
                int i22 = R$attr.uikit_dp0;
                int i32 = ((u9j.d) obj2).f278489c;
                yp0.b.p(jm0Var, i22, i22, i32, i32);
                return jm0Var;
            case 15:
                return (uc1.b) ((xb1.q) ((CardReaderUpdatingScreen) obj2).P.getValue()).e.get();
            case 16:
                return (uc4.e) ((s3) ((KontomatikPopupScreen) obj2).O.getValue()).f119748g.get();
            case 17:
                ((uee.d) obj2).f279348j.c(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new HelpCentreFeatureConfig.Topic("question.i-have-not-received-my-card", "card_delivery"))));
                return Unit.f186387a;
            case 18:
                g gVar = (g) ((ueg.e) obj2).f279383c.f();
                if (gVar != null) {
                    u uVarG = efm.k.g(gVar);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            case 19:
                int i33 = RepeaterDropdownSelectionScreen.U;
                return (ug9.e) ((s) ((RepeaterDropdownSelectionScreen) obj2).S.getValue()).f194796b.get();
            case 20:
                oki.h.D2(((com.revolut.feature.apm.wero.impl.ui.home.a) obj2).f63067q);
                return Unit.f186387a;
            case 21:
                int i43 = AccountsToApplyChangesBottomSheet.U;
                c1 c1Var = (c1) ((AccountsToApplyChangesBottomSheet) obj2).R.getValue();
                switch (c1Var.f195911a) {
                    case 0:
                        return (ull.e) c1Var.f195913c.get();
                    default:
                        return (ull.e) c1Var.f195913c.get();
                }
            case 22:
                b0 b0Var = (b0) obj2;
                b0Var.n2(new x(b0Var, continuation, i3), new whi.b(i2));
                return Unit.f186387a;
            case 23:
                KProperty[] kPropertyArr = CarSearchScreen.c0;
                return (i) ((p) ((CarSearchScreen) obj2).Y.getValue()).i.get();
            case 24:
                KProperty[] kPropertyArr2 = PenContributionScreen.Z;
                return (uoc.g) ((dmc.j) ((PenContributionScreen) obj2).W.getValue()).e.get();
            case 25:
                return new v(((w) obj2).f281781c);
            case 26:
                return new up0.s(((d0) obj2).e());
            case 27:
                KProperty[] kPropertyArr3 = CustomBillScreen.f79238d0;
                return (up9.c) ((gp9.f) ((CustomBillScreen) obj2).X.getValue()).e.get();
            case 28:
                ((l) obj2).f281937s.f194072c = false;
                return Unit.f186387a;
            default:
                return (uqf.a) ((lpf.f) ((ReferenceFlow) obj2).P.getValue()).d.get();
        }
    }
}
