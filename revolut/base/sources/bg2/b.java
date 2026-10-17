package bg2;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.apm.upi.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, gf2.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/upi/impl/databinding/ScreenUpiTransferAmountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
        int i = R$id.upiTransferAmountScreen_footerContainer;
        LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout = (LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i);
        if (legacyButtonContainerConstraintLayout != null) {
            i = R$id.upiTransferAmountScreen_footerView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.upiTransferAmountScreen_logoView;
                CutoutImageView cutoutImageView = (CutoutImageView) ViewBindings.findChildViewById(p0, i);
                if (cutoutImageView != null) {
                    i = R$id.upiTransferAmountScreen_navigationBar;
                    NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
                    if (navBarWithAvatar != null) {
                        i = R$id.upiTransferAmountScreen_recyclerView;
                        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                            i = R$id.upiTransferAmountScreen_scheduleButton;
                            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                            if (largeActionButton != null) {
                                i = R$id.upiTransferAmountScreen_submitButton;
                                LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                                if (largeActionButton2 != null) {
                                    return new gf2.c(controllerContainerConstraintLayout, legacyButtonContainerConstraintLayout, footerTextView, cutoutImageView, navBarWithAvatar, largeActionButton, largeActionButton2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
