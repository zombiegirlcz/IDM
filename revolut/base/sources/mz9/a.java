package mz9;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f210723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f210724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f210725c;
    public final ScreenContentRecyclerView d;
    public final SmallActionButton e;
    public final SmallActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f210726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BackgroundWallpaperView f210727h;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FooterTextView footerTextView, NavBarWithAvatar navBarWithAvatar, ScreenContentRecyclerView screenContentRecyclerView, SmallActionButton smallActionButton, SmallActionButton smallActionButton2, FrameLayout frameLayout, BackgroundWallpaperView backgroundWallpaperView) {
        this.f210723a = controllerContainerConstraintLayout;
        this.f210724b = footerTextView;
        this.f210725c = navBarWithAvatar;
        this.d = screenContentRecyclerView;
        this.e = smallActionButton;
        this.f = smallActionButton2;
        this.f210726g = frameLayout;
        this.f210727h = backgroundWallpaperView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f210723a;
    }
}
