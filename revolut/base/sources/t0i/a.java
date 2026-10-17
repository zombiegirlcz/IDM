package t0i;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f267037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f267038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f267039c;
    public final ScreenContentRecyclerView d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f267037a = controllerContainerConstraintLayout;
        this.f267038b = navBarWithAvatar;
        this.f267039c = largeActionButton;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f267037a;
    }
}
