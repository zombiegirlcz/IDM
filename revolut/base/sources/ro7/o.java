package ro7;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreenContract$InputData;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kl7.m2;
import kl7.s0;
import kotlin.jvm.internal.Intrinsics;
import to7.d0;
import to7.h0;
import to7.y;
import y7a.s;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f255929p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jki.p stateMapper, CarManualInputScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f255929p = new f(inputData.f75557a, 1022);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f255929p;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void y2(String listId) {
        String str;
        s0 s0Var;
        Integer num;
        String str2;
        s0 s0Var2;
        String str3;
        String str4;
        s0 s0Var3;
        Integer num2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        switch (iHashCode) {
            case -2051556897:
                if (listId.equals("VARIATION_ITEM")) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_style, null, null, 14);
                    String str5 = ((f) t2()).f255915c;
                    if (str5 != null && (str = ((f) t2()).d) != null && (s0Var = ((f) t2()).e) != null && (num = ((f) t2()).f) != null) {
                        int iIntValue = num.intValue();
                        m2 m2Var = ((f) t2()).f255916g;
                        if (m2Var != null) {
                            Y1(new PickerScreen(new PickerScreenContract$InputData(new d0(str5, str, s0Var, iIntValue, m2Var), textLocalisedClause, null, s.CROSS, true, null, "CarInsuranceOnboardingVariationPickerInteractor", null, null, null, null, true, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123730748)), popup, new l(this, 6));
                            break;
                        }
                    }
                }
                break;
            case -1856464572:
                if (listId.equals("ESTIMATED_VALUE_ITEM")) {
                    Y1(new EstimatedCarValuePickerScreen(new EstimatedCarValuePickerScreenContract$InputData(null)), popup, new rlh.d0(this, 11));
                    break;
                }
                break;
            case -1660017029:
                if (listId.equals("YEAR_MADE_ITEM")) {
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_year_made, null, null, 14);
                    String str6 = ((f) t2()).f255915c;
                    if (str6 != null && (str2 = ((f) t2()).d) != null && (s0Var2 = ((f) t2()).e) != null) {
                        Y1(new PickerScreen(new PickerScreenContract$InputData(new h0(str6, str2, s0Var2), textLocalisedClause2, null, s.CROSS, false, null, "CarInsuranceOnboardingYearMadePickerInteractor", null, null, null, null, false, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123730748)), popup, new l(this, 7));
                    }
                    break;
                }
                break;
            case -1460076113:
                if (listId.equals("FUEL_TYPE_ITEM")) {
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_fuel_type, null, null, 14);
                    String str7 = ((f) t2()).f255915c;
                    if (str7 != null && (str3 = ((f) t2()).d) != null) {
                        Y1(new PickerScreen(new PickerScreenContract$InputData(new to7.o(str7, str3), textLocalisedClause3, null, s.CROSS, false, null, "CarInsuranceOnboardingFuelTypePickerInteractor", null, null, null, null, false, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123730748)), popup, new l(this, 3));
                    }
                    break;
                }
                break;
            case -1405575175:
                if (listId.equals("CAR_MAKE_ITEM")) {
                    Y1(new PickerScreen(new PickerScreenContract$InputData(null, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_make, null, null, 14), null, s.CROSS, true, null, "CarInsuranceOnboardingCarMakePickerInteractor", null, null, null, null, true, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123730748)), popup, new l(this, 0));
                    break;
                }
                break;
            case -478041065:
                if (listId.equals("PURCHASE_YEAR_ITEM")) {
                    Y1(new PickerScreen(new PickerScreenContract$InputData(((f) t2()).f, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_purchase_year, null, null, 14), null, s.CROSS, false, null, "CarInsuranceOnboardingPurchaseYearPickerInteractor", null, null, null, null, false, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123730748)), popup, new l(this, 4));
                    break;
                }
                break;
            case -466877892:
                if (listId.equals("COUNTRY_ITEM")) {
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_country_of_registration, null, null, 14);
                    k.Companion.getClass();
                    Y1(new PickerScreen(new PickerScreenContract$InputData(new to7.i(e.f255912b), textLocalisedClause4, null, s.CROSS, false, null, "CarInsuranceOnboardingCountryPickerInteractor", null, null, null, null, false, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123730748)), popup, new l(this, 2));
                    break;
                }
                break;
            case 3563508:
                if (listId.equals("CAR_MODEL_ITEM")) {
                    Y1(new PickerScreen(new PickerScreenContract$InputData(((f) t2()).f255915c, new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_model, null, null, 14), null, s.CROSS, true, null, "CarInsuranceOnboardingCarModelPickerInteractor", null, null, null, null, true, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123730748)), popup, new l(this, 1));
                    break;
                }
                break;
            case 932778126:
                if (listId.equals("TRANSMISSION_ITEM")) {
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.car_insurance_car_manual_input_field_transmission, null, null, 14);
                    String str8 = ((f) t2()).f255915c;
                    if (str8 != null && (str4 = ((f) t2()).d) != null && (s0Var3 = ((f) t2()).e) != null && (num2 = ((f) t2()).f) != null) {
                        Y1(new PickerScreen(new PickerScreenContract$InputData(new y(str8, str4, s0Var3, num2.intValue()), textLocalisedClause5, null, s.CROSS, false, null, "CarInsuranceOnboardingTransmissionPickerInteractor", null, null, null, null, false, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123730748)), popup, new l(this, 5));
                    }
                    break;
                }
                break;
        }
    }
}
