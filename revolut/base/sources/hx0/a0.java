package hx0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewOutlineProvider;
import au0.h3;
import au0.l5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 {
    private a0() {
    }

    public static ValueAnimator a(View view, float f, float f4, long j2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f4);
        valueAnimatorOfFloat.addUpdateListener(new ap0.m(view, 11));
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(jq0.r.f177392a);
        return valueAnimatorOfFloat;
    }

    public static AnimatorSet b(View view, View to6, Function0 onScaleIn, Animator animator, y variant) {
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(onScaleIn, "onScaleIn");
        Intrinsics.checkNotNullParameter(variant, "variant");
        AnimatorSet animatorSet = new AnimatorSet();
        ViewOutlineProvider outlineProvider = to6.getOutlineProvider();
        boolean clipToOutline = to6.getClipToOutline();
        int layerType = to6.getLayerType();
        float fA = r6.b.a(to6, "getContext(...)", 20.0f);
        m0 m0Var = new m0();
        m0Var.f186427a = fA;
        x xVarC = variant.c();
        animatorSet.addListener(new z(to6, outlineProvider, clipToOutline, layerType, to6, xVarC, m0Var));
        ValueAnimator valueAnimatorA = a(to6, xVarC.f156346a, xVarC.f156347b, xVarC.f156348c);
        valueAnimatorA.addListener(new byl.i(to6, 3, variant, to6));
        valueAnimatorA.addUpdateListener(new ap0.m(to6, 10));
        x xVarE = variant.e();
        ValueAnimator valueAnimatorA2 = xVarE != null ? a(to6, xVarE.f156346a, xVarE.f156347b, xVarE.f156348c) : null;
        if (valueAnimatorA2 != null && animator != null) {
            animatorSet.play(animator).after(valueAnimatorA2);
        }
        x xVarD = variant.d();
        ValueAnimator valueAnimatorA3 = xVarD != null ? a(to6, xVarD.f156346a, xVarD.f156347b, xVarD.f156348c) : null;
        int i = 1;
        if (variant.a() && valueAnimatorA3 != null) {
            valueAnimatorA3.addUpdateListener(new h3(m0Var, fA, to6, i));
        }
        (valueAnimatorA3 == null ? valueAnimatorA2 == null ? valueAnimatorA : valueAnimatorA2 : valueAnimatorA3).addListener(new l5(onScaleIn, 6));
        x xVarB = variant.b();
        ValueAnimator[] elements = {valueAnimatorA, valueAnimatorA2, valueAnimatorA3, xVarB != null ? a(to6, xVarB.f156346a, xVarB.f156347b, xVarB.f156348c) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) kotlin.collections.d.L(elements).toArray(new ValueAnimator[0]);
        animatorSet.playSequentially((Animator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length));
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED, -view.getWidth());
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.setInterpolator(jq0.r.f177392a);
            animatorSet.play(objectAnimatorOfFloat);
            animatorSet.addListener(new cx0.b(view, 5));
        }
        return animatorSet;
    }

    public static /* synthetic */ AnimatorSet c(View view, View view2, Function0 function0, y yVar, int i) {
        if ((i & 4) != 0) {
            function0 = new hul.c(13);
        }
        if ((i & 16) != 0) {
            yVar = y.DEFAULT;
        }
        return b(view, view2, function0, null, yVar);
    }
}
