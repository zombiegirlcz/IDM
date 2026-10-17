package androidx.compose.ui.tooling;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/PreviewLogger;", "", "Companion", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PreviewLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\nJ!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/tooling/PreviewLogger$Companion;", "", "<init>", "()V", "logWarning", "", "message", "", "throwable", "", "logWarning$ui_tooling", "logError", "logError$ui_tooling", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void logWarning$ui_tooling$default(Companion companion, String str, Throwable th10, int i, Object obj2) {
            if ((i & 2) != 0) {
                th10 = null;
            }
            companion.logWarning$ui_tooling(str, th10);
        }

        public final void logError$ui_tooling(@NotNull String message, Throwable throwable) {
            Log.e("PreviewLogger", message, throwable);
        }

        public final void logWarning$ui_tooling(@NotNull String message, Throwable throwable) {
            Log.w("PreviewLogger", message, throwable);
        }

        private Companion() {
        }
    }
}
