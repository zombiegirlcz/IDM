package u43;

import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f277036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f277037b;

    public d(Sequence items, Object obj2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f277036a = items;
        this.f277037b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f277036a, dVar.f277036a) && Intrinsics.f(this.f277037b, dVar.f277037b);
    }

    public final int hashCode() {
        int iHashCode = this.f277036a.hashCode() * 31;
        Object obj2 = this.f277037b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
