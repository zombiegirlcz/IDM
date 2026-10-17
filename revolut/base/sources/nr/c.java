package nr;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f218488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputText f218489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputText f218490c;
    public final FooterActionButtonView d;
    public final InputText e;
    public final NavBarWithToolbar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InputText f218491g;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, InputText inputText, InputText inputText2, FooterActionButtonView footerActionButtonView, InputText inputText3, NavBarWithToolbar navBarWithToolbar, InputText inputText4) {
        this.f218488a = controllerContainerCoordinatorLayout;
        this.f218489b = inputText;
        this.f218490c = inputText2;
        this.d = footerActionButtonView;
        this.e = inputText3;
        this.f = navBarWithToolbar;
        this.f218491g = inputText4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f218488a;
    }
}
