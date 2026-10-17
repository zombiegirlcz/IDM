package zml;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, jii.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/FlowRootBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.container;
        if (((ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.containerModal;
            ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i);
            if (controllerContainerFrameLayout != null) {
                return new jii.c((ControllerContainerFrameLayout) p0, controllerContainerFrameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
