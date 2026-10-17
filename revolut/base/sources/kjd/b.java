package kjd;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f184368b;

    public /* synthetic */ b(FrameLayout frameLayout, int i) {
        this.f184367a = i;
        this.f184368b = frameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f184367a;
        FrameLayout frameLayout = this.f184368b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                frameLayout.setAlpha(((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 1:
                KProperty[] kPropertyArr2 = TravelHotelsSearchResultsMapScreen.p0;
                frameLayout.setAlpha(((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            default:
                KProperty[] kPropertyArr3 = TravelHotelsSearchResultsMapScreen.p0;
                frameLayout.setAlpha(((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
        }
    }
}
