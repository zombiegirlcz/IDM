package gaa;

import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListController;
import com.revolut.feature.extension_auth.impl.ui.ExtensionAuthActivity;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreen;
import com.revolut.feature.onboarding.impl.user_migration.terms.UserMigrationTermsScreen;
import com.revolut.feature.pay_later.impl.ui.planslist.PayLaterPlansListScreen;
import com.revolut.feature.pix.impl.flow.refund.screen.amount.PixRefundAmountScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.plan_sharing.PlanSharingBottomSheet;
import gaf.l;
import gfb.d;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import qlm.h0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142115a;

    public /* synthetic */ b(int i) {
        this.f142115a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        switch (this.f142115a) {
            case 0:
                return new LargeActionButtonDelegate();
            case 1:
                Lazy lazy = gc5.a.f142335a;
                return ue0.e.b(Json.d, new l(i));
            case 2:
                PixRefundAmountScreen.a aVar = PixRefundAmountScreen.Companion;
                return new LargeActionButtonDelegate();
            case 3:
                PixRefundAmountScreen.a aVar2 = PixRefundAmountScreen.Companion;
                return new TextDelegate();
            case 4:
                PixRefundAmountScreen.a aVar3 = PixRefundAmountScreen.Companion;
                return new InputTextDelegate(null);
            case 5:
                PixRefundAmountScreen.a aVar4 = PixRefundAmountScreen.Companion;
                return new RowLoadingDelegate();
            case 6:
                KProperty[] kPropertyArr = IDealAccountsListController.U;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr2 = IDealAccountsListController.U;
                return new LargeActionButtonDelegate();
            case 8:
                KProperty[] kPropertyArr3 = UserMigrationTermsScreen.R;
                return new RowDelegate(null, null, 7);
            case 9:
                return gdl.e.Companion.serializer();
            case 10:
                return j1.b("com.revolut.shared.feature.wealth.domain.impl.data.network.model.buy_block.BuyBlockStateDto", gdl.e.values());
            case 11:
                int i2 = ExtensionAuthActivity.f72196w0;
                return new ErrorDelegate();
            case 12:
                return new qlm.e(gf7.i.f143362a);
            case 13:
                return new qlm.e(gf7.l.f143366a);
            case 14:
                return new qlm.e(v1.f247718a);
            case 15:
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 16:
                d.b bVar = gfb.d.Companion;
                return new qlm.e(gfb.a.f143382a);
            case 17:
                return new PromptMarketingContentDelegate();
            case 18:
                return new PromptMarketingContentDelegate();
            case 19:
                return j1.b("com.revolut.feature.retail.salary_account.impl.switch_assistant.domain.SalarySwitchAssistantMethod", ghb.b.values());
            case 20:
                return j1.b("com.revolut.feature.retail.salary_account.impl.switch_assistant.domain.SalarySwitchAssistantStatus", ghb.d.values());
            case 21:
                int i3 = PlanSharingBottomSheet.U;
                return new LargeActionButtonDelegate();
            case 22:
                KProperty[] kPropertyArr4 = CFACInsuranceSelectExpensesScreen.c0;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
            case 23:
                KProperty[] kPropertyArr5 = CFACInsuranceSelectExpensesScreen.c0;
                return new FullScreenStateDelegate();
            case 24:
                KProperty[] kPropertyArr6 = PayLaterPlansListScreen.f0;
                return new RowDelegate(null, null, 7);
            case 25:
                KProperty[] kPropertyArr7 = PayLaterPlansListScreen.f0;
                return new FullScreenStateDelegate();
            case 26:
                KProperty[] kPropertyArr8 = PayLaterPlansListScreen.f0;
                return new LargeActionButtonDelegate();
            case 27:
                return j1.b("com.revolut.feature.product_catalogue.api.State", bla.c.values());
            case 28:
                return new h0(v1.f247718a, j1.b("com.revolut.feature.product_catalogue.api.State", bla.c.values()), 1);
            default:
                return new h0(v1.f247718a, gla.a.f144582a, 1);
        }
    }
}
