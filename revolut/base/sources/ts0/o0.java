package ts0;

import android.content.Context;
import android.graphics.RectF;
import androidx.core.view.GestureDetectorCompat;
import com.revolut.core.ui_kit.internal.views.chart.SegmentedChartView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 {

    @NotNull
    private static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SegmentedChartView f273895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.core.ui_kit.internal.views.chart.i f273896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f273897c;
    public final GestureDetectorCompat d;
    public final int e;

    public o0(SegmentedChartView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f273895a = view;
        com.revolut.core.ui_kit.internal.views.chart.i iVar = new com.revolut.core.ui_kit.internal.views.chart.i(this);
        this.f273896b = iVar;
        this.f273897c = new RectF();
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(view.getContext(), iVar);
        gestureDetectorCompat.setIsLongpressEnabled(false);
        this.d = gestureDetectorCompat;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.e = kli.a.k(context, 42.0f);
    }
}
