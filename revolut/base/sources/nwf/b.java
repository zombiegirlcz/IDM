package nwf;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.impl.ui.new_alias.ApmNewAliasScreen;
import com.revolut.feature.card_input.common.ui.CardInputActivity;
import com.revolut.feature.card_management.impl.ui.kompot.replace.reason.CardReplaceReasonPickerController;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsActivity;
import com.revolut.feature.insurance_pet.impl.ui.hub.screen.PetHubFragment;
import com.revolut.feature.insurance_pet.impl.ui.profile.petdetails.PetDetailsActivity;
import com.revolut.feature.transport.impl.ui.location.TransportLocationChooserScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker.TimeframePickerScreen;
import com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.giftes_passes_breakdown.AirportLoungesGiftedPassesBreakdownScreen;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nxa.i0;
import nxa.p0;
import nxa.r0;
import qlm.j1;
import wp5.y;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219859a;

    public /* synthetic */ b(int i) {
        this.f219859a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws DataMonitoringError.SdkDisabled {
        int i = 7;
        AnalyticsContext analyticsContext = null;
        switch (this.f219859a) {
            case 0:
                KProperty[] kPropertyArr = TransportLocationChooserScreen.c0;
                return new RowDelegate(null, null, 7);
            case 1:
                KProperty[] kPropertyArr2 = TransportLocationChooserScreen.c0;
                return new FullScreenStateDelegate();
            case 2:
                return new ihm.f();
            case 3:
                return j1.b("com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingDetails.PersonalizedStatus", i0.values());
            case 4:
                return new qlm.e(p0.f220513a);
            case 5:
                return j1.b("com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingDetails.Step.StepStatus", r0.values());
            case 6:
                try {
                    Object objNewInstance = Class.forName("com.revolut.feature_credit_data_monitoring_sdk.DataMonitoringProviderImpl").getDeclaredConstructor(null).newInstance(null);
                    Intrinsics.i(objNewInstance, "null cannot be cast to non-null type com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringProvider");
                    return (nxh.e) objNewInstance;
                } catch (Exception e) {
                    throw new DataMonitoringError.SdkDisabled(e);
                }
            case 7:
                KProperty[] kPropertyArr3 = AirportLoungesGiftedPassesBreakdownScreen.S;
                return new z4l.j(i, y.w(), false);
            case 8:
                int i2 = CardInputActivity.B0;
                return new LargeActionButtonDelegate();
            case 9:
                int i3 = PetEditDetailsActivity.C0;
                return new InputChecklistDelegate();
            case 10:
                int i5 = PetEditDetailsActivity.C0;
                return new RowDelegate(null, null, 7);
            case 11:
                KProperty[] kPropertyArr4 = TimeframePickerScreen.R;
                return new SingleChoiceDelegate();
            case 12:
                int i6 = PetHubFragment.p0;
                return new TextDelegate();
            case 13:
                int i21 = PetHubFragment.p0;
                return new BannerDelegate();
            case 14:
                int i22 = PetHubFragment.p0;
                return new BigTileDelegate();
            case 15:
                int i32 = PetHubFragment.p0;
                return new LargeActionButtonDelegate();
            case 16:
                int i33 = PetHubFragment.p0;
                return new DatePickerDelegate();
            case 17:
                int i43 = PetHubFragment.p0;
                return new ProductSelectionDelegate();
            case 18:
                KProperty[] kPropertyArr5 = CardReplaceReasonPickerController.T;
                return new RowDelegate(null, null, 7);
            case 19:
                KProperty[] kPropertyArr6 = CardReplaceReasonPickerController.T;
                return new ListSubheaderDelegate();
            case 20:
                KProperty[] kPropertyArr7 = CardReplaceReasonPickerController.T;
                return new InputDisclosureDelegate();
            case 21:
                int i59 = PetDetailsActivity.f76405x0;
                return new CellDetailsChevronDelegate();
            case 22:
                int i66 = PetDetailsActivity.f76405x0;
                return new CellDetailsDelegate();
            case 23:
                KProperty[] kPropertyArr8 = ApmNewAliasScreen.V;
                return new FixedTabsDelegate();
            case 24:
                KProperty[] kPropertyArr9 = ApmNewAliasScreen.V;
                return new InputTextDelegate(null);
            case 25:
                KProperty[] kPropertyArr10 = ApmNewAliasScreen.V;
                return new PhoneEditorDelegate();
            case 26:
                int i74 = 12;
                return v.k(new FixedTabs.Item("PHONE", new TextLocalisedClause(R$string.apm_alias_new_alias_tab_phone_name, null, null, 14), analyticsContext, i74), new FixedTabs.Item("EMAIL", new TextLocalisedClause(R$string.apm_alias_new_alias_tab_email_name, null, null, 14), analyticsContext, i74));
            case 27:
                KProperty[] kPropertyArr11 = AddressFormController.Y;
                return new LargeActionButtonDelegate();
            case 28:
                KProperty[] kPropertyArr12 = AddressFormController.Y;
                return new RowDelegate(null, null, 7);
            default:
                KProperty[] kPropertyArr13 = AddressFormController.Y;
                return new InputTextDelegate(null);
        }
    }
}
