package u1a;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ProfileCardView;
import com.revolut.core.ui_kit.views.TiltGlowCardContainerView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.payments.splitbill.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, g1a.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/splitbill/impl/databinding/ScreenSplitBillQrBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.splitBillQr_navBar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null) {
            i = R$id.splitBillQr_profileCard;
            ProfileCardView profileCardView = (ProfileCardView) ViewBindings.findChildViewById(p0, i);
            if (profileCardView != null) {
                i = R$id.splitBillQr_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.splitBillQr_tiltContainer;
                    TiltGlowCardContainerView tiltGlowCardContainerView = (TiltGlowCardContainerView) ViewBindings.findChildViewById(p0, i);
                    if (tiltGlowCardContainerView != null) {
                        return new g1a.a((ControllerContainerConstraintLayout) p0, basicNavBar, profileCardView, tiltGlowCardContainerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
