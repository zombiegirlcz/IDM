package com.fourthline.vision.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class t8 extends z8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sd f36951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f36952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(@NotNull sd stepConfig, long j2) {
        super(j2, null);
        Intrinsics.checkNotNullParameter(stepConfig, "stepConfig");
        this.f36951b = stepConfig;
        this.f36952c = j2;
    }

    public static /* synthetic */ t8 copy$default(t8 t8Var, sd sdVar, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdVar = t8Var.f36951b;
        }
        if ((i & 2) != 0) {
            j2 = t8Var.f36952c;
        }
        return t8Var.copy(sdVar, j2);
    }

    @NotNull
    public final sd component1() {
        return this.f36951b;
    }

    public final long component2() {
        return this.f36952c;
    }

    @NotNull
    public final t8 copy(@NotNull sd stepConfig, long j2) {
        Intrinsics.checkNotNullParameter(stepConfig, "stepConfig");
        return new t8(stepConfig, j2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj2;
        return Intrinsics.f(this.f36951b, t8Var.f36951b) && this.f36952c == t8Var.f36952c;
    }

    @NotNull
    public final sd getStepConfig() {
        return this.f36951b;
    }

    @Override // com.fourthline.vision.internal.z8
    public long getTimestamp() {
        return this.f36952c;
    }

    public int hashCode() {
        return (this.f36951b.hashCode() * 31) + Long.hashCode(this.f36952c);
    }

    @NotNull
    public String toString() {
        return "ManualTrigger(stepConfig=" + this.f36951b + ", timestamp=" + this.f36952c + ")";
    }
}
