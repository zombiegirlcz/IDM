package dkl;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f115638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LogoWithTaglineView f115639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f115640c;
    public final WallpaperAssetSwitcher d;

    public c(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LogoWithTaglineView logoWithTaglineView, TwinVerticalButton twinVerticalButton, WallpaperAssetSwitcher wallpaperAssetSwitcher) {
        this.f115638a = controllerContainerConstraintLayout;
        this.f115639b = logoWithTaglineView;
        this.f115640c = twinVerticalButton;
        this.d = wallpaperAssetSwitcher;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f115638a;
    }
}
