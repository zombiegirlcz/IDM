package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.epschart.EpsChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yf extends koi.b {
    public final EpsChartView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (EpsChartView) itemView.findViewById(R$id.epsChartView);
    }
}
