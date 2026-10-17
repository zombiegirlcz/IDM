package wok;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, iok.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/databinding/WaitlistBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.waitlist_background;
        WallpaperAssetSwitcher wallpaperAssetSwitcher = (WallpaperAssetSwitcher) ViewBindings.findChildViewById(p0, i);
        if (wallpaperAssetSwitcher != null) {
            i = R$id.waitlist_footer;
            ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
            if (actionFooterView != null) {
                i = R$id.waitlist_recycler;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.waitlist_toolbar;
                    NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                    if (navBarWithToolbar != null) {
                        return new iok.b((ControllerContainerConstraintLayout) p0, wallpaperAssetSwitcher, actionFooterView, navBarWithToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
