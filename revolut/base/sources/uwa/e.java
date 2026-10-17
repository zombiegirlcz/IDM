package uwa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwa.n f283573a;

    public e(pwa.n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f283573a = referralCampaignV4Type;
    }

    public final pwa.n a() {
        return this.f283573a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f283573a == ((e) obj2).f283573a;
    }

    public final int hashCode() {
        return this.f283573a.hashCode();
    }
}
