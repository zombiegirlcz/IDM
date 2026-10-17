package wz0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends l8.d {

    @NotNull
    public static final h Companion = new h();
    public static final byte[] i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f301321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f301322h;

    static {
        Charset CHARSET = c8.g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "com.revolut.core.ui_kit_core.glide.transformation.CustomColorsTransformation.1".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        i = bytes;
    }

    public i(int i2, int i3) {
        this.f301321g = i2;
        this.f301322h = i3;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return iVar.f301321g == this.f301321g && iVar.f301322h == this.f301322h;
    }

    @Override // c8.g
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{"com.revolut.core.ui_kit_core.glide.transformation.CustomColorsTransformation.1", Integer.valueOf(this.f301321g), Integer.valueOf(this.f301322h)});
    }

    @Override // l8.d
    public final Bitmap transform(f8.a pool, Bitmap toTransform, int i2, int i3) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        Bitmap bitmapF = pool.f(toTransform.getWidth(), toTransform.getHeight(), toTransform.getConfig());
        Intrinsics.checkNotNullExpressionValue(bitmapF, "get(...)");
        Canvas canvas = new Canvas(bitmapF);
        int i5 = this.f301321g;
        if (i5 != 0) {
            canvas.drawColor(i5);
        }
        Paint paint = new Paint();
        int i6 = this.f301322h;
        if (i6 != 0) {
            paint.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawBitmap(toTransform, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        return bitmapF;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(i);
        messageDigest.update((byte) this.f301321g);
        messageDigest.update((byte) this.f301322h);
    }
}
