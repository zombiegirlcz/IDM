package vtd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f292103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f292104b;

    public d(dj0.d thisMonth, dj0.d allTime) {
        Intrinsics.checkNotNullParameter(thisMonth, "thisMonth");
        Intrinsics.checkNotNullParameter(allTime, "allTime");
        this.f292103a = thisMonth;
        this.f292104b = allTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f292103a, dVar.f292103a) && Intrinsics.f(this.f292104b, dVar.f292104b);
    }

    public final int hashCode() {
        return this.f292104b.hashCode() + (this.f292103a.hashCode() * 31);
    }
}
