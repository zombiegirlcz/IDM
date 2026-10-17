package x1e;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.pending.ApmPendingScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsScreen;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreen;
import com.revolut.feature_exchange.impl.ui.order_details.screen.OrderDetailsActivity;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302373a;

    public /* synthetic */ g(int i) {
        this.f302373a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f302373a) {
            case 0:
                return new qlm.e(k.f302384a);
            case 1:
                return new qlm.e(n.f302388a);
            case 2:
                return new qlm.e(v1.f247718a);
            case 3:
                return new qlm.e(t.f302395a);
            case 4:
                KProperty[] kPropertyArr = TravelExperiencesCheckoutScreen.c0;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr2 = TravelExperiencesCheckoutScreen.c0;
                return new TextDelegate();
            case 6:
                KProperty[] kPropertyArr3 = TravelExperiencesCheckoutScreen.c0;
                return new AttributeSelectorSmallDelegate();
            case 7:
                KProperty[] kPropertyArr4 = TravelExperiencesCheckoutScreen.c0;
                return new RowLoadingDelegate();
            case 8:
                KProperty[] kPropertyArr5 = TravelExperiencesCheckoutScreen.c0;
                return new ListSubheaderDelegate();
            case 9:
                KProperty[] kPropertyArr6 = TravelExperiencesCheckoutScreen.c0;
                return new RoomPreviewCardDelegate();
            case 10:
                KProperty[] kPropertyArr7 = TravelExperiencesCheckoutScreen.c0;
                return new CellDetailsDelegate();
            case 11:
                KProperty[] kPropertyArr8 = TravelExperiencesCheckoutScreen.c0;
                return new CellDetailsPriceDelegate();
            case 12:
                KProperty[] kPropertyArr9 = TravelExperiencesCheckoutScreen.c0;
                return new CellDetailsBadgeDelegate();
            case 13:
                KProperty[] kPropertyArr10 = ApmPendingScreen.T;
                return new ActionsLoadingDelegate();
            case 14:
                KProperty[] kPropertyArr11 = CardPersonalisationController.T;
                return new SuggestionsBarDelegate();
            case 15:
                int i = OrderDetailsActivity.E0;
                return new RowDelegate(null, null, 7);
            case 16:
                int i2 = OrderDetailsActivity.E0;
                return new HighlightTileDelegate();
            case 17:
                int i3 = OrderDetailsActivity.E0;
                return new ActionsDelegate();
            case 18:
                int i5 = OrderDetailsActivity.E0;
                return new CellDetailsActionDelegate();
            case 19:
                int i6 = OrderDetailsActivity.E0;
                return new LargeActionButtonDelegate();
            case 20:
                int i21 = OrderDetailsActivity.E0;
                return new PlainTextDelegate();
            case 21:
                int i22 = OrderDetailsActivity.E0;
                return new CellDetailsChevronDelegate();
            case 22:
                int i32 = OrderDetailsActivity.E0;
                return new TwinHorizontalButtonDelegate();
            case 23:
                KProperty[] kPropertyArr12 = TransferSettingsScreen.T;
                return new RowDelegate(null, null, 7);
            case 24:
                KProperty[] kPropertyArr13 = TransferSettingsScreen.T;
                return new CellDetailsActionDelegate();
            case 25:
                Provider.Companion bVar = Provider.INSTANCE;
                return x5a.b.Companion.serializer();
            case 26:
                return j1.b("com.revolut.feature.payments_migration.impl.models.providers.Provider.PaymentType", x5a.b.values());
            case 27:
                ProviderBlock.CardsHorizontalList.Companion bVar2 = ProviderBlock.CardsHorizontalList.INSTANCE;
                return new qlm.e(Provider.a.f80223a);
            case 28:
                ProviderBlock.CenterText.Companion bVar3 = ProviderBlock.CenterText.INSTANCE;
                return new qlm.e(ProviderBlock.CenterText.Link.a.f80233a);
            default:
                ProviderBlock.ExpandableVerticalList.Companion bVar4 = ProviderBlock.ExpandableVerticalList.INSTANCE;
                return new qlm.e(Provider.a.f80223a);
        }
    }
}
