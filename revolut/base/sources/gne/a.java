package gne;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f144966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f144967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterActionButtonView f144968c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithAvatar navBarWithAvatar, FooterActionButtonView footerActionButtonView) {
        this.f144966a = controllerContainerCoordinatorLayout;
        this.f144967b = navBarWithAvatar;
        this.f144968c = footerActionButtonView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f144966a;
    }
}
