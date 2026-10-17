package d8j;

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
import com.revolut.core.ui_kit.delegates.CellDetailsPhotoDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.PixCopyPasteCodeInputScreen;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreen;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsController;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112284a;

    public /* synthetic */ b(int i) {
        this.f112284a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f112284a) {
            case 0:
                KProperty[] kPropertyArr = BaseCryptoAssetDetailsScreen.Y;
                return new ListSubheaderDelegate();
            case 1:
                KProperty[] kPropertyArr2 = BaseCryptoAssetDetailsScreen.Y;
                return new CellDetailsDelegate();
            case 2:
                KProperty[] kPropertyArr3 = BaseCryptoAssetDetailsScreen.Y;
                return new CellDetailsActionDelegate();
            case 3:
                KProperty[] kPropertyArr4 = BaseCryptoAssetDetailsScreen.Y;
                return new RowDelegate(null, null, 7);
            case 4:
                KProperty[] kPropertyArr5 = BaseCryptoAssetDetailsScreen.Y;
                return new HeaderDelegate();
            case 5:
                PixCopyPasteCodeInputScreen.Companion aVar = PixCopyPasteCodeInputScreen.INSTANCE;
                return new InputTextDelegate(null);
            case 6:
                PixCopyPasteCodeInputScreen.Companion aVar2 = PixCopyPasteCodeInputScreen.INSTANCE;
                return new TextDelegate();
            case 7:
                PixCopyPasteCodeInputScreen.Companion aVar3 = PixCopyPasteCodeInputScreen.INSTANCE;
                return new LargeActionButtonDelegate();
            case 8:
                return new LargeActionButtonDelegate();
            case 9:
                KProperty[] kPropertyArr6 = PixQrRequestScreen.U;
                return new CellDetailsActionDelegate();
            case 10:
                KProperty[] kPropertyArr7 = PixQrRequestScreen.U;
                return new CellDetailsNoteDelegate();
            case 11:
                KProperty[] kPropertyArr8 = PixQrRequestScreen.U;
                return new FullScreenStateDelegate();
            case 12:
                KProperty[] kPropertyArr9 = PixQrRequestScreen.U;
                return new ActionsDelegate();
            case 13:
                KProperty[] kPropertyArr10 = SubscriptionDetailsController.j0;
                return new LargeActionButtonDelegate();
            case 14:
                KProperty[] kPropertyArr11 = SubscriptionDetailsController.j0;
                return new CellDetailsAccountDelegate();
            case 15:
                KProperty[] kPropertyArr12 = SubscriptionDetailsController.j0;
                return new ActionWidgetDelegate();
            case 16:
                KProperty[] kPropertyArr13 = SubscriptionDetailsController.j0;
                return new ListSubheaderDelegate();
            case 17:
                KProperty[] kPropertyArr14 = SubscriptionDetailsController.j0;
                return new CellDetailsActionDelegate();
            case 18:
                KProperty[] kPropertyArr15 = SubscriptionDetailsController.j0;
                return new CellDetailsNoteDelegate();
            case 19:
                KProperty[] kPropertyArr16 = SubscriptionDetailsController.j0;
                return new CellDetailsChevronDelegate();
            case 20:
                KProperty[] kPropertyArr17 = SubscriptionDetailsController.j0;
                return new CellDetailsSwitcherDelegate();
            case 21:
                KProperty[] kPropertyArr18 = SubscriptionDetailsController.j0;
                return new RowDelegate(null, null, 7);
            case 22:
                KProperty[] kPropertyArr19 = SubscriptionDetailsController.j0;
                return new CellDetailsGifDelegate();
            case 23:
                KProperty[] kPropertyArr20 = SubscriptionDetailsController.j0;
                return new CellDetailsDelegate();
            case 24:
                KProperty[] kPropertyArr21 = SubscriptionDetailsController.j0;
                return new ActionsDelegate();
            case 25:
                KProperty[] kPropertyArr22 = SubscriptionDetailsController.j0;
                return new AccountCellItemDelegate();
            case 26:
                KProperty[] kPropertyArr23 = SubscriptionDetailsController.j0;
                return new PlainTextDelegate();
            case 27:
                KProperty[] kPropertyArr24 = SubscriptionDetailsController.j0;
                return new CellDetailsPhotoDelegate();
            case 28:
                KProperty[] kPropertyArr25 = SubscriptionDetailsController.j0;
                return new CellDetailsActionableIconDelegate();
            default:
                KProperty[] kPropertyArr26 = SubscriptionDetailsController.j0;
                return new PlainTextWarningDelegate();
        }
    }
}
