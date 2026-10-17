package ix0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import au0.z4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class t1 {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f169311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f169312b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f169313c;
    public z4 d;
    public z4 e;

    public static final class a {
        private a() {
        }
    }

    public static void e(View view, float f) {
        view.setAlpha(f);
        view.setVisibility(f > BitmapDescriptorFactory.HUE_RED ? 0 : 4);
    }

    public static void f(t1 t1Var, float f, int i, float f4, boolean z) {
        t1Var.f169312b = f;
        t1Var.f169313c = i;
        if (!z) {
            z4 z4Var = t1Var.e;
            if (z4Var == null) {
                Intrinsics.r("bottomShadowHolder");
                throw null;
            }
            View viewB = z4Var.b();
            if (viewB != null) {
                viewB.setVisibility(8);
            }
            z4 z4Var2 = t1Var.d;
            if (z4Var2 == null) {
                Intrinsics.r("toolbarShadowHolder");
                throw null;
            }
            View viewB2 = z4Var2.b();
            if (viewB2 != null) {
                viewB2.setVisibility(8);
                return;
            }
            return;
        }
        z4 z4Var3 = t1Var.d;
        if (z4Var3 == null) {
            Intrinsics.r("toolbarShadowHolder");
            throw null;
        }
        View viewB3 = z4Var3.b();
        if (viewB3 != null) {
            viewB3.setTranslationY(t1Var.c());
        }
        z4 z4Var4 = t1Var.e;
        if (z4Var4 == null) {
            Intrinsics.r("bottomShadowHolder");
            throw null;
        }
        View viewB4 = z4Var4.b();
        if (!t1Var.d()) {
            if (viewB4 != null) {
                viewB4.setVisibility(8);
            }
            if (viewB3 != null) {
                e(viewB3, t1Var.a(t1Var.f169312b) * f4);
                return;
            }
            return;
        }
        if (viewB4 != null) {
            viewB4.setTranslationY(t1Var.b(t1Var.f169313c));
        }
        float f5 = t1Var.f169312b;
        if (f5 > 0.1f) {
            if (viewB3 != null) {
                e(viewB3, t1Var.a(f5) * f4);
            }
        } else if (viewB3 != null) {
            e(viewB3, (f5 / 0.1f) * f4);
        }
        if (viewB4 != null) {
            viewB4.setVisibility(0);
        }
        float f6 = t1Var.f169312b;
        float f32 = BitmapDescriptorFactory.HUE_RED;
        boolean z3 = f6 == BitmapDescriptorFactory.HUE_RED;
        if (Boolean.valueOf(z3).equals(t1Var.f169311a)) {
            return;
        }
        z4 z4Var5 = t1Var.e;
        if (z4Var5 == null) {
            Intrinsics.r("bottomShadowHolder");
            throw null;
        }
        View viewB5 = z4Var5.b();
        if (viewB5 == null) {
            return;
        }
        if (t1Var.f169311a == null) {
            if (z3) {
                f32 = 1.0f;
            }
            viewB5.setAlpha(f32);
        } else {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = viewB5.animate();
            if (z3) {
                f32 = 1.0f;
            }
            viewPropertyAnimatorAnimate.alpha(f32).setDuration(200L);
        }
        t1Var.f169311a = Boolean.valueOf(z3);
    }

    public abstract float a(float f);

    public abstract int b(int i);

    public abstract int c();

    public abstract boolean d();
}
