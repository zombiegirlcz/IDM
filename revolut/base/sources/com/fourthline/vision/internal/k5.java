package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class k5 implements na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerDataSource f36439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f36441c;

    public k5(@NotNull DocumentScannerDataSource dataSource, @NotNull Function0<? extends Matrix> imageToScreenCoordsMatrix) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        this.f36439a = dataSource;
        this.f36440b = imageToScreenCoordsMatrix;
        this.f36441c = new Matrix();
    }

    @Override // com.fourthline.vision.internal.na, com.fourthline.vision.internal.oa
    @NotNull
    public fa contentDetectionArea() {
        RectF rectF = ga.toRectF(this.f36439a.getDocumentDetectionArea());
        ((Matrix) this.f36440b.invoke()).invert(this.f36441c);
        this.f36441c.mapRect(rectF);
        return ga.toRectangle(ga.toIntRect(rectF));
    }

    @Override // com.fourthline.vision.internal.na
    public /* bridge */ boolean getShouldStartAutomatically() {
        return super.getShouldStartAutomatically();
    }

    @Override // com.fourthline.vision.internal.na
    @NotNull
    public DocumentScannerConfig config() {
        return this.f36439a.getConfig();
    }
}
