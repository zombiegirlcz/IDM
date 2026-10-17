package m23;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f201690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e13.a f201691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201692c;
    public final boolean d;

    public d(b country, e13.a flowType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f201690a = country;
        this.f201691b = flowType;
        this.f201692c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f201690a == dVar.f201690a && this.f201691b == dVar.f201691b && this.f201692c == dVar.f201692c && this.d == dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f201691b.hashCode() + (this.f201690a.hashCode() * 31)) * 31, 31, this.f201692c);
    }
}
