package imk;

import android.view.View;
import androidx.core.view.ViewGroupKt;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f162504a = zhm.f0.f322471a;

    public final void a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        Iterator it8 = this.f162504a.iterator();
        while (it8.hasNext()) {
            controllerContainerCoordinatorLayout.removeView((View) it8.next());
        }
        Iterator it9 = ViewGroupKt.getChildren(controllerContainerCoordinatorLayout).iterator();
        Intrinsics.i(it9, "null cannot be cast to non-null type kotlin.collections.MutableIterator<android.view.View>");
        u0.b(it9);
        while (it9.hasNext()) {
            if (((View) it9.next()) instanceof NavBarWithContainerHeaderView) {
                it9.remove();
            }
        }
    }
}
