package nr;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f218492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputText f218493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterActionButtonView f218494c;
    public final NavBarWithToolbar d;
    public final InputText e;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, InputText inputText, FooterActionButtonView footerActionButtonView, NavBarWithToolbar navBarWithToolbar, InputText inputText2) {
        this.f218492a = controllerContainerCoordinatorLayout;
        this.f218493b = inputText;
        this.f218494c = footerActionButtonView;
        this.d = navBarWithToolbar;
        this.e = inputText2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f218492a;
    }
}
