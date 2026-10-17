package jr0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends b {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f177908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PathMeasure f177909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f177910n;
    public final Path o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kr0.b f177911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f177912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f177913r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearGradient f177914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Matrix f177915t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i, boolean z) {
        super(context, i, z);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f177908l = kli.a.l(context, 160.0f);
        this.f177909m = new PathMeasure();
        this.o = new Path();
        this.f177911p = new kr0.b(context, i, Paint.Style.STROKE, Paint.Cap.ROUND);
        this.f177912q = new float[2];
        this.f177913r = new float[2];
        this.f177915t = new Matrix();
    }

    @Override // jr0.b
    public final void a(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f <= this.f177889g) {
            return;
        }
        Path path = this.o;
        path.reset();
        float f = this.f177910n;
        float f4 = 0.25f * f;
        float f5 = (this.f * f) + f4;
        float f6 = (this.f177889g * f) + f4;
        float f32 = f5 - this.f177908l;
        if (f32 >= f6) {
            f6 = f32;
        }
        float f35 = f5 % f;
        float f36 = f6 % f;
        PathMeasure pathMeasure = this.f177909m;
        float[] fArr = this.f177912q;
        pathMeasure.getPosTan(f35, fArr, null);
        PathMeasure pathMeasure2 = this.f177909m;
        float[] fArr2 = this.f177913r;
        pathMeasure2.getPosTan(f36, fArr2, null);
        float f37 = fArr2[0];
        float f41 = fArr2[1];
        float f42 = fArr[0];
        float f57 = fArr[1];
        if (this.f177914s == null) {
            int i = this.f177887b;
            this.f177914s = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, new int[]{0, i, i}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
        }
        double d = f42 - f37;
        double d5 = f57 - f41;
        float fHypot = (float) Math.hypot(d, d5);
        if (fHypot < 0.1f) {
            fHypot = 0.1f;
        }
        float degrees = (float) Math.toDegrees(Math.atan2(d5, d));
        Matrix matrix = this.f177915t;
        matrix.reset();
        matrix.setScale(fHypot, 1.0f);
        matrix.postRotate(degrees);
        matrix.postTranslate(f37, f41);
        LinearGradient linearGradient = this.f177914s;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        LinearGradient linearGradient2 = this.f177914s;
        kr0.b bVar = this.f177911p;
        bVar.b(linearGradient2);
        if (f36 < f35) {
            this.f177909m.getSegment(f36, f35, path, true);
        } else if (f5 - f6 > BitmapDescriptorFactory.HUE_RED) {
            this.f177909m.getSegment(f36, this.f177910n, path, true);
            this.f177909m.getSegment(BitmapDescriptorFactory.HUE_RED, f35, path, true);
        }
        bVar.c(this.f177890h);
        this.f177911p.a(canvas, path, path, path, this.f177888c, this.i);
    }

    @Override // jr0.b
    public final void b(PathMeasure outlinePathMeasure, float f, Rect bounds, float f4) {
        Intrinsics.checkNotNullParameter(outlinePathMeasure, "outlinePathMeasure");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f177909m = outlinePathMeasure;
        this.f177910n = f;
    }
}
