package nhg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.InputTravelSearchView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecelerateInterpolator f215470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f215471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f215472c;
    public AnimatorSet d;

    public e(InputTravelSearchItemView collapsedView, InputTravelSearchView expandedView) {
        Intrinsics.checkNotNullParameter(collapsedView, "collapsedView");
        Intrinsics.checkNotNullParameter(expandedView, "expandedView");
        this.f215470a = new DecelerateInterpolator(2.0f);
        ViewGroup.LayoutParams layoutParams = collapsedView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        this.f215471b = new c(collapsedView, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
        ViewGroup.LayoutParams layoutParams2 = expandedView.getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        this.f215472c = new c(expandedView, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
    }

    public final void a(c cVar, c cVar2) {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (cVar2.f215461a.getVisibility() == 0) {
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ViewGroup viewGroup = cVar.f215461a;
        AnimatorSet animatorSetB = b(viewGroup, 1.0f, BitmapDescriptorFactory.HUE_RED, cVar.f215462b, -viewGroup.getMeasuredHeight(), false);
        ViewGroup viewGroup2 = cVar2.f215461a;
        animatorSet2.playTogether(animatorSetB, b(viewGroup2, BitmapDescriptorFactory.HUE_RED, 1.0f, -viewGroup2.getMeasuredHeight(), cVar2.f215462b, true));
        animatorSet2.start();
        this.d = animatorSet2;
    }

    public final AnimatorSet b(ViewGroup viewGroup, float f, float f4, int i, int i2, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f4);
        valueAnimatorOfFloat.addUpdateListener(new a(viewGroup, 0));
        valueAnimatorOfFloat.addListener(new d(z, viewGroup, f, f4));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat2.addUpdateListener(new a(viewGroup, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(this.f215470a);
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }
}
