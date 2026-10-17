package lki;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import au0.l5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f196458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lea.b f196459h;

    public f(u direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f196458g = direction;
    }

    public static ObjectAnimator d(View view, float f, float f4, long j2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f4);
        objectAnimatorOfFloat.setDuration(160L);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    public static ObjectAnimator f(float f, float f4, View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, f, f4);
        objectAnimatorOfFloat.setDuration(360L);
        objectAnimatorOfFloat.setStartDelay(96L);
        objectAnimatorOfFloat.setInterpolator(jq0.r.f177392a);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    @Override // lki.b
    public final Animator a(View view, View view2, boolean z) {
        View view3;
        float f;
        if (view2 != null) {
            view3 = view2;
        } else {
            if (view == null) {
                return new AnimatorSet();
            }
            view3 = view;
        }
        boolean z3 = view3.getLayoutDirection() == 1;
        int i = e.f196457a[this.f196458g.ordinal()];
        if (i == 1) {
            f = 1.0f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = -1.0f;
        }
        float fA = r6.b.a(view3, "getContext(...)", 96.0f) * (z != z3 ? 1.0f : -1.0f) * f;
        this.f196459h = new lea.b(view, view2, 10);
        if (view2 != null) {
            view2.setTranslationX(-fA);
        }
        if (view2 != null) {
            view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(f(BitmapDescriptorFactory.HUE_RED, fA, view));
            arrayList.add(d(view, 1.0f, BitmapDescriptorFactory.HUE_RED, 96L));
        }
        if (view2 != null) {
            arrayList.add(f(-fA, BitmapDescriptorFactory.HUE_RED, view2));
            arrayList.add(d(view2, BitmapDescriptorFactory.HUE_RED, 1.0f, 136L));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new l5(this, 13));
        return animatorSet;
    }

    @Override // lki.b, lki.x
    public final void g() {
        super.g();
        lea.b bVar = this.f196459h;
        this.f196459h = null;
        if (bVar != null) {
            bVar.invoke();
        }
    }
}
