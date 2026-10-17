package l8;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public final class u extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f192751g = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(c8.g.f);

    @Override // c8.g
    public final boolean equals(Object obj2) {
        return obj2 instanceof u;
    }

    @Override // c8.g
    public final int hashCode() {
        return 1572326941;
    }

    @Override // l8.d
    public final Bitmap transform(f8.a aVar, Bitmap bitmap, int i, int i2) {
        return a0.d(aVar, bitmap, i, i2);
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f192751g);
    }
}
