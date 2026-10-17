package n08;

import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.window.layout.WindowInfoTracker;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.FcaDisclaimerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabController;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileActivity;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country.IndiaTopupSelectCountryScreen;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import mx0.pc;
import qlm.d1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210883a;

    public /* synthetic */ b(int i) {
        this.f210883a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f210883a) {
            case 0:
                int i = PetProfileActivity.F0;
                return new TextDelegate();
            case 1:
                int i2 = PetProfileActivity.F0;
                return new CellDetailsActionDelegate();
            case 2:
                int i3 = PetProfileActivity.F0;
                return new LargeActionButtonDelegate();
            case 3:
                int i5 = PetProfileActivity.F0;
                return new PlainTextWarningDelegate();
            case 4:
                int i6 = PetProfileActivity.F0;
                return new TwinHorizontalButtonDelegate();
            case 5:
                return zhm.v.k(d1b.e.CANDLES, d1b.e.LINE, d1b.e.BARS, d1b.e.HEIKENASHI, d1b.e.HOLLOWCANDLES);
            case 6:
                KProperty[] kPropertyArr = IndiaTopupSelectCountryScreen.Q;
                return new InputTextDelegate(null);
            case 7:
                return AutofillHighlightKt.LocalAutofillHighlightBrush$lambda$0();
            case 8:
                return BasicText_androidKt.LocalBackgroundTextMeasurementExecutor$lambda$0();
            case 9:
                return TextLinkScope.textRange$lambda$0$0();
            case 10:
                return TextLinkScope.textRange$lambda$0$1();
            case 11:
                KProperty[] kPropertyArr2 = OrderNewCardTabController.V;
                return new TextDelegate();
            case 12:
                KProperty[] kPropertyArr3 = OrderNewCardTabController.V;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr4 = OrderNewCardTabController.V;
                return new FcaDisclaimerDelegate();
            case 14:
                KProperty[] kPropertyArr5 = OrderNewCardTabController.V;
                return new RowDelegate(null, null, 7);
            case 15:
                return n29.h.Companion.serializer();
            case 16:
                return new qlm.e(n29.z.f211499a);
            case 17:
                return n29.h.Companion.serializer();
            case 18:
                return new qlm.e(n29.c0.f211461a);
            case 19:
                return n29.h.Companion.serializer();
            case 20:
                return n29.s.Companion.serializer();
            case 21:
                return new qlm.e(n29.w.f211495a);
            case 22:
                return IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_UPLOAD", new ResourceImage(R$drawable.uikit_icn_24_upload, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, 124);
            case 23:
                return new pc("limit-reached-tag", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.card_design_tag_limit_reached, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorGroupedBackground), R$attr.uikit_colorTransparent, null, 1000), null);
            case 24:
                return n38.p.Companion.serializer();
            case 25:
                return new d1("none", n38.l.INSTANCE, new Annotation[0]);
            case 26:
                return new vii.b(w4l.h.f294642c);
            case 27:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_card, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorActionBackgroundNeutral, 12.0f, Float.valueOf(40.0f), null, 32);
            case 28:
                return WindowInfoTracker.Companion.extensionBackend_delegate$lambda$2();
            default:
                KProperty[] kPropertyArr6 = LoanRepaymentsListScreen.f70576e0;
                return new RowDelegate(null, null, 7);
        }
    }
}
