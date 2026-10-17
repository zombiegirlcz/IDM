package androidx.glance.appwidget;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/glance/appwidget/Tracing;", "", "<init>", "()V", "", "beginGlanceAppWidgetUpdate", "endGlanceAppWidgetUpdate", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getEnabled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Tracing {

    @NotNull
    public static final Tracing INSTANCE = new Tracing();

    @NotNull
    private static final AtomicBoolean enabled = new AtomicBoolean(false);
    public static final int $stable = 8;

    private Tracing() {
    }

    public final void beginGlanceAppWidgetUpdate() {
        if (Build.VERSION.SDK_INT < 29 || !enabled.get()) {
            return;
        }
        TracingApi29Impl.INSTANCE.beginAsyncSection("GlanceAppWidget::update", 0);
    }

    public final void endGlanceAppWidgetUpdate() {
        if (Build.VERSION.SDK_INT < 29 || !enabled.get()) {
            return;
        }
        TracingApi29Impl.INSTANCE.endAsyncSection("GlanceAppWidget::update", 0);
    }
}
