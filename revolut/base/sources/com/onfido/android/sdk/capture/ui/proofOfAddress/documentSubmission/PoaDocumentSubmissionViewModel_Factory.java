package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaDocumentSubmissionViewModel_Factory implements el.b {
    private final Provider compressPoaDocumentUseCaseProvider;
    private final Provider schedulersProvider;
    private final Provider screenTrackerProvider;
    private final Provider uploadPoaDocumentUseCaseProvider;
    private final Provider waitingScreenTrackerProvider;

    public PoaDocumentSubmissionViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.screenTrackerProvider = provider;
        this.schedulersProvider = provider2;
        this.compressPoaDocumentUseCaseProvider = provider3;
        this.uploadPoaDocumentUseCaseProvider = provider4;
        this.waitingScreenTrackerProvider = provider5;
    }

    public static PoaDocumentSubmissionViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new PoaDocumentSubmissionViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static PoaDocumentSubmissionViewModel newInstance(ScreenTracker screenTracker, SchedulersProvider schedulersProvider, CompressPoaDocumentUseCase compressPoaDocumentUseCase, UploadPoaDocumentUseCase uploadPoaDocumentUseCase, WaitingScreenTracker waitingScreenTracker) {
        return new PoaDocumentSubmissionViewModel(screenTracker, schedulersProvider, compressPoaDocumentUseCase, uploadPoaDocumentUseCase, waitingScreenTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public PoaDocumentSubmissionViewModel get() {
        return newInstance((ScreenTracker) this.screenTrackerProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (CompressPoaDocumentUseCase) this.compressPoaDocumentUseCaseProvider.get(), (UploadPoaDocumentUseCase) this.uploadPoaDocumentUseCaseProvider.get(), (WaitingScreenTracker) this.waitingScreenTrackerProvider.get());
    }
}
