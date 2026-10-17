package yt0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.modal.ModalTopSpacerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.aa;
import org.jetbrains.annotations.NotNull;
import yna.j1;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements aa {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.o f316590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f316591b;

    public r(com.revolut.core.ui_kit.views.o view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f316590a = view;
        this.f316591b = new AccelerateDecelerateInterpolator();
    }

    @Override // mx0.aa
    public final void a(lki.s onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f316590a, (Property<com.revolut.core.ui_kit.views.o, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        m(objectAnimatorOfFloat, 300L, onTransitionEnd);
    }

    @Override // mx0.aa
    public final void b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f316590a, (Property<com.revolut.core.ui_kit.views.o, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        m(objectAnimatorOfFloat, 0L, new j1(21));
    }

    @Override // mx0.aa
    public final void e() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f316590a, (Property<com.revolut.core.ui_kit.views.o, Float>) View.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        m(objectAnimatorOfFloat, 0L, new j1(21));
    }

    @Override // mx0.aa
    public final void init() {
        com.revolut.core.ui_kit.views.o oVar = this.f316590a;
        View knobContainer$ui_kit_components_release = oVar.getKnobContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(knobContainer$ui_kit_components_release, "<get-knobContainer>(...)");
        knobContainer$ui_kit_components_release.setVisibility(8);
        ModalTopSpacerView topPaddingSpace$ui_kit_components_release = oVar.getTopPaddingSpace$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(topPaddingSpace$ui_kit_components_release, "<get-topPaddingSpace>(...)");
        topPaddingSpace$ui_kit_components_release.setVisibility(8);
    }

    @Override // mx0.aa
    public final void k() {
    }

    @Override // mx0.aa
    public final void l(mhd.b onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f316590a, (Property<com.revolut.core.ui_kit.views.o, Float>) View.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        m(objectAnimatorOfFloat, 300L, onTransitionEnd);
    }

    public final void m(Animator animator, long j2, Function0 function0) {
        animator.setDuration(j2);
        animator.setInterpolator(this.f316591b);
        animator.addListener(new q(0, function0));
        animator.start();
    }

    @Override // mx0.aa
    public final void reset() {
        this.f316590a.getFrame$ui_kit_components_release().setAlpha(1.0f);
    }
}
