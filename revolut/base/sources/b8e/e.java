package b8e;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBankingProfile f13206a;

    public e(JuniorBankingProfile juniorProfile) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        this.f13206a = juniorProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f13206a, ((e) obj2).f13206a);
    }

    public final int hashCode() {
        return this.f13206a.hashCode();
    }
}
