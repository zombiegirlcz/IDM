package q8h;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f243077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f243078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f243079c;
    public final TwinHorizontalButton d;

    public c(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithAvatar navBarWithAvatar, ScreenContentRecyclerView screenContentRecyclerView, TwinHorizontalButton twinHorizontalButton) {
        this.f243077a = controllerContainerConstraintLayout;
        this.f243078b = navBarWithAvatar;
        this.f243079c = screenContentRecyclerView;
        this.d = twinHorizontalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f243077a;
    }
}
