package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f215208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f215209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f215210c;

    public j(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout2, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f215208a = controllerContainerCoordinatorLayout;
        this.f215209b = controllerContainerCoordinatorLayout2;
        this.f215210c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215208a;
    }
}
