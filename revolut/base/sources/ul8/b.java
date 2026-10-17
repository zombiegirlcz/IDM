package ul8;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_remote_login.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, gl8.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/junior_remote_login/impl/databinding/ScreenJuniorAddPhoneNumberBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.juniorAddPhoneNumberScreen_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.juniorAddPhoneNumberScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.juniorAddPhoneNumberScreen_phoneInput;
                PhoneInputTextView phoneInputTextView = (PhoneInputTextView) ViewBindings.findChildViewById(p0, i);
                if (phoneInputTextView != null) {
                    return new gl8.a((ControllerContainerConstraintLayout) p0, largeActionButton, navBarWithToolbar, phoneInputTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
