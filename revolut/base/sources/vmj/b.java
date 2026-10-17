package vmj;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit.views.ProfileCardView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.retail.feature.esim.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, wej.f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/esim/impl/databinding/ScreenEsimShareQrCodeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenEsimShareQrCode_actionButtonsView;
        CircleActionButtonsBarView circleActionButtonsBarView = (CircleActionButtonsBarView) ViewBindings.findChildViewById(p0, i);
        if (circleActionButtonsBarView != null) {
            i = R$id.screenEsimShareQrCode_animatedBackground;
            AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
            if (animatedBackgroundView != null) {
                i = R$id.screenEsimShareQrCode_basicNavBar;
                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                if (basicNavBar != null) {
                    ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
                    i = R$id.screenEsimShareQrCode_profileCard;
                    ProfileCardView profileCardView = (ProfileCardView) ViewBindings.findChildViewById(p0, i);
                    if (profileCardView != null) {
                        return new wej.f(controllerContainerConstraintLayout, circleActionButtonsBarView, animatedBackgroundView, basicNavBar, profileCardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
