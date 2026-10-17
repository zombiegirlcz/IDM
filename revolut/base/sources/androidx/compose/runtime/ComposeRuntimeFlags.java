package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\u0006\u0012\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeFlags;", "", "<init>", "()V", "", "isMovingNestedMovableContentEnabled", "Z", "isMovingNestedMovableContentEnabled$annotations", "isMovableContentUsageTrackingEnabled", "isMovableContentUsageTrackingEnabled$annotations", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeRuntimeFlags {
    public static boolean isMovableContentUsageTrackingEnabled;

    @NotNull
    public static final ComposeRuntimeFlags INSTANCE = new ComposeRuntimeFlags();
    public static boolean isMovingNestedMovableContentEnabled = true;
    public static final int $stable = 8;

    private ComposeRuntimeFlags() {
    }
}
