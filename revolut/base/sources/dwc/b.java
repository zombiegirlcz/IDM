package dwc;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, utc.f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/security_hub/impl/databinding/ScreenTransactionsDayNightLimitsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.transactionsDayNightLimitsScreen_recyclerView;
        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
        if (screenContentRecyclerView != null) {
            return new utc.f((ControllerContainerCoordinatorLayout) p0, screenContentRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
