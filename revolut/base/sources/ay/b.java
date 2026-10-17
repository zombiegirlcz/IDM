package ay;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f10990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f10991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraKitView f10992c;
    public final BasicNavBar d;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, CameraKitView cameraKitView, BasicNavBar basicNavBar) {
        this.f10990a = controllerContainerConstraintLayout;
        this.f10991b = largeActionButton;
        this.f10992c = cameraKitView;
        this.d = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10990a;
    }
}
