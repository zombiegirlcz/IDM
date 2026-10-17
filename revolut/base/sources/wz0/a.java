package wz0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private a() {
    }

    public static Bitmap a(f8.a pool, Bitmap toTransform, int i, int i2) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        if (toTransform.getWidth() == i && toTransform.getHeight() == i2) {
            return toTransform;
        }
        Bitmap bitmapF = pool.f(i, i2, toTransform.getConfig() == null ? Bitmap.Config.ARGB_8888 : toTransform.getConfig());
        ch.qos.logback.core.util.a.e(bitmapF, "get(...)", bitmapF).drawBitmap(toTransform, (i - toTransform.getWidth()) / 2.0f, (i2 - toTransform.getHeight()) / 2.0f, com.google.android.gms.internal.mlkit_vision_face.a.c(true));
        return bitmapF;
    }
}
