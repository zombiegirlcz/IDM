package com.onfido.android.sdk.capture.ui.camera.document;

import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import igm.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003B]\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&¨\u0006'"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureResultConsumer;", "Ligm/g;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel;", "viewModel", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "remoteConfig", "", "shouldAutocapture", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "shouldHideOverlay", "startCapture", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$Content;", "showLiveValidationBubble", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;", "liveValidationBubbleVisibility", "<init>", "(Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;ZLkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "transformerResult", "accept", "(Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;)V", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "documentProcessingResults", "onImageProcessingResult$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;)V", "onImageProcessingResult", "result", "invoke", "(Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "Z", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureResultConsumer implements g, Function2<DocumentCaptureDelayTransformer.DocumentCaptureResult, Continuation<? super Unit>, Object> {

    @NotNull
    private final MutableStateFlow liveValidationBubbleVisibility;

    @NotNull
    private final OnfidoRemoteConfig remoteConfig;
    private final boolean shouldAutocapture;

    @NotNull
    private final MutableSharedFlow shouldHideOverlay;

    @NotNull
    private final MutableStateFlow showLiveValidationBubble;

    @NotNull
    private final MutableSharedFlow startCapture;

    @NotNull
    private final DocumentCaptureViewModel viewModel;

    public DocumentCaptureResultConsumer(@NotNull DocumentCaptureViewModel viewModel, @NotNull OnfidoRemoteConfig remoteConfig, boolean z, @NotNull MutableSharedFlow shouldHideOverlay, @NotNull MutableSharedFlow startCapture, @NotNull MutableStateFlow showLiveValidationBubble, @NotNull MutableStateFlow liveValidationBubbleVisibility) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(shouldHideOverlay, "shouldHideOverlay");
        Intrinsics.checkNotNullParameter(startCapture, "startCapture");
        Intrinsics.checkNotNullParameter(showLiveValidationBubble, "showLiveValidationBubble");
        Intrinsics.checkNotNullParameter(liveValidationBubbleVisibility, "liveValidationBubbleVisibility");
        this.viewModel = viewModel;
        this.remoteConfig = remoteConfig;
        this.shouldAutocapture = z;
        this.shouldHideOverlay = shouldHideOverlay;
        this.startCapture = startCapture;
        this.showLiveValidationBubble = showLiveValidationBubble;
        this.liveValidationBubbleVisibility = liveValidationBubbleVisibility;
    }

    @Override // igm.g
    public void accept(@NotNull DocumentCaptureDelayTransformer.DocumentCaptureResult transformerResult) {
        Intrinsics.checkNotNullParameter(transformerResult, "transformerResult");
        if (transformerResult instanceof DocumentCaptureDelayTransformer.DocumentCaptureResult.ImageObservableResult) {
            onImageProcessingResult$onfido_capture_sdk_core_release(((DocumentCaptureDelayTransformer.DocumentCaptureResult.ImageObservableResult) transformerResult).getProcessingResults());
        } else if (Intrinsics.f(transformerResult, DocumentCaptureDelayTransformer.DocumentCaptureResult.PassportDelayTimerFinished.INSTANCE)) {
            this.shouldHideOverlay.k(Boolean.TRUE);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(@NotNull DocumentCaptureDelayTransformer.DocumentCaptureResult documentCaptureResult, @NotNull Continuation<? super Unit> continuation) {
        accept(documentCaptureResult);
        return Unit.f186387a;
    }

    public final void onImageProcessingResult$onfido_capture_sdk_core_release(@NotNull DocumentProcessingResults documentProcessingResults) {
        MutableStateFlow mutableStateFlow;
        Object error;
        Intrinsics.checkNotNullParameter(documentProcessingResults, "documentProcessingResults");
        boolean wasExecuted = documentProcessingResults.getGlareResults().getWasExecuted();
        boolean wasExecuted2 = documentProcessingResults.getBarcodeResults().getWasExecuted();
        boolean hasGlare = documentProcessingResults.getGlareResults().getHasGlare();
        boolean z = documentProcessingResults.getEdgeDetectionResults().hasAny() && !documentProcessingResults.getBarcodeResults().getHasBarcode();
        boolean z3 = (wasExecuted && hasGlare) || (wasExecuted2 && z);
        if (this.shouldAutocapture && this.viewModel.isDocumentFrameValidForAutoCapture$onfido_capture_sdk_core_release(documentProcessingResults)) {
            this.viewModel.setAutoCaptured$onfido_capture_sdk_core_release(true);
            this.startCapture.k(Boolean.valueOf(!this.remoteConfig.isMultiImageCaptureEnabled()));
        }
        Object visible = z3 ? new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(false, 1, null)) : OnfidoCaptureValidationBubble.VisibilityCommand.Invisible.INSTANCE;
        if (z3) {
            if (hasGlare) {
                mutableStateFlow = this.showLiveValidationBubble;
                error = new OnfidoCaptureValidationBubble.Content.Info(R.string.onfido_doc_capture_alert_glare_title, Integer.valueOf(R.string.onfido_doc_capture_alert_glare_detail));
            } else if (z) {
                mutableStateFlow = this.showLiveValidationBubble;
                error = new OnfidoCaptureValidationBubble.Content.Error(R.string.onfido_doc_capture_alert_no_barcode_title, Integer.valueOf(R.string.onfido_doc_capture_alert_no_barcode_detail));
            }
            mutableStateFlow.k(error);
        }
        this.liveValidationBubbleVisibility.k(visible);
    }
}
