package rq4;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.credit.card.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, im4.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/card/impl/databinding/ScreenCreditCapChangeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenCreditLimitCapChange_actionFooterView;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i2 = R$id.screenCreditLimitCapChange_footerText;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i2);
            if (footerTextView != null) {
                i2 = R$id.screenCreditLimitCapChange_navBarBasic;
                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i2);
                if (basicNavBar != null) {
                    i2 = R$id.screenCreditLimitCapChange_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                        return new im4.b(controllerContainerCoordinatorLayout, actionFooterView, footerTextView, basicNavBar);
                    }
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
