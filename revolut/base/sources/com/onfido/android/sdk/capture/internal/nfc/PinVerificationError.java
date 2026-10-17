package com.onfido.android.sdk.capture.internal.nfc;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/PinVerificationError;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcReadState;", "attemptsLeft", "", "(I)V", "getAttemptsLeft", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PinVerificationError implements NfcReadState {
    private final int attemptsLeft;

    public PinVerificationError(int i) {
        this.attemptsLeft = i;
    }

    public static /* synthetic */ PinVerificationError copy$default(PinVerificationError pinVerificationError, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = pinVerificationError.attemptsLeft;
        }
        return pinVerificationError.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAttemptsLeft() {
        return this.attemptsLeft;
    }

    @NotNull
    public final PinVerificationError copy(int attemptsLeft) {
        return new PinVerificationError(attemptsLeft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PinVerificationError) && this.attemptsLeft == ((PinVerificationError) other).attemptsLeft;
    }

    public final int getAttemptsLeft() {
        return this.attemptsLeft;
    }

    public int hashCode() {
        return Integer.hashCode(this.attemptsLeft);
    }

    @NotNull
    public String toString() {
        return j6.a.t(new StringBuilder("PinVerificationError(attemptsLeft="), this.attemptsLeft, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
