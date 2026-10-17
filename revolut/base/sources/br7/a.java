package br7;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import nl7.s;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, s.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/insurance_car/impl/databinding/ScreenUploadFilesListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.uploadFilesList_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.uploadFilesList_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.uploadFilesList_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new s(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
