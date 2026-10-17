package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventType;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsFlowStep;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.CaptureFormat;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.Event;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.EventType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.PublicPropertyKey;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.UiAlerts;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.WarningOrigin;
import com.onfido.android.sdk.capture.internal.nfc.NfcNonCapabilityReason;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.mlmodel.OnfidoMlModels;
import com.onfido.api.client.data.DocSide;
import j6.a;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents;", "", "()V", "Companion", "DocumentCapture", "DocumentCaptureError", "DocumentCaptureFlowCompleted", "DocumentCaptureUploadCompleted", "DocumentCaptureUploadStarted", "DocumentConfirmation", "DocumentConfirmationError", "DocumentConfirmationWarning", "DocumentValidMRZExtracted", "OnfidoMlModelReady", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CaptureEvents {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$Companion;", "", "()V", "toUiAlertsOrNull", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/UiAlerts;", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final UiAlerts toUiAlertsOrNull(ErrorType errorType) {
            if (errorType instanceof ErrorType.Document) {
                return new UiAlerts(null, null, null, null, UiAlerts.UiAlertType.ERROR, null, null, null, null, 495, null);
            }
            if (errorType instanceof ErrorType.Glare) {
                return new UiAlerts(null, null, null, null, null, UiAlerts.UiAlertType.ERROR, null, null, null, 479, null);
            }
            if (errorType instanceof ErrorType.Cutoff) {
                return new UiAlerts(null, null, null, null, null, null, null, null, UiAlerts.UiAlertType.ERROR, 255, null);
            }
            if (errorType instanceof ErrorType.Blur) {
                return new UiAlerts(null, null, null, null, null, null, UiAlerts.UiAlertType.ERROR, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG, null);
            }
            if (!(errorType instanceof ErrorType.Barcode)) {
                return null;
            }
            return new UiAlerts(null, null, null, null, null, null, null, UiAlerts.UiAlertType.ERROR, null, 383, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$DocumentCapture;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "documentData", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "isPortrait", "", "isAutoCaptureEnabled", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;ZZ)V", "getDocumentData", "()Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentCapture extends AnalyticsEvent {

        @NotNull
        private final CaptureStepDataBundle documentData;
        private final boolean isAutoCaptureEnabled;
        private final boolean isPortrait;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentCapture(@NotNull CaptureStepDataBundle documentData, boolean z, boolean z3) {
            super(new Event("DOCUMENT_CAPTURE", EventType.SCREEN, null, OnfidoAnalyticsEventType.SCREEN, 4, null), r0.k(new Pair("step", AnalyticsFlowStep.DOCUMENT), new Pair("document_type", documentData.getDocumentType()), new Pair("document_side", documentData.getDocSide()), new Pair("country_code", documentData.getCountryCode()), new Pair("document_format", documentData.getDocumentFormat()), new Pair("is_auto_capture_enabled", Boolean.valueOf(z3)), new Pair("generic_document_title", documentData.getGenericDocTitle()), new Pair("generic_document_pages", documentData.getGenericDocPages())), q0.c(new Pair(PublicPropertyKey.IS_PORTRAIT, Boolean.valueOf(z))));
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            this.documentData = documentData;
            this.isPortrait = z;
            this.isAutoCaptureEnabled = z3;
        }

        public static /* synthetic */ DocumentCapture copy$default(DocumentCapture documentCapture, CaptureStepDataBundle captureStepDataBundle, boolean z, boolean z3, int i, Object obj2) {
            if ((i & 1) != 0) {
                captureStepDataBundle = documentCapture.documentData;
            }
            if ((i & 2) != 0) {
                z = documentCapture.isPortrait;
            }
            if ((i & 4) != 0) {
                z3 = documentCapture.isAutoCaptureEnabled;
            }
            return documentCapture.copy(captureStepDataBundle, z, z3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsPortrait() {
            return this.isPortrait;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsAutoCaptureEnabled() {
            return this.isAutoCaptureEnabled;
        }

        @NotNull
        public final DocumentCapture copy(@NotNull CaptureStepDataBundle documentData, boolean isPortrait, boolean isAutoCaptureEnabled) {
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            return new DocumentCapture(documentData, isPortrait, isAutoCaptureEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentCapture)) {
                return false;
            }
            DocumentCapture documentCapture = (DocumentCapture) other;
            return Intrinsics.f(this.documentData, documentCapture.documentData) && this.isPortrait == documentCapture.isPortrait && this.isAutoCaptureEnabled == documentCapture.isAutoCaptureEnabled;
        }

        @NotNull
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAutoCaptureEnabled) + a.c(this.documentData.hashCode() * 31, 31, this.isPortrait);
        }

        public final boolean isAutoCaptureEnabled() {
            return this.isAutoCaptureEnabled;
        }

        public final boolean isPortrait() {
            return this.isPortrait;
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("DocumentCapture(documentData=");
            sb6.append(this.documentData);
            sb6.append(", isPortrait=");
            sb6.append(this.isPortrait);
            sb6.append(", isAutoCaptureEnabled=");
            return a.x(sb6, this.isAutoCaptureEnabled, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$DocumentCaptureFlowCompleted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "documentData", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;)V", "getDocumentData", "()Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentCaptureFlowCompleted extends AnalyticsEvent {

        @NotNull
        private final CaptureStepDataBundle documentData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentCaptureFlowCompleted(@NotNull CaptureStepDataBundle documentData) {
            super(new Event("DOCUMENT_CAPTURE_FLOW_COMPLETED", EventType.ACTION, null, OnfidoAnalyticsEventType.ACTION, 4, null), r0.k(new Pair("step", AnalyticsFlowStep.DOCUMENT), new Pair("document_type", documentData.getDocumentType()), new Pair("document_side", documentData.getDocSide()), new Pair("country_code", documentData.getCountryCode()), new Pair("document_format", documentData.getDocumentFormat()), new Pair("generic_document_title", documentData.getGenericDocTitle()), new Pair("generic_document_pages", documentData.getGenericDocPages())), null, 4, null);
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            this.documentData = documentData;
        }

        public static /* synthetic */ DocumentCaptureFlowCompleted copy$default(DocumentCaptureFlowCompleted documentCaptureFlowCompleted, CaptureStepDataBundle captureStepDataBundle, int i, Object obj2) {
            if ((i & 1) != 0) {
                captureStepDataBundle = documentCaptureFlowCompleted.documentData;
            }
            return documentCaptureFlowCompleted.copy(captureStepDataBundle);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        @NotNull
        public final DocumentCaptureFlowCompleted copy(@NotNull CaptureStepDataBundle documentData) {
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            return new DocumentCaptureFlowCompleted(documentData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DocumentCaptureFlowCompleted) && Intrinsics.f(this.documentData, ((DocumentCaptureFlowCompleted) other).documentData);
        }

        @NotNull
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        public int hashCode() {
            return this.documentData.hashCode();
        }

        @NotNull
        public String toString() {
            return "DocumentCaptureFlowCompleted(documentData=" + this.documentData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$DocumentCaptureUploadCompleted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DocumentCaptureUploadCompleted extends AnalyticsEvent {
        public DocumentCaptureUploadCompleted() {
            super(new Event("DOCUMENT_UPLOAD_COMPLETED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.DOCUMENT), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$DocumentConfirmation;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "documentData", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "takenPhotoCount", "", "maxRetryCount", "warnings", "", "", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/UiAlerts$UiAlertType;", "isRemoteOrigin", "", "isAutoCaptured", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;IILjava/util/Map;ZZ)V", "getDocumentData", "()Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "()Z", "getMaxRetryCount", "()I", "getTakenPhotoCount", "getWarnings", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentConfirmation extends AnalyticsEvent {

        @NotNull
        private final CaptureStepDataBundle documentData;
        private final boolean isAutoCaptured;
        private final boolean isRemoteOrigin;
        private final int maxRetryCount;
        private final int takenPhotoCount;

        @NotNull
        private final Map<String, UiAlerts.UiAlertType> warnings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DocumentConfirmation(@NotNull CaptureStepDataBundle documentData, int i, int i2, @NotNull Map<String, ? extends UiAlerts.UiAlertType> warnings, boolean z, boolean z3) {
            super(new Event("DOCUMENT_CONFIRMATION", EventType.SCREEN, null, OnfidoAnalyticsEventType.SCREEN, 4, null), r0.k(new Pair("step", AnalyticsFlowStep.DOCUMENT), new Pair("document_type", documentData.getDocumentType()), new Pair("document_side", documentData.getDocSide()), new Pair("country_code", documentData.getCountryCode()), new Pair("document_format", documentData.getDocumentFormat()), new Pair("count_attempts", Integer.valueOf(i)), new Pair("max_retry_count", Integer.valueOf(i2)), new Pair("warnings", warnings), new Pair("warning_origin", z ? WarningOrigin.REMOTE : WarningOrigin.DEVICE), new Pair("is_auto_capture_used", Boolean.valueOf(z3)), new Pair("generic_document_title", documentData.getGenericDocTitle()), new Pair("generic_document_pages", documentData.getGenericDocPages())), null, 4, null);
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            this.documentData = documentData;
            this.takenPhotoCount = i;
            this.maxRetryCount = i2;
            this.warnings = warnings;
            this.isRemoteOrigin = z;
            this.isAutoCaptured = z3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DocumentConfirmation copy$default(DocumentConfirmation documentConfirmation, CaptureStepDataBundle captureStepDataBundle, int i, int i2, Map map, boolean z, boolean z3, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                captureStepDataBundle = documentConfirmation.documentData;
            }
            if ((i3 & 2) != 0) {
                i = documentConfirmation.takenPhotoCount;
            }
            if ((i3 & 4) != 0) {
                i2 = documentConfirmation.maxRetryCount;
            }
            if ((i3 & 8) != 0) {
                map = documentConfirmation.warnings;
            }
            if ((i3 & 16) != 0) {
                z = documentConfirmation.isRemoteOrigin;
            }
            if ((i3 & 32) != 0) {
                z3 = documentConfirmation.isAutoCaptured;
            }
            boolean z4 = z;
            boolean z6 = z3;
            return documentConfirmation.copy(captureStepDataBundle, i, i2, map, z4, z6);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTakenPhotoCount() {
            return this.takenPhotoCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMaxRetryCount() {
            return this.maxRetryCount;
        }

        @NotNull
        public final Map<String, UiAlerts.UiAlertType> component4() {
            return this.warnings;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsRemoteOrigin() {
            return this.isRemoteOrigin;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsAutoCaptured() {
            return this.isAutoCaptured;
        }

        @NotNull
        public final DocumentConfirmation copy(@NotNull CaptureStepDataBundle documentData, int takenPhotoCount, int maxRetryCount, @NotNull Map<String, ? extends UiAlerts.UiAlertType> warnings, boolean isRemoteOrigin, boolean isAutoCaptured) {
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            return new DocumentConfirmation(documentData, takenPhotoCount, maxRetryCount, warnings, isRemoteOrigin, isAutoCaptured);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentConfirmation)) {
                return false;
            }
            DocumentConfirmation documentConfirmation = (DocumentConfirmation) other;
            return Intrinsics.f(this.documentData, documentConfirmation.documentData) && this.takenPhotoCount == documentConfirmation.takenPhotoCount && this.maxRetryCount == documentConfirmation.maxRetryCount && Intrinsics.f(this.warnings, documentConfirmation.warnings) && this.isRemoteOrigin == documentConfirmation.isRemoteOrigin && this.isAutoCaptured == documentConfirmation.isAutoCaptured;
        }

        @NotNull
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        public final int getMaxRetryCount() {
            return this.maxRetryCount;
        }

        public final int getTakenPhotoCount() {
            return this.takenPhotoCount;
        }

        @NotNull
        public final Map<String, UiAlerts.UiAlertType> getWarnings() {
            return this.warnings;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAutoCaptured) + a.c(p.a.e(a.b(this.maxRetryCount, a.b(this.takenPhotoCount, this.documentData.hashCode() * 31, 31), 31), 31, this.warnings), 31, this.isRemoteOrigin);
        }

        public final boolean isAutoCaptured() {
            return this.isAutoCaptured;
        }

        public final boolean isRemoteOrigin() {
            return this.isRemoteOrigin;
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("DocumentConfirmation(documentData=");
            sb6.append(this.documentData);
            sb6.append(", takenPhotoCount=");
            sb6.append(this.takenPhotoCount);
            sb6.append(", maxRetryCount=");
            sb6.append(this.maxRetryCount);
            sb6.append(", warnings=");
            sb6.append(this.warnings);
            sb6.append(", isRemoteOrigin=");
            sb6.append(this.isRemoteOrigin);
            sb6.append(", isAutoCaptured=");
            return a.x(sb6, this.isAutoCaptured, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$DocumentConfirmationError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "documentSide", "Lcom/onfido/api/client/data/DocSide;", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;Lcom/onfido/api/client/data/DocSide;)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DocumentConfirmationError extends AnalyticsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentConfirmationError(@NotNull ErrorType errorType, DocSide docSide) {
            super(new Event("DOCUMENT_CONFIRMATION_ERROR", EventType.VIEW, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.DOCUMENT), new Pair("document_side", docSide), new Pair("ui_alerts", CaptureEvents.INSTANCE.toUiAlertsOrNull(errorType))), null, 4, null);
            Intrinsics.checkNotNullParameter(errorType, "errorType");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\rHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$DocumentConfirmationWarning;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "documentData", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "takenPhotoCount", "", "maxRetryCount", "warnings", "", "", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/UiAlerts$UiAlertType;", "warningShown", "isRemoteWarning", "", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;IILjava/util/Map;Ljava/lang/String;Z)V", "getDocumentData", "()Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "()Z", "getMaxRetryCount", "()I", "getTakenPhotoCount", "getWarningShown", "()Ljava/lang/String;", "getWarnings", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentConfirmationWarning extends AnalyticsEvent {

        @NotNull
        private final CaptureStepDataBundle documentData;
        private final boolean isRemoteWarning;
        private final int maxRetryCount;
        private final int takenPhotoCount;
        private final String warningShown;

        @NotNull
        private final Map<String, UiAlerts.UiAlertType> warnings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DocumentConfirmationWarning(@NotNull CaptureStepDataBundle documentData, int i, int i2, @NotNull Map<String, ? extends UiAlerts.UiAlertType> warnings, String str, boolean z) {
            super(new Event("DOCUMENT_CONFIRMATION_WARNING", EventType.VIEW, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.DOCUMENT), new Pair("document_type", documentData.getDocumentType()), new Pair("document_side", documentData.getDocSide()), new Pair("document_format", documentData.getDocumentFormat()), new Pair("country_code", documentData.getCountryCode()), new Pair("count_attempts", Integer.valueOf(i)), new Pair("max_retry_count", Integer.valueOf(i2)), new Pair("is_blocking", Boolean.valueOf(i > i2)), new Pair("warnings", warnings), new Pair("warning_shown", str), new Pair("warning_origin", z ? WarningOrigin.REMOTE : WarningOrigin.DEVICE)), null, 4, null);
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            this.documentData = documentData;
            this.takenPhotoCount = i;
            this.maxRetryCount = i2;
            this.warnings = warnings;
            this.warningShown = str;
            this.isRemoteWarning = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DocumentConfirmationWarning copy$default(DocumentConfirmationWarning documentConfirmationWarning, CaptureStepDataBundle captureStepDataBundle, int i, int i2, Map map, String str, boolean z, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                captureStepDataBundle = documentConfirmationWarning.documentData;
            }
            if ((i3 & 2) != 0) {
                i = documentConfirmationWarning.takenPhotoCount;
            }
            if ((i3 & 4) != 0) {
                i2 = documentConfirmationWarning.maxRetryCount;
            }
            if ((i3 & 8) != 0) {
                map = documentConfirmationWarning.warnings;
            }
            if ((i3 & 16) != 0) {
                str = documentConfirmationWarning.warningShown;
            }
            if ((i3 & 32) != 0) {
                z = documentConfirmationWarning.isRemoteWarning;
            }
            String str2 = str;
            boolean z3 = z;
            return documentConfirmationWarning.copy(captureStepDataBundle, i, i2, map, str2, z3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTakenPhotoCount() {
            return this.takenPhotoCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMaxRetryCount() {
            return this.maxRetryCount;
        }

        @NotNull
        public final Map<String, UiAlerts.UiAlertType> component4() {
            return this.warnings;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getWarningShown() {
            return this.warningShown;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsRemoteWarning() {
            return this.isRemoteWarning;
        }

        @NotNull
        public final DocumentConfirmationWarning copy(@NotNull CaptureStepDataBundle documentData, int takenPhotoCount, int maxRetryCount, @NotNull Map<String, ? extends UiAlerts.UiAlertType> warnings, String warningShown, boolean isRemoteWarning) {
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            return new DocumentConfirmationWarning(documentData, takenPhotoCount, maxRetryCount, warnings, warningShown, isRemoteWarning);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentConfirmationWarning)) {
                return false;
            }
            DocumentConfirmationWarning documentConfirmationWarning = (DocumentConfirmationWarning) other;
            return Intrinsics.f(this.documentData, documentConfirmationWarning.documentData) && this.takenPhotoCount == documentConfirmationWarning.takenPhotoCount && this.maxRetryCount == documentConfirmationWarning.maxRetryCount && Intrinsics.f(this.warnings, documentConfirmationWarning.warnings) && Intrinsics.f(this.warningShown, documentConfirmationWarning.warningShown) && this.isRemoteWarning == documentConfirmationWarning.isRemoteWarning;
        }

        @NotNull
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        public final int getMaxRetryCount() {
            return this.maxRetryCount;
        }

        public final int getTakenPhotoCount() {
            return this.takenPhotoCount;
        }

        public final String getWarningShown() {
            return this.warningShown;
        }

        @NotNull
        public final Map<String, UiAlerts.UiAlertType> getWarnings() {
            return this.warnings;
        }

        public int hashCode() {
            int iE = p.a.e(a.b(this.maxRetryCount, a.b(this.takenPhotoCount, this.documentData.hashCode() * 31, 31), 31), 31, this.warnings);
            String str = this.warningShown;
            return Boolean.hashCode(this.isRemoteWarning) + ((iE + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final boolean isRemoteWarning() {
            return this.isRemoteWarning;
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("DocumentConfirmationWarning(documentData=");
            sb6.append(this.documentData);
            sb6.append(", takenPhotoCount=");
            sb6.append(this.takenPhotoCount);
            sb6.append(", maxRetryCount=");
            sb6.append(this.maxRetryCount);
            sb6.append(", warnings=");
            sb6.append(this.warnings);
            sb6.append(", warningShown=");
            sb6.append(this.warningShown);
            sb6.append(", isRemoteWarning=");
            return a.x(sb6, this.isRemoteWarning, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$DocumentValidMRZExtracted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "extractionDuration", "", "frameProcessDuration", "emittedFramesCount", "", "processedFramesCount", "(JJII)V", "getEmittedFramesCount", "()I", "getExtractionDuration", "()J", "getFrameProcessDuration", "getProcessedFramesCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentValidMRZExtracted extends AnalyticsEvent {
        private final int emittedFramesCount;
        private final long extractionDuration;
        private final long frameProcessDuration;
        private final int processedFramesCount;

        public DocumentValidMRZExtracted(long j2, long j3, int i, int i2) {
            super(new Event("DOCUMENT_VALID_MRZ_EXTRACTED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("extraction_duration", Long.valueOf(j2)), new Pair("frame_process_duration", Long.valueOf(j3)), new Pair("emitted_frame_count", Integer.valueOf(i)), new Pair("processed_frame_count", Integer.valueOf(i2))), null, 4, null);
            this.extractionDuration = j2;
            this.frameProcessDuration = j3;
            this.emittedFramesCount = i;
            this.processedFramesCount = i2;
        }

        public static /* synthetic */ DocumentValidMRZExtracted copy$default(DocumentValidMRZExtracted documentValidMRZExtracted, long j2, long j3, int i, int i2, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                j2 = documentValidMRZExtracted.extractionDuration;
            }
            long j5 = j2;
            if ((i3 & 2) != 0) {
                j3 = documentValidMRZExtracted.frameProcessDuration;
            }
            long j16 = j3;
            if ((i3 & 4) != 0) {
                i = documentValidMRZExtracted.emittedFramesCount;
            }
            int i5 = i;
            if ((i3 & 8) != 0) {
                i2 = documentValidMRZExtracted.processedFramesCount;
            }
            return documentValidMRZExtracted.copy(j5, j16, i5, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getExtractionDuration() {
            return this.extractionDuration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getFrameProcessDuration() {
            return this.frameProcessDuration;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getEmittedFramesCount() {
            return this.emittedFramesCount;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getProcessedFramesCount() {
            return this.processedFramesCount;
        }

        @NotNull
        public final DocumentValidMRZExtracted copy(long extractionDuration, long frameProcessDuration, int emittedFramesCount, int processedFramesCount) {
            return new DocumentValidMRZExtracted(extractionDuration, frameProcessDuration, emittedFramesCount, processedFramesCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentValidMRZExtracted)) {
                return false;
            }
            DocumentValidMRZExtracted documentValidMRZExtracted = (DocumentValidMRZExtracted) other;
            return this.extractionDuration == documentValidMRZExtracted.extractionDuration && this.frameProcessDuration == documentValidMRZExtracted.frameProcessDuration && this.emittedFramesCount == documentValidMRZExtracted.emittedFramesCount && this.processedFramesCount == documentValidMRZExtracted.processedFramesCount;
        }

        public final int getEmittedFramesCount() {
            return this.emittedFramesCount;
        }

        public final long getExtractionDuration() {
            return this.extractionDuration;
        }

        public final long getFrameProcessDuration() {
            return this.frameProcessDuration;
        }

        public final int getProcessedFramesCount() {
            return this.processedFramesCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.processedFramesCount) + a.b(this.emittedFramesCount, d.c(Long.hashCode(this.extractionDuration) * 31, 31, this.frameProcessDuration), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("DocumentValidMRZExtracted(extractionDuration=");
            sb6.append(this.extractionDuration);
            sb6.append(", frameProcessDuration=");
            sb6.append(this.frameProcessDuration);
            sb6.append(", emittedFramesCount=");
            sb6.append(this.emittedFramesCount);
            sb6.append(", processedFramesCount=");
            return a.t(sb6, this.processedFramesCount, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$OnfidoMlModelReady;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "model", "Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlModels;", "preparationDuration", "", "(Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlModels;J)V", "getModel", "()Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlModels;", "getPreparationDuration", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnfidoMlModelReady extends AnalyticsEvent {

        @NotNull
        private final OnfidoMlModels model;
        private final long preparationDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnfidoMlModelReady(@NotNull OnfidoMlModels model, long j2) {
            super(new Event("ONFIDO_ML_MODEL_READY", EventType.ACTION, null, null, 12, null), r0.k(new Pair("preparation_duration", Long.valueOf(j2)), new Pair("onfido_ml_model_name", model.name())), null, 4, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
            this.preparationDuration = j2;
        }

        public static /* synthetic */ OnfidoMlModelReady copy$default(OnfidoMlModelReady onfidoMlModelReady, OnfidoMlModels onfidoMlModels, long j2, int i, Object obj2) {
            if ((i & 1) != 0) {
                onfidoMlModels = onfidoMlModelReady.model;
            }
            if ((i & 2) != 0) {
                j2 = onfidoMlModelReady.preparationDuration;
            }
            return onfidoMlModelReady.copy(onfidoMlModels, j2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OnfidoMlModels getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getPreparationDuration() {
            return this.preparationDuration;
        }

        @NotNull
        public final OnfidoMlModelReady copy(@NotNull OnfidoMlModels model, long preparationDuration) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new OnfidoMlModelReady(model, preparationDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnfidoMlModelReady)) {
                return false;
            }
            OnfidoMlModelReady onfidoMlModelReady = (OnfidoMlModelReady) other;
            return this.model == onfidoMlModelReady.model && this.preparationDuration == onfidoMlModelReady.preparationDuration;
        }

        @NotNull
        public final OnfidoMlModels getModel() {
            return this.model;
        }

        public final long getPreparationDuration() {
            return this.preparationDuration;
        }

        public int hashCode() {
            return Long.hashCode(this.preparationDuration) + (this.model.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("OnfidoMlModelReady(model=");
            sb6.append(this.model);
            sb6.append(", preparationDuration=");
            return d.t(sb6, this.preparationDuration, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$DocumentCaptureError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "documentSide", "Lcom/onfido/api/client/data/DocSide;", "errorMessage", "", "(Lcom/onfido/api/client/data/DocSide;Ljava/lang/String;)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DocumentCaptureError extends AnalyticsEvent {
        public DocumentCaptureError(DocSide docSide, String str) {
            UiAlerts uiAlerts;
            Event event = new Event("DOCUMENT_CAPTURE_ERROR", EventType.VIEW, null, null, 12, null);
            Pair pair = new Pair("step", AnalyticsFlowStep.DOCUMENT);
            Pair pair2 = new Pair("document_side", docSide);
            Pair pair3 = new Pair("error_message", str);
            if (str != null) {
                uiAlerts = new UiAlerts(null, null, null, UiAlerts.UiAlertType.ERROR, null, null, null, null, null, 503, null);
            } else {
                uiAlerts = null;
            }
            super(event, r0.k(pair, pair2, pair3, new Pair("ui_alerts", uiAlerts)), null, 4, null);
        }

        public /* synthetic */ DocumentCaptureError(DocSide docSide, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(docSide, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003Je\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006)"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureEvents$DocumentCaptureUploadStarted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "documentData", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "takenPhotoCount", "", "maxRetryCount", "isAutoCaptureEnabled", "", "isAutoCaptureUsed", "hasMrzLines", "isDeviceNfcCapable", "isNfcFeatureEnabled", "nfcNonCapabilityReason", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcNonCapabilityReason;", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;IIZZZZZLcom/onfido/android/sdk/capture/internal/nfc/NfcNonCapabilityReason;)V", "getDocumentData", "()Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "getHasMrzLines", "()Z", "getMaxRetryCount", "()I", "getNfcNonCapabilityReason", "()Lcom/onfido/android/sdk/capture/internal/nfc/NfcNonCapabilityReason;", "getTakenPhotoCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentCaptureUploadStarted extends AnalyticsEvent {

        @NotNull
        private final CaptureStepDataBundle documentData;
        private final boolean hasMrzLines;
        private final boolean isAutoCaptureEnabled;
        private final boolean isAutoCaptureUsed;
        private final boolean isDeviceNfcCapable;
        private final boolean isNfcFeatureEnabled;
        private final int maxRetryCount;
        private final NfcNonCapabilityReason nfcNonCapabilityReason;
        private final int takenPhotoCount;

        public DocumentCaptureUploadStarted(@NotNull CaptureStepDataBundle documentData, int i, int i2, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, NfcNonCapabilityReason nfcNonCapabilityReason) {
            String lowerCase;
            String strName;
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            Event event = new Event("DOCUMENT_UPLOAD_STARTED", EventType.ACTION, "DOCUMENT_UPLOAD", OnfidoAnalyticsEventType.SCREEN);
            Pair pair = new Pair("step", AnalyticsFlowStep.DOCUMENT);
            Pair pair2 = new Pair("document_type", documentData.getDocumentType());
            Pair pair3 = new Pair("document_side", documentData.getDocSide());
            Pair pair4 = new Pair("document_format", documentData.getDocumentFormat());
            Pair pair5 = new Pair("country_code", documentData.getCountryCode());
            Pair pair6 = new Pair("count_attempts", Integer.valueOf(i));
            Pair pair7 = new Pair("max_retry_count", Integer.valueOf(i2));
            Pair pair8 = new Pair("capture_format", documentData.getCaptureType().isVideo() ? CaptureFormat.VIDEO : CaptureFormat.IMAGE);
            Pair pair9 = new Pair("did_extract_mrz", Boolean.valueOf(z4));
            Pair pair10 = new Pair("is_auto_capture_enabled", Boolean.valueOf(z));
            Pair pair11 = new Pair("is_auto_capture_used", Boolean.valueOf(z3));
            Pair pair12 = new Pair("is_device_nfc_capable", Boolean.valueOf(z6));
            Pair pair13 = new Pair("is_nfc_feature_enabled", Boolean.valueOf(z11));
            if (nfcNonCapabilityReason == null || (strName = nfcNonCapabilityReason.name()) == null) {
                lowerCase = null;
            } else {
                lowerCase = strName.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            super(event, r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, new Pair("nfc_non_capability_reason", lowerCase), new Pair("generic_document_title", documentData.getGenericDocTitle()), new Pair("generic_document_pages", documentData.getGenericDocPages())), null, 4, null);
            this.documentData = documentData;
            this.takenPhotoCount = i;
            this.maxRetryCount = i2;
            this.isAutoCaptureEnabled = z;
            this.isAutoCaptureUsed = z3;
            this.hasMrzLines = z4;
            this.isDeviceNfcCapable = z6;
            this.isNfcFeatureEnabled = z11;
            this.nfcNonCapabilityReason = nfcNonCapabilityReason;
        }

        public static /* synthetic */ DocumentCaptureUploadStarted copy$default(DocumentCaptureUploadStarted documentCaptureUploadStarted, CaptureStepDataBundle captureStepDataBundle, int i, int i2, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, NfcNonCapabilityReason nfcNonCapabilityReason, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                captureStepDataBundle = documentCaptureUploadStarted.documentData;
            }
            if ((i3 & 2) != 0) {
                i = documentCaptureUploadStarted.takenPhotoCount;
            }
            if ((i3 & 4) != 0) {
                i2 = documentCaptureUploadStarted.maxRetryCount;
            }
            if ((i3 & 8) != 0) {
                z = documentCaptureUploadStarted.isAutoCaptureEnabled;
            }
            if ((i3 & 16) != 0) {
                z3 = documentCaptureUploadStarted.isAutoCaptureUsed;
            }
            if ((i3 & 32) != 0) {
                z4 = documentCaptureUploadStarted.hasMrzLines;
            }
            if ((i3 & 64) != 0) {
                z6 = documentCaptureUploadStarted.isDeviceNfcCapable;
            }
            if ((i3 & 128) != 0) {
                z11 = documentCaptureUploadStarted.isNfcFeatureEnabled;
            }
            if ((i3 & 256) != 0) {
                nfcNonCapabilityReason = documentCaptureUploadStarted.nfcNonCapabilityReason;
            }
            boolean z12 = z11;
            NfcNonCapabilityReason nfcNonCapabilityReason2 = nfcNonCapabilityReason;
            boolean z29 = z4;
            boolean z31 = z6;
            boolean z41 = z3;
            int i5 = i2;
            return documentCaptureUploadStarted.copy(captureStepDataBundle, i, i5, z, z41, z29, z31, z12, nfcNonCapabilityReason2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTakenPhotoCount() {
            return this.takenPhotoCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMaxRetryCount() {
            return this.maxRetryCount;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsAutoCaptureEnabled() {
            return this.isAutoCaptureEnabled;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsAutoCaptureUsed() {
            return this.isAutoCaptureUsed;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getHasMrzLines() {
            return this.hasMrzLines;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsDeviceNfcCapable() {
            return this.isDeviceNfcCapable;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsNfcFeatureEnabled() {
            return this.isNfcFeatureEnabled;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final NfcNonCapabilityReason getNfcNonCapabilityReason() {
            return this.nfcNonCapabilityReason;
        }

        @NotNull
        public final DocumentCaptureUploadStarted copy(@NotNull CaptureStepDataBundle documentData, int takenPhotoCount, int maxRetryCount, boolean isAutoCaptureEnabled, boolean isAutoCaptureUsed, boolean hasMrzLines, boolean isDeviceNfcCapable, boolean isNfcFeatureEnabled, NfcNonCapabilityReason nfcNonCapabilityReason) {
            Intrinsics.checkNotNullParameter(documentData, "documentData");
            return new DocumentCaptureUploadStarted(documentData, takenPhotoCount, maxRetryCount, isAutoCaptureEnabled, isAutoCaptureUsed, hasMrzLines, isDeviceNfcCapable, isNfcFeatureEnabled, nfcNonCapabilityReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentCaptureUploadStarted)) {
                return false;
            }
            DocumentCaptureUploadStarted documentCaptureUploadStarted = (DocumentCaptureUploadStarted) other;
            return Intrinsics.f(this.documentData, documentCaptureUploadStarted.documentData) && this.takenPhotoCount == documentCaptureUploadStarted.takenPhotoCount && this.maxRetryCount == documentCaptureUploadStarted.maxRetryCount && this.isAutoCaptureEnabled == documentCaptureUploadStarted.isAutoCaptureEnabled && this.isAutoCaptureUsed == documentCaptureUploadStarted.isAutoCaptureUsed && this.hasMrzLines == documentCaptureUploadStarted.hasMrzLines && this.isDeviceNfcCapable == documentCaptureUploadStarted.isDeviceNfcCapable && this.isNfcFeatureEnabled == documentCaptureUploadStarted.isNfcFeatureEnabled && this.nfcNonCapabilityReason == documentCaptureUploadStarted.nfcNonCapabilityReason;
        }

        @NotNull
        public final CaptureStepDataBundle getDocumentData() {
            return this.documentData;
        }

        public final boolean getHasMrzLines() {
            return this.hasMrzLines;
        }

        public final int getMaxRetryCount() {
            return this.maxRetryCount;
        }

        public final NfcNonCapabilityReason getNfcNonCapabilityReason() {
            return this.nfcNonCapabilityReason;
        }

        public final int getTakenPhotoCount() {
            return this.takenPhotoCount;
        }

        public int hashCode() {
            int iC = a.c(a.c(a.c(a.c(a.c(a.b(this.maxRetryCount, a.b(this.takenPhotoCount, this.documentData.hashCode() * 31, 31), 31), 31, this.isAutoCaptureEnabled), 31, this.isAutoCaptureUsed), 31, this.hasMrzLines), 31, this.isDeviceNfcCapable), 31, this.isNfcFeatureEnabled);
            NfcNonCapabilityReason nfcNonCapabilityReason = this.nfcNonCapabilityReason;
            return iC + (nfcNonCapabilityReason == null ? 0 : nfcNonCapabilityReason.hashCode());
        }

        public final boolean isAutoCaptureEnabled() {
            return this.isAutoCaptureEnabled;
        }

        public final boolean isAutoCaptureUsed() {
            return this.isAutoCaptureUsed;
        }

        public final boolean isDeviceNfcCapable() {
            return this.isDeviceNfcCapable;
        }

        public final boolean isNfcFeatureEnabled() {
            return this.isNfcFeatureEnabled;
        }

        @NotNull
        public String toString() {
            return "DocumentCaptureUploadStarted(documentData=" + this.documentData + ", takenPhotoCount=" + this.takenPhotoCount + ", maxRetryCount=" + this.maxRetryCount + ", isAutoCaptureEnabled=" + this.isAutoCaptureEnabled + ", isAutoCaptureUsed=" + this.isAutoCaptureUsed + ", hasMrzLines=" + this.hasMrzLines + ", isDeviceNfcCapable=" + this.isDeviceNfcCapable + ", isNfcFeatureEnabled=" + this.isNfcFeatureEnabled + ", nfcNonCapabilityReason=" + this.nfcNonCapabilityReason + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ DocumentCaptureUploadStarted(CaptureStepDataBundle captureStepDataBundle, int i, int i2, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, NfcNonCapabilityReason nfcNonCapabilityReason, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(captureStepDataBundle, i, i2, z, (i3 & 16) != 0 ? false : z3, z4, z6, z11, nfcNonCapabilityReason);
        }
    }
}
