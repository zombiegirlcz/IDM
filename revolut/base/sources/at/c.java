package at;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.biometric_verification.impl.R$id;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, nr.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationMyNumberDetailsEditBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.biometricVerificationMyNumberDetailsEdit_expiryYear;
        InputText inputText = (InputText) ViewBindings.findChildViewById(p0, i);
        if (inputText != null) {
            i = R$id.biometricVerificationMyNumberDetailsEdit_footer;
            FooterActionButtonView footerActionButtonView = (FooterActionButtonView) ViewBindings.findChildViewById(p0, i);
            if (footerActionButtonView != null) {
                i = R$id.biometricVerificationMyNumberDetailsEdit_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.biometricVerificationMyNumberDetailsEdit_securityCode;
                    InputText inputText2 = (InputText) ViewBindings.findChildViewById(p0, i);
                    if (inputText2 != null) {
                        return new nr.d((ControllerContainerCoordinatorLayout) p0, inputText, footerActionButtonView, navBarWithToolbar, inputText2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
