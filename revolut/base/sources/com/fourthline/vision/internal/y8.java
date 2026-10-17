package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class y8 extends z8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37142b;

    public y8(long j2) {
        super(j2, null);
        this.f37142b = j2;
    }

    public static /* synthetic */ y8 copy$default(y8 y8Var, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = y8Var.f37142b;
        }
        return y8Var.copy(j2);
    }

    public final long component1() {
        return this.f37142b;
    }

    @NotNull
    public final y8 copy(long j2) {
        return new y8(j2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y8) && this.f37142b == ((y8) obj2).f37142b;
    }

    @Override // com.fourthline.vision.internal.z8
    public long getTimestamp() {
        return this.f37142b;
    }

    public int hashCode() {
        return Long.hashCode(this.f37142b);
    }

    @NotNull
    public String toString() {
        return "OnRecordingStop(timestamp=" + this.f37142b + ")";
    }
}
