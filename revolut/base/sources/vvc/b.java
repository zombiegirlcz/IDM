package vvc;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.feature.security_hub.impl.ui.views.LocationCircleOverlay;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, utc.h.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/security_hub/impl/databinding/SetTrustedLocationScreenBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
        int i = R$id.setTrustedLocationController_fab;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(p0, i);
        if (floatingActionButton != null) {
            i = R$id.setTrustedLocationController_footer;
            FooterActionButtonView footerActionButtonView = (FooterActionButtonView) ViewBindings.findChildViewById(p0, i);
            if (footerActionButtonView != null) {
                i = R$id.setTrustedLocationController_locationOverlay;
                LocationCircleOverlay locationCircleOverlay = (LocationCircleOverlay) ViewBindings.findChildViewById(p0, i);
                if (locationCircleOverlay != null) {
                    i = R$id.setTrustedLocationController_map;
                    MapView mapView = (MapView) ViewBindings.findChildViewById(p0, i);
                    if (mapView != null) {
                        i = R$id.setTrustedLocationController_navbarWithToolbar;
                        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                        if (navBarWithToolbar != null) {
                            return new utc.h(controllerContainerConstraintLayout, floatingActionButton, footerActionButtonView, locationCircleOverlay, mapView, navBarWithToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
