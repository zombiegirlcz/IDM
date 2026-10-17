package su0;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements ViewPager2.PageTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265627a;

    public a(int i) {
        this.f265627a = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public final void transformPage(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        int width = view.getWidth();
        SwipeableCardContainerView swipeableCardContainerView = (SwipeableCardContainerView) view;
        Paint paint = swipeableCardContainerView.f57608h;
        Context context = swipeableCardContainerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float f4 = kli.a.q(context) ? 0.2f : 0.5f;
        float f5 = 1;
        swipeableCardContainerView.getChildAt(0).setAlpha(f5 - f.f(f - f5, BitmapDescriptorFactory.HUE_RED, 1.0f));
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(f * this.f265627a);
            paint.setAlpha((int) BitmapDescriptorFactory.HUE_RED);
            swipeableCardContainerView.invalidate();
            return;
        }
        paint.setAlpha((int) ((f <= 1.0f ? f4 * f : f.f((f5 - (f / 2.0f)) * f4 * 2.0f, BitmapDescriptorFactory.HUE_RED, f4)) * 255.0f));
        swipeableCardContainerView.invalidate();
        view.setTranslationX(width * (-f));
        view.setTranslationZ((-1) - f);
        float f6 = f5 - 0.9f;
        float fA = (f5 - ((f6 * f) / 2.0f)) * j6.a.a(f5, f <= 1.0f ? f : 1.0f, f6, 0.9f);
        view.setScaleX(fA);
        view.setScaleY(fA);
        view.setTranslationY(((view.getHeight() / fA) - view.getHeight()) / 2.0f);
    }
}
