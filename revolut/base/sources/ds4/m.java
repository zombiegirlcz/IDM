package ds4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117216a;

    public m(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f117216a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f117216a, ((m) obj2).f117216a);
    }

    public final int hashCode() {
        return this.f117216a.hashCode();
    }
}
