package utc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f283090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f283091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f283092c;

    public g(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FooterTextView footerTextView, NavBarWithToolbar navBarWithToolbar) {
        this.f283090a = controllerContainerConstraintLayout;
        this.f283091b = footerTextView;
        this.f283092c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f283090a;
    }
}
