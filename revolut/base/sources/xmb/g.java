package xmb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f307112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f307113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f307114c;
    public final NavBarWithToolbar d;

    public g(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, FooterTextView footerTextView, NavBarWithToolbar navBarWithToolbar) {
        this.f307112a = controllerContainerConstraintLayout;
        this.f307113b = largeActionButton;
        this.f307114c = footerTextView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f307112a;
    }
}
