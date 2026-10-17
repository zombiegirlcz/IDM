package qw;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {
    public static byte[] a(int i, int i2, byte[] bmpBytes) {
        Intrinsics.checkNotNullParameter(bmpBytes, "bmpBytes");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bmpBytes));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmapCreateBitmap.recycle();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.h(byteArray);
        return byteArray;
    }

    public static ByteBuffer b(int i, Bitmap.CompressFormat compressionFormat, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(compressionFormat, "compressionFormat");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressionFormat, i, byteArrayOutputStream);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    public static Bitmap c(Bitmap bmp, Rect rect) {
        Intrinsics.checkNotNullParameter(bmp, "bmp");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bmp, rect.left, rect.top, rect.width(), rect.height());
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static Bitmap d(ByteBuffer buf2, int i, int i2) {
        Intrinsics.checkNotNullParameter(buf2, "buf");
        ByteBuffer byteBufferDuplicate = buf2.duplicate();
        byteBufferDuplicate.rewind();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferDuplicate);
        return bitmapCreateBitmap;
    }

    public static Bitmap e(Bitmap bmp, float f) {
        Intrinsics.checkNotNullParameter(bmp, "bmp");
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bmp, 0, 0, bmp.getWidth(), bmp.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static ByteBuffer f(Bitmap bmp) {
        Intrinsics.checkNotNullParameter(bmp, "bmp");
        if (bmp.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Bitmap must be in ARGB_8888 format");
        }
        Intrinsics.checkNotNullParameter(bmp, "bmp");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bmp.getByteCount());
        bmp.copyPixelsToBuffer(byteBufferAllocate);
        Intrinsics.h(byteBufferAllocate);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }
}
