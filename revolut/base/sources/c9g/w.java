package c9g;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f22436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f22437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoordinatorLayout f22438c;
    public final InputTravelView d;
    public final BottomExpandableDialogView e;
    public final FormsActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f22439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MapView f22440h;
    public final RecyclerView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ActionsView f22441j;
    public final SmallActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InputTravelView f22442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BasicNavBar f22443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InputTravelView f22444n;

    public w(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FrameLayout frameLayout, CoordinatorLayout coordinatorLayout, InputTravelView inputTravelView, BottomExpandableDialogView bottomExpandableDialogView, FormsActionButton formsActionButton, ConstraintLayout constraintLayout, MapView mapView, RecyclerView recyclerView, ActionsView actionsView, SmallActionButton smallActionButton, InputTravelView inputTravelView2, BasicNavBar basicNavBar, InputTravelView inputTravelView3) {
        this.f22436a = controllerContainerConstraintLayout;
        this.f22437b = frameLayout;
        this.f22438c = coordinatorLayout;
        this.d = inputTravelView;
        this.e = bottomExpandableDialogView;
        this.f = formsActionButton;
        this.f22439g = constraintLayout;
        this.f22440h = mapView;
        this.i = recyclerView;
        this.f22441j = actionsView;
        this.k = smallActionButton;
        this.f22442l = inputTravelView2;
        this.f22443m = basicNavBar;
        this.f22444n = inputTravelView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f22436a;
    }
}
