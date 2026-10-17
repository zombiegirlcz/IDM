package wrh;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.web_sign_in.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, rrh.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/web_sign_in/databinding/ScreenWebSignInConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.webSignInConfirmationScreen_recyclerView;
        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.webSignInConfirmationScreen_twinHorizontalButton;
            TwinHorizontalButton twinHorizontalButton = (TwinHorizontalButton) ViewBindings.findChildViewById(p0, i);
            if (twinHorizontalButton != null) {
                i = R$id.webSignInConfirmationScreen_twinVerticalButton;
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
                if (twinVerticalButton != null) {
                    return new rrh.a((ControllerContainerConstraintLayout) p0, twinHorizontalButton, twinVerticalButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
