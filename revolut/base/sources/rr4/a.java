package rr4;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.card.impl.ui.instalment.agreement.CreditCardInstalmentAgreementScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsController;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.checkout.RevPointsGiftcardCheckoutScreen;
import com.revolut.feature.salary_switch.impl.ui.screen.share_details.ShareSalaryDetailsScreen;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import rue.a;
import rwg.s;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256680a;

    public /* synthetic */ a(int i) {
        this.f256680a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f256680a) {
            case 0:
                KProperty[] kPropertyArr = CreditCardInstalmentAgreementScreen.S;
                return new InputChecklistDelegate();
            case 1:
                KProperty[] kPropertyArr2 = ShareSalaryDetailsScreen.X;
                return new HeroBannerDelegate(0);
            case 2:
                KProperty[] kPropertyArr3 = ShareSalaryDetailsScreen.X;
                return new ActionWidgetDelegate();
            case 3:
                KProperty[] kPropertyArr4 = CreditCardLimitSettingsController.T;
                return new RowDelegate(null, null, 7);
            case 4:
                KProperty[] kPropertyArr5 = CreditCardLimitSettingsController.T;
                return new FullScreenStateDelegate();
            case 5:
                KProperty[] kPropertyArr6 = CreditCardLimitSettingsController.T;
                return new LargeActionButtonDelegate();
            case 6:
                KProperty[] kPropertyArr7 = InvestAccountSelectorScreen.X;
                return new AccountCellItemDelegate();
            case 7:
                KProperty[] kPropertyArr8 = InvestAccountSelectorScreen.X;
                return new ListSubheaderDelegate();
            case 8:
                KProperty[] kPropertyArr9 = InvestAccountSelectorScreen.X;
                return new ListSubheaderLoadingDelegate();
            case 9:
                KProperty[] kPropertyArr10 = InvestAccountSelectorScreen.X;
                return new RowLoadingDelegate();
            case 10:
                KProperty[] kPropertyArr11 = InvestAccountSelectorScreen.X;
                return new TextDelegate();
            case 11:
                KProperty[] kPropertyArr12 = InvestAccountSelectorScreen.X;
                return new FullScreenStateDelegate();
            case 12:
                ActivityScreen.a aVar = ActivityScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 13:
                ActivityScreen.a aVar2 = ActivityScreen.Companion;
                return new RowLoadingDelegate();
            case 14:
                ActivityScreen.a aVar3 = ActivityScreen.Companion;
                return new FullScreenStateDelegate();
            case 15:
                ActivityScreen.a aVar4 = ActivityScreen.Companion;
                return new FixedTabsDelegate();
            case 16:
                return new qlm.e(rub.d.f257512a);
            case 17:
                return new qlm.e(rub.g.f257516a);
            case 18:
                a.e.Companion bVar = a.e.INSTANCE;
                return new qlm.e(a.b.C1422a.f257536a);
            case 19:
                return new qlm.e(ruj.d.f257570a);
            case 20:
                return new qlm.e(ruj.g.f257574a);
            case 21:
                return new qlm.e(rwa.c.f257863a);
            case 22:
                return new qlm.e(rwa.f.f257866a);
            case 23:
                int i = RevPointsGiftcardCheckoutScreen.Y;
                return new FullScreenStateDelegate();
            case 24:
                int i2 = RevPointsGiftcardCheckoutScreen.Y;
                return new RowLoadingDelegate();
            case 25:
                int i3 = RevPointsGiftcardCheckoutScreen.Y;
                return new RoomPreviewCardDelegate();
            case 26:
                int i5 = RevPointsGiftcardCheckoutScreen.Y;
                return new CellDetailsDelegate();
            case 27:
                return new qlm.e(rwg.a.f257904a);
            case 28:
                return new qlm.e(s.f257941a);
            default:
                return new qlm.e(rwg.m.f257933a);
        }
    }
}
