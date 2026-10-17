package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110409b;

    public j(String campaignId, String challengeId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        this.f110408a = campaignId;
        this.f110409b = challengeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f110408a, jVar.f110408a) && Intrinsics.f(this.f110409b, jVar.f110409b);
    }

    public final int hashCode() {
        return this.f110409b.hashCode() + (this.f110408a.hashCode() * 31);
    }
}
