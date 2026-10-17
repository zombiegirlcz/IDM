package ead;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.shared.invoices.impl.R$id;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, aad.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/shared/invoices/impl/databinding/ScreenInvoicePreviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.invoicePreview_navBar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null) {
            i = R$id.invoicePreview_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.invoicePreview_tabs;
                FixedTabs fixedTabs = (FixedTabs) ViewBindings.findChildViewById(p0, i);
                if (fixedTabs != null) {
                    return new aad.a((ControllerContainerLinearLayout) p0, basicNavBar, fixedTabs);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
