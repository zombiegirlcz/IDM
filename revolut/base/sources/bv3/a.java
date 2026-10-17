package bv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f18940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f18941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu3.a f18942c;

    public a(Long l2, Long l3, fu3.a aVar) {
        this.f18940a = l2;
        this.f18941b = l3;
        this.f18942c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f18940a, aVar.f18940a) && Intrinsics.f(this.f18941b, aVar.f18941b) && this.f18942c == aVar.f18942c;
    }

    public final int hashCode() {
        Long l2 = this.f18940a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f18941b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        fu3.a aVar = this.f18942c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
