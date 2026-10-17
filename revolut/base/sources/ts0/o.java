package ts0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import aw0.a2;
import aw0.o9;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends us0.f {
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f273893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComparisonLineChartView f273894h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ComparisonLineChartView comparisonLineChartView) {
        super(comparisonLineChartView, us0.b.LINE_CHART);
        this.f273894h = comparisonLineChartView;
        this.f = new RectF();
        this.f273893g = new Rect();
    }

    @Override // us0.f
    public final Clause a() {
        this.f273894h.getData().getClass();
        return null;
    }

    @Override // us0.f
    public final Rect b() {
        Rect rect = this.f273893g;
        rect.top = 0;
        ComparisonLineChartView comparisonLineChartView = this.f273894h;
        rect.bottom = comparisonLineChartView.getHeight();
        rect.left = 0;
        rect.right = comparisonLineChartView.getWidth();
        return rect;
    }

    @Override // us0.f
    public final int c(float f, float f4) {
        ComparisonLineChartView comparisonLineChartView = this.f273894h;
        int size = comparisonLineChartView.getData().f10617b.size();
        int i = -1;
        if (size == 0) {
            return -1;
        }
        float f5 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            float fAbs = Math.abs(comparisonLineChartView.g(i2) - f);
            if (fAbs < f5) {
                i = i2;
                f5 = fAbs;
            }
        }
        return i;
    }

    @Override // us0.f
    public final void d(List virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
        int size = this.f273894h.getData().f10617b.size();
        for (int i = 0; i < size; i++) {
            virtualViewIds.add(Integer.valueOf(i));
        }
    }

    @Override // us0.f
    public final void e(int i, AccessibilityNodeInfoCompat node) {
        Intrinsics.checkNotNullParameter(node, "node");
        ComparisonLineChartView comparisonLineChartView = this.f273894h;
        a2 a2Var = (a2) comparisonLineChartView.getData().f10617b.get(i);
        Clause textClause = a2Var.f10223b;
        if (textClause == null) {
            float f = a2Var.f10222a;
            Clause clause = comparisonLineChartView.getData().d;
            MoneyClause moneyClause = clause instanceof MoneyClause ? (MoneyClause) clause : null;
            textClause = moneyClause == null ? new TextClause(String.valueOf(f), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : MoneyClause.b(moneyClause, dj0.d.c(moneyClause.f57821a, (long) f, null, 2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        ty0.c cVarB0 = or0.u.k(comparisonLineChartView).b0();
        Context context = comparisonLineChartView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        node.setContentDescription(ty0.c.a(cVarB0, textClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        ComparisonLineChartView.Companion companion = ComparisonLineChartView.INSTANCE;
        float fG = comparisonLineChartView.g(i);
        float f4 = comparisonLineChartView.F > 1 ? (comparisonLineChartView.B / (r4 - 1)) / 2.0f : comparisonLineChartView.B / 2.0f;
        float f5 = comparisonLineChartView.i;
        float f6 = comparisonLineChartView.C + f5;
        RectF rectF = this.f;
        rectF.set(fG - f4, f5, fG + f4, f6);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        node.setBoundsInParent(rect);
    }
}
