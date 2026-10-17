package r1a;

import androidx.content.fragment.NavHostFragment;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.intro.ManualUnderwritingIntroScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion.AmountSuggestionScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.print.PrintDiscScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreen;
import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.SharedAlertDetailsFlow;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptControllerContract$InputData;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreen;
import com.revolut.feature.subscriptions.impl.block_future_payments.BlockFuturePaymentsFlow;
import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreen;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlow;
import com.revolut.kompot.common.flow.navigation.NavigationFlow;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetScreen;
import com.revolut.retail.feature.payment_options.impl.ui.flow.PaymentOptionsFlow;
import dw3.c4;
import dw3.i9;
import erj.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import mii.f;
import mii.k;
import ql7.c1;
import ql7.d1;
import ql7.m;
import r65.i;
import r6e.g;
import r88.n;
import raf.o;
import rm0.a0;
import rp0.p0;
import rq7.p;
import u45.i0;
import w4l.h;
import ybl.l;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f250936b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f250935a = i;
        this.f250936b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v141, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f250935a;
        int i2 = 2;
        final int i3 = 1;
        boolean z = false;
        Object[] objArr = 0;
        Continuation continuation = null;
        Object obj2 = this.f250936b;
        switch (i) {
            case 0:
                ((d) obj2).L2(new f("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, null, 124));
                return Unit.f186387a;
            case 1:
                return (r1k.a) ((q1k.b) ((PaymentOptionsFlow) obj2).P.getValue()).d.get();
            case 2:
                return NavHostFragment.navHostController_delegate$lambda$6((NavHostFragment) obj2);
            case 3:
                KProperty[] kPropertyArr = LoanSelectNewRepaymentDayScreen.f70404b0;
                return (i) ((i0) ((LoanSelectNewRepaymentDayScreen) obj2).Y.getValue()).d.get();
            case 4:
                ((n) obj2).f252398a.b(new fc7.f(new k("SUCCESS_COPY_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, 28)));
                return Unit.f186387a;
            case 5:
                KProperty[] kPropertyArr2 = GroupMembersScreen.f0;
                return (r8e.i) ((g) ((GroupMembersScreen) obj2).Y.getValue()).i.get();
            case 6:
                return (r9e.a) ((i9e.i) ((BlockFuturePaymentsFlow) obj2).P.getValue()).d.get();
            case 7:
                KProperty[] kPropertyArr3 = AmountSuggestionScreen.f72055e0;
                return (rb6.i) ((pa6.a) ((AmountSuggestionScreen) obj2).Y.getValue()).f234346c.get();
            case 8:
                ((com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a) obj2).X1(new mii.i("COPY_TRACKING_NUMBER_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_copied_to_clipboard, null, null, 14), null, null, 28));
                return Unit.f186387a;
            case 9:
                return Boolean.valueOf(((rc7.k) obj2).f253211a.e());
            case 10:
                KProperty[] kPropertyArr4 = ManualUnderwritingIntroScreen.f67954b0;
                return (rd4.g) ((c4) ((ManualUnderwritingIntroScreen) obj2).W.getValue()).f118507h.get();
            case 11:
                return (red.a) ((ned.d) ((SharedAlertDetailsFlow) obj2).P.getValue()).d.get();
            case 12:
                rf0.a aVar = (rf0.a) obj2;
                aVar.f253673a.b(aVar.f253674b);
                return Unit.f186387a;
            case 13:
                BillPaymentNavigation$BillData billPaymentNavigation$BillData = ((rh9.e) obj2).f254383l.d;
                return new sh9.b(billPaymentNavigation$BillData.f78667b, billPaymentNavigation$BillData.f78668c);
            case 14:
                KProperty[] kPropertyArr5 = GiveConsentScreen.f68473d0;
                return (ri4.i) ((i9) ((GiveConsentScreen) obj2).Y.getValue()).f118995h.get();
            case 15:
                NavigationFlow navigationFlow = (NavigationFlow) obj2;
                return czi.c.d(0, 2, new o(navigationFlow, 25), navigationFlow, navigationFlow.L);
            case 16:
                SlotDefaultPrompt.LayoutType layoutType = ((SlotManagerPromptControllerContract$InputData) obj2).f87376a.f87320b.d;
                int i5 = layoutType == null ? -1 : rld.d.f255017a[layoutType.ordinal()];
                if (i5 == -1) {
                    z = true;
                } else if (i5 != 1) {
                    if (i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                return new goi.i(z, 1);
            case 17:
                return ((a0) obj2).f255135b.a();
            case 18:
                KProperty[] kPropertyArr6 = PrintDiscScreen.f75517a0;
                return (rn7.e) ((d1) ((PrintDiscScreen) obj2).X.getValue()).f247273c.get();
            case 19:
                return (to0.d) ((rm0.k) obj2).invoke();
            case 20:
                KProperty[] kPropertyArr7 = CarManualInputScreen.f75555b0;
                return (ro7.i) ((m) ((CarManualInputScreen) obj2).X.getValue()).f247381c.get();
            case 21:
                rof.g gVar = (rof.g) obj2;
                ((rpi.b) gVar.f256004p).N(false);
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, gVar.k);
                return Unit.f186387a;
            case 22:
                return u.c(((p0) obj2).f256148b);
            case 23:
                KProperty[] kPropertyArr8 = BillsChooserScreen.g0;
                return (rp9.b) ((gp9.e) ((BillsChooserScreen) obj2).X.getValue()).f145371h.get();
            case 24:
                KProperty[] kPropertyArr9 = PolicySummaryScreen.j0;
                return (p) ((c1) ((PolicySummaryScreen) obj2).Y.getValue()).i.get();
            case 25:
                KProperty[] kPropertyArr10 = ImageGalleryScreen.R;
                return (rrg.d) ((mrg.a) ((ImageGalleryScreen) obj2).P.getValue()).f208121c.get();
            case 26:
                KProperty[] kPropertyArr11 = CategoryBudgetScreen.f101521e0;
                return (rrj.e) ((j) ((CategoryBudgetScreen) obj2).f101523b0.getValue()).d.get();
            case 27:
                final rsd.k kVar = (rsd.k) obj2;
                Flow flowE = boh.f.e(nim.a.u(new qkg.a(i2, 17, continuation), u0.m(u0.i(ybl.k.k(kVar.f, null, cfl.f.f23741a, cfl.k.f23744a, 1), rd0.e.b(osg.b.d(kVar.f257064a)), l.d(kVar.f257067g)), nim.a.v(kVar.f257070l.j(h.f294642c), new rpi.e(26)))), new Function1() { // from class: rsd.i
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:120:0x0250  */
                    /* JADX WARN: Removed duplicated region for block: B:187:0x0424  */
                    /* JADX WARN: Type inference failed for: r11v0 */
                    /* JADX WARN: Type inference failed for: r11v1 */
                    /* JADX WARN: Type inference failed for: r11v14, types: [zhm.f0] */
                    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r44) {
                        /*
                            Method dump skipped, instruction units count: 2066
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: rsd.i.invoke(java.lang.Object):java.lang.Object");
                    }
                });
                final Object[] objArr2 = objArr == true ? 1 : 0;
                return nim.a.v(flowE, new Function1() { // from class: rsd.i
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:120:0x0250  */
                    /* JADX WARN: Removed duplicated region for block: B:187:0x0424  */
                    /* JADX WARN: Type inference failed for: r11v0 */
                    /* JADX WARN: Type inference failed for: r11v1 */
                    /* JADX WARN: Type inference failed for: r11v14, types: [zhm.f0] */
                    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r44) {
                        /*
                            Method dump skipped, instruction units count: 2066
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: rsd.i.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            case 28:
                ssh.b bVar = (ssh.b) ((WidgetCustomisationFlow) obj2).T.getValue();
                return new rsh.b((ash.i) bVar.e.get(), (ish.b) bVar.f.get(), bVar.d);
            default:
                return (rt9.a) ((kr9.n) ((GroupQrScreen) obj2).S.getValue()).f188778c.get();
        }
    }
}
