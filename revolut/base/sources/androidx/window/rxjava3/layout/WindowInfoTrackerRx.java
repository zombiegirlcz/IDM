package androidx.window.rxjava3.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.layout.WindowInfoTracker;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uc0.b;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "Landroid/app/Activity;", "activity", "Lio/reactivex/rxjava3/core/Observable;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfoObservable", "(Landroidx/window/layout/WindowInfoTracker;Landroid/app/Activity;)Lio/reactivex/rxjava3/core/Observable;", "Landroid/content/Context;", "context", "(Landroidx/window/layout/WindowInfoTracker;Landroid/content/Context;)Lio/reactivex/rxjava3/core/Observable;", "window-rxjava3_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class WindowInfoTrackerRx {
    @NotNull
    public static final Observable windowLayoutInfoObservable(@NotNull WindowInfoTracker windowInfoTracker, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(windowInfoTracker, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        return b.c(windowInfoTracker.windowLayoutInfo(activity));
    }

    @NotNull
    public static final Observable windowLayoutInfoObservable(@NotNull WindowInfoTracker windowInfoTracker, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(windowInfoTracker, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return b.c(windowInfoTracker.windowLayoutInfo(context));
    }
}
