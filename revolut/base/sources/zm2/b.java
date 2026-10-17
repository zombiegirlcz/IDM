package zm2;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.CroppingLayoutView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarCroppingAreaView;
import com.revolut.feature.backgroundpicker.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, mm2.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/backgroundpicker/impl/databinding/ScreenUploadBackgroundBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.croppingLayout_croppingAreaView;
        if (((NavBarCroppingAreaView) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.goToButton;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.screenUploadBackground_croppingLayout;
                CroppingLayoutView croppingLayoutView = (CroppingLayoutView) ViewBindings.findChildViewById(p0, i);
                if (croppingLayoutView != null) {
                    i = R$id.screenUploadBackground_navBar;
                    BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                    if (basicNavBar != null) {
                        return new mm2.c((ControllerContainerFrameLayout) p0, largeActionButton, croppingLayoutView, basicNavBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
