package drk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.b f117153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f117154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f117155c;
    public final jo3.b d;

    public b() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f117153a, bVar.f117153a) && Intrinsics.f(this.f117154b, bVar.f117154b) && Intrinsics.f(this.f117155c, bVar.f117155c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        jo3.b bVar = this.f117153a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        jo3.b bVar2 = this.f117154b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.f117155c;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        jo3.b bVar4 = this.d;
        return iHashCode3 + (bVar4 != null ? bVar4.hashCode() : 0);
    }

    public b(jo3.b bVar, jo3.b bVar2, jo3.b bVar3, jo3.b bVar4) {
        this.f117153a = bVar;
        this.f117154b = bVar2;
        this.f117155c = bVar3;
        this.d = bVar4;
    }
}
