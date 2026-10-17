package jq0;

import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.animation.BlinkingDotsAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlinkingDotsAnimation f177355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f177356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f177357c;
    public float d;

    public f(BlinkingDotsAnimation view, int i, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f177355a = view;
        this.f177356b = i;
        this.f177357c = f;
        this.d = BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f177355a.equals(fVar.f177355a) && this.f177356b == fVar.f177356b && Float.compare(this.f177357c, fVar.f177357c) == 0 && Float.compare(this.d, fVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f177357c, j6.a.b(this.f177356b, this.f177355a.hashCode() * 31, 31), 31);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue("color");
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f177356b = ((Integer) animatedValue).intValue();
        Object animatedValue2 = animation.getAnimatedValue("radius");
        Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        this.f177357c = ((Float) animatedValue2).floatValue();
        Object animatedValue3 = animation.getAnimatedValue("blur");
        Intrinsics.i(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        this.d = ((Float) animatedValue3).floatValue();
        this.f177355a.invalidate();
    }
}
