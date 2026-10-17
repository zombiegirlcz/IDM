package uj2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f280483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormsActionButton f280484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MapView f280485c;
    public final BasicNavBar d;
    public final LargeActionButton e;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FormsActionButton formsActionButton, MapView mapView, BasicNavBar basicNavBar, LargeActionButton largeActionButton) {
        this.f280483a = controllerContainerConstraintLayout;
        this.f280484b = formsActionButton;
        this.f280485c = mapView;
        this.d = basicNavBar;
        this.e = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f280483a;
    }
}
