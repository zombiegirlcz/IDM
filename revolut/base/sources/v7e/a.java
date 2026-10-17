package v7e;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.feature.subaccount.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, p6e.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/subaccount/impl/databinding/ScreenSubaccountInfoPickerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.subaccountInfoPickerButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.subaccountInfoPickerNavBar;
            NavBarVaults navBarVaults = (NavBarVaults) ViewBindings.findChildViewById(p0, i);
            if (navBarVaults != null) {
                i = R$id.subaccountInfoPickerRecyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new p6e.b((ControllerContainerCoordinatorLayout) p0, largeActionButton, navBarVaults);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
