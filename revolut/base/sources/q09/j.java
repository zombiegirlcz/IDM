package q09;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.feature.learn.shared.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.q implements Function1 {
    public static final j f = new j();

    public j() {
        super(1, d09.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/learn/shared/impl/databinding/ScreenLearnLessonBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.lesson_cardsView;
        SwipeableCardsView swipeableCardsView = (SwipeableCardsView) ViewBindings.findChildViewById(p0, i);
        if (swipeableCardsView != null) {
            return new d09.c(controllerContainerCoordinatorLayout, swipeableCardsView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
