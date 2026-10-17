package hli;

import android.graphics.PointF;
import android.util.SparseArray;
import android.view.WindowInsets;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface e extends ny0.h {

    @NotNull
    public static final d Companion = d.f153466a;

    default void J(SparseArray outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    void J0();

    void N0();

    c W(Lifecycle lifecycle);

    void c0(boolean z);

    default void e(SparseArray state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    String getContainerId();

    boolean getControllersTransitionActive();

    boolean getFitNavigationBar();

    boolean getFitStatusBar();

    @Override // ny0.h
    default boolean getFitsReadableArea() {
        return false;
    }

    WindowInsets getLatestAppliedInsets();

    PointF getLatestDispatchedDownEvent();

    void setContainerId(String str);

    void setFitNavigationBar(boolean z);

    void setFitStatusBar(boolean z);
}
