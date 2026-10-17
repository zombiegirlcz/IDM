package oll;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.sso.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, dkl.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/sso/impl/databinding/ScreenCombinedAuthenticationTwoButtonsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenCombinedAuthenticationTwoButtons_logoWithTaglineView;
        LogoWithTaglineView logoWithTaglineView = (LogoWithTaglineView) ViewBindings.findChildViewById(p0, i);
        if (logoWithTaglineView != null) {
            i = R$id.screenCombinedAuthenticationTwoButtons_twinVerticalButton;
            TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
            if (twinVerticalButton != null) {
                i = R$id.screenCombinedAuthenticationTwoButtons_wallpaperAssetSwitcher;
                WallpaperAssetSwitcher wallpaperAssetSwitcher = (WallpaperAssetSwitcher) ViewBindings.findChildViewById(p0, i);
                if (wallpaperAssetSwitcher != null) {
                    return new dkl.c((ControllerContainerConstraintLayout) p0, logoWithTaglineView, twinVerticalButton, wallpaperAssetSwitcher);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
