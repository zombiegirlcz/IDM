package rok;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.R$id;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitPreview;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, iok.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/databinding/WaitlistBenefitsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.benefits_preview;
        WaitlistBenefitPreview waitlistBenefitPreview = (WaitlistBenefitPreview) ViewBindings.findChildViewById(p0, i);
        if (waitlistBenefitPreview != null) {
            i = R$id.benefits_toolbar;
            if (((NavBarWithToolbar) ViewBindings.findChildViewById(p0, i)) != null) {
                return new iok.a((ControllerContainerCoordinatorLayout) p0, waitlistBenefitPreview);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
