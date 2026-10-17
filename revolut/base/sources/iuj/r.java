package iuj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168645b;

    public r(String campaignId, String str) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.f168644a = campaignId;
        this.f168645b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f168644a, rVar.f168644a) && Intrinsics.f(this.f168645b, rVar.f168645b);
    }

    public final int hashCode() {
        int iHashCode = this.f168644a.hashCode() * 31;
        String str = this.f168645b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
