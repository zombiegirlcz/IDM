package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import aw0.z6;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f208244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LineChartView f208245b;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet = null;
        int i = 6;
        int i2 = 0;
        e0 e0Var = new e0(context, attributeSet, i, i2);
        e0Var.setId(R$id.internal_contextualLineChart_header);
        e0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        e0Var.setPaddingRelative(0, 0, 0, kli.a.k(context, 16.0f));
        this.f208244a = e0Var;
        LineChartView lineChartView = new LineChartView(context, attributeSet, i, i2);
        lineChartView.setId(R$id.internal_contextualLineChart_chart);
        lineChartView.setFeatureConfig(new ts0.h0(ts0.f0.DOT, ts0.g0.OVERLAY, 2));
        lineChartView.setLineChartViewParams(new z6(R$attr.internal_textAppearanceBody3, R$attr.internal_textAppearanceEmphasis4, 3));
        lineChartView.setLayoutParams(new LinearLayout.LayoutParams(-1, kli.a.k(context, 200.0f)));
        this.f208245b = lineChartView;
        setOrientation(1);
        addView(e0Var);
        addView(lineChartView);
    }

    @NotNull
    public final LineChartView getChartView$ui_kit_components_release() {
        return this.f208245b;
    }

    @NotNull
    public final e0 getHeaderView$ui_kit_components_release() {
        return this.f208244a;
    }
}
