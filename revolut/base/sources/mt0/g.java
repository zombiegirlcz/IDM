package mt0;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShadowLayout f208693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f208694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f208695c;
    public final FloatingBottomBarDrawable d;
    public final Object e;
    public final ks0.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AnimatorSet f208696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f208697h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function0 f208698j;

    public g(ShadowLayout container, View collapsedContent, View expandedContent, FloatingBottomBarDrawable floatingBottomBarDrawable) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(collapsedContent, "collapsedContent");
        Intrinsics.checkNotNullParameter(expandedContent, "expandedContent");
        this.f208693a = container;
        this.f208694b = collapsedContent;
        this.f208695c = expandedContent;
        this.d = floatingBottomBarDrawable;
        this.e = new Object();
        ks0.l.Companion.getClass();
        this.f = ks0.j.a(container);
        this.f208698j = new mq4.b(15);
    }

    public final void a(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        valueAnimator.addUpdateListener(new androidx.core.view.j(animatorUpdateListener, this, 18));
    }

    public final int b(boolean z) {
        View view = z ? this.f208694b : this.f208695c;
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f208693a.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public final void c() {
        Float fValueOf = Float.valueOf(1.0f);
        View view = this.f208694b;
        view.setVisibility(0);
        this.f208695c.setVisibility(8);
        ShadowLayout shadowLayout = this.f208693a;
        ViewGroup.LayoutParams layoutParams = shadowLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        layoutParams.width = -1;
        shadowLayout.setLayoutParams(layoutParams);
        ks0.l.d(this.f, this.e, null, fValueOf, fValueOf, 6);
        Intrinsics.checkNotNullParameter(shadowLayout, "<this>");
        shadowLayout.resetPivot();
        Context context = shadowLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e(kli.a.z(this.f208697h / 2, context));
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.f208698j.invoke();
    }

    public final void d() {
        Float fValueOf = Float.valueOf(1.0f);
        View view = this.f208694b;
        view.setVisibility(8);
        View view2 = this.f208695c;
        view2.setVisibility(0);
        ShadowLayout shadowLayout = this.f208693a;
        ViewGroup.LayoutParams layoutParams = shadowLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        layoutParams.width = -1;
        shadowLayout.setLayoutParams(layoutParams);
        ks0.l.d(this.f, this.e, null, fValueOf, fValueOf, 6);
        Intrinsics.checkNotNullParameter(shadowLayout, "<this>");
        shadowLayout.resetPivot();
        e(28.0f);
        view2.setAlpha(1.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.f208698j.invoke();
    }

    public final void e(float f) {
        ShadowLayout shadowLayout = this.f208693a;
        shadowLayout.setCornersRadius(f);
        FloatingBottomBarDrawable floatingBottomBarDrawable = this.d;
        if (floatingBottomBarDrawable != null) {
            Context context = shadowLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            floatingBottomBarDrawable.f(kli.a.l(context, f));
        }
    }
}
