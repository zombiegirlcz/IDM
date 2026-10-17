package no8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBankingProfile f217951a;

    public g(JuniorBankingProfile juniorProfile) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        this.f217951a = juniorProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f217951a, ((g) obj2).f217951a);
    }

    public final int hashCode() {
        return this.f217951a.hashCode();
    }
}
