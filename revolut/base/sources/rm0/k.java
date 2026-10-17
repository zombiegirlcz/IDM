package rm0;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.banners.impl.data.network.dto.BannerActionDto;
import com.revolut.feature.banners.impl.data.network.dto.BannerActionDto$ContentHtml$$serializer;
import com.revolut.feature.banners.impl.data.network.dto.BannerActionDto$Uri$$serializer;
import com.revolut.feature.banners.impl.data.network.dto.BannerDto;
import com.revolut.feature.banners.impl.data.network.dto.BannerDto$NoCta$$serializer;
import com.revolut.feature.banners.impl.data.network.dto.BannerDto$SingleCta$$serializer;
import com.revolut.feature.banners.impl.data.network.dto.BannersResponseDto;
import com.revolut.feature.credit.card.impl.ui.instalment.agreement.CreditCardInstalmentAgreementScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.app_settings.AppSettingsController;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.SavingsTermSelectionScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.cancel.CancelSalarySwitchScreen;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.feature.transactions.impl.ui.transactiondetails.inputnote.InputNoteActivity;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.termsandconditions.screen.TermsAndConditionsScreen;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.i0;
import qlm.v1;
import ro1.c;
import ro6.a;
import ro6.d;
import ro6.e;
import rr.b;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255158a;

    public /* synthetic */ k(int i) {
        this.f255158a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f255158a) {
            case 0:
                l lVar = n.Companion;
                return "Should not run key-pair generation on main thread";
            case 1:
                KProperty[] kPropertyArr = SavingsTermSelectionScreen.V;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
            case 2:
                KProperty[] kPropertyArr2 = TermsAndConditionsScreen.f103588a0;
                return new RowDelegate(null, null, 7);
            case 3:
                KProperty[] kPropertyArr3 = BranchesScreen.R;
                return new RowDelegate(null, null, 7);
            case 4:
                return new qlm.e(v1.f247718a);
            case 5:
                KProperty[] kPropertyArr4 = AppSettingsController.S;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr5 = AppSettingsController.S;
                return new LargeActionButtonDelegate();
            case 7:
                ro0.b bVar = ro0.b.f255735a;
                return new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED};
            case 8:
                return Float.valueOf(1.0f);
            case 9:
                return 0;
            case 10:
                return new to0.f(0);
            case 11:
                Lazy lazy = ro0.d0.f255743a;
                ro0.b0.m();
                return ro0.b0.f();
            case 12:
                Lazy lazy2 = ro0.d0.f255743a;
                ro0.b0.m();
                return ro0.b0.t();
            case 13:
                c.Companion companion = ro1.c.INSTANCE;
                return new mlm.f("com.revolut.feature.apm.bills.bpay.impl.screen.review.models.BillPayResult", o0.f186429a.b(ro1.c.class), new KClass[0], new KSerializer[0], new Annotation[0]);
            case 14:
                return new qlm.e(ro3.f.f255843a);
            case 15:
                a.b bVar2 = ro6.a.Companion;
                return new qlm.e(d.a.f255900a);
            case 16:
                d.b bVar3 = ro6.d.Companion;
                return new qlm.e(e.a.f255904a);
            case 17:
                TaxNumberInputScreen.a aVar = TaxNumberInputScreen.Companion;
                return new ProductSelectionDelegate();
            case 18:
                TaxNumberInputScreen.a aVar2 = TaxNumberInputScreen.Companion;
                return new TwinHorizontalButtonDelegate();
            case 19:
                TaxNumberInputScreen.a aVar3 = TaxNumberInputScreen.Companion;
                return new LargeActionButtonDelegate();
            case 20:
                KProperty[] kPropertyArr6 = InputNoteActivity.f92108w0;
                return new InputTextDelegate(null);
            case 21:
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_cross_small, R$attr.uikit_colorAccent, R$attr.uikit_colorWidgetBackground, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, SyslogConstants.LOG_CLOCK);
            case 22:
                BannerActionDto.Companion companion2 = BannerActionDto.Companion;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.banners.impl.data.network.dto.BannerActionDto", p0Var.b(BannerActionDto.class), new KClass[]{p0Var.b(BannerActionDto.ContentHtml.class), p0Var.b(BannerActionDto.Uri.class)}, new KSerializer[]{BannerActionDto$ContentHtml$$serializer.INSTANCE, BannerActionDto$Uri$$serializer.INSTANCE}, new Annotation[0]);
            case 23:
                BannerDto.Companion companion3 = BannerDto.Companion;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.banners.impl.data.network.dto.BannerDto", p0Var2.b(BannerDto.class), new KClass[]{p0Var2.b(BannerDto.NoCta.class), p0Var2.b(BannerDto.SingleCta.class)}, new KSerializer[]{BannerDto$NoCta$$serializer.INSTANCE, BannerDto$SingleCta$$serializer.INSTANCE}, new Annotation[0]);
            case 24:
                BannerDto.SingleCta.Companion companion4 = BannerDto.SingleCta.Companion;
                return BannerActionDto.Companion.serializer();
            case 25:
                BannersResponseDto.Companion companion5 = BannersResponseDto.Companion;
                return new qlm.e(BannerDto.Companion.serializer());
            case 26:
                KProperty[] kPropertyArr7 = CancelSalarySwitchScreen.Q;
                return new LargeActionButtonDelegate();
            case 27:
                return new qlm.e(rqj.a.f256551a);
            case 28:
                b.C1413b c1413b = rr.b.Companion;
                return new i0(v1.f247718a, 1);
            default:
                KProperty[] kPropertyArr8 = CreditCardInstalmentAgreementScreen.S;
                return new RowDelegate(null, null, 7);
        }
    }
}
