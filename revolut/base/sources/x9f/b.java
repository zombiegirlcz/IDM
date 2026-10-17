package x9f;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.trading.transfer.investments.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, k9f.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/trading/transfer/investments/impl/databinding/ScreenNumberOfSharesBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenNumberOfShares_goToButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.screenNumberOfShares_navBarWithAvatar;
            NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithAvatar != null) {
                i = R$id.screenNumberOfShares_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new k9f.b(largeActionButton, navBarWithAvatar, (ControllerContainerCoordinatorLayout) p0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
