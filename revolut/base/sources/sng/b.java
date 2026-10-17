package sng;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, lng.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/user_declarations/shared/databinding/ScreenDateOfBirthBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.dateOfBirthScreen_actionButtonView;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.dateOfBirthScreen_dateInput;
            DateInputView dateInputView = (DateInputView) ViewBindings.findChildViewById(p0, i);
            if (dateInputView != null) {
                i = R$id.dateOfBirthScreen_dateOfBirthView;
                InputText inputText = (InputText) ViewBindings.findChildViewById(p0, i);
                if (inputText != null) {
                    i = R$id.dateOfBirthScreen_navBarWithToolbarView;
                    NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                    if (navBarWithToolbar != null) {
                        i = R$id.dateOfBirthScreen_scrollView;
                        if (((NestedScrollView) ViewBindings.findChildViewById(p0, i)) != null) {
                            return new lng.a((ControllerContainerCoordinatorLayout) p0, actionFooterView, dateInputView, inputText, navBarWithToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
