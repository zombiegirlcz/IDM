package com.onfido.android.sdk.capture.ui.nfc.scan;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcPassportExtraction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/ScanCompleted;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanState;", "nfcData", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "(Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;)V", "getNfcData", "()Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ScanCompleted extends NfcScanState {

    @NotNull
    private final NfcPassportExtraction nfcData;

    @NotNull
    private final NfcFlowType nfcFlowType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanCompleted(@NotNull NfcPassportExtraction nfcData, @NotNull NfcFlowType nfcFlowType) {
        super(null);
        Intrinsics.checkNotNullParameter(nfcData, "nfcData");
        Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
        this.nfcData = nfcData;
        this.nfcFlowType = nfcFlowType;
    }

    public static /* synthetic */ ScanCompleted copy$default(ScanCompleted scanCompleted, NfcPassportExtraction nfcPassportExtraction, NfcFlowType nfcFlowType, int i, Object obj2) {
        if ((i & 1) != 0) {
            nfcPassportExtraction = scanCompleted.nfcData;
        }
        if ((i & 2) != 0) {
            nfcFlowType = scanCompleted.nfcFlowType;
        }
        return scanCompleted.copy(nfcPassportExtraction, nfcFlowType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NfcPassportExtraction getNfcData() {
        return this.nfcData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NfcFlowType getNfcFlowType() {
        return this.nfcFlowType;
    }

    @NotNull
    public final ScanCompleted copy(@NotNull NfcPassportExtraction nfcData, @NotNull NfcFlowType nfcFlowType) {
        Intrinsics.checkNotNullParameter(nfcData, "nfcData");
        Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
        return new ScanCompleted(nfcData, nfcFlowType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanCompleted)) {
            return false;
        }
        ScanCompleted scanCompleted = (ScanCompleted) other;
        return Intrinsics.f(this.nfcData, scanCompleted.nfcData) && this.nfcFlowType == scanCompleted.nfcFlowType;
    }

    @NotNull
    public final NfcPassportExtraction getNfcData() {
        return this.nfcData;
    }

    @NotNull
    public final NfcFlowType getNfcFlowType() {
        return this.nfcFlowType;
    }

    public int hashCode() {
        return this.nfcFlowType.hashCode() + (this.nfcData.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ScanCompleted(nfcData=" + this.nfcData + ", nfcFlowType=" + this.nfcFlowType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
