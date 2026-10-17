package fr0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends i {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Path f137328m;
    public Paint o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f137330p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f137332r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f137334t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f137329n = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RectF f137331q = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f137333s = true;

    public d(float f, int i) {
        this.f137330p = f;
        this.f137332r = i;
    }

    @Override // fr0.i
    public final void a(float f, float f4) {
        Iterator it8 = this.f137329n.iterator();
        while (it8.hasNext()) {
            ((k) it8.next()).f137359a.offset(f, f4);
        }
        o();
    }

    @Override // fr0.i
    public final void b(float f, float f4, float f5) {
        this.f137348h += f;
        Matrix matrix = new Matrix();
        matrix.postRotate(f, f4, f5);
        Iterator it8 = this.f137329n.iterator();
        while (it8.hasNext()) {
            ((k) it8.next()).f137359a.transform(matrix);
        }
        o();
    }

    @Override // fr0.i
    public final void c(float f, float f4, float f5) {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f, f4, f5);
        for (k kVar : this.f137329n) {
            kVar.f137359a.transform(matrix);
            Paint paint = kVar.f137360b;
            paint.setStrokeWidth(paint.getStrokeWidth() * f);
        }
        o();
    }

    @Override // fr0.i
    public final void d(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        for (k kVar : this.f137329n) {
            canvas.drawPath(kVar.f137359a, kVar.f137360b);
        }
    }

    @Override // fr0.i
    public final float e() {
        return this.f137331q.centerX();
    }

    @Override // fr0.i
    public final float f() {
        return this.f137331q.centerY();
    }

    @Override // fr0.i
    public final Path g() {
        Path path = new Path();
        RectF rectF = this.f137331q;
        path.moveTo(rectF.left, rectF.top);
        RectF rectF2 = this.f137331q;
        path.lineTo(rectF2.right, rectF2.top);
        RectF rectF3 = this.f137331q;
        path.lineTo(rectF3.right, rectF3.bottom);
        RectF rectF4 = this.f137331q;
        path.lineTo(rectF4.left, rectF4.bottom);
        path.close();
        return path;
    }

    @Override // fr0.i
    public final boolean h(float f, float f4) {
        return this.f137331q.intersects(f, f4, f, f4);
    }

    @Override // fr0.i
    public final void i(float f) {
        c(f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // fr0.i
    public final void j(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f137333s) {
            k(event);
            return;
        }
        float x3 = event.getX();
        float y2 = event.getY();
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float fAbs = Math.abs(x3 - this.d);
                    float fAbs2 = Math.abs(y2 - this.e);
                    if (fAbs >= 2.0f || fAbs2 >= 2.0f) {
                        Path path = this.f137328m;
                        if (path == null) {
                            Intrinsics.r("currentLine");
                            throw null;
                        }
                        path.quadTo(this.d, this.e, x3, y2);
                        this.d = x3;
                        this.e = y2;
                        o();
                        return;
                    }
                    return;
                }
                if (action != 3) {
                    return;
                }
            }
            Path path2 = this.f137328m;
            if (path2 == null) {
                Intrinsics.r("currentLine");
                throw null;
            }
            path2.moveTo(x3, y2);
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        Paint paint = new Paint();
        this.o = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.o;
        if (paint2 == null) {
            Intrinsics.r("linePaint");
            throw null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.o;
        if (paint3 == null) {
            Intrinsics.r("linePaint");
            throw null;
        }
        paint3.setStrokeJoin(Paint.Join.ROUND);
        Paint paint4 = this.o;
        if (paint4 == null) {
            Intrinsics.r("linePaint");
            throw null;
        }
        paint4.setStrokeCap(Paint.Cap.ROUND);
        Paint paint5 = this.o;
        if (paint5 == null) {
            Intrinsics.r("linePaint");
            throw null;
        }
        paint5.setStrokeWidth(this.f137330p);
        if (this.f137334t) {
            Paint paint6 = this.o;
            if (paint6 == null) {
                Intrinsics.r("linePaint");
                throw null;
            }
            paint6.setColor(0);
            Paint paint7 = this.o;
            if (paint7 == null) {
                Intrinsics.r("linePaint");
                throw null;
            }
            paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        } else {
            Paint paint8 = this.o;
            if (paint8 == null) {
                Intrinsics.r("linePaint");
                throw null;
            }
            paint8.setColor(this.f137332r);
            Paint paint9 = this.o;
            if (paint9 == null) {
                Intrinsics.r("linePaint");
                throw null;
            }
            paint9.setXfermode(null);
        }
        Path path3 = new Path();
        this.f137328m = path3;
        Paint paint10 = this.o;
        if (paint10 == null) {
            Intrinsics.r("linePaint");
            throw null;
        }
        k action2 = new k(path3, paint10);
        this.f137329n.add(action2);
        Intrinsics.checkNotNullParameter(action2, "action");
        this.f137346c.add(action2);
        RectF rectF = this.f137331q;
        this.f137331q = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        Path path4 = this.f137328m;
        if (path4 == null) {
            Intrinsics.r("currentLine");
            throw null;
        }
        path4.reset();
        Path path5 = this.f137328m;
        if (path5 == null) {
            Intrinsics.r("currentLine");
            throw null;
        }
        path5.moveTo(x3, y2);
        this.d = x3;
        this.e = y2;
    }

    @Override // fr0.i
    public final void l(int i) {
        Iterator it8 = this.f137329n.iterator();
        while (it8.hasNext()) {
            ((k) it8.next()).f137360b.setAlpha(i);
        }
    }

    @Override // fr0.i
    public final boolean m() {
        return this.f137329n.isEmpty();
    }

    @Override // fr0.i
    public final void n() {
        ArrayList arrayList = this.f137346c;
        j jVar = (j) d0.o0(arrayList);
        if (!(jVar instanceof k)) {
            super.n();
            return;
        }
        arrayList.remove(v.j(arrayList));
        this.f137329n.remove(jVar);
        o();
    }

    public final void o() {
        Path path = new Path();
        path.reset();
        Iterator it8 = this.f137329n.iterator();
        while (it8.hasNext()) {
            path.addPath(((k) it8.next()).f137359a);
        }
        path.computeBounds(this.f137331q, false);
    }
}
