package f3l;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.views.CircleClipView;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerFrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegacyContentContainerFrameLayout f131979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f131980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieAnimationView f131981c;
    public final LottieAnimationView d;
    public final CircleClipView e;
    public final CircleClipView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f131982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f131983h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ProgressBar f131984j;
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f131985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FullScreenStateView f131986m;

    public a(LegacyContentContainerFrameLayout legacyContentContainerFrameLayout, LargeActionButton largeActionButton, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, CircleClipView circleClipView, CircleClipView circleClipView2, ImageView imageView, ImageView imageView2, AppCompatTextView appCompatTextView, ProgressBar progressBar, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, FullScreenStateView fullScreenStateView) {
        this.f131979a = legacyContentContainerFrameLayout;
        this.f131980b = largeActionButton;
        this.f131981c = lottieAnimationView;
        this.d = lottieAnimationView2;
        this.e = circleClipView;
        this.f = circleClipView2;
        this.f131982g = imageView;
        this.f131983h = imageView2;
        this.i = appCompatTextView;
        this.f131984j = progressBar;
        this.k = appCompatTextView2;
        this.f131985l = appCompatTextView3;
        this.f131986m = fullScreenStateView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f131979a;
    }
}
