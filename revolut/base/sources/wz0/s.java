package wz0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends l8.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f301337g;

    public static final class a {
        private a() {
        }
    }

    static {
        Charset CHARSET = c8.g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "com.revolut.core.ui_kit_core.glide.transformation.SquareTransformation.1".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f301337g = bytes;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        return obj2 instanceof s;
    }

    @Override // c8.g
    public final int hashCode() {
        return -358776745;
    }

    @Override // l8.d
    public final Bitmap transform(f8.a pool, Bitmap toTransform, int i, int i2) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        if (toTransform.getWidth() == toTransform.getHeight()) {
            return toTransform;
        }
        int width = toTransform.getWidth();
        int height = toTransform.getHeight();
        int iMax = Math.max(width, height);
        float f = (iMax - width) / 2;
        float f4 = (iMax - height) / 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        canvas.drawBitmap(toTransform, f, f4, (Paint) null);
        return bitmapCreateBitmap;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(f301337g);
    }
}
