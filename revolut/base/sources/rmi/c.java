package rmi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f255344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmallActionButton f255345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f255346c;
    public final ScreenContentRecyclerView d;

    public c(ControllerContainerConstraintLayout controllerContainerConstraintLayout, SmallActionButton smallActionButton, BasicNavBar basicNavBar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f255344a = controllerContainerConstraintLayout;
        this.f255345b = smallActionButton;
        this.f255346c = basicNavBar;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f255344a;
    }
}
