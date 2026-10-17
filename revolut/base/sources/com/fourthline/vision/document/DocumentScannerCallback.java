package com.fourthline.vision.document;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerCallback;", "", "onFail", "", "error", "Lcom/fourthline/vision/document/DocumentScannerError;", "onSuccess", "result", "Lcom/fourthline/vision/document/DocumentScannerResult;", "onStepUpdate", "step", "Lcom/fourthline/vision/document/DocumentScannerStep;", "onStepFail", "Lcom/fourthline/vision/document/DocumentScannerStepError;", "onStepSuccess", "Lcom/fourthline/vision/document/DocumentScannerStepResult;", "onWarnings", "warnings", "", "Lcom/fourthline/vision/document/DocumentScannerStepWarning;", "onStepsCountUpdate", "count", "", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentScannerCallback {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onStepsCountUpdate(@NotNull DocumentScannerCallback documentScannerCallback, int i) {
            DocumentScannerCallback.super.onStepsCountUpdate(i);
        }
    }

    void onFail(@NotNull DocumentScannerError error);

    void onStepFail(@NotNull DocumentScannerStepError error);

    void onStepSuccess(@NotNull DocumentScannerStepResult result);

    void onStepUpdate(@NotNull DocumentScannerStep step);

    default void onStepsCountUpdate(int count) {
    }

    void onSuccess(@NotNull DocumentScannerResult result);

    void onWarnings(@NotNull List<? extends DocumentScannerStepWarning> warnings);
}
