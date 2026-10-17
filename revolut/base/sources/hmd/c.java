package hmd;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.HeaderWithGaugeBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f153678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f153679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainer f153680c;
    public final HeaderWithGaugeBarContentView d;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithContainer navBarWithContainer, HeaderWithGaugeBarContentView headerWithGaugeBarContentView) {
        this.f153678a = controllerContainerCoordinatorLayout;
        this.f153679b = actionFooterView;
        this.f153680c = navBarWithContainer;
        this.d = headerWithGaugeBarContentView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f153678a;
    }
}
