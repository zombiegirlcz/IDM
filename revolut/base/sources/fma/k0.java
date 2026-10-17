package fma;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import com.revolut.feature.profile.api.navigation.ProfileAddressControllerDescriptor;
import com.revolut.feature.profile.impl.ui.close_account.SelfTerminationFlow;
import com.revolut.feature.profile.impl.ui.close_account.SelfTerminationFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.details.address.flow.ProfileAddressFlow;
import com.revolut.feature.profile.impl.ui.documents_redesigned.flow.DocumentsFlow;
import com.revolut.feature.profile.impl.ui.documents_redesigned.flow.DocumentsFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.documents_redesigned.flow.DocumentsFlowContract$Step;
import com.revolut.feature.profile.impl.ui.profile.ProfileFlow;
import com.revolut.feature.profile.impl.ui.profile.ProfileFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.profile.ProfileFlowContract$Step;
import com.revolut.feature.profile.impl.ui.profile.screens.app_interface.AppInterfaceScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.appearance.AppearanceThemeScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingsDetails;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 implements aii.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f136201a;

    public k0(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f136201a = deeplinkGateways;
    }

    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof ProfileAddressControllerDescriptor)) {
            return null;
        }
        ProfileAddressControllerDescriptor profileAddressControllerDescriptor = (ProfileAddressControllerDescriptor) descriptor;
        return profileAddressControllerDescriptor.a(new ProfileAddressFlow(profileAddressControllerDescriptor.f81344a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof KompotProfileFeatureConfig.SettingsDestination) {
            return new ProfileFlow(new ProfileFlowContract$InputData(ProfileFlowContract$Step.ProfileMain.f81428a));
        }
        if (destination instanceof KompotProfileFeatureConfig.NotificationSettingsDestination) {
            return new ProfileFlow(new ProfileFlowContract$InputData(new ProfileFlowContract$Step.NotificationSettings(null)));
        }
        if (destination instanceof KompotProfileFeatureConfig.NotificationSettingDetailsDestination) {
            return new ProfileFlow(new ProfileFlowContract$InputData(new ProfileFlowContract$Step.NotificationSettingDetails(new NotificationSettingsDetails(((KompotProfileFeatureConfig.NotificationSettingDetailsDestination) destination).f81333a))));
        }
        if (destination instanceof KompotProfileFeatureConfig.AppSettingsDestination) {
            return new ProfileFlow(new ProfileFlowContract$InputData(ProfileFlowContract$Step.AppSettings.f81424a));
        }
        if (destination instanceof KompotProfileFeatureConfig.ProfileAccountDestination) {
            return new ProfileFlow(new ProfileFlowContract$InputData(ProfileFlowContract$Step.Account.f81423a));
        }
        if (destination instanceof KompotProfileFeatureConfig.AppearanceDestination) {
            return new AppearanceThemeScreen();
        }
        if (destination instanceof KompotProfileFeatureConfig.AppInterfaceDestination) {
            return new AppInterfaceScreen();
        }
        if (destination instanceof KompotProfileFeatureConfig.ExperimentsDestination) {
            return new ProfileFlow(new ProfileFlowContract$InputData(ProfileFlowContract$Step.PublicExperiments.f81429a));
        }
        if (destination instanceof KompotProfileFeatureConfig.DocumentsDestination) {
            return new DocumentsFlow(new DocumentsFlowContract$InputData(new DocumentsFlowContract$Step.DocumentSelector(((KompotProfileFeatureConfig.DocumentsDestination) destination).f81331a)));
        }
        if (destination instanceof KompotProfileFeatureConfig.ProfileAddressDestination) {
            return new ProfileAddressFlow(new ProfileAddressControllerDescriptor.InputData(((KompotProfileFeatureConfig.ProfileAddressDestination) destination).f81336a));
        }
        if (!(destination instanceof KompotProfileFeatureConfig.SelfTerminationDestination)) {
            return null;
        }
        KompotProfileFeatureConfig.SelfTerminationDestination selfTerminationDestination = (KompotProfileFeatureConfig.SelfTerminationDestination) destination;
        return new SelfTerminationFlow(new SelfTerminationFlowContract$InputData(selfTerminationDestination.f81339a, selfTerminationDestination.f81340b, selfTerminationDestination.f81341c));
    }

    @Override // aii.p
    public final Set h() {
        return this.f136201a;
    }
}
