package vgf;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.feature.transaction_list.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.q implements Function1 {
    public static final i f = new i();

    public i() {
        super(1, jgf.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/transaction_list/impl/databinding/ScreenTransactionsTabBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenTransactionsTab_recyclerView;
        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
        if (screenContentRecyclerView != null) {
            return new jgf.b((ControllerContainerCoordinatorLayout) p0, screenContentRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
