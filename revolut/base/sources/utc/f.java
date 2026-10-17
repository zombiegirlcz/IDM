package utc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f283088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f283089b;

    public f(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f283088a = controllerContainerCoordinatorLayout;
        this.f283089b = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f283088a;
    }
}
