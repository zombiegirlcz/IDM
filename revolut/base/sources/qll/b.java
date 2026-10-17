package qll;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.sso.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, dkl.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/sso/impl/databinding/ScreenCombinedAuthenticationUnifiedBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View viewFindChildViewById;
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenCombinedAuthenticationUnified_basicNavBar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(p0, (i = R$id.screenCombinedAuthenticationUnified_bgOverlay))) != null) {
            i = R$id.screenCombinedAuthenticationUnified_logoWithTaglineView;
            LogoWithTaglineView logoWithTaglineView = (LogoWithTaglineView) ViewBindings.findChildViewById(p0, i);
            if (logoWithTaglineView != null) {
                i = R$id.screenCombinedAuthenticationUnified_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.screenCombinedAuthenticationUnified_wallpaperAssetSwitcher;
                    WallpaperAssetSwitcher wallpaperAssetSwitcher = (WallpaperAssetSwitcher) ViewBindings.findChildViewById(p0, i);
                    if (wallpaperAssetSwitcher != null) {
                        return new dkl.d((ControllerContainerConstraintLayout) p0, basicNavBar, viewFindChildViewById, logoWithTaglineView, screenContentRecyclerView, wallpaperAssetSwitcher);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
