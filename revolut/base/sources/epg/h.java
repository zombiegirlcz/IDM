package epg;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.username.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, apg.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/username/databinding/ScreenUsernameBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.username_changeButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.username_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.username_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new apg.a(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
