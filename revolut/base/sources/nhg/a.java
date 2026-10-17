package nhg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f215455b;

    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        this.f215454a = i;
        this.f215455b = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator anim) {
        int i = this.f215454a;
        ViewGroup viewGroup = this.f215455b;
        switch (i) {
            case 0:
                viewGroup.setAlpha(((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                return;
            case 1:
                Intrinsics.checkNotNullParameter(anim, "anim");
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Object animatedValue = anim.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                marginLayoutParams.topMargin = (int) ((Float) animatedValue).floatValue();
                viewGroup.setLayoutParams(marginLayoutParams);
                return;
            case 2:
                KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                viewGroup.setAlpha(((Float) z9h.n.g(anim, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                return;
            case 3:
                KProperty[] kPropertyArr2 = TravelHotelsSearchResultsMapScreen.p0;
                viewGroup.setAlpha(((Float) z9h.n.g(anim, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                return;
            case 4:
                KProperty[] kPropertyArr3 = TravelHotelsSearchResultsMapScreen.p0;
                Intrinsics.checkNotNullParameter(anim, "anim");
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Object animatedValue2 = anim.getAnimatedValue();
                Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                ((LinearLayout.LayoutParams) layoutParams2).topMargin = (int) ((Float) animatedValue2).floatValue();
                viewGroup.setLayoutParams(layoutParams2);
                return;
            default:
                KProperty[] kPropertyArr4 = TravelHotelsSearchResultsMapScreen.p0;
                Intrinsics.checkNotNullParameter(anim, "anim");
                ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Object animatedValue3 = anim.getAnimatedValue();
                Intrinsics.i(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                ((LinearLayout.LayoutParams) layoutParams3).topMargin = (int) ((Float) animatedValue3).floatValue();
                viewGroup.setLayoutParams(layoutParams3);
                return;
        }
    }
}
