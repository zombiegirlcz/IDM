package com.fourthline.core.internal.devicedata;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionAngleNormalizer;", "", "<init>", "()V", "", "b", "(D)D", "a", "angle", "normalizeSignedDegrees", "normalizeUnsignedDegrees", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MotionAngleNormalizer {
    private final double a(double d) {
        double dB = b(d);
        return dB >= 180.0d ? dB - ((double) 360) : dB;
    }

    private final double b(double d) {
        double d5 = 360;
        return ((d % d5) + d5) % d5;
    }

    public final double normalizeSignedDegrees(double angle) {
        return a(angle);
    }

    public final double normalizeUnsignedDegrees(double angle) {
        return b(angle);
    }
}
