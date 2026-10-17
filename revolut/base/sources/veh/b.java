package veh;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.feature.wealth.options.ui.impl.R$id;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, peh.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/wealth/options/ui/impl/databinding/FeatureWealthOptionsTabBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.contractTypeTabs;
        FixedTabs fixedTabs = (FixedTabs) ViewBindings.findChildViewById(p0, i);
        if (fixedTabs != null) {
            i = R$id.expirationDatesTabs;
            Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
            if (tabs != null) {
                i = R$id.recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new peh.a((ControllerContainerLinearLayout) p0, fixedTabs, tabs);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
