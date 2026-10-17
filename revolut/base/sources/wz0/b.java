package wz0;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import l8.a0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l8.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f301314g = new b();

    private b() {
    }

    @Override // l8.d
    public final Bitmap transform(f8.a pool, Bitmap toTransform, int i, int i2) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        Bitmap bitmapB = a0.b(pool, toTransform, i, i2);
        return (bitmapB.getWidth() == i || bitmapB.getHeight() == i2) ? bitmapB : a.a(pool, bitmapB, i, i2);
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(c.f301315a);
    }
}
