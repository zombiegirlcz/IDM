package au0;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 implements j2 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4 f9138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9139c;
    public aw0.v1 d;
    public float e;
    public GradientDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f9141h;
    public final int[] i;

    public a0(View navBarView, g4 g4Var) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        this.f9137a = navBarView;
        this.f9138b = g4Var;
        aw0.t1 t1Var = aw0.v1.Companion;
        Context context = navBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t1Var.getClass();
        this.d = aw0.t1.a(context);
        this.e = 1.0f;
        Context context2 = navBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f9140g = kli.a.s(R$attr.uikit_colorGroupedBackground, context2);
        this.f9141h = h();
        this.i = new int[]{0, 0, 0};
    }

    public final void a() {
        int[] iArr = this.i;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        GradientDrawable gradientDrawable = this.f;
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
            this.f = gradientDrawable;
        }
        View view = this.f9137a;
        gradientDrawable.setBounds(0, 0, view.getWidth(), view.getHeight());
        view.setBackground(gradientDrawable);
    }

    @Override // au0.j2
    public final void b(aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.d == colorScheme) {
            return;
        }
        this.d = colorScheme;
        this.f9138b.b(colorScheme);
        if (this.f9139c) {
            this.f9141h = h();
            a();
            i(this.e);
        }
    }

    @Override // au0.j2
    public final void c(float f, int i) {
        if (this.f9140g != i) {
            this.f9140g = i;
            a();
            i(f);
        }
    }

    @Override // au0.j2
    public final void d() {
        GradientDrawable gradientDrawable = this.f;
        if (gradientDrawable != null) {
            View view = this.f9137a;
            gradientDrawable.setBounds(0, 0, view.getWidth(), view.getHeight());
        }
    }

    @Override // au0.j2
    public final void e(float f, Integer num) {
        this.f9139c = true;
        this.e = f;
        if (num != null) {
            this.f9140g = num.intValue();
        }
        a();
        i(f);
    }

    @Override // au0.j2
    public final void f(float f) {
        this.e = f;
        i(f);
    }

    @Override // au0.j2
    public final void g(Integer num) {
        this.f9139c = false;
        this.f = null;
        if (num != null) {
            this.f9137a.setBackgroundColor(num.intValue());
        }
        g4 g4Var = this.f9138b;
        if (g4Var != null) {
            g4Var.i(1.0f);
        }
        if (g4Var != null) {
            g4Var.reset();
        }
    }

    public final float[] h() {
        int i = z.f9447a[this.d.ordinal()];
        if (i == 1) {
            return new float[]{BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f};
        }
        if (i == 2) {
            return new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void i(float f) {
        GradientDrawable gradientDrawable = this.f;
        if (gradientDrawable == null) {
            return;
        }
        float f4 = 1.0f * f;
        int[] iArr = this.i;
        iArr[0] = 0;
        iArr[1] = io0.a.d(f4 / 2, this.f9140g);
        iArr[2] = io0.a.d(f4, this.f9140g);
        if (Build.VERSION.SDK_INT >= 29) {
            gradientDrawable.setColors(iArr, this.f9141h);
        } else {
            gradientDrawable.setColors(iArr);
        }
        this.f9138b.i((f * 0.4f) + 0.6f);
    }

    @Override // au0.j2
    public final boolean isActive() {
        return this.f9139c;
    }

    @Override // au0.j2
    public final void onAttachedToWindow() {
        if (this.f9139c) {
            a();
        }
    }

    @Override // au0.j2
    public final void onDetachedFromWindow() {
        g(null);
    }
}
