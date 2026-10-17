package mtj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f208867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f208868c;

    public a(String campaignId, String userChallengeId, Boolean bool) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(userChallengeId, "userChallengeId");
        this.f208866a = campaignId;
        this.f208867b = userChallengeId;
        this.f208868c = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f208866a, aVar.f208866a) && Intrinsics.f(this.f208867b, aVar.f208867b) && Intrinsics.f(this.f208868c, aVar.f208868c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f208866a.hashCode() * 31, 31, this.f208867b);
        Boolean bool = this.f208868c;
        return iC + (bool == null ? 0 : bool.hashCode());
    }
}
