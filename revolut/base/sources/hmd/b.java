package hmd;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.HeaderWithGaugeBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f153675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainer f153676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HeaderWithGaugeBarContentView f153677c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithContainer navBarWithContainer, HeaderWithGaugeBarContentView headerWithGaugeBarContentView) {
        this.f153675a = controllerContainerCoordinatorLayout;
        this.f153676b = navBarWithContainer;
        this.f153677c = headerWithGaugeBarContentView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f153675a;
    }
}
