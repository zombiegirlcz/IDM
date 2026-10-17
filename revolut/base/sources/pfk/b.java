package pfk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235622b;

    public b(String planId, String str) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f235621a = planId;
        this.f235622b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f235621a, bVar.f235621a) && Intrinsics.f(this.f235622b, bVar.f235622b);
    }

    public final int hashCode() {
        int iHashCode = this.f235621a.hashCode() * 31;
        String str = this.f235622b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
