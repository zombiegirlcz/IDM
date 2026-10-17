package pfk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235646b;

    public j(String familyId, String currentPlanId) {
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
        this.f235645a = familyId;
        this.f235646b = currentPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f235645a, jVar.f235645a) && Intrinsics.f(this.f235646b, jVar.f235646b);
    }

    public final int hashCode() {
        return this.f235646b.hashCode() + (this.f235645a.hashCode() * 31);
    }
}
