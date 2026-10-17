package i09;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.learn.shared.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, d09.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/learn/shared/impl/databinding/ScreenCourseOverviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.courseOverview_navBar;
        NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
        if (navBarWithBigTile != null) {
            i = R$id.courseOverview_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                return new d09.a((ControllerContainerCoordinatorLayout) p0, navBarWithBigTile, screenContentRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
