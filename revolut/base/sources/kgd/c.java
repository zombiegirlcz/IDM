package kgd;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f183955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f183956b;

    public c(ControllerContainerFrameLayout controllerContainerFrameLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f183955a = controllerContainerFrameLayout;
        this.f183956b = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f183955a;
    }
}
