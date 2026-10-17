package cnk;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, ngk.o.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPricingPlanInfoBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenPricingPlanInfoBottomSheet_background;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
        if (animatedBackgroundView != null) {
            i = R$id.screenPricingPlanInfoBottomSheet_contentContainer;
            if (((ControllerContainerConstraintLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.screenPricingPlanInfoBottomSheet_footer;
                ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
                if (actionFooterView != null) {
                    i = R$id.screenPricingPlanInfoBottomSheet_navBar;
                    NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(p0, i);
                    if (navBarBottomSheet != null) {
                        return new ngk.o((ControllerContainerConstraintLayout) p0, animatedBackgroundView, actionFooterView, navBarBottomSheet);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
