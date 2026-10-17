package androidx.compose.ui.input.pointer.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"PlatformVelocityTracker", "Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PlatformVelocityTracker_androidKt {
    @NotNull
    public static final PlatformVelocityTracker PlatformVelocityTracker() {
        return new DefaultVelocityTracker();
    }
}
