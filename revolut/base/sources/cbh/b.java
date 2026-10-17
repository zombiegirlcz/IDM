package cbh;

import chc.l;
import chc.z;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen.AddOnsGoodbyeScreen;
import com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen.InvestTransactionsListScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.d1;
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22805a;

    public /* synthetic */ b(int i) {
        this.f22805a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22805a) {
            case 0:
                KProperty[] kPropertyArr = InvestTransactionsListScreen.Z;
                return new RowDelegate(null, null, 7);
            case 1:
                KProperty[] kPropertyArr2 = InvestTransactionsListScreen.Z;
                return new TextDelegate();
            case 2:
                KProperty[] kPropertyArr3 = InvestTransactionsListScreen.Z;
                return new FullScreenStateDelegate();
            case 3:
                KProperty[] kPropertyArr4 = InvestTransactionsListScreen.Z;
                return new LargeActionButtonDelegate();
            case 4:
                KProperty[] kPropertyArr5 = InvestTransactionsListScreen.Z;
                return new ListSubheaderDelegate();
            case 5:
                KProperty[] kPropertyArr6 = AddOnsGoodbyeScreen.j0;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr7 = AddOnsGoodbyeScreen.j0;
                return new FullScreenStateDelegate();
            case 7:
                KProperty[] kPropertyArr8 = AddOnsGoodbyeScreen.j0;
                return new ListSubheaderDelegate();
            case 8:
                KProperty[] kPropertyArr9 = AddOnsGoodbyeScreen.j0;
                return new RowLoadingDelegate();
            case 9:
                KProperty[] kPropertyArr10 = AddOnsGoodbyeScreen.j0;
                return new SuggestionsBarDelegate();
            case 10:
                KProperty[] kPropertyArr11 = AddOnsGoodbyeScreen.j0;
                return new LargeActionButtonDelegate();
            case 11:
                KProperty[] kPropertyArr12 = AddOnsGoodbyeScreen.j0;
                return new InputTextDelegate(null);
            case 12:
                KProperty[] kPropertyArr13 = CreditLinkedAccountsV2ListScreen.g0;
                return new ListSubheaderDelegate();
            case 13:
                KProperty[] kPropertyArr14 = CreditLinkedAccountsV2ListScreen.g0;
                return new RowDelegate(null, null, 7);
            case 14:
                KProperty[] kPropertyArr15 = CreditLinkedAccountsV2ListScreen.g0;
                return new LargeActionButtonDelegate();
            case 15:
                KProperty[] kPropertyArr16 = CreditLinkedAccountsV2ListScreen.g0;
                return new FullScreenStateDelegate();
            case 16:
                return zhm.f0.f322471a;
            case 17:
                KProperty[] kPropertyArr17 = FormDetailsScreen.S;
                return new CellDetailsDelegate();
            case 18:
                KProperty[] kPropertyArr18 = FormDetailsScreen.S;
                return new RowDelegate(null, null, 7);
            case 19:
                SharedFavouritesCounterpartChooserScreen.a aVar = SharedFavouritesCounterpartChooserScreen.Companion;
                return new RowLoadingDelegate();
            case 20:
                SharedFavouritesCounterpartChooserScreen.a aVar2 = SharedFavouritesCounterpartChooserScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 21:
                SharedFavouritesCounterpartChooserScreen.a aVar3 = SharedFavouritesCounterpartChooserScreen.Companion;
                return new FullScreenStateDelegate();
            case 22:
                return new qlm.e(v1.f247718a);
            case 23:
                return new qlm.e(chc.d.d);
            case 24:
                l.b.C0149b c0149b = l.b.Companion;
                return new qlm.e(v1.f247718a);
            case 25:
                return new d1("com.revolut.feature.rewards.impl.data.network.rent_and_bills.RentAndBillsConfigurationsDto.ConfigurationDto.PaymentEligibilityDto.Unknown", l.c.INSTANCE, new Annotation[0]);
            case 26:
                return new qlm.e(chc.a0.d);
            case 27:
                return new qlm.e(chc.r.f24176a);
            case 28:
                return new qlm.e(chc.a0.d);
            default:
                return new d1("com.revolut.feature.rewards.impl.data.network.rent_and_bills.RentAndBillsLinkedPaymentsDto.FaqItemDto.Unknown", z.d.INSTANCE, new Annotation[0]);
        }
    }
}
