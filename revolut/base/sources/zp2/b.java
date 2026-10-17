package zp2;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.bank_account_switching.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, sn2.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/bank_account_switching/impl/databinding/ScreenObligatedProductsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenObligatedProducts_firstButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.screenObligatedProducts_NavBar;
            NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(p0, i);
            if (navBarBottomSheet != null) {
                i = R$id.screenObligatedProducts_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.screenObligatedProducts_secondButton;
                    LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                    if (largeActionButton2 != null) {
                        return new sn2.b((ControllerContainerCoordinatorLayout) p0, largeActionButton, navBarBottomSheet, largeActionButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
