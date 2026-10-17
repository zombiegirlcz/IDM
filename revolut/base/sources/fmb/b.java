package fmb;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, xmb.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/retail/savings/impl/databinding/ScreenRevampReviewProductDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.reviewProductDetails_collapsingCta;
        CollapsingActionButton collapsingActionButton = (CollapsingActionButton) ViewBindings.findChildViewById(p0, i);
        if (collapsingActionButton != null) {
            i = R$id.reviewProductDetails_navBar;
            NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(p0, i);
            if (navBarLargeCentred != null) {
                i = R$id.reviewProductDetails_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new xmb.c((ControllerContainerCoordinatorLayout) p0, collapsingActionButton, navBarLargeCentred, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
