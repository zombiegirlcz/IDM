package koc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdh.b f186291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f186292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f186293c;

    public b(pdh.b performanceChart, dj0.d dVar, a type) {
        Intrinsics.checkNotNullParameter(performanceChart, "performanceChart");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f186291a = performanceChart;
        this.f186292b = dVar;
        this.f186293c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f186291a, bVar.f186291a) && Intrinsics.f(this.f186292b, bVar.f186292b) && this.f186293c == bVar.f186293c;
    }

    public final int hashCode() {
        int iHashCode = this.f186291a.hashCode() * 31;
        dj0.d dVar = this.f186292b;
        return this.f186293c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
