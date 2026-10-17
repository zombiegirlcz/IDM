package ve7;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.feature.apm.wero.impl.ui.home.area.WeroHomeAreaScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreen;
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreen;
import com.revolut.feature.us_send_checks.impl.ui.recipient.SendChecksRecipientScreen;
import com.revolut.otp.input.flow.push.bottom_dialog.OtpPushBottomSheet;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen;
import ip0.gu;
import ip0.pb0;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.d1;
import qlm.j1;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288140a;

    public /* synthetic */ i(int i) {
        this.f288140a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f288140a) {
            case 0:
                return new d1("com.revolut.feature.incentive_experiment.impl.model.IncentiveExperiment.Unknown", j.INSTANCE, new Annotation[]{new hi9.g(26)});
            case 1:
                return new qlm.e(k.Companion.serializer());
            case 2:
                KProperty[] kPropertyArr = SharedAlertDetailsScreen.f0;
                return new ActionsDelegate();
            case 3:
                KProperty[] kPropertyArr2 = SharedAlertDetailsScreen.f0;
                return new TrendViewDelegate(1000L);
            case 4:
                KProperty[] kPropertyArr3 = SharedAlertDetailsScreen.f0;
                return new FixedTabsDelegate();
            case 5:
                KProperty[] kPropertyArr4 = SharedAlertDetailsScreen.f0;
                return new FullScreenStateDelegate();
            case 6:
                KProperty[] kPropertyArr5 = SharedAlertDetailsScreen.f0;
                return new TextDelegate();
            case 7:
                return Unit.f186387a;
            case 8:
                return new go.g(zi0.c.P(f0.f322471a, false, null, 3), 2);
            case 9:
                KProperty[] kPropertyArr6 = WeroHomeAreaScreen.T;
                return new PaymentLinkWidgetDelegate();
            case 10:
                return Unit.f186387a;
            case 11:
                KProperty[] kPropertyArr7 = EsimMobilePlanDetailsScreen.V;
                return new FullScreenStateDelegate();
            case 12:
                KProperty[] kPropertyArr8 = EsimMobilePlanDetailsScreen.V;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr9 = EsimMobilePlanDetailsScreen.V;
                return new CellDetailsDelegate();
            case 14:
                KProperty[] kPropertyArr10 = EsimMobilePlanDetailsScreen.V;
                return new ActionsDelegate();
            case 15:
                KProperty[] kPropertyArr11 = EsimMobilePlanDetailsScreen.V;
                return new ListSubheaderDelegate();
            case 16:
                return Unit.f186387a;
            case 17:
                return new qlm.e(vjl.c.f289804a);
            case 18:
                return j1.a("com.revolut.sso.impl.data.db.models.ConsentedClientEntity.Consent.Claim.Name", vjl.e.values(), new String[]{"address", "birthdate", "email", "name", "citizenship", "phone", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 19:
                KProperty[] kPropertyArr12 = CFACClaimsListScreen.f75134d0;
                return new RowDelegate(null, null, 7);
            case 20:
                KProperty[] kPropertyArr13 = CFACClaimsListScreen.f75134d0;
                return new FullScreenStateDelegate();
            case 21:
                gu guVar = new gu("loading-header-list-id", 0, 0, 30);
                pb0 pb0Var = new pb0("loading-item-list-id");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, pb0Var);
            case 22:
                KProperty[] kPropertyArr14 = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                return new InputTextDelegate(null);
            case 23:
                KProperty[] kPropertyArr15 = SendChecksRecipientScreen.T;
                return new InputTextDelegate(null);
            case 24:
                KProperty[] kPropertyArr16 = SendChecksRecipientScreen.T;
                return new FixedTabsDelegate();
            case 25:
                KProperty[] kPropertyArr17 = SendChecksRecipientScreen.T;
                return new LargeActionButtonDelegate();
            case 26:
                KProperty[] kPropertyArr18 = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                return new DatePickerDelegate();
            case 27:
                List listK = v.k(new vn8.c("ATM", R$string.price_plan_item_title_ATM, R$string.price_plan_item_description_ATM_free, Integer.valueOf(R$string.junior_price_plan_screen_ATM_subtitle_text_limited_format), v.k(new vn8.d(R$string.junior_price_plan_screen_ATM_subtitle_text_limited_spain_branch_format, new vjk.b(28)), new vn8.d(R$string.junior_price_plan_screen_ATM_subtitle_text_limited_portugal_format, new vjk.b(29)), new vn8.d(R$string.junior_price_plan_screen_ATM_subtitle_text_limited_australia_format, new vn8.a(i))), Integer.valueOf(R$string.price_plan_item_description_ATM_fee), Integer.valueOf(R$string.price_plan_item_description_ATM_fee_until_date)), new vn8.c("EXCHANGE", R$string.price_plan_item_title_EXCHANGE, R$string.price_plan_screen_EXCHANGE_subtitle_text_unlimited, Integer.valueOf(R$string.junior_price_plan_screen_EXCHANGE_subtitle_text_limited_format), 112), new vn8.c("CARD_SPEND", R$string.price_plan_item_title_CARD_SPEND, R$string.price_plan_item_description_CARD_SPEND, null, SyslogConstants.LOG_CLOCK));
                HashMap map = new HashMap();
                for (Object obj2 : listK) {
                    map.put(((vn8.c) obj2).f290768a, obj2);
                }
                return map;
            case 28:
                int i2 = OtpPushBottomSheet.V;
                return new CodeEditorDelegate();
            default:
                KProperty[] kPropertyArr19 = JuniorSecurityAndPrivacyController.W;
                return new TwinHorizontalButtonDelegate();
        }
    }
}
