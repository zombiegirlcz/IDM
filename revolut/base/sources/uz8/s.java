package uz8;

import androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.DefaultElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.RippleKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ShapesKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarKt;
import androidx.compose.material.TypographyKt;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameController;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.selfserve.sow.impl.ui.destination.SowIncomeDestinationFragment;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import uz8.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284643a;

    public /* synthetic */ s(int i) {
        this.f284643a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f284643a) {
            case 0:
                u.Companion bVar = u.INSTANCE;
                return new qlm.e(k.Companion.serializer());
            case 1:
                u.Companion bVar2 = u.INSTANCE;
                return zz8.c.INSTANCE.serializer();
            case 2:
                u.Companion bVar3 = u.INSTANCE;
                return r.Companion.serializer();
            case 3:
                int i = SowIncomeDestinationFragment.g0;
                return new InputChecklistDelegate();
            case 4:
                return DynamicRangeFormatComboRegistry.registries_delegate$lambda$0();
            case 5:
                return DynamicRangeFormatComboRegistry.standardMp4Audios_delegate$lambda$0();
            case 6:
                return DynamicRangeFormatComboRegistry.standardWebmAudios_delegate$lambda$0();
            case 7:
                return ColorsKt.LocalColors$lambda$0();
            case 8:
                return Float.valueOf(ContentAlphaKt.LocalContentAlpha$lambda$0());
            case 9:
                return DefaultElevationOverlay.INSTANCE;
            case 10:
                return ElevationOverlayKt.LocalAbsoluteElevation$lambda$0();
            case 11:
                return Boolean.valueOf(InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement$lambda$0());
            case 12:
                return RippleKt.LocalRippleConfiguration$lambda$0();
            case 13:
                return ScaffoldKt.LocalFabPlacement$lambda$0();
            case 14:
                return ShapesKt.LocalShapes$lambda$0();
            case 15:
                return Boolean.valueOf(SnackbarHostKt.FadeInFadeOutWithScale$lambda$2$0$1$0$0(null));
            case 16:
                return Unit.f186387a;
            case 17:
                return SnackbarKt.Snackbar_sPrSdHI$lambda$0$0$0(null);
            case 18:
                return TypographyKt.getDefaultTextStyle();
            case 19:
                return TypographyKt.LocalTypography$lambda$0();
            case 20:
                KProperty[] kPropertyArr = CardHolderNameController.Q;
                return new InputChecklistDelegate();
            case 21:
                StoreBrandDetailRedeemScreen.Companion aVar = StoreBrandDetailRedeemScreen.INSTANCE;
                return new ListSubheaderDelegate();
            case 22:
                StoreBrandDetailRedeemScreen.Companion aVar2 = StoreBrandDetailRedeemScreen.INSTANCE;
                return new NewsDelegate();
            case 23:
                StoreBrandDetailRedeemScreen.Companion aVar3 = StoreBrandDetailRedeemScreen.INSTANCE;
                return new PlainTextDelegate();
            case 24:
                StoreBrandDetailRedeemScreen.Companion aVar4 = StoreBrandDetailRedeemScreen.INSTANCE;
                return new FooterTextDelegate();
            case 25:
                StoreBrandDetailRedeemScreen.Companion aVar5 = StoreBrandDetailRedeemScreen.INSTANCE;
                return new RowDelegate(null, null, 7);
            case 26:
                StoreBrandDetailRedeemScreen.Companion aVar6 = StoreBrandDetailRedeemScreen.INSTANCE;
                return new CellDetailsDelegate();
            case 27:
                StoreBrandDetailRedeemScreen.Companion aVar7 = StoreBrandDetailRedeemScreen.INSTANCE;
                return new LargeActionButtonDelegate();
            case 28:
                StoreBrandDetailRedeemScreen.Companion aVar8 = StoreBrandDetailRedeemScreen.INSTANCE;
                return new AttributeSelectorSmallDelegate();
            default:
                KProperty[] kPropertyArr2 = RecipientSelectionScreen.f80137h0;
                return new BannerDelegate();
        }
    }
}
