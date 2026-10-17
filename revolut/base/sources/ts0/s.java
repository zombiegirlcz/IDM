package ts0;

import android.graphics.RectF;
import androidx.core.view.GestureDetectorCompat;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistogramView f273903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.core.ui_kit.internal.views.chart.f f273904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f273905c;
    public final GestureDetectorCompat d;

    public s(HistogramView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f273903a = view;
        com.revolut.core.ui_kit.internal.views.chart.f fVar = new com.revolut.core.ui_kit.internal.views.chart.f(this);
        this.f273904b = fVar;
        this.f273905c = new RectF();
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(view.getContext(), fVar);
        gestureDetectorCompat.setIsLongpressEnabled(false);
        this.d = gestureDetectorCompat;
    }
}
