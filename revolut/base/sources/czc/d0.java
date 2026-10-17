package czc;

import androidx.compose.animation.core.TransitionKt;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreen;
import com.revolut.feature.selfserve.sot.impl.ui.summary.SummaryFragment;
import com.revolut.feature.selfserve.sow.impl.ui.home.SowHomeActivity;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110192a;

    public /* synthetic */ d0(int i) {
        this.f110192a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f110192a) {
            case 0:
                int i = SummaryFragment.f85951h0;
                return new CellDetailsNoteDelegate();
            case 1:
                int i2 = SummaryFragment.f85951h0;
                return new RowDelegate(null, null, 7);
            case 2:
                KProperty[] kPropertyArr = SowHomeActivity.z0;
                return new ErrorDelegate();
            case 3:
                KProperty[] kPropertyArr2 = SowHomeActivity.z0;
                return new RowDelegate(null, null, 7);
            case 4:
                return TransitionKt.SeekableStateObserver_delegate$lambda$0();
            case 5:
                KProperty[] kPropertyArr3 = TravelExperienceQuestionsScreen.i0;
                return new ListSubheaderDelegate();
            case 6:
                KProperty[] kPropertyArr4 = TravelExperienceQuestionsScreen.i0;
                return new PickerDelegate();
            case 7:
                KProperty[] kPropertyArr5 = TravelExperienceQuestionsScreen.i0;
                return new LargeActionButtonDelegate();
            case 8:
                KProperty[] kPropertyArr6 = TravelExperienceQuestionsScreen.i0;
                return new SingleChoiceDelegate();
            case 9:
                KProperty[] kPropertyArr7 = TravelExperienceQuestionsScreen.i0;
                return new TimePickerDelegate();
            case 10:
                return Class.forName("android.os.SystemProperties");
            case 11:
                KProperty[] kPropertyArr8 = PromptMarketingScreen.W;
                return new d67.v();
            case 12:
                return Unit.f186387a;
            case 13:
                CommodityAssetDetailsScreen.Companion companion = CommodityAssetDetailsScreen.INSTANCE;
                return new TrendViewDelegate(1000L);
            case 14:
                CommodityAssetDetailsScreen.Companion companion2 = CommodityAssetDetailsScreen.INSTANCE;
                return new FixedTabsDelegate();
            case 15:
                CommodityAssetDetailsScreen.Companion companion3 = CommodityAssetDetailsScreen.INSTANCE;
                return new TabsDelegate();
            case 16:
                CommodityAssetDetailsScreen.Companion companion4 = CommodityAssetDetailsScreen.INSTANCE;
                return new TextDelegate();
            case 17:
                CommodityAssetDetailsScreen.Companion companion5 = CommodityAssetDetailsScreen.INSTANCE;
                return new LargeActionButtonDelegate();
            case 18:
                CommodityAssetDetailsScreen.Companion companion6 = CommodityAssetDetailsScreen.INSTANCE;
                return new LargeActionButtonDelegate();
            case 19:
                return new go.g(null, 2);
            case 20:
                KProperty[] kPropertyArr9 = PayNowQrScreen.S;
                return new CircleActionButtonsBarDelegate();
            case 21:
                int i3 = jli.h.f175850a;
                return Unit.f186387a;
            case 22:
                KProperty[] kPropertyArr10 = CommodityOrderEditScreen.W;
                return vkm.q.c(null);
            case 23:
                KProperty[] kPropertyArr11 = CommodityOrderEditScreen.W;
                return new CellDetailsActionDelegate();
            case 24:
                KProperty[] kPropertyArr12 = CommodityOrderEditScreen.W;
                return new FullScreenStateDelegate();
            case 25:
                return vkm.q.c(null);
            case 26:
                int i5 = ExpiringCardsBottomSheetScreen.V;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr13 = BaseCryptoAssetDetailsScreen.Y;
                return new TrendViewDelegate(1000L);
            case 28:
                KProperty[] kPropertyArr14 = BaseCryptoAssetDetailsScreen.Y;
                return new FixedTabsDelegate();
            default:
                KProperty[] kPropertyArr15 = BaseCryptoAssetDetailsScreen.Y;
                return new TabsDelegate();
        }
    }
}
