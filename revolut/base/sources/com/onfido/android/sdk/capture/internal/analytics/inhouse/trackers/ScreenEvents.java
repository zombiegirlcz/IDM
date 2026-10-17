package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsFlowStep;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.Event;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.EventNames;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.EventType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.utils.CountryCode;
import j6.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0015\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents;", "", "()V", "CountrySelection", "DocumentListFetchRetried", "DocumentTypeSelection", "Final", "NfcCanEntry", "NfcCanMaxAttemptsReached", "NfcChipBlocked", "NfcDeviceNotSupported", "NfcDocumentNotSupported", "NfcIntro", "NfcPinEntry", "NfcRead", "NfcReadError", "NfcSettingsIntro", "PoaCountrySelection", "PoaDocumentDetails", "PoaDocumentSubmission", "PoaDocumentTypeSelection", "PoaVerifyAddress", "UserConsent", "Welcome", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScreenEvents {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$CountrySelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CountrySelection extends AnalyticsEvent {

        @NotNull
        public static final CountrySelection INSTANCE = new CountrySelection();

        private CountrySelection() {
            super(new Event(EventNames.Screen.CountrySelection.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), b.m("step", AnalyticsFlowStep.DOCUMENT), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$DocumentListFetchRetried;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DocumentListFetchRetried extends AnalyticsEvent {

        @NotNull
        public static final DocumentListFetchRetried INSTANCE = new DocumentListFetchRetried();

        private DocumentListFetchRetried() {
            super(new Event(EventNames.Screen.DocumentListFetchRetried.INSTANCE.getName(), EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.DOCUMENT), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$DocumentTypeSelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DocumentTypeSelection extends AnalyticsEvent {

        @NotNull
        public static final DocumentTypeSelection INSTANCE = new DocumentTypeSelection();

        private DocumentTypeSelection() {
            super(new Event(EventNames.Screen.DocumentTypeSelection.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.DOCUMENT), new Pair("combined_country_and_document_selection", Boolean.TRUE)), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$Final;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Final extends AnalyticsEvent {

        @NotNull
        public static final Final INSTANCE = new Final();

        private Final() {
            super(new Event(EventNames.Screen.Final.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), b.m("step", AnalyticsFlowStep.COMPLETE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcCanEntry;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "prefilled", "", "canLength", "", "attempts", "(ZII)V", "getAttempts", "()I", "getCanLength", "getPrefilled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcCanEntry extends AnalyticsEvent {
        private final int attempts;
        private final int canLength;
        private final boolean prefilled;

        public NfcCanEntry(boolean z, int i, int i2) {
            super(new Event(EventNames.Screen.NfcCanEntry.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("prefilled", Boolean.valueOf(z)), new Pair("can_length", Integer.valueOf(i)), new Pair("entry_attempts", Integer.valueOf(i2))), null, 4, null);
            this.prefilled = z;
            this.canLength = i;
            this.attempts = i2;
        }

        public static /* synthetic */ NfcCanEntry copy$default(NfcCanEntry nfcCanEntry, boolean z, int i, int i2, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                z = nfcCanEntry.prefilled;
            }
            if ((i3 & 2) != 0) {
                i = nfcCanEntry.canLength;
            }
            if ((i3 & 4) != 0) {
                i2 = nfcCanEntry.attempts;
            }
            return nfcCanEntry.copy(z, i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getPrefilled() {
            return this.prefilled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCanLength() {
            return this.canLength;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getAttempts() {
            return this.attempts;
        }

        @NotNull
        public final NfcCanEntry copy(boolean prefilled, int canLength, int attempts) {
            return new NfcCanEntry(prefilled, canLength, attempts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcCanEntry)) {
                return false;
            }
            NfcCanEntry nfcCanEntry = (NfcCanEntry) other;
            return this.prefilled == nfcCanEntry.prefilled && this.canLength == nfcCanEntry.canLength && this.attempts == nfcCanEntry.attempts;
        }

        public final int getAttempts() {
            return this.attempts;
        }

        public final int getCanLength() {
            return this.canLength;
        }

        public final boolean getPrefilled() {
            return this.prefilled;
        }

        public int hashCode() {
            return Integer.hashCode(this.attempts) + a.b(this.canLength, Boolean.hashCode(this.prefilled) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("NfcCanEntry(prefilled=");
            sb6.append(this.prefilled);
            sb6.append(", canLength=");
            sb6.append(this.canLength);
            sb6.append(", attempts=");
            return a.t(sb6, this.attempts, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcCanMaxAttemptsReached;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcCanMaxAttemptsReached extends AnalyticsEvent {

        @NotNull
        public static final NfcCanMaxAttemptsReached INSTANCE = new NfcCanMaxAttemptsReached();

        private NfcCanMaxAttemptsReached() {
            super(new Event(EventNames.Screen.NfcCanMaxAttemptsReached.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcChipBlocked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcChipBlocked extends AnalyticsEvent {

        @NotNull
        public static final NfcChipBlocked INSTANCE = new NfcChipBlocked();

        private NfcChipBlocked() {
            super(new Event(EventNames.Screen.NfcChipBlocked.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcDeviceNotSupported;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcDeviceNotSupported extends AnalyticsEvent {

        @NotNull
        public static final NfcDeviceNotSupported INSTANCE = new NfcDeviceNotSupported();

        private NfcDeviceNotSupported() {
            super(new Event(EventNames.Screen.NfcDeviceNotSupported.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcDocumentNotSupported;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcDocumentNotSupported extends AnalyticsEvent {

        @NotNull
        public static final NfcDocumentNotSupported INSTANCE = new NfcDocumentNotSupported();

        private NfcDocumentNotSupported() {
            super(new Event(EventNames.Screen.NfcDocumentNotSupported.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcIntro;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;)V", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcIntro extends AnalyticsEvent {
        private final CountryCode countryCode;
        private final DocumentType documentType;

        @NotNull
        private final NfcFlowType nfcFlowType;

        @NotNull
        private final NFCOptions.Enabled nfcOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcIntro(CountryCode countryCode, DocumentType documentType, @NotNull NfcFlowType nfcFlowType, @NotNull NFCOptions.Enabled nfcOptions) {
            super(new Event(EventNames.Screen.NfcIntro.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("document_type", documentType), new Pair("country_code", countryCode), new Pair("nfc_flow", nfcFlowType), new Pair("nfc_processing_option", nfcOptions.getName())), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            this.countryCode = countryCode;
            this.documentType = documentType;
            this.nfcFlowType = nfcFlowType;
            this.nfcOptions = nfcOptions;
        }

        public static /* synthetic */ NfcIntro copy$default(NfcIntro nfcIntro, CountryCode countryCode, DocumentType documentType, NfcFlowType nfcFlowType, NFCOptions.Enabled enabled, int i, Object obj2) {
            if ((i & 1) != 0) {
                countryCode = nfcIntro.countryCode;
            }
            if ((i & 2) != 0) {
                documentType = nfcIntro.documentType;
            }
            if ((i & 4) != 0) {
                nfcFlowType = nfcIntro.nfcFlowType;
            }
            if ((i & 8) != 0) {
                enabled = nfcIntro.nfcOptions;
            }
            return nfcIntro.copy(countryCode, documentType, nfcFlowType, enabled);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DocumentType getDocumentType() {
            return this.documentType;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        @NotNull
        public final NfcIntro copy(CountryCode countryCode, DocumentType documentType, @NotNull NfcFlowType nfcFlowType, @NotNull NFCOptions.Enabled nfcOptions) {
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            return new NfcIntro(countryCode, documentType, nfcFlowType, nfcOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcIntro)) {
                return false;
            }
            NfcIntro nfcIntro = (NfcIntro) other;
            return this.countryCode == nfcIntro.countryCode && this.documentType == nfcIntro.documentType && this.nfcFlowType == nfcIntro.nfcFlowType && Intrinsics.f(this.nfcOptions, nfcIntro.nfcOptions);
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
            CountryCode countryCode = this.countryCode;
            int iHashCode = (countryCode == null ? 0 : countryCode.hashCode()) * 31;
            DocumentType documentType = this.documentType;
            return this.nfcOptions.hashCode() + ((this.nfcFlowType.hashCode() + ((iHashCode + (documentType != null ? documentType.hashCode() : 0)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "NfcIntro(countryCode=" + this.countryCode + ", documentType=" + this.documentType + ", nfcFlowType=" + this.nfcFlowType + ", nfcOptions=" + this.nfcOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcPinEntry;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "attemptsLeft", "", "(Ljava/lang/Integer;)V", "getAttemptsLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcPinEntry;", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcPinEntry extends AnalyticsEvent {
        private final Integer attemptsLeft;

        public NfcPinEntry(Integer num) {
            super(new Event(EventNames.Screen.NfcPinEntry.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), q0.c(new Pair("attempts_left", num)), null, 4, null);
            this.attemptsLeft = num;
        }

        public static /* synthetic */ NfcPinEntry copy$default(NfcPinEntry nfcPinEntry, Integer num, int i, Object obj2) {
            if ((i & 1) != 0) {
                num = nfcPinEntry.attemptsLeft;
            }
            return nfcPinEntry.copy(num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getAttemptsLeft() {
            return this.attemptsLeft;
        }

        @NotNull
        public final NfcPinEntry copy(Integer attemptsLeft) {
            return new NfcPinEntry(attemptsLeft);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcPinEntry) && Intrinsics.f(this.attemptsLeft, ((NfcPinEntry) other).attemptsLeft);
        }

        public final Integer getAttemptsLeft() {
            return this.attemptsLeft;
        }

        public int hashCode() {
            Integer num = this.attemptsLeft;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @NotNull
        public String toString() {
            return "NfcPinEntry(attemptsLeft=" + this.attemptsLeft + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcRead;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "duration", "", "retryCount", "", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "(JILcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;)V", "getDuration", "()J", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "getRetryCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcRead extends AnalyticsEvent {
        private final long duration;

        @NotNull
        private final NfcFlowType nfcFlowType;

        @NotNull
        private final NFCOptions.Enabled nfcOptions;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcRead(long j2, int i, @NotNull NfcFlowType nfcFlowType, @NotNull NFCOptions.Enabled nfcOptions) {
            super(new Event(EventNames.Screen.NfcRead.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("duration", Long.valueOf(j2)), new Pair("retry_count", Integer.valueOf(i)), new Pair("nfc_flow", nfcFlowType), new Pair("nfc_processing_option", nfcOptions.getName())), null, 4, null);
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            this.duration = j2;
            this.retryCount = i;
            this.nfcFlowType = nfcFlowType;
            this.nfcOptions = nfcOptions;
        }

        public static /* synthetic */ NfcRead copy$default(NfcRead nfcRead, long j2, int i, NfcFlowType nfcFlowType, NFCOptions.Enabled enabled, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                j2 = nfcRead.duration;
            }
            long j3 = j2;
            if ((i2 & 2) != 0) {
                i = nfcRead.retryCount;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                nfcFlowType = nfcRead.nfcFlowType;
            }
            NfcFlowType nfcFlowType2 = nfcFlowType;
            if ((i2 & 8) != 0) {
                enabled = nfcRead.nfcOptions;
            }
            return nfcRead.copy(j3, i3, nfcFlowType2, enabled);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        @NotNull
        public final NfcRead copy(long duration, int retryCount, @NotNull NfcFlowType nfcFlowType, @NotNull NFCOptions.Enabled nfcOptions) {
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            return new NfcRead(duration, retryCount, nfcFlowType, nfcOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcRead)) {
                return false;
            }
            NfcRead nfcRead = (NfcRead) other;
            return this.duration == nfcRead.duration && this.retryCount == nfcRead.retryCount && this.nfcFlowType == nfcRead.nfcFlowType && Intrinsics.f(this.nfcOptions, nfcRead.nfcOptions);
        }

        public final long getDuration() {
            return this.duration;
        }

        @NotNull
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public int hashCode() {
            return this.nfcOptions.hashCode() + ((this.nfcFlowType.hashCode() + a.b(this.retryCount, Long.hashCode(this.duration) * 31, 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "NfcRead(duration=" + this.duration + ", retryCount=" + this.retryCount + ", nfcFlowType=" + this.nfcFlowType + ", nfcOptions=" + this.nfcOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcReadError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "error", "", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;)V", "getError", "()Ljava/lang/String;", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcReadError extends AnalyticsEvent {

        @NotNull
        private final String error;

        @NotNull
        private final NfcFlowType nfcFlowType;

        @NotNull
        private final NFCOptions.Enabled nfcOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcReadError(@NotNull String error, @NotNull NfcFlowType nfcFlowType, @NotNull NFCOptions.Enabled nfcOptions) {
            super(new Event(EventNames.Screen.NfcError.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.NFC), new Pair("error", error), new Pair("nfc_flow", nfcFlowType), new Pair("nfc_processing_option", nfcOptions.getName())), null, 4, null);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            this.error = error;
            this.nfcFlowType = nfcFlowType;
            this.nfcOptions = nfcOptions;
        }

        public static /* synthetic */ NfcReadError copy$default(NfcReadError nfcReadError, String str, NfcFlowType nfcFlowType, NFCOptions.Enabled enabled, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = nfcReadError.error;
            }
            if ((i & 2) != 0) {
                nfcFlowType = nfcReadError.nfcFlowType;
            }
            if ((i & 4) != 0) {
                enabled = nfcReadError.nfcOptions;
            }
            return nfcReadError.copy(str, nfcFlowType, enabled);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final NfcFlowType getNfcFlowType() {
            return this.nfcFlowType;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NFCOptions.Enabled getNfcOptions() {
            return this.nfcOptions;
        }

        @NotNull
        public final NfcReadError copy(@NotNull String error, @NotNull NfcFlowType nfcFlowType, @NotNull NFCOptions.Enabled nfcOptions) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            return new NfcReadError(error, nfcFlowType, nfcOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcReadError)) {
                return false;
            }
            NfcReadError nfcReadError = (NfcReadError) other;
            return Intrinsics.f(this.error, nfcReadError.error) && this.nfcFlowType == nfcReadError.nfcFlowType && Intrinsics.f(this.nfcOptions, nfcReadError.nfcOptions);
        }

        @NotNull
        public final String getError() {
            return this.error;
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
            return this.nfcOptions.hashCode() + ((this.nfcFlowType.hashCode() + (this.error.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "NfcReadError(error=" + this.error + ", nfcFlowType=" + this.nfcFlowType + ", nfcOptions=" + this.nfcOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$NfcSettingsIntro;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcSettingsIntro extends AnalyticsEvent {

        @NotNull
        public static final NfcSettingsIntro INSTANCE = new NfcSettingsIntro();

        private NfcSettingsIntro() {
            super(new Event(EventNames.Screen.NfcSettingsIntro.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$PoaCountrySelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PoaCountrySelection extends AnalyticsEvent {

        @NotNull
        public static final PoaCountrySelection INSTANCE = new PoaCountrySelection();

        private PoaCountrySelection() {
            super(new Event(EventNames.Screen.PoaCountrySelection.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), b.m("step", AnalyticsFlowStep.DOCUMENT), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$PoaDocumentDetails;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PoaDocumentDetails extends AnalyticsEvent {

        @NotNull
        public static final PoaDocumentDetails INSTANCE = new PoaDocumentDetails();

        private PoaDocumentDetails() {
            super(new Event(EventNames.Screen.PoaDocumentDetails.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), b.m("step", AnalyticsFlowStep.DOCUMENT), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$PoaDocumentSubmission;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PoaDocumentSubmission extends AnalyticsEvent {

        @NotNull
        public static final PoaDocumentSubmission INSTANCE = new PoaDocumentSubmission();

        private PoaDocumentSubmission() {
            super(new Event(EventNames.Screen.PoaDocumentSubmission.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), b.m("step", AnalyticsFlowStep.DOCUMENT), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$PoaDocumentTypeSelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PoaDocumentTypeSelection extends AnalyticsEvent {

        @NotNull
        public static final PoaDocumentTypeSelection INSTANCE = new PoaDocumentTypeSelection();

        private PoaDocumentTypeSelection() {
            super(new Event(EventNames.Screen.PoaDocumentTypeSelection.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), b.m("step", AnalyticsFlowStep.DOCUMENT), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$PoaVerifyAddress;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PoaVerifyAddress extends AnalyticsEvent {

        @NotNull
        public static final PoaVerifyAddress INSTANCE = new PoaVerifyAddress();

        private PoaVerifyAddress() {
            super(new Event(EventNames.Screen.PoaVerifyAddress.INSTANCE.getName(), EventType.SCREEN, null, null, 12, null), b.m("step", AnalyticsFlowStep.DOCUMENT), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$UserConsent;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UserConsent extends AnalyticsEvent {

        @NotNull
        public static final UserConsent INSTANCE = new UserConsent();

        private UserConsent() {
            super(new Event(EventNames.Screen.UserConsent.INSTANCE.getName(), EventType.SCREEN, "USER_CONSENT", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.CONSENT), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenEvents$Welcome;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Welcome extends AnalyticsEvent {

        @NotNull
        public static final Welcome INSTANCE = new Welcome();

        private Welcome() {
            super(new Event(EventNames.Screen.Welcome.INSTANCE.getName(), EventType.SCREEN, "WELCOME", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.WELCOME), null, 4, null);
        }
    }
}
