package hi9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f152568b;

    public l(String planId, Integer num) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f152567a = planId;
        this.f152568b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f152567a, lVar.f152567a) && Intrinsics.f(this.f152568b, lVar.f152568b);
    }

    public final int hashCode() {
        int iHashCode = this.f152567a.hashCode() * 31;
        Integer num = this.f152568b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
