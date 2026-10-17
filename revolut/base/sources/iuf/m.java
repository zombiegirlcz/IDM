package iuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.c f168571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final prf.g f168572b;

    public m(hrf.c cVar, prf.g countryData) {
        Intrinsics.checkNotNullParameter(countryData, "countryData");
        this.f168571a = cVar;
        this.f168572b = countryData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f168571a, mVar.f168571a) && Intrinsics.f(this.f168572b, mVar.f168572b);
    }

    public final int hashCode() {
        hrf.c cVar = this.f168571a;
        return this.f168572b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }
}
