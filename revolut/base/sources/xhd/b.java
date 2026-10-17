package xhd;

import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f305859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f305860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoordinatorLayout f305861c;
    public final BottomExpandableDialogView d;
    public final ScreenContentRecyclerView e;
    public final FormsActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MapView f305862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BasicNavBar f305863h;
    public final SmallActionButton i;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FrameLayout frameLayout, CoordinatorLayout coordinatorLayout, BottomExpandableDialogView bottomExpandableDialogView, ScreenContentRecyclerView screenContentRecyclerView, FormsActionButton formsActionButton, MapView mapView, BasicNavBar basicNavBar, SmallActionButton smallActionButton) {
        this.f305859a = controllerContainerConstraintLayout;
        this.f305860b = frameLayout;
        this.f305861c = coordinatorLayout;
        this.d = bottomExpandableDialogView;
        this.e = screenContentRecyclerView;
        this.f = formsActionButton;
        this.f305862g = mapView;
        this.f305863h = basicNavBar;
        this.i = smallActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f305859a;
    }
}
