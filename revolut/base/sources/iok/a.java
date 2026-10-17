package iok;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitPreview;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f163340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WaitlistBenefitPreview f163341b;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, WaitlistBenefitPreview waitlistBenefitPreview) {
        this.f163340a = controllerContainerCoordinatorLayout;
        this.f163341b = waitlistBenefitPreview;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f163340a;
    }
}
