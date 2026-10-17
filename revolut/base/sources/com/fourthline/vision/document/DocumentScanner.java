package com.fourthline.vision.document;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000bH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/fourthline/vision/document/DocumentScanner;", "", "step", "Lcom/fourthline/vision/document/DocumentScannerStep;", "getStep", "()Lcom/fourthline/vision/document/DocumentScannerStep;", "stepsCount", "", "getStepsCount", "()Ljava/lang/Integer;", "startScanner", "", "takeSnapshot", "resetCurrentStep", "moveToNextStep", "getOverlayView", "Landroid/view/View;", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentScanner {
    View getOverlayView();

    DocumentScannerStep getStep();

    Integer getStepsCount();

    void moveToNextStep();

    void resetCurrentStep();

    void startScanner();

    void takeSnapshot();
}
