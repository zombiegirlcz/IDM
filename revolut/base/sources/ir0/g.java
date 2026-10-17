package ir0;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface g {

    @NotNull
    public static final f Companion = f.f167939a;

    float a();

    void b(Canvas canvas, RectF rectF, float f, float f4);

    void c(float f, float f4, Canvas canvas, float f5);

    void d(int i);

    void e(Canvas canvas, Path path, boolean z, boolean z3);

    void f(Paint.Cap cap);

    void g(int i);

    PathEffect getPathEffect();

    Shader getShader();

    void h(float f);

    void i(boolean z);

    void j(Paint.Style style);

    void k(Canvas canvas, float f, float f4, float f5, float f6, float f32, float f35);

    void l(Canvas canvas, RectF rectF, boolean z, boolean z3);

    boolean m();

    boolean n();

    boolean o();

    int p();

    void q(float f);

    void r(float f);

    void s(PathEffect pathEffect);

    void setShader(Shader shader);

    float t();

    ValueAnimator u();
}
