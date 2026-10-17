package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u000f\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0011\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/geometry/Offset;", "initialPositionChange", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "touchSlop", "calculatePostSlopOffset-tuRUvjQ", "(F)J", "calculatePostSlopOffset", "mainAxis-k-4lQ0M", "(J)F", "mainAxis", "crossAxis-k-4lQ0M", "crossAxis", "currentPosition", "previousPosition", "addPositions-akrDWew", "(JJF)J", "addPositions", "initialPositionAccumulator", "", "reset-k-4lQ0M", "(J)V", "reset", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "totalPositionChange", "J", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TouchSlopDetector {
    private Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, j2);
    }

    /* JADX INFO: renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m798calculatePostSlopOffsettuRUvjQ(float touchSlop) {
        if (this.orientation == null) {
            long j2 = this.totalPositionChange;
            return Offset.m1838minusMKHz9U(this.totalPositionChange, Offset.m1840timestuRUvjQ(Offset.m1830divtuRUvjQ(j2, Offset.m1833getDistanceimpl(j2)), touchSlop));
        }
        float fM802mainAxisk4lQ0M = m802mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m802mainAxisk4lQ0M(this.totalPositionChange)) * touchSlop);
        float fM801crossAxisk4lQ0M = m801crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fM802mainAxisk4lQ0M)) << 32) | (((long) Float.floatToRawIntBits(fM801crossAxisk4lQ0M)) & BodyPartID.bodyIdMax));
        }
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fM801crossAxisk4lQ0M)) << 32) | (((long) Float.floatToRawIntBits(fM802mainAxisk4lQ0M)) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: reset-k-4lQ0M$default, reason: not valid java name */
    public static /* synthetic */ void m799resetk4lQ0M$default(TouchSlopDetector touchSlopDetector, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = Offset.INSTANCE.m1845getZeroF1C5BW0();
        }
        touchSlopDetector.m803resetk4lQ0M(j2);
    }

    /* JADX INFO: renamed from: addPositions-akrDWew, reason: not valid java name */
    public final long m800addPositionsakrDWew(long currentPosition, long previousPosition, float touchSlop) {
        long jM1839plusMKHz9U = Offset.m1839plusMKHz9U(this.totalPositionChange, Offset.m1838minusMKHz9U(currentPosition, previousPosition));
        this.totalPositionChange = jM1839plusMKHz9U;
        return (this.orientation == null ? Offset.m1833getDistanceimpl(jM1839plusMKHz9U) : Math.abs(m802mainAxisk4lQ0M(jM1839plusMKHz9U))) >= touchSlop ? m798calculatePostSlopOffsettuRUvjQ(touchSlop) : Offset.INSTANCE.m1844getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m801crossAxisk4lQ0M(long j2) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j2 & BodyPartID.bodyIdMax : j2 >> 32));
    }

    /* JADX INFO: renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m802mainAxisk4lQ0M(long j2) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j2 >> 32 : j2 & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: reset-k-4lQ0M, reason: not valid java name */
    public final void m803resetk4lQ0M(long initialPositionAccumulator) {
        this.totalPositionChange = initialPositionAccumulator;
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    private TouchSlopDetector(Orientation orientation, long j2) {
        this.orientation = orientation;
        this.totalPositionChange = j2;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orientation, (i & 2) != 0 ? Offset.INSTANCE.m1845getZeroF1C5BW0() : j2, null);
    }
}
