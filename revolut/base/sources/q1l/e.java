package q1l;

import android.os.Handler;
import android.os.Looper;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.ApmNewContactScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transactions_list.mapped.ApmTransactionOnlyListScreen;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationController;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import q50.k;
import qlm.v1;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241472a;

    public /* synthetic */ e(int i) {
        this.f241472a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f241472a) {
            case 0:
                return new qlm.e(v1.f247718a);
            case 1:
                KProperty[] kPropertyArr = ApmNewContactScreen.W;
                return new FixedTabsDelegate();
            case 2:
                KProperty[] kPropertyArr2 = ApmNewContactScreen.W;
                return new RowDelegate(null, null, 7);
            case 3:
                KProperty[] kPropertyArr3 = ApmNewContactScreen.W;
                return new InputTextDelegate(null);
            case 4:
                KProperty[] kPropertyArr4 = ApmNewContactScreen.W;
                return new PhoneEditorDelegate();
            case 5:
                KProperty[] kPropertyArr5 = CardDeliveryAddressVerificationController.W;
                return new MapPlainDelegate();
            case 6:
                KProperty[] kPropertyArr6 = CardDeliveryAddressVerificationController.W;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr7 = CardDeliveryAddressVerificationController.W;
                return new LargeActionButtonDelegate();
            case 8:
                KProperty[] kPropertyArr8 = CardDeliveryAddressVerificationController.W;
                return new RowDelegate(null, null, 7);
            case 9:
                return Unit.f186387a;
            case 10:
                return new TextDelegate();
            case 11:
                return new SmallActionButtonDelegate();
            case 12:
                return new ScrollerBoxDelegate(u.c(new QrCodePlainDelegate()));
            case 13:
                KProperty[] kPropertyArr9 = TravelExperiencesVisitorsSelectionScreen.f93166e0;
                return new CellIncrementDelegate();
            case 14:
                KProperty[] kPropertyArr10 = TravelExperiencesVisitorsSelectionScreen.f93166e0;
                return new TextDelegate();
            case 15:
                KProperty[] kPropertyArr11 = ApmTransactionOnlyListScreen.V;
                return new RowDelegate(null, null, 7);
            case 16:
                KProperty[] kPropertyArr12 = ApmTransactionOnlyListScreen.V;
                return new FullScreenStateDelegate();
            case 17:
                KProperty[] kPropertyArr13 = SelectorScreen.f65290n0;
                return new Handler(Looper.getMainLooper());
            case 18:
                KProperty[] kPropertyArr14 = SelectorScreen.f65290n0;
                return new RowDelegate(null, null, 7);
            case 19:
                KProperty[] kPropertyArr15 = SelectorScreen.f65290n0;
                return new ListSubheaderDelegate();
            case 20:
                KProperty[] kPropertyArr16 = SelectorScreen.f65290n0;
                return new FullScreenStateDelegate();
            case 21:
                KProperty[] kPropertyArr17 = SelectorScreen.f65290n0;
                return new LargeActionButtonDelegate();
            case 22:
                KProperty[] kPropertyArr18 = SelectorScreen.f65290n0;
                return new TextDelegate();
            case 23:
                KProperty[] kPropertyArr19 = SelectorScreen.f65290n0;
                return new PermissionDelegate();
            case 24:
                KProperty[] kPropertyArr20 = SelectorScreen.f65290n0;
                return new NotificationCentreItemDelegate();
            case 25:
                KProperty[] kPropertyArr21 = PaymentsSearchScreen.f80124a0;
                return new BannerDelegate();
            case 26:
                KProperty[] kPropertyArr22 = PaymentsSearchScreen.f80124a0;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr23 = PaymentsSearchScreen.f80124a0;
                return new ReferralContactDelegate();
            case 28:
                KProperty[] kPropertyArr24 = PaymentsSearchScreen.f80124a0;
                return new ActionsDelegate();
            default:
                k.b bVar = k.Companion;
                return new qlm.e(v1.f247718a);
        }
    }
}
