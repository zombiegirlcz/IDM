package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.gridselector.GridSelectorView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cl extends koi.b {
    public final GridSelectorView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.gridSingleChoice_selector);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (GridSelectorView) viewFindViewById;
    }
}
