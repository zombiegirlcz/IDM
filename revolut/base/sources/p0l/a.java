package p0l;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PropertyCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreen;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.info.CardPaymentMethodInfoScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.ReissuedPhysicalCardDialogScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector.DebtTypeSelectorController;
import com.revolut.feature.credit.loan.impl.ui.rev10.renameloan.RenameLoanScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer_friend.NewTransferFriendScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.AliasDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreen;
import com.revolut.feature_exchange.impl.ui.exchange_v2.recurring_order_settings.RecurringOrderSettingsActivityV2;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.StackedBreakdownActivity;
import com.revolut.retail.feature.pda.impl.ui.selection.SelectionPdaFragment;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.power_of_attorney.PowerOfAttorneyScreen;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import p6l.i;
import qlm.j1;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231548a;

    public /* synthetic */ a(int i) {
        this.f231548a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f231548a) {
            case 0:
                KProperty[] kPropertyArr = PowerOfAttorneyScreen.f0;
                return new LargeActionButtonDelegate();
            case 1:
                int i = RecurringOrderSettingsActivityV2.B0;
                return new InputTextDelegate(null);
            case 2:
                int i2 = RecurringOrderSettingsActivityV2.B0;
                return new DatePickerDelegate();
            case 3:
                int i3 = RecurringOrderSettingsActivityV2.B0;
                return new SingleChoiceDelegate();
            case 4:
                int i5 = RecurringOrderSettingsActivityV2.B0;
                return new LargeActionButtonDelegate();
            case 5:
                int i6 = RecurringOrderSettingsActivityV2.B0;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr2 = CardPaymentMethodInfoScreen.f65289a0;
                return new TextDelegate();
            case 7:
                KProperty[] kPropertyArr3 = NewTransferFriendScreen.c0;
                return new RowDelegate(null, null, 7);
            case 8:
                Lazy lazy = p4d.a.f232912a;
                return r0.k(new Pair("LAST_ADDED", ogd.d.LAST_ADDED), new Pair("ALPHABETICAL", ogd.d.ALPHABETICAL));
            case 9:
                int i21 = StackedBreakdownActivity.C0;
                return new LargeActionButtonDelegate();
            case 10:
                int i22 = StackedBreakdownActivity.C0;
                return new RowDelegate(null, null, 7);
            case 11:
                int i32 = StackedBreakdownActivity.C0;
                return new HighlightTileDelegate();
            case 12:
                int i33 = StackedBreakdownActivity.C0;
                return new CellDetailsDelegate();
            case 13:
                int i43 = StackedBreakdownActivity.C0;
                return new CellDetailsActionDelegate();
            case 14:
                int i59 = StackedBreakdownActivity.C0;
                return new ActionWidgetDelegate();
            case 15:
                int i66 = StackedBreakdownActivity.C0;
                return new BannerDelegate();
            case 16:
                int i74 = StackedBreakdownActivity.C0;
                return new TextDelegate();
            case 17:
                KProperty[] kPropertyArr4 = IrisSettingsScreen.S;
                return new CellDetailsChevronDelegate();
            case 18:
                KProperty[] kPropertyArr5 = IrisSettingsScreen.S;
                return new FullScreenStateDelegate();
            case 19:
                KProperty[] kPropertyArr6 = IrisSettingsScreen.S;
                return new RowDelegate(null, null, 7);
            case 20:
                i.b bVar = p6l.i.Companion;
                return j1.b("com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.models.SecurityOptionTypeDto", p6l.t.values());
            case 21:
                int i92 = ReissuedPhysicalCardDialogScreen.V;
                return new RowDelegate(null, null, 7);
            case 22:
                KProperty[] kPropertyArr7 = RenameLoanScreen.f70484b0;
                return new InputTextDelegate(null);
            case 23:
                KProperty[] kPropertyArr8 = DebtTypeSelectorController.S;
                return new RowDelegate(null, null, 7);
            case 24:
                KProperty[] kPropertyArr9 = AliasDetailsScreen.R;
                return new RowDelegate(null, null, 7);
            case 25:
                int i96 = SelectionPdaFragment.f102392h0;
                return new RowDelegate(null, null, 7);
            case 26:
                KProperty[] kPropertyArr10 = TravelHotelsPropertyDetailsScreen.i0;
                return new PropertyCardDelegate();
            case 27:
                KProperty[] kPropertyArr11 = TravelHotelsPropertyDetailsScreen.i0;
                return new PlainTextDelegate();
            case 28:
                KProperty[] kPropertyArr12 = TravelHotelsPropertyDetailsScreen.i0;
                return new ListSubheaderDelegate();
            default:
                KProperty[] kPropertyArr13 = TravelHotelsPropertyDetailsScreen.i0;
                return new CellDetailsActionListDelegate();
        }
    }
}
