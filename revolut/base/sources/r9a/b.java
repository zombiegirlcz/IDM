package r9a;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.pix.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, o8a.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/pix/impl/databinding/ScreenPixAuthorisationTransactionLimitBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
        int i = R$id.pixQrCodeTransactionLimitScreen_footerContainer;
        if (((LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.pixQrCodeTransactionLimitScreen_footerView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.pixQrCodeTransactionLimitScreen_navigationBar;
                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                if (basicNavBar != null) {
                    i = R$id.pixQrCodeTransactionLimitScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.pixQrCodeTransactionLimitScreen_submitButton;
                        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                        if (largeActionButton != null) {
                            return new o8a.b(controllerContainerConstraintLayout, footerTextView, basicNavBar, largeActionButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
