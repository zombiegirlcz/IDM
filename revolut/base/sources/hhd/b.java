package hhd;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared_separate_favourites.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, kgd.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/shared_separate_favourites/databinding/SharedAddAssetRev10FlowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.sharedAddAsset_footerActionButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.sharedAddAsset_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.sharedAddAsset_pager;
                if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.sharedAddAsset_tabs;
                    DraggableTabsView draggableTabsView = (DraggableTabsView) ViewBindings.findChildViewById(p0, i);
                    if (draggableTabsView != null) {
                        return new kgd.d((ControllerContainerCoordinatorLayout) p0, largeActionButton, navBarWithToolbar, draggableTabsView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
