package akm;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import jq0.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import mx0.dd;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements DFS.Neighbors, dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6128a;

    public /* synthetic */ c(boolean z) {
        this.f6128a = z;
    }

    @Override // mx0.dd
    public Animator d(final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final int iMax = Math.max(600, 400);
        final int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 20.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(iMax);
        valueAnimatorOfFloat.setInterpolator(r.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tx0.e1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue() * iMax;
                float f = kotlin.ranges.f.f(fFloatValue / 400, BitmapDescriptorFactory.HUE_RED, 1.0f);
                float f4 = kotlin.ranges.f.f(fFloatValue / 600, BitmapDescriptorFactory.HUE_RED, 1.0f);
                boolean z = this.f6128a;
                View view2 = view;
                int i = iA;
                if (!z) {
                    view2.setAlpha(1.0f - f);
                    view2.setTranslationX((-i) * f4);
                } else {
                    view2.setAlpha(f);
                    view2.setTranslationX((1.0f - f4) * i);
                }
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj2) {
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors;
        boolean z = this.f6128a;
        CallableMemberDescriptor original = (CallableMemberDescriptor) obj2;
        int i = DescriptorUtilsKt.f187593a;
        if (z) {
            original = original != null ? original.getOriginal() : null;
        }
        return (original == null || (overriddenDescriptors = original.getOverriddenDescriptors()) == null) ? f0.f322471a : overriddenDescriptors;
    }
}
