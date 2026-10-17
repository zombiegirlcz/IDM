package hs0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import au0.b5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends Transition {

    @NotNull
    public static final C0887a Companion = new C0887a();

    /* JADX INFO: renamed from: hs0.a$a, reason: collision with other inner class name */
    public static final class C0887a {
        private C0887a() {
        }
    }

    public static void a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view instanceof ImageView) {
            ColorStateList imageTintList = ((ImageView) view).getImageTintList();
            int defaultColor = imageTintList != null ? imageTintList.getDefaultColor() : 0;
            Map<String, Object> values = transitionValues.values;
            Intrinsics.checkNotNullExpressionValue(values, "values");
            values.put("custom:change_image_tint:tint", Integer.valueOf(defaultColor));
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        a(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        a(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup sceneRoot, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        if (transitionValues != null && transitionValues2 != null) {
            Object obj2 = transitionValues.values.get("custom:change_image_tint:tint");
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (num != null) {
                int iIntValue2 = num.intValue();
                Object obj3 = transitionValues2.values.get("custom:change_image_tint:tint");
                Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
                if (num2 != null && iIntValue2 != (iIntValue = num2.intValue())) {
                    View view = transitionValues2.view;
                    Intrinsics.i(view, "null cannot be cast to non-null type android.widget.ImageView");
                    ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(iIntValue2, iIntValue);
                    valueAnimatorOfArgb.addUpdateListener(new b5((ImageView) view, 15));
                    return valueAnimatorOfArgb;
                }
            }
        }
        return null;
    }
}
