package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pc implements na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerDataSource f36707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f36708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f36709c;

    public pc(@NotNull SelfieScannerDataSource dataSource, @NotNull Matrix screenToImageCoordsMatrix, @NotNull Function0<? extends Matrix> imageToScreenCoordsMatrix) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(screenToImageCoordsMatrix, "screenToImageCoordsMatrix");
        Intrinsics.checkNotNullParameter(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        this.f36707a = dataSource;
        this.f36708b = screenToImageCoordsMatrix;
        this.f36709c = imageToScreenCoordsMatrix;
    }

    @Override // com.fourthline.vision.internal.na, com.fourthline.vision.internal.oa
    @NotNull
    public fa contentDetectionArea() {
        RectF rectF = ga.toRectF(this.f36707a.getFaceDetectionArea());
        ((Matrix) this.f36709c.invoke()).invert(this.f36708b);
        this.f36708b.mapRect(rectF);
        return ga.toRectangle(ga.toIntRect(rectF));
    }

    @Override // com.fourthline.vision.internal.na
    public /* bridge */ boolean getShouldStartAutomatically() {
        return super.getShouldStartAutomatically();
    }

    @Override // com.fourthline.vision.internal.na
    @NotNull
    public SelfieScannerConfig config() {
        return this.f36707a.getConfig();
    }

    public /* synthetic */ pc(SelfieScannerDataSource selfieScannerDataSource, Matrix matrix, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(selfieScannerDataSource, (i & 2) != 0 ? new Matrix() : matrix, function0);
    }
}
