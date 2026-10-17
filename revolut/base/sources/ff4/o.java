package ff4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f134733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f134734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu3.a f134735c;

    public o(Long l2, Long l3, fu3.a aVar) {
        this.f134733a = l2;
        this.f134734b = l3;
        this.f134735c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f134733a, oVar.f134733a) && Intrinsics.f(this.f134734b, oVar.f134734b) && this.f134735c == oVar.f134735c;
    }

    public final int hashCode() {
        Long l2 = this.f134733a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f134734b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        fu3.a aVar = this.f134735c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
