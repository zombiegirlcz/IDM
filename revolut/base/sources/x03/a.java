package x03;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f301459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d71.a f301460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy2.d f301461c;

    public a(f0 card, d71.a aVar, wy2.d dVar) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f301459a = card;
        this.f301460b = aVar;
        this.f301461c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f301459a, aVar.f301459a) && Intrinsics.f(this.f301460b, aVar.f301460b) && this.f301461c == aVar.f301461c;
    }

    public final int hashCode() {
        int iHashCode = this.f301459a.hashCode() * 31;
        d71.a aVar = this.f301460b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        wy2.d dVar = this.f301461c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
