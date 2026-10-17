package xq0;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.drawables.EdgeEffectDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f308041a = new g(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f308042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EdgeEffectDrawable f308043c;

    public final void a() {
        RecyclerView recyclerView = this.f308042b;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f308041a);
            if (Intrinsics.f(recyclerView.getForeground(), this.f308043c)) {
                recyclerView.setForeground(null);
            }
        }
        this.f308043c = null;
        this.f308042b = null;
    }

    public final void b() {
        final EdgeEffectDrawable edgeEffectDrawable;
        RecyclerView recyclerView = this.f308042b;
        if (recyclerView == null || (edgeEffectDrawable = this.f308043c) == null) {
            return;
        }
        boolean zCanScrollHorizontally = recyclerView.canScrollHorizontally(-1);
        if (edgeEffectDrawable.i != zCanScrollHorizontally) {
            ValueAnimator valueAnimator = edgeEffectDrawable.e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            edgeEffectDrawable.i = zCanScrollHorizontally;
            int i = zCanScrollHorizontally ? 255 : 0;
            if (edgeEffectDrawable.k) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(edgeEffectDrawable.f55962g, i);
                final int i2 = 1;
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dr0.m
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        int i3 = i2;
                        EdgeEffectDrawable edgeEffectDrawable2 = edgeEffectDrawable;
                        switch (i3) {
                            case 0:
                                int i5 = EdgeEffectDrawable.f55958m;
                                edgeEffectDrawable2.f55963h = ((Integer) z9h.n.g(valueAnimator2, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                edgeEffectDrawable2.invalidateSelf();
                                break;
                            default:
                                int i6 = EdgeEffectDrawable.f55958m;
                                edgeEffectDrawable2.f55962g = ((Integer) z9h.n.g(valueAnimator2, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                edgeEffectDrawable2.invalidateSelf();
                                break;
                        }
                    }
                });
                valueAnimatorOfInt.setDuration(200L);
                valueAnimatorOfInt.start();
                edgeEffectDrawable.e = valueAnimatorOfInt;
            } else {
                edgeEffectDrawable.f55962g = i;
                edgeEffectDrawable.k = true;
            }
            edgeEffectDrawable.invalidateSelf();
        }
        boolean zCanScrollHorizontally2 = recyclerView.canScrollHorizontally(1);
        if (edgeEffectDrawable.f55964j == zCanScrollHorizontally2) {
            return;
        }
        edgeEffectDrawable.f55964j = zCanScrollHorizontally2;
        ValueAnimator valueAnimator2 = edgeEffectDrawable.f;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        int i3 = zCanScrollHorizontally2 ? 255 : 0;
        if (edgeEffectDrawable.k) {
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(edgeEffectDrawable.f55963h, i3);
            final int i5 = 0;
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dr0.m
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    int i32 = i5;
                    EdgeEffectDrawable edgeEffectDrawable2 = edgeEffectDrawable;
                    switch (i32) {
                        case 0:
                            int i59 = EdgeEffectDrawable.f55958m;
                            edgeEffectDrawable2.f55963h = ((Integer) z9h.n.g(valueAnimator22, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue();
                            edgeEffectDrawable2.invalidateSelf();
                            break;
                        default:
                            int i6 = EdgeEffectDrawable.f55958m;
                            edgeEffectDrawable2.f55962g = ((Integer) z9h.n.g(valueAnimator22, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue();
                            edgeEffectDrawable2.invalidateSelf();
                            break;
                    }
                }
            });
            valueAnimatorOfInt2.setDuration(200L);
            valueAnimatorOfInt2.start();
            edgeEffectDrawable.f = valueAnimatorOfInt2;
        } else {
            edgeEffectDrawable.f55963h = i3;
            edgeEffectDrawable.k = true;
        }
        edgeEffectDrawable.invalidateSelf();
    }
}
