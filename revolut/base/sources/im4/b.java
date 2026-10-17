package im4;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f162299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f162300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f162301c;
    public final BasicNavBar d;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, FooterTextView footerTextView, BasicNavBar basicNavBar) {
        this.f162299a = controllerContainerCoordinatorLayout;
        this.f162300b = actionFooterView;
        this.f162301c = footerTextView;
        this.d = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f162299a;
    }
}
