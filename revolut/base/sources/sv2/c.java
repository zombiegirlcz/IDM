package sv2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f265832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f265833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f265834c;
    public final NavBarWithToolbar d;

    public c(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, FooterTextView footerTextView, NavBarWithToolbar navBarWithToolbar) {
        this.f265832a = controllerContainerConstraintLayout;
        this.f265833b = largeActionButton;
        this.f265834c = footerTextView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f265832a;
    }
}
