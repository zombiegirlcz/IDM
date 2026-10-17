package r74;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerLinearLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.q implements Function1 {
    public static final x f = new x();

    public x() {
        super(1, aw3.q.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenMediaHeaderCreditPromptBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenMediaHeaderCreditPrompt_firstButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.screenMediaHeaderCreditPrompt_layoutButtons;
            LegacyContentContainerLinearLayout legacyContentContainerLinearLayout = (LegacyContentContainerLinearLayout) ViewBindings.findChildViewById(p0, i);
            if (legacyContentContainerLinearLayout != null) {
                i = R$id.screenMediaHeaderCreditPrompt_navBarWithBigTile;
                NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
                if (navBarWithBigTile != null) {
                    i = R$id.screenMediaHeaderCreditPrompt_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.screenMediaHeaderCreditPrompt_secondButton;
                        LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                        if (largeActionButton2 != null) {
                            return new aw3.q((ControllerContainerCoordinatorLayout) p0, largeActionButton, legacyContentContainerLinearLayout, navBarWithBigTile, largeActionButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
