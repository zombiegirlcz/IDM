package com.onfido.android.sdk.capture.ui.nfc.scan;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/Scanning;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanState;", "progress", "", "connectionReestablished", "", "(IZ)V", "getConnectionReestablished", "()Z", "getProgress", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Scanning extends NfcScanState {
    private final boolean connectionReestablished;
    private final int progress;

    /* JADX WARN: Multi-variable type inference failed */
    public Scanning() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ Scanning copy$default(Scanning scanning, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = scanning.progress;
        }
        if ((i2 & 2) != 0) {
            z = scanning.connectionReestablished;
        }
        return scanning.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getConnectionReestablished() {
        return this.connectionReestablished;
    }

    @NotNull
    public final Scanning copy(int progress, boolean connectionReestablished) {
        return new Scanning(progress, connectionReestablished);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scanning)) {
            return false;
        }
        Scanning scanning = (Scanning) other;
        return this.progress == scanning.progress && this.connectionReestablished == scanning.connectionReestablished;
    }

    public final boolean getConnectionReestablished() {
        return this.connectionReestablished;
    }

    public final int getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Boolean.hashCode(this.connectionReestablished) + (Integer.hashCode(this.progress) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("Scanning(progress=");
        sb6.append(this.progress);
        sb6.append(", connectionReestablished=");
        return j6.a.x(sb6, this.connectionReestablished, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public Scanning(int i, boolean z) {
        super(null);
        this.progress = i;
        this.connectionReestablished = z;
    }

    public /* synthetic */ Scanning(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }
}
