package jq0;

import android.R;
import android.animation.StateListAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import ix0.e1;
import jq0.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends StateListAnimator {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f177378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es.e f177379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177380c;
    public final float d;
    public final long e;
    public final FastOutSlowInInterpolator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f177381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f177382h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f177383j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f177384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f177385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f177386n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SpringForce f177387p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SpringForce f177388q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SpringAnimation f177389r;

    public p(View view, es.e pressedScaleProvider, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(pressedScaleProvider, "pressedScaleProvider");
        this.f177378a = view;
        this.f177379b = pressedScaleProvider;
        this.f177380c = z;
        this.d = 1.0f;
        this.e = 200L;
        this.f = new FastOutSlowInInterpolator();
        this.f177381g = new c(view);
        this.k = 1.0f;
        this.f177384l = 1.0f;
        this.f177386n = new Handler(Looper.getMainLooper());
        this.o = new j(this, 0);
        SpringForce springForce = new SpringForce(1.0f);
        springForce.setStiffness(420.0f);
        springForce.setDampingRatio(a.b.a(25.0f, 420.0f));
        this.f177387p = springForce;
        SpringForce springForce2 = new SpringForce(1.0f);
        springForce2.setStiffness(260.0f);
        springForce2.setDampingRatio(a.b.a(20.0f, 260.0f));
        this.f177388q = springForce2;
        SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(1.0f));
        springAnimation.setMinimumVisibleChange(0.001f);
        springAnimation.addUpdateListener(new k(this, 0));
        springAnimation.addEndListener(new l(this, 0));
        this.f177389r = springAnimation;
        o oVar = new o(this, 0);
        o oVar2 = new o(this, 1);
        addState(new int[]{R.attr.state_pressed}, oVar);
        addState(new int[0], oVar2);
    }

    public final void a() {
        if (!this.f177380c) {
            this.f177381g.i();
        }
        jb3.l.s(this.f177378a).a(e1.SCALE_ANIMATION, false);
    }

    public final void b() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f177378a.animate();
        float f = this.d;
        viewPropertyAnimatorAnimate.scaleX(f).scaleY(f).setDuration(this.e).setInterpolator(this.f).withEndAction(new j(this, 3)).start();
    }
}
