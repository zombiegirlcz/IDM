package qhi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.common.view.ControllerContainerSliderLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f246611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerFrameLayout f246612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ControllerContainerSliderLayout f246613c;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, ControllerContainerFrameLayout controllerContainerFrameLayout2, ControllerContainerSliderLayout controllerContainerSliderLayout) {
        this.f246611a = controllerContainerFrameLayout;
        this.f246612b = controllerContainerFrameLayout2;
        this.f246613c = controllerContainerSliderLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f246611a;
    }
}
