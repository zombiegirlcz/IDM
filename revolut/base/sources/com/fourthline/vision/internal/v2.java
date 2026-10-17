package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.mlkit.vision.MlKitAnalyzer;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class v2 implements ImageAnalysis.Analyzer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w2 f36996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextRecognizer f36997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BarcodeScanner f36998c;
    private final MlKitAnalyzer d;
    private final t6 e;

    public v2(@NotNull Executor mainExecutor, int i) {
        TextRecognizer t2Var;
        BarcodeScanner r2Var;
        Intrinsics.checkNotNullParameter(mainExecutor, "mainExecutor");
        try {
            t2Var = g4i.a.g(th.a.f271227c);
        } catch (MlKitException unused) {
            t2Var = new t2();
        }
        this.f36997b = t2Var;
        try {
            r2Var = com.bumptech.glide.d.i();
        } catch (MlKitException unused2) {
            r2Var = new r2();
        }
        this.f36998c = r2Var;
        this.d = new MlKitAnalyzer(zhm.v.k(this.f36997b, r2Var), i, mainExecutor, new pg(this, 1));
        this.e = new t6("CameraXDocument", 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mlKitAnalyzer$lambda$0(v2 v2Var, MlKitAnalyzer.Result result) {
        w2 w2Var;
        w2 w2Var2;
        Text text = (Text) result.getValue(v2Var.f36997b);
        if (text != null && (w2Var2 = v2Var.f36996a) != null) {
            w2Var2.onTextDetected(text);
        }
        List<? extends fh.a> list = (List) result.getValue(v2Var.f36998c);
        if (list == null || (w2Var = v2Var.f36996a) == null) {
            return;
        }
        w2Var.onBarcodeDetected(list);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.e.monitor();
        this.d.analyze(image);
    }

    public final w2 getCallback() {
        return this.f36996a;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    @NotNull
    public Size getDefaultTargetResolution() {
        Size defaultTargetResolution = this.d.getDefaultTargetResolution();
        Intrinsics.checkNotNullExpressionValue(defaultTargetResolution, "getDefaultTargetResolution(...)");
        return defaultTargetResolution;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public int getTargetCoordinateSystem() {
        return this.d.getTargetCoordinateSystem();
    }

    public final void setCallback(w2 w2Var) {
        this.f36996a = w2Var;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void updateTransform(Matrix matrix) {
        this.d.updateTransform(matrix);
    }
}
