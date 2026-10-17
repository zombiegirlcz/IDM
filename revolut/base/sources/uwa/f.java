package uwa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwa.n f283574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f283575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283576c;

    public f(pwa.n referralCampaignV4Type, Integer num, String str) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f283574a = referralCampaignV4Type;
        this.f283575b = num;
        this.f283576c = str;
    }

    public final Integer a() {
        return this.f283575b;
    }

    public final String b() {
        return this.f283576c;
    }

    public final pwa.n c() {
        return this.f283574a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f283574a == fVar.f283574a && Intrinsics.f(this.f283575b, fVar.f283575b) && Intrinsics.f(this.f283576c, fVar.f283576c);
    }

    public final int hashCode() {
        int iHashCode = this.f283574a.hashCode() * 31;
        Integer num = this.f283575b;
        int iB = j6.a.b(5, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.f283576c;
        return iB + (str != null ? str.hashCode() : 0);
    }
}
