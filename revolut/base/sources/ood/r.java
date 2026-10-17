package ood;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.q implements Function1 {
    public static final r f = new r();

    public r() {
        super(1, hmd.h.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/spending_analytics/impl/databinding/ScreenTripsListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.basicNavBar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null) {
            i = R$id.basicNavBar_expandedSubTitle;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
            if (appCompatTextView != null) {
                i = R$id.basicNavBar_expandedTitle;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                if (appCompatTextView2 != null) {
                    i = R$id.tripsListScreen_coordinatorLayout;
                    if (((CoordinatorLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.tripsListScreen_expandableDialogContainer;
                        BottomExpandableDialogView bottomExpandableDialogView = (BottomExpandableDialogView) ViewBindings.findChildViewById(p0, i);
                        if (bottomExpandableDialogView != null) {
                            i = R$id.webView;
                            WebView webView = (WebView) ViewBindings.findChildViewById(p0, i);
                            if (webView != null) {
                                return new hmd.h((ControllerContainerConstraintLayout) p0, basicNavBar, appCompatTextView, appCompatTextView2, bottomExpandableDialogView, webView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
