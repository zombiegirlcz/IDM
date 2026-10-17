package nya;

import android.view.View;
import android.widget.ViewSwitcher;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.feature.shared.referrals.ui.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, jbd.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/shared/referrals/ui/impl/databinding/ScreenInviteCampaignBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.goToButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.homeLayout;
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) ViewBindings.findChildViewById(p0, i);
            if (controllerContainerCoordinatorLayout != null) {
                i = R$id.navbarWithContainer;
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
                if (navBarWithContainer != null) {
                    i = R$id.recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.recyclerViewCashback;
                        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                        if (screenContentRecyclerView != null) {
                            i = R$id.storyContent;
                            StoryNavBarContentView storyNavBarContentView = (StoryNavBarContentView) ViewBindings.findChildViewById(p0, i);
                            if (storyNavBarContentView != null) {
                                i = R$id.viewSwitcher;
                                ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(p0, i);
                                if (viewSwitcher != null) {
                                    return new jbd.a((ControllerContainerFrameLayout) p0, largeActionButton, controllerContainerCoordinatorLayout, navBarWithContainer, screenContentRecyclerView, storyNavBarContentView, viewSwitcher);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
