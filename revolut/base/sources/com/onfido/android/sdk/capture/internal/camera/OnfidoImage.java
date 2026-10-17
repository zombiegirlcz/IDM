package com.onfido.android.sdk.capture.internal.camera;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import j6.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "", "data", "", "width", "", "height", "rotation", "cropRect", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;", "bitmap", "Landroid/graphics/Bitmap;", "([BIIILcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;Landroid/graphics/Bitmap;)V", "getBitmap$onfido_capture_sdk_core_release", "()Landroid/graphics/Bitmap;", "getCropRect$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;", "getData$onfido_capture_sdk_core_release", "()[B", "getHeight$onfido_capture_sdk_core_release", "()I", "getRotation$onfido_capture_sdk_core_release", "getWidth$onfido_capture_sdk_core_release", "equals", "", "other", "hashCode", "CropRect", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoImage {

    @NotNull
    private final Bitmap bitmap;

    @NotNull
    private final CropRect cropRect;

    @NotNull
    private final byte[] data;
    private final int height;
    private final int rotation;
    private final int width;

    @InternalOnfidoApi
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;", "", "zoomFactor", "", "verticalOffset", "", "horizontalOffset", "previewWidth", "previewHeight", "(FIIII)V", "getHorizontalOffset", "()I", "getPreviewHeight", "getPreviewWidth", "getVerticalOffset", "getZoomFactor", "()F", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CropRect {
        private final int horizontalOffset;
        private final int previewHeight;
        private final int previewWidth;
        private final int verticalOffset;
        private final float zoomFactor;

        public CropRect(float f, int i, int i2, int i3, int i5) {
            this.zoomFactor = f;
            this.verticalOffset = i;
            this.horizontalOffset = i2;
            this.previewWidth = i3;
            this.previewHeight = i5;
        }

        public static /* synthetic */ CropRect copy$default(CropRect cropRect, float f, int i, int i2, int i3, int i5, int i6, Object obj2) {
            if ((i6 & 1) != 0) {
                f = cropRect.zoomFactor;
            }
            if ((i6 & 2) != 0) {
                i = cropRect.verticalOffset;
            }
            if ((i6 & 4) != 0) {
                i2 = cropRect.horizontalOffset;
            }
            if ((i6 & 8) != 0) {
                i3 = cropRect.previewWidth;
            }
            if ((i6 & 16) != 0) {
                i5 = cropRect.previewHeight;
            }
            int i21 = i5;
            int i22 = i2;
            return cropRect.copy(f, i, i22, i3, i21);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getZoomFactor() {
            return this.zoomFactor;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getVerticalOffset() {
            return this.verticalOffset;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getHorizontalOffset() {
            return this.horizontalOffset;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getPreviewWidth() {
            return this.previewWidth;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getPreviewHeight() {
            return this.previewHeight;
        }

        @NotNull
        public final CropRect copy(float zoomFactor, int verticalOffset, int horizontalOffset, int previewWidth, int previewHeight) {
            return new CropRect(zoomFactor, verticalOffset, horizontalOffset, previewWidth, previewHeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CropRect)) {
                return false;
            }
            CropRect cropRect = (CropRect) other;
            return Float.compare(this.zoomFactor, cropRect.zoomFactor) == 0 && this.verticalOffset == cropRect.verticalOffset && this.horizontalOffset == cropRect.horizontalOffset && this.previewWidth == cropRect.previewWidth && this.previewHeight == cropRect.previewHeight;
        }

        public final int getHorizontalOffset() {
            return this.horizontalOffset;
        }

        public final int getPreviewHeight() {
            return this.previewHeight;
        }

        public final int getPreviewWidth() {
            return this.previewWidth;
        }

        public final int getVerticalOffset() {
            return this.verticalOffset;
        }

        public final float getZoomFactor() {
            return this.zoomFactor;
        }

        public int hashCode() {
            return Integer.hashCode(this.previewHeight) + a.b(this.previewWidth, a.b(this.horizontalOffset, a.b(this.verticalOffset, Float.hashCode(this.zoomFactor) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("CropRect(zoomFactor=");
            sb6.append(this.zoomFactor);
            sb6.append(", verticalOffset=");
            sb6.append(this.verticalOffset);
            sb6.append(", horizontalOffset=");
            sb6.append(this.horizontalOffset);
            sb6.append(", previewWidth=");
            sb6.append(this.previewWidth);
            sb6.append(", previewHeight=");
            return a.t(sb6, this.previewHeight, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ CropRect(float r2, int r3, int r4, int r5, int r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                r2 = 1065353216(0x3f800000, float:1.0)
            L6:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lc
                r3 = r0
            Lc:
                r7 = r7 & 4
                r8 = r6
                if (r7 == 0) goto L17
                r6 = r0
                r4 = r2
                r7 = r5
                r5 = r3
                r3 = r1
                goto L1c
            L17:
                r6 = r4
                r7 = r5
                r5 = r3
                r3 = r1
                r4 = r2
            L1c:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.camera.OnfidoImage.CropRect.<init>(float, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public OnfidoImage(@NotNull byte[] data, int i, int i2, int i3, @NotNull CropRect cropRect, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(cropRect, "cropRect");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.data = data;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.cropRect = cropRect;
        this.bitmap = bitmap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnfidoImage)) {
            return false;
        }
        OnfidoImage onfidoImage = (OnfidoImage) other;
        return Arrays.equals(this.data, onfidoImage.data) && this.width == onfidoImage.width && this.height == onfidoImage.height && this.rotation == onfidoImage.rotation && Intrinsics.f(this.cropRect, onfidoImage.cropRect);
    }

    @NotNull
    /* JADX INFO: renamed from: getBitmap$onfido_capture_sdk_core_release, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: getCropRect$onfido_capture_sdk_core_release, reason: from getter */
    public final CropRect getCropRect() {
        return this.cropRect;
    }

    @NotNull
    /* JADX INFO: renamed from: getData$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getHeight$onfido_capture_sdk_core_release, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: getRotation$onfido_capture_sdk_core_release, reason: from getter */
    public final int getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: getWidth$onfido_capture_sdk_core_release, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.cropRect.hashCode() + (((((((Arrays.hashCode(this.data) * 31) + this.width) * 31) + this.height) * 31) + this.rotation) * 31);
    }
}
