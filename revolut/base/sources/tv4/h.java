package tv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274702a;

    public h(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f274702a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f274702a, ((h) obj2).f274702a);
    }

    public final int hashCode() {
        return this.f274702a.hashCode();
    }
}
