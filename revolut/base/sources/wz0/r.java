package wz0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends l8.d {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f301334j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f301335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f301336h;
    public final int i;

    static {
        Charset CHARSET = c8.g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "com.revolut.core.ui_kit_core.glide.transformation.RoundedRectBorderTransformation.1".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f301334j = bytes;
    }

    public r(float f, float f4, int i) {
        this.f301335g = f;
        this.f301336h = f4;
        this.i = i;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return rVar.f301335g == this.f301335g && rVar.f301336h == this.f301336h && rVar.i == this.i;
    }

    @Override // c8.g
    public final int hashCode() {
        return Objects.hash("com.revolut.core.ui_kit_core.glide.transformation.RoundedRectBorderTransformation.1", Float.valueOf(this.f301335g), Float.valueOf(this.f301336h), Integer.valueOf(this.i));
    }

    @Override // l8.d
    public final Bitmap transform(f8.a pool, Bitmap toTransform, int i, int i2) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        Bitmap bitmapF = pool.f(toTransform.getWidth(), toTransform.getHeight(), toTransform.getConfig());
        Intrinsics.checkNotNullExpressionValue(bitmapF, "get(...)");
        Canvas canvas = new Canvas(bitmapF);
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        Paint paint = new Paint();
        paint.setColor(this.i);
        float f = this.f301336h;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        canvas.drawBitmap(toTransform, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paintC);
        float f4 = f / 2;
        float f5 = this.f301335g;
        canvas.drawRoundRect(f4, f4, toTransform.getWidth() - f4, toTransform.getHeight() - f4, f5, f5, paint);
        return bitmapF;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(f301334j);
        messageDigest.update(ByteBuffer.allocate(12).putFloat(this.f301335g).putFloat(this.f301336h).putInt(this.i).array());
    }
}
