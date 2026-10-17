package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\"\u0010#\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/ui/input/pointer/util/DefaultVelocityTracker;", "Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "addPointerInputChangeLegacy-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "addPointerInputChangeLegacy", "addPointerInputChangeWithFix-Uv8p0NA", "addPointerInputChangeWithFix", "", "timeMillis", "position", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "maximumVelocity", "calculateVelocity-AH228Gc", "(J)J", "calculateVelocity", "addPointerInputChange-Uv8p0NA", "addPointerInputChange", "resetTracking", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "xVelocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "yVelocityTracker", "currentPointerPositionAccumulator", "J", "getCurrentPointerPositionAccumulator-F1C5BW0$ui", "()J", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui", "(J)V", "lastMoveEventTimeStamp", "getLastMoveEventTimeStamp$ui", "setLastMoveEventTimeStamp$ui", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultVelocityTracker implements PlatformVelocityTracker {
    private long currentPointerPositionAccumulator;
    private long lastMoveEventTimeStamp;

    @NotNull
    private final VelocityTracker1D.Strategy strategy;

    @NotNull
    private final VelocityTracker1D xVelocityTracker;

    @NotNull
    private final VelocityTracker1D yVelocityTracker;

    public DefaultVelocityTracker() {
        VelocityTracker1D.Strategy strategy = VelocityTracker1D.Strategy.Lsq2;
        this.strategy = strategy;
        boolean z = false;
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.xVelocityTracker = new VelocityTracker1D(z, strategy, i, defaultConstructorMarker);
        this.yVelocityTracker = new VelocityTracker1D(z, strategy, i, defaultConstructorMarker);
        this.currentPointerPositionAccumulator = Offset.INSTANCE.m1845getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: addPointerInputChangeLegacy-Uv8p0NA, reason: not valid java name */
    private final void m2507addPointerInputChangeLegacyUv8p0NA(PointerInputChange event, long offset) {
        if (PointerEventKt.changedToDownIgnoreConsumed(event)) {
            this.currentPointerPositionAccumulator = event.getPosition();
            resetTracking();
        }
        long jM2469getPreviousPositionF1C5BW0 = event.getPreviousPosition();
        List<HistoricalChange> historical = event.getHistorical();
        int size = historical.size();
        int i = 0;
        while (i < size) {
            HistoricalChange historicalChange = historical.get(i);
            long jM1838minusMKHz9U = Offset.m1838minusMKHz9U(historicalChange.getPosition(), jM2469getPreviousPositionF1C5BW0);
            long position = historicalChange.getPosition();
            this.currentPointerPositionAccumulator = Offset.m1839plusMKHz9U(this.currentPointerPositionAccumulator, jM1838minusMKHz9U);
            mo2510addPositionUv8p0NA(historicalChange.getUptimeMillis(), Offset.m1839plusMKHz9U(this.currentPointerPositionAccumulator, offset));
            i++;
            jM2469getPreviousPositionF1C5BW0 = position;
        }
        this.currentPointerPositionAccumulator = Offset.m1839plusMKHz9U(this.currentPointerPositionAccumulator, Offset.m1838minusMKHz9U(event.getPosition(), jM2469getPreviousPositionF1C5BW0));
        mo2510addPositionUv8p0NA(event.getUptimeMillis(), Offset.m1839plusMKHz9U(this.currentPointerPositionAccumulator, offset));
    }

    /* JADX INFO: renamed from: addPointerInputChangeWithFix-Uv8p0NA, reason: not valid java name */
    private final void m2508addPointerInputChangeWithFixUv8p0NA(PointerInputChange event, long offset) {
        if (PointerEventKt.changedToDownIgnoreConsumed(event)) {
            resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(event)) {
            List<HistoricalChange> historical = event.getHistorical();
            int size = historical.size();
            for (int i = 0; i < size; i++) {
                HistoricalChange historicalChange = historical.get(i);
                mo2510addPositionUv8p0NA(historicalChange.getUptimeMillis(), Offset.m1839plusMKHz9U(historicalChange.getOriginalEventPosition(), offset));
            }
            mo2510addPositionUv8p0NA(event.getUptimeMillis(), Offset.m1839plusMKHz9U(event.getOriginalEventPosition(), offset));
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(event) && event.getUptimeMillis() - this.lastMoveEventTimeStamp > 40) {
            resetTracking();
        }
        this.lastMoveEventTimeStamp = event.getUptimeMillis();
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* JADX INFO: renamed from: addPointerInputChange-Uv8p0NA, reason: not valid java name */
    public void mo2509addPointerInputChangeUv8p0NA(@NotNull PointerInputChange event, long offset) {
        if (VelocityTrackerKt.getVelocityTrackerAddPointsFix()) {
            m2508addPointerInputChangeWithFixUv8p0NA(event, offset);
        } else {
            m2507addPointerInputChangeLegacyUv8p0NA(event, offset);
        }
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public void mo2510addPositionUv8p0NA(long timeMillis, long position) {
        this.xVelocityTracker.addDataPoint(timeMillis, Float.intBitsToFloat((int) (position >> 32)));
        this.yVelocityTracker.addDataPoint(timeMillis, Float.intBitsToFloat((int) (position & BodyPartID.bodyIdMax)));
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* JADX INFO: renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public long mo2511calculateVelocityAH228Gc(long maximumVelocity) {
        if (!(Velocity.m3397getXimpl(maximumVelocity) > BitmapDescriptorFactory.HUE_RED && Velocity.m3398getYimpl(maximumVelocity) > BitmapDescriptorFactory.HUE_RED)) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m3403toStringimpl(maximumVelocity)));
        }
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m3397getXimpl(maximumVelocity)), this.yVelocityTracker.calculateVelocity(Velocity.m3398getYimpl(maximumVelocity)));
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    public void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }
}
