package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class x8 extends z8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37097b;

    public x8(long j2) {
        super(j2, null);
        this.f37097b = j2;
    }

    public static /* synthetic */ x8 copy$default(x8 x8Var, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = x8Var.f37097b;
        }
        return x8Var.copy(j2);
    }

    public final long component1() {
        return this.f37097b;
    }

    @NotNull
    public final x8 copy(long j2) {
        return new x8(j2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x8) && this.f37097b == ((x8) obj2).f37097b;
    }

    @Override // com.fourthline.vision.internal.z8
    public long getTimestamp() {
        return this.f37097b;
    }

    public int hashCode() {
        return Long.hashCode(this.f37097b);
    }

    @NotNull
    public String toString() {
        return "OnRecordingStart(timestamp=" + this.f37097b + ")";
    }
}
