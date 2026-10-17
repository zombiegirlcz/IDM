package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.gridselector.GridHeaderView;
import com.revolut.core.ui_kit.internal.views.gridselector.GridSelectorView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wp0 extends koi.b {
    public final GridSelectorView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GridHeaderView f167055g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.monthPicker_selector);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (GridSelectorView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.monthPicker_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167055g = (GridHeaderView) viewFindViewById2;
    }
}
