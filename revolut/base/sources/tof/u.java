package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273096a;

    public u(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f273096a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f273096a, ((u) obj2).f273096a);
    }

    public final int hashCode() {
        return this.f273096a.hashCode();
    }
}
