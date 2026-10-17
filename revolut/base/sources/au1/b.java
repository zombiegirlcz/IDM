package au1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f9463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TwinVerticalButton f9464b;

    public b(ControllerContainerFrameLayout controllerContainerFrameLayout, TwinVerticalButton twinVerticalButton) {
        this.f9463a = controllerContainerFrameLayout;
        this.f9464b = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9463a;
    }
}
