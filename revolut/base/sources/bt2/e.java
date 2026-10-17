package bt2;

import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardTargetAccount f18259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f18260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f18261c;
    public final Data d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f18262g;

    public e(RewardTargetAccount rewardTargetAccount, Data personalAccounts, Data businessAccounts, Data recentAccounts, String query, boolean z, Data searchResults) {
        Intrinsics.checkNotNullParameter(personalAccounts, "personalAccounts");
        Intrinsics.checkNotNullParameter(businessAccounts, "businessAccounts");
        Intrinsics.checkNotNullParameter(recentAccounts, "recentAccounts");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        this.f18259a = rewardTargetAccount;
        this.f18260b = personalAccounts;
        this.f18261c = businessAccounts;
        this.d = recentAccounts;
        this.e = query;
        this.f = z;
        this.f18262g = searchResults;
    }

    public static e a(e eVar, Data data, Data businessAccounts, Data recentAccounts, String query, boolean z, Data data2, int i) {
        Data personalAccounts = data;
        RewardTargetAccount rewardTargetAccount = eVar.f18259a;
        if ((i & 2) != 0) {
            personalAccounts = eVar.f18260b;
        }
        if ((i & 4) != 0) {
            businessAccounts = eVar.f18261c;
        }
        if ((i & 8) != 0) {
            recentAccounts = eVar.d;
        }
        if ((i & 16) != 0) {
            query = eVar.e;
        }
        if ((i & 32) != 0) {
            z = eVar.f;
        }
        if ((i & 64) != 0) {
            data2 = eVar.f18262g;
        }
        Data searchResults = data2;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(personalAccounts, "personalAccounts");
        Intrinsics.checkNotNullParameter(businessAccounts, "businessAccounts");
        Intrinsics.checkNotNullParameter(recentAccounts, "recentAccounts");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        boolean z3 = z;
        String str = query;
        Data data3 = recentAccounts;
        return new e(rewardTargetAccount, personalAccounts, businessAccounts, data3, str, z3, searchResults);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f18259a, eVar.f18259a) && Intrinsics.f(this.f18260b, eVar.f18260b) && Intrinsics.f(this.f18261c, eVar.f18261c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f && Intrinsics.f(this.f18262g, eVar.f18262g);
    }

    public final int hashCode() {
        RewardTargetAccount rewardTargetAccount = this.f18259a;
        return this.f18262g.hashCode() + j6.a.c(p.a.c(kii.e.c(this.d, kii.e.c(this.f18261c, kii.e.c(this.f18260b, (rewardTargetAccount == null ? 0 : rewardTargetAccount.hashCode()) * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }
}
