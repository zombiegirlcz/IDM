package cuj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109047b;

    public l(String campaignId, String str) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.f109046a = campaignId;
        this.f109047b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f109046a, lVar.f109046a) && Intrinsics.f(this.f109047b, lVar.f109047b);
    }

    public final int hashCode() {
        int iHashCode = this.f109046a.hashCode() * 31;
        String str = this.f109047b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
