package l2a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f191725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScrollingPagerIndicatorView f191726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f191727c;

    public c(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ScrollingPagerIndicatorView scrollingPagerIndicatorView, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f191725a = controllerContainerConstraintLayout;
        this.f191726b = scrollingPagerIndicatorView;
        this.f191727c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f191725a;
    }
}
