package h2e;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f148811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f148812b;

    public h(ControllerContainerFrameLayout controllerContainerFrameLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f148811a = controllerContainerFrameLayout;
        this.f148812b = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f148811a;
    }
}
