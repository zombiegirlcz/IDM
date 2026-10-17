package com.onfido.android.sdk.capture.utils;

import a0.d;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.Image;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u000bH\u0000\u001a\u0018\u0010\f\u001a\u00020\r*\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"INTERNATION_CARD_RATIO", "", "INTERNATION_PASSPORT_RATIO", "showOverlay", "", "Landroid/widget/ImageView;", "rect", "Landroid/graphics/RectF;", "toNV21", "", "Landroid/graphics/Bitmap;", "Landroid/media/Image;", "trimDocument", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ImageUtilsExtKt {
    private static final float INTERNATION_CARD_RATIO = 0.63084114f;
    private static final float INTERNATION_PASSPORT_RATIO = 0.704f;

    public static final void showOverlay(@NotNull ImageView imageView, @NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) rect.width(), (int) rect.height());
        int i = (int) rect.left;
        layoutParams.setMargins(i, (int) rect.top, i, 0);
        imageView.setLayoutParams(layoutParams);
        ViewExtensionsKt.toVisible$default(imageView, false, 1, null);
    }

    @NotNull
    public static final byte[] toNV21(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new ImageUtils().getNV21(bitmap.getWidth(), bitmap.getHeight(), bitmap);
    }

    @NotNull
    public static final OnfidoRectF trimDocument(@NotNull OnfidoRectF onfidoRectF, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(onfidoRectF, "<this>");
        return OnfidoRectF.copy$default(onfidoRectF, BitmapDescriptorFactory.HUE_RED, onfidoRectF.getTop() + (onfidoRectF.height() - (onfidoRectF.width() * (documentType == DocumentType.PASSPORT ? INTERNATION_PASSPORT_RATIO : INTERNATION_CARD_RATIO))), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
    }

    public static /* synthetic */ OnfidoRectF trimDocument$default(OnfidoRectF onfidoRectF, DocumentType documentType, int i, Object obj2) {
        if ((i & 1) != 0) {
            documentType = null;
        }
        return trimDocument(onfidoRectF, documentType);
    }

    @NotNull
    public static final byte[] toNV21(@NotNull Image image) {
        int i;
        Intrinsics.checkNotNullParameter(image, "<this>");
        int width = image.getWidth();
        int height = image.getHeight();
        int i2 = width * height;
        byte[] bArr = new byte[d.b(i2, 4, 2, i2)];
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        int i3 = 1;
        ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer2, "getBuffer(...)");
        ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer3, "getBuffer(...)");
        int rowStride = image.getPlanes()[0].getRowStride();
        image.getPlanes()[0].getPixelStride();
        if (rowStride == width) {
            buffer.get(bArr, 0, i2);
            i = i2;
        } else {
            long j2 = rowStride;
            long j3 = -j2;
            i = 0;
            while (i < i2) {
                j3 += j2;
                buffer.position((int) j3);
                buffer.get(bArr, i, width);
                i += width;
                i3 = i3;
            }
        }
        int i5 = i3;
        int rowStride2 = image.getPlanes()[2].getRowStride();
        int pixelStride = image.getPlanes()[2].getPixelStride();
        image.getPlanes()[i5].getRowStride();
        image.getPlanes()[i5].getPixelStride();
        if (pixelStride == 2 && rowStride2 == width) {
            int i6 = i5;
            if (buffer2.get(0) == buffer3.get(i6)) {
                byte b4 = buffer3.get(i6);
                byte b5 = (byte) (~b4);
                try {
                    buffer3.put(i6, b5);
                    if (buffer2.get(0) == b5) {
                        buffer3.put(i6, b4);
                        buffer3.position(0);
                        buffer2.position(0);
                        buffer3.get(bArr, i2, i6);
                        buffer2.get(bArr, i2 + i6, buffer2.remaining());
                        return bArr;
                    }
                } catch (RuntimeException unused) {
                    i6 = 1;
                }
                buffer3.put(i6, b4);
            }
        }
        int i21 = height / 2;
        for (int i22 = 0; i22 < i21; i22++) {
            int i32 = width / 2;
            for (int i33 = 0; i33 < i32; i33++) {
                int i43 = (i22 * rowStride2) + (i33 * pixelStride);
                int i59 = i + 1;
                bArr[i] = buffer3.get(i43);
                i += 2;
                bArr[i59] = buffer2.get(i43);
            }
        }
        return bArr;
    }
}
