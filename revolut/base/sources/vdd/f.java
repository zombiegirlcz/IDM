package vdd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f287890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f287891c;

    public f(String id10, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f287889a = id10;
        this.f287890b = l2;
        this.f287891c = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f287889a, fVar.f287889a) && Intrinsics.f(this.f287890b, fVar.f287890b) && Intrinsics.f(this.f287891c, fVar.f287891c);
    }

    public final int hashCode() {
        int iHashCode = this.f287889a.hashCode() * 31;
        Long l2 = this.f287890b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f287891c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
