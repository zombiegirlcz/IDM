package com.fourthline.vision;

import com.fourthline.core.location.Coordinate;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000f¨\u0006%"}, d2 = {"Lcom/fourthline/vision/ScannerMetadata;", "", "Ljava/util/Date;", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "Lcom/fourthline/vision/MotionData;", "motionData", "<init>", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/vision/MotionData;)V", "component1", "()Ljava/util/Date;", "component2", "()Lcom/fourthline/core/location/Coordinate;", "component3", "()Lcom/fourthline/vision/MotionData;", "copy", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/vision/MotionData;)Lcom/fourthline/vision/ScannerMetadata;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "getTimestamp", "b", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "c", "Lcom/fourthline/vision/MotionData;", "getMotionData", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScannerMetadata {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Date timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Coordinate location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MotionData motionData;

    public ScannerMetadata(@NotNull Date timestamp, Coordinate coordinate, MotionData motionData) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.timestamp = timestamp;
        this.location = coordinate;
        this.motionData = motionData;
    }

    public static /* synthetic */ ScannerMetadata copy$default(ScannerMetadata scannerMetadata, Date date, Coordinate coordinate, MotionData motionData, int i, Object obj2) {
        if ((i & 1) != 0) {
            date = scannerMetadata.timestamp;
        }
        if ((i & 2) != 0) {
            coordinate = scannerMetadata.location;
        }
        if ((i & 4) != 0) {
            motionData = scannerMetadata.motionData;
        }
        return scannerMetadata.copy(date, coordinate, motionData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coordinate getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MotionData getMotionData() {
        return this.motionData;
    }

    @NotNull
    public final ScannerMetadata copy(@NotNull Date timestamp, Coordinate location, MotionData motionData) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new ScannerMetadata(timestamp, location, motionData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScannerMetadata)) {
            return false;
        }
        ScannerMetadata scannerMetadata = (ScannerMetadata) other;
        return Intrinsics.f(this.timestamp, scannerMetadata.timestamp) && Intrinsics.f(this.location, scannerMetadata.location) && Intrinsics.f(this.motionData, scannerMetadata.motionData);
    }

    public final Coordinate getLocation() {
        return this.location;
    }

    public final MotionData getMotionData() {
        return this.motionData;
    }

    @NotNull
    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.timestamp.hashCode() * 31;
        Coordinate coordinate = this.location;
        int iHashCode2 = (iHashCode + (coordinate == null ? 0 : coordinate.hashCode())) * 31;
        MotionData motionData = this.motionData;
        return iHashCode2 + (motionData != null ? motionData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ScannerMetadata(timestamp=" + this.timestamp + ", location=" + this.location + ", motionData=" + this.motionData + ")";
    }
}
