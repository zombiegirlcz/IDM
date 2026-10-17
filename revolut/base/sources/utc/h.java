package utc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.impl.ui.views.LocationCircleOverlay;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f283093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatingActionButton f283094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterActionButtonView f283095c;
    public final LocationCircleOverlay d;
    public final MapView e;
    public final NavBarWithToolbar f;

    public h(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FloatingActionButton floatingActionButton, FooterActionButtonView footerActionButtonView, LocationCircleOverlay locationCircleOverlay, MapView mapView, NavBarWithToolbar navBarWithToolbar) {
        this.f283093a = controllerContainerConstraintLayout;
        this.f283094b = floatingActionButton;
        this.f283095c = footerActionButtonView;
        this.d = locationCircleOverlay;
        this.e = mapView;
        this.f = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f283093a;
    }
}
