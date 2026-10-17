package dkl;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f115641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f115642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f115643c;
    public final LogoWithTaglineView d;
    public final ScreenContentRecyclerView e;
    public final WallpaperAssetSwitcher f;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, BasicNavBar basicNavBar, View view, LogoWithTaglineView logoWithTaglineView, ScreenContentRecyclerView screenContentRecyclerView, WallpaperAssetSwitcher wallpaperAssetSwitcher) {
        this.f115641a = controllerContainerConstraintLayout;
        this.f115642b = basicNavBar;
        this.f115643c = view;
        this.d = logoWithTaglineView;
        this.e = screenContentRecyclerView;
        this.f = wallpaperAssetSwitcher;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f115641a;
    }
}
