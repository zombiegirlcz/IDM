package com.onfido.android.sdk.capture.nfc;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&J$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/nfc/MRTDReaderDelegate;", "", "accessControlFailed", "", "accessControl", "Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "throwable", "", "accessControlFinished", "accessControlStarted", "documentDetected", "documentLost", "readFailed", "readFinished", "data", "Lcom/onfido/android/sdk/capture/nfc/MRTDData;", "readProgress", "percent", "", "readStarted", "verificationFinished", "type", "Lcom/onfido/android/sdk/capture/nfc/VerificationType;", "result", "", "verificationStarted", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MRTDReaderDelegate {
    void accessControlFailed(@NotNull MRTDAccessControl accessControl, @NotNull Throwable throwable);

    void accessControlFinished(@NotNull MRTDAccessControl accessControl);

    void accessControlStarted(@NotNull MRTDAccessControl accessControl);

    void documentDetected();

    void documentLost();

    void readFailed(@NotNull Throwable throwable);

    void readFinished(@NotNull MRTDData data);

    void readProgress(int percent);

    void readStarted();

    void verificationFinished(@NotNull VerificationType type, byte[] result, Throwable throwable);

    void verificationStarted(@NotNull VerificationType type);
}
