package com.onfido.android.sdk.capture.internal.usecase;

import a0.d;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.detector.rectangle.RectDetectionResult;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase;
import com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCaseResult;
import com.onfido.android.sdk.capture.internal.usecase.DocumentPosition;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.utils.StringExtensionsKt;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 -2\u00020\u0001:\u0003.-/B3\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0012¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u000f0\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0012¢\u0006\u0004\b\u001d\u0010\u0012J\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u000fH\u0012¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u0016*\u00020\u00162\u0006\u0010!\u001a\u00020\u0016H\u0012¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000eH\u0010¢\u0006\u0004\b&\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,¨\u00060"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase;", "", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPositionUseCase;", "documentPositionUseCase", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "nativeDetector", "Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "vibratorService", "Landroid/content/Context;", "context", "<init>", "(Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPositionUseCase;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;Lcom/onfido/android/sdk/capture/internal/service/VibratorService;Landroid/content/Context;)V", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPosition;", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCaseResult;", "observeAutoCapture", "(Lio/reactivex/rxjava3/core/Observable;)Lio/reactivex/rxjava3/core/Observable;", "observePosition", "Lio/reactivex/rxjava3/schedulers/Timed;", "position", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$PositionResult;", "mapToPositionResult", "(Lio/reactivex/rxjava3/schedulers/Timed;)Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$PositionResult;", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$AutocaptureResult;", "mapToAutocaptureResult", "(Lio/reactivex/rxjava3/schedulers/Timed;)Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$AutocaptureResult;", "kotlin.jvm.PlatformType", "vibrateWhenDocumentNormal", "", "getAccessibilityTextDuration", "(Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPosition;)J", "previousResult", "validateWith", "(Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$PositionResult;Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$PositionResult;)Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$PositionResult;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "rectDetectionObservable", "observeAccessibilityCapture$onfido_capture_sdk_core_release", "observeAccessibilityCapture", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPositionUseCase;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "Landroid/content/Context;", "Companion", "AutocaptureResult", "PositionResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class AccessibleDocumentCaptureUseCase {

    @Deprecated
    public static final long ACCESSIBILITY_AUTO_CAPTURE_DELAY = 2000;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long FRAME_SAMPLING_PERIOD_MS = 350;

    @Deprecated
    public static final long READ_ACCESSIBILITY_REPEAT_DELAY = 4000;

    @NotNull
    private final Context context;

    @NotNull
    private final DocumentPositionUseCase documentPositionUseCase;

    @NotNull
    private final NativeDetector nativeDetector;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final VibratorService vibratorService;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$AutocaptureResult;", "", "timeStamp", "", "documentPosition", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPosition;", "shouldAutocapture", "", "(JLcom/onfido/android/sdk/capture/internal/usecase/DocumentPosition;Z)V", "getDocumentPosition", "()Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPosition;", "getShouldAutocapture", "()Z", "getTimeStamp", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AutocaptureResult {

        @NotNull
        private final DocumentPosition documentPosition;
        private final boolean shouldAutocapture;
        private final long timeStamp;

        public AutocaptureResult(long j2, @NotNull DocumentPosition documentPosition, boolean z) {
            Intrinsics.checkNotNullParameter(documentPosition, "documentPosition");
            this.timeStamp = j2;
            this.documentPosition = documentPosition;
            this.shouldAutocapture = z;
        }

        public static /* synthetic */ AutocaptureResult copy$default(AutocaptureResult autocaptureResult, long j2, DocumentPosition documentPosition, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                j2 = autocaptureResult.timeStamp;
            }
            if ((i & 2) != 0) {
                documentPosition = autocaptureResult.documentPosition;
            }
            if ((i & 4) != 0) {
                z = autocaptureResult.shouldAutocapture;
            }
            return autocaptureResult.copy(j2, documentPosition, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTimeStamp() {
            return this.timeStamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DocumentPosition getDocumentPosition() {
            return this.documentPosition;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShouldAutocapture() {
            return this.shouldAutocapture;
        }

        @NotNull
        public final AutocaptureResult copy(long timeStamp, @NotNull DocumentPosition documentPosition, boolean shouldAutocapture) {
            Intrinsics.checkNotNullParameter(documentPosition, "documentPosition");
            return new AutocaptureResult(timeStamp, documentPosition, shouldAutocapture);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutocaptureResult)) {
                return false;
            }
            AutocaptureResult autocaptureResult = (AutocaptureResult) other;
            return this.timeStamp == autocaptureResult.timeStamp && Intrinsics.f(this.documentPosition, autocaptureResult.documentPosition) && this.shouldAutocapture == autocaptureResult.shouldAutocapture;
        }

        @NotNull
        public final DocumentPosition getDocumentPosition() {
            return this.documentPosition;
        }

        public final boolean getShouldAutocapture() {
            return this.shouldAutocapture;
        }

        public final long getTimeStamp() {
            return this.timeStamp;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldAutocapture) + ((this.documentPosition.hashCode() + (Long.hashCode(this.timeStamp) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("AutocaptureResult(timeStamp=");
            sb6.append(this.timeStamp);
            sb6.append(", documentPosition=");
            sb6.append(this.documentPosition);
            sb6.append(", shouldAutocapture=");
            return j6.a.x(sb6, this.shouldAutocapture, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ AutocaptureResult(long j2, DocumentPosition documentPosition, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, documentPosition, (i & 4) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$Companion;", "", "()V", "ACCESSIBILITY_AUTO_CAPTURE_DELAY", "", "FRAME_SAMPLING_PERIOD_MS", "READ_ACCESSIBILITY_REPEAT_DELAY", "getMainText", "", "documentPosition", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPosition;", "getMainTextAccessibility", "shouldAutocapture", "", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$AutocaptureResult;", "previousResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getMainText(DocumentPosition documentPosition) {
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentNormal.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_position_ok;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentNotFound.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_no_doc;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTooBottom.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_too_low;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentClose.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_distance_close;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentFar.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_distance_far;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTooLeft.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_too_left;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTooRight.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_too_right;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTooTop.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_too_high;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentBottom.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_slightly_low;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTop.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_slightly_high;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getMainTextAccessibility(DocumentPosition documentPosition) {
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentNormal.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_position_ok_accessibility;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentNotFound.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_no_doc_accessibility;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTooBottom.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_too_low_accessibility;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentClose.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_distance_close_accessibility;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentFar.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_distance_far_accessibility;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTooLeft.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_too_left_accessibility;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTooRight.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_too_right_accessibility;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTooTop.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_too_high_accessibility;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentBottom.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_slightly_low_accessibility;
            }
            if (Intrinsics.f(documentPosition, DocumentPosition.DocumentTop.INSTANCE)) {
                return R.string.onfido_doc_capture_header_live_guidance_doc_slightly_high_accessibility;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean shouldAutocapture(@NotNull AutocaptureResult autocaptureResult, @NotNull AutocaptureResult previousResult) {
            Intrinsics.checkNotNullParameter(autocaptureResult, "<this>");
            Intrinsics.checkNotNullParameter(previousResult, "previousResult");
            return autocaptureResult.getTimeStamp() - previousResult.getTimeStamp() >= 2000;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase$PositionResult;", "", "timeStamp", "", "documentPosition", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPosition;", "shouldProcess", "", "accessibilityTextDuration", "(JLcom/onfido/android/sdk/capture/internal/usecase/DocumentPosition;ZJ)V", "getAccessibilityTextDuration", "()J", "getDocumentPosition", "()Lcom/onfido/android/sdk/capture/internal/usecase/DocumentPosition;", "getShouldProcess", "()Z", "getTimeStamp", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PositionResult {
        private final long accessibilityTextDuration;

        @NotNull
        private final DocumentPosition documentPosition;
        private final boolean shouldProcess;
        private final long timeStamp;

        public PositionResult(long j2, @NotNull DocumentPosition documentPosition, boolean z, long j3) {
            Intrinsics.checkNotNullParameter(documentPosition, "documentPosition");
            this.timeStamp = j2;
            this.documentPosition = documentPosition;
            this.shouldProcess = z;
            this.accessibilityTextDuration = j3;
        }

        public static /* synthetic */ PositionResult copy$default(PositionResult positionResult, long j2, DocumentPosition documentPosition, boolean z, long j3, int i, Object obj2) {
            if ((i & 1) != 0) {
                j2 = positionResult.timeStamp;
            }
            long j5 = j2;
            if ((i & 2) != 0) {
                documentPosition = positionResult.documentPosition;
            }
            DocumentPosition documentPosition2 = documentPosition;
            if ((i & 4) != 0) {
                z = positionResult.shouldProcess;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                j3 = positionResult.accessibilityTextDuration;
            }
            return positionResult.copy(j5, documentPosition2, z3, j3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTimeStamp() {
            return this.timeStamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DocumentPosition getDocumentPosition() {
            return this.documentPosition;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShouldProcess() {
            return this.shouldProcess;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getAccessibilityTextDuration() {
            return this.accessibilityTextDuration;
        }

        @NotNull
        public final PositionResult copy(long timeStamp, @NotNull DocumentPosition documentPosition, boolean shouldProcess, long accessibilityTextDuration) {
            Intrinsics.checkNotNullParameter(documentPosition, "documentPosition");
            return new PositionResult(timeStamp, documentPosition, shouldProcess, accessibilityTextDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionResult)) {
                return false;
            }
            PositionResult positionResult = (PositionResult) other;
            return this.timeStamp == positionResult.timeStamp && Intrinsics.f(this.documentPosition, positionResult.documentPosition) && this.shouldProcess == positionResult.shouldProcess && this.accessibilityTextDuration == positionResult.accessibilityTextDuration;
        }

        public final long getAccessibilityTextDuration() {
            return this.accessibilityTextDuration;
        }

        @NotNull
        public final DocumentPosition getDocumentPosition() {
            return this.documentPosition;
        }

        public final boolean getShouldProcess() {
            return this.shouldProcess;
        }

        public final long getTimeStamp() {
            return this.timeStamp;
        }

        public int hashCode() {
            return Long.hashCode(this.accessibilityTextDuration) + j6.a.c((this.documentPosition.hashCode() + (Long.hashCode(this.timeStamp) * 31)) * 31, 31, this.shouldProcess);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("PositionResult(timeStamp=");
            sb6.append(this.timeStamp);
            sb6.append(", documentPosition=");
            sb6.append(this.documentPosition);
            sb6.append(", shouldProcess=");
            sb6.append(this.shouldProcess);
            sb6.append(", accessibilityTextDuration=");
            return d.t(sb6, this.accessibilityTextDuration, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ PositionResult(long j2, DocumentPosition documentPosition, boolean z, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, documentPosition, (i & 4) != 0 ? true : z, j3);
        }
    }

    public AccessibleDocumentCaptureUseCase(@NotNull DocumentPositionUseCase documentPositionUseCase, @NotNull SchedulersProvider schedulersProvider, @NotNull NativeDetector nativeDetector, @NotNull VibratorService vibratorService, @ApplicationContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(documentPositionUseCase, "documentPositionUseCase");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(nativeDetector, "nativeDetector");
        Intrinsics.checkNotNullParameter(vibratorService, "vibratorService");
        Intrinsics.checkNotNullParameter(context, "context");
        this.documentPositionUseCase = documentPositionUseCase;
        this.schedulersProvider = schedulersProvider;
        this.nativeDetector = nativeDetector;
        this.vibratorService = vibratorService;
        this.context = context;
    }

    private long getAccessibilityTextDuration(DocumentPosition documentPosition) {
        String string = this.context.getString(Companion.getMainTextAccessibility(documentPosition));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return StringExtensionsKt.readingTimeMilliseconds(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AutocaptureResult mapToAutocaptureResult(Timed position) {
        long j2 = position.f163122b;
        Object obj2 = position.f163121a;
        Intrinsics.checkNotNullExpressionValue(obj2, "value(...)");
        return new AutocaptureResult(j2, (DocumentPosition) obj2, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PositionResult mapToPositionResult(Timed position) {
        long j2 = position.f163122b;
        Object obj2 = position.f163121a;
        Intrinsics.checkNotNullExpressionValue(obj2, "value(...)");
        Intrinsics.checkNotNullExpressionValue(obj2, "value(...)");
        return new PositionResult(j2, (DocumentPosition) obj2, false, getAccessibilityTextDuration((DocumentPosition) obj2), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable observeAutoCapture(Observable observable) {
        Observable observableScan = observable.timestamp(this.schedulersProvider.getTimer()).map(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase$observeAutoCapture$autocaptureObservable$1
            @Override // igm.o
            @NotNull
            public final AccessibleDocumentCaptureUseCase.AutocaptureResult apply(@NotNull Timed p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return this.$tmp0.mapToAutocaptureResult(p0);
            }
        }).scan(new b());
        Intrinsics.checkNotNullExpressionValue(observableScan, "scan(...)");
        Observable observableSample = this.nativeDetector.getFrameData().sample(350L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer());
        final NativeDetector nativeDetector = this.nativeDetector;
        Observable map = observableSample.map(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase$observeAutoCapture$blurObservable$1
            @Override // igm.o
            @NotNull
            public final Boolean apply(@NotNull DocumentDetectionFrame p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(nativeDetector.isBlurDetected(p0));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable map2 = Observable.combineLatest(map, observableScan, new igm.c() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase.observeAutoCapture.1
            @Override // igm.c
            @NotNull
            public final Pair<Boolean, AutocaptureResult> apply(@NotNull Boolean p0, @NotNull AutocaptureResult p17) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return new Pair<>(p0, p17);
            }
        }).filter(new p() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase.observeAutoCapture.2
            @Override // igm.p
            public final boolean test(@NotNull Pair<Boolean, AutocaptureResult> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return !((Boolean) pair.f186385a).booleanValue() && ((AutocaptureResult) pair.f186386b).getShouldAutocapture();
            }
        }).map(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase.observeAutoCapture.3
            @Override // igm.o
            @NotNull
            public final AccessibleDocumentCaptureUseCaseResult apply(@NotNull Pair<Boolean, AutocaptureResult> it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return AccessibleDocumentCaptureUseCaseResult.AutoCaptured.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AutocaptureResult observeAutoCapture$lambda$0(AutocaptureResult previousResult, AutocaptureResult newResult) {
        Intrinsics.checkNotNullParameter(previousResult, "previousResult");
        Intrinsics.checkNotNullParameter(newResult, "newResult");
        DocumentPosition documentPosition = newResult.getDocumentPosition();
        DocumentPosition.DocumentNormal documentNormal = DocumentPosition.DocumentNormal.INSTANCE;
        return (Intrinsics.f(documentPosition, documentNormal) && Intrinsics.f(previousResult.getDocumentPosition(), documentNormal)) ? AutocaptureResult.copy$default(newResult, previousResult.getTimeStamp(), null, Companion.shouldAutocapture(newResult, previousResult), 2, null) : newResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable observePosition(Observable observable) {
        String string = this.context.getString(R.string.onfido_doc_capture_frame_accessibility_pp_auto);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Observable observableScan = observable.skip(StringExtensionsKt.readingTimeMilliseconds(string), TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).timestamp(this.schedulersProvider.getTimer()).map(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase.observePosition.1
            @Override // igm.o
            @NotNull
            public final PositionResult apply(@NotNull Timed p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return AccessibleDocumentCaptureUseCase.this.mapToPositionResult(p0);
            }
        }).scan(new igm.c() { // from class: com.onfido.android.sdk.capture.internal.usecase.a
            @Override // igm.c
            public final Object apply(Object obj2, Object obj3) {
                return AccessibleDocumentCaptureUseCase.observePosition$lambda$1(this.f49968a, (AccessibleDocumentCaptureUseCase.PositionResult) obj2, (AccessibleDocumentCaptureUseCase.PositionResult) obj3);
            }
        });
        final C20223 c20223 = new h0() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase.observePosition.3
            @Override // kotlin.jvm.internal.h0, wim.p
            public Object get(Object obj2) {
                return Boolean.valueOf(((PositionResult) obj2).getShouldProcess());
            }
        };
        Observable observableFilter = observableScan.filter(new p(c20223) { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase$sam$io_reactivex_rxjava3_functions_Predicate$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c20223, "function");
                this.function = c20223;
            }

            @Override // igm.p
            public final /* synthetic */ boolean test(Object obj2) {
                return ((Boolean) this.function.invoke(obj2)).booleanValue();
            }
        });
        final AnonymousClass4 anonymousClass4 = new h0() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase.observePosition.4
            @Override // kotlin.jvm.internal.h0, wim.p
            public Object get(Object obj2) {
                return ((PositionResult) obj2).getDocumentPosition();
            }
        };
        Observable map = observableFilter.map(new o(anonymousClass4) { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase$sam$io_reactivex_rxjava3_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(anonymousClass4, "function");
                this.function = anonymousClass4;
            }

            @Override // igm.o
            public final /* synthetic */ Object apply(Object obj2) {
                return this.function.invoke(obj2);
            }
        }).publish(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase.observePosition.5
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull Observable shared) {
                Intrinsics.checkNotNullParameter(shared, "shared");
                return Observable.mergeArray(shared, AccessibleDocumentCaptureUseCase.this.vibrateWhenDocumentNormal(shared));
            }
        }).map(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase.observePosition.6
            @Override // igm.o
            @NotNull
            public final AccessibleDocumentCaptureUseCaseResult apply(DocumentPosition documentPosition) {
                Companion companion = AccessibleDocumentCaptureUseCase.Companion;
                Intrinsics.h(documentPosition);
                return new AccessibleDocumentCaptureUseCaseResult.DocumentPositionChanged(companion.getMainText(documentPosition), AccessibleDocumentCaptureUseCase.Companion.getMainTextAccessibility(documentPosition));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PositionResult observePosition$lambda$1(AccessibleDocumentCaptureUseCase this$0, PositionResult previousResult, PositionResult newResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(previousResult, "previousResult");
        Intrinsics.checkNotNullParameter(newResult, "newResult");
        return this$0.validateWith(newResult, previousResult);
    }

    private PositionResult validateWith(PositionResult positionResult, PositionResult positionResult2) {
        long accessibilityTextDuration = positionResult2.getAccessibilityTextDuration() + positionResult2.getTimeStamp();
        return (4000 + accessibilityTextDuration >= positionResult.getTimeStamp() && !(!Intrinsics.f(positionResult.getDocumentPosition(), positionResult2.getDocumentPosition()) && (accessibilityTextDuration > positionResult.getTimeStamp() ? 1 : (accessibilityTextDuration == positionResult.getTimeStamp() ? 0 : -1)) < 0)) ? PositionResult.copy$default(positionResult2, 0L, null, false, 0L, 11, null) : PositionResult.copy$default(positionResult, 0L, null, true, 0L, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable vibrateWhenDocumentNormal(Observable observable) {
        Observable observableCast = observable.filter(new p() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase$vibrateWhenDocumentNormal$$inlined$filterIsInstance$1
            @Override // igm.p
            public final boolean test(@NotNull Object it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof DocumentPosition.DocumentNormal;
            }
        }).cast(DocumentPosition.DocumentNormal.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Observable observableK = observableCast.flatMapCompletable(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase.vibrateWhenDocumentNormal.1
            @Override // igm.o
            @NotNull
            public final CompletableSource apply(@NotNull DocumentPosition.DocumentNormal it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return AccessibleDocumentCaptureUseCase.this.vibratorService.vibrateForSuccess();
            }
        }).k();
        Intrinsics.checkNotNullExpressionValue(observableK, "toObservable(...)");
        return observableK;
    }

    @NotNull
    public Observable observeAccessibilityCapture$onfido_capture_sdk_core_release(@NotNull Observable rectDetectionObservable) {
        Intrinsics.checkNotNullParameter(rectDetectionObservable, "rectDetectionObservable");
        Observable observablePublish = rectDetectionObservable.map(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase$observeAccessibilityCapture$1
            @Override // igm.o
            @NotNull
            public final DocumentPosition apply(@NotNull RectDetectionResult it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.this$0.documentPositionUseCase.invoke$onfido_capture_sdk_core_release(it8);
            }
        }).publish(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase$observeAccessibilityCapture$2
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull Observable shared) {
                Intrinsics.checkNotNullParameter(shared, "shared");
                return Observable.merge(this.this$0.observePosition(shared), this.this$0.observeAutoCapture(shared));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observablePublish, "publish(...)");
        return observablePublish;
    }
}
