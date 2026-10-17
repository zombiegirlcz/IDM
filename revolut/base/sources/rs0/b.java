package rs0;

import android.content.Context;
import android.graphics.Rect;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import aw0.ka;
import aw0.o9;
import aw0.r0;
import aw0.z8;
import com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.youTransactor.uCube.rpc.Constants;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends us0.f {
    public final Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f256903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ CandleSticksView f256904h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CandleSticksView candleSticksView) {
        super(candleSticksView, us0.b.CANDLE_CHART);
        this.f256904h = candleSticksView;
        this.f = new Rect();
        this.f256903g = new Rect();
    }

    @Override // us0.f
    public final Clause a() {
        return this.f256904h.getContentDescription();
    }

    @Override // us0.f
    public final Rect b() {
        Rect rect = this.f;
        rect.left = 0;
        rect.top = 0;
        CandleSticksView candleSticksView = this.f256904h;
        rect.right = candleSticksView.getWidth();
        rect.bottom = candleSticksView.getHeight();
        return rect;
    }

    @Override // us0.f
    public final int c(float f, float f4) {
        int iF = f();
        int i = -1;
        if (iF == 0) {
            return -1;
        }
        float f5 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < iF; i2++) {
            float fAbs = Math.abs(((g) this.f256904h.f56570l.get(i2)).f256919a - f);
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
        int iF = f();
        for (int i = 0; i < iF; i++) {
            virtualViewIds.add(Integer.valueOf(i));
        }
    }

    @Override // us0.f
    public final void e(int i, AccessibilityNodeInfoCompat node) {
        CandleSticksView candleSticksView;
        z8 plotData;
        r0 r0Var;
        c copies;
        Intrinsics.checkNotNullParameter(node, "node");
        if (i >= f() || (plotData = (candleSticksView = this.f256904h).getPlotData()) == null || (r0Var = (r0) d0.e0(i, plotData.f10648c)) == null || (copies = candleSticksView.getCopies()) == null) {
            return;
        }
        ty0.c cVarB0 = u.k(candleSticksView).b0();
        CompositeClause compositeClause = new CompositeClause(v.k(new TimeClause(r0Var.f10500a, new TimeClause.Format.DayAndMonth(ka.FULL), null, null, 12), g(r0Var, copies.f256905a, r0Var.f10502c), g(r0Var, copies.d, r0Var.f), g(r0Var, copies.f256907c, r0Var.e), g(r0Var, copies.f256906b, r0Var.d)), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        Context context = candleSticksView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        node.setContentDescription(ty0.c.a(cVarB0, compositeClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        float f = ((g) candleSticksView.f56570l.get(i)).f256919a;
        z8 plotData2 = candleSticksView.getPlotData();
        float f4 = (plotData2 != null ? plotData2.f10648c.size() : 0) > 1 ? ((candleSticksView.f56574q - candleSticksView.f56573p) / (r15 - 1)) / 2.0f : (candleSticksView.f56574q - candleSticksView.f56573p) / 2.0f;
        int i2 = (int) (f - f4);
        int i3 = (int) candleSticksView.f56575r;
        int i5 = (int) (f + f4);
        int i6 = (int) candleSticksView.f56577t;
        Rect rect = this.f256903g;
        rect.set(i2, i3, i5, i6);
        node.setBoundsInParent(rect);
    }

    public final int f() {
        CandleSticksView candleSticksView = this.f256904h;
        z8 plotData = candleSticksView.getPlotData();
        return Math.min(plotData != null ? plotData.f10648c.size() : 0, candleSticksView.f56570l.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CompositeClause g(r0 r0Var, Clause clause, BigDecimal bigDecimal) {
        Clause[] elements = {clause, this.f256904h.getSelectedCandleFormat().a().invoke(new ej0.b(bigDecimal, r0Var.f10504h))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
    }
}
