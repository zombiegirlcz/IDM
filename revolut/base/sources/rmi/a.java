package rmi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f255339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f255340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f255341c;

    public a(BasicNavBar basicNavBar, ControllerContainerConstraintLayout controllerContainerConstraintLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f255339a = controllerContainerConstraintLayout;
        this.f255340b = basicNavBar;
        this.f255341c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f255339a;
    }
}
