package vw9;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.payments.profile.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, mw9.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/profile/impl/databinding/PaymentsProfileFlowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.paymentProfile_footerLogoView;
        CutoutImageView cutoutImageView = (CutoutImageView) ViewBindings.findChildViewById(p0, i);
        if (cutoutImageView != null) {
            i = R$id.paymentProfile_navBar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
            if (basicNavBar != null) {
                i = R$id.paymentProfile_pager;
                if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new mw9.a((ControllerContainerConstraintLayout) p0, cutoutImageView, basicNavBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
