package ps0;

import androidx.core.view.GestureDetectorCompat;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarChartView f239352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt0.e f239353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GestureDetectorCompat f239354c;

    public d(BarChartView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f239352a = view;
        kt0.e eVar = new kt0.e(this);
        this.f239353b = eVar;
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(view.getContext(), eVar);
        gestureDetectorCompat.setIsLongpressEnabled(false);
        this.f239354c = gestureDetectorCompat;
    }
}
