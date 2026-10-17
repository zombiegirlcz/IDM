package pya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwa.n f240713a;

    public f(pwa.n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f240713a = referralCampaignV4Type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f240713a == ((f) obj2).f240713a;
    }

    public final int hashCode() {
        return this.f240713a.hashCode();
    }
}
