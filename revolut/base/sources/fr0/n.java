package fr0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fr0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import mx0.m5;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends i {

    @NotNull
    public static final m Companion = new m();
    public boolean A;
    public long B;
    public float C;
    public float D;
    public float E;
    public String F;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f137362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f137363n;
    public boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f137364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f137365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f137366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f137367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f137368t;
    public final RectF u;
    public final Path v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f137369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f137370x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m5 f137371y;
    public boolean z;

    public n(float f, float f4, float f5, float f6, int i) {
        this.f137362m = f4;
        this.f137363n = f5;
        this.f137364p = f;
        this.f137365q = f4;
        this.f137366r = f5;
        Paint paint = new Paint();
        this.f137367s = paint;
        Paint paint2 = new Paint();
        this.f137368t = paint2;
        this.u = new RectF();
        this.v = new Path();
        this.f137369w = new Rect();
        this.f137370x = new ArrayList();
        this.z = true;
        this.A = true;
        m70.a.c(t0.f186434a);
        this.F = "";
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setTextSize(f);
        paint2.setAntiAlias(true);
        paint2.setColor(i);
        paint2.setStrokeWidth(f6);
        this.f137346c.add(j.c.f137353a);
    }

    @Override // fr0.i
    public final void a(float f, float f4) {
        if (this.z) {
            return;
        }
        this.f137362m += f;
        this.f137363n += f4;
        o();
    }

    @Override // fr0.i
    public final void b(float f, float f4, float f5) {
        if (this.z) {
            return;
        }
        this.f137348h += f;
        o();
    }

    @Override // fr0.i
    public final void c(float f, float f4, float f5) {
        if (this.z) {
            return;
        }
        Paint paint = this.f137367s;
        paint.setTextSize(paint.getTextSize() * f);
        o();
    }

    @Override // fr0.i
    public final void d(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f137348h == BitmapDescriptorFactory.HUE_RED || this.z) {
            p(canvas);
            return;
        }
        canvas.save();
        canvas.rotate(this.f137348h, this.f137362m, this.f137363n);
        p(canvas);
        canvas.restore();
    }

    @Override // fr0.i
    public final float e() {
        return this.f137362m;
    }

    @Override // fr0.i
    public final float f() {
        return this.f137363n;
    }

    @Override // fr0.i
    public final Path g() {
        return this.v;
    }

    @Override // fr0.i
    public final boolean h(float f, float f4) {
        Path path = new Path();
        path.moveTo(f, f4);
        float f5 = 1;
        path.addRect(new RectF(f - f5, f4 - f5, f + f5, f4 + f5), Path.Direction.CW);
        path.op(this.v, Path.Op.DIFFERENCE);
        return path.isEmpty();
    }

    @Override // fr0.i
    public final void i(float f) {
        this.f137362m *= f;
        this.f137363n *= f;
        c(f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // fr0.i
    public final void j(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        k(event);
    }

    @Override // fr0.i
    public final void l(int i) {
        this.f137367s.setAlpha(i);
    }

    @Override // fr0.i
    public final void n() {
        ArrayList arrayList = this.f137346c;
        j jVar = (j) d0.o0(arrayList);
        if (!(jVar instanceof l)) {
            super.n();
            return;
        }
        arrayList.remove(v.j(arrayList));
        String newText = ((l) jVar).f137361a;
        Intrinsics.checkNotNullParameter(newText, "newText");
        this.F = newText;
        o();
    }

    public final void o() {
        ArrayList arrayList = this.f137370x;
        arrayList.clear();
        int i = 0;
        if (this.o) {
            String str = this.F;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            arrayList.addAll(kotlin.text.d0.n0(upperCase, new String[]{"\n"}, 0, 6));
        } else {
            arrayList.addAll(kotlin.text.d0.n0(this.F, new String[]{"\n"}, 0, 6));
        }
        if (!this.z && a0.y(this.F, "\n", false)) {
            arrayList.remove(v.j(arrayList));
        }
        int size = arrayList.size();
        boolean z = true;
        float fMax = BitmapDescriptorFactory.HUE_RED;
        float f = 2.0f;
        float size2 = size != 1 ? (arrayList.size() / 2.0f) - 0.5f : 0.0f;
        Paint paint = this.f137367s;
        char c2 = 2;
        float f4 = 2;
        float fAscent = (paint.ascent() + paint.descent()) / f4;
        Iterator it8 = arrayList.iterator();
        int i2 = 0;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = 0.0f;
        while (true) {
            boolean zHasNext = it8.hasNext();
            boolean z3 = z;
            Rect rect = this.f137369w;
            if (!zHasNext) {
                Path path = this.v;
                path.reset();
                path.addRect(new RectF(fMin, fMin2, fMax, fMax2), Path.Direction.CW);
                path.close();
                Matrix matrix = new Matrix();
                matrix.postRotate(this.f137348h, this.f137362m, this.f137363n);
                path.transform(matrix);
                path.computeBounds(this.u, false);
                String str2 = (String) d0.m0(arrayList);
                float textSize = paint.getTextSize();
                paint.setTextSize(this.f137364p);
                paint.getTextBounds(str2, 0, str2.length(), rect);
                float fAscent2 = (this.f137366r + ((paint.ascent() + paint.descent()) / f4)) - (paint.getTextSize() * size2);
                this.C = this.f137365q + (rect.right / 2) + 4.0f;
                this.D = fAscent2 - (paint.getTextSize() / f4);
                this.E = (paint.getTextSize() / f4) + fAscent2;
                paint.setTextSize(textSize);
                return;
            }
            Object next = it8.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            float f5 = f;
            String str3 = (String) next;
            char c3 = c2;
            paint.getTextBounds(str3, i, str3.length(), rect);
            float textSize2 = (this.f137363n + fAscent) - (paint.getTextSize() * size2);
            fMin = Math.min(fMin, this.f137362m - (rect.width() / f5));
            fMin2 = Math.min(fMin2, textSize2 - (paint.getTextSize() / f5));
            fMax = Math.max(fMax, (rect.width() / f5) + this.f137362m);
            fMax2 = Math.max(fMax2, (paint.getTextSize() / f5) + textSize2);
            if (i2 != arrayList.size() - 1) {
                size2 -= 1.0f;
            }
            c2 = c3;
            z = z3;
            i2 = i3;
            f = f5;
            i = 0;
        }
    }

    public final void p(Canvas canvas) {
        ArrayList arrayList = this.f137370x;
        float size = arrayList.size() != 1 ? (arrayList.size() / 2.0f) - 0.5f : BitmapDescriptorFactory.HUE_RED;
        boolean z = this.z;
        Paint paint = this.f137367s;
        if (!z) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                canvas.drawText((String) it8.next(), this.f137362m, this.f137363n - (paint.getTextSize() * size), paint);
                size -= 1.0f;
            }
            return;
        }
        float textSize = paint.getTextSize();
        float f = this.f137364p;
        paint.setTextSize(f);
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            canvas.drawText((String) it9.next(), this.f137365q, this.f137366r - (size * f), paint);
            size -= 1.0f;
        }
        if (System.currentTimeMillis() - this.B > 500) {
            this.B = System.currentTimeMillis();
            this.A = !this.A;
        }
        if (this.A) {
            float f4 = this.C;
            canvas.drawLine(f4, this.D, f4, this.E, this.f137368t);
        }
        paint.setTextSize(textSize);
    }
}
