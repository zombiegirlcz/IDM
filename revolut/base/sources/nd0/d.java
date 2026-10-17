package nd0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f214277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd0.a f214278b;

    public d(c itemType, kd0.a domain) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f214277a = itemType;
        this.f214278b = domain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f214277a == dVar.f214277a && this.f214278b == dVar.f214278b;
    }

    public final int hashCode() {
        return this.f214278b.hashCode() + (this.f214277a.hashCode() * 31);
    }
}
