package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LimitProgressBarWithChartHeader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gt extends koi.b {
    public final LimitProgressBarWithChartHeader f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.limitProgressBarWithText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (LimitProgressBarWithChartHeader) viewFindViewById;
    }
}
