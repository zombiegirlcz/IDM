package ujb;

import aw0.s8;
import aw0.w6;
import aw0.x6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3Screen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.CreditCardChooseFutureInstalmentsScreen;
import com.revolut.feature.crypto.spare.change.api.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.limitsdialog.CryptoSendLimitsDialogController;
import com.revolut.feature.pay_later.impl.ui.selectplan.PayLaterSelectPlanScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreen;
import com.revolut.otp.input.flow.push.OtpPushScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_hide_bottom_sheet.HideStudentBottomSheet;
import ip0.pb0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280594a;

    public /* synthetic */ v(int i) {
        this.f280594a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        s8 s8Var = null;
        Object[] objArr = 0;
        switch (this.f280594a) {
            case 0:
                return new qlm.e(v1.f247718a);
            case 1:
                return new qlm.e(y.f280599a);
            case 2:
                return new qlm.e(s0.f280588a);
            case 3:
                return new qlm.e(m0.f280570a);
            case 4:
                return new NavBarWithContainerBackground.ImageBackground((Image) new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorDeepPurple), null), s8Var, (Color.SolidRes) (objArr == true ? 1 : 0), 14);
            case 5:
                return new x6(zhm.u.c(new w6(R$attr.uikit_colorWhite, 0, 0, BitmapDescriptorFactory.HUE_RED, 1.0f, false, 70)));
            case 6:
                KProperty[] kPropertyArr = SelectAutopayMethodV3Screen.R;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr2 = PayLaterSelectPlanScreen.f78937e0;
                return new RowDelegate(null, null, 7);
            case 8:
                KProperty[] kPropertyArr3 = PayLaterSelectPlanScreen.f78937e0;
                return new LargeActionButtonDelegate();
            case 9:
                return new qlm.e(bka.n0.Companion.serializer());
            case 10:
                return new qlm.e(uka.b.f280714a);
            case 11:
                return zhm.f0.f322471a;
            case 12:
                return zhm.f0.f322471a;
            case 13:
                return zhm.f0.f322471a;
            case 14:
                return zhm.f0.f322471a;
            case 15:
                List listC = zhm.u.c(new pb0("product-loading-row-list-id"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 16:
                return Unit.f186387a;
            case 17:
                return zhm.v.k(new ul5.f(R$string.crypto_sparechange_multiplier_x1, 1), new ul5.f(R$string.crypto_sparechange_multiplier_x2, 2), new ul5.f(R$string.crypto_sparechange_multiplier_x3, 3), new ul5.f(R$string.crypto_sparechange_multiplier_x4, 4), new ul5.f(R$string.crypto_sparechange_multiplier_x5, 5), new ul5.f(R$string.crypto_sparechange_multiplier_x10, 10));
            case 18:
                KProperty[] kPropertyArr4 = OtpPushScreen.R;
                return new CodeEditorDelegate();
            case 19:
                int i = HideStudentBottomSheet.V;
                return new RowDelegate(null, null, 7);
            case 20:
                int i2 = HideStudentBottomSheet.V;
                return new LargeActionButtonDelegate();
            case 21:
                TaxResidencyListScreen.a aVar = TaxResidencyListScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 22:
                TaxResidencyListScreen.a aVar2 = TaxResidencyListScreen.Companion;
                return new FullScreenStateDelegate();
            case 23:
                TaxResidencyListScreen.a aVar3 = TaxResidencyListScreen.Companion;
                return new ListSubheaderDelegate();
            case 24:
                int i3 = CryptoSendLimitsDialogController.U;
                return new FullScreenStateDelegate();
            case 25:
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i5 = R$drawable.uikit_icn_16_check;
                int i6 = R$attr.uikit_colorGroupedBackground;
                return companion.d(i5, R$attr.uikit_colorGreen, i6, Integer.valueOf(i6), 2.0f, 2.0f, Float.valueOf(16.0f));
            case 26:
                KProperty[] kPropertyArr5 = CreditCardChooseFutureInstalmentsScreen.W;
                return new FullScreenStateDelegate();
            case 27:
                KProperty[] kPropertyArr6 = CreditCardChooseFutureInstalmentsScreen.W;
                return new LargeActionButtonDelegate();
            case 28:
                KProperty[] kPropertyArr7 = CreditCardChooseFutureInstalmentsScreen.W;
                return new CellDetailsDelegate();
            default:
                KProperty[] kPropertyArr8 = CreditCardChooseFutureInstalmentsScreen.W;
                return new SuggestionsBarDelegate();
        }
    }
}
