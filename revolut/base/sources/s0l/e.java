package s0l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f258976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm3.a f258977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f258978c;

    public e(boolean z, zm3.a aVar, boolean z3) {
        this.f258976a = z;
        this.f258977b = aVar;
        this.f258978c = z3;
    }

    public static e a(e eVar, zm3.a aVar, boolean z, int i) {
        boolean z3 = (i & 1) != 0 ? eVar.f258976a : true;
        if ((i & 2) != 0) {
            aVar = eVar.f258977b;
        }
        if ((i & 4) != 0) {
            z = eVar.f258978c;
        }
        eVar.getClass();
        return new e(z3, aVar, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f258976a == eVar.f258976a && Intrinsics.f(this.f258977b, eVar.f258977b) && this.f258978c == eVar.f258978c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f258976a) * 31;
        zm3.a aVar = this.f258977b;
        return Boolean.hashCode(this.f258978c) + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
