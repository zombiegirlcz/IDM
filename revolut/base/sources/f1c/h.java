package f1c;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, wxb.p.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsWrappedCardsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.revPointsWrappedCardsScreen_cardsView;
        SwipeableCardsView swipeableCardsView = (SwipeableCardsView) ViewBindings.findChildViewById(p0, i);
        if (swipeableCardsView != null) {
            return new wxb.p((ControllerContainerCoordinatorLayout) p0, swipeableCardsView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
