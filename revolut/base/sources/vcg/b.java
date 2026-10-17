package vcg;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import c9g.r;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, r.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsPropertyMapPreviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.travelHotelsPropertyMapPreviewScreen_map;
        MapView mapView = (MapView) ViewBindings.findChildViewById(p0, i);
        if (mapView != null) {
            i = R$id.travelHotelsPropertyMapPreviewScreen_navBar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
            if (basicNavBar != null) {
                return new r((ControllerContainerConstraintLayout) p0, mapView, basicNavBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
