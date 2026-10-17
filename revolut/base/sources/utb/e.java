package utb;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView;
import com.revolut.feature.rev10_main_screen.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, ktb.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev10_main_screen/impl/databinding/FlowSlideMainContainerScreenBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) p0;
        int i = R$id.sliding_dimmer;
        SlidingDimmerView slidingDimmerView = (SlidingDimmerView) ViewBindings.findChildViewById(p0, i);
        if (slidingDimmerView != null) {
            return new ktb.b(controllerContainerFrameLayout, controllerContainerFrameLayout, slidingDimmerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
