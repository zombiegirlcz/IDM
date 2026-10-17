package ytj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f316817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316819c;
    public final boolean d;
    public final boolean e;

    public j(Data rewardHubChallengeDetails, String currentCampaignId, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(rewardHubChallengeDetails, "rewardHubChallengeDetails");
        Intrinsics.checkNotNullParameter(currentCampaignId, "currentCampaignId");
        this.f316817a = rewardHubChallengeDetails;
        this.f316818b = currentCampaignId;
        this.f316819c = str;
        this.d = z;
        this.e = z3;
    }

    public static j a(j jVar, Data data, String str, String str2, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            data = jVar.f316817a;
        }
        Data rewardHubChallengeDetails = data;
        if ((i & 2) != 0) {
            str = jVar.f316818b;
        }
        String currentCampaignId = str;
        if ((i & 4) != 0) {
            str2 = jVar.f316819c;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = jVar.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z3 = jVar.e;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(rewardHubChallengeDetails, "rewardHubChallengeDetails");
        Intrinsics.checkNotNullParameter(currentCampaignId, "currentCampaignId");
        return new j(rewardHubChallengeDetails, currentCampaignId, str3, z4, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f316817a, jVar.f316817a) && Intrinsics.f(this.f316818b, jVar.f316818b) && Intrinsics.f(this.f316819c, jVar.f316819c) && this.d == jVar.d && this.e == jVar.e;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f316817a.hashCode() * 31, 31, this.f316818b);
        String str = this.f316819c;
        return Boolean.hashCode(this.e) + j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
