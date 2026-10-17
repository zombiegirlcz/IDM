package a60;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.navbar.PhotoHeaderView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f1513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f1514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PhotoHeaderView f1515c;
    public final ScreenContentRecyclerView d;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, PhotoHeaderView photoHeaderView, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f1513a = controllerContainerCoordinatorLayout;
        this.f1514b = animatedBackgroundView;
        this.f1515c = photoHeaderView;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f1513a;
    }
}
