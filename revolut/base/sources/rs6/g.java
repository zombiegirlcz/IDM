package rs6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f257035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f257036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainer f257037c;
    public final StoryNavBarContentView d;

    public g(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithContainer navBarWithContainer, StoryNavBarContentView storyNavBarContentView) {
        this.f257035a = controllerContainerCoordinatorLayout;
        this.f257036b = actionFooterView;
        this.f257037c = navBarWithContainer;
        this.d = storyNavBarContentView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f257035a;
    }
}
