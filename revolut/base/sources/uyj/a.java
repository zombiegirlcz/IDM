package uyj;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.learn.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, lyj.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/learn/impl/databinding/ScreenShareRewardsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.shareRewards_recyclerView;
        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
            return new lyj.c((ControllerContainerCoordinatorLayout) p0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
