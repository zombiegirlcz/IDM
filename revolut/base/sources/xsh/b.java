package xsh;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.feature.widgets.impl.ui.screen.customisation.WidgetCarouselScreen;
import vvc.t;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WidgetCarouselScreen f308492a;

    public b(WidgetCarouselScreen widgetCarouselScreen) {
        this.f308492a = widgetCarouselScreen;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        r rVar = (r) ((f) this.f308492a.T.getValue());
        rVar.getClass();
        rVar.x2(new t(rVar, i, 3));
    }
}
