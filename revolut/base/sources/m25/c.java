package m25;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201700b;

    public c(String facilityId, String boletoId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(boletoId, "boletoId");
        this.f201699a = facilityId;
        this.f201700b = boletoId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f201699a, cVar.f201699a) && Intrinsics.f(this.f201700b, cVar.f201700b);
    }

    public final int hashCode() {
        return this.f201700b.hashCode() + (this.f201699a.hashCode() * 31);
    }
}
