package vf8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final psg.a f288535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBankingProfile f288536b;

    public b(psg.a walletProfile, JuniorBankingProfile profile) {
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f288535a = walletProfile;
        this.f288536b = profile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f288535a, bVar.f288535a) && Intrinsics.f(this.f288536b, bVar.f288536b);
    }

    public final int hashCode() {
        return this.f288536b.hashCode() + (this.f288535a.hashCode() * 31);
    }
}
