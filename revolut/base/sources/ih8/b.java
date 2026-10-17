package ih8;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.feature.junior_graduation.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ng8.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/junior_graduation/impl/databinding/ScreenJuniorPersonalisedGraduationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenJuniorPersonalisedGraduation_logoWithTaglineView;
        LogoWithTaglineView logoWithTaglineView = (LogoWithTaglineView) ViewBindings.findChildViewById(p0, i);
        if (logoWithTaglineView != null) {
            i = R$id.screenJuniorPersonalisedGraduation_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                return new ng8.a((ControllerContainerConstraintLayout) p0, logoWithTaglineView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
