package ok7;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderController;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreen;
import com.revolut.feature.licenses.api.R$string;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.model.TransferWidgetDetails;
import com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient;
import com.revolut.feature.payments.air.widget.impl.model.WidgetTransferSource;
import com.revolut.feature.profile.impl.ui.profile.screens.about_us.AboutUsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.PlanCancelFeedbackScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225911a;

    public /* synthetic */ b(int i) {
        this.f225911a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 6;
        boolean z = false;
        switch (this.f225911a) {
            case 0:
                KProperty[] kPropertyArr = CFACInsuranceDocumentsScreen.U;
                return new RowDelegate(null, null, 7);
            case 1:
                return new qlm.e(okc.a.f225965a);
            case 2:
                return f0.f322471a;
            case 3:
                return f0.f322471a;
            case 4:
                return f0.f322471a;
            case 5:
                return f0.f322471a;
            case 6:
                return f0.f322471a;
            case 7:
                return f0.f322471a;
            case 8:
                return f0.f322471a;
            case 9:
                return f0.f322471a;
            case 10:
                return f0.f322471a;
            case 11:
                return f0.f322471a;
            case 12:
                return Unit.f186387a;
            case 13:
                return Unit.f186387a;
            case 14:
                KProperty[] kPropertyArr2 = PlanCancelFeedbackScreen.R;
                return new InputTextDelegate(null);
            case 15:
                KProperty[] kPropertyArr3 = AboutUsScreen.f81433b0;
                return new RowDelegate(null, null, 7);
            case 16:
                return new RowDelegate.Model("ID_OPEN_SOURCE_LICENSES", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_library, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextLocalisedClause(R$string.settings_open_source_licenses_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
            case 17:
                return new RowDelegate.Model("ID_ABOUT_RATE_APP", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_star_filled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextLocalisedClause(R.string.settings_google, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
            case 18:
                return new RowDelegate.Model("ID_ABOUT_TWITTER", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_logo_twitter, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextLocalisedClause(R.string.settings_twitter, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
            case 19:
                return new RowDelegate.Model("ID_ABOUT_FACEBOOK", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_logo_facebook, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextLocalisedClause(R.string.settings_facebook, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
            case 20:
                PaymentWidget.Companion bVar = PaymentWidget.INSTANCE;
                return j1.b("com.revolut.feature.payments.air.widget.impl.model.PaymentWidgetState", oo9.a.values());
            case 21:
                TransferWidgetDetails.Companion bVar2 = TransferWidgetDetails.INSTANCE;
                return WidgetRecipient.INSTANCE.serializer();
            case 22:
                TransferWidgetDetails.Companion bVar3 = TransferWidgetDetails.INSTANCE;
                return WidgetTransferSource.INSTANCE.serializer();
            case 23:
                WidgetRecipient.NewBeneficiary.Companion companion = WidgetRecipient.NewBeneficiary.INSTANCE;
                return new qlm.e(WidgetRecipient.AccountField.a.f79083a);
            case 24:
                return new to0.f(0);
            case 25:
                return Unit.f186387a;
            case 26:
                KProperty[] kPropertyArr4 = CryptoAddressHostingAddProviderController.S;
                return new ListSubheaderDelegate();
            case 27:
                KProperty[] kPropertyArr5 = CryptoAddressHostingAddProviderController.S;
                return new InputTextDelegate(null);
            case 28:
                KProperty[] kPropertyArr6 = CryptoAddressHostingAddProviderController.S;
                return new InputChecklistDelegate();
            default:
                return new qlm.e(oqj.e.f227915a);
        }
    }
}
