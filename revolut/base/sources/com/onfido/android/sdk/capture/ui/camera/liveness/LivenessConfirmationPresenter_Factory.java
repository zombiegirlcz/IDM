package com.onfido.android.sdk.capture.ui.camera.liveness;

import android.os.ResultReceiver;
import com.onfido.android.sdk.capture.audio.VolumeManager;
import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessConfirmationPresenter_Factory implements b {
    private final Provider livenessCaptureSettingsProvider;
    private final Provider livenessTrackerProvider;
    private final Provider mediaCallbackProvider;
    private final Provider onfidoAPIProvider;
    private final Provider payloadHelperProvider;
    private final Provider schedulersProvider;
    private final Provider sdkUploadMetadataHelperProvider;
    private final Provider timeProvider;
    private final Provider volumeManagerProvider;
    private final Provider waitingScreenTrackerProvider;

    public LivenessConfirmationPresenter_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.onfidoAPIProvider = provider;
        this.sdkUploadMetadataHelperProvider = provider2;
        this.payloadHelperProvider = provider3;
        this.livenessCaptureSettingsProvider = provider4;
        this.volumeManagerProvider = provider5;
        this.schedulersProvider = provider6;
        this.livenessTrackerProvider = provider7;
        this.timeProvider = provider8;
        this.waitingScreenTrackerProvider = provider9;
        this.mediaCallbackProvider = provider10;
    }

    public static LivenessConfirmationPresenter_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        return new LivenessConfirmationPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static LivenessConfirmationPresenter newInstance(OnfidoApiService onfidoApiService, SdkUploadMetadataHelper sdkUploadMetadataHelper, PayloadHelper payloadHelper, SdkConfiguration.LivenessCapture livenessCapture, VolumeManager volumeManager, SchedulersProvider schedulersProvider, LivenessTracker livenessTracker, TimeProvider timeProvider, WaitingScreenTracker waitingScreenTracker, ResultReceiver resultReceiver) {
        return new LivenessConfirmationPresenter(onfidoApiService, sdkUploadMetadataHelper, payloadHelper, livenessCapture, volumeManager, schedulersProvider, livenessTracker, timeProvider, waitingScreenTracker, resultReceiver);
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessConfirmationPresenter get() {
        return newInstance((OnfidoApiService) this.onfidoAPIProvider.get(), (SdkUploadMetadataHelper) this.sdkUploadMetadataHelperProvider.get(), (PayloadHelper) this.payloadHelperProvider.get(), (SdkConfiguration.LivenessCapture) this.livenessCaptureSettingsProvider.get(), (VolumeManager) this.volumeManagerProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (LivenessTracker) this.livenessTrackerProvider.get(), (TimeProvider) this.timeProvider.get(), (WaitingScreenTracker) this.waitingScreenTrackerProvider.get(), (ResultReceiver) this.mediaCallbackProvider.get());
    }
}
