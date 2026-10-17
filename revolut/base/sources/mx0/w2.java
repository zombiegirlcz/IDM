package mx0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w2 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f210064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f210065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f210066c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f210067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f210068h;
    public final boolean i;

    public w2(FrameLayout view, float f, float f4, float f5, float f6, float f32, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f210064a = view;
        this.f210065b = f;
        this.f210066c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f32;
        this.f210067g = i;
        this.f210068h = i2;
        this.i = z;
        setDuration(200L);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float fA;
        float f4 = this.f210066c;
        float f5 = this.e;
        float fA2 = j6.a.a(f4, f5, f, f5);
        float f6 = this.f210065b;
        float f32 = this.d;
        float fA3 = j6.a.a(f6, f32, f, f32);
        View view = this.f210064a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = (int) fA2;
        marginLayoutParams.width = (int) fA3;
        boolean z = this.i;
        int i = this.f210068h;
        int i2 = this.f210067g;
        float f35 = this.f;
        if (z) {
            float f36 = 1.0f - f;
            view.setTranslationX((fA3 / f6) * f35 * f36);
            fA = (i * f36) + (i2 * f);
        } else {
            view.setTranslationX((fA3 / f32) * f35 * f);
            fA = j6.a.a(1.0f, f, i2, i * f);
        }
        marginLayoutParams.topMargin = (int) fA;
        view.requestLayout();
    }
}
