package com.onfido.android.sdk.capture.ui.nfc.scan;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanViewState;", "", "titleResId", "", "primaryActionResId", "secondaryActionResId", "secondaryButtonVisible", "", "(IIIZ)V", "getPrimaryActionResId", "()I", "getSecondaryActionResId", "getSecondaryButtonVisible", "()Z", "getTitleResId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NfcScanViewState {
    private final int primaryActionResId;
    private final int secondaryActionResId;
    private final boolean secondaryButtonVisible;
    private final int titleResId;

    public NfcScanViewState(int i, int i2, int i3, boolean z) {
        this.titleResId = i;
        this.primaryActionResId = i2;
        this.secondaryActionResId = i3;
        this.secondaryButtonVisible = z;
    }

    public static /* synthetic */ NfcScanViewState copy$default(NfcScanViewState nfcScanViewState, int i, int i2, int i3, boolean z, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            i = nfcScanViewState.titleResId;
        }
        if ((i5 & 2) != 0) {
            i2 = nfcScanViewState.primaryActionResId;
        }
        if ((i5 & 4) != 0) {
            i3 = nfcScanViewState.secondaryActionResId;
        }
        if ((i5 & 8) != 0) {
            z = nfcScanViewState.secondaryButtonVisible;
        }
        return nfcScanViewState.copy(i, i2, i3, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPrimaryActionResId() {
        return this.primaryActionResId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSecondaryActionResId() {
        return this.secondaryActionResId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSecondaryButtonVisible() {
        return this.secondaryButtonVisible;
    }

    @NotNull
    public final NfcScanViewState copy(int titleResId, int primaryActionResId, int secondaryActionResId, boolean secondaryButtonVisible) {
        return new NfcScanViewState(titleResId, primaryActionResId, secondaryActionResId, secondaryButtonVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcScanViewState)) {
            return false;
        }
        NfcScanViewState nfcScanViewState = (NfcScanViewState) other;
        return this.titleResId == nfcScanViewState.titleResId && this.primaryActionResId == nfcScanViewState.primaryActionResId && this.secondaryActionResId == nfcScanViewState.secondaryActionResId && this.secondaryButtonVisible == nfcScanViewState.secondaryButtonVisible;
    }

    public final int getPrimaryActionResId() {
        return this.primaryActionResId;
    }

    public final int getSecondaryActionResId() {
        return this.secondaryActionResId;
    }

    public final boolean getSecondaryButtonVisible() {
        return this.secondaryButtonVisible;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.secondaryButtonVisible) + j6.a.b(this.secondaryActionResId, j6.a.b(this.primaryActionResId, Integer.hashCode(this.titleResId) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("NfcScanViewState(titleResId=");
        sb6.append(this.titleResId);
        sb6.append(", primaryActionResId=");
        sb6.append(this.primaryActionResId);
        sb6.append(", secondaryActionResId=");
        sb6.append(this.secondaryActionResId);
        sb6.append(", secondaryButtonVisible=");
        return j6.a.x(sb6, this.secondaryButtonVisible, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
