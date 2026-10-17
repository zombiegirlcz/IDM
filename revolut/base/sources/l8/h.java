package l8;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f192733g = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(c8.g.f);

    @Override // c8.g
    public final boolean equals(Object obj2) {
        return obj2 instanceof h;
    }

    @Override // c8.g
    public final int hashCode() {
        return -670243078;
    }

    @Override // l8.d
    public final Bitmap transform(f8.a aVar, Bitmap bitmap, int i, int i2) {
        return a0.b(aVar, bitmap, i, i2);
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f192733g);
    }
}
