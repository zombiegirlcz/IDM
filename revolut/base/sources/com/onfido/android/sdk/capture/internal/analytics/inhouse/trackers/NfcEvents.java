package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsFlowStep;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.Event;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.EventType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.nfc.PassportAuthAccess;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocumentFeatures;
import j6.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001:\u0018\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents;", "", "()V", "DocumentNfcSupported", "NfcBACError", "NfcCanEntryCompleted", "NfcChipAuthenticated", "NfcChipConnectionLost", "NfcChipDiscovered", "NfcChooseAnotherDocumentClicked", "NfcContinueAtChipBlockedClicked", "NfcContinueAtPinEntryClicked", "NfcContinueToScanSelected", "NfcDataUploadCompleted", "NfcDataUploadStarted", "NfcExitAtChipBlockedClicked", "NfcExitVerificationClicked", "NfcOpenSettingsClicked", "NfcPaceError", "NfcPropertiesError", "NfcRetryScanSelected", "NfcSkipAtInitialPrompt", "NfcSkipAtManualCanEntry", "NfcSkipAtPinEntryClicked", "NfcSkipAtRetry", "NfcStartScanSelected", "NfcUnlockAtPinBlockedClicked", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcEvents {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013¨\u0006!"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$DocumentNfcSupported;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "isNfcSupported", "", "hasNfcKey", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentFeatures", "Lcom/onfido/api/client/data/DocumentFeatures;", "(ZZLcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/api/client/data/DocumentFeatures;)V", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentFeatures", "()Lcom/onfido/api/client/data/DocumentFeatures;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "getHasNfcKey", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentNfcSupported extends AnalyticsEvent {
        private final CountryCode countryCode;

        @NotNull
        private final DocumentFeatures documentFeatures;
        private final DocumentType documentType;
        private final boolean hasNfcKey;
        private final boolean isNfcSupported;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentNfcSupported(boolean z, boolean z3, DocumentType documentType, CountryCode countryCode, @NotNull DocumentFeatures documentFeatures) {
            super(new Event("DOCUMENT_NFC_SUPPORTED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("has_nfc_key", Boolean.valueOf(z3)), new Pair("is_nfc_supported", Boolean.valueOf(z)), new Pair("document_type", documentType), new Pair("country_code", countryCode), new Pair("has_can", Boolean.valueOf(documentFeatures.getHasCan())), new Pair("has_pin", Boolean.valueOf(documentFeatures.getHasPin())), new Pair("can_length", Integer.valueOf(documentFeatures.getCanLength())), new Pair("pin_length", Integer.valueOf(documentFeatures.getPinLength()))), null, 4, null);
            Intrinsics.checkNotNullParameter(documentFeatures, "documentFeatures");
            this.isNfcSupported = z;
            this.hasNfcKey = z3;
            this.documentType = documentType;
            this.countryCode = countryCode;
            this.documentFeatures = documentFeatures;
        }

        public static /* synthetic */ DocumentNfcSupported copy$default(DocumentNfcSupported documentNfcSupported, boolean z, boolean z3, DocumentType documentType, CountryCode countryCode, DocumentFeatures documentFeatures, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = documentNfcSupported.isNfcSupported;
            }
            if ((i & 2) != 0) {
                z3 = documentNfcSupported.hasNfcKey;
            }
            if ((i & 4) != 0) {
                documentType = documentNfcSupported.documentType;
            }
            if ((i & 8) != 0) {
                countryCode = documentNfcSupported.countryCode;
            }
            if ((i & 16) != 0) {
                documentFeatures = documentNfcSupported.documentFeatures;
            }
            DocumentFeatures documentFeatures2 = documentFeatures;
            DocumentType documentType2 = documentType;
            return documentNfcSupported.copy(z, z3, documentType2, countryCode, documentFeatures2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsNfcSupported() {
            return this.isNfcSupported;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasNfcKey() {
            return this.hasNfcKey;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DocumentType getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final DocumentFeatures getDocumentFeatures() {
            return this.documentFeatures;
        }

        @NotNull
        public final DocumentNfcSupported copy(boolean isNfcSupported, boolean hasNfcKey, DocumentType documentType, CountryCode countryCode, @NotNull DocumentFeatures documentFeatures) {
            Intrinsics.checkNotNullParameter(documentFeatures, "documentFeatures");
            return new DocumentNfcSupported(isNfcSupported, hasNfcKey, documentType, countryCode, documentFeatures);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentNfcSupported)) {
                return false;
            }
            DocumentNfcSupported documentNfcSupported = (DocumentNfcSupported) other;
            return this.isNfcSupported == documentNfcSupported.isNfcSupported && this.hasNfcKey == documentNfcSupported.hasNfcKey && this.documentType == documentNfcSupported.documentType && this.countryCode == documentNfcSupported.countryCode && Intrinsics.f(this.documentFeatures, documentNfcSupported.documentFeatures);
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final DocumentFeatures getDocumentFeatures() {
            return this.documentFeatures;
        }

        public final DocumentType getDocumentType() {
            return this.documentType;
        }

        public final boolean getHasNfcKey() {
            return this.hasNfcKey;
        }

        public int hashCode() {
            int iC = a.c(Boolean.hashCode(this.isNfcSupported) * 31, 31, this.hasNfcKey);
            DocumentType documentType = this.documentType;
            int iHashCode = (iC + (documentType == null ? 0 : documentType.hashCode())) * 31;
            CountryCode countryCode = this.countryCode;
            return this.documentFeatures.hashCode() + ((iHashCode + (countryCode != null ? countryCode.hashCode() : 0)) * 31);
        }

        public final boolean isNfcSupported() {
            return this.isNfcSupported;
        }

        @NotNull
        public String toString() {
            return "DocumentNfcSupported(isNfcSupported=" + this.isNfcSupported + ", hasNfcKey=" + this.hasNfcKey + ", documentType=" + this.documentType + ", countryCode=" + this.countryCode + ", documentFeatures=" + this.documentFeatures + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcBACError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcBACError extends AnalyticsEvent {

        @NotNull
        private final String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcBACError(@NotNull String error) {
            super(new Event("NFC_BAC_ERROR", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("error", error)), null, 4, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ NfcBACError copy$default(NfcBACError nfcBACError, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = nfcBACError.error;
            }
            return nfcBACError.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        public final NfcBACError copy(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new NfcBACError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcBACError) && Intrinsics.f(this.error, ((NfcBACError) other).error);
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("NfcBACError(error="), this.error, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcCanEntryCompleted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "attempts", "", "durationInMs", "", "(IJ)V", "getAttempts", "()I", "getDurationInMs", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcCanEntryCompleted extends AnalyticsEvent {
        private final int attempts;
        private final long durationInMs;

        public NfcCanEntryCompleted(int i, long j2) {
            super(new Event("NFC_CAN_ENTRY_COMPLETED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("entry_attempts", Integer.valueOf(i)), new Pair("duration", Long.valueOf(j2))), null, 4, null);
            this.attempts = i;
            this.durationInMs = j2;
        }

        public static /* synthetic */ NfcCanEntryCompleted copy$default(NfcCanEntryCompleted nfcCanEntryCompleted, int i, long j2, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = nfcCanEntryCompleted.attempts;
            }
            if ((i2 & 2) != 0) {
                j2 = nfcCanEntryCompleted.durationInMs;
            }
            return nfcCanEntryCompleted.copy(i, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAttempts() {
            return this.attempts;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getDurationInMs() {
            return this.durationInMs;
        }

        @NotNull
        public final NfcCanEntryCompleted copy(int attempts, long durationInMs) {
            return new NfcCanEntryCompleted(attempts, durationInMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcCanEntryCompleted)) {
                return false;
            }
            NfcCanEntryCompleted nfcCanEntryCompleted = (NfcCanEntryCompleted) other;
            return this.attempts == nfcCanEntryCompleted.attempts && this.durationInMs == nfcCanEntryCompleted.durationInMs;
        }

        public final int getAttempts() {
            return this.attempts;
        }

        public final long getDurationInMs() {
            return this.durationInMs;
        }

        public int hashCode() {
            return Long.hashCode(this.durationInMs) + (Integer.hashCode(this.attempts) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("NfcCanEntryCompleted(attempts=");
            sb6.append(this.attempts);
            sb6.append(", durationInMs=");
            return d.t(sb6, this.durationInMs, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcChipAuthenticated;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "authAccess", "Lcom/onfido/android/sdk/capture/internal/nfc/PassportAuthAccess;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;Lcom/onfido/android/sdk/capture/internal/nfc/PassportAuthAccess;)V", "getAuthAccess", "()Lcom/onfido/android/sdk/capture/internal/nfc/PassportAuthAccess;", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcChipAuthenticated extends AnalyticsEvent {

        @NotNull
        private final PassportAuthAccess authAccess;

        @NotNull
        private final NfcFlowType nfcFlowType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcChipAuthenticated(@NotNull NfcFlowType nfcFlowType, @NotNull PassportAuthAccess authAccess) {
            super(new Event("NFC_CHIP_AUTHENTICATED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("nfc_flow", nfcFlowType), new Pair("card_access_file", authAccess.getCardAccessFileString()), new Pair("security_info_used", authAccess.getUsedSecurityInfoString())), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(authAccess, "authAccess");
            this.nfcFlowType = nfcFlowType;
            this.authAccess = authAccess;
        }

        public static /* synthetic */ NfcChipAuthenticated copy$default(NfcChipAuthenticated nfcChipAuthenticated, NfcFlowType nfcFlowType, PassportAuthAccess passportAuthAccess, int i, Object obj2) {
            if ((i & 1) != 0) {
                nfcFlowType = nfcChipAuthenticated.nfcFlowType;
            }
            if ((i & 2) != 0) {
                passportAuthAccess = nfcChipAuthenticated.authAccess;
            }
            return nfcChipAuthenticated.copy(nfcFlowType, passportAuthAccess);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PassportAuthAccess getAuthAccess() {
            return this.authAccess;
        }

        @NotNull
        public final NfcChipAuthenticated copy(@NotNull NfcFlowType nfcFlowType, @NotNull PassportAuthAccess authAccess) {
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(authAccess, "authAccess");
            return new NfcChipAuthenticated(nfcFlowType, authAccess);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcChipAuthenticated)) {
                return false;
            }
            NfcChipAuthenticated nfcChipAuthenticated = (NfcChipAuthenticated) other;
            return this.nfcFlowType == nfcChipAuthenticated.nfcFlowType && Intrinsics.f(this.authAccess, nfcChipAuthenticated.authAccess);
        }

        @NotNull
        public final PassportAuthAccess getAuthAccess() {
            return this.authAccess;
        }

        @NotNull
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        public int hashCode() {
            return this.authAccess.hashCode() + (this.nfcFlowType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "NfcChipAuthenticated(nfcFlowType=" + this.nfcFlowType + ", authAccess=" + this.authAccess + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcChipConnectionLost;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcChipConnectionLost extends AnalyticsEvent {

        @NotNull
        public static final NfcChipConnectionLost INSTANCE = new NfcChipConnectionLost();

        private NfcChipConnectionLost() {
            super(new Event("NFC_CHIP_CONNECTION_LOST", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcChipDiscovered;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcChipDiscovered extends AnalyticsEvent {

        @NotNull
        public static final NfcChipDiscovered INSTANCE = new NfcChipDiscovered();

        private NfcChipDiscovered() {
            super(new Event("NFC_CHIP_DISCOVERED", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcChooseAnotherDocumentClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcChooseAnotherDocumentClicked extends AnalyticsEvent {

        @NotNull
        public static final NfcChooseAnotherDocumentClicked INSTANCE = new NfcChooseAnotherDocumentClicked();

        private NfcChooseAnotherDocumentClicked() {
            super(new Event("NFC_CHOOSE_ANOTHER_DOCUMENT_CLICKED", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcContinueAtChipBlockedClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcContinueAtChipBlockedClicked extends AnalyticsEvent {

        @NotNull
        public static final NfcContinueAtChipBlockedClicked INSTANCE = new NfcContinueAtChipBlockedClicked();

        private NfcContinueAtChipBlockedClicked() {
            super(new Event("NFC_CHIP_BLOCKED_EXIT_CLICKED", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcContinueAtPinEntryClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcContinueAtPinEntryClicked extends AnalyticsEvent {

        @NotNull
        public static final NfcContinueAtPinEntryClicked INSTANCE = new NfcContinueAtPinEntryClicked();

        private NfcContinueAtPinEntryClicked() {
            super(new Event("NFC_PIN_ENTRY_CONTINUE_CLICKED", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcContinueToScanSelected;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;)V", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcContinueToScanSelected extends AnalyticsEvent {

        @NotNull
        private final NfcFlowType nfcFlowType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcContinueToScanSelected(@NotNull NfcFlowType nfcFlowType) {
            super(new Event("NFC_CONTINUE_AT_INITIAL_PROMPT", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("nfc_flow", nfcFlowType)), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            this.nfcFlowType = nfcFlowType;
        }

        public static /* synthetic */ NfcContinueToScanSelected copy$default(NfcContinueToScanSelected nfcContinueToScanSelected, NfcFlowType nfcFlowType, int i, Object obj2) {
            if ((i & 1) != 0) {
                nfcFlowType = nfcContinueToScanSelected.nfcFlowType;
            }
            return nfcContinueToScanSelected.copy(nfcFlowType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        public final NfcContinueToScanSelected copy(@NotNull NfcFlowType nfcFlowType) {
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            return new NfcContinueToScanSelected(nfcFlowType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcContinueToScanSelected) && this.nfcFlowType == ((NfcContinueToScanSelected) other).nfcFlowType;
        }

        @NotNull
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        public int hashCode() {
            return this.nfcFlowType.hashCode();
        }

        @NotNull
        public String toString() {
            return "NfcContinueToScanSelected(nfcFlowType=" + this.nfcFlowType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcDataUploadCompleted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;)V", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcDataUploadCompleted extends AnalyticsEvent {

        @NotNull
        private final NfcFlowType nfcFlowType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcDataUploadCompleted(@NotNull NfcFlowType nfcFlowType) {
            super(new Event("NFC_DATA_UPLOAD_COMPLETED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("nfc_flow", nfcFlowType)), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            this.nfcFlowType = nfcFlowType;
        }

        public static /* synthetic */ NfcDataUploadCompleted copy$default(NfcDataUploadCompleted nfcDataUploadCompleted, NfcFlowType nfcFlowType, int i, Object obj2) {
            if ((i & 1) != 0) {
                nfcFlowType = nfcDataUploadCompleted.nfcFlowType;
            }
            return nfcDataUploadCompleted.copy(nfcFlowType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        public final NfcDataUploadCompleted copy(@NotNull NfcFlowType nfcFlowType) {
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            return new NfcDataUploadCompleted(nfcFlowType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcDataUploadCompleted) && this.nfcFlowType == ((NfcDataUploadCompleted) other).nfcFlowType;
        }

        @NotNull
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        public int hashCode() {
            return this.nfcFlowType.hashCode();
        }

        @NotNull
        public String toString() {
            return "NfcDataUploadCompleted(nfcFlowType=" + this.nfcFlowType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcDataUploadStarted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;)V", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcDataUploadStarted extends AnalyticsEvent {

        @NotNull
        private final NfcFlowType nfcFlowType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcDataUploadStarted(@NotNull NfcFlowType nfcFlowType) {
            super(new Event("NFC_DATA_UPLOAD_STARTED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("nfc_flow", nfcFlowType)), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            this.nfcFlowType = nfcFlowType;
        }

        public static /* synthetic */ NfcDataUploadStarted copy$default(NfcDataUploadStarted nfcDataUploadStarted, NfcFlowType nfcFlowType, int i, Object obj2) {
            if ((i & 1) != 0) {
                nfcFlowType = nfcDataUploadStarted.nfcFlowType;
            }
            return nfcDataUploadStarted.copy(nfcFlowType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        public final NfcDataUploadStarted copy(@NotNull NfcFlowType nfcFlowType) {
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            return new NfcDataUploadStarted(nfcFlowType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcDataUploadStarted) && this.nfcFlowType == ((NfcDataUploadStarted) other).nfcFlowType;
        }

        @NotNull
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        public int hashCode() {
            return this.nfcFlowType.hashCode();
        }

        @NotNull
        public String toString() {
            return "NfcDataUploadStarted(nfcFlowType=" + this.nfcFlowType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcExitAtChipBlockedClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcExitAtChipBlockedClicked extends AnalyticsEvent {

        @NotNull
        public static final NfcExitAtChipBlockedClicked INSTANCE = new NfcExitAtChipBlockedClicked();

        private NfcExitAtChipBlockedClicked() {
            super(new Event("NFC_CHIP_BLOCKED_EXIT_CLICKED", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcExitVerificationClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcExitVerificationClicked extends AnalyticsEvent {

        @NotNull
        public static final NfcExitVerificationClicked INSTANCE = new NfcExitVerificationClicked();

        private NfcExitVerificationClicked() {
            super(new Event("NFC_EXIT_VERIFICATION_CLICKED", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcOpenSettingsClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcOpenSettingsClicked extends AnalyticsEvent {

        @NotNull
        public static final NfcOpenSettingsClicked INSTANCE = new NfcOpenSettingsClicked();

        private NfcOpenSettingsClicked() {
            super(new Event("NFC_OPEN_SETTINGS_CLICKED", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcPaceError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "error", "", "cardAccessFileString", "usedSecurityInfoString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardAccessFileString", "()Ljava/lang/String;", "getError", "getUsedSecurityInfoString", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcPaceError extends AnalyticsEvent {
        private final String cardAccessFileString;

        @NotNull
        private final String error;
        private final String usedSecurityInfoString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcPaceError(@NotNull String error, String str, String str2) {
            super(new Event("NFC_PACE_ERROR", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("error", error), new Pair("card_access_file", str), new Pair("security_info_used", str2)), null, 4, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
            this.cardAccessFileString = str;
            this.usedSecurityInfoString = str2;
        }

        public static /* synthetic */ NfcPaceError copy$default(NfcPaceError nfcPaceError, String str, String str2, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = nfcPaceError.error;
            }
            if ((i & 2) != 0) {
                str2 = nfcPaceError.cardAccessFileString;
            }
            if ((i & 4) != 0) {
                str3 = nfcPaceError.usedSecurityInfoString;
            }
            return nfcPaceError.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardAccessFileString() {
            return this.cardAccessFileString;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUsedSecurityInfoString() {
            return this.usedSecurityInfoString;
        }

        @NotNull
        public final NfcPaceError copy(@NotNull String error, String cardAccessFileString, String usedSecurityInfoString) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new NfcPaceError(error, cardAccessFileString, usedSecurityInfoString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcPaceError)) {
                return false;
            }
            NfcPaceError nfcPaceError = (NfcPaceError) other;
            return Intrinsics.f(this.error, nfcPaceError.error) && Intrinsics.f(this.cardAccessFileString, nfcPaceError.cardAccessFileString) && Intrinsics.f(this.usedSecurityInfoString, nfcPaceError.usedSecurityInfoString);
        }

        public final String getCardAccessFileString() {
            return this.cardAccessFileString;
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        public final String getUsedSecurityInfoString() {
            return this.usedSecurityInfoString;
        }

        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            String str = this.cardAccessFileString;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.usedSecurityInfoString;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("NfcPaceError(error=");
            sb6.append(this.error);
            sb6.append(", cardAccessFileString=");
            sb6.append(this.cardAccessFileString);
            sb6.append(", usedSecurityInfoString=");
            return a.u(sb6, this.usedSecurityInfoString, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcPropertiesError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcPropertiesError extends AnalyticsEvent {
        private final String error;

        public NfcPropertiesError(String str) {
            super(new Event("NFC_PROPERTIES_ERROR", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("error", str)), null, 4, null);
            this.error = str;
        }

        public static /* synthetic */ NfcPropertiesError copy$default(NfcPropertiesError nfcPropertiesError, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = nfcPropertiesError.error;
            }
            return nfcPropertiesError.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        public final NfcPropertiesError copy(String error) {
            return new NfcPropertiesError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcPropertiesError) && Intrinsics.f(this.error, ((NfcPropertiesError) other).error);
        }

        public final String getError() {
            return this.error;
        }

        public int hashCode() {
            String str = this.error;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("NfcPropertiesError(error="), this.error, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcRetryScanSelected;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countAttempt", "", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;ILcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;)V", "getCountAttempt", "()I", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcRetryScanSelected extends AnalyticsEvent {
        private final int countAttempt;
        private final CountryCode countryCode;
        private final DocumentType documentType;

        @NotNull
        private final NfcFlowType nfcFlowType;

        @NotNull
        private final NFCOptions.Enabled nfcOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcRetryScanSelected(@NotNull NfcFlowType nfcFlowType, DocumentType documentType, CountryCode countryCode, int i, @NotNull NFCOptions.Enabled nfcOptions) {
            super(new Event("NFC_RETRY_SELECTED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("nfc_flow", nfcFlowType), new Pair("count_attempts", Integer.valueOf(i)), new Pair("document_type", documentType), new Pair("country_code", countryCode), new Pair("nfc_processing_option", nfcOptions.getName())), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            this.nfcFlowType = nfcFlowType;
            this.documentType = documentType;
            this.countryCode = countryCode;
            this.countAttempt = i;
            this.nfcOptions = nfcOptions;
        }

        public static /* synthetic */ NfcRetryScanSelected copy$default(NfcRetryScanSelected nfcRetryScanSelected, NfcFlowType nfcFlowType, DocumentType documentType, CountryCode countryCode, int i, NFCOptions.Enabled enabled, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                nfcFlowType = nfcRetryScanSelected.nfcFlowType;
            }
            if ((i2 & 2) != 0) {
                documentType = nfcRetryScanSelected.documentType;
            }
            if ((i2 & 4) != 0) {
                countryCode = nfcRetryScanSelected.countryCode;
            }
            if ((i2 & 8) != 0) {
                i = nfcRetryScanSelected.countAttempt;
            }
            if ((i2 & 16) != 0) {
                enabled = nfcRetryScanSelected.nfcOptions;
            }
            NFCOptions.Enabled enabled2 = enabled;
            CountryCode countryCode2 = countryCode;
            return nfcRetryScanSelected.copy(nfcFlowType, documentType, countryCode2, i, enabled2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DocumentType getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getCountAttempt() {
            return this.countAttempt;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        @NotNull
        public final NfcRetryScanSelected copy(@NotNull NfcFlowType nfcFlowType, DocumentType documentType, CountryCode countryCode, int countAttempt, @NotNull NFCOptions.Enabled nfcOptions) {
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            return new NfcRetryScanSelected(nfcFlowType, documentType, countryCode, countAttempt, nfcOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcRetryScanSelected)) {
                return false;
            }
            NfcRetryScanSelected nfcRetryScanSelected = (NfcRetryScanSelected) other;
            return this.nfcFlowType == nfcRetryScanSelected.nfcFlowType && this.documentType == nfcRetryScanSelected.documentType && this.countryCode == nfcRetryScanSelected.countryCode && this.countAttempt == nfcRetryScanSelected.countAttempt && Intrinsics.f(this.nfcOptions, nfcRetryScanSelected.nfcOptions);
        }

        public final int getCountAttempt() {
            return this.countAttempt;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final DocumentType getDocumentType() {
            return this.documentType;
        }

        @NotNull
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        public int hashCode() {
            int iHashCode = this.nfcFlowType.hashCode() * 31;
            DocumentType documentType = this.documentType;
            int iHashCode2 = (iHashCode + (documentType == null ? 0 : documentType.hashCode())) * 31;
            CountryCode countryCode = this.countryCode;
            return this.nfcOptions.hashCode() + a.b(this.countAttempt, (iHashCode2 + (countryCode != null ? countryCode.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "NfcRetryScanSelected(nfcFlowType=" + this.nfcFlowType + ", documentType=" + this.documentType + ", countryCode=" + this.countryCode + ", countAttempt=" + this.countAttempt + ", nfcOptions=" + this.nfcOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcSkipAtInitialPrompt;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "(Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;)V", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcSkipAtInitialPrompt extends AnalyticsEvent {

        @NotNull
        private final NFCOptions.Enabled nfcOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcSkipAtInitialPrompt(@NotNull NFCOptions.Enabled nfcOptions) {
            super(new Event("NFC_SKIP_AT_INITIAL_PROMPT", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("nfc_processing_option", nfcOptions.getName())), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            this.nfcOptions = nfcOptions;
        }

        public static /* synthetic */ NfcSkipAtInitialPrompt copy$default(NfcSkipAtInitialPrompt nfcSkipAtInitialPrompt, NFCOptions.Enabled enabled, int i, Object obj2) {
            if ((i & 1) != 0) {
                enabled = nfcSkipAtInitialPrompt.nfcOptions;
            }
            return nfcSkipAtInitialPrompt.copy(enabled);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        @NotNull
        public final NfcSkipAtInitialPrompt copy(@NotNull NFCOptions.Enabled nfcOptions) {
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            return new NfcSkipAtInitialPrompt(nfcOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcSkipAtInitialPrompt) && Intrinsics.f(this.nfcOptions, ((NfcSkipAtInitialPrompt) other).nfcOptions);
        }

        @NotNull
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        public int hashCode() {
            return this.nfcOptions.hashCode();
        }

        @NotNull
        public String toString() {
            return "NfcSkipAtInitialPrompt(nfcOptions=" + this.nfcOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcSkipAtManualCanEntry;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcSkipAtManualCanEntry extends AnalyticsEvent {

        @NotNull
        public static final NfcSkipAtManualCanEntry INSTANCE = new NfcSkipAtManualCanEntry();

        private NfcSkipAtManualCanEntry() {
            super(new Event("NFC_SKIP_AT_MANUAL_CAN_ENTRY", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcSkipAtPinEntryClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcSkipAtPinEntryClicked extends AnalyticsEvent {

        @NotNull
        public static final NfcSkipAtPinEntryClicked INSTANCE = new NfcSkipAtPinEntryClicked();

        private NfcSkipAtPinEntryClicked() {
            super(new Event("NFC_PIN_ENTRY_SKIP_CLICKED", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcSkipAtRetry;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "countAttempt", "", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;ILcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;)V", "getCountAttempt", "()I", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcSkipAtRetry extends AnalyticsEvent {
        private final int countAttempt;

        @NotNull
        private final NfcFlowType nfcFlowType;

        @NotNull
        private final NFCOptions.Enabled nfcOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcSkipAtRetry(@NotNull NfcFlowType nfcFlowType, int i, @NotNull NFCOptions.Enabled nfcOptions) {
            super(new Event("NFC_SKIP_AT_RETRY", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("nfc_flow", nfcFlowType), new Pair("count_attempts", Integer.valueOf(i)), new Pair("nfc_processing_option", nfcOptions.getName())), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            this.nfcFlowType = nfcFlowType;
            this.countAttempt = i;
            this.nfcOptions = nfcOptions;
        }

        public static /* synthetic */ NfcSkipAtRetry copy$default(NfcSkipAtRetry nfcSkipAtRetry, NfcFlowType nfcFlowType, int i, NFCOptions.Enabled enabled, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                nfcFlowType = nfcSkipAtRetry.nfcFlowType;
            }
            if ((i2 & 2) != 0) {
                i = nfcSkipAtRetry.countAttempt;
            }
            if ((i2 & 4) != 0) {
                enabled = nfcSkipAtRetry.nfcOptions;
            }
            return nfcSkipAtRetry.copy(nfcFlowType, i, enabled);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCountAttempt() {
            return this.countAttempt;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        @NotNull
        public final NfcSkipAtRetry copy(@NotNull NfcFlowType nfcFlowType, int countAttempt, @NotNull NFCOptions.Enabled nfcOptions) {
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            return new NfcSkipAtRetry(nfcFlowType, countAttempt, nfcOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcSkipAtRetry)) {
                return false;
            }
            NfcSkipAtRetry nfcSkipAtRetry = (NfcSkipAtRetry) other;
            return this.nfcFlowType == nfcSkipAtRetry.nfcFlowType && this.countAttempt == nfcSkipAtRetry.countAttempt && Intrinsics.f(this.nfcOptions, nfcSkipAtRetry.nfcOptions);
        }

        public final int getCountAttempt() {
            return this.countAttempt;
        }

        @NotNull
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        public int hashCode() {
            return this.nfcOptions.hashCode() + a.b(this.countAttempt, this.nfcFlowType.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            return "NfcSkipAtRetry(nfcFlowType=" + this.nfcFlowType + ", countAttempt=" + this.countAttempt + ", nfcOptions=" + this.nfcOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcStartScanSelected;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;)V", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcStartScanSelected extends AnalyticsEvent {
        private final CountryCode countryCode;
        private final DocumentType documentType;

        @NotNull
        private final NfcFlowType nfcFlowType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcStartScanSelected(DocumentType documentType, CountryCode countryCode, @NotNull NfcFlowType nfcFlowType) {
            super(new Event("NFC_START_SCANNING_SELECTED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("document_type", documentType), new Pair("country_code", countryCode), new Pair("nfc_flow", nfcFlowType)), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            this.documentType = documentType;
            this.countryCode = countryCode;
            this.nfcFlowType = nfcFlowType;
        }

        public static /* synthetic */ NfcStartScanSelected copy$default(NfcStartScanSelected nfcStartScanSelected, DocumentType documentType, CountryCode countryCode, NfcFlowType nfcFlowType, int i, Object obj2) {
            if ((i & 1) != 0) {
                documentType = nfcStartScanSelected.documentType;
            }
            if ((i & 2) != 0) {
                countryCode = nfcStartScanSelected.countryCode;
            }
            if ((i & 4) != 0) {
                nfcFlowType = nfcStartScanSelected.nfcFlowType;
            }
            return nfcStartScanSelected.copy(documentType, countryCode, nfcFlowType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DocumentType getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        public final NfcStartScanSelected copy(DocumentType documentType, CountryCode countryCode, @NotNull NfcFlowType nfcFlowType) {
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            return new NfcStartScanSelected(documentType, countryCode, nfcFlowType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcStartScanSelected)) {
                return false;
            }
            NfcStartScanSelected nfcStartScanSelected = (NfcStartScanSelected) other;
            return this.documentType == nfcStartScanSelected.documentType && this.countryCode == nfcStartScanSelected.countryCode && this.nfcFlowType == nfcStartScanSelected.nfcFlowType;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final DocumentType getDocumentType() {
            return this.documentType;
        }

        @NotNull
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        public int hashCode() {
            DocumentType documentType = this.documentType;
            int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
            CountryCode countryCode = this.countryCode;
            return this.nfcFlowType.hashCode() + ((iHashCode + (countryCode != null ? countryCode.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "NfcStartScanSelected(documentType=" + this.documentType + ", countryCode=" + this.countryCode + ", nfcFlowType=" + this.nfcFlowType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcEvents$NfcUnlockAtPinBlockedClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcUnlockAtPinBlockedClicked extends AnalyticsEvent {

        @NotNull
        public static final NfcUnlockAtPinBlockedClicked INSTANCE = new NfcUnlockAtPinBlockedClicked();

        private NfcUnlockAtPinBlockedClicked() {
            super(new Event("NFC_CHIP_BLOCKED_UNLOCK_CLICKED", EventType.ACTION, null, null, 12, null), null, null, 6, null);
        }
    }
}
