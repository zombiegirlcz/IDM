package tl7;

import aw0.db;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.chart.PieChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.boleto.impl.finder.deactivate.BoletoFinderDeactivateScreen;
import com.revolut.feature.apm.bizum.impl.ui.area.homescreen.BizumAreaHomescreenScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreen;
import com.revolut.feature.terms.impl.ui.tnc_list.TnCListScreen;
import com.revolut.feature.us_send_checks.impl.ui.address_verification.SendChecksAddressVerificationScreen;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import tr9.c;
import yy0.j;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272007a;

    public /* synthetic */ a(int i) {
        this.f272007a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f272007a) {
            case 0:
                return Unit.f186387a;
            case 1:
                return Unit.f186387a;
            case 2:
                KProperty[] kPropertyArr = SendChecksAddressVerificationScreen.S;
                return new MapDelegate();
            case 3:
                KProperty[] kPropertyArr2 = SendChecksAddressVerificationScreen.S;
                return new LargeActionButtonDelegate();
            case 4:
                KProperty[] kPropertyArr3 = BoletoFinderDeactivateScreen.R;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr4 = BoletoFinderDeactivateScreen.R;
                return new LargeActionButtonDelegate();
            case 6:
                return new PromptMarketingContentDelegate();
            case 7:
                return new tf(new j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246)));
            case 8:
                return new PromptMarketingContentDelegate();
            case 9:
                return new RowDelegate(null, null, 7);
            case 10:
                return new TwinHorizontalButtonDelegate();
            case 11:
                return f0.f322471a;
            case 12:
                return Unit.f186387a;
            case 13:
                return new Regex("\\[.*?]|[{}]");
            case 14:
                KProperty[] kPropertyArr5 = InstalmentConfirmationScreen.U;
                return new CellDetailsDelegate();
            case 15:
                KProperty[] kPropertyArr6 = InstalmentConfirmationScreen.U;
                return new LargeActionButtonDelegate();
            case 16:
                KProperty[] kPropertyArr7 = InstalmentConfirmationScreen.U;
                return new RowDelegate(null, null, 7);
            case 17:
                c.a aVar = tr9.c.Companion;
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_24_people;
                int i2 = R$attr.uikit_colorPopoverBackground;
                return LayeredImage.Companion.f(companion, i, R$attr.uikit_colorStatusInactive, i2, Integer.valueOf(i2), 3.0f, 3.0f, null, 64);
            case 18:
                c.a aVar2 = tr9.c.Companion;
                LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                int i3 = R$drawable.uikit_icn_16_check;
                int i5 = R$attr.uikit_colorGroupedBackground;
                return companion2.d(i3, R$attr.uikit_colorAccent, i5, Integer.valueOf(i5), 3.0f, 3.0f, Float.valueOf(16.0f));
            case 19:
                c.a aVar3 = tr9.c.Companion;
                return new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, db.BODY2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
            case 20:
                KProperty[] kPropertyArr8 = TnCListScreen.R;
                return new RowDelegate(null, null, 7);
            case 21:
                KProperty[] kPropertyArr9 = TnCListScreen.R;
                return new FullScreenStateDelegate();
            case 22:
                int i6 = PieChartView.f56729m;
                return new rzl.c(0);
            case 23:
                KProperty[] kPropertyArr10 = BizumAreaHomescreenScreen.m0;
                return new ActionsDelegate();
            case 24:
                KProperty[] kPropertyArr11 = BizumAreaHomescreenScreen.m0;
                return new ActionWidgetDelegate();
            case 25:
                KProperty[] kPropertyArr12 = BizumAreaHomescreenScreen.m0;
                return new ContactsWidgetDelegate();
            case 26:
                KProperty[] kPropertyArr13 = BizumAreaHomescreenScreen.m0;
                return new RowsWidgetDelegate();
            case 27:
                KProperty[] kPropertyArr14 = BizumAreaHomescreenScreen.m0;
                return new ReferralContactDelegate();
            case 28:
                KProperty[] kPropertyArr15 = BizumAreaHomescreenScreen.m0;
                return new RowDelegate(null, null, 7);
            default:
                KProperty[] kPropertyArr16 = BizumAreaHomescreenScreen.m0;
                return new ListSubheaderDelegate();
        }
    }
}
