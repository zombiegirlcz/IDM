package hf4;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, aw3.e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditCardOfferBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.creditCardOffer_largeActionButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.creditCardOffer_largeActionButtonContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
            if (frameLayout != null) {
                i = R$id.creditCardOffer_navBarLargeCentred;
                NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(p0, i);
                if (navBarLargeCentred != null) {
                    i = R$id.creditCardOffer_parentNestedScrollView;
                    if (((NestedScrollView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.creditCardOffer_recyclerView;
                        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                            return new aw3.e((ControllerContainerCoordinatorLayout) p0, largeActionButton, frameLayout, navBarLargeCentred);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
