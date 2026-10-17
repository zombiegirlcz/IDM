package jji;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends lki.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f174971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f174972h;
    public final int i;

    public l(int i, int i2, int i3) {
        this.f174971g = i;
        this.f174972h = i2;
        this.i = i3;
    }

    @Override // lki.b
    public final Animator a(View view, View to6, boolean z) {
        NavBarLargeCentred navBarLargeCentred;
        View viewFindViewById;
        View viewFindViewById2;
        Animator animator;
        AnimatorSet animatorSet;
        Animator animatorA = new k(lki.u.END_TO_START).a(view, to6, z);
        if (to6 == null || z || !to6.isHardwareAccelerated()) {
            return animatorA;
        }
        Intrinsics.checkNotNullParameter(to6, "to");
        AnimatorSet animatorSet2 = new AnimatorSet();
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED, -view.getWidth());
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.setInterpolator(jq0.r.f177392a);
            animatorSet2.play(objectAnimatorOfFloat);
            animatorSet2.addListener(new cx0.b(view, 4));
        }
        if (!(to6 instanceof ViewGroup) || (navBarLargeCentred = (NavBarLargeCentred) to6.findViewById(this.f174971g)) == null || (viewFindViewById = to6.findViewById(this.i)) == null || (viewFindViewById2 = to6.findViewById(this.f174972h)) == null) {
            animator = animatorA;
            animatorSet = null;
        } else {
            ViewGroup viewGroup = (ViewGroup) to6;
            View[] elements = {navBarLargeCentred, viewFindViewById, viewFindViewById2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
            Interpolator interpolator = jq0.r.f177392a;
            Interpolator interpolator2 = interpolator;
            objectAnimatorOfFloat2.setInterpolator(interpolator2);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setStartDelay(0L);
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "apply(...)");
            Animator topLabelEndImageAlphaAnimator$ui_kit_components_release = navBarLargeCentred.getTopLabelEndImageAlphaAnimator$ui_kit_components_release();
            if (topLabelEndImageAlphaAnimator$ui_kit_components_release != null) {
                topLabelEndImageAlphaAnimator$ui_kit_components_release.setDuration(700L);
                topLabelEndImageAlphaAnimator$ui_kit_components_release.setStartDelay(3200L);
                topLabelEndImageAlphaAnimator$ui_kit_components_release.setInterpolator(interpolator2);
            } else {
                topLabelEndImageAlphaAnimator$ui_kit_components_release = null;
            }
            navBarLargeCentred.setHeaderSubtitleAlpha$ui_kit_components_release(BitmapDescriptorFactory.HUE_RED);
            Animator subtitleAlphaAnimator$ui_kit_components_release = navBarLargeCentred.getSubtitleAlphaAnimator$ui_kit_components_release();
            subtitleAlphaAnimator$ui_kit_components_release.setDuration(700L);
            subtitleAlphaAnimator$ui_kit_components_release.setStartDelay(3200L);
            subtitleAlphaAnimator$ui_kit_components_release.setInterpolator(interpolator2);
            Animator contentRevealAnimator$ui_kit_components_release = navBarLargeCentred.getContentRevealAnimator$ui_kit_components_release();
            contentRevealAnimator$ui_kit_components_release.setStartDelay(300L);
            float height = viewGroup.getHeight();
            int height2 = viewFindViewById.getHeight();
            int height3 = viewFindViewById2.getHeight();
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 24.0f);
            int[] iArr = new int[2];
            viewFindViewById.getLocationOnScreen(iArr);
            int i = iArr[1];
            animator = animatorA;
            viewFindViewById2.getLocationOnScreen(new int[2]);
            float f = (height - i) + height2 + iK;
            float f4 = (height - r4[1]) + height3;
            viewFindViewById.setTranslationY(f);
            viewFindViewById2.setTranslationY(f4);
            ObjectAnimator objectAnimatorA = hx0.w.a(viewFindViewById, f, jq0.r.f177394c);
            ObjectAnimator objectAnimatorA2 = hx0.w.a(viewFindViewById2, f4, interpolator);
            animatorSet = new AnimatorSet();
            Animator[] elements2 = {objectAnimatorOfFloat2, contentRevealAnimator$ui_kit_components_release, subtitleAlphaAnimator$ui_kit_components_release, topLabelEndImageAlphaAnimator$ui_kit_components_release, objectAnimatorA, objectAnimatorA2};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            animatorSet.playTogether(kotlin.collections.d.L(elements2));
            animatorSet.addListener(new hx0.v(listL, viewGroup, listL, viewGroup));
        }
        if (animatorSet == null) {
            animatorSet2 = null;
        } else {
            animatorSet2.play(animatorSet);
        }
        return animatorSet2 == null ? animator : animatorSet2;
    }
}
