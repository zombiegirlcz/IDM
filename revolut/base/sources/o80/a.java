package o80;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    public static Bitmap a(Bitmap bitmap, float f) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (height < width) {
            height = width;
        }
        float f4 = f * height;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect2);
        paint.setAntiAlias(true);
        canvasE.drawARGB(0, 0, 0, 0);
        paint.setColor((int) 4278190080L);
        canvasE.drawRoundRect(rectF, f4, f4, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvasE.drawBitmap(bitmap, rect, rect2, paint);
        return bitmapCreateBitmap;
    }
}
