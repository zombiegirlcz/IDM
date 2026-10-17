package b73;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.card_screen.impl.R$id;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, g73.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_screen/impl/databinding/ScreenCardSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerLinearLayout controllerContainerLinearLayout = (ControllerContainerLinearLayout) p0;
        int i = R$id.navBarBottomSheet_NavBar;
        NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(p0, i);
        if (navBarBottomSheet != null) {
            i = R$id.navBarBottomSheet_RecyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                return new g73.b(controllerContainerLinearLayout, navBarBottomSheet);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
