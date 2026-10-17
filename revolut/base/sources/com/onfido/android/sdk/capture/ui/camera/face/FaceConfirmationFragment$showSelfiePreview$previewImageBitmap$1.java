package com.onfido.android.sdk.capture.ui.camera.face;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.onfido.android.sdk.capture.utils.MatrixExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "matrix", "Landroid/graphics/Matrix;", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class FaceConfirmationFragment$showSelfiePreview$previewImageBitmap$1 extends u implements Function2<Matrix, Bitmap, Unit> {
    public static final FaceConfirmationFragment$showSelfiePreview$previewImageBitmap$1 INSTANCE = new FaceConfirmationFragment$showSelfiePreview$previewImageBitmap$1();

    public FaceConfirmationFragment$showSelfiePreview$previewImageBitmap$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Matrix) obj2, (Bitmap) obj3);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull Matrix matrix, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        MatrixExtensionsKt.postHorizontalFlip(matrix, bitmap.getWidth(), bitmap.getHeight());
    }
}
