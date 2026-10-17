package ud6;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.feature.esim.instructions.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, pd6.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/esim/instructions/databinding/ScreenEsimInstructionsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.esimInstructionsScreen_cardsView;
        SwipeableCardsView swipeableCardsView = (SwipeableCardsView) ViewBindings.findChildViewById(p0, i);
        if (swipeableCardsView != null) {
            return new pd6.a((ControllerContainerCoordinatorLayout) p0, swipeableCardsView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
