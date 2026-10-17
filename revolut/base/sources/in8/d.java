package in8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f162685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f162686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f162687c;

    public d(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f162685a = bool;
        this.f162686b = bool2;
        this.f162687c = bool3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f162685a, dVar.f162685a) && Intrinsics.f(this.f162686b, dVar.f162686b) && Intrinsics.f(this.f162687c, dVar.f162687c);
    }

    public final int hashCode() {
        Boolean bool = this.f162685a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f162686b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f162687c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
