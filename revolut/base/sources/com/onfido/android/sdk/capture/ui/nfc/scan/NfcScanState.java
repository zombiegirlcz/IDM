package com.onfido.android.sdk.capture.ui.nfc.scan;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanState;", "", "()V", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/ConnectionLost;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NotStarted;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/PinVerificationFailed;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/ScanCompleted;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/ScanFailed;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/ScanReady;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/ScanRetry;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/Scanned;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/Scanning;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/ScanningTimeout;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class NfcScanState {
    private NfcScanState() {
    }

    public /* synthetic */ NfcScanState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
