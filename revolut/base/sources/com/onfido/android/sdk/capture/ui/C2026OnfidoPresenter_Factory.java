package com.onfido.android.sdk.capture.ui;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.nfc.ShouldLaunchNfcFlowUseCase;
import com.onfido.android.sdk.capture.internal.performance.trackers.ScreenLoadTracker;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.RemoteLoggerTree;
import com.onfido.android.sdk.capture.ui.nfc.NfcDataRepository;
import com.onfido.android.sdk.capture.utils.DeviceUtils;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.OnfidoPresenter_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2026OnfidoPresenter_Factory {
    private final Provider deviceUtilsProvider;
    private final Provider documentConfigurationManagerProvider;
    private final Provider flowTrackerProvider;
    private final Provider livenessTrackerProvider;
    private final Provider nfcDataRepositoryProvider;
    private final Provider nfcInteractorProvider;
    private final Provider nfcTrackerProvider;
    private final Provider onfidoPresenterInitializerProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider remoteLoggerTreeProvider;
    private final Provider runtimePermissionsManagerProvider;
    private final Provider schedulersProvider;
    private final Provider screenLoadTrackerProvider;
    private final Provider shouldLaunchNfcFlowUseCaseProvider;
    private final Provider waitingScreenTrackerProvider;

    public C2026OnfidoPresenter_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15) {
        this.flowTrackerProvider = provider;
        this.livenessTrackerProvider = provider2;
        this.screenLoadTrackerProvider = provider3;
        this.nfcTrackerProvider = provider4;
        this.runtimePermissionsManagerProvider = provider5;
        this.documentConfigurationManagerProvider = provider6;
        this.onfidoPresenterInitializerProvider = provider7;
        this.nfcDataRepositoryProvider = provider8;
        this.schedulersProvider = provider9;
        this.onfidoRemoteConfigProvider = provider10;
        this.remoteLoggerTreeProvider = provider11;
        this.deviceUtilsProvider = provider12;
        this.waitingScreenTrackerProvider = provider13;
        this.nfcInteractorProvider = provider14;
        this.shouldLaunchNfcFlowUseCaseProvider = provider15;
    }

    public static C2026OnfidoPresenter_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15) {
        return new C2026OnfidoPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static OnfidoPresenter newInstance(FlowTracker flowTracker, LivenessTracker livenessTracker, ScreenLoadTracker screenLoadTracker, NfcTracker nfcTracker, RuntimePermissionsManager runtimePermissionsManager, DocumentConfigurationManager documentConfigurationManager, OnfidoPresenterInitializer onfidoPresenterInitializer, NfcDataRepository nfcDataRepository, SchedulersProvider schedulersProvider, OnfidoRemoteConfig onfidoRemoteConfig, RemoteLoggerTree remoteLoggerTree, DeviceUtils deviceUtils, WaitingScreenTracker waitingScreenTracker, NfcInteractor nfcInteractor, ShouldLaunchNfcFlowUseCase shouldLaunchNfcFlowUseCase, OnfidoConfig onfidoConfig) {
        return new OnfidoPresenter(flowTracker, livenessTracker, screenLoadTracker, nfcTracker, runtimePermissionsManager, documentConfigurationManager, onfidoPresenterInitializer, nfcDataRepository, schedulersProvider, onfidoRemoteConfig, remoteLoggerTree, deviceUtils, waitingScreenTracker, nfcInteractor, shouldLaunchNfcFlowUseCase, onfidoConfig);
    }

    public OnfidoPresenter get(OnfidoConfig onfidoConfig) {
        return newInstance((FlowTracker) this.flowTrackerProvider.get(), (LivenessTracker) this.livenessTrackerProvider.get(), (ScreenLoadTracker) this.screenLoadTrackerProvider.get(), (NfcTracker) this.nfcTrackerProvider.get(), (RuntimePermissionsManager) this.runtimePermissionsManagerProvider.get(), (DocumentConfigurationManager) this.documentConfigurationManagerProvider.get(), (OnfidoPresenterInitializer) this.onfidoPresenterInitializerProvider.get(), (NfcDataRepository) this.nfcDataRepositoryProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (RemoteLoggerTree) this.remoteLoggerTreeProvider.get(), (DeviceUtils) this.deviceUtilsProvider.get(), (WaitingScreenTracker) this.waitingScreenTrackerProvider.get(), (NfcInteractor) this.nfcInteractorProvider.get(), (ShouldLaunchNfcFlowUseCase) this.shouldLaunchNfcFlowUseCaseProvider.get(), onfidoConfig);
    }
}
