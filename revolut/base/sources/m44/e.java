package m44;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cu3.e f202648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv3.b f202649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gv3.b f202650c;
    public final boolean d;

    public e(cu3.e addressType, gv3.b bVar, gv3.b bVar2, boolean z) {
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        this.f202648a = addressType;
        this.f202649b = bVar;
        this.f202650c = bVar2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f202648a == eVar.f202648a && Intrinsics.f(this.f202649b, eVar.f202649b) && Intrinsics.f(this.f202650c, eVar.f202650c) && this.d == eVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f202648a.hashCode() * 31;
        gv3.b bVar = this.f202649b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        gv3.b bVar2 = this.f202650c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }
}
