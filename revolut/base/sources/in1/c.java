package in1;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.apm.bills.boleto.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, rm1.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/bills/boleto/impl/databinding/ScreenBoletoAmountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
        int i = R$id.boletoAmountScreen_footerContainer;
        LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout = (LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i);
        if (legacyButtonContainerConstraintLayout != null) {
            i = R$id.boletoAmountScreen_footerView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.boletoAmountScreen_navigationBar;
                NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithAvatar != null) {
                    i = R$id.boletoAmountScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.boletoAmountScreen_scheduleButton;
                        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                        if (largeActionButton != null) {
                            i = R$id.boletoAmountScreen_submitButton;
                            LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                            if (largeActionButton2 != null) {
                                return new rm1.a(controllerContainerConstraintLayout, legacyButtonContainerConstraintLayout, footerTextView, navBarWithAvatar, largeActionButton, largeActionButton2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
