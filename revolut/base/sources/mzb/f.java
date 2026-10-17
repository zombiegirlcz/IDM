package mzb;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, wxb.e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsLearnBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.revPointsLearnScreen_cardsView;
        SwipeableCardsView swipeableCardsView = (SwipeableCardsView) ViewBindings.findChildViewById(p0, i);
        if (swipeableCardsView != null) {
            return new wxb.e((ControllerContainerCoordinatorLayout) p0, swipeableCardsView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
