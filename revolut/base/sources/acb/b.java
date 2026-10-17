package acb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f3106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f3107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3108c;
    public final boolean d;

    public b(dj0.d amount, dj0.d dVar, a aVar, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f3106a = amount;
        this.f3107b = dVar;
        this.f3108c = aVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f3106a, bVar.f3106a) && Intrinsics.f(this.f3107b, bVar.f3107b) && this.f3108c == bVar.f3108c && this.d == bVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f3106a.hashCode() * 31;
        dj0.d dVar = this.f3107b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.f3108c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }
}
