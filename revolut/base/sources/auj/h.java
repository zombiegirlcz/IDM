package auj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9846b;

    public h(String campaignId, String str) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.f9845a = campaignId;
        this.f9846b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f9845a, hVar.f9845a) && Intrinsics.f(this.f9846b, hVar.f9846b);
    }

    public final int hashCode() {
        int iHashCode = this.f9845a.hashCode() * 31;
        String str = this.f9846b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
