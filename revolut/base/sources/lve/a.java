package lve;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f200360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f200361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f200362c;
    public final FooterTextView d;
    public final LargeActionButton e;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithAvatar navBarWithAvatar, FooterTextView footerTextView, LargeActionButton largeActionButton2) {
        this.f200360a = controllerContainerCoordinatorLayout;
        this.f200361b = largeActionButton;
        this.f200362c = navBarWithAvatar;
        this.d = footerTextView;
        this.e = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f200360a;
    }
}
