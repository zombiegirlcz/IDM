package ip0;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class md0 extends koi.b {

    @NotNull
    private static final ld0 Companion = new ld0();
    public final LinearGaugeChartView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f165361g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.segmentedLinearGauge_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        LinearGaugeChartView linearGaugeChartView = (LinearGaugeChartView) viewFindViewById;
        this.f = linearGaugeChartView;
        View viewFindViewById2 = itemView.findViewById(R$id.segmentedLinearGauge_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165361g = (AppCompatTextView) viewFindViewById2;
        Context context = linearGaugeChartView.getContext();
        Intrinsics.h(context);
        linearGaugeChartView.setModel(new com.revolut.core.ui_kit.internal.views.e(zhm.v.k(new ms0.s1(1.0f, kli.a.s(R$attr.uikit_colorPerformanceNegative, context), (TextLocalisedClause) null, 12), new ms0.s1(1.0f, kli.a.s(R$attr.uikit_colorPerformanceStatic, context), (TextLocalisedClause) null, 12), new ms0.s1(1.0f, kli.a.s(R$attr.uikit_colorPerformancePositive, context), (TextLocalisedClause) null, 12)), false, 30));
    }
}
