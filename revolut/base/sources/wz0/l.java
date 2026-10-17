package wz0;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.r0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends l8.d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f301325g;

    public static final class a {
        private a() {
        }
    }

    static {
        Charset CHARSET = c8.g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "com.revolut.core.ui_kit_core.glide.transformation.HexagonalTransformation.1".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f301325g = bytes;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        return obj2 instanceof l;
    }

    @Override // c8.g
    public final int hashCode() {
        return -190640727;
    }

    @Override // l8.d
    public final Bitmap transform(f8.a pool, Bitmap toTransform, int i, int i2) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        int iMin = Math.min(toTransform.getWidth(), toTransform.getHeight());
        Bitmap bitmapF = pool.f(iMin, iMin, Bitmap.Config.ARGB_8888);
        bitmapF.setHasAlpha(true);
        bitmapF.eraseColor(0);
        Intrinsics.checkNotNullExpressionValue(bitmapF, "apply(...)");
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(toTransform, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((iMin - toTransform.getWidth()) / 2.0f, (iMin - toTransform.getHeight()) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        Canvas canvas = new Canvas(bitmapF);
        float f = iMin;
        RectF bounds = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Path path = new Path();
        r0.a(bounds, path);
        Paint paint = new Paint(1);
        paint.setShader(bitmapShader);
        Unit unit = Unit.f186387a;
        canvas.drawPath(path, paint);
        return bitmapF;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(f301325g);
    }
}
