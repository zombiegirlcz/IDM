package drk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.b f117156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f117157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f117158c;

    public c() {
        this(null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f117156a, cVar.f117156a) && Intrinsics.f(this.f117157b, cVar.f117157b) && Intrinsics.f(this.f117158c, cVar.f117158c);
    }

    public final int hashCode() {
        jo3.b bVar = this.f117156a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        jo3.b bVar2 = this.f117157b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Double d = this.f117158c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public c(jo3.b bVar, jo3.b bVar2, Double d) {
        this.f117156a = bVar;
        this.f117157b = bVar2;
        this.f117158c = d;
    }
}
