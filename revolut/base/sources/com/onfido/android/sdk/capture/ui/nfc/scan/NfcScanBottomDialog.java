package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.databinding.OnfidoViewNfcScanningBinding;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.ui.camera.view.AutoPlayVideoView;
import com.onfido.android.sdk.capture.utils.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 $2\u00020\u0001:\u0004$%&'B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0014J\u0006\u0010\u001f\u001a\u00020\u0019J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0014H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog;", "", "context", "Landroid/content/Context;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "nfcScanActionListener", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$NfcScanBottomActions;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "animationUrl", "", "(Landroid/content/Context;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$NfcScanBottomActions;Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;Ljava/lang/String;)V", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoViewNfcScanningBinding;", "bottomDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "indicatorColorDeterminate", "", "indicatorColorIndeterminate", "trackColorDeterminate", "trackColorIndeterminate", "dismissDialog", "", "showConnectionLost", "showNfcScanReadyView", "showNfcScanRetry", "showNfcScanningView", "progress", "showNfcSuccessView", "updateBottomState", "state", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State;", "updateScanningProgress", "Companion", "NfcScanBottomActions", "State", "ViewState", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcScanBottomDialog {

    @Deprecated
    public static final long PROGRESS_ANIMATION_DURATION = 300;

    @NotNull
    private final String animationUrl;

    @NotNull
    private final AnnouncementService announcementService;

    @NotNull
    private final OnfidoViewNfcScanningBinding binding;

    @NotNull
    private final BottomSheetDialog bottomDialog;
    private final CountryCode countryCode;

    @NotNull
    private final DocumentType documentType;
    private final int indicatorColorDeterminate;
    private final int indicatorColorIndeterminate;

    @NotNull
    private final NfcScanBottomActions nfcScanActionListener;
    private final int trackColorDeterminate;
    private final int trackColorIndeterminate;

    @Deprecated
    @NotNull
    public static final String PROGRESS_BAR_PROGRESS_PROPERTY_NAME = "progress";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$Companion;", "", "()V", "PROGRESS_ANIMATION_DURATION", "", "PROGRESS_BAR_PROGRESS_PROPERTY_NAME", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$NfcScanBottomActions;", "", "onNfcDialogDismissedByDialog", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface NfcScanBottomActions {
        void onNfcDialogDismissedByDialog();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State;", "", "viewState", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$ViewState;", "(Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$ViewState;)V", "getViewState", "()Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$ViewState;", "ConnectionLost", "Ready", "Retry", "Scanning", "Success", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$ConnectionLost;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$Ready;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$Retry;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$Scanning;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$Success;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        @NotNull
        private final ViewState viewState;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$ConnectionLost;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ConnectionLost extends State {
            private final CountryCode countryCode;

            @NotNull
            private final DocumentType documentType;

            /* JADX WARN: Illegal instructions before constructor call */
            public ConnectionLost(@NotNull DocumentType documentType, CountryCode countryCode) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                int i = R.string.onfido_nfc_scan_doc_realign_title;
                DocumentType documentType2 = DocumentType.PASSPORT;
                super(new ViewState(i, Integer.valueOf((documentType == documentType2 && countryCode == CountryCode.US) ? R.string.onfido_nfc_passport_scan_doc_realign_body : documentType == documentType2 ? R.string.onfido_nfc_capture_scan_doc_realign_body : R.string.onfido_nfc_capture_scan_card_realign_body), 0, false, false, false, false, true, false, LDSFile.EF_DG12_TAG, null), null);
                this.documentType = documentType;
                this.countryCode = countryCode;
            }

            public static /* synthetic */ ConnectionLost copy$default(ConnectionLost connectionLost, DocumentType documentType, CountryCode countryCode, int i, Object obj2) {
                if ((i & 1) != 0) {
                    documentType = connectionLost.documentType;
                }
                if ((i & 2) != 0) {
                    countryCode = connectionLost.countryCode;
                }
                return connectionLost.copy(documentType, countryCode);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final CountryCode getCountryCode() {
                return this.countryCode;
            }

            @NotNull
            public final ConnectionLost copy(@NotNull DocumentType documentType, CountryCode countryCode) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                return new ConnectionLost(documentType, countryCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConnectionLost)) {
                    return false;
                }
                ConnectionLost connectionLost = (ConnectionLost) other;
                return this.documentType == connectionLost.documentType && this.countryCode == connectionLost.countryCode;
            }

            public final CountryCode getCountryCode() {
                return this.countryCode;
            }

            @NotNull
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            public int hashCode() {
                int iHashCode = this.documentType.hashCode() * 31;
                CountryCode countryCode = this.countryCode;
                return iHashCode + (countryCode == null ? 0 : countryCode.hashCode());
            }

            @NotNull
            public String toString() {
                return "ConnectionLost(documentType=" + this.documentType + ", countryCode=" + this.countryCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$Ready;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Ready extends State {
            private final CountryCode countryCode;

            @NotNull
            private final DocumentType documentType;

            /* JADX WARN: Illegal instructions before constructor call */
            public Ready(@NotNull DocumentType documentType, CountryCode countryCode) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                int i = R.string.onfido_nfc_sheet_ready_subtitle;
                DocumentType documentType2 = DocumentType.PASSPORT;
                super(new ViewState(i, Integer.valueOf((documentType == documentType2 && countryCode == CountryCode.US) ? R.string.onfido_nfc_capture_scan_passport_usa_sheet : documentType == documentType2 ? R.string.onfido_nfc_capture_scan_passport_sheet : R.string.onfido_nfc_capture_scan_intro_card_scan_guide_android), 0, false, false, false, false, true, false, 380, null), null);
                this.documentType = documentType;
                this.countryCode = countryCode;
            }

            public static /* synthetic */ Ready copy$default(Ready ready, DocumentType documentType, CountryCode countryCode, int i, Object obj2) {
                if ((i & 1) != 0) {
                    documentType = ready.documentType;
                }
                if ((i & 2) != 0) {
                    countryCode = ready.countryCode;
                }
                return ready.copy(documentType, countryCode);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final CountryCode getCountryCode() {
                return this.countryCode;
            }

            @NotNull
            public final Ready copy(@NotNull DocumentType documentType, CountryCode countryCode) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                return new Ready(documentType, countryCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ready)) {
                    return false;
                }
                Ready ready = (Ready) other;
                return this.documentType == ready.documentType && this.countryCode == ready.countryCode;
            }

            public final CountryCode getCountryCode() {
                return this.countryCode;
            }

            @NotNull
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            public int hashCode() {
                int iHashCode = this.documentType.hashCode() * 31;
                CountryCode countryCode = this.countryCode;
                return iHashCode + (countryCode == null ? 0 : countryCode.hashCode());
            }

            @NotNull
            public String toString() {
                return "Ready(documentType=" + this.documentType + ", countryCode=" + this.countryCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$Retry;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "(Lcom/onfido/android/sdk/capture/DocumentType;)V", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Retry extends State {

            @NotNull
            private final DocumentType documentType;

            /* JADX WARN: Illegal instructions before constructor call */
            public Retry(@NotNull DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                DocumentType documentType2 = DocumentType.PASSPORT;
                super(new ViewState(documentType == documentType2 ? R.string.onfido_nfc_intro_sheet_fail_subtitle_passport : R.string.onfido_nfc_intro_sheet_fail_subtitle_card, Integer.valueOf(documentType == documentType2 ? R.string.onfido_nfc_intro_sheet_fail_instructions_passport : R.string.onfido_nfc_intro_sheet_fail_instructions_card), 0, false, false, false, false, true, false, 364, null), null);
                this.documentType = documentType;
            }

            public static /* synthetic */ Retry copy$default(Retry retry, DocumentType documentType, int i, Object obj2) {
                if ((i & 1) != 0) {
                    documentType = retry.documentType;
                }
                return retry.copy(documentType);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            @NotNull
            public final Retry copy(@NotNull DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                return new Retry(documentType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Retry) && this.documentType == ((Retry) other).documentType;
            }

            @NotNull
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            public int hashCode() {
                return this.documentType.hashCode();
            }

            @NotNull
            public String toString() {
                return "Retry(documentType=" + this.documentType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$Scanning;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "progress", "", "(Lcom/onfido/android/sdk/capture/DocumentType;I)V", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "getProgress", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Scanning extends State {

            @NotNull
            private final DocumentType documentType;
            private final int progress;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Scanning(@NotNull DocumentType documentType, int i) {
                super(new ViewState(R.string.onfido_nfc_intro_sheet_scanning_subtitle, Integer.valueOf(documentType == DocumentType.PASSPORT ? R.string.onfido_nfc_sheet_scanning_instruction : R.string.onfido_nfc_capture_scan_card_scanning_sheet_2), 0, false, true, false, false, false, true, LDSFile.EF_DG12_TAG, null), null);
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.documentType = documentType;
                this.progress = i;
            }

            public static /* synthetic */ Scanning copy$default(Scanning scanning, DocumentType documentType, int i, int i2, Object obj2) {
                if ((i2 & 1) != 0) {
                    documentType = scanning.documentType;
                }
                if ((i2 & 2) != 0) {
                    i = scanning.progress;
                }
                return scanning.copy(documentType, i);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getProgress() {
                return this.progress;
            }

            @NotNull
            public final Scanning copy(@NotNull DocumentType documentType, int progress) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                return new Scanning(documentType, progress);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Scanning)) {
                    return false;
                }
                Scanning scanning = (Scanning) other;
                return this.documentType == scanning.documentType && this.progress == scanning.progress;
            }

            @NotNull
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            public final int getProgress() {
                return this.progress;
            }

            public int hashCode() {
                return Integer.hashCode(this.progress) + (this.documentType.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb6 = new StringBuilder("Scanning(documentType=");
                sb6.append(this.documentType);
                sb6.append(", progress=");
                return j6.a.t(sb6, this.progress, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State$Success;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$State;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "(Lcom/onfido/android/sdk/capture/DocumentType;)V", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success extends State {

            @NotNull
            private final DocumentType documentType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull DocumentType documentType) {
                super(new ViewState(R.string.onfido_nfc_sheet_success_subtitle, null, 0, false, true, false, true, false, false, 6, null), null);
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.documentType = documentType;
            }

            public static /* synthetic */ Success copy$default(Success success, DocumentType documentType, int i, Object obj2) {
                if ((i & 1) != 0) {
                    documentType = success.documentType;
                }
                return success.copy(documentType);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            @NotNull
            public final Success copy(@NotNull DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                return new Success(documentType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && this.documentType == ((Success) other).documentType;
            }

            @NotNull
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            public int hashCode() {
                return this.documentType.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(documentType=" + this.documentType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private State(ViewState viewState) {
            this.viewState = viewState;
        }

        @NotNull
        public final ViewState getViewState() {
            return this.viewState;
        }

        public /* synthetic */ State(ViewState viewState, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewState);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003Jj\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000eR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006%"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$ViewState;", "", "titleResId", "", "subtitleResId", "secondaryActionResId", "isProgressBarVisible", "", "isProgressBarHorizontalVisible", "isSecondaryActionVisible", "isSuccessIconVisible", "isInstructionVisible", "isNfcIconVisible", "(ILjava/lang/Integer;IZZZZZZ)V", "()Z", "getSecondaryActionResId", "()I", "getSubtitleResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitleResId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;IZZZZZZ)Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$ViewState;", "equals", "other", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ViewState {
        private final boolean isInstructionVisible;
        private final boolean isNfcIconVisible;
        private final boolean isProgressBarHorizontalVisible;
        private final boolean isProgressBarVisible;
        private final boolean isSecondaryActionVisible;
        private final boolean isSuccessIconVisible;
        private final int secondaryActionResId;
        private final Integer subtitleResId;
        private final int titleResId;

        public ViewState(int i, Integer num, int i2, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
            this.titleResId = i;
            this.subtitleResId = num;
            this.secondaryActionResId = i2;
            this.isProgressBarVisible = z;
            this.isProgressBarHorizontalVisible = z3;
            this.isSecondaryActionVisible = z4;
            this.isSuccessIconVisible = z6;
            this.isInstructionVisible = z11;
            this.isNfcIconVisible = z12;
        }

        public static /* synthetic */ ViewState copy$default(ViewState viewState, int i, Integer num, int i2, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                i = viewState.titleResId;
            }
            if ((i3 & 2) != 0) {
                num = viewState.subtitleResId;
            }
            if ((i3 & 4) != 0) {
                i2 = viewState.secondaryActionResId;
            }
            if ((i3 & 8) != 0) {
                z = viewState.isProgressBarVisible;
            }
            if ((i3 & 16) != 0) {
                z3 = viewState.isProgressBarHorizontalVisible;
            }
            if ((i3 & 32) != 0) {
                z4 = viewState.isSecondaryActionVisible;
            }
            if ((i3 & 64) != 0) {
                z6 = viewState.isSuccessIconVisible;
            }
            if ((i3 & 128) != 0) {
                z11 = viewState.isInstructionVisible;
            }
            if ((i3 & 256) != 0) {
                z12 = viewState.isNfcIconVisible;
            }
            boolean z29 = z11;
            boolean z31 = z12;
            boolean z41 = z4;
            boolean z49 = z6;
            boolean z54 = z3;
            int i5 = i2;
            return viewState.copy(i, num, i5, z, z54, z41, z49, z29, z31);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTitleResId() {
            return this.titleResId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getSubtitleResId() {
            return this.subtitleResId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getSecondaryActionResId() {
            return this.secondaryActionResId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsProgressBarVisible() {
            return this.isProgressBarVisible;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsProgressBarHorizontalVisible() {
            return this.isProgressBarHorizontalVisible;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsSecondaryActionVisible() {
            return this.isSecondaryActionVisible;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsSuccessIconVisible() {
            return this.isSuccessIconVisible;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsInstructionVisible() {
            return this.isInstructionVisible;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsNfcIconVisible() {
            return this.isNfcIconVisible;
        }

        @NotNull
        public final ViewState copy(int titleResId, Integer subtitleResId, int secondaryActionResId, boolean isProgressBarVisible, boolean isProgressBarHorizontalVisible, boolean isSecondaryActionVisible, boolean isSuccessIconVisible, boolean isInstructionVisible, boolean isNfcIconVisible) {
            return new ViewState(titleResId, subtitleResId, secondaryActionResId, isProgressBarVisible, isProgressBarHorizontalVisible, isSecondaryActionVisible, isSuccessIconVisible, isInstructionVisible, isNfcIconVisible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.titleResId == viewState.titleResId && Intrinsics.f(this.subtitleResId, viewState.subtitleResId) && this.secondaryActionResId == viewState.secondaryActionResId && this.isProgressBarVisible == viewState.isProgressBarVisible && this.isProgressBarHorizontalVisible == viewState.isProgressBarHorizontalVisible && this.isSecondaryActionVisible == viewState.isSecondaryActionVisible && this.isSuccessIconVisible == viewState.isSuccessIconVisible && this.isInstructionVisible == viewState.isInstructionVisible && this.isNfcIconVisible == viewState.isNfcIconVisible;
        }

        public final int getSecondaryActionResId() {
            return this.secondaryActionResId;
        }

        public final Integer getSubtitleResId() {
            return this.subtitleResId;
        }

        public final int getTitleResId() {
            return this.titleResId;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.titleResId) * 31;
            Integer num = this.subtitleResId;
            return Boolean.hashCode(this.isNfcIconVisible) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.secondaryActionResId, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.isProgressBarVisible), 31, this.isProgressBarHorizontalVisible), 31, this.isSecondaryActionVisible), 31, this.isSuccessIconVisible), 31, this.isInstructionVisible);
        }

        public final boolean isInstructionVisible() {
            return this.isInstructionVisible;
        }

        public final boolean isNfcIconVisible() {
            return this.isNfcIconVisible;
        }

        public final boolean isProgressBarHorizontalVisible() {
            return this.isProgressBarHorizontalVisible;
        }

        public final boolean isProgressBarVisible() {
            return this.isProgressBarVisible;
        }

        public final boolean isSecondaryActionVisible() {
            return this.isSecondaryActionVisible;
        }

        public final boolean isSuccessIconVisible() {
            return this.isSuccessIconVisible;
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("ViewState(titleResId=");
            sb6.append(this.titleResId);
            sb6.append(", subtitleResId=");
            sb6.append(this.subtitleResId);
            sb6.append(", secondaryActionResId=");
            sb6.append(this.secondaryActionResId);
            sb6.append(", isProgressBarVisible=");
            sb6.append(this.isProgressBarVisible);
            sb6.append(", isProgressBarHorizontalVisible=");
            sb6.append(this.isProgressBarHorizontalVisible);
            sb6.append(", isSecondaryActionVisible=");
            sb6.append(this.isSecondaryActionVisible);
            sb6.append(", isSuccessIconVisible=");
            sb6.append(this.isSuccessIconVisible);
            sb6.append(", isInstructionVisible=");
            sb6.append(this.isInstructionVisible);
            sb6.append(", isNfcIconVisible=");
            return j6.a.x(sb6, this.isNfcIconVisible, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ ViewState(int i, Integer num, int i2, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? R.string.onfido_nfc_sheet_button_secondary : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? true : z4, (i3 & 64) != 0 ? false : z6, (i3 & 128) != 0 ? true : z11, (i3 & 256) != 0 ? false : z12);
        }
    }

    public NfcScanBottomDialog(@NotNull Context context, @NotNull DocumentType documentType, CountryCode countryCode, @NotNull NfcScanBottomActions nfcScanActionListener, @NotNull AnnouncementService announcementService, @NotNull String animationUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(nfcScanActionListener, "nfcScanActionListener");
        Intrinsics.checkNotNullParameter(announcementService, "announcementService");
        Intrinsics.checkNotNullParameter(animationUrl, "animationUrl");
        this.documentType = documentType;
        this.countryCode = countryCode;
        this.nfcScanActionListener = nfcScanActionListener;
        this.announcementService = announcementService;
        this.animationUrl = animationUrl;
        int i = R.attr.onfidoColorProgressIndicator;
        int i2 = R.attr.onfidoColorProgressTrack;
        int i3 = R.attr.onfidoColorProgressIndicatorIndeterminate;
        int i5 = R.attr.onfidoColorProgressTrackIndeterminate;
        int[] iArr = {i, i2, i3, i5};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.indicatorColorIndeterminate = typedArrayObtainStyledAttributes.getColor(kotlin.collections.d.X(iArr, i3), 0);
        this.trackColorIndeterminate = typedArrayObtainStyledAttributes.getColor(kotlin.collections.d.X(iArr, i5), 0);
        this.indicatorColorDeterminate = typedArrayObtainStyledAttributes.getColor(kotlin.collections.d.X(iArr, i), 0);
        this.trackColorDeterminate = typedArrayObtainStyledAttributes.getColor(kotlin.collections.d.X(iArr, i2), 0);
        typedArrayObtainStyledAttributes.recycle();
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
        bottomSheetDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                NfcScanBottomDialog.bottomDialog$lambda$1$lambda$0(this.f50075a, dialogInterface);
            }
        });
        bottomSheetDialog.setCanceledOnTouchOutside(false);
        this.bottomDialog = bottomSheetDialog;
        OnfidoViewNfcScanningBinding onfidoViewNfcScanningBindingInflate = OnfidoViewNfcScanningBinding.inflate(bottomSheetDialog.getLayoutInflater(), null, false);
        bottomSheetDialog.setContentView(onfidoViewNfcScanningBindingInflate.getRoot());
        onfidoViewNfcScanningBindingInflate.secondaryAction.setOnClickListener(new e(this, 1));
        Intrinsics.checkNotNullExpressionValue(onfidoViewNfcScanningBindingInflate, "apply(...)");
        this.binding = onfidoViewNfcScanningBindingInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void binding$lambda$3$lambda$2(NfcScanBottomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.nfcScanActionListener.onNfcDialogDismissedByDialog();
        this$0.bottomDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bottomDialog$lambda$1$lambda$0(NfcScanBottomDialog this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.nfcScanActionListener.onNfcDialogDismissedByDialog();
    }

    private final void updateBottomState(State state) {
        OnfidoViewNfcScanningBinding onfidoViewNfcScanningBinding = this.binding;
        TextView title = onfidoViewNfcScanningBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        ViewGroup.LayoutParams layoutParams = title.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = 0;
        title.setLayoutParams(marginLayoutParams);
        AutoPlayVideoView instructionVideoView = onfidoViewNfcScanningBinding.instructionVideoView;
        Intrinsics.checkNotNullExpressionValue(instructionVideoView, "instructionVideoView");
        instructionVideoView.setVisibility(state.getViewState().isInstructionVisible() ? 0 : 8);
        CircularProgressIndicator progressBarScanning = onfidoViewNfcScanningBinding.progressBarScanning;
        Intrinsics.checkNotNullExpressionValue(progressBarScanning, "progressBarScanning");
        progressBarScanning.setVisibility(!state.getViewState().isProgressBarHorizontalVisible() ? 4 : 0);
        ImageView successIcon = onfidoViewNfcScanningBinding.successIcon;
        Intrinsics.checkNotNullExpressionValue(successIcon, "successIcon");
        successIcon.setVisibility(state.getViewState().isSuccessIconVisible() ? 0 : 8);
        AppCompatButton secondaryAction = onfidoViewNfcScanningBinding.secondaryAction;
        Intrinsics.checkNotNullExpressionValue(secondaryAction, "secondaryAction");
        secondaryAction.setVisibility(!state.getViewState().isSecondaryActionVisible() ? 4 : 0);
        Resources resources = this.binding.getRoot().getResources();
        String string = resources.getString(state.getViewState().getTitleResId());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = state.getViewState().getSubtitleResId() != null ? resources.getString(state.getViewState().getSubtitleResId().intValue()) : "";
        Intrinsics.h(string2);
        onfidoViewNfcScanningBinding.title.setText(string);
        onfidoViewNfcScanningBinding.subtitle.setText(string2);
        TextView subtitle = onfidoViewNfcScanningBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        subtitle.setVisibility(string2.length() != 0 ? 0 : 4);
        onfidoViewNfcScanningBinding.secondaryAction.setText(state.getViewState().getSecondaryActionResId());
        ImageView nfcIcon = onfidoViewNfcScanningBinding.nfcIcon;
        Intrinsics.checkNotNullExpressionValue(nfcIcon, "nfcIcon");
        nfcIcon.setVisibility(state.getViewState().isNfcIconVisible() ? 0 : 8);
        if (state instanceof State.Success) {
            TextView title2 = onfidoViewNfcScanningBinding.title;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            ViewGroup.LayoutParams layoutParams2 = title2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.bottomMargin = (int) this.binding.title.getContext().getResources().getDimension(R.dimen.onfido_nfc_scanning_bottom_dialog_subtitle_space_bottom);
            title2.setLayoutParams(marginLayoutParams2);
        }
        if (state instanceof State.Scanning) {
            updateScanningProgress(((State.Scanning) state).getProgress());
        }
        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(string, ". ", string2);
        onfidoViewNfcScanningBinding.titleContainer.setContentDescription(strO);
        if (!this.announcementService.isEnabled() || (state instanceof State.Ready)) {
            return;
        }
        this.announcementService.announceString(new String[]{strO}, true).e();
    }

    private final void updateScanningProgress(int progress) {
        boolean z = progress == 0;
        int i = z ? this.indicatorColorIndeterminate : this.indicatorColorDeterminate;
        int i2 = z ? this.trackColorIndeterminate : this.trackColorDeterminate;
        CircularProgressIndicator circularProgressIndicator = this.binding.progressBarScanning;
        circularProgressIndicator.setIndeterminate(z);
        circularProgressIndicator.setIndicatorColor(i);
        circularProgressIndicator.setTrackColor(i2);
        if (progress == 0) {
            this.binding.progressBarScanning.setProgress(0);
        } else {
            this.binding.progressBarScanning.setProgress(progress, true);
        }
    }

    public final void dismissDialog() {
        this.bottomDialog.dismiss();
    }

    public final void showConnectionLost() {
        updateBottomState(new State.ConnectionLost(this.documentType, this.countryCode));
    }

    public final void showNfcScanReadyView() {
        updateBottomState(new State.Ready(this.documentType, this.countryCode));
        this.bottomDialog.show();
        AutoPlayVideoView autoPlayVideoView = this.binding.instructionVideoView;
        autoPlayVideoView.setLoading(true);
        if (autoPlayVideoView.hasVideo()) {
            autoPlayVideoView.start();
        } else {
            autoPlayVideoView.setVideoUrl(this.animationUrl);
        }
    }

    public final void showNfcScanRetry() {
        updateBottomState(new State.Retry(this.documentType));
    }

    public final void showNfcScanningView(int progress) {
        updateBottomState(new State.Scanning(this.documentType, progress));
    }

    public final void showNfcSuccessView() {
        updateBottomState(new State.Success(this.documentType));
    }
}
