package com.fourthline.vision.selfie;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerCallback;", "", "onFail", "", "error", "Lcom/fourthline/vision/selfie/SelfieScannerError;", "onSuccess", "result", "Lcom/fourthline/vision/selfie/SelfieScannerResult;", "onWarnings", "warnings", "", "Lcom/fourthline/vision/selfie/SelfieScannerWarning;", "onStepUpdate", "step", "Lcom/fourthline/vision/selfie/SelfieScannerStep;", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SelfieScannerCallback {
    void onFail(@NotNull SelfieScannerError error);

    void onStepUpdate(@NotNull SelfieScannerStep step);

    void onSuccess(@NotNull SelfieScannerResult result);

    void onWarnings(@NotNull List<? extends SelfieScannerWarning> warnings);
}
