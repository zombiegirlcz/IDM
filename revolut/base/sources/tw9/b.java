package tw9;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ProfileCardView;
import com.revolut.feature.payments.profile.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, mw9.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/profile/impl/databinding/ScreenProfileCardPaymentsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.googleWalletButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.screenProfileDetails_card;
            ProfileCardView profileCardView = (ProfileCardView) ViewBindings.findChildViewById(p0, i);
            if (profileCardView != null) {
                return new mw9.c((ControllerContainerFrameLayout) p0, largeActionButton, profileCardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
