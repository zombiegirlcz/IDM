package com.fourthline.vision.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class w8 extends z8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sd f37051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f37052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(@NotNull sd stepConfig, long j2) {
        super(j2, null);
        Intrinsics.checkNotNullParameter(stepConfig, "stepConfig");
        this.f37051b = stepConfig;
        this.f37052c = j2;
    }

    public static /* synthetic */ w8 copy$default(w8 w8Var, sd sdVar, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdVar = w8Var.f37051b;
        }
        if ((i & 2) != 0) {
            j2 = w8Var.f37052c;
        }
        return w8Var.copy(sdVar, j2);
    }

    @NotNull
    public final sd component1() {
        return this.f37051b;
    }

    public final long component2() {
        return this.f37052c;
    }

    @NotNull
    public final w8 copy(@NotNull sd stepConfig, long j2) {
        Intrinsics.checkNotNullParameter(stepConfig, "stepConfig");
        return new w8(stepConfig, j2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj2;
        return Intrinsics.f(this.f37051b, w8Var.f37051b) && this.f37052c == w8Var.f37052c;
    }

    @NotNull
    public final sd getStepConfig() {
        return this.f37051b;
    }

    @Override // com.fourthline.vision.internal.z8
    public long getTimestamp() {
        return this.f37052c;
    }

    public int hashCode() {
        return (this.f37051b.hashCode() * 31) + Long.hashCode(this.f37052c);
    }

    @NotNull
    public String toString() {
        return "OnStepUpdate(stepConfig=" + this.f37051b + ", timestamp=" + this.f37052c + ")";
    }
}
