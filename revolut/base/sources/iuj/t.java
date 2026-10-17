package iuj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwa.n f168647a;

    public t(pwa.n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f168647a = referralCampaignV4Type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f168647a == ((t) obj2).f168647a;
    }

    public final int hashCode() {
        return this.f168647a.hashCode();
    }
}
