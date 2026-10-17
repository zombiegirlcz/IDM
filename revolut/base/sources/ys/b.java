package ys;

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
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, nr.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationMyNumberDateOfBirthEditBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.biometricVerificationMyNumberDobEdit_calendar;
        InputText inputText = (InputText) ViewBindings.findChildViewById(p0, i);
        if (inputText != null) {
            i = R$id.biometricVerificationMyNumberDobEdit_day;
            InputText inputText2 = (InputText) ViewBindings.findChildViewById(p0, i);
            if (inputText2 != null) {
                i = R$id.biometricVerificationMyNumberDobEdit_footer;
                FooterActionButtonView footerActionButtonView = (FooterActionButtonView) ViewBindings.findChildViewById(p0, i);
                if (footerActionButtonView != null) {
                    i = R$id.biometricVerificationMyNumberDobEdit_month;
                    InputText inputText3 = (InputText) ViewBindings.findChildViewById(p0, i);
                    if (inputText3 != null) {
                        i = R$id.biometricVerificationMyNumberDobEdit_navBar;
                        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                        if (navBarWithToolbar != null) {
                            i = R$id.biometricVerificationMyNumberDobEdit_year;
                            InputText inputText4 = (InputText) ViewBindings.findChildViewById(p0, i);
                            if (inputText4 != null) {
                                return new nr.c((ControllerContainerCoordinatorLayout) p0, inputText, inputText2, footerActionButtonView, inputText3, navBarWithToolbar, inputText4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
