package androidx.compose.ui.input.pointer.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "<init>", "()V", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "maximumVelocity", "calculateVelocity-AH228Gc", "(J)J", "calculateVelocity", "resetTracking", "Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;", "platformVelocityTracker", "Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;", "getPlatformVelocityTracker$ui", "()Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VelocityTracker {

    @NotNull
    private final PlatformVelocityTracker platformVelocityTracker = PlatformVelocityTracker_androidKt.PlatformVelocityTracker();

    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m2513addPositionUv8p0NA(long timeMillis, long position) {
        this.platformVelocityTracker.mo2510addPositionUv8p0NA(timeMillis, position);
    }

    /* JADX INFO: renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m2514calculateVelocityAH228Gc(long maximumVelocity) {
        return this.platformVelocityTracker.mo2511calculateVelocityAH228Gc(maximumVelocity);
    }

    @NotNull
    /* JADX INFO: renamed from: getPlatformVelocityTracker$ui, reason: from getter */
    public final PlatformVelocityTracker getPlatformVelocityTracker() {
        return this.platformVelocityTracker;
    }

    public final void resetTracking() {
        this.platformVelocityTracker.resetTracking();
    }
}
