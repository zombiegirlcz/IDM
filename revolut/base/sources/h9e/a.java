package h9e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150230b;

    public a(String facilityId, String pocketId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f150229a = facilityId;
        this.f150230b = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f150229a, aVar.f150229a) && Intrinsics.f(this.f150230b, aVar.f150230b);
    }

    public final int hashCode() {
        return this.f150230b.hashCode() + (this.f150229a.hashCode() * 31);
    }
}
