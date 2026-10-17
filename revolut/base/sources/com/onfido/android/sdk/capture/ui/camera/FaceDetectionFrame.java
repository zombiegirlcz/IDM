package com.onfido.android.sdk.capture.ui.camera;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import ehe.n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\u0005H\u0016J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/FaceDetectionFrame;", "Lcom/onfido/android/sdk/capture/ui/camera/CameraFrame;", "data", "", "cameraPreviewWidth", "", "cameraPreviewHeight", "cameraRotation", "cropRect", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;", "bitmap", "Landroid/graphics/Bitmap;", "([BIIILcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getCameraPreviewHeight", "()I", "getCameraPreviewWidth", "getCameraRotation", "getCropRect", "()Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;", "getData", "()[B", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FaceDetectionFrame extends CameraFrame {

    @NotNull
    private final Bitmap bitmap;
    private final int cameraPreviewHeight;
    private final int cameraPreviewWidth;
    private final int cameraRotation;

    @NotNull
    private final OnfidoImage.CropRect cropRect;

    @NotNull
    private final byte[] data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceDetectionFrame(@NotNull byte[] data, int i, int i2, int i3, @NotNull OnfidoImage.CropRect cropRect, @NotNull Bitmap bitmap) {
        super(data, i, i2, i3, null);
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(cropRect, "cropRect");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.data = data;
        this.cameraPreviewWidth = i;
        this.cameraPreviewHeight = i2;
        this.cameraRotation = i3;
        this.cropRect = cropRect;
        this.bitmap = bitmap;
    }

    public static /* synthetic */ FaceDetectionFrame copy$default(FaceDetectionFrame faceDetectionFrame, byte[] bArr, int i, int i2, int i3, OnfidoImage.CropRect cropRect, Bitmap bitmap, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            bArr = faceDetectionFrame.data;
        }
        if ((i5 & 2) != 0) {
            i = faceDetectionFrame.cameraPreviewWidth;
        }
        if ((i5 & 4) != 0) {
            i2 = faceDetectionFrame.cameraPreviewHeight;
        }
        if ((i5 & 8) != 0) {
            i3 = faceDetectionFrame.cameraRotation;
        }
        if ((i5 & 16) != 0) {
            cropRect = faceDetectionFrame.cropRect;
        }
        if ((i5 & 32) != 0) {
            bitmap = faceDetectionFrame.bitmap;
        }
        OnfidoImage.CropRect cropRect2 = cropRect;
        Bitmap bitmap2 = bitmap;
        return faceDetectionFrame.copy(bArr, i, i2, i3, cropRect2, bitmap2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCameraPreviewWidth() {
        return this.cameraPreviewWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCameraPreviewHeight() {
        return this.cameraPreviewHeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCameraRotation() {
        return this.cameraRotation;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OnfidoImage.CropRect getCropRect() {
        return this.cropRect;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final FaceDetectionFrame copy(@NotNull byte[] data, int cameraPreviewWidth, int cameraPreviewHeight, int cameraRotation, @NotNull OnfidoImage.CropRect cropRect, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(cropRect, "cropRect");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new FaceDetectionFrame(data, cameraPreviewWidth, cameraPreviewHeight, cameraRotation, cropRect, bitmap);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CameraFrame
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!FaceDetectionFrame.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.camera.FaceDetectionFrame");
        FaceDetectionFrame faceDetectionFrame = (FaceDetectionFrame) other;
        return Arrays.equals(this.data, faceDetectionFrame.data) && this.cameraPreviewWidth == faceDetectionFrame.cameraPreviewWidth && this.cameraPreviewHeight == faceDetectionFrame.cameraPreviewHeight && this.cameraRotation == faceDetectionFrame.cameraRotation && Intrinsics.f(this.cropRect, faceDetectionFrame.cropRect);
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final int getCameraPreviewHeight() {
        return this.cameraPreviewHeight;
    }

    public final int getCameraPreviewWidth() {
        return this.cameraPreviewWidth;
    }

    public final int getCameraRotation() {
        return this.cameraRotation;
    }

    @NotNull
    public final OnfidoImage.CropRect getCropRect() {
        return this.cropRect;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CameraFrame
    public int hashCode() {
        int iB = (((((n.b(super.hashCode() * 31, 31, this.data) + this.cameraPreviewWidth) * 31) + this.cameraPreviewHeight) * 31) + this.cameraRotation) * 31;
        OnfidoImage.CropRect cropRect = this.cropRect;
        return iB + (cropRect != null ? cropRect.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FaceDetectionFrame(data=" + Arrays.toString(this.data) + ", cameraPreviewWidth=" + this.cameraPreviewWidth + ", cameraPreviewHeight=" + this.cameraPreviewHeight + ", cameraRotation=" + this.cameraRotation + ", cropRect=" + this.cropRect + ", bitmap=" + this.bitmap + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ FaceDetectionFrame(byte[] bArr, int i, int i2, int i3, OnfidoImage.CropRect cropRect, Bitmap bitmap, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, i, i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? new OnfidoImage.CropRect(BitmapDescriptorFactory.HUE_RED, 0, 0, i, i2, 7, null) : cropRect, bitmap);
    }
}
