package ox5;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.AirportLoungesPassRefundScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.power_of_attorney.PowerOfAttorneyScreen;
import ip0.ck0;
import ip0.yj0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230604a;

    public /* synthetic */ p(int i) {
        this.f230604a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f230604a) {
            case 0:
                return new ReferralContactDelegate();
            case 1:
                return new LargeActionButtonDelegate();
            case 2:
                return new SingleChoiceDelegate();
            case 3:
                return new RowDelegate(null, null, 7);
            case 4:
                return new FixedTabsDelegate();
            case 5:
                return new RewardDelegate(1);
            case 6:
                return new ActionCardDelegate();
            case 7:
                return new SmallStockCardDelegate();
            case 8:
                return new SmallCardLoadingDelegate(null);
            case 9:
                return new RewardsGridDelegate();
            case 10:
                return new FullScreenStateDelegate();
            case 11:
                KProperty[] kPropertyArr = InvoiceDetailsScreen.Z;
                return new CellDetailsDelegate();
            case 12:
                KProperty[] kPropertyArr2 = InvoiceDetailsScreen.Z;
                return new CellDetailsChevronDelegate();
            case 13:
                KProperty[] kPropertyArr3 = InvoiceDetailsScreen.Z;
                return new FullScreenStateDelegate();
            case 14:
                KProperty[] kPropertyArr4 = InvoiceDetailsScreen.Z;
                return new RowDelegate(null, null, 7);
            case 15:
                KProperty[] kPropertyArr5 = InvoiceDetailsScreen.Z;
                return new ListSubheaderDelegate();
            case 16:
                KProperty[] kPropertyArr6 = InvoiceDetailsScreen.Z;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr7 = InvoiceDetailsScreen.Z;
                return new CellDetailsActionDelegate();
            case 18:
                KProperty[] kPropertyArr8 = InvoiceDetailsScreen.Z;
                return new CellDetailsTotalDelegate();
            case 19:
                List listK = zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_lock_closed, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.topup_cards_view_hint_saved_securely, null, null, 14));
                m70.a.t(kotlin.jvm.internal.t0.f186434a);
                CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                ck0 ck0Var = new ck0(yj0.START);
                int i = R$attr.uikit_dp0;
                return new TextDelegate.Model("LIST_ITEM_HINT", compositeClause, false, ck0Var, null, null, i, i, 0, 0, 1652);
            case 20:
                KProperty[] kPropertyArr9 = AirportLoungesHomeHelpScreen.R;
                return new RowDelegate(null, null, 7);
            case 21:
                return new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.referrals_search_quick_action_no_reward_subtitle, null, null, 14);
            case 22:
                int i2 = AirportLoungesPassRefundScreen.W;
                return new CellDetailsActionDelegate();
            case 23:
                int i3 = AirportLoungesPassRefundScreen.W;
                return new RowDelegate(null, null, 7);
            case 24:
                return ozc.h.AMOUNT;
            case 25:
                return ozc.h.AMOUNT;
            case 26:
                return ozc.h.AMOUNT;
            case 27:
                KProperty[] kPropertyArr10 = PowerOfAttorneyScreen.f0;
                return new RowDelegate(null, null, 7);
            case 28:
                KProperty[] kPropertyArr11 = PowerOfAttorneyScreen.f0;
                return new ListCellDelegate();
            default:
                KProperty[] kPropertyArr12 = PowerOfAttorneyScreen.f0;
                return new PlainTextDelegate();
        }
    }
}
