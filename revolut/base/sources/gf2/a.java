package gf2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f143331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f143332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f143333c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, TwinVerticalButton twinVerticalButton) {
        this.f143331a = controllerContainerCoordinatorLayout;
        this.f143332b = basicNavBar;
        this.f143333c = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f143331a;
    }
}
