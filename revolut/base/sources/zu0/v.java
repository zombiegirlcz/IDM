package zu0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOverlay;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import es0.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f325215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f325216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f325217c;
    public final GradientDrawable d;
    public View e;
    public ValueAnimator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f325218g;

    public v(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f325215a = context;
        this.f325216b = new n(this);
        this.f325217c = p.f325209a;
        GradientDrawable gradientDrawableH = dr0.l.h(context, 20.0f, jh.d.g(context) ? new Color.Solid(R$attr.uikit_colorGreyTone5) : kli.a.q(context) ? new Color.SolidRes(R$color.internal_greyTone5_mono) : new Color.SolidRes(R$color.internal_greyTone5_mono_light), 0, null);
        gradientDrawableH.setAlpha(0);
        this.d = gradientDrawableH;
        this.f325218g = kli.a.k(context, 4.0f);
    }

    public final void a(int i) {
        b();
        GradientDrawable gradientDrawable = this.d;
        if (gradientDrawable.getAlpha() == i) {
            c(i);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(gradientDrawable.getAlpha(), i);
        valueAnimatorOfInt.setDuration(150L);
        valueAnimatorOfInt.setInterpolator(jq0.r.f177394c);
        valueAnimatorOfInt.addUpdateListener(new w5(this, 24));
        valueAnimatorOfInt.addListener(new z(this, i, 3));
        valueAnimatorOfInt.start();
        this.f = valueAnimatorOfInt;
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f = null;
    }

    public final void c(int i) {
        u uVar = this.f325217c;
        if (uVar instanceof s) {
            if (i == 255) {
                d(t.f325214a);
            }
        } else if (uVar instanceof r) {
            if (i == 0) {
                d(p.f325209a);
            }
        } else if (!(uVar instanceof p) && !(uVar instanceof t) && !(uVar instanceof q)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void d(u uVar) {
        View view;
        ViewOverlay overlay;
        ViewOverlay overlay2;
        if (Intrinsics.f(this.f325217c, uVar)) {
            return;
        }
        u uVar2 = this.f325217c;
        this.f325217c = uVar;
        boolean z = uVar instanceof p;
        GradientDrawable gradientDrawable = this.d;
        if (z) {
            b();
            View view2 = this.e;
            if (view2 != null && (overlay2 = view2.getOverlay()) != null) {
                overlay2.remove(gradientDrawable);
            }
            gradientDrawable.setAlpha(0);
            return;
        }
        if (uVar instanceof s) {
            if (Intrinsics.f(uVar2, p.f325209a) && (view = this.e) != null && (overlay = view.getOverlay()) != null) {
                overlay.add(gradientDrawable);
            }
            a(255);
            return;
        }
        if (uVar instanceof t) {
            return;
        }
        if (uVar instanceof r) {
            a(0);
        } else {
            if (!(uVar instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            b();
        }
    }

    public final void e() {
        View view = this.e;
        if (view == null) {
            return;
        }
        int width = view.getWidth();
        int i = this.f325218g;
        int i2 = width - i;
        if (i2 < i) {
            i2 = i;
        }
        int height = view.getHeight() - i;
        if (height < i) {
            height = i;
        }
        this.d.setBounds(i, i, i2, height);
        u uVar = this.f325217c;
        if ((uVar instanceof p) || (uVar instanceof q) || (uVar instanceof r)) {
            d(s.f325213a);
        } else if (!(uVar instanceof s) && !(uVar instanceof t)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
