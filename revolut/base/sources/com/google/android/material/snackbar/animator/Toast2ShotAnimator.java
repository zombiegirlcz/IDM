package com.google.android.material.snackbar.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import jq0.r;
import kli.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016J,\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/google/android/material/snackbar/animator/Toast2ShotAnimator;", "Lcom/google/android/material/snackbar/animator/ShotAnimator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "overshootOffsetY", "", "currentAnimation", "Landroid/animation/Animator;", "currentSpringAnimations", "", "Landroidx/dynamicanimation/animation/SpringAnimation;", "animateIn", "", "view", "Landroid/view/View;", "onAnimationEnd", "Lkotlin/Function0;", "animateOut", "event", "", "Lkotlin/Function1;", "createScaleSpring", "property", "Landroidx/dynamicanimation/animation/DynamicAnimation$ViewProperty;", "cancel", "cancelAnimations", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Toast2ShotAnimator implements ShotAnimator {
    private static final long EXIT_DURATION_MS = 250;
    private static final long EXIT_SCALE_DELAY_MS = 50;
    private static final float INITIAL_SCALE = 0.3f;
    private static final long OPACITY_DURATION_MS = 100;
    private static final long OPACITY_ENTRY_DELAY_MS = 20;
    private static final long OPACITY_EXIT_DELAY_MS = 100;
    private static final float SCALE_SPRING_DAMPING_RATIO = 0.69f;
    private static final float SCALE_SPRING_STIFFNESS = 210.0f;
    private static final long SETTLE_DURATION_MS = 100;
    private static final long SLIDE_DURATION_MS = 200;
    private Animator currentAnimation;

    @NotNull
    private List<SpringAnimation> currentSpringAnimations;
    private final float overshootOffsetY;

    public Toast2ShotAnimator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.overshootOffsetY = a.l(context, -16.0f);
        this.currentSpringAnimations = f0.f322471a;
    }

    private final void cancelAnimations() {
        Animator animator = this.currentAnimation;
        if (animator != null) {
            animator.cancel();
        }
        this.currentAnimation = null;
        Iterator<T> it8 = this.currentSpringAnimations.iterator();
        while (it8.hasNext()) {
            ((SpringAnimation) it8.next()).cancel();
        }
        this.currentSpringAnimations = f0.f322471a;
    }

    private final SpringAnimation createScaleSpring(View view, DynamicAnimation.ViewProperty property) {
        SpringAnimation springAnimation = new SpringAnimation(view, property, 1.0f);
        SpringForce springForce = new SpringForce(1.0f);
        springForce.setStiffness(210.0f);
        springForce.setDampingRatio(SCALE_SPRING_DAMPING_RATIO);
        springAnimation.setSpring(springForce);
        springAnimation.setStartValue(INITIAL_SCALE);
        return springAnimation;
    }

    @Override // com.google.android.material.snackbar.animator.ShotAnimator
    public void animateIn(@NotNull View view, @NotNull final Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        cancelAnimations();
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(getTranslationYBottom(view));
        view.setScaleX(INITIAL_SCALE);
        view.setScaleY(INITIAL_SCALE);
        DynamicAnimation.ViewProperty SCALE_X = DynamicAnimation.SCALE_X;
        Intrinsics.checkNotNullExpressionValue(SCALE_X, "SCALE_X");
        SpringAnimation springAnimationCreateScaleSpring = createScaleSpring(view, SCALE_X);
        DynamicAnimation.ViewProperty SCALE_Y = DynamicAnimation.SCALE_Y;
        Intrinsics.checkNotNullExpressionValue(SCALE_Y, "SCALE_Y");
        SpringAnimation springAnimationCreateScaleSpring2 = createScaleSpring(view, SCALE_Y);
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, getTranslationYBottom(view), this.overshootOffsetY);
        objectAnimatorOfFloat.setDuration(200L);
        Interpolator interpolator = r.f177392a;
        objectAnimatorOfFloat.setInterpolator(r.f177393b);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, this.overshootOffsetY, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setInterpolator(r.f177392a);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat3.setDuration(100L);
        objectAnimatorOfFloat3.setStartDelay(20L);
        objectAnimatorOfFloat3.setInterpolator(r.f177394c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.currentSpringAnimations = v.k(springAnimationCreateScaleSpring, springAnimationCreateScaleSpring2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat3, animatorSet);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.animator.Toast2ShotAnimator$animateIn$1$1
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.cancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.cancelled) {
                    return;
                }
                onAnimationEnd.invoke();
            }
        });
        animatorSet2.start();
        this.currentAnimation = animatorSet2;
        Iterator<T> it8 = this.currentSpringAnimations.iterator();
        while (it8.hasNext()) {
            ((SpringAnimation) it8.next()).start();
        }
    }

    @Override // com.google.android.material.snackbar.animator.ShotAnimator
    public void animateOut(@NotNull View view, final int event, @NotNull final Function1<? super Integer, Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        cancelAnimations();
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float translationY = view.getTranslationY();
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, translationY, this.overshootOffsetY);
        objectAnimatorOfFloat.setDuration(100L);
        Interpolator interpolator = r.f177392a;
        Interpolator interpolator2 = r.f177392a;
        objectAnimatorOfFloat.setInterpolator(interpolator2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, this.overshootOffsetY, getTranslationYBottom(view));
        objectAnimatorOfFloat2.setDuration(EXIT_DURATION_MS);
        objectAnimatorOfFloat2.setInterpolator(interpolator2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, scaleX, INITIAL_SCALE);
        objectAnimatorOfFloat3.setDuration(EXIT_DURATION_MS);
        objectAnimatorOfFloat3.setInterpolator(interpolator2);
        Unit unit = Unit.f186387a;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, scaleY, INITIAL_SCALE);
        objectAnimatorOfFloat4.setDuration(EXIT_DURATION_MS);
        objectAnimatorOfFloat4.setInterpolator(interpolator2);
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet2.setStartDelay(50L);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat5.setDuration(100L);
        objectAnimatorOfFloat5.setStartDelay(100L);
        objectAnimatorOfFloat5.setInterpolator(r.f177394c);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(animatorSet, animatorSet2, objectAnimatorOfFloat5);
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.animator.Toast2ShotAnimator$animateOut$1$1
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.cancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.cancelled) {
                    return;
                }
                this.this$0.currentAnimation = null;
                onAnimationEnd.invoke(Integer.valueOf(event));
            }
        });
        animatorSet3.start();
        this.currentAnimation = animatorSet3;
    }

    @Override // com.google.android.material.snackbar.animator.ShotAnimator
    public void cancel() {
        cancelAnimations();
    }

    @Override // com.google.android.material.snackbar.animator.ShotAnimator
    public /* bridge */ float getTranslationYBottom(@NotNull View view) {
        return super.getTranslationYBottom(view);
    }
}
