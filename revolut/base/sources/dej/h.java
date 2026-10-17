package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f113545b;

    public h(String id10, f priceConsistency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(priceConsistency, "priceConsistency");
        this.f113544a = id10;
        this.f113545b = priceConsistency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f113544a, hVar.f113544a) && this.f113545b == hVar.f113545b;
    }

    public final int hashCode() {
        return this.f113545b.hashCode() + (this.f113544a.hashCode() * 31);
    }
}
