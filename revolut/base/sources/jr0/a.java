package jr0;

import a41.h0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import ro0.b0;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f177881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f177882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f177883n;
    public final RectF o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f177884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RuntimeShader f177885q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i, boolean z) {
        super(context, i, z);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f177881l = kli.a.l(context, 1.0f);
        this.f177882m = z ? kli.a.l(context, 12.0f) : BitmapDescriptorFactory.HUE_RED;
        this.f177883n = kli.a.l(context, 0.25f);
        this.o = new RectF();
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.f177884p = paintC;
        b0.m();
        RuntimeShader runtimeShaderD = h0.d();
        this.f177885q = runtimeShaderD;
        paintC.setShader(runtimeShaderD);
        Color colorValueOf = Color.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(colorValueOf, "valueOf(...)");
        h0.q(runtimeShaderD, new float[]{colorValueOf.red(), colorValueOf.green(), colorValueOf.blue(), 1.0f});
        h0.o(runtimeShaderD);
    }

    @Override // jr0.b
    public final void a(Canvas canvas) {
        float f;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f <= this.f177889g) {
            return;
        }
        float f4 = this.f177881l;
        float f5 = this.f177883n;
        float f6 = this.f177890h;
        float f32 = ((f4 - f5) * f6) + f5;
        if (this.f177888c) {
            f = this.f177882m * f6;
            if (f < 0.1f) {
                f = 0.1f;
            }
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        h0.p(this.f177885q, this.i);
        h0.u(this.f177885q, f32);
        h0.x(this.f177885q, f);
        h0.A(this.f177885q, this.f / 2.0f);
        h0.B(this.f177885q, this.f177889g / 2.0f);
        canvas.drawRect(this.o, this.f177884p);
    }

    @Override // jr0.b
    public final void b(PathMeasure outlinePathMeasure, float f, Rect bounds, float f4) {
        Intrinsics.checkNotNullParameter(outlinePathMeasure, "outlinePathMeasure");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        h0.v(this.f177885q, new float[]{bounds.width(), bounds.height()});
        h0.y(this.f177885q, new float[]{bounds.left, bounds.top});
        this.f177885q.setFloatUniform("cornerRadius", f4);
        float f5 = (this.f177882m * 5.0f) + this.f177881l;
        this.o.set(bounds.left - f5, bounds.top - f5, bounds.right + f5, bounds.bottom + f5);
    }
}
