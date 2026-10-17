package kjd;

import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.shops.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, xhd.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/shops/impl/databinding/ScreenShopsMapViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.shopsMapViewScreen_backgroundView;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
        if (frameLayout != null) {
            i = R$id.shopsMapViewScreen_coordinatorLayout;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(p0, i);
            if (coordinatorLayout != null) {
                i = R$id.shopsMapViewScreen_expandableDialogContainer;
                BottomExpandableDialogView bottomExpandableDialogView = (BottomExpandableDialogView) ViewBindings.findChildViewById(p0, i);
                if (bottomExpandableDialogView != null) {
                    i = R$id.shopsMapViewScreen_horizontalRecyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        i = R$id.shopsMapViewScreen_locationButton;
                        FormsActionButton formsActionButton = (FormsActionButton) ViewBindings.findChildViewById(p0, i);
                        if (formsActionButton != null) {
                            i = R$id.shopsMapViewScreen_map;
                            MapView mapView = (MapView) ViewBindings.findChildViewById(p0, i);
                            if (mapView != null) {
                                i = R$id.shopsMapViewScreen_navbar;
                                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                                if (basicNavBar != null) {
                                    ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
                                    i = R$id.shopsMapViewScreen_searchButton;
                                    SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                                    if (smallActionButton != null) {
                                        return new xhd.b(controllerContainerConstraintLayout, frameLayout, coordinatorLayout, bottomExpandableDialogView, screenContentRecyclerView, formsActionButton, mapView, basicNavBar, smallActionButton);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
