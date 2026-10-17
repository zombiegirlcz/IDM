package c9g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f22423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MapView f22424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f22425c;

    public r(ControllerContainerConstraintLayout controllerContainerConstraintLayout, MapView mapView, BasicNavBar basicNavBar) {
        this.f22423a = controllerContainerConstraintLayout;
        this.f22424b = mapView;
        this.f22425c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f22423a;
    }
}
