package ktb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f189516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerFrameLayout f189517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SlidingDimmerView f189518c;

    public b(ControllerContainerFrameLayout controllerContainerFrameLayout, ControllerContainerFrameLayout controllerContainerFrameLayout2, SlidingDimmerView slidingDimmerView) {
        this.f189516a = controllerContainerFrameLayout;
        this.f189517b = controllerContainerFrameLayout2;
        this.f189518c = slidingDimmerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f189516a;
    }
}
