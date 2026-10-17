package o8a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.pix.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f222969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f222970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarBottomSheet f222971c;
    public final LargeActionButton d;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarBottomSheet navBarBottomSheet, LargeActionButton largeActionButton2) {
        this.f222969a = controllerContainerCoordinatorLayout;
        this.f222970b = largeActionButton;
        this.f222971c = navBarBottomSheet;
        this.d = largeActionButton2;
    }

    public static c a(View view) {
        int i = R$id.mainButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) view;
            int i2 = R$id.navBarBottomSheet_NavBar;
            NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(view, i2);
            if (navBarBottomSheet != null) {
                i2 = R$id.navBarBottomSheet_RecyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i2)) != null) {
                    i2 = R$id.secondaryButton;
                    LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(view, i2);
                    if (largeActionButton2 != null) {
                        return new c(controllerContainerCoordinatorLayout, largeActionButton, navBarBottomSheet, largeActionButton2);
                    }
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f222969a;
    }
}
