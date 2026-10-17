package a60;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f1505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f1506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f1507c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout2, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f1505a = controllerContainerCoordinatorLayout;
        this.f1506b = controllerContainerCoordinatorLayout2;
        this.f1507c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f1505a;
    }
}
