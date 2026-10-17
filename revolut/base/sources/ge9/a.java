package ge9;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.passcode.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f143271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f143272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f143273c;
    public final PinCodeView d;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, LinearLayout linearLayout, BasicNavBar basicNavBar, PinCodeView pinCodeView) {
        this.f143271a = controllerContainerFrameLayout;
        this.f143272b = linearLayout;
        this.f143273c = basicNavBar;
        this.d = pinCodeView;
    }

    public static a a(View view) {
        int i = R$id.passcodeScreen_innerContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R$id.passcodeScreen_navBar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(view, i);
            if (basicNavBar != null) {
                i = R$id.passcodeScreen_passcode;
                PinCodeView pinCodeView = (PinCodeView) ViewBindings.findChildViewById(view, i);
                if (pinCodeView != null) {
                    return new a((ControllerContainerFrameLayout) view, linearLayout, basicNavBar, pinCodeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f143271a;
    }
}
