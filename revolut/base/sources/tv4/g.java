package tv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274701a;

    public g(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f274701a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f274701a, ((g) obj2).f274701a);
    }

    public final int hashCode() {
        return this.f274701a.hashCode();
    }
}
