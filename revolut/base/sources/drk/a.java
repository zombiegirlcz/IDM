package drk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.b f117150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f117151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f117152c;

    public a() {
        this(null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f117150a, aVar.f117150a) && Intrinsics.f(this.f117151b, aVar.f117151b) && Intrinsics.f(this.f117152c, aVar.f117152c);
    }

    public final int hashCode() {
        jo3.b bVar = this.f117150a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        jo3.b bVar2 = this.f117151b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Double d = this.f117152c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public a(jo3.b bVar, jo3.b bVar2, Double d) {
        this.f117150a = bVar;
        this.f117151b = bVar2;
        this.f117152c = d;
    }
}
