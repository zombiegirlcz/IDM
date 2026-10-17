package tmk;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FadingImageBackgroundLayout;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.ui_kit_artboard.PlainLabelView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ngk.i.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanOfferBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.planOfferBottomSheet_background;
        FadingImageBackgroundLayout fadingImageBackgroundLayout = (FadingImageBackgroundLayout) ViewBindings.findChildViewById(p0, i);
        if (fadingImageBackgroundLayout != null) {
            ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) p0;
            i = R$id.planOfferBottomSheet_description;
            PlainLabelView plainLabelView = (PlainLabelView) ViewBindings.findChildViewById(p0, i);
            if (plainLabelView != null) {
                i = R$id.planOfferBottomSheet_footerView;
                ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
                if (actionFooterView != null) {
                    i = R$id.planOfferBottomSheet_title;
                    PlainLabelView plainLabelView2 = (PlainLabelView) ViewBindings.findChildViewById(p0, i);
                    if (plainLabelView2 != null) {
                        return new ngk.i(controllerContainerFrameLayout, fadingImageBackgroundLayout, plainLabelView, actionFooterView, plainLabelView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
