package wz0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends l8.d {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f301318j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f301319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f301320h;
    public final boolean i;

    static {
        Charset CHARSET = c8.g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "com.revolut.core.ui_kit_core.glide.transformation.CircleBorderTransformation.1".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f301318j = bytes;
    }

    public g(float f, boolean z, int i) {
        this.f301319g = f;
        this.f301320h = i;
        this.i = z;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Float.compare(this.f301319g, gVar.f301319g) == 0 && this.f301320h == gVar.f301320h && this.i == gVar.i;
    }

    @Override // c8.g
    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.b(this.f301320h, Float.hashCode(this.f301319g) * 31, 31);
    }

    @Override // l8.d
    public final Bitmap transform(f8.a pool, Bitmap toTransform, int i, int i2) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        int width = toTransform.getWidth();
        Bitmap bitmapF = pool.f(width, width, toTransform.getConfig());
        Intrinsics.checkNotNullExpressionValue(bitmapF, "get(...)");
        Canvas canvas = new Canvas(bitmapF);
        boolean z = this.i;
        float f = this.f301319g;
        int i3 = this.f301320h;
        if (!z) {
            Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
            Paint paint = new Paint();
            paint.setColor(i3);
            paint.setStrokeWidth(f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            canvas.drawBitmap(toTransform, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paintC);
            float width2 = toTransform.getWidth() / 2.0f;
            canvas.drawCircle(width2, width2, width2 - (f / 2.0f), paint);
            return bitmapF;
        }
        float width3 = toTransform.getWidth() / 2.0f;
        Paint paintC2 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC2.setStyle(Paint.Style.FILL);
        paintC2.setColor(i3);
        Unit unit = Unit.f186387a;
        canvas.drawCircle(width3, width3, width3, paintC2);
        int i5 = (int) f;
        Rect rect = new Rect(i5, i5, i - i5, i2 - i5);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        canvas.drawBitmap(toTransform, (Rect) null, rect, paint2);
        return bitmapF;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(f301318j);
        messageDigest.update(ByteBuffer.allocate(12).putFloat(this.f301319g).putInt(this.f301320h).putInt(this.i ? 1 : 0).array());
    }
}
