package lki;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends b {
    @Override // lki.b
    public final Animator a(View view, View view2, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        if (view2 != null) {
            animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f));
        }
        if (view != null) {
            animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED));
            animatorSet.addListener(new cx0.b(view, 7));
        }
        return animatorSet;
    }

    @Override // lki.b
    public final void c(View view, a animation) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(animation, "animation");
        animation.invoke();
    }
}
