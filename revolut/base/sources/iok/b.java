package iok;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f163342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WallpaperAssetSwitcher f163343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionFooterView f163344c;
    public final NavBarWithToolbar d;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, WallpaperAssetSwitcher wallpaperAssetSwitcher, ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar) {
        this.f163342a = controllerContainerConstraintLayout;
        this.f163343b = wallpaperAssetSwitcher;
        this.f163344c = actionFooterView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f163342a;
    }
}
