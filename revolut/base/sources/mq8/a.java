package mq8;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f207895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f207896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f207897c;
    public final ReactionsKeyboardView d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithAvatar navBarWithAvatar, ReactionsKeyboardView reactionsKeyboardView) {
        this.f207895a = controllerContainerCoordinatorLayout;
        this.f207896b = largeActionButton;
        this.f207897c = navBarWithAvatar;
        this.d = reactionsKeyboardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f207895a;
    }
}
