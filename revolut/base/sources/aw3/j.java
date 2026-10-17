package aw3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.HeaderWithGaugeBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f10695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainer f10696c;
    public final HeaderWithGaugeBarContentView d;

    public j(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithContainer navBarWithContainer, HeaderWithGaugeBarContentView headerWithGaugeBarContentView) {
        this.f10694a = controllerContainerCoordinatorLayout;
        this.f10695b = actionFooterView;
        this.f10696c = navBarWithContainer;
        this.d = headerWithGaugeBarContentView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10694a;
    }
}
