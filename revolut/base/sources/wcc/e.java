package wcc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f296402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f296403b;

    public e(ControllerContainerFrameLayout controllerContainerFrameLayout, LottieAnimationView lottieAnimationView) {
        this.f296402a = controllerContainerFrameLayout;
        this.f296403b = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f296402a;
    }
}
