package com.onfido.android.sdk.capture.ui.nfc.scan;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/PinVerificationFailed;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanState;", "attemptsLeft", "", "(I)V", "getAttemptsLeft", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PinVerificationFailed extends NfcScanState {
    private final int attemptsLeft;

    public PinVerificationFailed(int i) {
        super(null);
        this.attemptsLeft = i;
    }

    public static /* synthetic */ PinVerificationFailed copy$default(PinVerificationFailed pinVerificationFailed, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = pinVerificationFailed.attemptsLeft;
        }
        return pinVerificationFailed.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAttemptsLeft() {
        return this.attemptsLeft;
    }

    @NotNull
    public final PinVerificationFailed copy(int attemptsLeft) {
        return new PinVerificationFailed(attemptsLeft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PinVerificationFailed) && this.attemptsLeft == ((PinVerificationFailed) other).attemptsLeft;
    }

    public final int getAttemptsLeft() {
        return this.attemptsLeft;
    }

    public int hashCode() {
        return Integer.hashCode(this.attemptsLeft);
    }

    @NotNull
    public String toString() {
        return j6.a.t(new StringBuilder("PinVerificationFailed(attemptsLeft="), this.attemptsLeft, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
