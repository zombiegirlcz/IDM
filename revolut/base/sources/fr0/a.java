package fr0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fr0.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bitmap f137314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f137315n;
    public final RectF o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Matrix f137316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Path f137317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f137318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f137319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f137320t;

    public a(Bitmap bitmap, float f, float f4) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f137314m = bitmap;
        Paint paint = new Paint();
        this.f137315n = paint;
        RectF rectF = new RectF();
        this.o = rectF;
        Matrix matrix = new Matrix();
        this.f137316p = matrix;
        Path path = new Path();
        this.f137317q = path;
        this.f137318r = new Matrix();
        this.f137320t = 1.0f;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        matrix.postTranslate(f - (bitmap.getWidth() / 2), f4 - (bitmap.getHeight() / 2));
        this.f137346c.add(j.a.f137351a);
        rectF.left = f - (bitmap.getWidth() / 2);
        rectF.top = f4 - (bitmap.getHeight() / 2);
        rectF.right = f + (bitmap.getWidth() / 2);
        rectF.bottom = f4 + (bitmap.getHeight() / 2);
        path.reset();
        path.addRect(rectF, Path.Direction.CW);
    }

    @Override // fr0.i
    public final void a(float f, float f4) {
        this.f137316p.postTranslate(f, f4);
        this.f137317q.offset(f, f4);
        this.o.offset(f, f4);
    }

    @Override // fr0.i
    public final void b(float f, float f4, float f5) {
        this.f137348h += f;
        this.f137316p.postRotate(f, f4, f5);
        Matrix matrix = this.f137318r;
        matrix.reset();
        matrix.postRotate(f, f4, f5);
        this.f137317q.transform(matrix);
    }

    @Override // fr0.i
    public final void c(float f, float f4, float f5) {
        this.f137316p.postScale(f, f, f4, f5);
        Matrix matrix = this.f137318r;
        matrix.reset();
        matrix.postScale(f, f, f4, f5);
        this.f137317q.transform(matrix);
        matrix.mapRect(this.o);
    }

    @Override // fr0.i
    public final void d(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        float f = this.f137348h;
        RectF rectF = this.o;
        canvas.rotate(f, rectF.centerX(), rectF.centerY());
        float f4 = this.f137320t;
        if (f4 != 1.0f) {
            canvas.scale(f4, 1.0f, rectF.centerX(), rectF.centerY());
        }
        canvas.drawBitmap(this.f137314m, this.f137316p, this.f137315n);
        canvas.restore();
    }

    @Override // fr0.i
    public final float e() {
        RectF rectF = new RectF();
        this.f137317q.computeBounds(rectF, false);
        return rectF.centerX();
    }

    @Override // fr0.i
    public final float f() {
        RectF rectF = new RectF();
        this.f137317q.computeBounds(rectF, false);
        return rectF.centerY();
    }

    @Override // fr0.i
    public final Path g() {
        return this.f137317q;
    }

    @Override // fr0.i
    public final boolean h(float f, float f4) {
        Path path = new Path();
        path.moveTo(f, f4);
        float f5 = 1;
        path.addRect(new RectF(f - f5, f4 - f5, f + f5, f4 + f5), Path.Direction.CW);
        path.op(this.f137317q, Path.Op.DIFFERENCE);
        return path.isEmpty();
    }

    @Override // fr0.i
    public final void i(float f) {
        c(f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // fr0.i
    public final void j(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        k(event);
    }

    @Override // fr0.i
    public final void l(int i) {
        this.f137315n.setAlpha(i);
    }

    @Override // fr0.i
    public final void n() {
        ArrayList arrayList = this.f137346c;
        if (!(((j) d0.o0(arrayList)) instanceof j.d)) {
            super.n();
            return;
        }
        arrayList.remove(v.j(arrayList));
        boolean z = this.f137319s;
        this.f137319s = !z;
        this.f137320t = !z ? -1.0f : 1.0f;
    }
}
