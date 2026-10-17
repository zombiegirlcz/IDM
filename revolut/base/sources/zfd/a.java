package zfd;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.feature.shared_separate_favourites.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, kgd.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/shared_separate_favourites/databinding/ScreenRev10AddAssetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenRev10AddAsset_recyclerView;
        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
        if (screenContentRecyclerView != null) {
            return new kgd.c((ControllerContainerFrameLayout) p0, screenContentRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
