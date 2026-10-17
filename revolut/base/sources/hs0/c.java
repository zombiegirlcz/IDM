package hs0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends Transition {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f154850c = {"android:textchange:text"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f154851a = 0.3f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f154852b = 0.5f;

    public static final class a {
        private a() {
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        View view = transitionValues.view;
        if (view instanceof TextView) {
            Map<String, Object> values = transitionValues.values;
            Intrinsics.checkNotNullExpressionValue(values, "values");
            values.put("android:textchange:text", ((TextView) view).getText());
        }
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        View view = transitionValues.view;
        if (view instanceof TextView) {
            Map<String, Object> values = transitionValues.values;
            Intrinsics.checkNotNullExpressionValue(values, "values");
            values.put("android:textchange:text", ((TextView) view).getText());
        }
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup sceneRoot, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues.view;
        if (!(view instanceof TextView) || !view.equals(transitionValues2.view)) {
            return null;
        }
        View view2 = transitionValues2.view;
        Intrinsics.i(view2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view2;
        Object obj2 = transitionValues.values.get("android:textchange:text");
        CharSequence charSequence = obj2 instanceof CharSequence ? (CharSequence) obj2 : null;
        Object obj3 = transitionValues2.values.get("android:textchange:text");
        b bVar = new b(this, textView, charSequence, obj3 instanceof CharSequence ? (CharSequence) obj3 : null);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addListener(bVar);
        valueAnimatorOfFloat.addUpdateListener(bVar);
        return valueAnimatorOfFloat;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f154850c;
    }

    @Override // androidx.transition.Transition
    public final boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        Map<String, Object> map;
        Map<String, Object> map2;
        Object obj2 = (transitionValues == null || (map2 = transitionValues.values) == null) ? null : map2.get("android:textchange:text");
        CharSequence charSequence = obj2 instanceof CharSequence ? (CharSequence) obj2 : null;
        Object obj3 = (transitionValues2 == null || (map = transitionValues2.values) == null) ? null : map.get("android:textchange:text");
        return Intrinsics.f(transitionValues != null ? transitionValues.view : null, transitionValues2 != null ? transitionValues2.view : null) && !TextUtils.equals(charSequence, obj3 instanceof CharSequence ? (CharSequence) obj3 : null);
    }
}
