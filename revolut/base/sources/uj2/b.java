package uj2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f280477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f280478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f280479c;

    public b(BasicNavBar basicNavBar, ControllerContainerConstraintLayout controllerContainerConstraintLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f280477a = controllerContainerConstraintLayout;
        this.f280478b = screenContentRecyclerView;
        this.f280479c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f280477a;
    }
}
