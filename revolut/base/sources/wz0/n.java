package wz0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends l8.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f301329g = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Matrix f301330h;

    static {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        f301330h = matrix;
    }

    private n() {
    }

    @Override // l8.d
    public final Bitmap transform(f8.a pool, Bitmap toTransform, int i, int i2) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(toTransform, 0, 0, i, i2, f301330h, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(o.f301331a);
    }
}
