package kr0;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Shader f188619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f188620c;
    public float d;
    public float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f188621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f188622h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f188623j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f188624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f188625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f188626n;

    public b(Context context, int i, Paint.Style style, Paint.Cap strokeCap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(strokeCap, "strokeCap");
        this.f188618a = i;
        this.f = kli.a.l(context, 0.5f);
        this.f188621g = kli.a.l(context, 1.5f);
        this.f188622h = kli.a.l(context, 1.0f);
        this.i = kli.a.l(context, 3.0f);
        this.f188623j = kli.a.l(context, 2.0f);
        this.k = kli.a.l(context, 6.0f);
        Paint paint = new Paint(1);
        paint.setStyle(style);
        paint.setStrokeCap(strokeCap);
        paint.setColor(i);
        this.f188624l = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(strokeCap);
        paint2.setColor(i);
        float fL = kli.a.l(context, 8.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint2.setMaskFilter(new BlurMaskFilter(fL, blur));
        this.f188625m = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeCap(strokeCap);
        paint3.setColor(i);
        paint3.setMaskFilter(new BlurMaskFilter(kli.a.l(context, 48.0f), blur));
        this.f188626n = paint3;
        c(BitmapDescriptorFactory.HUE_RED);
    }

    public final void a(Canvas canvas, Path corePath, Path innerGlowPath, Path outerBloomPath, boolean z, float f) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(corePath, "corePath");
        Intrinsics.checkNotNullParameter(innerGlowPath, "innerGlowPath");
        Intrinsics.checkNotNullParameter(outerBloomPath, "outerBloomPath");
        float f4 = f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f) * (this.f188619b == null ? Color.alpha(this.f188618a) : 255);
        Paint paint = this.f188626n;
        paint.setAlpha((int) (0.35f * f4));
        Paint paint2 = this.f188625m;
        paint2.setAlpha((int) (0.5f * f4));
        Paint paint3 = this.f188624l;
        paint3.setAlpha((int) f4);
        if (z) {
            canvas.drawPath(outerBloomPath, paint);
            canvas.drawPath(innerGlowPath, paint2);
        }
        canvas.drawPath(corePath, paint3);
    }

    public final void b(Shader shader) {
        this.f188619b = shader;
        this.f188624l.setShader(shader);
        this.f188625m.setShader(shader);
        this.f188626n.setShader(shader);
    }

    public final void c(float f) {
        float f4 = f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float f5 = (this.f188621g * f4) + this.f;
        this.f188620c = f5;
        this.d = (this.i * f4) + this.f188622h;
        this.e = (this.k * f4) + this.f188623j;
        this.f188624l.setStrokeWidth(f5);
        this.f188625m.setStrokeWidth(this.d);
        this.f188626n.setStrokeWidth(this.e);
    }
}
