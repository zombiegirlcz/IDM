package yx0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.pincode.DynamicDotsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f317519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f317520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatorSet f317521c;
    public final AnimatorSet d;

    public b(DynamicDotsView dotsView, TextView hintView) {
        Intrinsics.checkNotNullParameter(dotsView, "dotsView");
        Intrinsics.checkNotNullParameter(hintView, "hintView");
        this.f317519a = dotsView;
        this.f317520b = hintView;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
        Context context = dotsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fK = kli.a.k(context, 32.0f);
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(hintView, (Property<TextView, Float>) property, fK, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setInterpolator(overshootInterpolator);
        objectAnimatorOfFloat.setDuration(200L);
        float f = -fK;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(dotsView, (Property<DynamicDotsView, Float>) property, BitmapDescriptorFactory.HUE_RED, f);
        objectAnimatorOfFloat2.setInterpolator(overshootInterpolator);
        objectAnimatorOfFloat2.setDuration(200L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(hintView, (Property<TextView, Float>) property, BitmapDescriptorFactory.HUE_RED, fK);
        objectAnimatorOfFloat3.setInterpolator(accelerateDecelerateInterpolator);
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setStartDelay(2000L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(dotsView, (Property<DynamicDotsView, Float>) property, f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat4.setInterpolator(accelerateDecelerateInterpolator);
        objectAnimatorOfFloat4.setDuration(200L);
        objectAnimatorOfFloat4.setStartDelay(2000L);
        Property property2 = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(dotsView, (Property<DynamicDotsView, Float>) property2, BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat5.setInterpolator(accelerateDecelerateInterpolator);
        objectAnimatorOfFloat5.setDuration(200L);
        objectAnimatorOfFloat5.setStartDelay(2000L);
        objectAnimatorOfFloat5.addListener(new a(this, 0));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(hintView, (Property<TextView, Float>) property2, BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat6.setInterpolator(accelerateDecelerateInterpolator);
        objectAnimatorOfFloat6.setDuration(200L);
        objectAnimatorOfFloat6.addListener(new a(this, 1));
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(hintView, (Property<TextView, Float>) property2, 1.0f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat7.setInterpolator(accelerateDecelerateInterpolator);
        objectAnimatorOfFloat7.setDuration(200L);
        objectAnimatorOfFloat7.setStartDelay(2000L);
        objectAnimatorOfFloat7.addListener(new a(this, 2));
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(dotsView, (Property<DynamicDotsView, Float>) property2, 1.0f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat8.setInterpolator(accelerateDecelerateInterpolator);
        objectAnimatorOfFloat8.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat6);
        this.f317521c = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat6);
        animatorSet2.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat8);
        animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat7);
        animatorSet2.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5);
        this.d = animatorSet2;
    }

    public final void a(boolean z) {
        AnimatorSet animatorSet = this.f317521c;
        if (animatorSet == null) {
            Intrinsics.r("showAnimator");
            throw null;
        }
        if (animatorSet.isStarted()) {
            AnimatorSet animatorSet2 = this.f317521c;
            if (animatorSet2 == null) {
                Intrinsics.r("showAnimator");
                throw null;
            }
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.d;
        if (animatorSet3 == null) {
            Intrinsics.r("showAndHideAnimator");
            throw null;
        }
        if (animatorSet3.isStarted()) {
            AnimatorSet animatorSet4 = this.d;
            if (animatorSet4 == null) {
                Intrinsics.r("showAndHideAnimator");
                throw null;
            }
            animatorSet4.cancel();
        }
        this.f317520b.setVisibility(8);
        if (z) {
            View view = this.f317519a;
            view.setVisibility(0);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setAlpha(1.0f);
        }
    }
}
