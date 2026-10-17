package i25;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f157843b;

    public d(String facilityId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f157842a = facilityId;
        this.f157843b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f157842a, dVar.f157842a) && Intrinsics.f(this.f157843b, dVar.f157843b);
    }

    public final int hashCode() {
        return this.f157843b.hashCode() + (this.f157842a.hashCode() * 31);
    }
}
