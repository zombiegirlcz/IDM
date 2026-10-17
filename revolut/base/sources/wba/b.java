package wba;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pix.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, o8a.e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/pix/impl/databinding/ScreenPixQrCodeTransactionReviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.pixQrCodeTransactionReviewScreen_footerContainer;
        if (((LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.pixQrCodeTransactionReviewScreen_footerView;
            if (((FooterTextView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.pixQrCodeTransactionReviewScreen_navigationBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.pixQrCodeTransactionReviewScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.pixQrCodeTransactionReviewScreen_scheduleButton;
                        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                        if (largeActionButton != null) {
                            i = R$id.pixQrCodeTransactionReviewScreen_submitButton;
                            LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                            if (largeActionButton2 != null) {
                                return new o8a.e(largeActionButton, largeActionButton2, navBarWithToolbar, controllerContainerCoordinatorLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
