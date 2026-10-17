package ip0;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.drawables.AnimatedDrawable;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zd0 {
    private zd0() {
    }

    public static AnimatorSet a(Animator... animatorArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
        return animatorSet;
    }

    public static AnimatedStateListDrawable b(Context context, int i, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        AnimatedStateListDrawable animatedStateListDrawable = new AnimatedStateListDrawable();
        if (z) {
            animatedStateListDrawable.addState(new int[]{R.attr.state_selected, R.attr.state_activated}, i(R$drawable.uikit_icn_24_checkbox_multiple, context), 3);
        }
        animatedStateListDrawable.addState(new int[]{R.attr.state_selected}, i(i, context), 1);
        animatedStateListDrawable.addState(new int[0], new ColorDrawable(0), 2);
        animatedStateListDrawable.addTransition(2, 1, e(i, context), false);
        animatedStateListDrawable.addTransition(1, 2, f(i, context), false);
        if (z) {
            int i2 = R$drawable.uikit_icn_24_checkbox_multiple;
            animatedStateListDrawable.addTransition(2, 3, e(i2, context), false);
            animatedStateListDrawable.addTransition(3, 2, f(i2, context), false);
            animatedStateListDrawable.addTransition(1, 3, d(i2, context), false);
            animatedStateListDrawable.addTransition(3, 1, d(i, context), false);
        }
        return animatedStateListDrawable;
    }

    public static AnimatedStateListDrawable c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AnimatedStateListDrawable animatedStateListDrawable = new AnimatedStateListDrawable();
        animatedStateListDrawable.addState(new int[]{R.attr.state_selected}, i(R$drawable.uikit_icn_24_radiobutton_on, context), 1);
        animatedStateListDrawable.addState(new int[0], new ColorDrawable(0), 2);
        sp0.e eVar = new sp0.e(i(com.revolut.core.ui_kit.R$drawable.internal_radio_button_animation_outer_ring, context), BitmapDescriptorFactory.HUE_RED, null, 94);
        sp0.e eVar2 = new sp0.e(i(com.revolut.core.ui_kit.R$drawable.internal_radio_button_animation_inner_circle, context), BitmapDescriptorFactory.HUE_RED, null, 70);
        animatedStateListDrawable.addTransition(2, 1, new AnimatedDrawable(zhm.v.k(eVar, eVar2), new yd0(eVar2, eVar, 0)), false);
        sp0.e eVar3 = new sp0.e(i(com.revolut.core.ui_kit.R$drawable.internal_radio_button_animation_outer_ring, context), BitmapDescriptorFactory.HUE_RED, null, 126);
        sp0.e eVar4 = new sp0.e(i(com.revolut.core.ui_kit.R$drawable.internal_radio_button_animation_inner_circle, context), BitmapDescriptorFactory.HUE_RED, null, 126);
        animatedStateListDrawable.addTransition(1, 2, new AnimatedDrawable(zhm.v.k(eVar3, eVar4), new yd0(eVar3, eVar4, 2)), false);
        return animatedStateListDrawable;
    }

    public static AnimatedDrawable d(int i, Context context) {
        sp0.e eVar = new sp0.e(i(i, context), BitmapDescriptorFactory.HUE_RED, null, 126);
        sp0.e eVar2 = new sp0.e(i(com.revolut.core.ui_kit.R$drawable.internal_checkbox_animation_overlay, context), 1.0f, eVar, 52);
        return new AnimatedDrawable(zhm.v.k(eVar, eVar2), new yd0(eVar, eVar2, 1));
    }

    public static AnimatedDrawable e(int i, Context context) {
        sp0.e eVar = new sp0.e(i(i, context), BitmapDescriptorFactory.HUE_RED, null, 102);
        sp0.e eVar2 = new sp0.e(i(com.revolut.core.ui_kit.R$drawable.internal_checkbox_animation_overlay, context), 1.0f, eVar, 52);
        return new AnimatedDrawable(zhm.v.k(eVar, eVar2), new yd0(eVar, eVar2, 3));
    }

    public static AnimatedDrawable f(int i, Context context) {
        sp0.e eVar = new sp0.e(i(i, context), BitmapDescriptorFactory.HUE_RED, null, 126);
        return new AnimatedDrawable(zhm.v.k(eVar, new sp0.e(i(com.revolut.core.ui_kit.R$drawable.internal_checkbox_animation_overlay, context), BitmapDescriptorFactory.HUE_RED, eVar, 52)), new ie7.a(eVar, 18));
    }

    public static ObjectAnimator g(sp0.e eVar, float f, float f4, long j2, long j3) {
        sp0.e.Companion.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(eVar, sp0.e.f264860j, f, f4);
        objectAnimatorOfFloat.setDuration(j2);
        objectAnimatorOfFloat.setStartDelay(j3);
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    public static Drawable i(int i, Context context) {
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            throw new IllegalArgumentException(j6.a.l(i, "Drawable resource ", " not found").toString());
        }
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        return drawableMutate;
    }

    public static ObjectAnimator j(sp0.e eVar) {
        sp0.e.Companion.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(eVar, sp0.e.f264859h, 1.0f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new FastOutLinearInInterpolator());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    public static AnimatorSet k(sp0.e eVar, float f, float f4, Interpolator interpolator) {
        AnimatorSet animatorSet = new AnimatorSet();
        sp0.e.Companion.getClass();
        animatorSet.playTogether(ObjectAnimator.ofFloat(eVar, sp0.e.f264859h, f, f4), ObjectAnimator.ofFloat(eVar, sp0.e.i, f, f4));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(interpolator);
        return animatorSet;
    }
}
