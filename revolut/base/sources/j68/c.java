package j68;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.account_activation.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, w58.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/junior/account_activation/impl/databinding/ScreenEditBirthDateBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.birthDate_actionButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
            int i2 = R$id.birthDate_dateInput;
            DateInputView dateInputView = (DateInputView) ViewBindings.findChildViewById(p0, i2);
            if (dateInputView != null) {
                i2 = R$id.birthDate_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i2);
                if (navBarWithToolbar != null) {
                    return new w58.a(controllerContainerConstraintLayout, largeActionButton, dateInputView, navBarWithToolbar);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
