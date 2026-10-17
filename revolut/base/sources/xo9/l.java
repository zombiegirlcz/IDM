package xo9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f307753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f307754c;

    public l(String provider, dj0.d dVar, b extraFields) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(extraFields, "extraFields");
        this.f307752a = provider;
        this.f307753b = dVar;
        this.f307754c = extraFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f307752a, lVar.f307752a) && Intrinsics.f(this.f307753b, lVar.f307753b) && Intrinsics.f(this.f307754c, lVar.f307754c);
    }

    public final int hashCode() {
        int iHashCode = this.f307752a.hashCode() * 31;
        dj0.d dVar = this.f307753b;
        return this.f307754c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
