package rp0;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.views.status.StatusView;
import kli.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    @NotNull
    public static final n1 Companion = new n1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f256165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatusView f256166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ix0.b2 f256167c;
    public final int d;
    public final int e;
    public final f0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fu0.a f256168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o1 f256169h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Parcelable f256170j;
    public final rlh.d0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q1 f256171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q1 f256172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f256173n;
    public final Object o;

    public s1(ViewGroup parentView, StatusView statusView, ix0.b2 b2Var) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        this.f256165a = parentView;
        this.f256166b = statusView;
        this.f256167c = b2Var;
        this.d = kli.a.k(i(), 32.0f);
        this.e = kli.a.k(i(), 24.0f);
        this.f = new f0(i());
        this.f256168g = new fu0.a(this, 4);
        this.f256169h = o1.HIDDEN;
        this.i = true;
        this.k = new rlh.d0(this, 17);
        this.f256171l = new q1(this, 1);
        final int i = 0;
        this.f256172m = new q1(this, 0);
        this.f256173n = te0.w.y0(new Function0(this) { // from class: rp0.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s1 f256129b;

            {
                this.f256129b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.f256129b.i());
                        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        lottieAnimationView.setVisibility(8);
                        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        lottieAnimationView.addAnimatorListener(new aq0.k(lottieAnimationView, 12));
                        return lottieAnimationView;
                    default:
                        s1 s1Var = this.f256129b;
                        UIKitFrameLayout uIKitFrameLayout = new UIKitFrameLayout(s1Var.i(), null, 6, 0);
                        uIKitFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        uIKitFrameLayout.setClickable(true);
                        uIKitFrameLayout.setClipToPadding(false);
                        uIKitFrameLayout.setBackgroundColor(ColorUtils.setAlphaComponent(-16777216, 102));
                        uIKitFrameLayout.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        uIKitFrameLayout.addView(s1Var.f256166b);
                        uIKitFrameLayout.addView(s1Var.h());
                        uIKitFrameLayout.setReadableAreaGuidelinesEnabled(true);
                        uIKitFrameLayout.setOnClickListener(new c9(s1Var, 14));
                        return uIKitFrameLayout;
                }
            }
        });
        final int i2 = 1;
        this.o = te0.w.y0(new Function0(this) { // from class: rp0.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s1 f256129b;

            {
                this.f256129b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.f256129b.i());
                        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        lottieAnimationView.setVisibility(8);
                        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        lottieAnimationView.addAnimatorListener(new aq0.k(lottieAnimationView, 12));
                        return lottieAnimationView;
                    default:
                        s1 s1Var = this.f256129b;
                        UIKitFrameLayout uIKitFrameLayout = new UIKitFrameLayout(s1Var.i(), null, 6, 0);
                        uIKitFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        uIKitFrameLayout.setClickable(true);
                        uIKitFrameLayout.setClipToPadding(false);
                        uIKitFrameLayout.setBackgroundColor(ColorUtils.setAlphaComponent(-16777216, 102));
                        uIKitFrameLayout.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        uIKitFrameLayout.addView(s1Var.f256166b);
                        uIKitFrameLayout.addView(s1Var.h());
                        uIKitFrameLayout.setReadableAreaGuidelinesEnabled(true);
                        uIKitFrameLayout.setOnClickListener(new c9(s1Var, 14));
                        return uIKitFrameLayout;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int iD = rr0.q.d(i(), rr0.o.STATUS_SHEET);
        layoutParams.leftMargin = iD;
        layoutParams.rightMargin = iD;
        layoutParams.bottomMargin = iD;
        if (b2Var == null) {
            layoutParams.gravity = 80;
        }
        statusView.setLayoutParams(layoutParams);
    }

    public static final void a(s1 s1Var, int i) {
        ViewGroup.LayoutParams layoutParams = s1Var.f256166b.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = i;
        }
    }

    public final void b(int i) {
        float f = i;
        StatusView statusView = this.f256166b;
        statusView.setTranslationY(f - this.d);
        statusView.animate().setInterpolator(new OvershootInterpolator()).setDuration(500L).translationY(f);
        LinearLayout titleContainer = statusView.getTitleContainer();
        titleContainer.setScaleX(0.1f);
        titleContainer.setScaleY(0.1f);
        titleContainer.animate().setInterpolator(new OvershootInterpolator()).setDuration(500L).scaleX(1.0f).scaleY(1.0f);
    }

    public final void c() {
        Window window;
        View decorView;
        b.a aVar = kli.b.Companion;
        ViewGroup viewGroupJ = j();
        aVar.getClass();
        kli.b bVarA = b.a.a(viewGroupJ);
        if (bVarA != null) {
            bVarA.b(this);
        }
        Activity activityG = g();
        if (activityG != null && (window = activityG.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            or0.u.q(decorView, this.k);
        }
        this.f.a();
        this.f256165a.removeView(j());
        this.f256168g.remove();
        jh.d.f(i()).n0().h(this.f256166b);
    }

    public final void d(boolean z) {
        this.f.a();
        if (z) {
            o1 o1Var = this.f256169h;
            if (o1Var == o1.SHOWN || o1Var == o1.ANIMATING_SHOW) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = j().animate();
                viewPropertyAnimatorAnimate.alpha(BitmapDescriptorFactory.HUE_RED);
                viewPropertyAnimatorAnimate.setListener(this.f256172m);
                ix0.b2 b2Var = this.f256167c;
                viewPropertyAnimatorAnimate.setDuration(b2Var != null ? 150L : 300L);
                if (b2Var != null) {
                    StatusView statusView = this.f256166b;
                    ViewPropertyAnimator interpolator = statusView.getTitleContainer().animate().setDuration(150L).setInterpolator(null);
                    float f = this.e;
                    interpolator.translationY(f).scaleX(0.75f).scaleY(0.75f);
                    statusView.animate().setDuration(150L).setInterpolator(null).translationY(statusView.getTranslationY() - f);
                }
                k(o1.ANIMATING_HIDE);
            }
        } else {
            c();
            k(o1.HIDDEN);
        }
        this.f256170j = null;
    }

    public final boolean e(int i) {
        return j().getPaddingBottom() + (this.f256166b.getHeight() + i) <= j().getHeight();
    }

    public final boolean f(int i) {
        return (i - this.d) - j().getPaddingTop() >= 0;
    }

    public final Activity g() {
        Context context = this.f256166b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.m(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LottieAnimationView h() {
        return (LottieAnimationView) this.f256173n.getValue();
    }

    public final Context i() {
        Context context = this.f256166b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ViewGroup j() {
        return (ViewGroup) this.o.getValue();
    }

    public final void k(o1 o1Var) {
        this.f256169h = o1Var;
        int i = p1.f256152a[o1Var.ordinal()];
        boolean z = true;
        if (i == 1 || i == 2) {
            z = false;
        } else if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this.f256168g.setEnabled(z);
    }
}
