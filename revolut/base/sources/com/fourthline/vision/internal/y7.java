package com.fourthline.vision.internal;

import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class y7 implements na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentScannerDataSource f37140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f37141c;
    private DocumentScannerConfig d;

    public y7(boolean z, @NotNull DocumentScannerDataSource dataSource, @NotNull Function0<Matrix> imageToScreenCoordsMatrixFactory) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(imageToScreenCoordsMatrixFactory, "imageToScreenCoordsMatrixFactory");
        this.f37139a = z;
        this.f37140b = dataSource;
        this.f37141c = imageToScreenCoordsMatrixFactory;
        this.d = dataSource.getConfig();
    }

    private final DocumentScannerConfig get_config() {
        if (this.f37139a) {
            this.d = this.f37140b.getConfig();
            this.f37139a = false;
        }
        return this.d;
    }

    @Override // com.fourthline.vision.internal.na, com.fourthline.vision.internal.oa
    @NotNull
    public fa contentDetectionArea() {
        float[] fArrM2049constructorimpl = Matrix.m2049constructorimpl((float[]) ((Matrix) this.f37141c.invoke()).getValues().clone());
        Matrix.m2054invertimpl(fArrM2049constructorimpl);
        return ga.toRectangle(RectHelper_androidKt.toAndroidRect(Matrix.m2056mapimpl(fArrM2049constructorimpl, RectHelper_androidKt.toComposeRect(this.f37140b.getDocumentDetectionArea()))));
    }

    public final boolean getShouldReloadConfigOnce() {
        return this.f37139a;
    }

    @Override // com.fourthline.vision.internal.na
    public boolean getShouldStartAutomatically() {
        return this.f37140b.getShouldStartAutomatically();
    }

    public final void setShouldReloadConfigOnce(boolean z) {
        this.f37139a = z;
    }

    @Override // com.fourthline.vision.internal.na
    @NotNull
    public DocumentScannerConfig config() {
        return get_config();
    }

    public /* synthetic */ y7(boolean z, DocumentScannerDataSource documentScannerDataSource, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, documentScannerDataSource, function0);
    }
}
