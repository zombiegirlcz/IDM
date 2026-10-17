package y7k;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.payments.payment_links.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.q implements Function1 {
    public static final j f = new j();

    public j() {
        super(1, o7k.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/payments/payment_links/impl/databinding/ScreenTransferPaymentLinksAmountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.paymentLinks_navigationBar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null) {
            i = R$id.paymentLinks_reactionsKeyboard;
            ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) ViewBindings.findChildViewById(p0, i);
            if (reactionsKeyboardView != null) {
                i = R$id.paymentLinks_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.paymentLinks_submitButton;
                    TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
                    if (twinVerticalButton != null) {
                        return new o7k.b((ControllerContainerConstraintLayout) p0, basicNavBar, reactionsKeyboardView, twinVerticalButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
