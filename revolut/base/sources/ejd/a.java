package ejd;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.feature.shops.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, xhd.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/shops/impl/databinding/ScreenShopsPromptBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.shopsPrompt_background;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
        if (animatedBackgroundView != null) {
            i = R$id.shopsPrompt_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                return new xhd.c(controllerContainerCoordinatorLayout, animatedBackgroundView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
