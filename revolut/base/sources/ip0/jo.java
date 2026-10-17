package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.barchart.HorizontalBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jo extends koi.b {
    public final HorizontalBarView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.horizontalBarDelegate_horizontalBarView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (HorizontalBarView) viewFindViewById;
    }
}
