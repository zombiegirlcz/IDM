package g1a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ProfileCardView;
import com.revolut.core.ui_kit.views.TiltGlowCardContainerView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f139568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f139569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProfileCardView f139570c;
    public final TiltGlowCardContainerView d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, BasicNavBar basicNavBar, ProfileCardView profileCardView, TiltGlowCardContainerView tiltGlowCardContainerView) {
        this.f139568a = controllerContainerConstraintLayout;
        this.f139569b = basicNavBar;
        this.f139570c = profileCardView;
        this.d = tiltGlowCardContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f139568a;
    }
}
