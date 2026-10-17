package qx2;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBindings;
import com.revolut.feature.card_design.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, dy2.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_design/impl/databinding/ScreenCardVideoPreviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenCardVideoPreview_closeIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(p0, i);
        if (appCompatImageView != null) {
            i = R$id.screenCardVideoPreview_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                return new dy2.b((ControllerContainerConstraintLayout) p0, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
