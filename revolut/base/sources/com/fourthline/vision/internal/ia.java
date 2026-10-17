package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ia implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RenderScript f36370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f36372c;
    private Allocation d;
    private Allocation e;
    private ScriptIntrinsicYuvToRGB f;

    public ia(@NotNull RenderScript renderScript, int i) {
        Intrinsics.checkNotNullParameter(renderScript, "renderScript");
        this.f36370a = renderScript;
        this.f36371b = i;
    }

    private final ByteBuffer imageToByteBuffer(Image image) {
        int i;
        Rect rect;
        Rect cropRect = image.getCropRect();
        int iWidth = cropRect.width();
        int iHeight = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int i2 = 0;
        byte[] bArr = new byte[planes[0].getRowStride()];
        int i3 = iWidth * iHeight;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((ImageFormat.getBitsPerPixel(35) * i3) / 8);
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        while (i5 < 3) {
            if (i5 != 0) {
                if (i5 == 1) {
                    i6 = i3 + 1;
                } else if (i5 == 2) {
                    i6 = i3;
                }
                i21 = 2;
            } else {
                i6 = i2;
                i21 = 1;
            }
            ByteBuffer buffer = planes[i5].getBuffer();
            int rowStride = planes[i5].getRowStride();
            int pixelStride = planes[i5].getPixelStride();
            int i22 = i5 == 0 ? i2 : 1;
            int i32 = iWidth >> i22;
            int i33 = iHeight >> i22;
            int i43 = iWidth;
            buffer.position(((cropRect.top >> i22) * rowStride) + ((cropRect.left >> i22) * pixelStride));
            int i59 = 0;
            while (i59 < i33) {
                if (pixelStride == 1 && i21 == 1) {
                    buffer.get(byteBufferAllocateDirect.array(), i6, i32);
                    i6 += i32;
                    rect = cropRect;
                    i = i32;
                } else {
                    i = ((i32 - 1) * pixelStride) + 1;
                    rect = cropRect;
                    buffer.get(bArr, 0, i);
                    for (int i66 = 0; i66 < i32; i66++) {
                        byteBufferAllocateDirect.array()[i6] = bArr[i66 * pixelStride];
                        i6 += i21;
                    }
                }
                if (i59 < i33 - 1) {
                    buffer.position((buffer.position() + rowStride) - i);
                }
                i59++;
                cropRect = rect;
            }
            i5++;
            iWidth = i43;
            i2 = 0;
        }
        Intrinsics.h(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    @Override // com.fourthline.vision.internal.i7
    public void close() {
        Bitmap bitmap = this.f36372c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Allocation allocation = this.e;
        if (allocation != null) {
            allocation.destroy();
        }
        Allocation allocation2 = this.d;
        if (allocation2 != null) {
            allocation2.destroy();
        }
        ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB = this.f;
        if (scriptIntrinsicYuvToRGB != null) {
            scriptIntrinsicYuvToRGB.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // com.fourthline.vision.internal.i7
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap toBitmap(@org.jetbrains.annotations.NotNull android.media.Image r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.ia.toBitmap(android.media.Image, int, int):android.graphics.Bitmap");
    }
}
