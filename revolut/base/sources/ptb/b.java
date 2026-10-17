package ptb;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.feature.rev10_main_screen.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ktb.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev10_main_screen/impl/databinding/FlowMainContainerScreenBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.main_screen_tab_content;
        ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i);
        if (controllerContainerFrameLayout != null) {
            return new ktb.a((ControllerContainerCoordinatorLayout) p0, controllerContainerFrameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
