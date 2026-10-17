package com.fourthline.core.internal.devicedata;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\n¨\u0006#"}, d2 = {"Lcom/fourthline/core/internal/devicedata/Orientation;", "", "", "pitch", "roll", "yaw", "azimuth", "<init>", "(DDDD)V", "component1", "()D", "component2", "component3", "component4", "copy", "(DDDD)Lcom/fourthline/core/internal/devicedata/Orientation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getPitch", "b", "getRoll", "c", "getYaw", "d", "getAzimuth", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Orientation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final double pitch;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final double roll;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double yaw;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double azimuth;

    public Orientation(double d, double d5, double d6, double d10) {
        this.pitch = d;
        this.roll = d5;
        this.yaw = d6;
        this.azimuth = d10;
    }

    public static /* synthetic */ Orientation copy$default(Orientation orientation, double d, double d5, double d6, double d10, int i, Object obj2) {
        if ((i & 1) != 0) {
            d = orientation.pitch;
        }
        double d15 = d;
        if ((i & 2) != 0) {
            d5 = orientation.roll;
        }
        double d41 = d5;
        if ((i & 4) != 0) {
            d6 = orientation.yaw;
        }
        return orientation.copy(d15, d41, d6, (i & 8) != 0 ? orientation.azimuth : d10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getPitch() {
        return this.pitch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getRoll() {
        return this.roll;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getYaw() {
        return this.yaw;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAzimuth() {
        return this.azimuth;
    }

    @NotNull
    public final Orientation copy(double pitch, double roll, double yaw, double azimuth) {
        return new Orientation(pitch, roll, yaw, azimuth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Orientation)) {
            return false;
        }
        Orientation orientation = (Orientation) other;
        return Double.compare(this.pitch, orientation.pitch) == 0 && Double.compare(this.roll, orientation.roll) == 0 && Double.compare(this.yaw, orientation.yaw) == 0 && Double.compare(this.azimuth, orientation.azimuth) == 0;
    }

    public final double getAzimuth() {
        return this.azimuth;
    }

    public final double getPitch() {
        return this.pitch;
    }

    public final double getRoll() {
        return this.roll;
    }

    public final double getYaw() {
        return this.yaw;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.pitch) * 31) + Double.hashCode(this.roll)) * 31) + Double.hashCode(this.yaw)) * 31) + Double.hashCode(this.azimuth);
    }

    @NotNull
    public String toString() {
        return "Orientation(pitch=" + this.pitch + ", roll=" + this.roll + ", yaw=" + this.yaw + ", azimuth=" + this.azimuth + ")";
    }
}
