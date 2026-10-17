package uwa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pwa.n f283583b;

    public k(String inviteId, pwa.n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f283582a = inviteId;
        this.f283583b = referralCampaignV4Type;
    }

    public final String a() {
        return this.f283582a;
    }

    public final pwa.n b() {
        return this.f283583b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f283582a, kVar.f283582a) && this.f283583b == kVar.f283583b;
    }

    public final int hashCode() {
        return this.f283583b.hashCode() + (this.f283582a.hashCode() * 31);
    }
}
