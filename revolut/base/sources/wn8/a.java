package wn8;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import ap8.c;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$BlankCardDeliveryConsent;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$DeeplinkAuth;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$PaymentsPrivacySettingsToParent;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$YouthAccountDetails;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$YouthRevolutWallet;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsKompotFeatureConfig;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsLimitsDestination;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_closure_confirmation.JuniorAccountClosureConfirmationController;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreenContract$Destination;
import com.revolut.feature.junior_settings.impl.ui_kompot.limits.JuniorSettingsLimitsScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlow;
import com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$Destination;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.JuniorSettingsFlow;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f298725a;

    public a(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f298725a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof kn8.a) {
            kn8.a aVar = (kn8.a) descriptor;
            return aVar.a(new JuniorAccountClosureConfirmationController(new xn8.e(aVar.f186028a, aVar.f186029b)));
        }
        if (descriptor instanceof kn8.e) {
            kn8.e eVar = (kn8.e) descriptor;
            return eVar.a(new JuniorAuthQrScannerFlow(new JuniorAuthQrScannerFlowContract$InputData(eVar.f186032a)));
        }
        if (!(descriptor instanceof com.revolut.feature.junior_settings.api.navigation.a)) {
            return null;
        }
        com.revolut.feature.junior_settings.api.navigation.a aVar2 = (com.revolut.feature.junior_settings.api.navigation.a) descriptor;
        return aVar2.a(new JuniorSettingsFlow(new c(aVar2.f77266a, JuniorSettingsKompotFeatureConfig.InitialStep.AppAccess.f77260a)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(JuniorSettingsApi$Toggles$DeeplinkAuth.f77251a, JuniorSettingsApi$Toggles$PaymentsPrivacySettingsToParent.f77252c, JuniorSettingsApi$Toggles$BlankCardDeliveryConsent.f77250c, JuniorSettingsApi$Toggles$YouthRevolutWallet.f77254c, JuniorSettingsApi$Toggles$YouthAccountDetails.f77253c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorSettingsKompotFeatureConfig.DefaultDestination) {
            JuniorSettingsKompotFeatureConfig.DefaultDestination defaultDestination = (JuniorSettingsKompotFeatureConfig.DefaultDestination) destination;
            return new JuniorSettingsFlow(new c(defaultDestination.f77258a, defaultDestination.f77259b));
        }
        if (destination instanceof CoparentsSettingsScreenContract$Destination) {
            return new CoparentsSettingsScreen(((CoparentsSettingsScreenContract$Destination) destination).f77298b);
        }
        if (destination instanceof JuniorSecurityAndPrivacyControllerContract$Destination) {
            return new JuniorSecurityAndPrivacyController(((JuniorSecurityAndPrivacyControllerContract$Destination) destination).f77323b);
        }
        if (destination instanceof JuniorSettingsKompotFeatureConfig.SecurityAndPrivacyDestination) {
            return new JuniorSecurityAndPrivacyController(new JuniorSecurityAndPrivacyControllerContract$InputData(((JuniorSettingsKompotFeatureConfig.SecurityAndPrivacyDestination) destination).f77264a));
        }
        if (destination instanceof JuniorSettingsLimitsDestination) {
            return new JuniorSettingsLimitsScreen(new mo8.e(((JuniorSettingsLimitsDestination) destination).f77265a));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f298725a;
    }
}
