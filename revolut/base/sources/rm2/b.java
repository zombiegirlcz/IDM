package rm2;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.backgroundpicker.impl.R$id;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, mm2.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/backgroundpicker/impl/databinding/ScreenBackgroundCatalogueBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.backgroundCatalogue_navbar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null) {
            i = R$id.backgroundCatalogue_pager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
            if (viewPager2 != null) {
                i = R$id.backgroundCatalogue_tabs;
                Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                if (tabs != null) {
                    return new mm2.a((ControllerContainerLinearLayout) p0, basicNavBar, viewPager2, tabs);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
