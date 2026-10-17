package r7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Matrix f251966a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f251967b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f251968c = new k(1);
    public static final k d = new k(2);
    public static final k e = new k(3);
    public static final float f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f4, float f5, float f6) {
        d7.a aVar = d7.d.f111646a;
        PathMeasure pathMeasure = (PathMeasure) f251967b.get();
        Path path2 = (Path) f251968c.get();
        Path path3 = (Path) d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f4 == 1.0f && f5 == BitmapDescriptorFactory.HUE_RED) && length >= 1.0f && Math.abs((f5 - f4) - 1.0f) >= 0.01d) {
            float f32 = f4 * length;
            float f35 = f5 * length;
            float f36 = f6 * length;
            float fMin = Math.min(f32, f35) + f36;
            float fMax = Math.max(f32, f35) + f36;
            if (fMin >= length && fMax >= length) {
                fMin = g.d(fMin, length);
                fMax = g.d(fMax, length);
            }
            if (fMin < BitmapDescriptorFactory.HUE_RED) {
                fMin = g.d(fMin, length);
            }
            if (fMax < BitmapDescriptorFactory.HUE_RED) {
                fMax = g.d(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < BitmapDescriptorFactory.HUE_RED) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(int i, int i2, Bitmap bitmap) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint) {
        d7.a aVar = d7.d.f111646a;
        canvas.saveLayer(rectF, paint);
    }
}
