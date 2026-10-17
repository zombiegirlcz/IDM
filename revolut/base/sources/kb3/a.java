package kb3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f182510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomExpandableDialogView f182511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FormsActionButton f182512c;
    public final ScreenContentRecyclerView d;
    public final MapView e;
    public final BasicNavBar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SearchButton f182513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SmallActionButton f182514h;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BottomExpandableDialogView bottomExpandableDialogView, FormsActionButton formsActionButton, ScreenContentRecyclerView screenContentRecyclerView, MapView mapView, BasicNavBar basicNavBar, SearchButton searchButton, SmallActionButton smallActionButton) {
        this.f182510a = controllerContainerCoordinatorLayout;
        this.f182511b = bottomExpandableDialogView;
        this.f182512c = formsActionButton;
        this.d = screenContentRecyclerView;
        this.e = mapView;
        this.f = basicNavBar;
        this.f182513g = searchButton;
        this.f182514h = smallActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f182510a;
    }
}
