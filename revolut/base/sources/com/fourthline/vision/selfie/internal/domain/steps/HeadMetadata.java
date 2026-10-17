package com.fourthline.vision.selfie.internal.domain.steps;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", "", "yaw", "", "pitch", "direction", "", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;)V", "getYaw", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPitch", "getDirection", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;)Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", "equals", "", "other", "hashCode", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HeadMetadata {
    public static final int $stable = 0;
    private final Integer direction;
    private final Float pitch;
    private final Float yaw;

    public HeadMetadata(Float f, Float f4, Integer num) {
        this.yaw = f;
        this.pitch = f4;
        this.direction = num;
    }

    public static /* synthetic */ HeadMetadata copy$default(HeadMetadata headMetadata, Float f, Float f4, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = headMetadata.yaw;
        }
        if ((i & 2) != 0) {
            f4 = headMetadata.pitch;
        }
        if ((i & 4) != 0) {
            num = headMetadata.direction;
        }
        return headMetadata.copy(f, f4, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getYaw() {
        return this.yaw;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getPitch() {
        return this.pitch;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDirection() {
        return this.direction;
    }

    @NotNull
    public final HeadMetadata copy(Float yaw, Float pitch, Integer direction) {
        return new HeadMetadata(yaw, pitch, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadMetadata)) {
            return false;
        }
        HeadMetadata headMetadata = (HeadMetadata) other;
        return Intrinsics.f(this.yaw, headMetadata.yaw) && Intrinsics.f(this.pitch, headMetadata.pitch) && Intrinsics.f(this.direction, headMetadata.direction);
    }

    public final Integer getDirection() {
        return this.direction;
    }

    public final Float getPitch() {
        return this.pitch;
    }

    public final Float getYaw() {
        return this.yaw;
    }

    public int hashCode() {
        Float f = this.yaw;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f4 = this.pitch;
        int iHashCode2 = (iHashCode + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num = this.direction;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HeadMetadata(yaw=" + this.yaw + ", pitch=" + this.pitch + ", direction=" + this.direction + ")";
    }
}
