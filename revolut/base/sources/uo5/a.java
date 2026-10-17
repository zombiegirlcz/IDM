package uo5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.crypto.withdraw.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f281566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarBottomSheet f281567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f281568c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarBottomSheet navBarBottomSheet, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f281566a = controllerContainerCoordinatorLayout;
        this.f281567b = navBarBottomSheet;
        this.f281568c = screenContentRecyclerView;
    }

    public static a a(View view) {
        int i = R$id.bottomSheetDialog_navBarBottomSheet;
        NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(view, i);
        if (navBarBottomSheet != null) {
            i = R$id.bottomSheetDialog_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
            if (screenContentRecyclerView != null) {
                return new a((ControllerContainerCoordinatorLayout) view, navBarBottomSheet, screenContentRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f281566a;
    }
}
