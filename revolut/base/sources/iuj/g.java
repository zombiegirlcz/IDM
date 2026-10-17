package iuj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwa.n f168632a;

    public g(pwa.n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f168632a = referralCampaignV4Type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f168632a == ((g) obj2).f168632a;
    }

    public final int hashCode() {
        return this.f168632a.hashCode();
    }
}
