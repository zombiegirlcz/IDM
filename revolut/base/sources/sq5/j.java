package sq5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselController;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerController;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.RevPointsGiftcardsDownloadScreen;
import com.revolut.feature.selfserve.sot.impl.ui.document.list.SotDocumentListFragment;
import com.revolut.feature.statements.api.models.ContractSummaryType;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.transfer.core.impl.ui.reference.ReferenceScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreen;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreen;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import sue.a;
import sue.d;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265010a;

    public /* synthetic */ j(int i) {
        this.f265010a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f265010a) {
            case 0:
                KProperty[] kPropertyArr = CryptoAddressHostingPickerController.U;
                return new RowDelegate(null, null, 7);
            case 1:
                KProperty[] kPropertyArr2 = CryptoAddressHostingPickerController.U;
                return new ListSubheaderDelegate();
            case 2:
                KProperty[] kPropertyArr3 = CryptoAddressHostingPickerController.U;
                return new FixedTabsDelegate();
            case 3:
                KProperty[] kPropertyArr4 = CryptoAddressHostingPickerController.U;
                return new FullScreenStateDelegate();
            case 4:
                KProperty[] kPropertyArr5 = ReferenceScreen.f92217b0;
                return new InputTextDelegate(null);
            case 5:
                return "Can't run FinishCommand with Application context";
            case 6:
                return "Can't run FinishFlowCommand with Application context";
            case 7:
                KProperty[] kPropertyArr6 = CreditCardInstalmentRepayChooseAmountScreen.X;
                return new FullScreenStateDelegate();
            case 8:
                KProperty[] kPropertyArr7 = CreditCardInstalmentRepayChooseAmountScreen.X;
                return new LargeActionButtonDelegate();
            case 9:
                d.b bVar = sue.d.Companion;
                return new qlm.e(a.C1490a.f265722a);
            case 10:
                KProperty[] kPropertyArr8 = AsftTerminalSelectionScreen.S;
                return new FullScreenStateDelegate();
            case 11:
                KProperty[] kPropertyArr9 = AsftTerminalSelectionScreen.S;
                return new ExtraLargeListingCardDelegate();
            case 12:
                return new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            case 13:
                KProperty[] kPropertyArr10 = TutorialScreen.S;
                return new TrendViewDelegate(0L);
            case 14:
                List listK = v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorBlue), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorBackground), 2.0f, 2.0f, 2.0f, 2.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_16_plus, Integer.valueOf(R$attr.uikit_colorBlue), 3.0f, 3.0f, 3.0f, 3.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64));
                Float fValueOf = Float.valueOf(16.0f);
                return new LayeredImage(listK, fValueOf, fValueOf, 8);
            case 15:
                KProperty[] kPropertyArr11 = RevPointsGiftcardsDownloadScreen.U;
                return new FullScreenStateDelegate();
            case 16:
                KProperty[] kPropertyArr12 = RevPointsGiftcardsDownloadScreen.U;
                return new RowLoadingDelegate();
            case 17:
                KProperty[] kPropertyArr13 = RevPointsGiftcardsDownloadScreen.U;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr14 = RevPointsGiftcardsDownloadScreen.U;
                return new ListSubheaderDelegate();
            case 19:
                CardDesignCarouselController.a aVar = CardDesignCarouselController.Companion;
                return new FullScreenStateDelegate();
            case 20:
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 21:
                return new Data(null, null, false, 7, null);
            case 22:
                KProperty[] kPropertyArr15 = AirportLoungeDetailsScreen.f99103d0;
                return new ListSubheaderDelegate();
            case 23:
                KProperty[] kPropertyArr16 = AirportLoungeDetailsScreen.f99103d0;
                return new FullScreenStateDelegate();
            case 24:
                KProperty[] kPropertyArr17 = AirportLoungeDetailsScreen.f99103d0;
                return new CellDetailsNoteDelegate();
            case 25:
                int i = SotDocumentListFragment.f85907h0;
                return new RowDelegate(null, null, 7);
            case 26:
                return r0.k(new Pair("CRYPTO", StatementProductType.CRYPTO), new Pair("SAVINGS", StatementProductType.SAVINGS), new Pair("JOINT_SAVINGS", StatementProductType.JOINT_SAVINGS), new Pair("STOCK", StatementProductType.STOCK), new Pair("TAX_ADVANTAGED_INVESTING", StatementProductType.TAX_ADVANTAGED_INVESTING), new Pair("COMMODITIES", StatementProductType.COMMODITIES), new Pair("PERSONAL_CURRENT", StatementProductType.PERSONAL_CURRENT), new Pair("JOINT_CURRENT", StatementProductType.JOINT_CURRENT));
            case 27:
                return r0.k(new Pair("PERSONAL_CURRENT", ContractSummaryType.PERSONAL_CURRENT), new Pair("JOINT_CURRENT", ContractSummaryType.JOINT_CURRENT), new Pair("ELECTRONIC_BANKING", ContractSummaryType.ELECTRONIC_BANKING));
            case 28:
                return pz8.g.Companion.serializer();
            default:
                return new qlm.e(sz8.a.f266775a);
        }
    }
}
