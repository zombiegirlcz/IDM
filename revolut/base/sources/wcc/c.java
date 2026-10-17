package wcc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f296396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f296397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarBottomSheet f296398c;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FooterTextView footerTextView, NavBarBottomSheet navBarBottomSheet) {
        this.f296396a = controllerContainerCoordinatorLayout;
        this.f296397b = footerTextView;
        this.f296398c = navBarBottomSheet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f296396a;
    }
}
