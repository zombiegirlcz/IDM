package xdi;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import com.revolut.feature_rev_points_pocket_impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, gdi.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature_rev_points_pocket_impl/databinding/ScreenRevPointsPocketOnboardingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.revPointsPocketOnboarding_carouselContentView;
        ObjectCarouselNavBarContentView objectCarouselNavBarContentView = (ObjectCarouselNavBarContentView) ViewBindings.findChildViewById(p0, i);
        if (objectCarouselNavBarContentView != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            i = R$id.revPointsPocketOnboarding_navBarWithContainer;
            NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
            if (navBarWithContainer != null) {
                i = R$id.revPointsPocketOnboarding_nextButton;
                LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                if (largeActionButton != null) {
                    i = R$id.revPointsPocketOnboarding_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new gdi.b(controllerContainerCoordinatorLayout, objectCarouselNavBarContentView, controllerContainerCoordinatorLayout, navBarWithContainer, largeActionButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
