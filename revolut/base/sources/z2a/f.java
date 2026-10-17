package z2a;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.feature.payments.transfers.personalisation.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, l2a.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/transfers/personalisation/impl/databinding/TransferPersonalisationStyleScreenBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.personalisationStyle_indicator;
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = (ScrollingPagerIndicatorView) ViewBindings.findChildViewById(p0, i);
        if (scrollingPagerIndicatorView != null) {
            i = R$id.personalisationStyle_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                return new l2a.c((ControllerContainerConstraintLayout) p0, scrollingPagerIndicatorView, screenContentRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
