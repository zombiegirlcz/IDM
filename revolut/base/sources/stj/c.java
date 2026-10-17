package stj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f265606b;

    public c(String challengeCampaignId, f startChallengeRequestBody) {
        Intrinsics.checkNotNullParameter(challengeCampaignId, "challengeCampaignId");
        Intrinsics.checkNotNullParameter(startChallengeRequestBody, "startChallengeRequestBody");
        this.f265605a = challengeCampaignId;
        this.f265606b = startChallengeRequestBody;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f265605a, cVar.f265605a) && Intrinsics.f(this.f265606b, cVar.f265606b);
    }

    public final int hashCode() {
        return this.f265606b.f265608a.hashCode() + (this.f265605a.hashCode() * 31);
    }
}
