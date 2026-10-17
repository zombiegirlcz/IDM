package tlk;

import hha.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f272104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qha.a f272105b;

    public a(d currentPlan, qha.a planCancelInfo) {
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(planCancelInfo, "planCancelInfo");
        this.f272104a = currentPlan;
        this.f272105b = planCancelInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f272104a, aVar.f272104a) && Intrinsics.f(this.f272105b, aVar.f272105b);
    }

    public final int hashCode() {
        return this.f272105b.hashCode() + (this.f272104a.hashCode() * 31);
    }
}
