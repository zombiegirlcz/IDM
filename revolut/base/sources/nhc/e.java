package nhc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215407a;

    public e(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f215407a = planId;
    }

    public final String a() {
        return j6.a.q("KEY_RENT_AND_BILLS_CONFIGURATIONS-", this.f215407a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f215407a, ((e) obj2).f215407a);
    }

    public final int hashCode() {
        return this.f215407a.hashCode();
    }
}
