package com.fourthline.core.internal.devicedata;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionFusedOrientationNormalizer;", "", "", "maxGyroscopeDeltaSeconds", "<init>", "(D)V", "", "a", "()V", "b", "", "gyroscopeValues", "", "timestampNanos", "onGyroscopeEvent$fourthline_core_release", "([FJ)V", "onGyroscopeEvent", "", "hasGyroscopeData", "Lcom/fourthline/core/internal/devicedata/Orientation;", "currentFallbackOrientation$fourthline_core_release", "(Z)Lcom/fourthline/core/internal/devicedata/Orientation;", "currentFallbackOrientation", "D", "Lcom/fourthline/core/internal/devicedata/MotionAngleNormalizer;", "Lcom/fourthline/core/internal/devicedata/MotionAngleNormalizer;", "angleNormalizer", "c", "fusedPitch", "d", "fusedRoll", "e", "fusedYaw", "f", "J", "lastFusionTimestampNanos", "g", "Z", "initialized", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MotionFusedOrientationNormalizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final double maxGyroscopeDeltaSeconds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MotionAngleNormalizer angleNormalizer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private double fusedPitch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private double fusedRoll;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private double fusedYaw;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long lastFusionTimestampNanos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    public MotionFusedOrientationNormalizer() {
        this(0.0d, 1, null);
    }

    private final void a() {
        if (this.initialized) {
            return;
        }
        this.fusedPitch = 0.0d;
        this.fusedRoll = 0.0d;
        this.fusedYaw = 0.0d;
        this.initialized = true;
    }

    private final void b() {
        this.fusedPitch = this.angleNormalizer.normalizeSignedDegrees(this.fusedPitch);
        this.fusedRoll = this.angleNormalizer.normalizeSignedDegrees(this.fusedRoll);
        this.fusedYaw = this.angleNormalizer.normalizeSignedDegrees(this.fusedYaw);
    }

    public final Orientation currentFallbackOrientation$fourthline_core_release(boolean hasGyroscopeData) {
        if (!hasGyroscopeData || !this.initialized) {
            return null;
        }
        b();
        double dNormalizeSignedDegrees = this.angleNormalizer.normalizeSignedDegrees(this.fusedYaw);
        return new Orientation(this.fusedPitch, this.fusedRoll, dNormalizeSignedDegrees, this.angleNormalizer.normalizeUnsignedDegrees(-dNormalizeSignedDegrees));
    }

    public final void onGyroscopeEvent$fourthline_core_release(@NotNull float[] gyroscopeValues, long timestampNanos) {
        Intrinsics.checkNotNullParameter(gyroscopeValues, "gyroscopeValues");
        if (this.lastFusionTimestampNanos <= 0) {
            a();
            this.lastFusionTimestampNanos = timestampNanos;
            return;
        }
        double d = (timestampNanos - r0) / 1.0E9d;
        this.lastFusionTimestampNanos = timestampNanos;
        if (d <= 0.0d || d > this.maxGyroscopeDeltaSeconds) {
            return;
        }
        a();
        this.fusedPitch += Math.toDegrees(((double) gyroscopeValues[0]) * d);
        this.fusedRoll += Math.toDegrees(((double) gyroscopeValues[1]) * d);
        this.fusedYaw += Math.toDegrees(((double) gyroscopeValues[2]) * d);
        b();
    }

    public MotionFusedOrientationNormalizer(double d) {
        this.maxGyroscopeDeltaSeconds = d;
        this.angleNormalizer = new MotionAngleNormalizer();
    }

    public /* synthetic */ MotionFusedOrientationNormalizer(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0d : d);
    }
}
