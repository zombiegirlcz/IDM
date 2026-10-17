package oid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f225674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f225675c;

    public t(String category, Double d, Double d5) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f225673a = category;
        this.f225674b = d;
        this.f225675c = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f225673a, tVar.f225673a) && Intrinsics.f(this.f225674b, tVar.f225674b) && Intrinsics.f(this.f225675c, tVar.f225675c);
    }

    public final int hashCode() {
        int iHashCode = this.f225673a.hashCode() * 31;
        Double d = this.f225674b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f225675c;
        return (iHashCode2 + (d5 != null ? d5.hashCode() : 0)) * 31;
    }
}
