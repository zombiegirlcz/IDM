package wz0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import l8.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends l8.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f301332h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f301333g;

    public static final class a {
        private a() {
        }
    }

    static {
        Charset CHARSET = c8.g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "com.revolut.core.ui_kit_core.glide.transformation.RotationTransformer".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f301332h = bytes;
    }

    public p() {
        this(0);
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f301333g == ((p) obj2).f301333g;
    }

    @Override // c8.g
    public final int hashCode() {
        return Integer.hashCode(this.f301333g);
    }

    @Override // l8.d
    public final Bitmap transform(f8.a pool, Bitmap toTransform, int i, int i2) {
        Bitmap bitmap;
        Matrix matrix;
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        Paint paint = a0.f192713a;
        int i3 = this.f301333g;
        if (i3 != 0) {
            try {
                matrix = new Matrix();
                matrix.setRotate(i3);
                bitmap = toTransform;
            } catch (Exception e) {
                e = e;
                bitmap = toTransform;
            }
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, toTransform.getWidth(), toTransform.getHeight(), matrix, true);
            } catch (Exception e2) {
                e = e2;
                if (Log.isLoggable("TransformationUtils", 6)) {
                }
                bitmapCreateBitmap = bitmap;
            }
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "rotateImage(...)");
            return bitmapCreateBitmap;
        }
        bitmap = toTransform;
        bitmapCreateBitmap = bitmap;
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "rotateImage(...)");
        return bitmapCreateBitmap;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(f301332h);
    }

    public p(int i) {
        this.f301333g = i;
    }
}
