package iv0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import au0.b5;
import au0.l5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends o {

    @NotNull
    public static final h Companion = new h();
    public final View d;
    public final ir0.g e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f168681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AnimatorSet f168682h;
    public final ValueAnimator i;

    public j(View hostView, ir0.g glowableElement, l chartAppearingAnimationListener, Function0 appearanceGlowEnabled) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(glowableElement, "glowableElement");
        Intrinsics.checkNotNullParameter(chartAppearingAnimationListener, "chartAppearingAnimationListener");
        Intrinsics.checkNotNullParameter(appearanceGlowEnabled, "appearanceGlowEnabled");
        this.d = hostView;
        this.e = glowableElement;
        this.f = chartAppearingAnimationListener;
        this.f168681g = appearanceGlowEnabled;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.i = valueAnimator;
        glowableElement.i(false);
        valueAnimator.setDuration(1000L);
        valueAnimator.setInterpolator(jq0.r.e);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimator.addUpdateListener(new b5(this, 19));
        valueAnimator.addListener(new l5(this, 9));
    }

    @Override // iv0.o
    public final View c() {
        return this.d;
    }

    @Override // iv0.o
    public final void f() {
        AnimatorSet animatorSet = this.f168682h;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    @Override // iv0.o
    public final void h(uw0.i animationRequest, View managerHost) {
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        Intrinsics.checkNotNullParameter(managerHost, "managerHost");
        Context context = this.d.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!jq0.a.a(context)) {
            AnimatorSet animatorSet = this.f168682h;
            if (animatorSet != null) {
                animatorSet.end();
                return;
            }
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f168681g.invoke()).booleanValue();
        ir0.g gVar = this.e;
        boolean z = zBooleanValue && gVar.m();
        AnimatorSet animatorSet2 = this.f168682h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator[] elements = {this.i, z ? gVar.u() : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        animatorSet3.playSequentially(kotlin.collections.d.L(elements));
        animatorSet3.addListener(new i(this, animationRequest, managerHost, z));
        animatorSet3.addListener(new byl.i(this, 4, animationRequest, managerHost));
        animatorSet3.start();
        this.f168682h = animatorSet3;
    }
}
