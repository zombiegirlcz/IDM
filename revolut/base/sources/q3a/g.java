package q3a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f241933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainerHeaderView f241934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f241935c;

    public g(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithContainerHeaderView navBarWithContainerHeaderView, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f241933a = controllerContainerConstraintLayout;
        this.f241934b = navBarWithContainerHeaderView;
        this.f241935c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f241933a;
    }
}
