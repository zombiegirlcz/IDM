package vg7;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.incentive_reward.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, af7.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/incentive_reward/impl/databinding/ScreenShareLotteryBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.lotteryShareActionsView;
        ActionsView actionsView = (ActionsView) ViewBindings.findChildViewById(p0, i);
        if (actionsView != null) {
            i = R$id.lotteryShareBackground;
            UIKitImageView uIKitImageView = (UIKitImageView) ViewBindings.findChildViewById(p0, i);
            if (uIKitImageView != null) {
                i = R$id.lotteryShareCardBackground;
                UIKitImageView uIKitImageView2 = (UIKitImageView) ViewBindings.findChildViewById(p0, i);
                if (uIKitImageView2 != null) {
                    i = R$id.lotteryShareCardContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(p0, i);
                    if (constraintLayout != null) {
                        i = R$id.lotteryShareCardDate;
                        UIKitTextView uIKitTextView = (UIKitTextView) ViewBindings.findChildViewById(p0, i);
                        if (uIKitTextView != null) {
                            i = R$id.lotteryShareCardIcon;
                            UIKitImageView uIKitImageView3 = (UIKitImageView) ViewBindings.findChildViewById(p0, i);
                            if (uIKitImageView3 != null) {
                                i = R$id.lotteryShareCardPayday;
                                UIKitTextView uIKitTextView2 = (UIKitTextView) ViewBindings.findChildViewById(p0, i);
                                if (uIKitTextView2 != null) {
                                    i = R$id.lotteryShareCardRevolutLogo;
                                    UIKitImageView uIKitImageView4 = (UIKitImageView) ViewBindings.findChildViewById(p0, i);
                                    if (uIKitImageView4 != null) {
                                        i = R$id.lotteryShareCardTitle;
                                        UIKitTextView uIKitTextView3 = (UIKitTextView) ViewBindings.findChildViewById(p0, i);
                                        if (uIKitTextView3 != null) {
                                            i = R$id.lotteryShareNavBarWithToolbar;
                                            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                                            if (navBarWithToolbar != null) {
                                                return new af7.b((ControllerContainerConstraintLayout) p0, actionsView, uIKitImageView, uIKitImageView2, constraintLayout, uIKitTextView, uIKitImageView3, uIKitTextView2, uIKitImageView4, uIKitTextView3, navBarWithToolbar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
