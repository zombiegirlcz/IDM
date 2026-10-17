package com.onfido.android.sdk.capture.ui.camera.rx;

import a31.l;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCase;
import com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCaseResult;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocSide;
import dlk.k;
import igm.g;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002>?B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120!2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J=\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120!2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b$\u0010%Ja\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120.2\b\b\u0002\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010*\u001a\u0004\u0018\u00010)2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R)\u0010=\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010707068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer;", "", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "nativeDetector", "Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;", "documentConfigurationManager", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentProcessingUseCase;", "documentProcessingUseCase", "<init>", "(Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/usecase/DocumentProcessingUseCase;)V", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "upstream", "", "isFirstStart", "isAccessibilityEnabled", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;", "getAutoCaptureWithNoOverlayDelayObservable", "(Lio/reactivex/rxjava3/core/Observable;ZZ)Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/DocumentType;", "documentType", "getAutoCaptureWithOverlayDelayObservable", "(Lcom/onfido/android/sdk/capture/DocumentType;Lio/reactivex/rxjava3/core/Observable;ZZ)Lio/reactivex/rxjava3/core/Observable;", "passportDelayTimerFinishedObservable", "(Lcom/onfido/android/sdk/capture/DocumentType;)Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countryCode", "shouldAutoCapture", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)Z", "shouldShowInitialOverlay", "(Lcom/onfido/android/sdk/capture/DocumentType;)Z", "Lio/reactivex/rxjava3/core/ObservableTransformer;", "firstFrameDelayTransformer", "(ZZ)Lio/reactivex/rxjava3/core/ObservableTransformer;", "transform$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;ZZ)Lio/reactivex/rxjava3/core/ObservableTransformer;", "transform", "enableManualFallback", "isEdgeDetectionTimeoutStarted", "Lcom/onfido/api/client/data/DocSide;", "documentSide", "Lkotlin/Function0;", "", "manualFallbackCallback", "Lkotlinx/coroutines/flow/Flow;", "getImageProcessingTransformedFlow$onfido_capture_sdk_core_release", "(ZZLcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/api/client/data/DocSide;Lkotlin/jvm/functions/Function0;ZZ)Lkotlinx/coroutines/flow/Flow;", "getImageProcessingTransformedFlow", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentProcessingUseCase;", "Lio/reactivex/rxjava3/core/Maybe;", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "kotlin.jvm.PlatformType", "firstFrameMaybe$delegate", "Lkotlin/Lazy;", "getFirstFrameMaybe", "()Lio/reactivex/rxjava3/core/Maybe;", "firstFrameMaybe", "Companion", "DocumentCaptureResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureDelayTransformer {
    private static final long AUTOCAPTURE_NO_OVERLAY_DELAY_MS = 2000;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long IMAGE_PROCESSING_START_TIMER_MS = 3000;
    private static final long PASSPORT_OVERLAY_DELAY_MS = 3000;

    @NotNull
    private final DocumentConfigurationManager documentConfigurationManager;

    @NotNull
    private final DocumentProcessingUseCase documentProcessingUseCase;

    /* JADX INFO: renamed from: firstFrameMaybe$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy firstFrameMaybe;

    @NotNull
    private final NativeDetector nativeDetector;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$Companion;", "", "()V", "AUTOCAPTURE_NO_OVERLAY_DELAY_MS", "", "IMAGE_PROCESSING_START_TIMER_MS", "PASSPORT_OVERLAY_DELAY_MS", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;", "", "()V", "ImageObservableResult", "PassportDelayTimerFinished", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult$ImageObservableResult;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult$PassportDelayTimerFinished;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DocumentCaptureResult {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult$ImageObservableResult;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;", "processingResults", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "(Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;)V", "getProcessingResults", "()Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ImageObservableResult extends DocumentCaptureResult {

            @NotNull
            private final DocumentProcessingResults processingResults;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageObservableResult(@NotNull DocumentProcessingResults processingResults) {
                super(null);
                Intrinsics.checkNotNullParameter(processingResults, "processingResults");
                this.processingResults = processingResults;
            }

            public static /* synthetic */ ImageObservableResult copy$default(ImageObservableResult imageObservableResult, DocumentProcessingResults documentProcessingResults, int i, Object obj2) {
                if ((i & 1) != 0) {
                    documentProcessingResults = imageObservableResult.processingResults;
                }
                return imageObservableResult.copy(documentProcessingResults);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentProcessingResults getProcessingResults() {
                return this.processingResults;
            }

            @NotNull
            public final ImageObservableResult copy(@NotNull DocumentProcessingResults processingResults) {
                Intrinsics.checkNotNullParameter(processingResults, "processingResults");
                return new ImageObservableResult(processingResults);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ImageObservableResult) && Intrinsics.f(this.processingResults, ((ImageObservableResult) other).processingResults);
            }

            @NotNull
            public final DocumentProcessingResults getProcessingResults() {
                return this.processingResults;
            }

            public int hashCode() {
                return this.processingResults.hashCode();
            }

            @NotNull
            public String toString() {
                return "ImageObservableResult(processingResults=" + this.processingResults + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult$PassportDelayTimerFinished;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PassportDelayTimerFinished extends DocumentCaptureResult {

            @NotNull
            public static final PassportDelayTimerFinished INSTANCE = new PassportDelayTimerFinished();

            private PassportDelayTimerFinished() {
                super(null);
            }
        }

        private DocumentCaptureResult() {
        }

        public /* synthetic */ DocumentCaptureResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DocumentCaptureDelayTransformer(@NotNull NativeDetector nativeDetector, @NotNull DocumentConfigurationManager documentConfigurationManager, @NotNull SchedulersProvider schedulersProvider, @NotNull DocumentProcessingUseCase documentProcessingUseCase) {
        Intrinsics.checkNotNullParameter(nativeDetector, "nativeDetector");
        Intrinsics.checkNotNullParameter(documentConfigurationManager, "documentConfigurationManager");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(documentProcessingUseCase, "documentProcessingUseCase");
        this.nativeDetector = nativeDetector;
        this.documentConfigurationManager = documentConfigurationManager;
        this.schedulersProvider = schedulersProvider;
        this.documentProcessingUseCase = documentProcessingUseCase;
        this.firstFrameMaybe = j.b(new DocumentCaptureDelayTransformer$firstFrameMaybe$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ObservableTransformer firstFrameDelayTransformer(final boolean isFirstStart, final boolean isAccessibilityEnabled) {
        return new ObservableTransformer(this) { // from class: com.onfido.android.sdk.capture.ui.camera.rx.a

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DocumentCaptureDelayTransformer f50034c;

            {
                this.f50034c = this;
            }

            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource b(Observable observable) {
                return DocumentCaptureDelayTransformer.firstFrameDelayTransformer$lambda$2(isFirstStart, isAccessibilityEnabled, this.f50034c, observable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource firstFrameDelayTransformer$lambda$2(boolean z, boolean z3, final DocumentCaptureDelayTransformer this$0, final Observable upstream) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        if (!z || !z3) {
            return upstream;
        }
        Maybe firstFrameMaybe = this$0.getFirstFrameMaybe();
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer$firstFrameDelayTransformer$1$1
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(DocumentDetectionFrame documentDetectionFrame) {
                return Observable.timer(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, TimeUnit.MILLISECONDS, this.this$0.schedulersProvider.getTimer());
            }
        };
        firstFrameMaybe.getClass();
        Observable observableFlatMap = new mgm.b(firstFrameMaybe, oVar, 2).flatMap(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer$firstFrameDelayTransformer$1$2
            @NotNull
            public final ObservableSource apply(long j2) {
                return upstream;
            }

            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).longValue());
            }
        });
        Intrinsics.h(observableFlatMap);
        return observableFlatMap;
    }

    private final Observable getAutoCaptureWithNoOverlayDelayObservable(final Observable upstream, boolean isFirstStart, boolean isAccessibilityEnabled) {
        Observable observableCompose = Observable.timer(2000L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).flatMap(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer.getAutoCaptureWithNoOverlayDelayObservable.1
            @NotNull
            public final ObservableSource apply(long j2) {
                return upstream.map(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer.getAutoCaptureWithNoOverlayDelayObservable.1.1
                    @Override // igm.o
                    @NotNull
                    public final DocumentCaptureResult.ImageObservableResult apply(@NotNull DocumentProcessingResults p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return new DocumentCaptureResult.ImageObservableResult(p0);
                    }
                });
            }

            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).longValue());
            }
        }).compose(firstFrameDelayTransformer(isFirstStart, isAccessibilityEnabled));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    private final Observable getAutoCaptureWithOverlayDelayObservable(final DocumentType documentType, final Observable upstream, final boolean isFirstStart, final boolean isAccessibilityEnabled) {
        Observable observableFlatMap = Observable.timer(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).flatMap(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer.getAutoCaptureWithOverlayDelayObservable.1
            @NotNull
            public final ObservableSource apply(long j2) {
                return Observable.concat(DocumentCaptureDelayTransformer.this.passportDelayTimerFinishedObservable(documentType), upstream.map(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer.getAutoCaptureWithOverlayDelayObservable.1.1
                    @Override // igm.o
                    @NotNull
                    public final DocumentCaptureResult.ImageObservableResult apply(@NotNull DocumentProcessingResults p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return new DocumentCaptureResult.ImageObservableResult(p0);
                    }
                }).compose(DocumentCaptureDelayTransformer.this.firstFrameDelayTransformer(isFirstStart, isAccessibilityEnabled)));
            }

            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).longValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    private final Maybe getFirstFrameMaybe() {
        return (Maybe) this.firstFrameMaybe.getValue();
    }

    public static /* synthetic */ Flow getImageProcessingTransformedFlow$onfido_capture_sdk_core_release$default(DocumentCaptureDelayTransformer documentCaptureDelayTransformer, boolean z, boolean z3, DocumentType documentType, CountryCode countryCode, DocSide docSide, Function0 function0, boolean z4, boolean z6, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        return documentCaptureDelayTransformer.getImageProcessingTransformedFlow$onfido_capture_sdk_core_release(z, z3, documentType, countryCode, docSide, function0, z4, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable passportDelayTimerFinishedObservable(DocumentType documentType) {
        Observable map = Observable.fromCallable(new l(documentType, 10)).filter(new p() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer.passportDelayTimerFinishedObservable.2
            @Override // igm.p
            public final boolean test(Boolean bool) {
                Intrinsics.h(bool);
                return bool.booleanValue();
            }
        }).map(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer.passportDelayTimerFinishedObservable.3
            @Override // igm.o
            @NotNull
            public final DocumentCaptureResult apply(Boolean bool) {
                return DocumentCaptureResult.PassportDelayTimerFinished.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean passportDelayTimerFinishedObservable$lambda$1(DocumentType documentType) {
        Intrinsics.checkNotNullParameter(documentType, "$documentType");
        return Boolean.valueOf(documentType == DocumentType.PASSPORT);
    }

    private final boolean shouldAutoCapture(DocumentType documentType, CountryCode countryCode) {
        return this.documentConfigurationManager.shouldAutocapture(documentType, countryCode);
    }

    private final boolean shouldShowInitialOverlay(DocumentType documentType) {
        return this.documentConfigurationManager.shouldShowInitialOverlay(documentType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource transform$lambda$0(DocumentCaptureDelayTransformer this$0, boolean z, DocumentType documentType, CountryCode countryCode, boolean z3, Observable upstream) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(documentType, "$documentType");
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        if (!this$0.nativeDetector.hasNativeLibrary()) {
            return Observable.empty();
        }
        if (z) {
            return this$0.passportDelayTimerFinishedObservable(documentType).delay(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, TimeUnit.MILLISECONDS);
        }
        if (this$0.shouldAutoCapture(documentType, countryCode)) {
            return (z3 && this$0.shouldShowInitialOverlay(documentType)) ? this$0.getAutoCaptureWithOverlayDelayObservable(documentType, upstream, z3, z) : this$0.getAutoCaptureWithNoOverlayDelayObservable(upstream, z3, z);
        }
        Observable observableCompose = upstream.map(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer$transform$1$1
            @Override // igm.o
            @NotNull
            public final DocumentCaptureDelayTransformer.DocumentCaptureResult.ImageObservableResult apply(@NotNull DocumentProcessingResults p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new DocumentCaptureDelayTransformer.DocumentCaptureResult.ImageObservableResult(p0);
            }
        }).compose(this$0.firstFrameDelayTransformer(z3, z));
        Intrinsics.h(observableCompose);
        return observableCompose;
    }

    @NotNull
    public final Flow getImageProcessingTransformedFlow$onfido_capture_sdk_core_release(final boolean enableManualFallback, final boolean isEdgeDetectionTimeoutStarted, @NotNull DocumentType documentType, CountryCode countryCode, DocSide documentSide, @NotNull final Function0<Unit> manualFallbackCallback, boolean isFirstStart, boolean isAccessibilityEnabled) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(manualFallbackCallback, "manualFallbackCallback");
        Observable observableDoOnNext = this.documentProcessingUseCase.execute$onfido_capture_sdk_core_release(documentType, countryCode, documentSide).doOnNext(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer$getImageProcessingTransformedFlow$1
            @Override // igm.g
            public final void accept(@NotNull DocumentProcessingUseCaseResult documentProcessingUseCaseResult) {
                Intrinsics.checkNotNullParameter(documentProcessingUseCaseResult, "<name for destructuring parameter 0>");
                DocumentProcessingResults documentProcessingResults = documentProcessingUseCaseResult.getDocumentProcessingResults();
                if (enableManualFallback && !isEdgeDetectionTimeoutStarted && documentProcessingResults.getEdgeDetectionResults().hasAny()) {
                    manualFallbackCallback.invoke();
                }
            }
        });
        final DocumentCaptureDelayTransformer$getImageProcessingTransformedFlow$2 documentCaptureDelayTransformer$getImageProcessingTransformedFlow$2 = new h0() { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer$getImageProcessingTransformedFlow$2
            @Override // kotlin.jvm.internal.h0, wim.p
            public Object get(Object obj2) {
                return ((DocumentProcessingUseCaseResult) obj2).getDocumentProcessingResults();
            }
        };
        Observable observableCompose = observableDoOnNext.map(new o(documentCaptureDelayTransformer$getImageProcessingTransformedFlow$2) { // from class: com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer$sam$io_reactivex_rxjava3_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(documentCaptureDelayTransformer$getImageProcessingTransformedFlow$2, "function");
                this.function = documentCaptureDelayTransformer$getImageProcessingTransformedFlow$2;
            }

            @Override // igm.o
            public final /* synthetic */ Object apply(Object obj2) {
                return this.function.invoke(obj2);
            }
        }).compose(transform$onfido_capture_sdk_core_release(documentType, countryCode, isFirstStart, isAccessibilityEnabled));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return q.k(new k(observableCompose, (Continuation) null, 4));
    }

    @NotNull
    public final ObservableTransformer transform$onfido_capture_sdk_core_release(@NotNull DocumentType documentType, CountryCode countryCode, boolean isFirstStart, boolean isAccessibilityEnabled) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return new b(this, isAccessibilityEnabled, documentType, countryCode, isFirstStart);
    }
}
