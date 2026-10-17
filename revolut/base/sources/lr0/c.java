package lr0;

import a41.h0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import org.jetbrains.annotations.NotNull;
import ro0.b0;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements e {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr0.b f199359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f199361c;
    public final float d;
    public final RectF e;
    public final RuntimeShader f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f199362g;

    public c(Context context, String geometryFunction, kr0.b renderer, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geometryFunction, "agslFunction");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f199359a = renderer;
        this.f199360b = z;
        float fL = kli.a.l(context, 12.0f);
        this.f199361c = fL;
        float f = renderer.f188620c / 2.0f;
        this.d = f;
        this.e = new RectF();
        b0.m();
        Companion.getClass();
        Intrinsics.checkNotNullParameter(geometryFunction, "geometryFunction");
        RuntimeShader runtimeShaderE = h0.e(t.e("\n            uniform vec4 glowColor;\n            uniform float glowRadius;\n            uniform float bloomSourceHalfWidth;\n            uniform float glowAlpha;\n\n            \n        float metalErf(float x) {\n            float ax = abs(x);\n            float t = 1.0 / (1.0 + 0.3275911 * ax);\n            float p = t * (0.254829592 + t * (-0.284496736 + t * (1.421413741 + t * (-1.453152027 + t * 1.061405429))));\n            float result = 1.0 - p * exp(-ax * ax);\n            return x >= 0.0 ? result : -result;\n        }\n\n        float gaussianLayer(float dist, float strokeHalfWidth, float sigma) {\n            float inv = 1.0 / (sigma * 1.41421356);\n            return 0.5 * (metalErf((strokeHalfWidth - dist) * inv) + metalErf((strokeHalfWidth + dist) * inv));\n        }\n\n        float formBloom(float dist, float strokeHalfWidth, float glowRad) {\n            float g1 = gaussianLayer(dist, strokeHalfWidth, glowRad * (1.0  / 27.0));\n            float g2 = gaussianLayer(dist, strokeHalfWidth, glowRad * (3.0  / 27.0));\n            float g3 = gaussianLayer(dist, strokeHalfWidth, glowRad * (8.0 / 27.0));\n            float g4 = gaussianLayer(dist, strokeHalfWidth, glowRad * (20.0 / 27.0));\n            float g5 = gaussianLayer(dist, strokeHalfWidth, glowRad);\n\n            float combined = 1.0 - (1.0-g1)*(1.0-g2)*(1.0-g3)*(1.0-g4)*(1.0-g5);\n            return min(combined, 0.95);\n        }\n    \n\n            " + geometryFunction + "\n\n            vec4 main(vec2 fragCoord) {\n                vec2 geometry = resolveGlowGeometry(fragCoord);\n                float distanceFromCenter = geometry.x;\n                float taper = clamp(geometry.y, 0.0, 1.0);\n                float directionalFade = clamp(geometry.y / 0.3, 0.0, 1.0);\n                float sourceHalfWidth = bloomSourceHalfWidth * taper;\n                float bloomAlpha = formBloom(distanceFromCenter, sourceHalfWidth, glowRadius);\n                if (bloomAlpha < 0.004) return vec4(0.0);\n\n                float resolvedAlpha = bloomAlpha * glowColor.a * glowAlpha * directionalFade;\n                return vec4(glowColor.rgb * resolvedAlpha, resolvedAlpha);\n            }\n        "));
        h0.x(runtimeShaderE, z ? fL : BitmapDescriptorFactory.HUE_RED);
        h0.C(runtimeShaderE, f);
        Color colorValueOf = Color.valueOf(renderer.f188618a);
        Intrinsics.checkNotNullExpressionValue(colorValueOf, "valueOf(...)");
        runtimeShaderE.setFloatUniform("glowColor", colorValueOf.red(), colorValueOf.green(), colorValueOf.blue(), colorValueOf.alpha());
        this.f = runtimeShaderE;
        Paint paint = new Paint(1);
        paint.setShader(runtimeShaderE);
        this.f199362g = paint;
    }

    @Override // lr0.e
    public final float a() {
        return this.f199359a.d;
    }

    @Override // lr0.e
    public final boolean b() {
        return false;
    }

    @Override // lr0.e
    public final float c() {
        return this.f199359a.e;
    }

    @Override // lr0.e
    public final void d(Canvas canvas, mr0.a geometry, float f, LinearGradient linearGradient) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        boolean z = this.f199360b;
        if (z) {
            geometry.f(this.f);
            RuntimeShader runtimeShader = this.f;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            h0.D(runtimeShader, kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f));
            if (z) {
                f4 = this.f199361c;
            }
            float f5 = (f4 * 5.0f) + this.d;
            RectF rectF = this.e;
            geometry.c(rectF, f5);
            canvas.drawRect(rectF, this.f199362g);
        }
        kr0.b bVar = this.f199359a;
        bVar.b(linearGradient);
        Path pathE = geometry.e();
        bVar.a(canvas, pathE, pathE, pathE, false, f);
    }
}
