package kt0;

import android.view.GestureDetector;
import com.revolut.core.ui_kit.internal.views.epschart.EpsChartView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EpsChartView f189497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f189498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GestureDetector f189499c;

    public f(EpsChartView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f189497a = view;
        e eVar = new e(this);
        this.f189498b = eVar;
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), eVar);
        gestureDetector.setIsLongpressEnabled(false);
        this.f189499c = gestureDetector;
    }
}
