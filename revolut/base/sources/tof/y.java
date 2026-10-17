package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f273169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273170b;

    public y(int i, String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f273169a = i;
        this.f273170b = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f273169a == yVar.f273169a && Intrinsics.f(this.f273170b, yVar.f273170b);
    }

    public final int hashCode() {
        return this.f273170b.hashCode() + (Integer.hashCode(this.f273169a) * 31);
    }
}
