package fu0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f138065c;
    public Path d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f138063a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f138064b = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f138066g = true;

    public final void a(Canvas canvas) {
        Path path;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.f138064b;
        if (i != 1) {
            if (i != 0 || (path = this.d) == null) {
                return;
            }
            canvas.clipPath(path);
            return;
        }
        Rect rect = this.f138063a;
        if (rect.isEmpty() && this.f138065c == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        Path path2 = this.d;
        if (path2 == null) {
            path2 = new Path();
            this.d = path2;
        }
        Path path3 = path2;
        if (this.f138066g) {
            this.f138066g = false;
            float f = rect.left;
            float f4 = rect.top;
            float f5 = rect.right;
            float f6 = rect.bottom;
            float f32 = this.f138065c;
            path3.addRoundRect(f, f4, f5, f6, f32, f32, Path.Direction.CW);
        }
        canvas.clipPath(path3);
    }

    public final void b(Canvas canvas, Paint paint) {
        Path path;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        int i = this.f138064b;
        if (i != 1) {
            if (i != 0 || (path = this.d) == null) {
                return;
            }
            canvas.drawPath(path, paint);
            return;
        }
        Rect rect = this.f138063a;
        if (rect.isEmpty() && this.f138065c == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        float f32 = this.f138065c;
        canvas.drawRoundRect(f, f4, f5, f6, f32, f32, paint);
    }

    public final void c(int i, int i2) {
        Path path;
        int i3 = i - this.e;
        int i5 = i2 - this.f;
        if (i3 == 0 && i5 == 0) {
            return;
        }
        this.e = i;
        this.f = i2;
        int i6 = this.f138064b;
        if (i6 == 1) {
            this.f138063a.offset(i3, i5);
            this.f138066g = true;
        } else {
            if (i6 != 0 || (path = this.d) == null) {
                return;
            }
            path.offset(i3, i5);
        }
    }

    public final void d(int i, int i2, int i3, int i5) {
        Path path;
        if (this.f138064b == 0 && (path = this.d) != null) {
            path.reset();
        }
        this.f138066g = true;
        this.f138064b = 1;
        Rect rect = this.f138063a;
        rect.set(i, i2, i3, i5);
        int i6 = this.e;
        int i21 = this.f;
        if (i6 == 0 || i21 == 0) {
            return;
        }
        rect.offset(i6, i21);
    }
}
