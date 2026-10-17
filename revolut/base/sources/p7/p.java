package p7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SparseArrayCompat f233495b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f233494a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cpi.g f233496c = cpi.g.G("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final cpi.g d = cpi.g.G("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator interpolatorCreate;
        pointF.x = r7.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = r7.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = r7.g.b(pointF2.x, -1.0f, 1.0f);
        float fB = r7.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f4 = pointF.y;
        float f5 = pointF2.x;
        Matrix matrix = r7.l.f251966a;
        int i = f != BitmapDescriptorFactory.HUE_RED ? (int) (527 * f) : 17;
        if (f4 != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (i * 31 * f4);
        }
        if (f5 != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (i * 31 * f5);
        }
        if (fB != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (i * 31 * fB);
        }
        d7.a aVar = d7.d.f111646a;
        synchronized (p.class) {
            if (f233495b == null) {
                f233495b = new SparseArrayCompat();
            }
            weakReference = (WeakReference) f233495b.get(i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorCreate = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            interpolatorCreate = "The Path cannot loop back on itself.".equals(e.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, BitmapDescriptorFactory.HUE_RED), pointF2.y) : new LinearInterpolator();
        }
        d7.a aVar2 = d7.d.f111646a;
        try {
            WeakReference weakReference2 = new WeakReference(interpolatorCreate);
            synchronized (p.class) {
                f233495b.put(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return interpolatorCreate;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s7.a b(q7.d r24, d7.j r25, float r26, p7.g0 r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.p.b(q7.d, d7.j, float, p7.g0, boolean, boolean):s7.a");
    }
}
