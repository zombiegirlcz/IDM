package z8k;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsGifDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.SubscriptionDetailsActivity;
import com.revolut.retail.feature.crypto.disclaimer.api.R$string;
import com.revolut.retail.feature.crypto.prelaunch.impl.ui.details.CryptoPreLaunchDetailsScreen;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320185a;

    public /* synthetic */ i(int i) {
        this.f320185a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f320185a) {
            case 0:
                PeerToPeerAmountScreen.a aVar = PeerToPeerAmountScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 1:
                PeerToPeerAmountScreen.a aVar2 = PeerToPeerAmountScreen.Companion;
                return new HighlightTileDelegate();
            case 2:
                PeerToPeerAmountScreen.a aVar3 = PeerToPeerAmountScreen.Companion;
                return new TextDelegate();
            case 3:
                Object obj2 = z9j.f.f320508a;
                return zhm.v.k(new z9j.g(new TextLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_execution_models_title, null, null, 14), new HtmlLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_execution_models_description, (List) null, (Integer) null, (Object) null, 30)), new z9j.g(new TextLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_revoluts_role_title, null, null, 14), new HtmlLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_revoluts_role_description, (List) null, (Integer) null, (Object) null, 30)), new z9j.g(new TextLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_trading_fees_title, null, null, 14), new HtmlLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_trading_fees_description, (List) null, (Integer) null, (Object) null, 30)), new z9j.g(new TextLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_limitations_title, null, null, 14), new HtmlLocalisedClause(R$string.crypto_disclaimer_retail_revolut_x_screen_limitations_description, (List) null, (Integer) null, (Object) null, 30)));
            case 4:
                return new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").toFormatter();
            case 5:
                int i = jli.h.f175850a;
                return Unit.f186387a;
            case 6:
                int i2 = SubscriptionDetailsActivity.W0;
                return new ListSubheaderDelegate();
            case 7:
                int i3 = SubscriptionDetailsActivity.W0;
                return new LargeActionButtonDelegate();
            case 8:
                int i5 = SubscriptionDetailsActivity.W0;
                return new CellDetailsActionDelegate();
            case 9:
                int i6 = SubscriptionDetailsActivity.W0;
                return new SingleChoiceDelegate();
            case 10:
                int i21 = SubscriptionDetailsActivity.W0;
                return new InputChecklistDelegate();
            case 11:
                int i22 = SubscriptionDetailsActivity.W0;
                return new TwinHorizontalButtonDelegate();
            case 12:
                int i32 = SubscriptionDetailsActivity.W0;
                return new ActionWidgetDelegate();
            case 13:
                int i33 = SubscriptionDetailsActivity.W0;
                return new CellDetailsNoteDelegate();
            case 14:
                int i43 = SubscriptionDetailsActivity.W0;
                return new CellDetailsChevronDelegate();
            case 15:
                int i59 = SubscriptionDetailsActivity.W0;
                return new CellDetailsSwitcherDelegate();
            case 16:
                int i66 = SubscriptionDetailsActivity.W0;
                return new PlainTextDelegate();
            case 17:
                int i74 = SubscriptionDetailsActivity.W0;
                return new CellDetailsGifDelegate();
            case 18:
                int i92 = SubscriptionDetailsActivity.W0;
                return new CellDetailsDelegate();
            case 19:
                int i96 = SubscriptionDetailsActivity.W0;
                return new ActionsDelegate();
            case 20:
                int i99 = SubscriptionDetailsActivity.W0;
                return new RowDelegate(null, null, 7);
            case 21:
                int i100 = SubscriptionDetailsActivity.W0;
                return new AccountCellItemDelegate();
            case 22:
                int i101 = SubscriptionDetailsActivity.W0;
                return new CellDetailsActionableIconDelegate();
            case 23:
                int i102 = SubscriptionDetailsActivity.W0;
                return new PlainTextWarningDelegate();
            case 24:
                int i103 = SubscriptionDetailsActivity.W0;
                return new ErrorDelegate();
            case 25:
                int i104 = SubscriptionDetailsActivity.W0;
                return new DatePickerDelegate();
            case 26:
                int i105 = SubscriptionDetailsActivity.W0;
                return new LargeActionButtonDelegate();
            case 27:
                int i106 = SubscriptionDetailsActivity.W0;
                return new CellDetailsAccountDelegate();
            case 28:
                int i107 = jli.h.f175850a;
                return Unit.f186387a;
            default:
                KProperty[] kPropertyArr = CryptoPreLaunchDetailsScreen.T;
                return new FullScreenStateDelegate();
        }
    }
}
