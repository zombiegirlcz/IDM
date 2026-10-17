package g98;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc8.a f141498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBankingProfile f141499b;

    public c(jc8.a cardRequest, JuniorBankingProfile profile) {
        Intrinsics.checkNotNullParameter(cardRequest, "cardRequest");
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f141498a = cardRequest;
        this.f141499b = profile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f141498a, cVar.f141498a) && Intrinsics.f(this.f141499b, cVar.f141499b);
    }

    public final int hashCode() {
        return this.f141499b.hashCode() + (this.f141498a.hashCode() * 31);
    }
}
