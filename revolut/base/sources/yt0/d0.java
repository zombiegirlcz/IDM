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
public final class d0 implements aa {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.o f316530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f316531b;

    public d0(com.revolut.core.ui_kit.views.o view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f316530a = view;
        this.f316531b = new AccelerateDecelerateInterpolator();
    }

    @Override // mx0.aa
    public final void a(lki.s onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        com.revolut.core.ui_kit.views.o oVar = this.f316530a;
        if (!oVar.isLaidOut() || oVar.isLayoutRequested()) {
            oVar.addOnLayoutChangeListener(new bx0.v(this, onTransitionEnd, 17));
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(oVar, (Property<com.revolut.core.ui_kit.views.o, Float>) View.TRANSLATION_Y, oVar.getHeight(), BitmapDescriptorFactory.HUE_RED);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        m(objectAnimatorOfFloat, 300L, onTransitionEnd);
    }

    @Override // mx0.aa
    public final void b() {
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f316530a, (Property<com.revolut.core.ui_kit.views.o, Float>) property, r1.getHeight(), BitmapDescriptorFactory.HUE_RED);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        m(objectAnimatorOfFloat, 0L, new j1(22));
    }

    @Override // mx0.aa
    public final void e() {
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f316530a, (Property<com.revolut.core.ui_kit.views.o, Float>) property, BitmapDescriptorFactory.HUE_RED, r1.getHeight());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        m(objectAnimatorOfFloat, 0L, new j1(22));
    }

    @Override // mx0.aa
    public final void init() {
        com.revolut.core.ui_kit.views.o oVar = this.f316530a;
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
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f316530a, (Property<com.revolut.core.ui_kit.views.o, Float>) property, BitmapDescriptorFactory.HUE_RED, r1.getHeight());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        m(objectAnimatorOfFloat, 300L, onTransitionEnd);
    }

    public final void m(Animator animator, long j2, Function0 function0) {
        animator.setDuration(j2);
        animator.setInterpolator(this.f316531b);
        animator.addListener(new q(1, function0));
        animator.start();
    }

    @Override // mx0.aa
    public final void reset() {
        this.f316530a.getFrame$ui_kit_components_release().setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }
}
