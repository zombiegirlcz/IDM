package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class u8 extends z8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36979b;

    public u8(long j2) {
        super(j2, null);
        this.f36979b = j2;
    }

    public static /* synthetic */ u8 copy$default(u8 u8Var, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = u8Var.f36979b;
        }
        return u8Var.copy(j2);
    }

    public final long component1() {
        return this.f36979b;
    }

    @NotNull
    public final u8 copy(long j2) {
        return new u8(j2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u8) && this.f36979b == ((u8) obj2).f36979b;
    }

    @Override // com.fourthline.vision.internal.z8
    public long getTimestamp() {
        return this.f36979b;
    }

    public int hashCode() {
        return Long.hashCode(this.f36979b);
    }

    @NotNull
    public String toString() {
        return "OnStepResults(timestamp=" + this.f36979b + ")";
    }
}
