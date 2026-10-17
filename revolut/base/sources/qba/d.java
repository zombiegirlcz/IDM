package qba;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.pix.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, o8a.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/pix/impl/databinding/ScreenPixQrCodeTransactionAmountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
        int i = R$id.pixQrCodeTransactionAmountScreen_footerContainer;
        LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout = (LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i);
        if (legacyButtonContainerConstraintLayout != null) {
            i = R$id.pixQrCodeTransactionAmountScreen_footerView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.pixQrCodeTransactionAmountScreen_navigationBar;
                NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithAvatar != null) {
                    i = R$id.pixQrCodeTransactionAmountScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.pixQrCodeTransactionAmountScreen_scheduleButton;
                        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                        if (largeActionButton != null) {
                            i = R$id.pixQrCodeTransactionAmountScreen_submitButton;
                            LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                            if (largeActionButton2 != null) {
                                return new o8a.d(controllerContainerConstraintLayout, legacyButtonContainerConstraintLayout, footerTextView, navBarWithAvatar, largeActionButton, largeActionButton2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
