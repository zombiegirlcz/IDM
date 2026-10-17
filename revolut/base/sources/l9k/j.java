package l9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.c f193279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final prf.g f193280b;

    public j(hrf.c cVar, prf.g countryData) {
        Intrinsics.checkNotNullParameter(countryData, "countryData");
        this.f193279a = cVar;
        this.f193280b = countryData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f193279a, jVar.f193279a) && Intrinsics.f(this.f193280b, jVar.f193280b);
    }

    public final int hashCode() {
        hrf.c cVar = this.f193279a;
        return this.f193280b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }
}
