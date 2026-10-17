package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f208217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HistogramView f208218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f208219c;
    public Map d;
    public boolean e;
    public aw0.s5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public aw0.t5 f208220g;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setChartData(@NotNull List<aw0.e5> items, @NotNull Map<String, aw0.y2> itemHeaders, int i, boolean z, aw0.s5 s5Var, aw0.t5 t5Var) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemHeaders, "itemHeaders");
        boolean zF = Intrinsics.f(items, this.f208219c);
        HistogramView histogramView = this.f208218b;
        if (!zF) {
            this.f208219c = items;
            histogramView.setItems(items);
        }
        if (!Intrinsics.f(itemHeaders, this.d)) {
            this.d = itemHeaders;
        }
        if (z != this.e) {
            this.e = z;
            histogramView.setGesturesEnabled(z);
        }
        if (!Intrinsics.f(s5Var, this.f)) {
            this.f = s5Var;
            histogramView.setTooltip(s5Var);
        }
        if (!Intrinsics.f(t5Var, this.f208220g)) {
            this.f208220g = t5Var;
            histogramView.setYAxis(t5Var);
        }
        histogramView.setSelectedPosition(i);
    }

    public final void setHeaderData(@NotNull aw0.y2 header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f208217a.setHeader(header);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f208219c = zhm.f0.f322471a;
        this.d = zhm.r0.g();
        setOrientation(1);
        int i2 = 0;
        setClipChildren(false);
        setClipToPadding(false);
        AttributeSet attributeSet2 = null;
        int i3 = 6;
        e0 e0Var = new e0(context, attributeSet2, i3, i2);
        e0Var.setId(R$id.internal_contextualBarChart_header);
        e0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f208217a = e0Var;
        HistogramView histogramView = new HistogramView(context, attributeSet2, i3, i2);
        histogramView.setId(R$id.internal_contextualBarChart_chart);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, kli.a.k(context, 200.0f));
        layoutParams.topMargin = kli.a.k(context, 16.0f);
        histogramView.setLayoutParams(layoutParams);
        histogramView.setBackgroundEnabled(true);
        histogramView.d(new aw0.q5(BitmapDescriptorFactory.HUE_RED, 40.0f, (aw0.l5) null, aw0.o5.COLOR, aw0.m5.SPACE_EVENLY, (aw0.k0) null, aw0.p5.OVERLAID, 69));
        this.f208218b = histogramView;
        addView(e0Var);
        addView(histogramView);
    }

    public /* synthetic */ d0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
