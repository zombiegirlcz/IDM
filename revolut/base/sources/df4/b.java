package df4;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, aw3.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditAnimatedIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.creditApplication_footerActionButton;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.creditApplication_navBarLargeCentred;
            NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(p0, i);
            if (navBarLargeCentred != null) {
                return new aw3.c((ControllerContainerCoordinatorLayout) p0, actionFooterView, navBarLargeCentred);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
