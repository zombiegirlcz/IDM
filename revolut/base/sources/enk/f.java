package enk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127838a;

    public f(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f127838a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f127838a, ((f) obj2).f127838a);
    }

    public final int hashCode() {
        return this.f127838a.hashCode();
    }
}
