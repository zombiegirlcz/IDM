package wz0;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends l8.d {

    @NotNull
    public static final j Companion = new j();
    public static final byte[] i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f301323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f301324h;

    static {
        Charset CHARSET = c8.g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "com.revolut.core.ui_kit_core.glide.transformation.GlideScaleTransformation".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        i = bytes;
    }

    public k(int i2, int i3) {
        this.f301323g = i2;
        this.f301324h = i3;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f301323g == kVar.f301323g && this.f301324h == kVar.f301324h;
    }

    @Override // c8.g
    public final int hashCode() {
        return Integer.hashCode(this.f301324h) + (Integer.hashCode(this.f301323g) * 31);
    }

    @Override // l8.d
    public final Bitmap transform(f8.a pool, Bitmap toTransform, int i2, int i3) {
        Pair pair;
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        int i5 = this.f301323g;
        if (i5 > 0) {
            pair = new Pair(Integer.valueOf(i5), Integer.valueOf((toTransform.getHeight() * i5) / toTransform.getWidth()));
        } else {
            int width = toTransform.getWidth();
            int i6 = this.f301324h;
            pair = new Pair(Integer.valueOf((width * i6) / toTransform.getHeight()), Integer.valueOf(i6));
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(toTransform, ((Number) pair.f186385a).intValue(), ((Number) pair.f186386b).intValue(), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(i);
        messageDigest.update(ByteBuffer.allocate(8).putInt(this.f301323g).putInt(this.f301324h).array());
    }
}
