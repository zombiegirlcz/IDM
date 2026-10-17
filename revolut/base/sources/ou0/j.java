package ou0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatSeekBar;
import ix0.i1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatSeekBar f229758h;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f229759j;
    public final Path k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f229760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f229761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f229762n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f229763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f229764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint f229765r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AppCompatSeekBar view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f229758h = view;
        this.i = new RectF();
        this.f229759j = new Path();
        this.k = new Path();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 12.0f);
        this.f229760l = iK;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, 4.0f);
        this.f229761m = iK2;
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f229762n = kli.a.k(context3, 8.0f);
        Context context4 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.o = kli.a.k(context4, 14.0f);
        this.f229763p = iK2;
        this.f229764q = iK;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f229764q / 6);
        this.f229765r = paint;
    }

    public static float e(j jVar, float f) {
        int i = jVar.f229760l;
        RectF rectF = jVar.i;
        return (((rectF.width() - (i * 2)) * f) / 100) + rectF.left + i;
    }

    @Override // ou0.a
    public final void b() {
        super.b();
        AppCompatSeekBar appCompatSeekBar = this.f229758h;
        Context context = appCompatSeekBar.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 2.0f);
        knm.b.y(iK, appCompatSeekBar);
        knm.b.v(iK, appCompatSeekBar);
        this.f229765r.setColor(this.e);
    }

    @Override // ou0.a
    public final void c(float f) {
        this.f229763p = i1.c(f, this.f229761m, this.f229762n);
        float fC = i1.c(f, this.f229760l, this.o);
        this.f229764q = fC;
        this.f229765r.setStrokeWidth(fC / 6);
        g();
    }

    public final void f(float f, Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float fCenterY = this.i.centerY();
        float f4 = this.f229764q;
        Paint paint = this.f229752c;
        if (paint != null) {
            if (paint.getAlpha() == 0) {
                paint = null;
            }
            if (paint != null) {
                canvas.drawCircle(f, fCenterY, f4, paint);
            }
        }
        int i = this.d;
        Paint paint2 = this.f229751b;
        paint2.setColor(i);
        canvas.drawCircle(f, fCenterY, f4, paint2);
        Paint paint3 = this.f229765r;
        canvas.drawCircle(f, fCenterY, f4 - (paint3.getStrokeWidth() / 2), paint3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        AppCompatSeekBar appCompatSeekBar = this.f229758h;
        int height = appCompatSeekBar.getHeight();
        float paddingTop = (((height - appCompatSeekBar.getPaddingTop()) - appCompatSeekBar.getPaddingBottom()) - this.f229763p) / 2;
        RectF rectF = this.i;
        rectF.top = appCompatSeekBar.getPaddingTop() + paddingTop;
        rectF.bottom = (height - appCompatSeekBar.getPaddingBottom()) - paddingTop;
        ((i) appCompatSeekBar).a();
        appCompatSeekBar.invalidate();
    }
}
