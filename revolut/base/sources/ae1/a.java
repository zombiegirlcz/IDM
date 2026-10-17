package ae1;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import jd1.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, j.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenLitePosRootBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.litePosRootFlow_container;
        if (((ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
            return new j((ControllerContainerCoordinatorLayout) p0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
