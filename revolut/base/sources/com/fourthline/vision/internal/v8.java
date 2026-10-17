package com.fourthline.vision.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class v8 extends z8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f37001c;

    public v8(long j2, Object obj2) {
        super(j2, null);
        this.f37000b = j2;
        this.f37001c = obj2;
    }

    public static /* synthetic */ v8 copy$default(v8 v8Var, long j2, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            j2 = v8Var.f37000b;
        }
        if ((i & 2) != 0) {
            obj2 = v8Var.f37001c;
        }
        return v8Var.copy(j2, obj2);
    }

    public final long component1() {
        return this.f37000b;
    }

    public final Object component2() {
        return this.f37001c;
    }

    @NotNull
    public final v8 copy(long j2, Object obj2) {
        return new v8(j2, obj2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj2;
        return this.f37000b == v8Var.f37000b && Intrinsics.f(this.f37001c, v8Var.f37001c);
    }

    public final Object getStep() {
        return this.f37001c;
    }

    @Override // com.fourthline.vision.internal.z8
    public long getTimestamp() {
        return this.f37000b;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f37000b) * 31;
        Object obj2 = this.f37001c;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }

    @NotNull
    public String toString() {
        return "OnStepSuccess(timestamp=" + this.f37000b + ", step=" + this.f37001c + ")";
    }
}
