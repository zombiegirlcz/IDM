package ip0;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vb0 extends koi.b {
    public final ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LineChartView f166804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f166805h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ViewGroup) itemView.findViewById(R$id.internalDelegateRowPlaceholder_root);
        this.f166804g = (LineChartView) itemView.findViewById(R$id.internalDelegateRowPlaceholder_chart);
        this.f166805h = te0.w.y0(new e70(5));
        this.i = te0.w.y0(new e70(6));
    }
}
