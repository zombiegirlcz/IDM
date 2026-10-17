package com.onfido.android.sdk.capture.ui.camera.rx;

import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import igm.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureResultConsumer;", "Ligm/g;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$View;", "view", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter;", "presenter", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "remoteConfig", "<init>", "(Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$View;Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "transformerResult", "", "accept", "(Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;)V", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "documentProcessingResults", "onImageProcessingResult$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;)V", "onImageProcessingResult", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$View;", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureResultConsumer implements g {

    @NotNull
    private final CapturePresenter presenter;

    @NotNull
    private final OnfidoRemoteConfig remoteConfig;

    @NotNull
    private final CapturePresenter.View view;

    public DocumentCaptureResultConsumer(@NotNull CapturePresenter.View view, @NotNull CapturePresenter presenter, @NotNull OnfidoRemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.view = view;
        this.presenter = presenter;
        this.remoteConfig = remoteConfig;
    }

    @Override // igm.g
    public void accept(@NotNull DocumentCaptureDelayTransformer.DocumentCaptureResult transformerResult) {
        Intrinsics.checkNotNullParameter(transformerResult, "transformerResult");
        if (transformerResult instanceof DocumentCaptureDelayTransformer.DocumentCaptureResult.ImageObservableResult) {
            onImageProcessingResult$onfido_capture_sdk_core_release(((DocumentCaptureDelayTransformer.DocumentCaptureResult.ImageObservableResult) transformerResult).getProcessingResults());
        } else if (Intrinsics.f(transformerResult, DocumentCaptureDelayTransformer.DocumentCaptureResult.PassportDelayTimerFinished.INSTANCE)) {
            this.view.hideDocumentOverlay();
        }
    }

    public final void onImageProcessingResult$onfido_capture_sdk_core_release(@NotNull DocumentProcessingResults documentProcessingResults) {
        Intrinsics.checkNotNullParameter(documentProcessingResults, "documentProcessingResults");
        boolean wasExecuted = documentProcessingResults.getGlareResults().getWasExecuted();
        boolean wasExecuted2 = documentProcessingResults.getBarcodeResults().getWasExecuted();
        boolean hasGlare = documentProcessingResults.getGlareResults().getHasGlare();
        boolean z = documentProcessingResults.getEdgeDetectionResults().hasAny() && !documentProcessingResults.getBarcodeResults().getHasBarcode();
        boolean z3 = (wasExecuted && hasGlare) || (wasExecuted2 && z);
        if (this.presenter.shouldAutoCaptureDocument$onfido_capture_sdk_core_release()) {
            if (this.presenter.isDocumentFrameValidForAutoCapture$onfido_capture_sdk_core_release(documentProcessingResults)) {
                this.presenter.setAutoCaptured$onfido_capture_sdk_core_release(true);
                this.view.capture(!this.remoteConfig.isMultiImageCaptureEnabled());
            } else {
                this.view.deactivateCaptureButton();
            }
        }
        OnfidoCaptureValidationBubble.VisibilityCommand visible = z3 ? new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(false, 1, null)) : OnfidoCaptureValidationBubble.VisibilityCommand.Invisible.INSTANCE;
        if (z3) {
            if (hasGlare) {
                this.view.setGlareWarningContent();
            } else if (z) {
                this.view.setLiveValidationBubbleContent(new OnfidoCaptureValidationBubble.Content.Error(R.string.onfido_doc_capture_alert_no_barcode_title, Integer.valueOf(R.string.onfido_doc_capture_alert_no_barcode_detail)));
            }
        }
        this.view.setLiveValidationBubbleVisibilityCommand(visible);
    }
}
