package fr0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fr0.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final VectorDrawableCompat f137321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f137322n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Path f137323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RectF f137324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f137325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Matrix f137326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f137327t;
    public float u;

    public b(VectorDrawableCompat emoji, float f, float f4) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        this.f137321m = emoji;
        this.f137322n = f;
        this.o = f4;
        Path path = new Path();
        this.f137323p = path;
        RectF rectF = new RectF();
        this.f137324q = rectF;
        this.f137325r = new Matrix();
        this.f137326s = new Matrix();
        this.u = 1.0f;
        this.f137346c.add(j.b.f137352a);
        rectF.left = this.f137322n - (emoji.getIntrinsicWidth() / 2);
        rectF.top = this.o - (emoji.getIntrinsicHeight() / 2);
        rectF.right = this.f137322n + (emoji.getIntrinsicWidth() / 2);
        rectF.bottom = this.o + (emoji.getIntrinsicHeight() / 2);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        emoji.setBounds(rect);
        path.reset();
        path.addRect(rectF, Path.Direction.CW);
    }

    @Override // fr0.i
    public final void a(float f, float f4) {
        Matrix matrix = this.f137325r;
        matrix.reset();
        matrix.postTranslate(f, f4);
        this.f137323p.transform(matrix);
        RectF rectF = this.f137324q;
        rectF.offset(f, f4);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        this.f137321m.setBounds(rect);
        this.f137322n += f;
        this.o += f4;
    }

    @Override // fr0.i
    public final void b(float f, float f4, float f5) {
        this.f137348h += f;
    }

    @Override // fr0.i
    public final void c(float f, float f4, float f5) {
        Matrix matrix = this.f137325r;
        matrix.reset();
        matrix.postScale(f, f, f4, f5);
        this.f137323p.transform(matrix);
        Matrix matrix2 = this.f137326s;
        matrix2.reset();
        matrix2.postScale(f, f, f4, f5);
        RectF rectF = this.f137324q;
        matrix2.mapRect(rectF);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        this.f137321m.setBounds(rect);
    }

    @Override // fr0.i
    public final void d(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        float f = this.f137348h;
        RectF rectF = this.f137324q;
        canvas.rotate(f, rectF.centerX(), rectF.centerY());
        float f4 = this.u;
        if (f4 != 1.0f) {
            canvas.scale(f4, 1.0f, rectF.centerX(), rectF.centerY());
        }
        this.f137321m.draw(canvas);
        canvas.restore();
    }

    @Override // fr0.i
    public final float e() {
        Rect bounds = this.f137321m.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return new RectF(bounds).centerX();
    }

    @Override // fr0.i
    public final float f() {
        Rect bounds = this.f137321m.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return new RectF(bounds).centerY();
    }

    @Override // fr0.i
    public final Path g() {
        Path path = new Path();
        Rect bounds = this.f137321m.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        path.addRect(new RectF(bounds), Path.Direction.CW);
        return path;
    }

    @Override // fr0.i
    public final boolean h(float f, float f4) {
        Path path = new Path();
        path.moveTo(f, f4);
        float f5 = 1;
        path.addRect(new RectF(f - f5, f4 - f5, f + f5, f4 + f5), Path.Direction.CW);
        path.op(this.f137323p, Path.Op.DIFFERENCE);
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
        this.f137321m.setAlpha(i);
    }

    @Override // fr0.i
    public final void n() {
        ArrayList arrayList = this.f137346c;
        if (!(((j) d0.o0(arrayList)) instanceof j.e)) {
            super.n();
            return;
        }
        arrayList.remove(v.j(arrayList));
        boolean z = this.f137327t;
        this.f137327t = !z;
        this.u = !z ? -1.0f : 1.0f;
    }
}
