package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class mb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272937a;

    public mb(String standingOrderId) {
        Intrinsics.checkNotNullParameter(standingOrderId, "standingOrderId");
        this.f272937a = standingOrderId;
    }

    public final String a() {
        return this.f272937a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof mb) && Intrinsics.f(this.f272937a, ((mb) obj2).f272937a);
    }

    public final int hashCode() {
        return this.f272937a.hashCode();
    }
}
