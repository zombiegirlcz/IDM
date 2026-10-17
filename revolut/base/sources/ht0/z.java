package ht0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f155194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn2.c f155195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ct0.f f155196c;
    public final k d;
    public final Paint e;
    public final PathMeasure f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f155197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f155198h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f155199j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f155200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f155201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f155202n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Paint f155203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f155204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f155205r;

    public z(Context context, fn2.c geometry, ct0.f lastPointCircleDrawer, k dotIndicatorPaint) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(lastPointCircleDrawer, "lastPointCircleDrawer");
        Intrinsics.checkNotNullParameter(dotIndicatorPaint, "dotIndicatorPaint");
        this.f155194a = context;
        this.f155195b = geometry;
        this.f155196c = lastPointCircleDrawer;
        this.d = dotIndicatorPaint;
        this.e = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.f = new PathMeasure();
        this.f155197g = new Path();
        this.f155198h = new float[2];
        this.i = new ArrayList();
        this.f155199j = f0.f322471a;
        this.k = true;
        this.f155200l = Float.NaN;
        this.f155201m = Float.NaN;
        this.f155202n = Float.NaN;
        this.o = Float.NaN;
        this.f155203p = new Paint();
    }

    public final void a(float f, Canvas canvas) {
        float fA = ((TrendView) this.f155195b.f136517b).a();
        int size = this.f155199j.size();
        for (int i = 0; i < size; i++) {
            y yVar = (y) this.i.get(i);
            boolean z = (yVar.f155190h == null || yVar.i == null) ? false : true;
            Path path = yVar.k;
            if (z && !path.isEmpty()) {
                Shader shader = yVar.d;
                if (shader == null || yVar.e != fA || !Intrinsics.f(yVar.f, yVar.f155190h) || !Intrinsics.f(yVar.f155189g, yVar.i)) {
                    Integer num = yVar.f155190h;
                    Integer num2 = yVar.i;
                    if (num == null || num2 == null) {
                        shader = null;
                    } else {
                        int iIntValue = num2.intValue();
                        int iIntValue2 = num.intValue();
                        LinearGradient linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, -fA, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, iIntValue2, iIntValue, Shader.TileMode.CLAMP);
                        yVar.d = linearGradient;
                        yVar.e = fA;
                        yVar.f = Integer.valueOf(iIntValue2);
                        yVar.f155189g = Integer.valueOf(iIntValue);
                        shader = linearGradient;
                    }
                }
                Paint paint = this.e;
                paint.setShader(shader);
                if (f < 1.0f) {
                    z zVar = yVar.f155193m;
                    PathMeasure pathMeasure = zVar.f;
                    float[] fArr = zVar.f155198h;
                    pathMeasure.setPath(yVar.f155191j, false);
                    PathMeasure pathMeasure2 = zVar.f;
                    pathMeasure2.getPosTan(pathMeasure2.getLength() * f, fArr, null);
                    float f4 = fArr[0];
                    int iSave = canvas.save();
                    canvas.clipRect(BitmapDescriptorFactory.HUE_RED, -fA, f4, BitmapDescriptorFactory.HUE_RED);
                    try {
                        canvas.drawPath(path, paint);
                    } finally {
                        canvas.restoreToCount(iSave);
                    }
                } else {
                    canvas.drawPath(path, paint);
                }
            }
        }
    }

    public final void b(float f, Canvas canvas) {
        int color = this.f155203p.getColor();
        int size = this.f155199j.size();
        for (int i = 0; i < size; i++) {
            y yVar = (y) this.i.get(i);
            Paint paint = this.f155203p;
            int i2 = yVar.f155192l;
            Path path = yVar.f155191j;
            paint.setColor(i2);
            if (path.isEmpty()) {
                Paint strokePaint = this.f155203p;
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(strokePaint, "strokePaint");
                if (yVar.f155187b != 0) {
                    PointF pointF = (PointF) yVar.f155186a.get(0);
                    int alpha = strokePaint.getAlpha();
                    strokePaint.setAlpha((int) (alpha * f));
                    canvas.drawCircle(pointF.x, pointF.y, strokePaint.getStrokeWidth() / 2.0f, strokePaint);
                    strokePaint.setAlpha(alpha);
                }
            } else if (f < 1.0f) {
                PathMeasure pathMeasure = this.f;
                pathMeasure.setPath(path, false);
                Path path2 = this.f155197g;
                path2.reset();
                pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, pathMeasure.getLength() * f, path2, true);
                canvas.drawPath(path2, this.f155203p);
            } else {
                canvas.drawPath(path, this.f155203p);
            }
        }
        this.f155203p.setColor(color);
    }
}
