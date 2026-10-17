package whi;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.kompot.bridge.impl.R$id;
import com.revolut.kompot.common.view.ControllerContainerSliderLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, qhi.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/bridge/impl/databinding/FlowBridgeRootBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.bridgeRoot_containerModal;
        ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i);
        if (controllerContainerFrameLayout != null) {
            i = R$id.root_sliding_container;
            ControllerContainerSliderLayout controllerContainerSliderLayout = (ControllerContainerSliderLayout) ViewBindings.findChildViewById(p0, i);
            if (controllerContainerSliderLayout != null) {
                return new qhi.a((ControllerContainerFrameLayout) p0, controllerContainerFrameLayout, controllerContainerSliderLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
